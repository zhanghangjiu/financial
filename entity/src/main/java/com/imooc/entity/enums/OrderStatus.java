package com.imooc.entity.enums;

public enum OrderStatus {
    INIT("初始化"),
    PROCESS("处理中"),
    SUCCESS("成功"),
    FALL("失败");
    private String desc;

    OrderStatus(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
