package com.join.mgps.Util;
/* compiled from: CharUtil.java */
/* loaded from: classes3.dex */
public class n {
    private static boolean a(char c5) {
        if (c5 != ' ' && c5 != 133 && c5 != 5760) {
            if (c5 == 8199) {
                return false;
            }
            if (c5 != 8287 && c5 != 12288 && c5 != 8232 && c5 != 8233) {
                switch (c5) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return c5 >= 8192 && c5 <= 8202;
                }
            }
        }
        return true;
    }

    public static CharSequence b(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        while (length > 0 && a(charSequence.charAt(length))) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }
}
