package com.googlecode.mp4parser.contentprotection;

import com.googlecode.mp4parser.boxes.piff.c;
import java.nio.ByteBuffer;
import java.util.UUID;
/* compiled from: GenericHeader.java */
/* loaded from: classes3.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static UUID f14069c;

    /* renamed from: b  reason: collision with root package name */
    ByteBuffer f14070b;

    static {
        UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        f14069c = fromString;
        c.f14025a.put(fromString, a.class);
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public ByteBuffer b() {
        return this.f14070b;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public UUID c() {
        return f14069c;
    }

    @Override // com.googlecode.mp4parser.boxes.piff.c
    public void d(ByteBuffer byteBuffer) {
        this.f14070b = byteBuffer;
    }
}
