package com.netease.nis.basesdk.crash;

import android.text.TextUtils;
import com.netease.nis.basesdk.Logger;
import java.io.File;
import java.io.IOException;
/* compiled from: FileManager.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f57372b = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f57373a;

    private a() {
    }

    private boolean a() {
        File file = new File(this.f57373a);
        try {
            if (!file.exists()) {
                file.mkdirs();
                return file.exists() && file.isDirectory();
            }
            return file.isDirectory();
        } catch (Exception unused) {
            return false;
        }
    }

    public static a b() {
        return f57372b;
    }

    public void b(String str) {
        this.f57373a = str;
    }

    public File a(String str) {
        if (!TextUtils.isEmpty(this.f57373a) && a()) {
            File file = new File(str);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                Logger.e("JavaCrashFileManager", "FileManager createLogFile by createNewFile failed,file already exists");
                return null;
            } catch (IOException unused) {
                Logger.e("JavaCrashFileManager", "FileManager createLogFile by createNewFile failed");
                return null;
            }
        }
        return null;
    }

    public boolean a(File file) {
        if (file != null && file.exists()) {
            try {
                return file.delete();
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
