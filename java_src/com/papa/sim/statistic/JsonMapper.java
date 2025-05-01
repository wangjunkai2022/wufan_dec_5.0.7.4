package com.papa.sim.statistic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.JSONPObject;
import java.io.IOException;
/* loaded from: classes5.dex */
public class JsonMapper extends ObjectMapper {

    /* renamed from: b  reason: collision with root package name */
    private static JsonMapper f58655b = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
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

    public static JsonMapper a() {
        if (f58655b == null) {
            f58655b = new JsonMapper(true);
        }
        return f58655b;
    }

    public static JsonMapper e() {
        if (f58655b == null) {
            f58655b = new JsonMapper(false);
        }
        return f58655b;
    }

    public static JsonMapper f() {
        if (f58655b == null) {
            f58655b = new JsonMapper(false);
        }
        return f58655b;
    }

    public static String toJsonString(Object obj) {
        return e().toJson(obj);
    }

    public JsonMapper b() {
        enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        return this;
    }

    public JsonMapper c() {
        return this;
    }

    public JavaType createCollectionType(Class<?> cls, Class<?>... clsArr) {
        return getTypeFactory().constructParametricType(cls, clsArr);
    }

    public JsonMapper d() {
        configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return this;
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (str != null && !str.equals("")) {
            try {
                return (T) readValue(str, cls);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public ObjectMapper getMapper() {
        return this;
    }

    public void initJsonMapper(JsonInclude.Include include) {
        if (include != null) {
            setSerializationInclusion(include);
        }
        d();
        disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        getSerializerProvider().setNullValueSerializer(new a());
    }

    public String toJson(Object obj) {
        try {
            return writeValueAsString(obj);
        } catch (IOException unused) {
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
        if (str != null && !str.equals("")) {
            try {
                return (T) readValue(str, javaType);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
