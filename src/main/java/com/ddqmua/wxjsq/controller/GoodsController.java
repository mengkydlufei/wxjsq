package com.ddqmua.wxjsq.controller;

import com.ddqmua.wxjsq.pojo.Goods;
import com.ddqmua.wxjsq.service.GoodsService;
import com.ddqmua.wxjsq.utils.Result;
import com.ddqmua.wxjsq.utils.ResultToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : GoodsController
 * @description : TODO
 * @date : 2019/4/25
 */
@RestController
@RequestMapping("wx")
public class GoodsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GoodsService goodsService;

    @PostMapping("list")
    public Result listGoods() {
        try {
            List<Goods> list = goodsService.listGoods();
            return ResultToken.successResult("成功", list, 200);
        } catch (Exception e) {
            logger.error("查询失败");
            return ResultToken.falseResult("失败", 200);
        }
    }

    @PostMapping("save")
    public Result saveGoods(@RequestBody Goods goods) {
        try {
            goodsService.insertGoods(goods);
            return ResultToken.successResult("成功");
        } catch (Exception e) {
            logger.error("保存失败");
            return ResultToken.falseResult("保存失败");
        }
    }
}
