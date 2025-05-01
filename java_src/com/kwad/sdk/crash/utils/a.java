package com.kwad.sdk.crash.utils;

import java.nio.charset.Charset;
/* loaded from: classes5.dex */
public final class a {
    public static final Charset US_ASCII = Charset.forName(com.alipay.security.mobile.module.commonutils.crypto.a.f4994b);
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
