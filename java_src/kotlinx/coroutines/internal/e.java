package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ExceptionsConstructor.kt */
@IgnoreJRERequirement
/* loaded from: classes6.dex */
final class e extends k {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final e f71108a = new e();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final a f71109b = new a();

    /* compiled from: ExceptionsConstructor.kt */
    /* loaded from: classes6.dex */
    public static final class a extends ClassValue<Function1<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @NotNull
        /* renamed from: b */
        public Function1<Throwable, Throwable> a(@Nullable Class<?> cls) {
            Function1<Throwable, Throwable> b5;
            Objects.requireNonNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            b5 = ExceptionsConstructorKt.b(cls);
            return b5;
        }
    }

    private e() {
    }

    @Override // kotlinx.coroutines.internal.k
    @NotNull
    public Function1<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        return (Function1) f71109b.get(cls);
    }
}
