package com.psk.eventmodule.net.api;

import io.netty.handler.codec.http.HttpHeaders;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.g;
/* compiled from: RpcEventFactory.kt */
/* loaded from: classes5.dex */
public final class RpcEventFactory {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Lazy<RpcEventFactory> instance$delegate;
    @NotNull
    private String basUrl = "http://datainterface.5fun.com";
    @NotNull
    private Retrofit retrofit;

    /* compiled from: RpcEventFactory.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RpcEventFactory getInstance() {
            return (RpcEventFactory) RpcEventFactory.instance$delegate.getValue();
        }
    }

    static {
        Lazy<RpcEventFactory> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<RpcEventFactory>() { // from class: com.psk.eventmodule.net.api.RpcEventFactory$Companion$instance$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RpcEventFactory invoke() {
                return new RpcEventFactory();
            }
        });
        instance$delegate = lazy;
    }

    public RpcEventFactory() {
        Retrofit build = new Retrofit.Builder().baseUrl(this.basUrl).addConverterFactory(retrofit2.converter.gson.a.a()).addCallAdapterFactory(g.a()).client(initClient()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .b…t())\n            .build()");
        this.retrofit = build;
    }

    private final OkHttpClient initClient() {
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.psk.eventmodule.net.api.a
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response initClient$lambda$0;
                initClient$lambda$0 = RpcEventFactory.initClient$lambda$0(chain);
                return initClient$lambda$0;
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient build = addInterceptor.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n//            …NDS)\n            .build()");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response initClient$lambda$0(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader("Content-Type", HttpHeaders.Values.APPLICATION_JSON).addHeader("charset", "UTF-8").build());
    }

    public final <T> T create(@NotNull Class<T> service) {
        Intrinsics.checkNotNullParameter(service, "service");
        return (T) this.retrofit.create(service);
    }

    @NotNull
    public final String getBasUrl() {
        return this.basUrl;
    }

    public final void resetUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.basUrl = url;
        Retrofit build = this.retrofit.newBuilder().baseUrl(url).addConverterFactory(retrofit2.converter.gson.a.a()).addCallAdapterFactory(g.a()).client(initClient()).build();
        Intrinsics.checkNotNullExpressionValue(build, "retrofit.newBuilder().ba…t())\n            .build()");
        this.retrofit = build;
    }

    public final void setBasUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.basUrl = str;
    }
}
