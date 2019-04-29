package com.ddqmua.wxjsq.utils;

import lombok.Data;

/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : ResultToken
 * @description : TODO
 * @date : 2019/4/25
 */
public class ResultToken {
    public static Result successResult(String msg,Object data,Integer code){
        return new Result(msg,data,code);
    }

    public static Result falseResult(String msg,Integer code){
        return new Result(msg,null,code);
    }

    public static Result successResult(Object data){
        return new Result("成功",data,200);
    }

    public static Result successResult(String msg){
        return new Result(msg,null,200);
    }

    public static Result falseResult(String msg){
        return new Result(msg,null,200);
    }

    public static Result falseResult(Integer code){
        return new Result("失败",null,code);
    }


}
