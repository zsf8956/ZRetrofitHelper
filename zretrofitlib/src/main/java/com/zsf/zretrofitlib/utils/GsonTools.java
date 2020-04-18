package com.zsf.zretrofitlib.utils;

import com.google.gson.Gson;

public class GsonTools {

    public static String toJson(Object t){
        String result = new Gson().toJson(t);
        return result;
    }
}
