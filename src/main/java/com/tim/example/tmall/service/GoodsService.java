package com.tim.example.tmall.service;

import com.tim.example.tmall.model.Goods;

public interface GoodsService {

    Goods createGoods(Goods goods);

    Goods getGood(String name);

    Goods getGood(Long id);
}
