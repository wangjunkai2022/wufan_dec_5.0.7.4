package com.umeng.analytics.pro;
/* compiled from: Logger.java */
/* loaded from: classes6.dex */
public class bl {

    /* renamed from: a  reason: collision with root package name */
    private static final String f63438a = "OpenId";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f63439b;

    public static void a(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDebug:");
        sb.append(z4);
        f63439b = z4;
    }

    public static void b(String str, Object... objArr) {
        if (f63439b) {
            e(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        if (f63439b) {
            e(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        if (f63439b) {
            e(str, objArr);
        }
    }

    private static String e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        if (str == null) {
            str = "-";
        }
        int i4 = 0;
        objArr2[0] = str;
        sb.append(String.format("[%s] ", objArr2));
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= objArr.length) {
                    break;
                }
                sb.append(a(objArr[i4], objArr[i5]));
                if (i5 < length - 1) {
                    sb.append(",");
                }
                i4 = i5 + 1;
            }
            if (i4 == objArr.length - 1) {
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    public static void a(String str, Object... objArr) {
        if (f63439b) {
            e(str, objArr);
        }
    }

    private static String a(Object obj, Object obj2) {
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }
}
