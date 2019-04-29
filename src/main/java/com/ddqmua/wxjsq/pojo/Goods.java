package com.ddqmua.wxjsq.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : Goods
 * @description : TODO
 * @date : 2019/4/25
 */
@Data
public class Goods implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    /**
     *@description id
     */
    private Long id;
    /**
     *@description 商品名称
     */
    private String name;
    /**
     *@description 商品描述
     */
    private String description;
    /**
     *@description 商品价格
     */
    private Double price;
}
