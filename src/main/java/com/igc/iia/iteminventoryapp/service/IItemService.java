package com.igc.iia.iteminventoryapp.service;

import com.igc.iia.iteminventoryapp.entity.Item;

import java.util.ArrayList;
import java.util.List;

public interface IItemService {

    public Item addItem(Item item);

    public List<Item> getallItems();

    public Item getItem();
}


