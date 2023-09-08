package com.igc.iia.iteminventoryapp.controller;

import com.igc.iia.iteminventoryapp.entity.Item;
import com.igc.iia.iteminventoryapp.responses.Responses;
import com.igc.iia.iteminventoryapp.service.IItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/item/api")
public class ItemIAController {

  // ItemService itemService = new ItemService();
    @Autowired
    IItemService itemService ;

    @GetMapping("/item")
    public String name(){
        return "Wellcome item api ";
    }

    @PostMapping("/added")
    public ResponseEntity<?> added(@RequestBody @Valid Item item){
        return new ResponseEntity<>(new Responses("Item Added",HttpStatus.CREATED,itemService.addItem(item)),HttpStatus.CREATED);
    }

    @GetMapping("/getallitems")
    public ResponseEntity<?> getallitems(){
        return new ResponseEntity<>(new Responses("Item Founded",HttpStatus.FOUND,itemService.getallItems()),HttpStatus.FOUND);
    }

    @GetMapping("/getitembyid/{id}")
    public ResponseEntity<?> getItemByID(@PathVariable("id") int id){
      return new ResponseEntity<>( new Responses("Get Item By ID",HttpStatus.FOUND,itemService.getItemByID(id)), HttpStatus.FOUND);
    }

    @DeleteMapping("/deleteitembyid/{id}")
    public ResponseEntity<?> deleteitembyid(@PathVariable("id")int id){
      return new ResponseEntity<>(new Responses("Deleted Item By Id",null,itemService.deleteitembyid(id)),HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateitembyid/{id}")
    public ResponseEntity<?> updateitembyid(@PathVariable("id")int id,@RequestBody Item item){
      return new ResponseEntity<>(new Responses("Updated Item By ID",HttpStatus.PROCESSING,itemService.updeteitembyid(id,item)),HttpStatus.PROCESSING);
    }
}

