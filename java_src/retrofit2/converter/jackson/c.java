package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;
/* compiled from: JacksonResponseBodyConverter.java */
/* loaded from: classes7.dex */
final class c<T> implements Converter<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final ObjectReader f73240a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ObjectReader objectReader) {
        this.f73240a = objectReader;
    }

    @Override // retrofit2.Converter
    /* renamed from: a */
    public T convert(ResponseBody responseBody) throws IOException {
        try {
            return (T) this.f73240a.readValue(responseBody.charStream());
        } finally {
            responseBody.close();
        }
    }
}
