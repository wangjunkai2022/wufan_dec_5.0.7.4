package com.join.android.app.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.w0;
import java.io.IOException;
/* loaded from: classes.dex */
public class JsonMapper extends ObjectMapper {
    private static JsonMapper mapper = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends JsonSerializer<Object> {
        a() {
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString("");
        }
    }

    public JsonMapper(boolean z4) {
        if (z4) {
            return;
        }
        initJsonMapper(JsonInclude.Include.NON_EMPTY);
    }

    public static JsonMapper defaultAll() {
        if (mapper == null) {
            mapper = new JsonMapper(true);
        }
        return mapper;
    }

    public static JsonMapper getInstance() {
        if (mapper == null) {
            mapper = new JsonMapper(false);
        }
        return mapper;
    }

    public static void main(String[] strArr) {
    }

    public static JsonMapper nonDefaultMapper() {
        if (mapper == null) {
            mapper = new JsonMapper(false);
        }
        return mapper;
    }

    public static String toJsonString(Object obj) {
        return getInstance().toJson(obj);
    }

    public JavaType createCollectionType(Class<?> cls, Class<?>... clsArr) {
        return getTypeFactory().constructParametricType(cls, clsArr);
    }

    public JsonMapper enableEnumUseToString() {
        enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        return this;
    }

    public JsonMapper enableJaxbAnnotation() {
        return this;
    }

    public JsonMapper enableSimple() {
        configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return this;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (g2.h(str)) {
            return null;
        }
        try {
            return (T) readValue(str, cls);
        } catch (IOException e5) {
            w0.e("parse json string error:", str, e5.toString());
            return null;
        }
    }

    public ObjectMapper getMapper() {
        return this;
    }

    public void initJsonMapper(JsonInclude.Include include) {
        if (include != null) {
            setSerializationInclusion(include);
        }
        enableSimple();
        disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        getSerializerProvider().setNullValueSerializer(new a());
    }

    public String toJson(Object obj) {
        try {
            return writeValueAsString(obj);
        } catch (IOException e5) {
            w0.e("write to json string error:", obj.toString(), e5.toString());
            return null;
        }
    }

    public String toJsonP(String str, Object obj) {
        return toJson(new JSONPObject(str, obj));
    }

    public <T> T update(String str, T t4) {
        try {
            return (T) readerForUpdating(t4).readValue(str);
        } catch (JsonProcessingException unused) {
            return null;
        }
    }

    public <T> T fromJson(String str, JavaType javaType) {
        if (g2.h(str)) {
            return null;
        }
        try {
            return (T) readValue(str, javaType);
        } catch (IOException e5) {
            e5.printStackTrace();
            w0.e("parse json string error:", str, e5.toString());
            return null;
        }
    }

    public <T> T fromJson(String str, TypeReference typeReference) {
        if (g2.h(str)) {
            return null;
        }
        try {
            return (T) readValue(str, typeReference);
        } catch (IOException e5) {
            e5.printStackTrace();
            w0.e("parse json string error:", str, e5.toString());
            return null;
        }
    }
}
