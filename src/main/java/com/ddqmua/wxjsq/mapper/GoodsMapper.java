package com.ddqmua.wxjsq.mapper;

import com.ddqmua.wxjsq.pojo.Goods;

import java.util.List;
/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : GoodsService
 * @description : TODO
 * @date : 2019/4/25
 */
public interface GoodsMapper {
    /**
     *@description 根据id删除
     */
    int deleteByPrimaryKey(Long id);
    /**
     *
     * @author : cgq
     * @date : 2019/4/25
     * @Description : 添加
     * @param 商品信息 record
     * @return int
     */
    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectGoods();

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}