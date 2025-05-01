package com.aggmoread.sdk.z.a.m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.io.File;
import java.util.UUID;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private File f2309a;

    /* renamed from: b  reason: collision with root package name */
    private PackageInfo f2310b;

    /* renamed from: c  reason: collision with root package name */
    private Context f2311c;

    static {
        new c();
    }

    private c() {
        UUID.randomUUID().toString();
    }

    private c(Context context) {
        UUID.randomUUID().toString();
        this.f2311c = context;
    }

    public static c a(Context context, String str) {
        c cVar = new c(context);
        cVar.f2309a = new File(str);
        cVar.f2310b = d.b(context, str);
        return cVar;
    }

    public boolean a() {
        File file = this.f2309a;
        if (file != null) {
            return file.exists();
        }
        return false;
    }

    public Bitmap b() {
        try {
            if (this.f2311c != null && f() && a()) {
                String absolutePath = this.f2309a.getAbsolutePath();
                PackageManager packageManager = this.f2311c.getPackageManager();
                ApplicationInfo applicationInfo = this.f2310b.applicationInfo;
                if (applicationInfo != null) {
                    applicationInfo.sourceDir = absolutePath;
                    applicationInfo.publicSourceDir = absolutePath;
                    Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
                    if (Build.VERSION.SDK_INT >= 26 && !(applicationIcon instanceof BitmapDrawable)) {
                        if (applicationIcon instanceof AdaptiveIconDrawable) {
                            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{((AdaptiveIconDrawable) applicationIcon).getBackground(), ((AdaptiveIconDrawable) applicationIcon).getForeground()});
                            Bitmap createBitmap = Bitmap.createBitmap(layerDrawable.getIntrinsicWidth(), layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            layerDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            layerDrawable.draw(canvas);
                            return createBitmap;
                        }
                    }
                    return ((BitmapDrawable) applicationIcon).getBitmap();
                }
            }
            throw new PackageManager.NameNotFoundException("app name(" + c() + ") not found");
        } catch (Exception e5) {
            e5.printStackTrace();
            throw new PackageManager.NameNotFoundException("app name2(" + c() + ") not found");
        }
    }

    public String c() {
        return a() ? this.f2309a.getAbsolutePath() : "";
    }

    public String d() {
        ApplicationInfo applicationInfo;
        try {
            if (this.f2311c != null && f() && a() && (applicationInfo = this.f2310b.applicationInfo) != null) {
                applicationInfo.sourceDir = this.f2309a.getAbsolutePath();
                applicationInfo.publicSourceDir = this.f2309a.getAbsolutePath();
                return (String) this.f2310b.applicationInfo.loadLabel(this.f2311c.getPackageManager());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        throw new PackageManager.NameNotFoundException("app name(" + c() + ") not found");
    }

    public String e() {
        if (f() && a()) {
            return this.f2310b.packageName;
        }
        throw new PackageManager.NameNotFoundException("app name(" + c() + ") not found");
    }

    public boolean f() {
        return this.f2310b != null;
    }

    public boolean g() {
        if (this.f2311c == null) {
            return false;
        }
        try {
            return d.c(this.f2311c, e());
        } catch (Exception unused) {
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApkFileLoader {");
        sb.append("existApkFile = ");
        sb.append(a());
        sb.append(",");
        sb.append("apkFilePath = ");
        sb.append(c());
        sb.append(",");
        try {
            sb.append("getAppName = ");
            sb.append(d());
            sb.append(",");
            sb.append("getApkIcon = ");
            sb.append(b());
            sb.append(",");
            sb.append("getPackageName = ");
            sb.append(e());
            sb.append(",");
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
        }
        sb.append("isInstalled = ");
        sb.append(g());
        sb.append(" }");
        return sb.toString();
    }
}
