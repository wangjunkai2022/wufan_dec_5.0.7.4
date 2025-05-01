package com.efs.sdk.base.core.c;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    static FileLock f10316b;

    /* renamed from: a  reason: collision with root package name */
    volatile int f10317a;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final f f10320a = new f((byte) 0);

        public static /* synthetic */ f a() {
            return f10320a;
        }
    }

    /* synthetic */ f(byte b5) {
        this();
    }

    public final boolean a() {
        if (this.f10317a == 2) {
            return true;
        }
        if (this.f10317a == 0) {
            a(ControllerCenter.getGlobalEnvStruct().mAppContext);
            return false;
        }
        return false;
    }

    private f() {
        this.f10317a = 0;
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    private synchronized void a(final Context context) {
        Log.w("efs.send_log", "tryFileLock start! ");
        this.f10317a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.core.c.f.1
            @Override // java.lang.Runnable
            public final void run() {
                FileLock lock;
                try {
                    File a5 = com.efs.sdk.base.core.util.a.a(context);
                    if (!a5.exists()) {
                        a5.mkdirs();
                    }
                    File file = new File(a5.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        lock = new FileOutputStream(file).getChannel().lock();
                        f.f10316b = lock;
                    } while (!lock.isValid());
                    Log.w("efs.send_log", "tryFileLock sendlock sucess! processname: " + ProcessUtil.getCurrentProcessName());
                    f.this.f10317a = 2;
                } catch (Exception e5) {
                    Log.w("efs.send_log", "tryFileLock fail! " + e5.getMessage());
                    f.this.f10317a = 0;
                }
            }
        }).start();
    }
}
