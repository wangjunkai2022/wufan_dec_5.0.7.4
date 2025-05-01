package com.vuaukou.vco.hykiiuy;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.lang.reflect.Method;
/* loaded from: classes8.dex */
public class MyApplication extends Application {
    public static final String VER = "7.5.6_706";
    public static String TAG = a.auu.a.c("ORcVFREWFw==");
    public static String strAppName = a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaKBgyFT4JHQYABwwhCw==");

    /* renamed from: a  reason: collision with root package name */
    private static String f64834a = a.auu.a.c("Kx0AFwAQEREWAwwVEA0RVQ==");

    /* renamed from: b  reason: collision with root package name */
    private static String f64835b = a.auu.a.c("PhcbEwgXADw6BxIIBwYmOkU=");

    /* renamed from: c  reason: collision with root package name */
    private static String f64836c = a.auu.a.c("PQ0RCQ0sCScIHRE+Qg==");

    /* renamed from: d  reason: collision with root package name */
    private static Context f64837d = null;
    private static Application runApp = null;
    private static Application newApp = null;
    public static boolean mOfficial = true;
    public static boolean mNeedBugrpt = false;
    public static boolean mLoadShell = false;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f64838e = false;

    /* renamed from: f  reason: collision with root package name */
    private static int f64839f = 0;

