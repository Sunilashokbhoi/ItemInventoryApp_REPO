package com.igc.iia.iteminventoryapp.service;

import com.igc.iia.iteminventoryapp.entity.Item;
import com.igc.iia.iteminventoryapp.exception.ItemNotFoundException;
import com.igc.iia.iteminventoryapp.repo.IItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
    public Optional<Item> getItemByID(int id) {
        Optional<Item> item = iItemRepo.findById(id);
        if (item.isPresent()) {
            return item;
        }else {
            throw new ItemNotFoundException("Item With Given Id Not Found Database");
        }
    }
    @Override
    public String deleteitembyid(int id) {
        Item item =iItemRepo.findById(id).get();
        iItemRepo.delete(item);
        return "Item Deleted Successfully...";
    }

    @Override
    public Item updeteitembyid(int id, Item item) {
        Item olditem = iItemRepo.findById(id).get();
        olditem.setName(item.getName());
        olditem.setDescription(item.getDescription());
        olditem.setPrice(item.getPrice());
        olditem.setStatus(item.getStatus());
        olditem.setQuantity(item.getQuantity());
        return iItemRepo.save(olditem);
    }
}
