package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: KProperty.kt */
/* loaded from: classes6.dex */
public interface KProperty1<T, V> extends KProperty<V>, Function1<T, V> {

    /* compiled from: KProperty.kt */
    /* loaded from: classes6.dex */
    public interface Getter<T, V> extends KProperty.Getter<V>, Function1<T, V> {
    }

    V get(T t4);

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(T t4);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<T, V> getGetter();
}
