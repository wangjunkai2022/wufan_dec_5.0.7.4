package kotlin.collections;

import java.util.Collection;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;
/* compiled from: AbstractMutableCollection.kt */
@SinceKotlin(version = "1.1")
/* loaded from: classes6.dex */
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements Collection<E>, KMutableCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e5);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
