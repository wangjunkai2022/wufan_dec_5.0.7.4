package io.reactivex.internal.fuseable;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
/* loaded from: classes6.dex */
public interface SimpleQueue<T> {
    void clear();

    boolean isEmpty();

    boolean offer(@NonNull T t4);

    boolean offer(@NonNull T t4, @NonNull T t5);

    @Nullable
    T poll() throws Exception;
}
