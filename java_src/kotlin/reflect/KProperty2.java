package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: KProperty.kt */
/* loaded from: classes6.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {

    /* compiled from: KProperty.kt */
    /* loaded from: classes6.dex */
    public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
    }

    V get(D d5, E e5);

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(D d5, E e5);

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<D, E, V> getGetter();
}
