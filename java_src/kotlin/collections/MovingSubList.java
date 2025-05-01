package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: SlidingWindow.kt */
/* loaded from: classes.dex */
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {
    private int _size;
    private int fromIndex;
    @NotNull
    private final List<E> list;

    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i4) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i4, this._size);
        return this.list.get(this.fromIndex + i4);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this._size;
    }

    public final void move(int i4, int i5) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i4, i5, this.list.size());
        this.fromIndex = i4;
        this._size = i5 - i4;
    }
}
