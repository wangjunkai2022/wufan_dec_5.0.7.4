package kotlin.collections;

import java.util.Iterator;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
/* compiled from: Grouping.kt */
@SinceKotlin(version = "1.1")
/* loaded from: classes.dex */
public interface Grouping<T, K> {
    K keyOf(T t4);

    @NotNull
    Iterator<T> sourceIterator();
}
