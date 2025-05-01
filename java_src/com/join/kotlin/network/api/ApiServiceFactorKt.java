package com.join.kotlin.network.api;

import com.join.kotlin.network.NetworkApi;
import com.join.mgps.rpc.h;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* compiled from: ApiServiceFactor.kt */
/* loaded from: classes3.dex */
public final class ApiServiceFactorKt {
    @NotNull
    private static final Lazy gameApiService$delegate;

    static {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<GameApiService>() { // from class: com.join.kotlin.network.api.ApiServiceFactorKt$gameApiService$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GameApiService invoke() {
                NetworkApi instance = NetworkApi.Companion.getINSTANCE();
                String gameUrl = h.A;
                Intrinsics.checkNotNullExpressionValue(gameUrl, "gameUrl");
                return (GameApiService) instance.getApi(GameApiService.class, gameUrl);
            }
        });
        gameApiService$delegate = lazy;
    }

    @NotNull
    public static final GameApiService getGameApiService() {
        return (GameApiService) gameApiService$delegate.getValue();
    }
}
