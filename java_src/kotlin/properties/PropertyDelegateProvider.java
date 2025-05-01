package kotlin.properties;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
/* compiled from: Interfaces.kt */
@SinceKotlin(version = "1.4")
/* loaded from: classes6.dex */
public interface PropertyDelegateProvider<T, D> {
    D provideDelegate(T t4, @NotNull KProperty<?> kProperty);
}
