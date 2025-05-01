package com.join.kotlin.base.net;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AppException.kt */
/* loaded from: classes3.dex */
public final class AppException extends Exception {
    private int errCode;
    @Nullable
    private String errorLog;
    @NotNull
    private String errorMsg;
    @Nullable
    private Throwable throwable;

    public AppException(int i4, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        super(str);
        str = str == null ? "请求失败，请稍后再试" : str;
        this.errorMsg = str;
        this.errCode = i4;
        this.errorLog = str2 == null ? str : str2;
        this.throwable = th;
    }

    public final int getErrCode() {
        return this.errCode;
    }

    @Nullable
    public final String getErrorLog() {
        return this.errorLog;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final void setErrCode(int i4) {
        this.errCode = i4;
    }

    public final void setErrorLog(@Nullable String str) {
        this.errorLog = str;
    }

    public final void setErrorMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMsg = str;
    }

    public final void setThrowable(@Nullable Throwable th) {
        this.throwable = th;
    }

    public /* synthetic */ AppException(int i4, String str, String str2, Throwable th, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, str, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? null : th);
    }

    public AppException(@NotNull Error error, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.errCode = error.getKey();
        this.errorMsg = error.getValue();
        this.errorLog = th != null ? th.getMessage() : null;
        this.throwable = th;
    }
}
