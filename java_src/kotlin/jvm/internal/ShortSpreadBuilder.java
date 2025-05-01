package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;
/* compiled from: PrimitiveSpreadBuilders.kt */
/* loaded from: classes6.dex */
public final class ShortSpreadBuilder extends PrimitiveSpreadBuilder<short[]> {
    @NotNull
    private final short[] values;

    public ShortSpreadBuilder(int i4) {
        super(i4);
        this.values = new short[i4];
    }

    public final void add(short s4) {
        short[] sArr = this.values;
        int position = getPosition();
        setPosition(position + 1);
        sArr[position] = s4;
    }

    @NotNull
    public final short[] toArray() {
        return toArray(this.values, new short[size()]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.PrimitiveSpreadBuilder
    public int getSize(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }
}
