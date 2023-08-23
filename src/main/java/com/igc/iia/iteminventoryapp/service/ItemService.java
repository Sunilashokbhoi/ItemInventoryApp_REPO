package com.igc.iia.iteminventoryapp.service;

import com.igc.iia.iteminventoryapp.entity.Item;
import com.igc.iia.iteminventoryapp.repo.IItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService implements IItemService{
    @Autowired
    IItemRepo iItemRepo;

    @Override
    public Item addItem(Item item){
     iItemRepo.save(item);
     return item;
    }
    @Override
    public List<Item> getallItems() {
        return iItemRepo.findAll();
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
