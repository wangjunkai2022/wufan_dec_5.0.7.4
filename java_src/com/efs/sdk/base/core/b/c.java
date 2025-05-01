package com.efs.sdk.base.core.b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;
/* loaded from: classes2.dex */
public final class c extends Handler implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10291a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final c f10292a = new c((byte) 0);
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    public static c a() {
        return a.f10292a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 2) {
            Log.w("efs.cache", "disk listener not support command: " + message.what);
            return;
        }
        WorkThreadUtil.submit(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.efs.sdk.base.core.b.a unused;
        unused = a.b.f10289a;
        File f5 = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (f5.exists()) {
            for (File file : com.efs.sdk.base.core.util.b.d(f5)) {
                if (com.efs.sdk.base.core.b.a.a(file.getName())) {
                    com.efs.sdk.base.core.b.a.c(file);
                }
            }
        }
        com.efs.sdk.base.core.config.a.c a5 = com.efs.sdk.base.core.config.a.c.a();
        String str = a5.f10353d.f10347g.containsKey("disk_bytes") ? a5.f10353d.f10347g.get("disk_bytes") : "4194304";
        long parseLong = Long.parseLong(TextUtils.isEmpty(str) ? "4194304" : str);
        long c5 = com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        boolean z4 = c5 < parseLong;
        this.f10291a = z4;
        if (!z4) {
            Log.w("efs.cache", "Cache Limited! curr " + c5 + "byte, max " + parseLong + " byte.");
        }
        sendEmptyMessageDelayed(2, TTAdConstant.AD_MAX_EVENT_TIME);
    }

    private c() {
        super(com.efs.sdk.base.core.util.concurrent.a.f10436a.getLooper());
        this.f10291a = true;
        sendEmptyMessageDelayed(2, 60000L);
    }
}
