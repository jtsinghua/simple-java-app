package com.freetsinghua.simplejavaapp.controller;

import com.freetsinghua.simplejavaapp.service.StockService;
import com.freetsinghua.simplejavaapp.stock.model.Fish;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author octopus
 */
@RestController
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("stock/fish/{name}")
    public List<Fish> fishes(@PathVariable String name) {
        if (name == null) {
            name = "shake".toUpperCase();
        }
        return this.stockService.getFishByName(name);
    }
}
