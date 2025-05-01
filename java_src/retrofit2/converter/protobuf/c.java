package retrofit2.converter.protobuf;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;
/* compiled from: ProtoResponseBodyConverter.java */
/* loaded from: classes7.dex */
final class c<T extends MessageLite> implements Converter<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final Parser<T> f73243a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtensionRegistryLite f73244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        this.f73243a = parser;
        this.f73244b = extensionRegistryLite;
    }

    @Override // retrofit2.Converter
    /* renamed from: a */
    public T convert(ResponseBody responseBody) throws IOException {
        try {
            try {
                return this.f73243a.parseFrom(responseBody.byteStream(), this.f73244b);
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException(e5);
            }
        } finally {
            responseBody.close();
        }
    }
}
