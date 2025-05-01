package kotlin.collections;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableList;
/* compiled from: AbstractMutableList.kt */
@SinceKotlin(version = "1.1")
/* loaded from: classes.dex */
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements List<E>, KMutableList {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i4, E e5);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i4) {
        return removeAt(i4);
    }

    public abstract E removeAt(int i4);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i4, E e5);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
