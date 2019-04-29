package com.ddqmua.wxjsq.utils;

import lombok.Data;

/**
 * @author : cgq
 * @version : 1.0
 * @ClassName : Result
 * @description : TODO
 * @date : 2019/4/25
 */
@Data
public class Result {
    private String msg;
    private Object data;
    private Integer code;
    public Result (String msg,Object data,Integer code){
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
}
