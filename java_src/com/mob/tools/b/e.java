package com.mob.tools.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.mob.commons.CSCenter;
import com.mob.commons.a.l;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ReflectHelper;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    private static e f56672b;

    /* renamed from: a  reason: collision with root package name */
    private Context f56673a;

    /* renamed from: c  reason: collision with root package name */
    private Object f56674c;

    /* renamed from: d  reason: collision with root package name */
    private PackageManager f56675d;

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f56676e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f56677f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f56678g = new ConcurrentHashMap<>();

    private e(Context context) {
        this.f56673a = context;
    }

    public static e a(Context context) {
        if (f56672b == null) {
            synchronized (e.class) {
                if (f56672b == null) {
                    f56672b = new e(context);
                }
            }
        }
        return f56672b;
    }

    public ResolveInfo b(Intent intent, int i4) {
        if (com.mob.commons.d.b()) {
            return (ResolveInfo) ReflectHelper.invokeInstanceMethod(this.f56673a.getPackageManager(), l.a("015>ek-gIgjelOhXee@gEge3dj>ejeeejZj<fd"), new Object[]{intent, Integer.valueOf(i4)}, new Class[]{Intent.class, Integer.TYPE}, null);
        }
        return null;
    }

    public int c() {
        if (Build.VERSION.SDK_INT < 24 || !DH.SyncMtd.checkPermission(l.a("035efWedekelejedem)kgXekegejgjgjejel+f7emhkhjgegmeihmglhifhhjeifmgdgegdhj"))) {
            return -1;
        }
        if (CSCenter.getInstance().isPhoneStateDataEnable()) {
            if (this.f56674c == null) {
                this.f56674c = DH.SyncMtd.getSystemServiceSafe(l.a("005kiIelEfg"));
            }
            return ((Integer) ReflectHelper.invokeInstanceMethodNoThrow(this.f56674c, l.a("018^fkHgj1gmLejeHfh:gjZghelekfigdfd2kg"), -1, new Object[0])).intValue();
        }
        return CSCenter.getInstance().getNetworkType();
    }

    public ApplicationInfo d() {
        return this.f56673a.getApplicationInfo();
    }

    public Object b(String str) {
        Object systemServiceSafe;
        if (com.mob.commons.d.f() && com.mob.tools.utils.f.a().a(str) && (systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("008h>elCdej6ejelCf"))) != null) {
            return ReflectHelper.invokeInstanceMethodNoThrow(systemServiceSafe, l.a("020Cfk4gjDgf1eLgjUjTjdPfGelgh4f8gfelIdej5ejelBf"), null, str);
        }
        return null;
    }

    public String a(String str) {
        return a(str, "");
    }

    public String a(String str, String str2) {
        Object invokeStaticMethodNoThrow = ReflectHelper.invokeStaticMethodNoThrow(ReflectHelper.importClassNoThrow(l.a("027efMedekelejedemelgjemfmfdgjKjg>eghmekel*kgRek<j2ej-gKgj"), null), l.a("003WfkHgj"), str2, str);
        return invokeStaticMethodNoThrow != null ? String.valueOf(invokeStaticMethodNoThrow) : str2;
    }

    public int b() {
        if (c.a(this.f56673a).d().e(l.a("035efGedekelejedemGkg[ekegejgjgjejelJfEemhkhjgegmeihmglhifhhjeifmgdgegdhj"))) {
            if (CSCenter.getInstance().isPhoneStateDataEnable()) {
                if (this.f56674c == null) {
                    this.f56674c = DH.SyncMtd.getSystemServiceSafe(l.a("005ki_el<fg"));
                }
                return ((Integer) ReflectHelper.invokeInstanceMethodNoThrow(this.f56674c, l.a("014+fk(gj(fhFgjEghelekfigdfd1kg"), -1, new Object[0])).intValue();
            }
            return CSCenter.getInstance().getNetworkType();
        }
        return -1;
    }

    public Enumeration<NetworkInterface> a() {
        try {
            return NetworkInterface.getNetworkInterfaces();
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
            return null;
        }
    }

    public List<ResolveInfo> a(Intent intent, int i4) {
        if (com.mob.commons.d.b()) {
            return (List) ReflectHelper.invokeInstanceMethod(this.f56673a.getPackageManager(), l.a("019+efeh-gYekfdff)fjgfj6fm<g^ekeeejGdg-gj"), new Object[]{intent, Integer.valueOf(i4)}, new Class[]{Intent.class, Integer.TYPE}, null);
        }
        return null;
    }

    public Object a(String str, int i4, boolean z4) throws Throwable {
        if (this.f56675d == null) {
            this.f56675d = this.f56673a.getPackageManager();
        }
        if (z4) {
            return DH.SyncMtd.invokeInstanceMethod(this.f56675d, l.a("014Hfk)gj_hmNedYfi_eQfk-gGffQfYfgel"), new Object[]{str, Integer.valueOf(i4)}, new Class[]{String.class, Integer.TYPE});
        }
        boolean equals = str.equals(DH.SyncMtd.getPackageName());
        if (equals || com.mob.commons.d.b()) {
            if (Build.VERSION.SDK_INT > 25 && !equals) {
                return j.a(this.f56673a, str, i4);
            }
            return DH.SyncMtd.invokeInstanceMethod(this.f56675d, l.a("014Hfk[gj7hm^edZfi+eCfk@g5ff[fJfgel"), new Object[]{str, Integer.valueOf(i4)}, new Class[]{String.class, Integer.TYPE});
        }
        return null;
    }

    public void a(String str, long j4, float f5, Object obj) {
        if (com.mob.commons.d.e()) {
            try {
                if (com.mob.tools.utils.f.a().a(str)) {
                    Object systemServiceSafe = DH.SyncMtd.getSystemServiceSafe(l.a("008hOel5dej)ejel7f"));
                    Class<?> cls = Class.forName(l.a("033efIedekelejedemGh[el)dej!ejel.fOemgfel*dej2ejelDf_gfejgjPjgfg-ek"));
                    if (systemServiceSafe != null) {
                        ReflectHelper.invokeInstanceMethod(systemServiceSafe, l.a("022Qek)gNefehZgOgjBjIgfel0dejGejel?fFfl)kXed[ejgCgj"), new Object[]{str, Long.valueOf(j4), Float.valueOf(f5), obj, l.a().c()}, new Class[]{String.class, Long.TYPE, Float.TYPE, cls, Looper.class});
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
            }
        }
    }

    public Enumeration<InetAddress> a(NetworkInterface networkInterface) {
        return (Enumeration) ReflectHelper.invokeInstanceMethodNoThrow(networkInterface, l.a("0169fkZgj)ffUfgjYgeededek:gGgjgjYg@gj"), null, new Object[0]);
    }

    public ApplicationInfo a(String str, int i4) throws PackageManager.NameNotFoundException {
        if (this.f56675d == null) {
            this.f56675d = this.f56673a.getPackageManager();
        }
        if (TextUtils.equals(str, this.f56673a.getPackageName()) || com.mob.commons.d.b()) {
            return this.f56675d.getApplicationInfo(str, i4);
        }
        return null;
    }
}
