package com.efs.sdk.base.core.b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.core.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class g extends Handler implements e {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f10293a;

    /* renamed from: b  reason: collision with root package name */
    private com.efs.sdk.base.core.e.a.d f10294b;

    /* renamed from: c  reason: collision with root package name */
    private com.efs.sdk.base.core.e.a.c f10295c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a extends FileOutputStream {

        /* renamed from: a  reason: collision with root package name */
        long f10296a;

        /* renamed from: b  reason: collision with root package name */
        File f10297b;

        a(@NonNull File file) {
            super(file);
            this.f10297b = file;
            this.f10296a = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        super(com.efs.sdk.base.core.util.concurrent.a.f10436a.getLooper());
        this.f10293a = new ConcurrentHashMap<>();
        this.f10294b = new com.efs.sdk.base.core.e.a.d();
        this.f10295c = new com.efs.sdk.base.core.e.a.c();
    }

    private static long b(String str) {
        Map<String, String> c5 = com.efs.sdk.base.core.config.a.c.a().c();
        String concat = "record_accumulation_time_".concat(String.valueOf(str));
        if (c5.containsKey(concat)) {
            String str2 = c5.get(concat);
            if (TextUtils.isEmpty(str2)) {
                return 60000L;
            }
            try {
                return Math.max(Long.parseLong(str2) * 1000, 1000L);
            } catch (Throwable th) {
                Log.e("efs.cache", "get cache interval error", th);
                return 60000L;
            }
        }
        return 60000L;
    }

    private void c(String str) {
        a aVar;
        com.efs.sdk.base.core.f.f fVar;
        com.efs.sdk.base.core.f.f fVar2;
        if (this.f10293a.containsKey(str) && (aVar = this.f10293a.get(str)) != null) {
            try {
                aVar.flush();
                com.efs.sdk.base.core.util.b.a(aVar);
                a(aVar.f10297b);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    this.f10293a.remove(str);
                    if ("wa".equalsIgnoreCase(str)) {
                        return;
                    }
                    fVar2 = f.a.f10411a;
                    fVar2.f10409c.c();
                } finally {
                    this.f10293a.remove(str);
                    if (!"wa".equalsIgnoreCase(str)) {
                        fVar = f.a.f10411a;
                        fVar.f10409c.c();
                    }
                }
            }
        }
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        Message obtain = Message.obtain();
        obtain.obj = bVar;
        obtain.what = 0;
        sendMessage(obtain);
    }

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            Object obj = message.obj;
            if (obj instanceof String) {
                c(obj.toString());
                return;
            }
            return;
        }
        com.efs.sdk.base.core.d.b bVar = (com.efs.sdk.base.core.d.b) message.obj;
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                a b5 = b(bVar);
                if (b5 == null) {
                    Log.w("efs.cache", "writer is null for type " + bVar.f10380a.f10373a);
                    return;
                }
                if (b5.getChannel().position() + bVar.f10382c.length > 819200) {
                    c(bVar.f10380a.f10373a);
                    b5 = b(bVar);
                    if (b5 == null) {
                        Log.w("efs.cache", "writer is null for type " + bVar.f10380a.f10373a);
                        return;
                    }
                }
                b5.write(Base64.encode(bVar.f10382c, 11));
                b5.write("\n".getBytes());
                return;
            } catch (Throwable th) {
                Log.e("efs.cache", "cache file error", th);
            }
        }
    }

    @Override // com.efs.sdk.base.core.b.e
    public final boolean a(File file, com.efs.sdk.base.core.d.b bVar) {
        if (!bVar.b()) {
            a(file);
            return false;
        } else if (file.exists()) {
            bVar.f10383d = file;
            bVar.c();
            bVar.b(1);
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.efs.sdk.base.core.b.g.a b(com.efs.sdk.base.core.d.b r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.b.g$a> r0 = r5.f10293a
            com.efs.sdk.base.core.d.a r1 = r6.f10380a
            java.lang.String r1 = r1.f10373a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.b.g$a> r0 = r5.f10293a
            com.efs.sdk.base.core.d.a r6 = r6.f10380a
            java.lang.String r6 = r6.f10373a
            java.lang.Object r6 = r0.get(r6)
            com.efs.sdk.base.core.b.g$a r6 = (com.efs.sdk.base.core.b.g.a) r6
            return r6
        L19:
            java.lang.String r0 = com.efs.sdk.base.core.util.b.a(r6)
            java.io.File r1 = new java.io.File
            com.efs.sdk.base.core.config.GlobalEnvStruct r2 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            android.content.Context r2 = r2.mAppContext
            com.efs.sdk.base.core.config.GlobalEnvStruct r3 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            java.lang.String r3 = r3.getAppid()
            java.io.File r2 = com.efs.sdk.base.core.util.a.e(r2, r3)
            r1.<init>(r2, r0)
            r0 = 0
            com.efs.sdk.base.core.b.g$a r2 = new com.efs.sdk.base.core.b.g$a     // Catch: java.lang.Throwable -> L66
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L66
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.efs.sdk.base.core.b.g$a> r0 = r5.f10293a     // Catch: java.lang.Throwable -> L64
            com.efs.sdk.base.core.d.a r3 = r6.f10380a     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r3.f10373a     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.putIfAbsent(r3, r2)     // Catch: java.lang.Throwable -> L64
            com.efs.sdk.base.core.b.g$a r0 = (com.efs.sdk.base.core.b.g.a) r0     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L4f
            com.efs.sdk.base.core.util.b.a(r2)     // Catch: java.lang.Throwable -> L64
            com.efs.sdk.base.core.util.b.b(r1)     // Catch: java.lang.Throwable -> L64
            return r0
        L4f:
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L64
            com.efs.sdk.base.core.d.a r1 = r6.f10380a     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.f10373a     // Catch: java.lang.Throwable -> L64
            r0.obj = r1     // Catch: java.lang.Throwable -> L64
            r3 = 1
            r0.what = r3     // Catch: java.lang.Throwable -> L64
            long r3 = b(r1)     // Catch: java.lang.Throwable -> L64
            r5.sendMessageDelayed(r0, r3)     // Catch: java.lang.Throwable -> L64
            goto L6c
        L64:
            r0 = move-exception
            goto L69
        L66:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L69:
            r0.printStackTrace()
        L6c:
            com.efs.sdk.base.core.d.a r6 = r6.f10380a
            java.lang.String r6 = r6.f10373a
            java.lang.String r0 = "wa"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 != 0) goto L81
            com.efs.sdk.base.core.f.f r6 = com.efs.sdk.base.core.f.f.a.a()
            com.efs.sdk.base.core.f.d r6 = r6.f10409c
            r6.b()
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.b.g.b(com.efs.sdk.base.core.d.b):com.efs.sdk.base.core.b.g$a");
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = str;
        obtain.what = 1;
        sendMessage(obtain);
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(File file) {
        byte[] bArr;
        com.efs.sdk.base.core.b.a unused;
        com.efs.sdk.base.core.b.a unused2;
        com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file.getName());
        if (b5 == null) {
            unused = a.b.f10289a;
            com.efs.sdk.base.core.b.a.b(file);
        } else if (!a(b5, file) || (bArr = b5.f10382c) == null || bArr.length <= 0) {
            unused2 = a.b.f10289a;
            com.efs.sdk.base.core.b.a.b(file);
        } else {
            com.efs.sdk.base.core.util.b.a(new File(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()), com.efs.sdk.base.core.util.b.a(b5)), b5.f10382c);
            com.efs.sdk.base.core.util.b.b(file);
        }
    }

    private boolean a(com.efs.sdk.base.core.d.b bVar, File file) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String b5 = com.efs.sdk.base.core.util.b.b.b(readLine.getBytes());
                if (!TextUtils.isEmpty(b5)) {
                    sb.append(b5);
                    sb.append("\n");
                }
            }
            bVar.a(sb.toString().getBytes());
            bVar.c();
            this.f10295c.a(bVar);
            bVar.f10383d = file;
            com.efs.sdk.base.core.util.b.a(bufferedReader);
            com.efs.sdk.base.core.util.b.a(fileReader);
            return true;
        } catch (Throwable th3) {
            th = th3;
            fileReader2 = fileReader;
            try {
                Log.e("efs.cache", "local decode error", th);
                com.efs.sdk.base.core.util.b.a(bufferedReader);
                com.efs.sdk.base.core.util.b.a(fileReader2);
                return false;
            } catch (Throwable th4) {
                com.efs.sdk.base.core.util.b.a(bufferedReader);
                com.efs.sdk.base.core.util.b.a(fileReader2);
                throw th4;
            }
        }
    }
}
