package com.aggmoread.sdk.z.a.t;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.aggmoread.sdk.z.a.m.m;
import com.aggmoread.sdk.z.a.t.h;
import com.aggmoread.sdk.z.a.t.i;
import com.join.mgps.receiver.BootReceiver_;
import java.io.File;
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private h f2595a;

    /* renamed from: b  reason: collision with root package name */
    private DownloadManager f2596b;

    /* renamed from: c  reason: collision with root package name */
    private long f2597c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f2598d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f2599e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f2600f;

    /* renamed from: g  reason: collision with root package name */
    private i f2601g;

    /* renamed from: h  reason: collision with root package name */
    private String f2602h;

    /* renamed from: i  reason: collision with root package name */
    private String f2603i;

    /* renamed from: j  reason: collision with root package name */
    private f f2604j;

    /* renamed from: k  reason: collision with root package name */
    private Context f2605k;

    /* loaded from: classes2.dex */
    class a implements DownloadListener {
        a() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
            j.this.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j.this.f2595a.canGoBack()) {
                j.this.f2595a.goBack();
            } else {
                j.this.f2604j.onClose();
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements h.d {
        c() {
        }

        @Override // com.aggmoread.sdk.z.a.t.h.d
        public void a() {
            j.this.a();
            j.this.g();
        }
    }

    /* loaded from: classes2.dex */
    class d implements i.a {
        d() {
        }

        @Override // com.aggmoread.sdk.z.a.t.i.a
        public void a() {
            j.this.g();
        }

        @Override // com.aggmoread.sdk.z.a.t.i.a
        public void a(long j4) {
            if (j.this.f2600f != null) {
                j.this.f2600f.setTextSize(18.0f);
                j.this.f2600f.setText("关闭");
            }
            if (j4 <= 600) {
                j.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f2610a;

        e(long j4) {
            this.f2610a = j4;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getLongExtra("extra_download_id", -1L) == this.f2610a) {
                j.this.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f2612a = new a();

        /* loaded from: classes2.dex */
        static class a implements f {
            a() {
            }

            @Override // com.aggmoread.sdk.z.a.t.j.f
            public boolean canSkip() {
                return false;
            }

            @Override // com.aggmoread.sdk.z.a.t.j.f
            public void onClose() {
            }

            @Override // com.aggmoread.sdk.z.a.t.j.f
            public void onShow() {
            }
        }

        boolean canSkip();

        void onClose();

        void onShow();
    }

    public j(Context context, String str, String str2, f fVar) {
        this.f2602h = "";
        this.f2604j = f.f2612a;
        this.f2605k = context;
        this.f2602h = str;
        this.f2603i = str2;
        this.f2604j = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        i iVar = this.f2601g;
        if (iVar != null) {
            iVar.cancel();
            this.f2601g = null;
        }
    }

    private void a(long j4) {
        IntentFilter intentFilter = new IntentFilter(BootReceiver_.f53989f);
        e eVar = new e(j4);
        this.f2598d = eVar;
        this.f2605k.registerReceiver(eVar, intentFilter, "android.intent.permission.DOWNLOAD_COMPLETE", m.a());
    }

    private void a(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        File f5 = f();
        if (f5.exists()) {
            intent.setDataAndType(Uri.fromFile(f5), "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            this.f2605k.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            Uri parse = Uri.parse(str);
            this.f2596b = (DownloadManager) this.f2605k.getSystemService("download");
            DownloadManager.Request request = new DownloadManager.Request(parse);
            request.setAllowedNetworkTypes(3);
            request.setAllowedOverRoaming(false);
            request.setMimeType(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str)));
            request.setNotificationVisibility(1);
            request.setTitle("download...");
            Toast.makeText(this.f2605k, "正在下载APP", 1).show();
            request.setVisibleInDownloadsUi(true);
            String str2 = Environment.DIRECTORY_DOWNLOADS;
            request.setDestinationInExternalPublicDir(str2, System.currentTimeMillis() + ".apk");
            long enqueue = this.f2596b.enqueue(request);
            this.f2597c = enqueue;
            a(enqueue);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Uri uriForDownloadedFile = this.f2596b.getUriForDownloadedFile(this.f2597c);
        if (uriForDownloadedFile != null) {
            if (Build.VERSION.SDK_INT < 24) {
                a(uriForDownloadedFile);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForDownloadedFile, "application/vnd.android.package-archive");
            intent.addFlags(1);
            intent.addFlags(268435456);
            this.f2605k.startActivity(intent);
        }
    }

    private File f() {
        File file = null;
        if (this.f2597c != -1) {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(this.f2597c);
            query.setFilterByStatus(8);
            Cursor query2 = this.f2596b.query(query);
            if (query2 != null) {
                if (query2.moveToFirst()) {
                    String string = query2.getString(query2.getColumnIndex("local_uri"));
                    if (!TextUtils.isEmpty(string)) {
                        file = new File(Uri.parse(string).getPath());
                    }
                }
                query2.close();
            }
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f2604j.canSkip();
        this.f2600f.setText("×");
        this.f2600f.setTextSize(30.0f);
        this.f2600f.setOnClickListener(new b());
    }

    public View a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2599e = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        this.f2599e.setBackgroundColor(Color.parseColor("#dddddd"));
        this.f2599e.addView(linearLayout2);
        this.f2600f = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f2600f.setPadding(30, 8, 30, 8);
        this.f2600f.setLayoutParams(layoutParams);
        this.f2600f.setTextColor(Color.parseColor("#FFFFFF"));
        linearLayout2.addView(this.f2600f);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        textView.setPadding(0, 0, 30, 0);
        textView.setTextSize(18.0f);
        textView.setText(this.f2602h);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        linearLayout2.addView(textView);
        h hVar = new h(context);
        this.f2595a = hVar;
        hVar.a(new c());
        this.f2595a.a(textView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        this.f2595a.setLayoutParams(layoutParams3);
        this.f2599e.addView(this.f2595a);
        i iVar = new i(new d(), 3000L, 1000L);
        this.f2601g = iVar;
        iVar.start();
        return this.f2599e;
    }

    public void b() {
        BroadcastReceiver broadcastReceiver = this.f2598d;
        if (broadcastReceiver != null) {
            this.f2605k.unregisterReceiver(broadcastReceiver);
        }
        h hVar = this.f2595a;
        if (hVar != null) {
            hVar.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            ((ViewGroup) this.f2595a.getParent()).removeView(this.f2595a);
            this.f2595a.removeAllViews();
            this.f2595a.destroy();
            this.f2595a = null;
        }
    }

    public boolean c() {
        h hVar = this.f2595a;
        if (hVar == null || !hVar.canGoBack()) {
            return false;
        }
        this.f2595a.goBack();
        return true;
    }

    public void e() {
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
            g();
        }
        if (!this.f2603i.startsWith("http:") && !this.f2603i.startsWith("https:")) {
            this.f2605k.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f2603i)));
            this.f2604j.onClose();
            this.f2604j.onShow();
            this.f2595a.setDownloadListener(new a());
        }
        this.f2595a.loadUrl(this.f2603i);
        this.f2604j.onShow();
        this.f2595a.setDownloadListener(new a());
    }
}
