package com.tim.example.tmall.repository;

import com.tim.example.tmall.model.Goods;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepository extends CrudRepository<Goods, Long> {
    Goods save(Goods goods);

    Goods findGoodsByGoodsName(String goodsName);

    Goods findGoodsByGoodsId(Long goodsId);
}
