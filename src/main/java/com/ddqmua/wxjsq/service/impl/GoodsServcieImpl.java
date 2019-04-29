package com.ddqmua.wxjsq.service.impl;

import com.ddqmua.wxjsq.mapper.GoodsMapper;
import com.ddqmua.wxjsq.pojo.Goods;
import com.ddqmua.wxjsq.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : GoodsServcieImpl
 * @description : TODO
 * @date : 2019/4/25
 */
@Service
public class GoodsServcieImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> listGoods() throws Exception {
        return goodsMapper.selectGoods();
    }

    @Override
    public int insertGoods(Goods goods) throws Exception {
        return goodsMapper.insert(goods);
    }

    @Override
    public int updateGoods(Goods goods) throws Exception {
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public int delete(Long id) throws Exception {
        return goodsMapper.deleteByPrimaryKey(id);
    }
}
