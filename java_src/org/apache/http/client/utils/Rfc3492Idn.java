package org.apache.http.client.utils;

import com.join.mgps.Util.h0;
import external.org.apache.commons.lang3.d;
import java.util.StringTokenizer;
import org.apache.http.annotation.Immutable;
@Immutable
/* loaded from: classes7.dex */
public class Rfc3492Idn implements Idn {
    private static final String ACE_PREFIX = "xn--";
    private static final int base = 36;
    private static final int damp = 700;
    private static final char delimiter = '-';
    private static final int initial_bias = 72;
    private static final int initial_n = 128;
    private static final int skew = 38;
    private static final int tmax = 26;
    private static final int tmin = 1;

    private int adapt(int i4, int i5, boolean z4) {
        int i6;
        if (z4) {
            i6 = i4 / 700;
        } else {
            i6 = i4 / 2;
        }
        int i7 = i6 + (i6 / i5);
        int i8 = 0;
        while (i7 > 455) {
            i7 /= 35;
            i8 += 36;
        }
        return i8 + ((i7 * 36) / (i7 + 38));
    }

    private int digit(char c5) {
        if (c5 < 'A' || c5 > 'Z') {
            if (c5 < 'a' || c5 > 'z') {
                if (c5 < '0' || c5 > '9') {
                    throw new IllegalArgumentException("illegal digit: " + c5);
                }
                return (c5 - '0') + 26;
            }
            return c5 - 'a';
        }
        return c5 - 'A';
    }

    protected String decode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int lastIndexOf = str.lastIndexOf(45);
        int i4 = 128;
        int i5 = 72;
        if (lastIndexOf != -1) {
            sb.append(str.subSequence(0, lastIndexOf));
            str = str.substring(lastIndexOf + 1);
        }
        int i6 = 0;
        while (str.length() > 0) {
            int i7 = 36;
            int i8 = i6;
            int i9 = 1;
            while (str.length() != 0) {
                char charAt = str.charAt(0);
                str = str.substring(1);
                int digit = digit(charAt);
                i8 += digit * i9;
                int i10 = i7 <= i5 + 1 ? 1 : i7 >= i5 + 26 ? 26 : i7 - i5;
                if (digit < i10) {
                    break;
                }
                i9 *= 36 - i10;
                i7 += 36;
            }
            i5 = adapt(i8 - i6, sb.length() + 1, i6 == 0);
            i4 += i8 / (sb.length() + 1);
            int length = i8 % (sb.length() + 1);
            sb.insert(length, (char) i4);
            i6 = length + 1;
        }
        return sb.toString();
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, h0.f27805a);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append(d.f68897a);
            }
            if (nextToken.startsWith(ACE_PREFIX)) {
                nextToken = decode(nextToken.substring(4));
            }
            sb.append(nextToken);
        }
        return sb.toString();
    }
}
