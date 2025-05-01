package com.xinzhu.overmind.plugin;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.plugin.a;
import com.xinzhu.overmind.server.f;
import com.xinzhu.overmind.server.os.MindShareFileInfo;
import com.xinzhu.overmind.utils.k;
import com.xinzhu.overmind.utils.wrappers.ContentProviderWrapper;
import java.io.File;
import java.util.List;
/* compiled from: MindPluginWrapper.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67830a = "b";

    /* renamed from: b  reason: collision with root package name */
    static com.xinzhu.overmind.plugin.a f67831b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindPluginWrapper.java */
    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            b.f67831b = null;
            String str = b.f67830a;
            com.xinzhu.overmind.b.c(str, "sPluginMonitor disconnect " + b.f67831b);
        }
    }

    public static MindShareFileInfo b(String str) {
        if (f.f67977b) {
            return null;
        }
        try {
            if (i()) {
                return f67831b.checkFile(str);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static boolean c() {
        try {
            com.xinzhu.overmind.plugin.a aVar = f67831b;
            if (aVar == null || !aVar.asBinder().isBinderAlive()) {
                com.xinzhu.overmind.plugin.a asInterface = a.b.asInterface(ContentProviderWrapper.acquire(com.xinzhu.overmind.client.f.b(), "init", null, null).getBinder("PluginMonitor"));
                f67831b = asInterface;
                asInterface.asBinder().linkToDeath(new a(), 0);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void d(String str, String str2) {
        if (f.f67977b) {
            return;
        }
        try {
            if (i()) {
                f67831b.copyDir(str, str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void e(String str, String str2) {
        try {
            List<MindShareFileInfo> m4 = m(str);
            if (m4 != null && !m4.isEmpty()) {
                k.p(new File(str2));
                for (MindShareFileInfo mindShareFileInfo : m4) {
                    File file = new File(mindShareFileInfo.f68016b);
                    File file2 = new File(str2, file.getName());
                    if (mindShareFileInfo.f68018d.booleanValue()) {
                        if (!file.getName().equals("oat")) {
                            e(mindShareFileInfo.f68016b, file2.getAbsolutePath());
                        }
                    } else {
                        g(mindShareFileInfo.f68016b, file2.getAbsolutePath());
                    }
                }
                return;
            }
            com.xinzhu.overmind.b.c(f67830a, "copyDirReverse get empty file list");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void f(String str, String str2) {
        if (f.f67977b) {
            return;
        }
        try {
            if (i()) {
                f67831b.copyFile(str, str2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void g(String str, String str2) {
        try {
            k.p(new File(str2).getParentFile());
            ParcelFileDescriptor n4 = n(str);
            if (n4 != null) {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(n4);
                k.e(autoCloseInputStream, new File(str2));
                autoCloseInputStream.close();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void h(String str) {
        if (f.f67977b) {
            return;
        }
        try {
            if (i()) {
                f67831b.deleteFileOrDir(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean i() {
        if (Overmind.isPluginPkgInstalled()) {
            int i4 = 3;
            while (i4 > 0) {
                i4--;
                if (c()) {
                    try {
                        f67831b.initWorks();
                        return true;
                    } catch (RemoteException e5) {
                        e5.printStackTrace();
                        return true;
                    }
                }
                o();
            }
            return false;
        }
        return false;
    }

    public static List<ActivityManager.RecentTaskInfo> j(int i4, int i5) {
        try {
            if (i()) {
                return f67831b.getRecentTasks(i4, i5);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static List<ActivityManager.RunningAppProcessInfo> k() {
        try {
            if (i()) {
                return f67831b.getRunningAppProcesses();
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void l(int i4) {
        try {
            if (i()) {
                f67831b.killProcess(i4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static List<MindShareFileInfo> m(String str) {
        try {
            if (i()) {
                return f67831b.listFiles(str);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static ParcelFileDescriptor n(String str) {
        try {
            if (i()) {
                return f67831b.openAsParcelFile(str);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static void o() {
        Context context = Overmind.getContext();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(Overmind.getPluginPkg());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() == 0) {
            return;
        }
        Intent intent2 = new Intent(intent);
        intent2.addFlags(65536);
        intent2.addFlags(268435456);
        intent2.setClassName(queryIntentActivities.get(0).activityInfo.packageName, queryIntentActivities.get(0).activityInfo.name);
        com.xinzhu.overmind.b.c(f67830a, "try start plugin");
        context.startActivity(intent2);
    }

    public static void p() {
        if (f.f67977b) {
            return;
        }
        try {
            if (i()) {
                f67831b.syncAllPackages();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void q(String str, int i4) {
        if (f.f67977b) {
            return;
        }
        try {
            if (i()) {
                f67831b.syncPackage(str, i4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
