package com.join.kotlin.domain.common;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: LiveDataExtension.kt */
/* loaded from: classes3.dex */
public final class LiveDataExtensionKt {
    public static final <T> void setEvent(@NotNull SingleLiveEvent<T> singleLiveEvent, T t4) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<this>");
        singleLiveEvent.setValue(t4);
    }

    public static final <T> void setEvent(@NotNull SingleLiveEvents<T> singleLiveEvents, @NotNull T... values) {
        List<? extends T> list;
        Intrinsics.checkNotNullParameter(singleLiveEvents, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        list = ArraysKt___ArraysKt.toList(values);
        singleLiveEvents.setValue((List) list);
    }
}
