package com.igc.iia.iteminventoryapp.service;

import com.igc.iia.iteminventoryapp.entity.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService implements IItemService {

    ArrayList<Item> itemArrayList = new ArrayList<>();
    @Override
    public Item addItem(Item item){
     itemArrayList.add(item);
     return item;
    }
    @Override
    public ArrayList<Item> getallItems(){
        return itemArrayList;
    }
    @Override
    public Item getItem(){
        Item item = new Item();
        item.setId(1);
        item.setName("pen");
        item.setDescription("Ball pen");
        item.setPrice(5);
        item.setQuantity(10);
        item.setStatus("Availeble");
        return item;
    }
}
