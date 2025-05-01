package com.join.kotlin.http;

import com.join.kotlin.http.api.RpcJavaApiForKotlin;
import com.join.mgps.rpc.h;
import com.kotlin.base.data.net.RetrofitFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: RpcKotlinServiceFactory.kt */
/* loaded from: classes3.dex */
public final class RpcKotlinServiceFactory {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Lazy<RpcKotlinServiceFactory> instances$delegate;
    @Nullable
    private RpcJavaApiForKotlin javaAccountApi;
    @Nullable
    private RpcJavaApiForKotlin javaApi;

    /* compiled from: RpcKotlinServiceFactory.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RpcKotlinServiceFactory getInstances() {
            return (RpcKotlinServiceFactory) RpcKotlinServiceFactory.instances$delegate.getValue();
        }
    }

    static {
        Lazy<RpcKotlinServiceFactory> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<RpcKotlinServiceFactory>() { // from class: com.join.kotlin.http.RpcKotlinServiceFactory$Companion$instances$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RpcKotlinServiceFactory invoke() {
                return new RpcKotlinServiceFactory(null);
            }
        });
        instances$delegate = lazy;
    }

    private RpcKotlinServiceFactory() {
    }

    public /* synthetic */ RpcKotlinServiceFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final RpcJavaApiForKotlin getJavaAccountAPI() {
        if (this.javaAccountApi == null) {
            RetrofitFactory a5 = RetrofitFactory.f55221c.a();
            String accountV2 = h.E;
            Intrinsics.checkNotNullExpressionValue(accountV2, "accountV2");
            this.javaAccountApi = (RpcJavaApiForKotlin) a5.e(accountV2).create(RpcJavaApiForKotlin.class);
        }
        RpcJavaApiForKotlin rpcJavaApiForKotlin = this.javaAccountApi;
        Intrinsics.checkNotNull(rpcJavaApiForKotlin);
        return rpcJavaApiForKotlin;
    }

    @Nullable
    public final RpcJavaApiForKotlin getJavaAccountApi() {
        return this.javaAccountApi;
    }

    @Nullable
    public final RpcJavaApiForKotlin getJavaApi() {
        return this.javaApi;
    }

    @NotNull
    public final RpcJavaApiForKotlin getJavaRootAPI() {
        if (this.javaApi == null) {
            RetrofitFactory a5 = RetrofitFactory.f55221c.a();
            String gameUrl = h.A;
            Intrinsics.checkNotNullExpressionValue(gameUrl, "gameUrl");
            this.javaApi = (RpcJavaApiForKotlin) a5.e(gameUrl).create(RpcJavaApiForKotlin.class);
        }
        RpcJavaApiForKotlin rpcJavaApiForKotlin = this.javaApi;
        Intrinsics.checkNotNull(rpcJavaApiForKotlin);
        return rpcJavaApiForKotlin;
    }

    public final void setJavaAccountApi(@Nullable RpcJavaApiForKotlin rpcJavaApiForKotlin) {
        this.javaAccountApi = rpcJavaApiForKotlin;
    }

    public final void setJavaApi(@Nullable RpcJavaApiForKotlin rpcJavaApiForKotlin) {
        this.javaApi = rpcJavaApiForKotlin;
    }
}
