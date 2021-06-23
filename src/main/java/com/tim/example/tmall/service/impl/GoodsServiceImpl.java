package com.tim.example.tmall.service.impl;

import com.tim.example.tmall.model.Goods;
import com.tim.example.tmall.repository.GoodsRepository;
import com.tim.example.tmall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Goods createGoods(Goods goods) {
        return goodsRepository.save(goods);
    }

    @Override
    public Goods getGood(String name){
        return goodsRepository.findGoodsByGoodsName(name);
    }

    @Override
    public Goods getGood(Long id){
        return goodsRepository.findGoodsByGoodsId(id);
    }
}
