package io.netty.handler.codec.http.cookie;

import io.netty.handler.codec.DateFormatter;
import io.netty.util.internal.ObjectUtil;
import java.util.Date;
/* loaded from: classes6.dex */
public final class ClientCookieDecoder extends CookieDecoder {
    public static final ClientCookieDecoder STRICT = new ClientCookieDecoder(true);
    public static final ClientCookieDecoder LAX = new ClientCookieDecoder(false);

    /* loaded from: classes6.dex */
    private static class CookieBuilder {
        private final DefaultCookie cookie;
        private String domain;
        private int expiresEnd;
        private int expiresStart;
        private final String header;
        private boolean httpOnly;
        private long maxAge = Long.MIN_VALUE;
        private String path;
        private boolean secure;

        CookieBuilder(DefaultCookie defaultCookie, String str) {
            this.cookie = defaultCookie;
            this.header = str;
        }

        private String computeValue(int i4, int i5) {
            if (isValueDefined(i4, i5)) {
                return this.header.substring(i4, i5);
            }
            return null;
        }

        private static boolean isValueDefined(int i4, int i5) {
            return (i4 == -1 || i4 == i5) ? false : true;
        }

        private long mergeMaxAgeAndExpires() {
            Date parseHttpDate;
            long j4 = this.maxAge;
            if (j4 != Long.MIN_VALUE) {
                return j4;
            }
            if (!isValueDefined(this.expiresStart, this.expiresEnd) || (parseHttpDate = DateFormatter.parseHttpDate(this.header, this.expiresStart, this.expiresEnd)) == null) {
                return Long.MIN_VALUE;
            }
            long time = parseHttpDate.getTime() - System.currentTimeMillis();
            return (time / 1000) + (time % 1000 != 0 ? 1 : 0);
        }

        private void parse4(int i4, int i5, int i6) {
            if (this.header.regionMatches(true, i4, CookieHeaderNames.PATH, 0, 4)) {
                this.path = computeValue(i5, i6);
            }
        }

        private void parse6(int i4, int i5, int i6) {
            if (this.header.regionMatches(true, i4, CookieHeaderNames.DOMAIN, 0, 5)) {
                this.domain = computeValue(i5, i6);
            } else if (this.header.regionMatches(true, i4, CookieHeaderNames.SECURE, 0, 5)) {
                this.secure = true;
            }
        }

        private void parse7(int i4, int i5, int i6) {
            if (this.header.regionMatches(true, i4, "Expires", 0, 7)) {
                this.expiresStart = i5;
                this.expiresEnd = i6;
            } else if (this.header.regionMatches(true, i4, CookieHeaderNames.MAX_AGE, 0, 7)) {
                setMaxAge(computeValue(i5, i6));
            }
        }

        private void parse8(int i4) {
            if (this.header.regionMatches(true, i4, CookieHeaderNames.HTTPONLY, 0, 8)) {
                this.httpOnly = true;
            }
        }

        private void setMaxAge(String str) {
            try {
                this.maxAge = Math.max(Long.parseLong(str), 0L);
            } catch (NumberFormatException unused) {
            }
        }

        void appendAttribute(int i4, int i5, int i6, int i7) {
            int i8 = i5 - i4;
            if (i8 == 4) {
                parse4(i4, i6, i7);
            } else if (i8 == 6) {
                parse6(i4, i6, i7);
            } else if (i8 == 7) {
                parse7(i4, i6, i7);
            } else if (i8 == 8) {
                parse8(i4);
            }
        }

        Cookie cookie() {
            this.cookie.setDomain(this.domain);
            this.cookie.setPath(this.path);
            this.cookie.setMaxAge(mergeMaxAgeAndExpires());
            this.cookie.setSecure(this.secure);
            this.cookie.setHttpOnly(this.httpOnly);
            return this.cookie;
        }
    }

    private ClientCookieDecoder(boolean z4) {
        super(z4);
    }

    public Cookie decode(String str) {
        int i4;
        int i5;
        int i6;
        int i7;
        int length = ((String) ObjectUtil.checkNotNull(str, "header")).length();
        if (length == 0) {
            return null;
        }
        CookieBuilder cookieBuilder = null;
        int i8 = 0;
        while (i8 != length) {
            char charAt = str.charAt(i8);
            if (charAt == ',') {
                break;
            } else if (charAt == '\t' || charAt == '\n' || charAt == 11 || charAt == '\f' || charAt == '\r' || charAt == ' ' || charAt == ';') {
                i8++;
            } else {
                int i9 = i8;
                while (true) {
                    char charAt2 = str.charAt(i9);
                    if (charAt2 != ';') {
                        if (charAt2 != '=') {
                            i9++;
                            if (i9 == length) {
                                i4 = length;
                                i5 = i9;
                                break;
                            }
                        } else {
                            i6 = i9 + 1;
                            if (i6 == length) {
                                i4 = i9;
                                i5 = i6;
                                i7 = 0;
                                i6 = 0;
                            } else {
                                int indexOf = str.indexOf(59, i6);
                                i5 = indexOf > 0 ? indexOf : length;
                                i4 = i9;
                                i7 = i5;
                            }
                        }
                    } else {
                        i4 = i9;
                        i5 = i4;
                        break;
                    }
                }
                i7 = -1;
                i6 = -1;
                if (i7 > 0 && str.charAt(i7 - 1) == ',') {
                    i7--;
                }
                int i10 = i7;
                if (cookieBuilder == null) {
                    DefaultCookie initCookie = initCookie(str, i8, i4, i6, i10);
                    if (initCookie == null) {
                        return null;
                    }
                    cookieBuilder = new CookieBuilder(initCookie, str);
                } else {
                    cookieBuilder.appendAttribute(i8, i4, i6, i10);
                }
                i8 = i5;
            }
        }
        if (cookieBuilder != null) {
            return cookieBuilder.cookie();
        }
        return null;
    }
}
