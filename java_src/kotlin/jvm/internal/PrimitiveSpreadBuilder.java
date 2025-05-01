package kotlin.jvm.internal;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
/* compiled from: PrimitiveSpreadBuilders.kt */
/* loaded from: classes6.dex */
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;
    @NotNull
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i4) {
        this.size = i4;
        this.spreads = (T[]) new Object[i4];
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }

    public final void addSpread(@NotNull T spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        T[] tArr = this.spreads;
        int i4 = this.position;
        this.position = i4 + 1;
        tArr[i4] = spreadArgument;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getPosition() {
        return this.position;
    }

    protected abstract int getSize(@NotNull T t4);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPosition(int i4) {
        this.position = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    public final int size() {
        int i4 = 0;
        ?? it2 = new IntRange(0, this.size - 1).iterator();
        while (it2.hasNext()) {
            T t4 = this.spreads[it2.nextInt()];
            i4 += t4 != null ? getSize(t4) : 1;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        ?? it2 = new IntRange(0, this.size - 1).iterator();
        int i4 = 0;
        int i5 = 0;
        while (it2.hasNext()) {
            int nextInt = it2.nextInt();
            T t4 = this.spreads[nextInt];
            if (t4 != null) {
                if (i4 < nextInt) {
                    int i6 = nextInt - i4;
                    System.arraycopy(values, i4, result, i5, i6);
                    i5 += i6;
                }
                int size = getSize(t4);
                System.arraycopy(t4, 0, result, i5, size);
                i5 += size;
                i4 = nextInt + 1;
            }
        }
        int i7 = this.size;
        if (i4 < i7) {
            System.arraycopy(values, i4, result, i5, i7 - i4);
        }
        return result;
    }
}
