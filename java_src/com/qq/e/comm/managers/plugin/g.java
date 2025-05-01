package com.qq.e.comm.managers.plugin;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.qq.e.comm.managers.plugin.c;
import com.qq.e.comm.util.GDTLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final File f59869a;

    /* renamed from: b  reason: collision with root package name */
    private final File f59870b;

    /* renamed from: c  reason: collision with root package name */
    private String f59871c;

    /* renamed from: d  reason: collision with root package name */
    private int f59872d;

    /* renamed from: e  reason: collision with root package name */
    private String f59873e;

    public g(File file, File file2) {
        this.f59869a = file;
        this.f59870b = file2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    private String b(File file) throws IOException {
        Throwable th;
        ?? r12 = 0;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                            }
                            String sb2 = sb.toString();
                            try {
                                bufferedReader.close();
                            } catch (Exception unused) {
                                GDTLogger.d("Exception while close bufferreader");
                            }
                            return sb2;
                        } catch (IOException e5) {
                            throw e5;
                        }
                    } catch (IOException e6) {
                        throw e6;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r12 != 0) {
                            try {
                                r12.close();
                            } catch (Exception unused2) {
                                GDTLogger.d("Exception while close bufferreader");
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                r12 = file;
                th = th3;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f59871c;
    }

    public String c() {
        return this.f59873e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(Context context, boolean z4) {
        int i4;
        try {
            if (this.f59870b.exists() && this.f59869a.exists()) {
                String b5 = b(this.f59870b);
                this.f59873e = b5;
                if (TextUtils.isEmpty(b5)) {
                    return false;
                }
                String[] split = this.f59873e.split("#####");
                if (split.length == 2) {
                    String str = split[1];
                    try {
                        i4 = Integer.parseInt(split[0]);
                    } catch (Throwable unused) {
                        i4 = 0;
                    }
                    if (c.b.f59867a.a(str, this.f59869a)) {
                        this.f59871c = str;
                        this.f59872d = i4;
                        if (Build.VERSION.SDK_INT < 34 || context == null || context.getApplicationInfo() == null || context.getApplicationInfo().targetSdkVersion < 34 || !z4) {
                            return true;
                        }
                        if (!this.f59869a.canWrite() && !this.f59869a.canExecute()) {
                            return this.f59869a.canRead();
                        }
                        return this.f59869a.setReadOnly();
                    }
                }
            }
            return false;
        } catch (Throwable unused2) {
            GDTLogger.d("Exception while checking plugin");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(File file, File file2, Context context) {
        if (file.equals(this.f59869a) || h.a(this.f59869a, file, context, true)) {
            return file2.equals(this.f59870b) || h.a(this.f59870b, file2, context, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f59872d;
    }
}
