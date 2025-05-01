package com.join.kotlin.base.net;

import com.join.mgps.Util.d2;
import com.join.mgps.rpc.retrofit2.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
/* compiled from: BaseNetworkApi.kt */
/* loaded from: classes3.dex */
public abstract class BaseNetworkApi {
    private final OkHttpClient.Builder createOkHttpBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new a());
        OkHttpClient.Builder a5 = d2.a(builder);
        Intrinsics.checkNotNullExpressionValue(a5, "addStethoNetWork(builder)");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a5.connectTimeout(2L, timeUnit);
        a5.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit);
        return a5;
    }

    private final OkHttpClient getOkHttpClient() {
        OkHttpClient build = onSetHttpClientBuilder(createOkHttpBuilder()).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public final <T> T getApi(@NotNull Class<T> serviceClass, @NotNull String baseUrl) {
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl(baseUrl).client(getOkHttpClient());
        Intrinsics.checkNotNullExpressionValue(retrofitBuilder, "retrofitBuilder");
        return (T) onSetRetrofitBuilder(retrofitBuilder).build().create(serviceClass);
    }

    @NotNull
    public abstract OkHttpClient.Builder onSetHttpClientBuilder(@NotNull OkHttpClient.Builder builder);

    @NotNull
    public abstract Retrofit.Builder onSetRetrofitBuilder(@NotNull Retrofit.Builder builder);
}
