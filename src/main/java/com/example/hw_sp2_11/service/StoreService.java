package com.example.hw_sp2_11.service;

import com.example.hw_sp2_11.depot.Item;
import com.example.hw_sp2_11.store.Basket;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StoreService {

    private final Map<Integer, Item> items = new HashMap<>();

    private final Basket basket;


    public StoreService(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init() {
        items.put(111, new Item(111, "Халва арахисовая", 1, 120.00));
        items.put(112, new Item(112, "Халва кунжутная", 1, 230.50));
        items.put(113, new Item(113, "Пряники медовые", 1, 114.00));
        items.put(114, new Item(114, "Вафли", 1, 120.00));
        items.put(115, new Item(115, "Конфеты шоколадные", 1, 120.00));
        items.put(116, new Item(116, "Карамель", 1, 120.00));
        items.put(117, new Item(117, "Леденцы ассорти", 1, 120.00));
        items.put(118, new Item(118, "Конфеты мармеладные", 1, 120.00));
        items.put(119, new Item(119, "Круассаны", 1, 120.00));
        items.put(120, new Item(120, "Печенье овсяное", 1, 120.00));
        items.put(121, new Item(121, "Печенье кокосовое", 1, 120.00));
        items.put(122, new Item(122, "Кукурузные палочки", 1, 120.00));
        items.put(123, new Item(123, "Пастила", 1, 120.00));
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(items::get)
                        .collect(Collectors.toList())
        );


    }

    public List<Item> get() {
        return basket.get();
    }
}

