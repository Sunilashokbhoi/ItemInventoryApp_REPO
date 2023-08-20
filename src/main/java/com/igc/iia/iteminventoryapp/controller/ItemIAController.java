package com.igc.iia.iteminventoryapp.controller;

import com.igc.iia.iteminventoryapp.entity.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item/api")
public class ItemIAController {

    ArrayList<Item> itemArrayList = new ArrayList<>();
    @GetMapping("/itemname")
    public String name(){
        return "item name ";
    }

    @PostMapping("/added")
    public Item added(@RequestBody Item item){
        itemArrayList.add(item);
        return item;
    }

    @GetMapping("/getitem")
    public Item getite(){
        Item item = new Item();
        item.setId(1);
        item.setName("pen");
        item.setDescription("Ball pen");
        item.setPrice(5);
        item.setQuantity(10);
        item.setStatus("Availeble");
        return item;
    }
    @GetMapping("/getallitems")
    public ArrayList<Item> getallitems(){
        return itemArrayList;
    }
}

