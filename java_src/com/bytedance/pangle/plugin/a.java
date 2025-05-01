package com.bytedance.pangle.plugin;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.c.b;
import com.bytedance.pangle.f.a.e;
import com.bytedance.pangle.log.ZeusLogger;
import com.bytedance.pangle.util.g;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private File f8461a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8462b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, File file) {
        this.f8461a = file;
        this.f8462b = str;
    }

    private static File a(File file) {
        if (file.exists() || file.getParent() == null) {
            return file;
        }
        File[] listFiles = new File(file.getParent()).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.exists() && file2.getName().endsWith(".apk")) {
                return file2;
            }
        }
        return file;
    }

    private void b() {
        int i4 = 3;
        while (i4 > 0) {
            i4--;
            try {
                File file = new File(this.f8461a.getAbsolutePath() + "_unzip");
                if (file.exists()) {
                    file.delete();
                    file.mkdirs();
                }
                g.b(this.f8461a.getAbsolutePath(), file.getAbsolutePath());
                File[] listFiles = file.listFiles();
                File file2 = this.f8461a;
                if (listFiles != null && listFiles.length > 0) {
                    file2 = listFiles[0];
                }
                File a5 = a(file2);
                if (a5 != null && a5.exists() && a5.isFile()) {
                    this.f8461a = a5;
                    ZeusLogger.d("Plugin install : unZip count : " + (3 - i4));
                    return;
                }
            } catch (Exception e5) {
                ZeusLogger.errReport(ZeusLogger.TAG_INIT, "Plugin install : unZip file failed !!!", e5);
                e5.printStackTrace();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }

    private static void a(String str, int i4, @NonNull String str2, long j4, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.putOpt("status_code", com.bytedance.pangle.log.b.a(Integer.valueOf(i4)));
            jSONObject.putOpt("plugin_package_name", com.bytedance.pangle.log.b.a(str2));
            jSONObject.putOpt("version_code", com.bytedance.pangle.log.b.a((Object) 0));
            jSONObject3.putOpt("duration", Integer.valueOf(com.bytedance.pangle.log.b.b(Long.valueOf(j4))));
            jSONObject2.putOpt("message", com.bytedance.pangle.log.b.a(str3));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.bytedance.pangle.c.b.a().a(str, jSONObject, jSONObject3, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (g.b(this.f8461a)) {
            ZeusLogger.d("Plugin install : start unZip file ~~~~");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            b();
            a(com.bytedance.pangle.c.b.f8257h, b.a.G, this.f8462b, SystemClock.elapsedRealtime() - elapsedRealtime, "");
            ZeusLogger.d("Plugin install : start install from unZip ~~~~");
        } else {
            ZeusLogger.d("Plugin install : start install without unZip ~~~~");
        }
        e a5 = com.bytedance.pangle.f.a.d.a(this.f8461a);
        if (a5 == null) {
            String str = this.f8462b;
            ZeusPluginStateListener.postStateChange(str, 7, " read local file package info failed !!! pluginPkg = " + this.f8462b + " mApkFile.exists = " + this.f8461a.exists());
            StringBuilder sb = new StringBuilder("PluginInstallRunnable read local file package info failed !!! pluginPkg = ");
            sb.append(this.f8462b);
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, sb.toString());
            return false;
        }
        Plugin plugin = PluginManager.getInstance().getPlugin(a5.f8382a);
        if (plugin == null) {
            String str2 = this.f8462b;
            ZeusPluginStateListener.postStateChange(str2, 7, " plugin == null !!! pluginPkg = " + this.f8462b);
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "PluginInstallRunnable cannot query valid plugin !!! packageName = " + a5.f8382a);
            return false;
        }
        boolean install = plugin.install(this.f8461a, a5);
        if (install) {
            ZeusPluginStateListener.postStateChange(a5.f8382a, 6, new Object[0]);
        } else {
            ZeusPluginStateListener.postStateChange(a5.f8382a, 7, "Internal error.");
        }
        return install;
    }
}
