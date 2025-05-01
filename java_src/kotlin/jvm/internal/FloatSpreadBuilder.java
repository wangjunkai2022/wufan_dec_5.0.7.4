package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;
/* compiled from: PrimitiveSpreadBuilders.kt */
/* loaded from: classes6.dex */
public final class FloatSpreadBuilder extends PrimitiveSpreadBuilder<float[]> {
    @NotNull
    private final float[] values;

    public FloatSpreadBuilder(int i4) {
        super(i4);
        this.values = new float[i4];
    }

    public final void add(float f5) {
        float[] fArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        fArr[position] = f5;
    }

    @NotNull
    public final float[] toArray() {
        return toArray(this.values, new float[size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }
}
