package com.ddqmua.wxjsq.service;

import com.ddqmua.wxjsq.pojo.Goods;

import java.util.List;

/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : GoodsService
 * @description : TODO
 * @date : 2019/4/25
 */
public interface GoodsService {
    List<Goods> listGoods() throws Exception;
    int insertGoods(Goods goods) throws Exception;
    int updateGoods(Goods goods) throws Exception;
    int delete(Long id) throws Exception;
}
