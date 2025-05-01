package com.kotlin.base.data.net;

import com.join.mgps.rpc.h;
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
/* compiled from: RetrofitFactory.kt */
/* loaded from: classes5.dex */
public final class RetrofitFactory {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final a f55221c = new a(null);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy<RetrofitFactory> f55222d;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Interceptor f55223a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Retrofit f55224b;

    /* compiled from: RetrofitFactory.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RetrofitFactory a() {
            return (RetrofitFactory) RetrofitFactory.f55222d.getValue();
        }
    }

    static {
        Lazy<RetrofitFactory> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<RetrofitFactory>() { // from class: com.kotlin.base.data.net.RetrofitFactory$Companion$instance$2
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: a */
            public final RetrofitFactory invoke() {
                return new RetrofitFactory(null);
            }
        });
        f55222d = lazy;
    }

    private RetrofitFactory() {
        this.f55223a = new Interceptor() { // from class: com.kotlin.base.data.net.a
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response b5;
                b5 = RetrofitFactory.b(chain);
                return b5;
            }
        };
        Retrofit build = new Retrofit.Builder().baseUrl(h.f54053i).addConverterFactory(retrofit2.converter.gson.a.a()).addCallAdapterFactory(g.a()).client(f()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .b…t())\n            .build()");
        this.f55224b = build;
    }

    public /* synthetic */ RetrofitFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response b(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().addHeader("Content_Type", HttpHeaders.Values.APPLICATION_JSON).addHeader("charset", "UTF-8").build());
    }

    private final OkHttpClient f() {
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(new com.join.mgps.rpc.retrofit2.a());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient build = addInterceptor.connectTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .a…NDS)\n            .build()");
        return build;
    }

    private final Interceptor g() {
        return new com.join.mgps.rpc.retrofit2.a();
    }

    public final <T> T d(@NotNull Class<T> service) {
        Intrinsics.checkNotNullParameter(service, "service");
        return (T) this.f55224b.create(service);
    }

    @NotNull
    public final Retrofit e(@NotNull String basUrl) {
        Intrinsics.checkNotNullParameter(basUrl, "basUrl");
        Retrofit build = new Retrofit.Builder().baseUrl(basUrl).addConverterFactory(retrofit2.converter.gson.a.a()).addCallAdapterFactory(g.a()).client(f()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .b…t())\n            .build()");
        return build;
    }
}
