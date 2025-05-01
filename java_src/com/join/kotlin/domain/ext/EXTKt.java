package com.join.kotlin.domain.ext;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.join.android.app.common.utils.j;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.l2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: EXT.kt */
/* loaded from: classes3.dex */
public final class EXTKt {
    public static final void checkHasLogin(@NotNull Context context, @NotNull Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (IntentUtil.getInstance().goLogin(context)) {
            return;
        }
        func.invoke();
    }

    public static final void checkHasNetWork(@NotNull Context context, @NotNull Function0<Unit> func) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        if (j.j(context)) {
            func.invoke();
        } else {
            l2.a(context).b("请检查网络！");
        }
    }

    public static final boolean dialogFragmentCanShow(@NotNull DialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        return (dialogFragment.isAdded() || dialogFragment.isVisible() || dialogFragment.isRemoving()) ? false : true;
    }
}
