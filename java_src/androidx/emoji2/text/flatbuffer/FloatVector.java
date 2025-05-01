package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i4, ByteBuffer byteBuffer) {
        __reset(i4, 4, byteBuffer);
        return this;
    }

    public float get(int i4) {
        return this.bb.getFloat(__element(i4));
    }
}
