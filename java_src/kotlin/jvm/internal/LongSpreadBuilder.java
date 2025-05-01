package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;
/* compiled from: PrimitiveSpreadBuilders.kt */
/* loaded from: classes6.dex */
public final class LongSpreadBuilder extends PrimitiveSpreadBuilder<long[]> {
    @NotNull
    private final long[] values;

    public LongSpreadBuilder(int i4) {
        super(i4);
        this.values = new long[i4];
    }

    public final void add(long j4) {
        long[] jArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        jArr[position] = j4;
    }

    @NotNull
    public final long[] toArray() {
        return toArray(this.values, new long[size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }
}
