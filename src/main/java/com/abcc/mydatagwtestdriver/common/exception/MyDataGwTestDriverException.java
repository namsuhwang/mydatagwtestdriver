package com.abcc.mydatagwtestdriver.common.exception;

import com.abcc.mydatagwtestdriver.common.models.ErrorCode;
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
