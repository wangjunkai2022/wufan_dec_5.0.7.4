package com.beizi.ad.internal.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.beizi.ad.AdActivity;
import com.beizi.ad.DownloadService;
import com.beizi.ad.R;
import com.beizi.ad.internal.g;
import com.beizi.ad.internal.utilities.ImageManager;
import com.beizi.ad.internal.utilities.ReportEventUtil;
import com.beizi.ad.internal.utilities.WebviewUtil;
import com.beizi.ad.lance.ApkBean;
import com.beizi.ad.lance.a.i;
import com.beizi.ad.lance.a.n;
import com.facebook.common.util.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class BeiZiDownloadDialogActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f5648a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f5649b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f5650c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f5651d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f5652e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f5653f;

    /* renamed from: g  reason: collision with root package name */
    private ExpandableListView f5654g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f5655h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f5656i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f5657j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f5658k;

    /* renamed from: l  reason: collision with root package name */
    private ApkBean f5659l;

    /* renamed from: m  reason: collision with root package name */
    private int f5660m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f5661n = 1;

    /* renamed from: o  reason: collision with root package name */
    private List<String> f5662o;

    /* renamed from: p  reason: collision with root package name */
    private String f5663p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5664q;

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f5661n == 2 && !TextUtils.isEmpty(this.f5663p) && this.f5663p.startsWith(f.f10923a)) {
            Class a5 = AdActivity.a();
            try {
                WebView webView = new WebView(this);
                WebviewUtil.setWebViewSettings(webView);
                webView.loadUrl(this.f5663p, i.a());
                a.f5750a.add(webView);
                Intent intent = new Intent(g.a().e(), a5);
                intent.setFlags(268435456);
                intent.putExtra("ACTIVITY_TYPE", "DOWNLOADBROWSER");
                intent.putExtra("ACTIVITY_CAN_JUMP", this.f5664q);
                startActivity(intent);
            } catch (Exception unused) {
                a.f5750a.remove();
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.beizi_download_dialog);
        setFinishOnTouchOutside(false);
        a();
        b();
        c();
        d();
    }

    private void b() {
        try {
            this.f5648a = (RelativeLayout) findViewById(R.id.beizi_download_dialog_container_rl);
            this.f5652e = (ImageView) findViewById(R.id.beizi_download_dialog_close_iv);
            this.f5653f = (ImageView) findViewById(R.id.beizi_download_dialog_icon_iv);
            this.f5649b = (TextView) findViewById(R.id.beizi_download_dialog_name_tv);
            this.f5650c = (TextView) findViewById(R.id.beizi_download_dialog_version_tv);
            this.f5651d = (TextView) findViewById(R.id.beizi_download_dialog_developer_tv);
            this.f5654g = (ExpandableListView) findViewById(R.id.beizi_download_dialog_expand_lv);
            this.f5655h = (LinearLayout) findViewById(R.id.beizi_download_dialog_download_container_ll);
            this.f5656i = (LinearLayout) findViewById(R.id.beizi_download_dialog_market_container_ll);
            this.f5657j = (TextView) findViewById(R.id.beizi_download_dialog_market_cancel_tv);
            this.f5658k = (TextView) findViewById(R.id.beizi_download_dialog_market_confirm_tv);
            this.f5654g.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.1
                @Override // android.widget.ExpandableListView.OnGroupExpandListener
                public void onGroupExpand(int i4) {
                    try {
                        if (BeiZiDownloadDialogActivity.this.f5660m != -1) {
                            BeiZiDownloadDialogActivity.this.f5654g.collapseGroup(BeiZiDownloadDialogActivity.this.f5660m);
                        }
                        BeiZiDownloadDialogActivity.this.f5660m = i4;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void c() {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            Point point = new Point();
            getWindow().getWindowManager().getDefaultDisplay().getSize(point);
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = point.x;
            double d5 = point.y;
            Double.isNaN(d5);
            attributes.height = (int) (d5 * 0.45d);
            attributes.gravity = 80;
            window.setAttributes(attributes);
            layoutParams.width = point.x;
            double d6 = point.y;
            Double.isNaN(d6);
            layoutParams.height = (int) (d6 * 0.45d);
            layoutParams.gravity = 80;
            this.f5648a.setLayoutParams(layoutParams);
            this.f5648a.requestLayout();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void d() {
        try {
            if (this.f5659l == null) {
                return;
            }
            if (this.f5661n == 1) {
                this.f5652e.setVisibility(0);
                this.f5652e.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BeiZiDownloadDialogActivity.this.finish();
                    }
                });
                this.f5655h.setVisibility(0);
                this.f5655h.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BeiZiDownloadDialogActivity.this.e();
                        BeiZiDownloadDialogActivity.this.finish();
                    }
                });
                this.f5656i.setVisibility(8);
            } else {
                this.f5652e.setVisibility(8);
                this.f5655h.setVisibility(8);
                this.f5656i.setVisibility(0);
                this.f5657j.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BeiZiDownloadDialogActivity.this.f();
                        BeiZiDownloadDialogActivity.this.finish();
                    }
                });
                this.f5658k.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BeiZiDownloadDialogActivity.this.e();
                        BeiZiDownloadDialogActivity.this.finish();
                    }
                });
            }
            if (this.f5653f != null && !TextUtils.isEmpty(this.f5659l.getAppIconURL())) {
                try {
                    ImageManager.with(null).getBitmap(this.f5659l.getAppIconURL(), new ImageManager.BitmapLoadedListener() { // from class: com.beizi.ad.internal.activity.BeiZiDownloadDialogActivity.6
                        @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                        public void onBitmapLoadFailed() {
                        }

                        @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                        public void onBitmapLoaded(Bitmap bitmap) {
                            try {
                                BeiZiDownloadDialogActivity.this.f5653f.setImageBitmap(bitmap);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    });
                } catch (Exception unused) {
                }
            }
            if (this.f5649b != null && !TextUtils.isEmpty(this.f5659l.getApkTittleName())) {
                this.f5649b.setText(this.f5659l.getApkTittleName());
            }
            if (this.f5650c != null && !TextUtils.isEmpty(this.f5659l.getAppVersion())) {
                TextView textView = this.f5650c;
                textView.setText("版本号 ：" + this.f5659l.getAppVersion());
            }
            if (this.f5651d != null && !TextUtils.isEmpty(this.f5659l.getAppDeveloper())) {
                TextView textView2 = this.f5651d;
                textView2.setText("开发者 ：" + this.f5659l.getAppDeveloper());
            }
            ArrayList arrayList = new ArrayList();
            com.beizi.ad.internal.download.b bVar = new com.beizi.ad.internal.download.b();
            bVar.a("应用权限");
            if (!TextUtils.isEmpty(this.f5659l.getAppPermissionsUrl())) {
                bVar.c(this.f5659l.getAppPermissionsUrl());
                bVar.b("h5");
            } else if (!TextUtils.isEmpty(this.f5659l.getAppPermissionsDesc())) {
                bVar.c(this.f5659l.getAppPermissionsDesc());
                bVar.b("text");
            }
            arrayList.add(bVar);
            com.beizi.ad.internal.download.b bVar2 = new com.beizi.ad.internal.download.b();
            bVar2.a("隐私协议");
            if (!TextUtils.isEmpty(this.f5659l.getAppPrivacyUrl())) {
                bVar2.c(this.f5659l.getAppPrivacyUrl());
                bVar2.b("h5");
            }
            arrayList.add(bVar2);
            com.beizi.ad.internal.download.b bVar3 = new com.beizi.ad.internal.download.b();
            bVar3.a("产品功能介绍");
            if (!TextUtils.isEmpty(this.f5659l.getAppintro())) {
                bVar3.c(this.f5659l.getAppintro());
                bVar3.b("text");
            }
            arrayList.add(bVar3);
            this.f5654g.setAdapter(new com.beizi.ad.internal.download.a(this, arrayList));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f5659l == null) {
                return;
            }
            if (this.f5661n == 2) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f5659l.getApkUrl()));
                intent.setFlags(268435456);
                startActivity(intent);
                List<String> list = this.f5662o;
                if (list != null) {
                    ReportEventUtil.report(list);
                }
            } else if (n.a(this)) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("apkBean", this.f5659l);
                Intent intent2 = new Intent(this, DownloadService.class);
                intent2.putExtra("data", bundle);
                startService(intent2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a() {
        try {
            Bundle bundleExtra = getIntent().getBundleExtra("data");
            if (bundleExtra == null) {
                return;
            }
            if (bundleExtra.containsKey("apkBean")) {
                this.f5659l = (ApkBean) bundleExtra.getSerializable("apkBean");
            }
            if (bundleExtra.containsKey("type")) {
                this.f5661n = bundleExtra.getInt("type");
            }
            if (bundleExtra.containsKey("openList")) {
                this.f5662o = bundleExtra.getStringArrayList("openList");
            }
            if (bundleExtra.containsKey("landingPageUrl")) {
                this.f5663p = bundleExtra.getString("landingPageUrl");
            }
            if (bundleExtra.containsKey("isCanJump")) {
                this.f5664q = bundleExtra.getBoolean("isCanJump", false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
