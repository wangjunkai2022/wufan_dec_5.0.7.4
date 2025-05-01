package kotlin.properties;

import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
/* compiled from: Interfaces.kt */
/* loaded from: classes6.dex */
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    V getValue(T t4, @NotNull KProperty<?> kProperty);

    void setValue(T t4, @NotNull KProperty<?> kProperty, V v2);
}
