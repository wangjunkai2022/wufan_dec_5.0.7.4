package com.ss.android.socialbase.downloader.wv;

import io.netty.util.internal.StringUtil;
import m.a;
/* loaded from: classes5.dex */
public class wv {
    public static StringBuilder m(StringBuilder sb, String[] strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            vv(sb, strArr[i4]).append("=?");
            if (i4 < strArr.length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static StringBuilder vv(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder vv(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(".\"");
        sb.append(str2);
        sb.append('\"');
        return sb;
    }

    public static StringBuilder vv(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            sb.append('\"');
            sb.append(strArr[i4]);
            sb.append('\"');
            if (i4 < length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static String m(String str, String[] strArr, String[] strArr2) {
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
        sb.append(a.f71493g + str + '\"');
        sb.append(" (");
        vv(sb, strArr);
        sb.append(") VALUES (");
        vv(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static StringBuilder vv(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 < i4 - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static StringBuilder vv(StringBuilder sb, String str, String[] strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            vv(sb, str, strArr[i4]).append("=?");
            if (i4 < strArr.length - 1) {
                sb.append(StringUtil.COMMA);
            }
        }
        return sb;
    }

    public static String vv(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('\"');
        sb.append(str2);
        sb.append('\"');
        sb.append(" (");
        vv(sb, strArr);
        sb.append(") VALUES (");
        vv(sb, strArr.length);
        sb.append(')');
        return sb.toString();
    }

    public static String vv(String str, String[] strArr) {
        String str2 = a.f71493g + str + '\"';
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str2);
        if (strArr != null && strArr.length > 0) {
            sb.append(" WHERE ");
            vv(sb, str2, strArr);
        }
        return sb.toString();
    }

    public static String vv(String str, String[] strArr, String[] strArr2) {
        String str2 = a.f71493g + str + '\"';
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(str2);
        sb.append(" SET ");
        m(sb, strArr);
        if (strArr2 != null && strArr2.length > 0) {
            sb.append(" WHERE ");
            vv(sb, str2, strArr2);
        }
        return sb.toString();
    }
}
