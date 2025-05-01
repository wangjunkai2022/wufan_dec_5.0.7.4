package com.coremedia.iso.boxes;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackReferenceTypeBox.java */
/* loaded from: classes2.dex */
public class i1 extends com.googlecode.mp4parser.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f9736p = "hint";

    /* renamed from: q  reason: collision with root package name */
    public static final String f9737q = "cdsc";

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ c.b f9738r = null;

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9739s = null;

    /* renamed from: o  reason: collision with root package name */
    private long[] f9740o;

    static {
        s();
    }

    public i1(String str) {
        super(str);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackReferenceTypeBox.java", i1.class);
        f9738r = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTrackIds", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "[J"), 40);
        f9739s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.TrackReferenceTypeBox", "", "", "", "java.lang.String"), 65);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining() / 4;
        this.f9740o = new long[remaining];
        for (int i4 = 0; i4 < remaining; i4++) {
            this.f9740o[i4] = com.coremedia.iso.g.l(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        for (long j4 : this.f9740o) {
            com.coremedia.iso.i.i(byteBuffer, j4);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9740o.length * 4;
    }

    public long[] t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9738r, this, this));
        return this.f9740o;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9739s, this, this));
        StringBuilder sb = new StringBuilder();
        sb.append("TrackReferenceTypeBox[type=");
        sb.append(getType());
        for (int i4 = 0; i4 < this.f9740o.length; i4++) {
            sb.append(";trackId");
            sb.append(i4);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(this.f9740o[i4]);
        }
        sb.append("]");
        return sb.toString();
    }
}
