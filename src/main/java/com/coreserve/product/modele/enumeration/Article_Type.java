package com.coreserve.product.modele.enumeration;

public enum Article_Type {
    BOISSON_HYGINIEQUE("BH", "Boisson hygiènique"),
    BOISSON_ALCOOLIQUE("BA", "Boisson alcoolique"),;

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
}
