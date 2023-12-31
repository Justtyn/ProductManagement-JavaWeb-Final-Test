package jiao.zi.hao.jiaozihao.common;

import lombok.Data;

@Data
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    private String code;
    private Object data;
    private String msg;

    // 成功 不返回 Data 数据
    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }

    // 成功 返回 自定义数据
    public static Result success(String msg) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMsg(msg);
        return result;
    }

    // 成功 返回 Data 数据
    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        return result;
    }

    // 成功 返回 Data 与 msg 数据
    public static Result success(Object data,String msg) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

    // 错误 返回 msg 错误信息
    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setData(msg);
        return result;
    }

    // 错误 返回 错误码 & msg 错误信息
    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setData(msg);
        return result;
    }
}
