package com.kpcnc.mydatagwtestdriver.common.exception;

import com.kpcnc.mydatagwtestdriver.common.models.ErrorCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MyDataGwTestDriverException extends RuntimeException{
    private ErrorCode errorCode;

    public MyDataGwTestDriverException(ErrorCode errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public MyDataGwTestDriverException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
