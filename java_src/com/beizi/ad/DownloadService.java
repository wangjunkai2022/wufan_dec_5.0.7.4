package com.beizi.ad;

import android.app.DownloadManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.beizi.ad.internal.utilities.DownloadFactory;
import com.beizi.ad.internal.utilities.ReportEventUtil;
import com.beizi.ad.lance.ApkBean;
import com.beizi.ad.lance.a.h;
import com.beizi.ad.lance.a.l;
import com.facebook.common.util.f;
import com.join.mgps.receiver.BootReceiver_;
import java.io.File;
import java.util.HashMap;
import net.lingala.zip4j.util.e;
/* loaded from: classes2.dex */
public final class DownloadService extends Service {

    /* renamed from: g  reason: collision with root package name */
    private static DownloadFactory.Download f5167g;

    /* renamed from: a  reason: collision with root package name */
    private long f5168a;

    /* renamed from: b  reason: collision with root package name */
    private String f5169b;

    /* renamed from: c  reason: collision with root package name */
    private DownloadManager f5170c;

    /* renamed from: d  reason: collision with root package name */
    private a f5171d;

    /* renamed from: e  reason: collision with root package name */
    private b f5172e;

    /* renamed from: f  reason: collision with root package name */
    private c f5173f;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, ApkBean> f5174h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap<String, Boolean> f5175i;

    /* renamed from: j  reason: collision with root package name */
    private HashMap<Long, String> f5176j;

