package com.tim.example.tmall.web;

import com.tim.example.tmall.model.Goods;
import com.tim.example.tmall.service.GoodsService;
import com.tim.example.tmall.web.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class GoodsWeb {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/goods")
    public GoodsVO createGoods(@RequestBody GoodsVO goodsVO){
        return Optional.of(goodsVO)
                .map(GoodsWeb::goodsVOToGoodsConvertor)
                .map(goods -> goodsService.createGoods(goods))
                .map(GoodsWeb::goodsToGoodsVOConvertor)
                .orElse(null);
    }

    private static GoodsVO goodsToGoodsVOConvertor(Goods goods){
        GoodsVO goodsVO = GoodsVO
                .builder()
                .goodsId(goods.getGoodsId())
                .goodsName(goods.getGoodsName())
                .goodsIntro(goods.getGoodsId()+" "+goods.getStockNum())
                .sellingPrice(goods.getSellingPrice())
                .build();
        return goodsVO;
    }

    private static Goods goodsVOToGoodsConvertor(GoodsVO goodsVO){
        return Goods
                .builder()
                .goodsName(goodsVO.getGoodsName())
                .stockNum(999)
                .sellingPrice(goodsVO.getSellingPrice())
                .build();
    }

    //Getgoods
    @GetMapping(path="/goods/byName")
    public Goods getGood(@RequestParam String goodsName){
        return goodsService.getGood(goodsName);
    }

    @GetMapping(path="/goods/byId")
    public Goods getGood2(@RequestParam Long id){
        return goodsService.getGood(id);
    }

}
