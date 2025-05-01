package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
/* compiled from: GroupEntry.java */
/* loaded from: classes3.dex */
public abstract class b {
    public abstract ByteBuffer a();

    public abstract void b(ByteBuffer byteBuffer);

    public int c() {
        return a().limit();
    }

    public abstract String getType();
}
