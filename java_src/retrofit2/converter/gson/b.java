package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;
/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes7.dex */
final class b<T> implements Converter<T, RequestBody> {

    /* renamed from: c  reason: collision with root package name */
    private static final MediaType f73231c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f73232d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Gson f73233a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f73234b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f73233a = gson;
        this.f73234b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: a */
    public RequestBody convert(T t4) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.f73233a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f73232d));
        this.f73234b.write(newJsonWriter, t4);
        newJsonWriter.close();
        return RequestBody.create(f73231c, buffer.readByteString());
    }
}
