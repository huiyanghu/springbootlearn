package com.hhy.springbootlearn.util;

import java.util.Map;

/**
 * Created by hhy on 17/7/11.
 */
public class ResultBean {
    private Integer isSuccess = 0;
    private String msg = "";
    private Integer code = -1;
    private Object data;

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
