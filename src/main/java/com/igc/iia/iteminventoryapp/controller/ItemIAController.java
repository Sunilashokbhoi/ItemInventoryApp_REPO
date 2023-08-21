package com.igc.iia.iteminventoryapp.controller;

import com.igc.iia.iteminventoryapp.entity.Item;
import com.igc.iia.iteminventoryapp.service.IItemService;
import com.igc.iia.iteminventoryapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    public Item added(@RequestBody Item item){
        return itemService.addItem(item);

    }

    @GetMapping("/getitem")
    public Item getItem(){
    return itemService.getItem();
    }
    @GetMapping("/getallitems")
    public ArrayList<Item> getallitems(){
        return itemService.getallItems();
    }
}

