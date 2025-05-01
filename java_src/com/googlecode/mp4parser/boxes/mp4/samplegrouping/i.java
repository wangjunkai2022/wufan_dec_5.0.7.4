package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
/* compiled from: VisualRandomAccessEntry.java */
/* loaded from: classes3.dex */
public class i extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f14022c = "rap ";

    /* renamed from: a  reason: collision with root package name */
    private boolean f14023a;

    /* renamed from: b  reason: collision with root package name */
    private short f14024b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.f14023a ? 128 : 0) | (this.f14024b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        byte b5 = byteBuffer.get();
        this.f14023a = (b5 & 128) == 128;
        this.f14024b = (short) (b5 & ByteCompanionObject.MAX_VALUE);
    }

    public short d() {
        return this.f14024b;
    }

    public boolean e() {
        return this.f14023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f14024b == iVar.f14024b && this.f14023a == iVar.f14023a;
    }

    public void f(short s4) {
        this.f14024b = s4;
    }

    public void g(boolean z4) {
        this.f14023a = z4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f14022c;
    }

    public int hashCode() {
        return ((this.f14023a ? 1 : 0) * 31) + this.f14024b;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.f14023a + ", numLeadingSamples=" + ((int) this.f14024b) + '}';
    }
}
