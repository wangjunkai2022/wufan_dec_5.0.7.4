package kotlin.properties;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
/* compiled from: Interfaces.kt */
/* loaded from: classes6.dex */
public interface ReadOnlyProperty<T, V> {
    V getValue(T t4, @NotNull KProperty<?> kProperty);
}
