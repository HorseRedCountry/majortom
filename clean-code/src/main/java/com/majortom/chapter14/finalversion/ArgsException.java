package com.majortom.chapter14.finalversion;

import static com.majortom.chapter14.finalversion.ErrorCode.OK;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/9/19 21:54
 **/
public class ArgsException extends Exception {

    private char errorArgumentId='\0';

    private String errorParameter=null;

    private ErrorCode errorCode=OK;

    public ArgsException() {}

    public ArgsException(String message) {
        super(message);
    }

    public ArgsException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ArgsException( ErrorCode errorCode,String errorParameter) {
        this.errorParameter = errorParameter;
        this.errorCode = errorCode;
    }

    public ArgsException( ErrorCode errorCode,char errorArgumentId,String errorParameter) {
        this.errorParameter = errorParameter;
        this.errorCode = errorCode;
        this.errorArgumentId=errorArgumentId;
    }

    public char getErrorArgumentId() {
        return errorArgumentId;
    }

    public void setErrorArgumentId(char errorArgumentId) {
        this.errorArgumentId = errorArgumentId;
    }

    public String getErrorParameter() {
        return errorParameter;
    }

    public void setErrorParameter(String errorParameter) {
        this.errorParameter = errorParameter;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
