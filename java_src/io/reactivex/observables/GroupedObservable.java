package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;
/* loaded from: classes6.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {
    final K key;

    /* JADX INFO: Access modifiers changed from: protected */
    public GroupedObservable(@Nullable K k4) {
        this.key = k4;
    }

    @Nullable
    public K getKey() {
        return this.key;
    }
}
