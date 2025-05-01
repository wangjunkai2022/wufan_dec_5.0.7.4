package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;
/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes7.dex */
final class c<T> implements Converter<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f73235a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f73236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f73235a = gson;
        this.f73236b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: a */
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader newJsonReader = this.f73235a.newJsonReader(responseBody.charStream());
        try {
            T read = this.f73236b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
