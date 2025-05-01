package com.join.mgps.Util;

import com.MApplication;
import com.join.android.app.common.utils.APKUtils;
import com.join.mgps.dto.TipBean;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JYGameUtil.kt */
/* loaded from: classes3.dex */
public final class s0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f28055a = new s0();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f28056b = "com.zjrx.gamestore";

    private s0() {
    }

    @JvmStatic
    public static final boolean a(@Nullable List<? extends TipBean> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (TipBean tipBean : list) {
            if (Intrinsics.areEqual("134", tipBean.getId())) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final void b() {
        APKUtils.Companion companion = APKUtils.f14829a;
        MApplication instance = MApplication.f1497x;
        Intrinsics.checkNotNullExpressionValue(instance, "instance");
        companion.L(instance, f28056b);
    }

    @JvmStatic
    public static final boolean c() {
        APKUtils.Companion companion = APKUtils.f14829a;
        MApplication instance = MApplication.f1497x;
        Intrinsics.checkNotNullExpressionValue(instance, "instance");
        return companion.t(instance, f28056b);
    }
}
