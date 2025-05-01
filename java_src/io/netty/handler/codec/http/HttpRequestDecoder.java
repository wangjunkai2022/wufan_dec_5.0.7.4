package io.netty.handler.codec.http;
/* loaded from: classes6.dex */
public class HttpRequestDecoder extends HttpObjectDecoder {
    public HttpRequestDecoder() {
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected HttpMessage createInvalidMessage() {
        return new DefaultFullHttpRequest(HttpVersion.HTTP_1_0, HttpMethod.GET, "/bad-request", this.validateHeaders);
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected HttpMessage createMessage(String[] strArr) throws Exception {
        return new DefaultHttpRequest(HttpVersion.valueOf(strArr[2]), HttpMethod.valueOf(strArr[0]), strArr[1], this.validateHeaders);
    }

    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    protected boolean isDecodingRequest() {
        return true;
    }

    public HttpRequestDecoder(int i4, int i5, int i6) {
        super(i4, i5, i6, true);
    }

    public HttpRequestDecoder(int i4, int i5, int i6, boolean z4) {
        super(i4, i5, i6, true, z4);
    }

    public HttpRequestDecoder(int i4, int i5, int i6, boolean z4, int i7) {
        super(i4, i5, i6, true, z4, i7);
    }
}
