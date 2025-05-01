package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
/* compiled from: RollRecoveryEntry.java */
/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f13997b = "roll";

    /* renamed from: a  reason: collision with root package name */
    private short f13998a;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.f13998a);
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        this.f13998a = byteBuffer.getShort();
    }

    public short d() {
        return this.f13998a;
    }

    public void e(short s4) {
        this.f13998a = s4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f13998a == ((d) obj).f13998a;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f13997b;
    }

    public int hashCode() {
        return this.f13998a;
    }
}