    /* renamed from: k  reason: collision with root package name */
    private ApkBean f5177k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
            int[] iArr = {0, 0, 0};
            Cursor cursor = null;
            try {
                try {
                    cursor = DownloadService.this.f5170c.query(new DownloadManager.Query().setFilterById(DownloadService.this.f5168a));
                    if (cursor != null && cursor.moveToFirst()) {
                        int i4 = cursor.getInt(cursor.getColumnIndex("status"));
                        l.a("DownloadService", "onChange status：" + i4);
                        if (i4 == 1) {
                            DownloadService downloadService = DownloadService.this;
                            downloadService.c(downloadService.f5177k);
                        }
                        iArr[0] = cursor.getInt(cursor.getColumnIndexOrThrow("bytes_so_far"));
                        iArr[1] = cursor.getInt(cursor.getColumnIndexOrThrow("total_size"));
                        iArr[2] = cursor.getInt(cursor.getColumnIndex("status"));
                        l.a("DownloadService", "progress：" + iArr[0] + e.F0 + iArr[1] + "");
                    }
                    if (cursor == null) {
                        return;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    if (cursor == null) {
                        return;
                    }
                }
                cursor.close();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                l.a("DownloadService", "onReceived...download finish...begin install！");
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                if (DownloadService.this.f5176j != null && DownloadService.this.f5174h != null) {
                    String str = (String) DownloadService.this.f5176j.get(Long.valueOf(longExtra));
                    if (DownloadService.this.f5175i != null) {
                        DownloadService.this.f5175i.put(str, Boolean.FALSE);
                    }
                    ApkBean apkBean = (ApkBean) DownloadService.this.f5174h.get(str);
                    if (apkBean != null) {
                        if (apkBean.getmFollowTrackExt() != null) {
                            ReportEventUtil.report(apkBean.getmFollowTrackExt().c());
                        }
                        if (Build.VERSION.SDK_INT < 26) {
                            DownloadService.this.a(context, Long.valueOf(longExtra), apkBean);
                        } else if (!context.getPackageManager().canRequestPackageInstalls()) {
                            DownloadService.this.a(context, Long.valueOf(longExtra), apkBean);
                        } else {
                            DownloadService.this.a(context, Long.valueOf(longExtra), apkBean);
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                if (intent.getAction().equals(BootReceiver_.f53984a)) {
                    String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                    l.a("DownloadService", "Install Success:" + schemeSpecificPart);
                    if (DownloadService.this.f5174h == null) {
                        return;
                    }
                    ApkBean apkBean = (ApkBean) DownloadService.this.f5174h.get(schemeSpecificPart);
                    if (apkBean != null) {
                        File file = new File(apkBean.getDownloadPath(), apkBean.getApkName());
                        if (file.exists()) {
                            file.delete();
                        }
                        if (apkBean.getmFollowTrackExt() != null) {
                            ReportEventUtil.report(apkBean.getmFollowTrackExt().e());
                        }
                        DownloadService.this.f5174h.remove(schemeSpecificPart);
                    }
                }
                if (DownloadService.this.f5174h == null || !DownloadService.this.f5174h.isEmpty()) {
                    return;
                }
                DownloadService.this.stopSelf();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        l.a("DownloadService", "DownloadService onCreate()");
        this.f5170c = (DownloadManager) getSystemService("download");
        this.f5171d = new a(new Handler());
        this.f5172e = new b();
        this.f5173f = new c();
        this.f5174h = new HashMap<>();
        this.f5175i = new HashMap<>();
        this.f5176j = new HashMap<>();
        a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        l.a("DownloadService", "DownloadService onDestroy()");
        b();
        c();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        Bundle bundleExtra;
        if (intent == null) {
            return 1;
        }
        l.a("DownloadService", "DownloadService onStartCommand()");
        if (intent != null) {
            try {
                if (intent.getExtras() != null && (bundleExtra = intent.getBundleExtra("data")) != null && bundleExtra.containsKey("apkBean")) {
                    this.f5177k = (ApkBean) bundleExtra.getSerializable("apkBean");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        a(this.f5177k);
        return super.onStartCommand(intent, i4, i5);
    }

    private void b() {
        getContentResolver().unregisterContentObserver(this.f5171d);
        unregisterReceiver(this.f5172e);
        unregisterReceiver(this.f5173f);
        l.a("DownloadService", "unregister()");
    }

    private void c() {
        DownloadFactory.Download download = f5167g;
        if (download != null) {
            download.destroy();
        }
        if (this.f5175i != null) {
            this.f5175i = null;
        }
        if (this.f5174h != null) {
            this.f5174h = null;
        }
        if (this.f5176j != null) {
            this.f5176j = null;
        }
        l.a("DownloadService", "releaseResources()");
    }

    private void d(ApkBean apkBean) {
        l.a("DownloadService", "BEGIN_INSTALL!");
        if (apkBean.getmFollowTrackExt() != null) {
            ReportEventUtil.report(apkBean.getmFollowTrackExt().d());
        }
    }

    private void a() {
        getContentResolver().registerContentObserver(Uri.parse("content://downloads/my_downloads"), true, this.f5171d);
        registerReceiver(this.f5172e, new IntentFilter(BootReceiver_.f53989f));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BootReceiver_.f53984a);
        intentFilter.addAction("android.intent.action.PACKAGE_INSTALL");
        intentFilter.addAction(BootReceiver_.f53987d);
        intentFilter.addDataScheme("package");
        registerReceiver(this.f5173f, intentFilter);
    }

    private synchronized void b(ApkBean apkBean) {
        Uri uriForFile;
        HashMap<String, Boolean> hashMap = this.f5175i;
        if (hashMap != null && hashMap.get(apkBean.getPkgName()) != null && this.f5175i.get(apkBean.getPkgName()).booleanValue()) {
            l.a("DownloadService", "downloading..." + apkBean.getPkgName() + "...please not repeat click");
            Toast.makeText(this, "正在下载…请勿重复点击", 0).show();
            return;
        }
        String downloadPath = apkBean.getDownloadPath();
        File file = new File(downloadPath, apkBean.getPkgName() + ".zip");
        if (file.exists()) {
            file.delete();
            l.a("DownloadService", "apkCacheFile......remove:" + file.exists());
        }
        File file2 = new File(apkBean.getDownloadPath(), apkBean.getApkName());
        if (file2.exists()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT < 24) {
                    uriForFile = Uri.fromFile(file2);
                } else {
                    uriForFile = FileProvider.getUriForFile(this, apkBean.getAuthorities(), file2);
                    intent.addFlags(3);
                }
                if (uriForFile != null) {
                    intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                    startActivity(intent);
                    d(apkBean);
                }
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("apkFile.exists():");
                sb.append(e5);
            }
        }
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(apkBean.getApkUrl()));
            request.setTitle(apkBean.getApkTittleName());
            request.setDescription(apkBean.getApkDesc());
            request.setNotificationVisibility(1);
            request.setDestinationUri(Uri.fromFile(file));
            request.setMimeType("application/vnd.android.package-archive");
            this.f5168a = this.f5170c.enqueue(request);
            l.b("DownloadService", "mReqId:" + this.f5168a);
            HashMap<Long, String> hashMap2 = this.f5176j;
            if (hashMap2 != null) {
                hashMap2.put(Long.valueOf(this.f5168a), apkBean.getPkgName());
            }
            HashMap<String, Boolean> hashMap3 = this.f5175i;
            if (hashMap3 != null) {
                hashMap3.put(apkBean.getPkgName(), Boolean.TRUE);
            }
            Toast.makeText(this, "已开始下载…", 0).show();
            l.a("DownloadService", "BEGIN_DOWNLOAD!");
            if (apkBean.getmFollowTrackExt() != null) {
                ReportEventUtil.report(apkBean.getmFollowTrackExt().b());
            }
        } catch (Exception e6) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DownloadManager download fail:");
            sb2.append(e6);
            try {
                if (!TextUtils.isEmpty(apkBean.getApkUrl()) && apkBean.getApkUrl().contains(f.f10923a)) {
                    HashMap<String, Boolean> hashMap4 = this.f5175i;
                    if (hashMap4 != null) {
                        hashMap4.put(apkBean.getPkgName(), Boolean.TRUE);
                    }
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.VIEW");
                    intent2.setData(Uri.parse(apkBean.getApkUrl()));
                    intent2.setFlags(268435456);
                    startActivity(intent2);
                }
            } catch (Exception e7) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("skip browser fail:");
                sb3.append(e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final ApkBean apkBean) {
        if (apkBean == null) {
            return;
        }
        l.a("DownloadService", "--appUpdate downloadApk start--");
        DownloadFactory.Download create = DownloadFactory.create();
        f5167g = create;
        create.register(new DownloadFactory.DownloadDelegate() { // from class: com.beizi.ad.DownloadService.1
            @Override // com.beizi.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public boolean onCheck(File file) {
                return true;
            }

            @Override // com.beizi.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public void onFail(int i4) {
                l.a("DownloadService", "--appUpdate downloadApk onFail--");
                try {
                    String apkUrl = apkBean.getApkUrl();
                    if (TextUtils.isEmpty(apkUrl) || !apkUrl.contains(f.f10923a)) {
                        return;
                    }
                    if (DownloadService.this.f5175i != null) {
                        DownloadService.this.f5175i.put(apkBean.getPkgName(), Boolean.TRUE);
                    }
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(apkUrl));
                    intent.setFlags(268435456);
                    DownloadService.this.startActivity(intent);
                } catch (Exception e5) {
                    l.a("DownloadService", "skip browser fail:" + e5);
                }
            }

            @Override // com.beizi.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public void onProgress(long j4, long j5) {
            }

            @Override // com.beizi.ad.internal.utilities.DownloadFactory.DownloadDelegate
            public void onSuccess(File file) {
                l.a("DownloadService", "--appUpdate downloadApk onSuccess--");
                if (DownloadService.this.f5175i != null) {
                    DownloadService.this.f5175i.put(apkBean.getPkgName(), Boolean.FALSE);
                }
                DownloadService.this.a(DownloadService.this.getApplicationContext(), -1L, apkBean);
            }
        });
        f5167g.start(new DownloadFactory.Request(apkBean.getApkUrl(), apkBean.getDownloadPath(), apkBean.getApkName()));
    }

    private void a(ApkBean apkBean) {
        if (apkBean == null) {
            return;
        }
        HashMap<String, ApkBean> hashMap = this.f5174h;
        if (hashMap != null) {
            hashMap.put(apkBean.getPkgName(), apkBean);
        }
        HashMap<String, Boolean> hashMap2 = this.f5175i;
        if (hashMap2 != null && hashMap2.get(apkBean.getPkgName()) == null) {
            l.a("DownloadService", "not have package status...");
            this.f5175i.put(apkBean.getPkgName(), Boolean.FALSE);
        }
        if (TextUtils.isEmpty(apkBean.getAuthorities())) {
            this.f5169b = getPackageName() + ".fileprovider";
        } else {
            this.f5169b = apkBean.getAuthorities();
        }
        h.a(apkBean.getDownloadPath());
        b(apkBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Long l4, ApkBean apkBean) {
        Uri uriForFile;
        try {
            String downloadPath = apkBean.getDownloadPath();
            File file = new File(downloadPath, apkBean.getPkgName() + ".zip");
            if (file.exists()) {
                File file2 = new File(apkBean.getDownloadPath(), apkBean.getApkName());
                file.renameTo(file2);
                l.a("DownloadService", "apkFile......raName:" + file2.exists());
            }
            Uri uri = null;
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.intent.action.VIEW");
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 23) {
                uriForFile = this.f5170c.getUriForDownloadedFile(l4.longValue());
                if (uriForFile != null) {
                    uriForFile = Uri.parse(uriForFile.toString().replace(".zip", ".apk"));
                    l.a("DownloadService", "uri......" + uriForFile);
                }
            } else if (i4 < 24) {
                File a5 = a(context, l4.longValue());
                if (a5 != null && (uri = Uri.fromFile(a5)) != null) {
                    uri = Uri.parse(uri.toString().replace(".zip", ".apk"));
                    l.a("DownloadService", "uri......" + uri);
                }
                uriForFile = uri;
            } else {
                uriForFile = FileProvider.getUriForFile(context, this.f5169b, new File(apkBean.getDownloadPath(), apkBean.getApkName()));
                intent.addFlags(3);
            }
            if (uriForFile != null) {
                intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                context.startActivity(intent);
                d(apkBean);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private static File a(Context context, long j4) {
        Cursor query;
        String path;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        File file = null;
        if (j4 != -1) {
            DownloadManager.Query query2 = new DownloadManager.Query();
            query2.setFilterById(j4);
            query2.setFilterByStatus(8);
            if (downloadManager != null && (query = downloadManager.query(query2)) != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex("local_uri"));
                    if (!TextUtils.isEmpty(string) && (path = Uri.parse(string).getPath()) != null) {
                        file = new File(path);
                    }
                }
                query.close();
            }
        }
        return file;
    }
}
