package io.netty.handler.codec.http.cookie;
/* loaded from: classes6.dex */
public interface Cookie extends Comparable<Cookie> {
    public static final long UNDEFINED_MAX_AGE = Long.MIN_VALUE;

    String domain();

    boolean isHttpOnly();

    boolean isSecure();

    long maxAge();

    String name();

    String path();

    void setDomain(String str);

    void setHttpOnly(boolean z4);

    void setMaxAge(long j4);

    void setPath(String str);

    void setSecure(boolean z4);

    void setValue(String str);

    void setWrap(boolean z4);

    String value();

    boolean wrap();
}
