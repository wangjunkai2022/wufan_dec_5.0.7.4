package com.join.kotlin.base.net;

import android.net.ParseException;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import retrofit2.HttpException;
/* compiled from: ExceptionHandle.kt */
/* loaded from: classes3.dex */
public final class ExceptionHandle {
    @NotNull
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    @NotNull
    public final AppException handleException(@Nullable Throwable th) {
        if (th != null) {
            if (th instanceof HttpException) {
                return new AppException(Error.NETWORK_ERROR, th);
            }
            if (th instanceof JsonParseException ? true : th instanceof JSONException ? true : th instanceof ParseException ? true : th instanceof MalformedJsonException) {
                return new AppException(Error.PARSE_ERROR, th);
            }
            if (th instanceof ConnectException) {
                return new AppException(Error.NETWORK_ERROR, th);
            }
            if (th instanceof SSLException) {
                return new AppException(Error.SSL_ERROR, th);
            }
            if (th instanceof ConnectTimeoutException) {
                return new AppException(Error.TIMEOUT_ERROR, th);
            }
            if (th instanceof SocketTimeoutException) {
                return new AppException(Error.TIMEOUT_ERROR, th);
            }
            if (th instanceof UnknownHostException) {
                return new AppException(Error.TIMEOUT_ERROR, th);
            }
            return th instanceof AppException ? (AppException) th : new AppException(Error.UNKNOWN, th);
        }
        return new AppException(Error.UNKNOWN, th);
    }
}
