package com.kdf.util;

import com.kdf.entity.Result;

/**
 * created  by KDF on 2017/12/4.
 */


public class ResultUtil{
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

    public static  Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;


    }
}
