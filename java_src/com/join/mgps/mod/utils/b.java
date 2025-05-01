package com.join.mgps.mod.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.join.mgps.Util.w0;
import com.join.mgps.mod.bean.ModMeta;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* compiled from: ApkLoader.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: l  reason: collision with root package name */
    private static final String f53605l = "Plugin";

    /* renamed from: a  reason: collision with root package name */
    private String f53606a;

    /* renamed from: b  reason: collision with root package name */
    private Context f53607b;

    /* renamed from: c  reason: collision with root package name */
    private PackageInfo f53608c;

    /* renamed from: d  reason: collision with root package name */
    private DexClassLoader f53609d;

    /* renamed from: e  reason: collision with root package name */
    private AssetManager f53610e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f53611f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f53612g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f53613h;

    /* renamed from: i  reason: collision with root package name */
    private String f53614i;

    /* renamed from: j  reason: collision with root package name */
    private String f53615j;

    /* renamed from: k  reason: collision with root package name */
    private Object f53616k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ApkLoader.java */
    /* loaded from: classes3.dex */
    public class a extends DexClassLoader {
        a(String str, String str2, String str3, ClassLoader classLoader) {
            super(str, str2, str3, classLoader);
        }

        @Override // java.lang.ClassLoader
        public Class<?> loadClass(String str) throws ClassNotFoundException {
            try {
                if (str.startsWith("com.google.protobuf")) {
                    return ModMeta.class.getClassLoader().loadClass(str);
                }
                return super.loadClass(str);
            } catch (ClassNotFoundException unused) {
                return ModMeta.class.getClassLoader().loadClass(str);
            }
        }
    }

    public b(Context context) {
        this.f53606a = null;
        this.f53607b = context;
        this.f53606a = context.getDir(d.f53625h, 0).getAbsolutePath();
    }

    private AssetManager a(String str) {
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
            assetManager.getClass().getMethod("addAssetPath", String.class).invoke(assetManager, str);
            return assetManager;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private DexClassLoader b(String str) {
        File dir = this.f53607b.getDir("dex", 0);
        if (dir.exists()) {
            dir.delete();
        }
        dir.mkdirs();
        this.f53613h = dir.getAbsolutePath();
        return new a(str, this.f53613h, this.f53606a, this.f53607b.getClassLoader());
    }

    private Resources c(AssetManager assetManager) {
        Resources resources = this.f53607b.getResources();
        return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
    }

    private void l(PackageInfo packageInfo, String str) {
        this.f53608c = packageInfo;
        this.f53609d = b(str);
        w0.e("Plugin", "dexClassLoader:" + this.f53609d);
        this.f53610e = a(str);
        w0.e("Plugin", "assetManager:" + this.f53610e);
        this.f53611f = c(this.f53610e);
        w0.e("Plugin", "resources:" + this.f53611f);
    }

    public AssetManager d() {
        return this.f53610e;
    }

    public DexClassLoader e() {
        return this.f53609d;
    }

    public String f() {
        return this.f53614i;
    }

    public String g() {
        return this.f53615j;
    }

    public Resources getResources() {
        return this.f53611f;
    }

    public PackageInfo h() {
        return this.f53608c;
    }

    public String i() {
        return this.f53608c.packageName;
    }

    public boolean j() {
        return this.f53608c != null && this.f53612g;
    }

    public void k(String str) {
        w0.e("Plugin", "loadApk " + str);
        PackageInfo packageArchiveInfo = this.f53607b.getPackageManager().getPackageArchiveInfo(str, 128);
        w0.e("Plugin", "loadApk packageInfo");
        if (packageArchiveInfo == null) {
            w0.e("Plugin", "loadApk get packageInfo failed");
            return;
        }
        this.f53614i = packageArchiveInfo.applicationInfo.metaData.getString("Plugin");
        this.f53615j = packageArchiveInfo.applicationInfo.metaData.getString(d.f53627j);
        w0.e("Plugin", "loadApk preparePluginEnv");
        l(packageArchiveInfo, str);
        this.f53612g = true;
    }

    public void m(String str, Bundle bundle) {
        try {
            w0.e("ApkLoader", "processCommand");
            Object obj = this.f53616k;
            if (obj == null) {
                return;
            }
            Method e5 = c.e(obj, "processCommand", String.class, Bundle.class);
            if (e5 != null) {
                e5.invoke(this.f53616k, str, bundle);
            }
            w0.e("ApkLoader", "processCommand invoked");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public Object n(ModMeta modMeta) {
        try {
            Class<?> f5 = c.f(e(), this.f53614i);
            w0.e("start mod", "constructor=" + f5);
            if (f5 == null) {
                return null;
            }
            String str = "";
            for (int i4 = 0; i4 < f5.getConstructors().length; i4++) {
                str = str + f5.getConstructors()[i4] + ";\n";
            }
            w0.e("start mod", "init \n" + str);
            Constructor<?> declaredConstructor = f5.getDeclaredConstructor(ModMeta.class);
            w0.e("start mod", "finish");
            Object newInstance = declaredConstructor.newInstance(modMeta);
            this.f53616k = newInstance;
            return newInstance;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public b(Context context, String str) {
        this.f53606a = null;
        this.f53607b = context;
        this.f53606a = str;
    }
}
