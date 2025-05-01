package com.tencent.cos.utils;

import kotlin.text.Typography;
import net.lingala.zip4j.util.e;
import org.apache.http.conn.ssl.TokenParser;
/* loaded from: classes6.dex */
public class FolderUtils {
    private static char[] InValidChar = {'/', '?', '*', ':', '|', TokenParser.ESCAPE, Typography.less, Typography.greater, '\"'};
    private static final String[] RESERVERED = {"con", "aux", "nul", "prn", "com0", "com1", "com2", "com3", "com4", "com5", "com6", "com7", "com8", "com9", "lpt0", "lpt1", "lpt2", "lpt3", "lpt4", "lpt5", "lpt6", "lpt7", "lpt8", "lpt9"};

    private static boolean hasInValidChar(String str) {
        int length = InValidChar.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.indexOf(InValidChar[i4]) != -1) {
                return true;
            }
        }
        return false;
    }

    private static boolean isReservedStr(String str) {
        int length = RESERVERED.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (RESERVERED[i4].contentEquals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidFolder(String str) {
        return (hasInValidChar(str) || isReservedStr(str)) ? false : true;
    }

    public static boolean isValidPath(String str) {
        if (str == null) {
            return false;
        }
        boolean endsWith = str.endsWith(e.F0);
        String[] split = str.split(e.F0);
        int length = split.length;
        if (length == 0 && str.equalsIgnoreCase(e.F0)) {
            return true;
        }
        if (length == 0 && endsWith) {
            return isValidFolder(str);
        }
        if (!endsWith || isValidFolder(split[length - 1])) {
            for (int i4 = 0; i4 < length - 1; i4++) {
                if (!("".equals(split[i4]) && i4 == 0) && (("".equals(split[i4]) && i4 > 0) || !isValidFolder(split[i4]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
