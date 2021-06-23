package com.tim.example.tmall.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Builder
@Entity
@Data
public class Goods {

    @Id
    @GeneratedValue
    private Long goodsId;

    private String goodsName;

    private Integer sellingPrice;

    private Integer stockNum;


}
