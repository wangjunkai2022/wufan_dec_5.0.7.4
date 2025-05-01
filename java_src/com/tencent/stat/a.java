package com.tencent.stat;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import com.tencent.stat.common.StatLogger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f62875b;

    /* renamed from: a  reason: collision with root package name */
    private StatLogger f62876a = com.tencent.stat.common.k.b();

    /* renamed from: c  reason: collision with root package name */
    private boolean f62877c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62878d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62879e;

    /* renamed from: f  reason: collision with root package name */
    private Context f62880f;

    private a(Context context) {
        this.f62877c = false;
        this.f62878d = false;
        this.f62879e = false;
        this.f62880f = null;
        this.f62880f = context.getApplicationContext();
        this.f62877c = b(context);
        this.f62878d = d(context);
        this.f62879e = c(context);
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f62875b == null) {
                f62875b = new a(context);
            }
            aVar = f62875b;
        }
        return aVar;
    }

    private boolean b(Context context) {
        if (com.tencent.stat.common.k.a(context, com.kuaishou.weapon.p0.g.f55590j)) {
            return true;
        }
        this.f62876a.e("Check permission failed: android.permission.WRITE_EXTERNAL_STORAGE");
        return false;
    }

    private boolean c(Context context) {
        if (com.tencent.stat.common.k.a(context, "android.permission.WRITE_SETTINGS")) {
            return true;
        }
        this.f62876a.e("Check permission failed: android.permission.WRITE_SETTINGS");
        return false;
    }

    private boolean d(Context context) {
        if (com.tencent.stat.common.k.d() < 14) {
            return b(context);
        }
        return true;
    }

    public boolean a(String str, String str2) {
        com.tencent.stat.common.p.b(this.f62880f, str, str2);
        return true;
    }

    public String b(String str, String str2) {
        return com.tencent.stat.common.p.a(this.f62880f, str, str2);
    }

    public boolean c(String str, String str2) {
        if (this.f62877c) {
            try {
                com.tencent.stat.common.d.a(Environment.getExternalStorageDirectory() + net.lingala.zip4j.util.e.F0 + "Tencent/mta");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(Environment.getExternalStorageDirectory(), "Tencent/mta/.mid.txt")));
                bufferedWriter.write(str + "," + str2);
                bufferedWriter.write("\n");
                bufferedWriter.close();
                return true;
            } catch (Throwable th) {
                this.f62876a.w(th);
                return false;
            }
        }
        return false;
    }

    public String d(String str, String str2) {
        if (this.f62877c) {
            try {
                for (String str3 : com.tencent.stat.common.d.a(new File(Environment.getExternalStorageDirectory(), "Tencent/mta/.mid.txt"))) {
                    String[] split = str3.split(",");
                    if (split.length == 2 && split[0].equals(str)) {
                        return split[1];
                    }
                }
            } catch (FileNotFoundException unused) {
                this.f62876a.w("Tencent/mta/.mid.txt not found.");
            } catch (Throwable th) {
                this.f62876a.w(th);
            }
            return null;
        }
        return null;
    }

    public boolean e(String str, String str2) {
        if (this.f62879e) {
            Settings.System.putString(this.f62880f.getContentResolver(), str, str2);
            return true;
        }
        return false;
    }

    public String f(String str, String str2) {
        return !this.f62879e ? str2 : Settings.System.getString(this.f62880f.getContentResolver(), str);
    }
}
