package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.g;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: LyricsUriBox.java */
/* loaded from: classes2.dex */
public class d extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9989t = "lrcu";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9990u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9991v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9992w = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9993s;

    static {
        s();
    }

    public d() {
        super(f9989t);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("LyricsUriBox.java", d.class);
        f9990u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 39);
        f9991v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "java.lang.String", "lyricsUri", "", "void"), 43);
        f9992w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 64);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9993s = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(l.b(this.f9993s));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f9993s) + 5;
    }

    public String toString() {
        j.b().c(e.v(f9992w, this, this));
        return "LyricsUriBox[lyricsUri=" + v() + "]";
    }

    public String v() {
        j.b().c(e.v(f9990u, this, this));
        return this.f9993s;
    }

    public void w(String str) {
        j.b().c(e.w(f9991v, this, this, str));
        this.f9993s = str;
    }
}
