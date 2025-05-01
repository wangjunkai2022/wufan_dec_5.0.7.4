package com.mp4parser.iso14496.part15;

import java.nio.ByteBuffer;
/* compiled from: StepwiseTemporalLayerEntry.java */
/* loaded from: classes5.dex */
public class f extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f57196a = "stsa";

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        return ByteBuffer.allocate(0);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f57196a;
    }

    public int hashCode() {
        return 37;
    }
}
