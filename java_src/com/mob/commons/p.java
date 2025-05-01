package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.ResHelper;
import java.io.File;
/* loaded from: classes5.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f56423a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f56424b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f56425c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f56426d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f56427e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f56428f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f56429g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f56430h;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f56431i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f56432j;

    /* renamed from: k  reason: collision with root package name */
    private static final String f56433k;

    static {
        String a5 = m.a("011a>bibdbdWjeFbi@a*cfdgBj");
        f56433k = a5;
        f56423a = a5 + ".mrlock";
        f56424b = a5 + m.a("007Jbjba2fe$biWa!cf");
        f56425c = a5 + m.a("0118bjchOe7biddJbe>dcbi8a;cf");
        f56426d = a5 + m.a("008TbjbacabfUe%biUa1cf");
        f56427e = a5 + m.a("008XbjbadgbfQeVbi:a7cf");
        f56428f = a5 + ".cl_lock";
        f56429g = a5 + ".gcf_lock";
        f56430h = a5 + ".mp_lock";
        f56431i = new Object();
        f56432j = new Object();
    }

    public static synchronized File a(String str) {
        File dataCacheFile;
        synchronized (p.class) {
            dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str, true);
        }
        return dataCacheFile;
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = f56425c;
            if (str.endsWith(str2)) {
                return str2;
            }
            String str3 = f56424b;
            if (str.endsWith(str3)) {
                return str3;
            }
            String str4 = f56426d;
            if (str.endsWith(str4)) {
                return str4;
            }
            String str5 = f56427e;
            if (str.endsWith(str5)) {
                return str5;
            }
            String str6 = f56428f;
            if (str.endsWith(str6)) {
                return str6;
            }
            String str7 = f56429g;
            if (str.endsWith(str7)) {
                return str7;
            }
        }
        return str;
    }

    public static boolean a(File file, o oVar) {
        return a(file, true, oVar);
    }

    public static boolean a(File file, boolean z4, o oVar) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            synchronized (b(absolutePath)) {
                FileLocker fileLocker = new FileLocker();
                fileLocker.setLockFile(absolutePath);
                if (fileLocker.lock(z4)) {
                    if (!oVar.a(fileLocker)) {
                        fileLocker.release();
                    }
                    return true;
                }
                return false;
            }
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return true;
        }
    }

    public static boolean a(String str, boolean z4, long j4, long j5, o oVar) {
        FileLocker fileLocker = new FileLocker();
        try {
            fileLocker.setLockFile(str);
            if (fileLocker.lock(z4, j4, j5)) {
                if (oVar.a(fileLocker)) {
                    return true;
                }
                fileLocker.release();
                return true;
            }
            return false;
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            fileLocker.release();
            return true;
        }
    }
}
