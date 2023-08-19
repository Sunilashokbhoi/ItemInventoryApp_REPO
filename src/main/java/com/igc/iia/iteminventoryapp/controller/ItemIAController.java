package com.igc.iia.iteminventoryapp.controller;

import com.igc.iia.iteminventoryapp.controller.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/item/api")
public class ItemIAController {

    @GetMapping("/itemname")
    public String name(){
        return "item name ";
    }

}

