package com.igc.iia.iteminventoryapp.service;

import com.igc.iia.iteminventoryapp.entity.Item;

import java.util.List;
import java.util.Optional;

public interface IItemService {

    public Item addItem(Item item);

    public List<Item> getallItems();

    public Optional<Item> getItemByID(int id);

    public String deleteitembyid(int id);

    public Item updeteitembyid(int id,Item item);

}


