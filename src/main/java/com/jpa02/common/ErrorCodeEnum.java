package com.jpa02.common;

public enum ErrorCodeEnum {
	
	CODE_SUCCESS("200", "success");
	
	 private String code;
	 
     private String desc;

     ErrorCodeEnum(String code, String desc) {
         this.code = code;
         this.desc = desc;
     }

     public String getCode() {
         return this.code;
     }

     public String getDesc() {
         return desc;
     }
 
     @Override
     public String toString() {
         return "[" + this.code + "]" + this.desc;
     }
}
