package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ObservableProperty.kt */
/* loaded from: classes6.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V value;

    public ObservableProperty(V v2) {
        this.value = v2;
    }

    protected void afterChange(@NotNull KProperty<?> property, V v2, V v4) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    protected boolean beforeChange(@NotNull KProperty<?> property, V v2, V v4) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, V v2) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v4 = this.value;
        if (beforeChange(property, v4, v2)) {
            this.value = v2;
            afterChange(property, v4, v2);
        }
    }
}
