package com.igc.iia.iteminventoryapp.service;

import com.igc.iia.iteminventoryapp.entity.Item;

import java.util.ArrayList;

public interface IItemService {

    public Item addItem(Item item);

    public ArrayList<Item> getallItems();

    public Item getItem();
}


