package com.mp4parser.iso14496.part30;

import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: WebVTTTrack.java */
/* loaded from: classes5.dex */
public class d extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e  reason: collision with root package name */
    String[] f57247e;

    /* renamed from: f  reason: collision with root package name */
    List<f> f57248f;

    /* renamed from: g  reason: collision with root package name */
    b f57249g;

    public d(com.googlecode.mp4parser.e eVar) throws IOException {
        super(eVar.toString());
        this.f57248f = new ArrayList();
        b bVar = new b();
        this.f57249g = bVar;
        bVar.v(new a());
        this.f57249g.v(new c());
        ByteBuffer Q = eVar.Q(0L, com.googlecode.mp4parser.util.c.a(eVar.size()));
        byte[] bArr = new byte[com.googlecode.mp4parser.util.c.a(eVar.size())];
        Q.get(bArr);
        this.f57247e = l.a(bArr).split("\\r?\\n");
        String str = "";
        int i4 = 0;
        while (i4 < this.f57247e.length) {
            str = String.valueOf(str) + this.f57247e[i4] + "\n";
            int i5 = i4 + 1;
            if (this.f57247e[i5].isEmpty() && this.f57247e[i4 + 2].isEmpty()) {
                break;
            }
            i4 = i5;
        }
        while (true) {
            String[] strArr = this.f57247e;
            if (i4 >= strArr.length || !strArr[i4].isEmpty()) {
                return;
            }
            i4++;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i M() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return new long[0];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> x() {
        return null;
    }
}
