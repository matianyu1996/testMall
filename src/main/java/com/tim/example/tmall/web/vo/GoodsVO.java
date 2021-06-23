package com.tim.example.tmall.web.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class GoodsVO {

    private Long goodsId;

    private String goodsName;

    private String goodsIntro;

    private Integer sellingPrice;

}
