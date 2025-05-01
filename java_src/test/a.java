package test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: AA.kt */
/* loaded from: classes7.dex */
public final class a {
    public static final void a(@NotNull String string, @NotNull Function1<? super Integer, Unit> function) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(function, "function");
        function.invoke(2);
        b(string, function);
    }

    public static final void b(@NotNull String string, @NotNull Function1<? super Integer, Unit> function) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(function, "function");
        function.invoke(1);
    }
}
