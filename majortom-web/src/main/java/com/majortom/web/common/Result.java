package com.majortom.web.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 返回结果 通用类
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/17 21:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {

    private T data;

    private String msg;

    private int code;

    private long total;

    public Result(T data, String msg, int code) {
        this.data = data;
        this.msg = msg;
        this.code = code;
    }

    public static <T> Result<T> success() {
        return new Result<>(null, "一切OK！", 200);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(data, "一切OK！", 200);
    }

    public static <T> Result<T> success(T data, long total) {
        return new Result<>(data, "一切OK！", 200, total);
    }

    public static <T> Result<T> judge(Boolean success) {
        if (success) {
            return new Result<>(null, "一切OK！", 200);
        }
        return new Result<>(null, "执行出错", 404);
    }
}
