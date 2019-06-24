package com.reprocess.enums;

import java.util.Arrays;
import java.util.List;

public enum ProcessType {

    COMM_IDS(1, "Pull production commid’s"), 
    TEMPLATE_IDS(2, "Pull production copies using Template I’d"),
    CUST_DATA(3, "Pull custdata using account number"), 
    TEMPLATE_VOLUME(4, "Check volume of template");

    private final Integer  key;
    private final String value;

    ProcessType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
    
    public static List<ProcessType> getAll(){
    	return Arrays.asList(COMM_IDS, TEMPLATE_IDS, CUST_DATA, TEMPLATE_VOLUME);
    }
}