package com.coremedia.iso.boxes.vodafone;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: AlbumArtistBox.java */
/* loaded from: classes2.dex */
public class a extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    public static final String f9970u = "albr";

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9971v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9972w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9973x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9974y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9975z = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9976s;

    /* renamed from: t  reason: collision with root package name */
    private String f9977t;

    static {
        s();
    }

    public a() {
        super(f9970u);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("AlbumArtistBox.java", a.class);
        f9971v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 42);
        f9972w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 46);
        f9973x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "language", "", "void"), 50);
        f9974y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAlbumArtist", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "java.lang.String", "albumArtist", "", "void"), 54);
        f9975z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.vodafone.AlbumArtistBox", "", "", "", "java.lang.String"), 76);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9976s = g.f(byteBuffer);
        this.f9977t = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.d(byteBuffer, this.f9976s);
        byteBuffer.put(l.b(this.f9977t));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f9977t) + 6 + 1;
    }

    public String toString() {
        j.b().c(e.v(f9975z, this, this));
        return "AlbumArtistBox[language=" + w() + ";albumArtist=" + v() + "]";
    }

    public String v() {
        j.b().c(e.v(f9972w, this, this));
        return this.f9977t;
    }

    public String w() {
        j.b().c(e.v(f9971v, this, this));
        return this.f9976s;
    }

    public void x(String str) {
        j.b().c(e.w(f9974y, this, this, str));
        this.f9977t = str;
    }

    public void y(String str) {
        j.b().c(e.w(f9973x, this, this, str));
        this.f9976s = str;
    }
}
