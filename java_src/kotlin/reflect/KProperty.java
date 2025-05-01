package kotlin.reflect;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
/* compiled from: KProperty.kt */
/* loaded from: classes6.dex */
public interface KProperty<V> extends KCallable<V> {

    /* compiled from: KProperty.kt */
    /* loaded from: classes6.dex */
    public interface Accessor<V> {
        @NotNull
        KProperty<V> getProperty();
    }

    /* compiled from: KProperty.kt */
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isConst$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isLateinit$annotations() {
        }
    }

    /* compiled from: KProperty.kt */
    /* loaded from: classes6.dex */
    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    @NotNull
    Getter<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