    private static Application a(Context context) {
        try {
            if (newApp != null || strAppName.compareTo("") == 0) {
                return newApp;
            }
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader == null) {
                return newApp;
            }
            Class<?> loadClass = classLoader.loadClass(strAppName);
            if (loadClass != null) {
                newApp = (Application) loadClass.newInstance();
            }
            return newApp;
        } catch (Exception e5) {
            e5.toString();
            return newApp;
        }
    }

    private static boolean a() {
        boolean contains = f64836c.contains(a.auu.a.c("fw=="));
        new StringBuilder(a.auu.a.c("FQsRAAUwCiARBgoNIA0rCRgpAAYLLQ0pRQMgDSsJGCkABgstDTgMDBoRKwFO")).append(contains).append(a.auu.a.c("bggnDQQfCQ0LAF8=")).append(f64839f);
        return f64839f == 2 && contains;
    }

    public static native boolean g();

    public static Context getAppCtx() {
        return f64837d;
    }

    public static String getVersion() {
        return TAG + a.auu.a.c("eUtBS1csUn5T");
    }

    public static native boolean l(Application application);

    public static void loadLib(Context context, String str) {
        o.a(context, str);
    }

    public static native void n0110();

    public static native void n01101(char c5);

    public static native void n011011(char c5, char c6);

    public static native void n0110111(char c5, char c6, char c7);

    public static native void n01101111(char c5, char c6, char c7, char c8);

    public static native void n0110111112(char c5, char c6, char c7, char c8, char c9, double d5);

    public static native void n01101112(char c5, char c6, char c7, double d5);

    public static native void n0110113(char c5, char c6, Object obj);

    public static native void n011011311(char c5, char c6, Object obj, char c7, char c8);

    public static native void n011011313(char c5, char c6, Object obj, char c7, Object obj2);

    public static native void n0110113311(char c5, char c6, Object obj, Object obj2, char c7, char c8);

    public static native void n01101133113(char c5, char c6, Object obj, Object obj2, char c7, char c8, Object obj3);

    public static native void n011012(char c5, double d5);

    public static native void n011013(char c5, Object obj);

    public static native void n0110133(char c5, Object obj, Object obj2);

    public static native void n01101333(char c5, Object obj, Object obj2, Object obj3);

    public static native void n01102(double d5);

    public static native void n011021111(double d5, char c5, char c6, char c7, char c8);

    public static native void n0110221(double d5, double d6, char c5);

    public static native void n01102311(double d5, Object obj, char c5, char c6);

    public static native void n01103(Object obj);

    public static native void n011031(Object obj, char c5);

    public static native void n0110311(Object obj, char c5, char c6);

    public static native void n01103111(Object obj, char c5, char c6, char c7);

    public static native void n011031111(Object obj, char c5, char c6, char c7, char c8);

    public static native void n0110311111(Object obj, char c5, char c6, char c7, char c8, char c9);

    public static native void n01103131(Object obj, char c5, Object obj2, char c6);

    public static native void n011031311(Object obj, char c5, Object obj2, char c6, char c7);

    public static native void n011031333333313(Object obj, char c5, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, char c6, Object obj9);

    public static native void n011032(Object obj, double d5);

    public static native void n011033(Object obj, Object obj2);

    public static native void n011033111(Object obj, Object obj2, char c5, char c6, char c7);

    public static native void n0110333(Object obj, Object obj2, Object obj3);

    public static native void n01103332(Object obj, Object obj2, Object obj3, double d5);

    public static native char n0111();

    public static native char n01111(char c5);

    public static native char n011111(char c5, char c6);

    public static native char n0111111(char c5, char c6, char c7);

    public static native char n01111111(char c5, char c6, char c7, char c8);

    public static native char n011111211311(char c5, char c6, double d5, char c7, char c8, Object obj, char c9, char c10);

    public static native char n01111121311(char c5, char c6, double d5, char c7, Object obj, char c8, char c9);

    public static native char n011111311(char c5, char c6, Object obj, char c7, char c8);

    public static native char n011111311311(char c5, char c6, Object obj, char c7, char c8, Object obj2, char c9, char c10);

    public static native char n0111121(char c5, double d5, char c6);

    public static native char n01111211(char c5, double d5, char c6, char c7);

    public static native char n0111121111(char c5, double d5, char c6, char c7, char c8, char c9);

    public static native char n01111212111(char c5, double d5, char c6, double d6, char c7, char c8, char c9);

    public static native char n011112122(char c5, double d5, char c6, double d6, double d7);

    public static native char n011113(char c5, Object obj);

    public static native char n01111311(char c5, Object obj, char c6, char c7);

    public static native char n0111133(char c5, Object obj, Object obj2);

    public static native char n01111333(char c5, Object obj, Object obj2, Object obj3);

    public static native char n01112(double d5);

    public static native char n011121(double d5, char c5);

    public static native char n011123(double d5, Object obj);

    public static native char n01113(Object obj);

    public static native char n011131(Object obj, char c5);

    public static native char n0111311(Object obj, char c5, char c6);

    public static native char n01113121(Object obj, char c5, double d5, char c6);

    public static native char n011133(Object obj, Object obj2);

    public static native char n0111331(Object obj, Object obj2, char c5);

    public static native char n0111331111(Object obj, Object obj2, char c5, char c6, char c7, char c8);

    public static native char n01113311111(Object obj, Object obj2, char c5, char c6, char c7, char c8, char c9);

    public static native char n0111332(Object obj, Object obj2, double d5);

    public static native char n01113331(Object obj, Object obj2, Object obj3, char c5);

    public static native double n0112();

    public static native double n01121(char c5);

    public static native double n0112121(char c5, double d5, char c6);

    public static native double n01121233(char c5, double d5, Object obj, Object obj2);

    public static native double n011213112(char c5, Object obj, char c6, char c7, double d5);

    public static native double n011213222(char c5, Object obj, double d5, double d6, double d7);

    public static native double n01122(double d5);

    public static native double n01122131(double d5, char c5, Object obj, char c6);

    public static native double n0112232(double d5, Object obj, double d6);

    public static native double n0112233(double d5, Object obj, Object obj2);

    public static native double n01123(Object obj);

    public static native double n01123331(Object obj, Object obj2, Object obj3, char c5);

    public static native Object n0113();

    public static native Object n01131(char c5);

    public static native Object n011311(char c5, char c6);

    public static native Object n0113111(char c5, char c6, char c7);

    public static native Object n01131211(char c5, double d5, char c6, char c7);

    public static native Object n0113123(char c5, double d5, Object obj);

    public static native Object n011313(char c5, Object obj);

    public static native Object n01131311(char c5, Object obj, char c6, char c7);

    public static native Object n01131333(char c5, Object obj, Object obj2, Object obj3);

    public static native Object n011321(double d5, char c5);

    public static native Object n011322(double d5, double d6);

    public static native Object n01133(Object obj);

    public static native Object n0113311(Object obj, char c5, char c6);

    public static native Object n0113311131(Object obj, char c5, char c6, char c7, Object obj2, char c8);

    public static native Object n011332(Object obj, double d5);

    public static native Object n01133211(Object obj, double d5, char c5, char c6);

    public static native Object n0113323(Object obj, double d5, Object obj2);

    public static native Object n011333(Object obj, Object obj2);

    public static native Object n0113331(Object obj, Object obj2, char c5);

    public static native Object n0113333(Object obj, Object obj2, Object obj3);

    public static native Object n011333332113(Object obj, Object obj2, Object obj3, Object obj4, double d5, char c5, char c6, Object obj5);

    public static boolean needExtractSo(Context context) {
        boolean contains = f64834a.contains(a.auu.a.c("fw=="));
        new StringBuilder(a.auu.a.c("FQsRAAU2HToXFQYVIAoTRRYrBBYBCx0ABAIHXw==")).append(String.valueOf(contains));
        return contains;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        Method method;
        super.attachBaseContext(context);
        String packageName = context.getPackageName();
        String c5 = a.auu.a.c("PREBBw==");
        if (c5.length() >= 10) {
            com.vuaukou.vco.hykiiuy.plugin.b.a(new Signature(c5), packageName);
        }
        f64837d = context;
        f64838e = f64835b.contains(a.auu.a.c("fw=="));
        f64839f++;
        if (a()) {
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        new StringBuilder(a.auu.a.c("FQQAEQAQDQwEBwAiHAs6AAwRPFMHKwIdC01TEysXBwwOHV8=")).append(getVersion()).append(a.auu.a.c("bggkFw4FDCoABjYWGhEtDU4=")).append(f64838e);
        if (newApp == null) {
            if (!mLoadShell && needExtractSo(context)) {
                com.vuaukou.vco.hykiiuy.plugin.f.a(context);
            }
            if (MyJni.a(context)) {
                mNeedBugrpt = true;
                String version = getVersion();
                boolean z4 = a.f64842b;
                try {
                    Class<?> cls = Class.forName(a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaEBIWF2AwBwATIBE8BAAABgo="));
                    Object newInstance = cls.getConstructor(Context.class).newInstance(context);
                    cls.getMethod(a.auu.a.c("PQAAMBIWFxoEEw=="), String.class).invoke(newInstance, version);
                    if (z4 && (method = cls.getMethod(a.auu.a.c("PQAAIwgfESsXIwoTFxY="), String[].class)) != null) {
                        method.invoke(newInstance, new String[]{a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxw="), a.auu.a.c("IgwWExQcECM="), a.auu.a.c("IgwWCwQUEC8XEEsSHA=="), a.auu.a.c("IgwWAQQLAycdWhYO"), a.auu.a.c("JgwaEVs=")});
                    }
                    Class<?> cls2 = Class.forName(a.auu.a.c("LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaJhMSFiYtFQsFHwA8"));
                    cls2.getMethod(a.auu.a.c("JwsdEQ=="), Context.class, newInstance.getClass()).invoke(cls2, context, newInstance);
                } catch (Exception e5) {
                    e5.toString();
                }
            }
            if (!mLoadShell) {
                String c6 = a.auu.a.c("OBAbEAw=");
                if (MyJni.a()) {
                    c6 = a.auu.a.c("OBAbEAxeHXZT");
                }
                try {
                    o.a(context, c6);
                } catch (Exception e6) {
                    new StringBuilder(a.auu.a.c("FQQAEQAQDQwEBwAiHAs6AAwRPFMJIQQQFg5TADYGERUVGgogSQ==")).append(e6.toString());
                    System.loadLibrary(c6);
                }
            }
            MyJni.load(this, packageName);
            new StringBuilder(a.auu.a.c("FQkbBAUuRToMGQBb")).append(String.valueOf(System.currentTimeMillis() - valueOf.longValue()));
            newApp = a(context);
            MyJni.ra(context, newApp);
        }
        NEDialog.showProbation(a.auu.a.c("IAoANRMcBy8RHQoP"));
        if (runApp == null) {
            runApp = this;
        }
        if (!f64838e) {
            MyJni.cp();
        }
        new StringBuilder(a.auu.a.c("FQQAEQAQDQwEBwAiHAs6AAwRPFMAIAFYRRUaCCtf")).append(String.valueOf(System.currentTimeMillis() - valueOf.longValue()));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createPackageContext(String str, int i4) {
        if (TextUtils.isEmpty(strAppName) || !f64838e) {
            return super.createPackageContext(str, i4);
        }
        new StringBuilder(a.auu.a.c("FQYGAAAHAB4EFw4AFAANChoRBAsRE0UEBAIYBCkAOgQMFl8=")).append(str).append(a.auu.a.c("bgMYBAYAXw==")).append(i4);
        MyJni.rp(runApp.getBaseContext(), newApp);
        return str.equals(newApp.getPackageName()) ? newApp : super.createPackageContext(str, i4);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        return (TextUtils.isEmpty(strAppName) || !f64838e) ? super.getPackageName() : "";
    }

    public native void n1110();

    public native void n11101(char c5);

    public native void n111011(char c5, char c6);

    public native void n1110113(char c5, char c6, Object obj);

    public native void n111012(char c5, double d5);

    public native void n111013(char c5, Object obj);

    public native void n1110132(char c5, Object obj, double d5);

    public native void n1110133(char c5, Object obj, Object obj2);

    public native void n11102(double d5);

    public native void n111021(double d5, char c5);

    public native void n11103(Object obj);

    public native void n1110313(Object obj, char c5, Object obj2);

    public native void n111032(Object obj, double d5);

    public native void n1110321(Object obj, double d5, char c5);

    public native void n1110322(Object obj, double d5, double d6);

    public native void n111032211(Object obj, double d5, double d6, char c5, char c6);

    public native void n1110323(Object obj, double d5, Object obj2);

    public native void n111033(Object obj, Object obj2);

    public native void n1110333(Object obj, Object obj2, Object obj3);

    public native char n1111();

    public native char n111111(char c5, char c6);

    public native char n11112(double d5);

    public native char n11113(Object obj);

    public native char n111132(Object obj, double d5);

    public native char n111133(Object obj, Object obj2);

    public native char n1111333(Object obj, Object obj2, Object obj3);

    public native double n1112();

    public native double n111212(char c5, double d5);

    public native double n11122(double d5);

    public native double n111232(Object obj, double d5);

    public native Object n1113();

    public native Object n11131(char c5);

    public native Object n111311(char c5, char c6);

    public native Object n111311113(char c5, char c6, char c7, char c8, Object obj);

    public native Object n11131113(char c5, char c6, char c7, Object obj);

    public native Object n111313(char c5, Object obj);

    public native Object n11133(Object obj);

    public native Object n1113311(Object obj, char c5, char c6);

    public native Object n111332(Object obj, double d5);

    public native Object n111333(Object obj, Object obj2);

    public native Object n1113333(Object obj, Object obj2, Object obj3);

    @Override // android.app.Application
    public void onCreate() {
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate();
        if (a()) {
            return;
        }
        if (runApp != null) {
            MyJni.run(runApp.getBaseContext(), newApp);
        }
        if (newApp != null) {
            MyJni.ip(newApp);
            newApp.onCreate();
        } else {
            MyJni.ip(runApp);
            new StringBuilder(a.auu.a.c("FRcBCzxTKDckBBUNGgYvER0KD10LKxI1FRFTDD1FGhANH0k8EBokEQNFJxZU")).append(runApp);
        }
        new StringBuilder(a.auu.a.c("FRcBCzxTEScIEV8=")).append(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        f64837d = getApplicationContext();
        new StringBuilder(a.auu.a.c("FQoaJhMWBDoAKUUEHQFiRQAMDBZf")).append(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
