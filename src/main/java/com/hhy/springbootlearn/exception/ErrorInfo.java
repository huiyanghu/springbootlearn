package com.hhy.springbootlearn.exception;

/**
 * Created by hhy on 17/7/11.
 */
public class ErrorInfo<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;
    private String msg;
    private String url;
    private T data;
    private Integer isSuccess=0;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }
}
