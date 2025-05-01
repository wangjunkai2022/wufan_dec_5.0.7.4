package com.join.kotlin.base.net;

import org.jetbrains.annotations.NotNull;
/* compiled from: Error.kt */
/* loaded from: classes3.dex */
public enum Error {
    UNKNOWN(1000, "请求失败，请稍后再试"),
    PARSE_ERROR(1001, "解析错误，请稍后再试"),
    NETWORK_ERROR(1002, "网络连接错误，请稍后重试"),
    SSL_ERROR(1004, "证书出错，请稍后再试"),
    TIMEOUT_ERROR(1006, "网络连接超时，请稍后重试");
    
    private final int code;
    @NotNull
    private final String err;

    Error(int i4, String str) {
        this.code = i4;
        this.err = str;
    }

    public final int getKey() {
        return this.code;
    }

    @NotNull
    public final String getValue() {
        return this.err;
    }
}
