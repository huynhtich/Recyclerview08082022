package com.example.recyclerview08082022;

public enum CategoryEnum {
    RESTAURANT("Nhà hàng"),
    BIRTH_DAY("Sinh nhật"),
    FAMILY("Gia đình"),
    GROUP("Hội nhóm"),
    STORE("Cửa hàng");

    private final String name;

    CategoryEnum(String s) {
        name = s;
    }

    public String toString() {
        return name;
    }
}