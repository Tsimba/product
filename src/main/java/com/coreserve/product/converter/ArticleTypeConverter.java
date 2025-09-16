package com.coreserve.product.converter;

import com.coreserve.product.modele.enumeration.Article_Type;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ArticleTypeConverter implements AttributeConverter<Article_Type, String> {
    @Override
    public String convertToDatabaseColumn(Article_Type articleType) {
        return articleType != null ? articleType.getCode() : null;
    }

    @Override
    public Article_Type convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        for (Article_Type type : Article_Type.values()) {
            if (type.getCode().equals(dbData)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + dbData);
    }
}
