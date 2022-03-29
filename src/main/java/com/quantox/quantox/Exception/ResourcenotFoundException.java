package com.quantox.quantox.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcenotFoundException extends RuntimeException{


    private static final long serialVersionUID = 1l;
    private String resaurceName;
    private String fieldName;
    private String fieldvalue;


    public ResourcenotFoundException(String resaurceName, String fieldName, String fieldvalue) {
        super(String.format("%s not found with %s : '%s'",resaurceName,fieldName,fieldvalue));
        this.resaurceName = resaurceName;
        this.fieldName = fieldName;
        this.fieldvalue = fieldvalue;
    }

    public String getResaurceName() {
        return resaurceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldvalue() {
        return fieldvalue;
    }
}
