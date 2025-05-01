package com.psk.eventmodule.net.api;

import com.psk.eventmodule.net.modle.ResponseModel;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
/* compiled from: EventApi.kt */
/* loaded from: classes5.dex */
public interface EventApi {
    @POST("/byte_data/batch")
    @Nullable
    Object sendPoint(@Body @NotNull RequestBody requestBody, @NotNull Continuation<? super ResponseModel<?>> continuation);
}
