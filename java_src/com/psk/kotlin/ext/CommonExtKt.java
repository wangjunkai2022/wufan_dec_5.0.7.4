package com.psk.kotlin.ext;

import android.content.Context;
import android.view.View;
import com.join.mgps.Util.l2;
import com.psk.kotlin.ext.CommonExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CommonExt.kt */
/* loaded from: classes5.dex */
public final class CommonExtKt {
    public static final void onClick(@NotNull View view, @NotNull final Function0<Unit> method) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(method, "method");
        view.setOnClickListener(new View.OnClickListener() { // from class: z2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommonExtKt.onClick$lambda$0(Function0.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClick$lambda$0(Function0 method, View view) {
        Intrinsics.checkNotNullParameter(method, "$method");
        method.invoke();
    }

    public static final void toast(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null) {
            return;
        }
        l2.a(context).b(str);
    }
}
