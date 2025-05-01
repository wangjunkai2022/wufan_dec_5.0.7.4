package com.efs.sdk.base.core.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public boolean f10285a;

    /* renamed from: b */
    public boolean f10286b;

    /* renamed from: c */
    public com.efs.sdk.base.core.b.b f10287c;

    /* renamed from: d */
    public C0244a f10288d;

    /* renamed from: com.efs.sdk.base.core.b.a$a */
    /* loaded from: classes2.dex */
    public static class C0244a implements Comparator<File> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            return lastModified == 0 ? 0 : -1;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private static final a f10289a = new a((byte) 0);

        public static /* synthetic */ a a() {
            return f10289a;
        }
    }

    /* synthetic */ a(byte b5) {
        this();
    }

    public static void b(@NonNull File file) {
        com.efs.sdk.base.core.f.f fVar;
        if (!file.getName().startsWith("wa_")) {
            fVar = f.a.f10411a;
            fVar.f10409c.e();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    public static void c(File file) {
        com.efs.sdk.base.core.f.f fVar;
        StringBuilder sb = new StringBuilder("file is expire: ");
        sb.append(file.getName());
        sb.append(", now is ");
        com.efs.sdk.base.core.a.a.a();
        sb.append(com.efs.sdk.base.core.a.a.b());
        Log.i("efs.cache", sb.toString());
        if (!file.getName().startsWith("wa_")) {
            fVar = f.a.f10411a;
            fVar.f10409c.d();
        }
        com.efs.sdk.base.core.util.b.b(file);
    }

    public final void a() {
        String[] list;
        File d5 = com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!d5.exists() || !d5.isDirectory() || (list = d5.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                File file = new File(d5, str);
                List<File> d6 = com.efs.sdk.base.core.util.b.d(file);
                if (!d6.isEmpty()) {
                    for (File file2 : d6) {
                        if (a(file2.getName())) {
                            c(file2);
                        } else {
                            com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file2.getName());
                            if (b5 == null) {
                                b(file2);
                            } else {
                                e a5 = this.f10287c.a(b5.f10380a.f10374b);
                                if (a5 == null) {
                                    b(file2);
                                } else {
                                    a5.a(file2);
                                }
                            }
                        }
                    }
                }
                com.efs.sdk.base.core.util.b.b(file);
            }
        }
    }

    private a() {
        this.f10285a = false;
        this.f10286b = true;
        this.f10287c = new com.efs.sdk.base.core.b.b();
        this.f10288d = new C0244a();
    }

    public static boolean a(String str) {
        try {
            long parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            com.efs.sdk.base.core.a.a.a();
            return Math.abs(com.efs.sdk.base.core.a.a.b() - parseLong) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Nullable
    public final com.efs.sdk.base.core.d.b a(File file) {
        try {
            if (file.exists()) {
                if (a(file.getName())) {
                    c(file);
                    return null;
                }
                com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file.getName());
                if (b5 == null) {
                    b(file);
                    return null;
                }
                e a5 = this.f10287c.a(b5.f10380a.f10374b);
                if (a5 == null) {
                    b(file);
                    return null;
                } else if (a5.a(file, b5)) {
                    return b5;
                } else {
                    b(file);
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            Log.w("efs.cache", th);
            b(file);
            return null;
        }
    }
}
