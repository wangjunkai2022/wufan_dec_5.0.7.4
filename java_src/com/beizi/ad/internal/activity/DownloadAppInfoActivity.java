package com.beizi.ad.internal.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.beizi.ad.R;
import com.beizi.ad.internal.download.BeiZiWebView;
import com.facebook.common.util.f;
/* loaded from: classes2.dex */
public class DownloadAppInfoActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f5721a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f5722b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f5723c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f5724d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f5725e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f5726f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f5727g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f5728h;

    /* renamed from: i  reason: collision with root package name */
    private View f5729i;

    /* renamed from: j  reason: collision with root package name */
    private View f5730j;

    /* renamed from: k  reason: collision with root package name */
    private View f5731k;

    /* renamed from: l  reason: collision with root package name */
    private int f5732l = 0;

    /* renamed from: m  reason: collision with root package name */
    private String f5733m = "";

    /* renamed from: n  reason: collision with root package name */
    private String f5734n = "";

    /* renamed from: o  reason: collision with root package name */
    private String f5735o = "";

    /* renamed from: p  reason: collision with root package name */
    private String f5736p = "";

    /* renamed from: q  reason: collision with root package name */
    private ScrollView f5737q;

    /* renamed from: r  reason: collision with root package name */
    private ScrollView f5738r;

    /* renamed from: s  reason: collision with root package name */
    private ScrollView f5739s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f5740t;

    /* renamed from: u  reason: collision with root package name */
    private TextView f5741u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f5742v;

    /* renamed from: w  reason: collision with root package name */
    private BeiZiWebView f5743w;

    /* renamed from: x  reason: collision with root package name */
    private BeiZiWebView f5744x;

    /* renamed from: y  reason: collision with root package name */
    private BeiZiWebView f5745y;

    private void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.f5734n = extras.getString("privacy_content_key");
        this.f5736p = extras.getString("title_content_key");
        this.f5733m = extras.getString("permission_content_key");
        this.f5735o = extras.getString("intro_content_key");
        this.f5732l = extras.getInt("from_position_key");
    }

    private void c() {
        if (!TextUtils.isEmpty(this.f5736p)) {
            this.f5722b.setText(this.f5736p);
        }
        this.f5721a.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.DownloadAppInfoActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DownloadAppInfoActivity.this.finish();
            }
        });
        this.f5723c.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.DownloadAppInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DownloadAppInfoActivity.this.a(0);
            }
        });
        this.f5724d.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.DownloadAppInfoActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DownloadAppInfoActivity.this.a(1);
            }
        });
        this.f5725e.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.activity.DownloadAppInfoActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DownloadAppInfoActivity.this.a(2);
            }
        });
    }

    private void d() {
        TextView textView = this.f5728h;
        int i4 = R.color.appinfo_tab_unselected_color;
        textView.setTextColor(ContextCompat.getColor(this, i4));
        this.f5731k.setVisibility(4);
        this.f5726f.setTextColor(ContextCompat.getColor(this, i4));
        this.f5729i.setVisibility(4);
        this.f5727g.setTextColor(ContextCompat.getColor(this, i4));
        this.f5730j.setVisibility(4);
        this.f5739s.setVisibility(8);
        this.f5745y.setVisibility(8);
        this.f5742v.setVisibility(8);
        this.f5737q.setVisibility(8);
        this.f5740t.setVisibility(8);
        this.f5743w.setVisibility(8);
        this.f5738r.setVisibility(8);
        this.f5741u.setVisibility(8);
        this.f5744x.setVisibility(8);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        b();
        setContentView(R.layout.beizi_download_appinfo_activity);
        a();
        a(this.f5732l);
        c();
    }

    private void a() {
        this.f5721a = (ImageView) findViewById(R.id.beizi_download_appinfo_back);
        this.f5722b = (TextView) findViewById(R.id.beizi_download_appinfo_title);
        this.f5723c = (LinearLayout) findViewById(R.id.beizi_appinfo_permission_layout);
        this.f5726f = (TextView) findViewById(R.id.beizi_appinfo_permission_textview);
        this.f5729i = findViewById(R.id.beizi_appinfo_permission_below_line);
        this.f5724d = (LinearLayout) findViewById(R.id.beizi_appinfo_privacy_layout);
        this.f5727g = (TextView) findViewById(R.id.beizi_appinfo_privacy_textview);
        this.f5730j = findViewById(R.id.beizi_appinfo_privacy_below_line);
        this.f5725e = (LinearLayout) findViewById(R.id.beizi_appinfo_intro_layout);
        this.f5728h = (TextView) findViewById(R.id.beizi_appinfo_intro_textview);
        this.f5731k = findViewById(R.id.beizi_appinfo_intro_below_line);
        this.f5737q = (ScrollView) findViewById(R.id.beizi_download_appinfo_persmission_content_scrollview);
        this.f5740t = (TextView) findViewById(R.id.beizi_download_appinfo_persmission_content_textview);
        this.f5743w = (BeiZiWebView) findViewById(R.id.beizi_download_appinfo_persmission_content_webview);
        this.f5738r = (ScrollView) findViewById(R.id.beizi_download_appinfo_privacy_content_scrollview);
        this.f5741u = (TextView) findViewById(R.id.beizi_download_appinfo_privacy_content_textview);
        this.f5744x = (BeiZiWebView) findViewById(R.id.beizi_download_appinfo_privacy_content_webview);
        this.f5739s = (ScrollView) findViewById(R.id.beizi_download_appinfo_intro_content_scrollview);
        this.f5742v = (TextView) findViewById(R.id.beizi_download_appinfo_intro_content_textview);
        this.f5745y = (BeiZiWebView) findViewById(R.id.beizi_download_appinfo_intro_content_webview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        if (i4 == 2) {
            d();
            a(this.f5728h, this.f5731k, this.f5735o, this.f5742v, this.f5739s, this.f5745y);
        } else if (i4 == 1) {
            d();
            a(this.f5727g, this.f5730j, this.f5734n, this.f5741u, this.f5738r, this.f5744x);
        } else {
            d();
            a(this.f5726f, this.f5729i, this.f5733m, this.f5740t, this.f5737q, this.f5743w);
        }
    }

    private void a(TextView textView, View view, String str, TextView textView2, ScrollView scrollView, WebView webView) {
        int i4 = R.color.appinfo_tab_selected_color;
        textView.setTextColor(ContextCompat.getColor(this, i4));
        view.setBackgroundColor(ContextCompat.getColor(this, i4));
        view.setVisibility(0);
        if (str.startsWith(f.f10923a)) {
            textView2.setText("");
            scrollView.setVisibility(8);
            webView.setVisibility(0);
            webView.loadUrl(str);
            return;
        }
        textView2.setText(str);
        textView2.setVisibility(0);
        scrollView.setVisibility(0);
        webView.setVisibility(8);
    }
}
