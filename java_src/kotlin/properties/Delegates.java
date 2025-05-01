package kotlin.properties;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
/* compiled from: Delegates.kt */
/* loaded from: classes6.dex */
public final class Delegates {
    @NotNull
    public static final Delegates INSTANCE = new Delegates();

    private Delegates() {
    }

    @NotNull
    public final <T> ReadWriteProperty<Object, T> notNull() {
        return new NotNullVar();
    }

    @NotNull
    public final <T> ReadWriteProperty<Object, T> observable(final T t4, @NotNull final Function3<? super KProperty<?>, ? super T, ? super T, Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new ObservableProperty<T>(t4) { // from class: kotlin.properties.Delegates$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(@NotNull KProperty<?> property, T t5, T t6) {
                Intrinsics.checkNotNullParameter(property, "property");
                onChange.invoke(property, t5, t6);
            }
        };
    }

    @NotNull
    public final <T> ReadWriteProperty<Object, T> vetoable(final T t4, @NotNull final Function3<? super KProperty<?>, ? super T, ? super T, Boolean> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new ObservableProperty<T>(t4) { // from class: kotlin.properties.Delegates$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            protected boolean beforeChange(@NotNull KProperty<?> property, T t5, T t6) {
                Intrinsics.checkNotNullParameter(property, "property");
                return onChange.invoke(property, t5, t6).booleanValue();
            }
        };
    }
}
