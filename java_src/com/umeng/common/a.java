package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.aw;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;
/* compiled from: EncryptHelper.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f64069a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f64070b = "umeng+";

    /* renamed from: c  reason: collision with root package name */
    private static final String f64071c = "ek__id";

    /* renamed from: d  reason: collision with root package name */
    private static final String f64072d = "ek_key";

    /* renamed from: e  reason: collision with root package name */
    private static String f64073e = "";

    /* renamed from: f  reason: collision with root package name */
    private static final String f64074f = aw.b().b(aw.f63383n);

    /* renamed from: g  reason: collision with root package name */
    private static String f64075g = "";

    /* renamed from: h  reason: collision with root package name */
    private static a f64076h;

    private a() {
    }

    public static a a() {
        if (f64076h == null) {
            synchronized (a.class) {
                if (f64076h == null) {
                    f64076h = new a();
                }
            }
        }
        return f64076h;
    }

    private String c(String str) {
        String str2 = "";
        try {
            String substring = str.substring(1, 9);
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < substring.length(); i4++) {
                char charAt = substring.charAt(i4);
                if (Character.isDigit(charAt)) {
                    if (Integer.parseInt(Character.toString(charAt)) == 0) {
                        sb.append(0);
                    } else {
                        sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                    }
                } else {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
            return str2 + new StringBuilder(str2).reverse().toString();
        } catch (Throwable unused) {
            return str2;
        }
    }

    public String b(String str) {
        String str2;
        String str3 = null;
        try {
            if (!TextUtils.isEmpty(f64069a)) {
                str = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f64069a.getBytes()));
            }
            return str;
        } catch (Exception unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            if (TextUtils.isEmpty(f64073e)) {
                return null;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                str2 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f64073e.getBytes()));
            } catch (Exception unused2) {
            }
            try {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                return str2;
            } catch (Exception unused3) {
                str3 = str2;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                try {
                    String str4 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f64075g.getBytes()));
                    try {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                        return str4;
                    } catch (Throwable unused4) {
                        str3 = str4;
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str3;
                    }
                } catch (Throwable unused5) {
                }
            }
        }
    }

    public void a(Context context) {
        try {
            if (TextUtils.isEmpty(f64069a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, f64071c);
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f64073e = c(multiProcessSP);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f64073e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64074f, 0);
                if (sharedPreferences != null) {
                    f64075g = sharedPreferences.getString(f64071c, null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f64075g);
                }
                f64069a = c(UMUtils.genId());
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f64069a);
            }
        } catch (Throwable unused) {
        }
    }

    public String a(String str) {
        try {
            return TextUtils.isEmpty(f64069a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f64069a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
