package com.coreserve.product.modele.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

public enum Article_Type {
    BOISSON_HYGINIEQUE("BH", "BOISSON HYGIENIQUE"),
    BOISSON_ALCOOLIQUE("BA", "BOISSON ALCOOLIQUE"),
    CONDITIONNEMENT("CD", "CONDITIONNEMENT"),
    ;

    private final String code;
    private final String message;

    private Article_Type(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @JsonCreator
    public static Article_Type fromObject(Map<String, Object> obj) {
        String code = (String) obj.get("code");
        for (Article_Type type : values()) {
            if (type.code.equalsIgnoreCase(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
    }

    @JsonValue
    public Map<String, String> toJson() {
        return Map.of("code", code, "message", message);
    }
}
