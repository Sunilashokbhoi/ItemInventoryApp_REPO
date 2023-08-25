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

    @Override
    public Item getItemByID(int id) {
        return iItemRepo.findById(id).get();
    }

    @Override
    public String deleteitembyid(int id) {
        Item item =getItemByID(id);
        iItemRepo.delete(item);
        return "Item Deleted Successfully...";
    }

    @Override
    public Item updeteitembyid(int id, Item item) {
        Item olditem = getItemByID(id);
        olditem.setName(item.getName());
        olditem.setDescription(item.getDescription());
        olditem.setPrice(item.getPrice());
        olditem.setStatus(item.getStatus());
        olditem.setQuantity(item.getQuantity());
        return iItemRepo.save(olditem);
    }
}
