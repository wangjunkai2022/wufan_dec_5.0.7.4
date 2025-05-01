package com.psk.eventmodule.net.util;

import com.google.gson.JsonParseException;
import com.psk.eventmodule.net.modle.ResponseModel;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.conn.ConnectTimeoutException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import retrofit2.HttpException;
/* compiled from: ApiException.kt */
/* loaded from: classes5.dex */
public class ApiException extends RuntimeException {
    public static final int CODE_AUTH_INVALID = 401;
    public static final int CODE_JSON_PARSE_ERROR = 4010;
    public static final int CODE_NET_ERROR = 4000;
    public static final int CODE_SERVER_ERROR = 5000;
    public static final int CODE_TIMEOUT = 4080;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final Throwable cause;
    private final int error;
    @Nullable
    private final String message;

    /* compiled from: ApiException.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ApiException build(@NotNull Throwable e5) {
            Intrinsics.checkNotNullParameter(e5, "e");
            e5.printStackTrace();
            if (e5 instanceof HttpException) {
                return new ApiException(4000, "网络异常", null, 4, null);
            }
            if (e5 instanceof UnknownHostException) {
                return new ApiException(4000, "网络连接失败，请检查后再试", null, 4, null);
            }
            if (!(e5 instanceof ConnectTimeoutException) && !(e5 instanceof SocketTimeoutException)) {
                if (e5 instanceof IOException) {
                    return new ApiException(4000, "网络异常", null, 4, null);
                }
                if (!(e5 instanceof JsonParseException) && !(e5 instanceof JSONException)) {
                    return new ApiException(5000, "系统错误", null, 4, null);
                }
                return new ApiException(4010, "数据解析错误，请稍后再试", null, 4, null);
            }
            return new ApiException(4080, "请求超时，请稍后再试", null, 4, null);
        }
    }

    public /* synthetic */ ApiException(int i4, String str, Throwable th, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, str, (i5 & 4) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    public final int getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final <T> ResponseModel<T> toResponse() {
        return new ResponseModel<>();
    }

    public ApiException(int i4, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.error = i4;
        this.message = str;
        this.cause = th;
    }
}
