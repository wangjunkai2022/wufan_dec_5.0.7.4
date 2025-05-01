package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
/* compiled from: NullMediaHeaderBox.java */
/* loaded from: classes2.dex */
public class j0 extends a {

    /* renamed from: s  reason: collision with root package name */
    public static final String f9741s = "nmhd";

    public j0() {
        super(f9741s);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 4L;
    }
}
