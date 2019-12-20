package com.freetsinghua.simplejavaapp.service;

import com.freetsinghua.simplejavaapp.common.FakeDatas;
import com.freetsinghua.simplejavaapp.stock.model.Fish;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author octopus
 */
@Service
public class StockServiceImpl implements StockService {
    @Override
    public List<Fish> getFishByName(String name) {
        return FakeDatas.getSomeFish(name);
    }
}
