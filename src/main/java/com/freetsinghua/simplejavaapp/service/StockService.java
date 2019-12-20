package com.freetsinghua.simplejavaapp.service;

import com.freetsinghua.simplejavaapp.stock.model.Fish;

import java.util.List;

/**
 * @author octopus
 */
public interface StockService {

    /**
     * 根据鱼品种名获取
     *
     * @param name fish
     * @return list of fish.
     */
    List<Fish> getFishByName(final String name);
}
