package org.jboss.netty.util.internal;

import java.util.ArrayList;
import java.util.Formatter;
/* compiled from: StringUtil.java */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f72833a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f72834b = "";

    static {
        String str;
        try {
            str = new Formatter().format("%n", new Object[0]).toString();
        } catch (Exception unused) {
            str = "\n";
        }
        f72833a = str;
    }

    private i() {
    }

    public static String[] a(String str, char c5) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) == c5) {
                if (i4 == i5) {
                    arrayList.add("");
                } else {
                    arrayList.add(str.substring(i4, i5));
                }
                i4 = i5 + 1;
            }
        }
        if (i4 == 0) {
            arrayList.add(str);
        } else if (i4 != length) {
            arrayList.add(str.substring(i4, length));
        } else {
            for (int size = arrayList.size() - 1; size >= 0 && ((String) arrayList.get(size)).length() == 0; size--) {
                arrayList.remove(size);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String b(Object obj) {
        if (obj == null) {
            return null;
        }
        return c(obj.toString());
    }

    public static String c(String str) {
        boolean z4;
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        while (true) {
            if (length < 0) {
                z4 = false;
                break;
            } else if (Character.isISOControl(str.charAt(length))) {
                z4 = true;
                break;
            } else {
                length--;
            }
        }
        if (z4) {
            StringBuilder sb = new StringBuilder(str.length());
            int i4 = 0;
            while (i4 < str.length() && Character.isISOControl(str.charAt(i4))) {
                i4++;
            }
            boolean z5 = false;
            while (i4 < str.length()) {
                if (Character.isISOControl(str.charAt(i4))) {
                    z5 = true;
                } else {
                    if (z5) {
                        sb.append(' ');
                        z5 = false;
                    }
                    sb.append(str.charAt(i4));
                }
                i4++;
            }
            return sb.toString();
        }
        return str;
    }
}
