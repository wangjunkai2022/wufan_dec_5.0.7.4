package com.join.kotlin.network;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.GsonBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.join.kotlin.base.net.BaseNetworkApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.protobuf.a;
/* compiled from: NetworkApi.kt */
/* loaded from: classes3.dex */
public final class NetworkApi extends BaseNetworkApi {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Lazy<NetworkApi> INSTANCE$delegate;

    /* compiled from: NetworkApi.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkApi getINSTANCE() {
            return (NetworkApi) NetworkApi.INSTANCE$delegate.getValue();
        }
    }

    static {
        Lazy<NetworkApi> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<NetworkApi>() { // from class: com.join.kotlin.network.NetworkApi$Companion$INSTANCE$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NetworkApi invoke() {
                return new NetworkApi();
            }
        });
        INSTANCE$delegate = lazy;
    }

    @Override // com.join.kotlin.base.net.BaseNetworkApi
    @NotNull
    public OkHttpClient.Builder onSetHttpClientBuilder(@NotNull OkHttpClient.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder;
    }

    @Override // com.join.kotlin.base.net.BaseNetworkApi
    @NotNull
    public Retrofit.Builder onSetRetrofitBuilder(@NotNull Retrofit.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.addConverterFactory(a.b(ExtensionRegistryLite.newInstance()));
        builder.addConverterFactory(retrofit2.converter.gson.a.b(new GsonBuilder().create()));
        builder.addConverterFactory(retrofit2.converter.jackson.a.b(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false).setSerializationInclusion(JsonInclude.Include.NON_NULL)));
        return builder;
    }
}
