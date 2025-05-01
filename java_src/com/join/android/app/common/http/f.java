package com.join.android.app.common.http;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;
/* compiled from: ProgressRequestBody.java */
/* loaded from: classes3.dex */
public class f extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBody f14690a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14691b;

    /* renamed from: c  reason: collision with root package name */
    private BufferedSink f14692c;

    /* renamed from: d  reason: collision with root package name */
    String f14693d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressRequestBody.java */
    /* loaded from: classes3.dex */
    public class a extends ForwardingSink {

        /* renamed from: b  reason: collision with root package name */
        long f14694b;

        /* renamed from: c  reason: collision with root package name */
        long f14695c;

        a(Sink sink) {
            super(sink);
            this.f14694b = 0L;
            this.f14695c = 0L;
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j4) throws IOException {
            super.write(buffer, j4);
            if (this.f14695c == 0) {
                this.f14695c = f.this.contentLength();
            }
            this.f14694b += j4;
            g gVar = f.this.f14691b;
            long j5 = this.f14694b;
            long j6 = this.f14695c;
            gVar.onRequestProgress(j5, j6, j5 == j6, f.this.f14693d);
        }
    }

    public f(RequestBody requestBody, g gVar, String str) {
        this.f14690a = requestBody;
        this.f14691b = gVar;
        this.f14693d = str;
    }

    private Sink b(Sink sink) {
        return new a(sink);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.f14690a.contentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f14690a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (this.f14692c == null) {
            this.f14692c = Okio.buffer(b(bufferedSink));
        }
        this.f14690a.writeTo(this.f14692c);
        this.f14692c.flush();
    }
}
