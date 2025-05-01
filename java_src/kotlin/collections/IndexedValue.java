package kotlin.collections;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: IndexedValue.kt */
/* loaded from: classes6.dex */
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int i4, T t4) {
        this.index = i4;
        this.value = t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexedValue copy$default(IndexedValue indexedValue, int i4, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = indexedValue.index;
        }
        if ((i5 & 2) != 0) {
            obj = indexedValue.value;
        }
        return indexedValue.copy(i4, obj);
    }

    public final int component1() {
        return this.index;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final IndexedValue<T> copy(int i4, T t4) {
        return new IndexedValue<>(i4, t4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IndexedValue) {
            IndexedValue indexedValue = (IndexedValue) obj;
            return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
        }
        return false;
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int i4 = this.index * 31;
        T t4 = this.value;
        return i4 + (t4 == null ? 0 : t4.hashCode());
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
    }
}
