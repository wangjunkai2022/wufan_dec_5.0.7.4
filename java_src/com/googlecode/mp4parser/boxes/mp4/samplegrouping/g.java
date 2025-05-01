package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
/* compiled from: TemporalLevelEntry.java */
/* loaded from: classes3.dex */
public class g extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f14017c = "tele";

    /* renamed from: a  reason: collision with root package name */
    private boolean f14018a;

    /* renamed from: b  reason: collision with root package name */
    private short f14019b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.f14018a ? 128 : 0));
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        this.f14018a = (byteBuffer.get() & 128) == 128;
    }

    public boolean d() {
        return this.f14018a;
    }

    public void e(boolean z4) {
        this.f14018a = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14018a == gVar.f14018a && this.f14019b == gVar.f14019b;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f14017c;
    }

    public int hashCode() {
        return ((this.f14018a ? 1 : 0) * 31) + this.f14019b;
    }

    public String toString() {
        return "TemporalLevelEntry{levelIndependentlyDecodable=" + this.f14018a + '}';
    }
}
