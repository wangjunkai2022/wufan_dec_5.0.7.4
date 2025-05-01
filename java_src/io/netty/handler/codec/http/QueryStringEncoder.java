package io.netty.handler.codec.http;

import com.android.dx.io.Opcodes;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import kotlin.text.Typography;
import net.lingala.zip4j.crypto.PBKDF2.a;
/* loaded from: classes6.dex */
public class QueryStringEncoder {
    private static final char[] CHAR_MAP = a.f71726a.toCharArray();
    private static final byte WRITE_UTF_UNKNOWN = 63;
    private final Charset charset;
    private boolean hasParams;
    private final StringBuilder uriBuilder;

    public QueryStringEncoder(String str) {
        this(str, HttpConstants.DEFAULT_CHARSET);
    }

    private void appendEncoded(int i4) {
        StringBuilder sb = this.uriBuilder;
        sb.append('%');
        sb.append(forDigit(i4 >> 4));
        sb.append(forDigit(i4));
    }

    private static boolean dontNeedEncoding(char c5) {
        return (c5 >= 'a' && c5 <= 'z') || (c5 >= 'A' && c5 <= 'Z') || ((c5 >= '0' && c5 <= '9') || c5 == '-' || c5 == '_' || c5 == '.' || c5 == '*');
    }

    private void encodeComponent(CharSequence charSequence) {
        if (this.charset == null) {
            encodeUtf8Component(charSequence);
        } else {
            encodeNonUtf8Component(charSequence);
        }
    }

    private void encodeNonUtf8Component(CharSequence charSequence) {
        int length = charSequence.length();
        char[] cArr = null;
        int i4 = 0;
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            if (dontNeedEncoding(charAt)) {
                this.uriBuilder.append(charAt);
                i4++;
            } else {
                if (cArr == null) {
                    cArr = new char[charSequence.length() - i4];
                }
                int i5 = 0;
                do {
                    cArr[i5] = charAt;
                    i5++;
                    i4++;
                    if (i4 >= charSequence.length()) {
                        break;
                    }
                    charAt = charSequence.charAt(i4);
                } while (!dontNeedEncoding(charAt));
                for (byte b5 : new String(cArr, 0, i5).getBytes(this.charset)) {
                    appendEncoded(b5);
                }
            }
        }
    }

    private void encodeUtf8Component(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!dontNeedEncoding(charSequence.charAt(i4))) {
                encodeUtf8Component(charSequence, i4, length);
                return;
            }
        }
        this.uriBuilder.append(charSequence);
    }

    private void encodeUtf8ComponentSlow(CharSequence charSequence, int i4, int i5) {
        while (i4 < i5) {
            char charAt = charSequence.charAt(i4);
            if (charAt < 128) {
                if (dontNeedEncoding(charAt)) {
                    this.uriBuilder.append(charAt);
                } else {
                    appendEncoded(charAt);
                }
            } else if (charAt < 2048) {
                appendEncoded((charAt >> 6) | 192);
                appendEncoded((charAt & '?') | 128);
            } else if (StringUtil.isSurrogate(charAt)) {
                if (!Character.isHighSurrogate(charAt)) {
                    appendEncoded(63);
                } else {
                    i4++;
                    if (i4 == charSequence.length()) {
                        appendEncoded(63);
                        return;
                    }
                    writeUtf8Surrogate(charAt, charSequence.charAt(i4));
                }
            } else {
                appendEncoded((charAt >> '\f') | Opcodes.SHL_INT_LIT8);
                appendEncoded(((charAt >> 6) & 63) | 128);
                appendEncoded((charAt & '?') | 128);
            }
            i4++;
        }
    }

    private static char forDigit(int i4) {
        return CHAR_MAP[i4 & 15];
    }

    private void writeUtf8Surrogate(char c5, char c6) {
        if (!Character.isLowSurrogate(c6)) {
            appendEncoded(63);
            if (Character.isHighSurrogate(c6)) {
                c6 = '?';
            }
            appendEncoded(c6);
            return;
        }
        int codePoint = Character.toCodePoint(c5, c6);
        appendEncoded((codePoint >> 18) | 240);
        appendEncoded(((codePoint >> 12) & 63) | 128);
        appendEncoded(((codePoint >> 6) & 63) | 128);
        appendEncoded((codePoint & 63) | 128);
    }

    public void addParam(String str, String str2) {
        ObjectUtil.checkNotNull(str, "name");
        if (this.hasParams) {
            this.uriBuilder.append(Typography.amp);
        } else {
            this.uriBuilder.append('?');
            this.hasParams = true;
        }
        encodeComponent(str);
        if (str2 != null) {
            this.uriBuilder.append('=');
            encodeComponent(str2);
        }
    }

    public String toString() {
        return this.uriBuilder.toString();
    }

    public URI toUri() throws URISyntaxException {
        return new URI(toString());
    }

    public QueryStringEncoder(String str, Charset charset) {
        ObjectUtil.checkNotNull(charset, "charset");
        this.uriBuilder = new StringBuilder(str);
        this.charset = CharsetUtil.UTF_8.equals(charset) ? null : charset;
    }

    private void encodeUtf8Component(CharSequence charSequence, int i4, int i5) {
        if (i4 > 0) {
            this.uriBuilder.append(charSequence, 0, i4);
        }
        encodeUtf8ComponentSlow(charSequence, i4, i5);
    }
}
