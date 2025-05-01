package com.aggmoread.sdk.z.a.j;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.NotificationManagerCompat;
import com.aggmoread.sdk.a.adcomm.amsdk.AMCustomBroadReceiver;
import com.aggmoread.sdk.z.a.j.a;
import com.aggmoread.sdk.z.a.j.n;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.mgps.receiver.BootReceiver_;
import com.papa91.common.BaseAppConfig;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class b extends com.aggmoread.sdk.z.a.b {

    /* renamed from: n  reason: collision with root package name */
    static final AtomicInteger f2174n = new AtomicInteger(10000);

    /* renamed from: a  reason: collision with root package name */
    private Context f2175a;

    /* renamed from: b  reason: collision with root package name */
    private String f2176b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.j.c f2177c;

    /* renamed from: d  reason: collision with root package name */
    private int f2178d;

    /* renamed from: e  reason: collision with root package name */
    private e f2179e;

    /* renamed from: f  reason: collision with root package name */
    private a.AbstractC0060a f2180f;

    /* renamed from: g  reason: collision with root package name */
    private n f2181g;

    /* renamed from: h  reason: collision with root package name */
    private String f2182h;

    /* renamed from: i  reason: collision with root package name */
    private String f2183i;

    /* renamed from: j  reason: collision with root package name */
    private k f2184j;

    /* renamed from: k  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.m.h f2185k;

    /* renamed from: l  reason: collision with root package name */
    private String f2186l;

    /* renamed from: m  reason: collision with root package name */
    final Runnable f2187m;

    /* loaded from: classes2.dex */
    class a extends i {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f2189c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f2190d;

        /* renamed from: com.aggmoread.sdk.z.a.j.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0061a extends l {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ File f2192b;

            C0061a(File file) {
                this.f2192b = file;
            }

            @Override // com.aggmoread.sdk.z.a.j.l
            public void a(Intent intent, String str, String str2, String str3) {
                com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onCompleted enter , onNotificationClicked = " + str2 + ", downloadId = " + b.this.f2178d);
                b.this.a(this.f2192b, d.f2196c);
                b.this.f2177c.a((long) b.this.f2178d, -2002, "click notification install apk");
            }
        }

        a(String str, String str2, String str3) {
            this.f2188b = str;
            this.f2189c = str2;
            this.f2190d = str3;
        }

        @Override // com.aggmoread.sdk.z.a.j.i
        public void a() {
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onConnectSuccess enter");
            f.a().a(this.f2188b, 1);
        }

        @Override // com.aggmoread.sdk.z.a.j.i
        public void a(int i4, String str) {
            f.a().a(this.f2188b, 0);
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onError enter , code = " + i4 + " , message = " + str);
            b.this.f2177c.b((long) b.this.f2178d, i4, str);
        }

        @Override // com.aggmoread.sdk.z.a.j.i
        public void a(File file) {
            if (file == null || !file.exists()) {
                f.a().a(this.f2188b, 0);
                com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onCompleted enter , downloadFile not found");
                b.this.f2177c.a(b.this.f2178d, -2001, "download file not found error");
                return;
            }
            f.a().a(this.f2188b, 3);
            b.this.f2182h = file.getAbsolutePath();
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onCompleted enter , downloadFile = " + file.getAbsolutePath() + " , downloadId = " + b.this.f2178d);
            b.this.f2177c.b((long) b.this.f2178d);
            com.aggmoread.sdk.z.a.j.e.a(this.f2189c, new C0061a(file));
            b.this.a(this.f2190d, file);
        }

        @Override // com.aggmoread.sdk.z.a.j.i
        public void c() {
            f.a().a(this.f2188b, 2);
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onStartReadBytes enter");
            b.this.f2177c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.aggmoread.sdk.z.a.j.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0062b extends a.AbstractC0060a {
        C0062b(b bVar) {
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            if (bVar.a(bVar.f2175a, b.this.f2176b) || b.this.f2177c == null) {
                return;
            }
            b.this.f2177c.a(b.this.f2178d, -2005, "user cancel install");
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        public static final d f2195b = new d("DOWNLOAD_COMPLETED", 0);

        /* renamed from: c  reason: collision with root package name */
        public static final d f2196c = new d("NOTIFICATION_CLICK", 1);

        /* renamed from: d  reason: collision with root package name */
        public static final d f2197d = new d("INSTALLER_BRIDGE", 2);

        private d(String str, int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private String f2198a;

        /* renamed from: b  reason: collision with root package name */
        private com.aggmoread.sdk.z.a.j.c f2199b;

        /* loaded from: classes2.dex */
        class a extends l {
            a() {
            }

            @Override // com.aggmoread.sdk.z.a.j.l
            public void a(Intent intent, String str, String str2, String str3) {
                e.this.f2199b.a(b.this.f2178d, -2003, "click notification open apk");
                b.this.a(str3);
                com.aggmoread.sdk.z.a.j.e.a(str);
            }
        }

        public e(String str, com.aggmoread.sdk.z.a.j.c cVar) {
            this.f2198a = str;
            this.f2199b = cVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if (BootReceiver_.f53984a.equals(action) || BootReceiver_.f53987d.equals(action)) {
                    String dataString = intent.getDataString();
                    if (dataString != null && dataString.startsWith("package:")) {
                        dataString = dataString.substring(8);
                    }
                    com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "installedPackageName " + dataString + " ， packageName " + this.f2198a + " , downloadListener = " + this.f2199b);
                    if (TextUtils.isEmpty(this.f2198a) || (dataString != null && dataString.contains(this.f2198a))) {
                        this.f2199b.a(b.this.f2178d);
                        com.aggmoread.sdk.z.a.m.e.a(b.this.f2187m);
                        b.this.f2175a.unregisterReceiver(this);
                        if (b.this.f2184j != null) {
                            b.this.f2184j.f();
                            com.aggmoread.sdk.z.a.j.e.a(b.this.f2183i);
                            com.aggmoread.sdk.z.a.j.e.a(b.this.f2183i, new a());
                        }
                        if (b.this.f2185k == null || TextUtils.isEmpty(this.f2198a)) {
                            return;
                        }
                        b.this.f2185k.a(this.f2198a);
                    }
                }
            }
        }
    }

    public b(Context context, String str, com.aggmoread.sdk.z.a.j.c cVar) {
        com.aggmoread.sdk.z.a.j.c cVar2 = com.aggmoread.sdk.z.a.j.c.f2202a;
        this.f2177c = cVar2;
        this.f2178d = 0;
        this.f2187m = new c();
        this.f2175a = context;
        this.f2186l = str;
        this.f2177c = cVar == null ? cVar2 : cVar;
    }

    private String a(File file) {
        return com.aggmoread.sdk.z.a.m.c.a(this.f2175a, file.getAbsolutePath()).e();
    }

    private boolean a(Context context) {
        com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "checkInstallPermission");
        if (Build.VERSION.SDK_INT >= 26) {
            boolean canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "checkInstallPermission hasInstallPermission = " + canRequestPackageInstalls);
            return canRequestPackageInstalls;
        }
        return true;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, String str) {
        return com.aggmoread.sdk.z.a.m.d.c(context, str);
    }

    public static File b(Context context) {
        File externalCacheDir = context.getApplicationContext().getExternalCacheDir();
        return externalCacheDir != null ? externalCacheDir : context.getApplicationContext().getCacheDir();
    }

    private boolean b(String str) {
        f();
        if (this.f2179e == null) {
            this.f2179e = new e(str, this.f2177c);
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(BootReceiver_.f53984a);
            intentFilter.addAction(BootReceiver_.f53987d);
            intentFilter.addDataScheme("package");
            this.f2175a.registerReceiver(this.f2179e, intentFilter);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f2177c.a(this.f2178d, -2009, "start listen package error");
            return false;
        }
    }

    public static File c(Context context) {
        return new File(b(context), "amdownload");
    }

    public void a(String str) {
        try {
            Intent launchIntentForPackage = this.f2175a.getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                this.f2175a.startActivity(launchIntentForPackage);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(String str, String str2, String str3) {
        com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "areNotificationsEnabled = " + NotificationManagerCompat.from(this.f2175a).areNotificationsEnabled());
        this.f2178d = f2174n.incrementAndGet();
        this.f2176b = str2;
        com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "downloadApk enter , packageName = " + str2 + ",ulr = " + str);
        File c5 = c(this.f2175a);
        String a5 = g.a(str);
        String str4 = a5 + ".apk";
        File file = new File(c5, str4);
        int a6 = f.a().a(a5);
        if (a6 == 1 || a6 == 2) {
            this.f2177c.a();
            Toast.makeText(this.f2175a, "广告正在下载", 0).show();
        } else if (a6 == 3 && a(str2, file)) {
            this.f2177c.b();
            this.f2177c.b(this.f2178d);
        } else {
            if (file.exists()) {
                try {
                    com.aggmoread.sdk.z.a.m.c.a(this.f2175a, file.getAbsolutePath()).e();
                    if (a(str2, file)) {
                        this.f2177c.b();
                        this.f2177c.b(this.f2178d);
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            this.f2183i = str;
            Intent intent = new Intent(this.f2175a, com.aggmoread.sdk.z.a.j.e.a());
            intent.putExtra("apkUrl", str);
            intent.putExtra(BaseAppConfig.KEY_APK_PATH, file.getAbsolutePath());
            intent.putExtra("packageName", str2);
            intent.setAction(AMCustomBroadReceiver.ACTION_NOTIFICATION_CLICK);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f2175a, this.f2178d, intent, TTAdConstant.KEY_CLICK_AREA);
            int i4 = com.aggmoread.sdk.z.a.h.a.d().e().f2128c;
            if (i4 == 0) {
                i4 = this.f2175a.getApplicationContext().getApplicationInfo().icon;
            }
            this.f2184j = new k(this.f2175a, this.f2178d, broadcast, a5, TextUtils.isEmpty(str3) ? "" : str3, "正在下载...", i4);
            n a7 = new n.a(this.f2175a).c(str).a(c5.getAbsolutePath()).b(str4).a(false).b(3).a(3).a(this.f2184j).a(new a(a5, str, str2)).a();
            this.f2181g = a7;
            a7.l();
            Toast.makeText(this.f2175a, "开始下载", 0).show();
        }
    }

    boolean a(File file, d dVar) {
        if (!a(this.f2175a)) {
            this.f2177c.a(-1L, -2010, "no install permission");
        }
        boolean exists = file.exists();
        com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "startInstaller apkFile = " + file.getName() + ", isExist = " + exists);
        Context context = this.f2175a;
        Intent intent = new Intent("android.intent.action.VIEW");
        com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "pkg = " + context.getPackageName());
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Uri a5 = com.aggmoread.sdk.z.a.j.d.a(context, context.getPackageName() + ".am.download.fp", file);
                com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "localUri = " + a5);
                intent.setDataAndType(a5, "application/vnd.android.package-archive");
                intent.addFlags(1);
            } else {
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            }
            intent.addFlags(268435456);
            if (a(context, intent)) {
                try {
                    com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "installer startActivity intent = " + intent);
                    context.startActivity(intent);
                    e();
                    this.f2177c.c((long) this.f2178d);
                    d();
                    return true;
                } catch (Exception e5) {
                    com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "start installer error , message = " + e5.getMessage());
                    this.f2177c.a((long) this.f2178d, -2007, "start installer error");
                    e5.printStackTrace();
                }
            } else {
                this.f2177c.a(this.f2178d, -2008, "installer not found");
                com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "installer not found");
            }
            return false;
        } catch (Exception e6) {
            e6.printStackTrace();
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "startInstaller exception e  = " + e6.getMessage());
            this.f2177c.a((long) this.f2178d, -2006, "installer intent builder error");
            return false;
        }
    }

    public boolean a(String str, File file) {
        k kVar = this.f2184j;
        if (kVar != null && !kVar.a()) {
            try {
                this.f2184j.a(com.aggmoread.sdk.z.a.m.c.a(this.f2175a, file.getAbsolutePath()).b());
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
            }
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = a(file);
            }
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "downComplete willListenPackageName= " + str);
            if (a(this.f2175a, str)) {
                a(str);
                com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "downComplete clickStartApp");
                return true;
            }
            b(str);
            boolean a5 = a(file, d.f2195b);
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "isStartInstallerSuccess = " + a5);
            return a5;
        } catch (PackageManager.NameNotFoundException e6) {
            e6.printStackTrace();
            com.aggmoread.sdk.z.a.d.c("ApiDownloadHelper", "onCompleted enter , package name not found");
            this.f2177c.a(this.f2178d, -2001, "file not found error");
            return false;
        }
    }

    public void d() {
        if (this.f2185k == null) {
            this.f2185k = com.aggmoread.sdk.z.a.m.h.a(this.f2175a, "appInstallInfo");
        }
        if (TextUtils.isEmpty(this.f2176b) || this.f2185k.b(this.f2176b)) {
            return;
        }
        this.f2185k.b(this.f2176b, this.f2176b + "#" + System.currentTimeMillis() + "#" + this.f2186l);
    }

    public void e() {
        C0062b c0062b = new C0062b(this);
        this.f2180f = c0062b;
        com.aggmoread.sdk.z.a.j.a.a(0, c0062b);
    }

    void f() {
        e eVar = this.f2179e;
        if (eVar != null) {
            try {
                this.f2175a.unregisterReceiver(eVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
