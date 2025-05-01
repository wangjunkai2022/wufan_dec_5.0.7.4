package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.MApplication;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.SingleGameAdBean;
import com.join.mgps.dto.SingleGameRunAdTextCfgBean;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: AdVipMainDialog.java */
/* loaded from: classes4.dex */
public class c extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f49272b;

    /* renamed from: c  reason: collision with root package name */
    private SimpleDraweeView f49273c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49274d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49275e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f49276f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f49277g;

    /* renamed from: h  reason: collision with root package name */
    private Context f49278h;

    /* renamed from: i  reason: collision with root package name */
    private String f49279i;

    /* renamed from: j  reason: collision with root package name */
    private String f49280j;

    /* renamed from: k  reason: collision with root package name */
    private String f49281k;

    /* renamed from: l  reason: collision with root package name */
    private String f49282l;

    /* renamed from: m  reason: collision with root package name */
    private String f49283m;

    /* renamed from: n  reason: collision with root package name */
    private String f49284n;

    /* renamed from: o  reason: collision with root package name */
    private String f49285o;

    /* renamed from: p  reason: collision with root package name */
    private PrefDef_ f49286p;

    /* compiled from: AdVipMainDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f49287b;

        a(DownloadTask downloadTask) {
            this.f49287b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String d5 = c.this.f49286p.singleGameShowDialog().d();
            if (com.join.mgps.Util.g2.h(d5)) {
                HashMap hashMap = new HashMap();
                hashMap.put(c.this.f49279i, new SingleGameAdBean(MApplication.f1495v1, System.currentTimeMillis()));
                c.this.f49286p.singleGameShowDialog().g(JsonMapper.getInstance().toJson(hashMap));
            } else {
                new HashMap();
                Map map = (Map) JsonMapper.getInstance().fromJson(d5, JsonMapper.getInstance().getTypeFactory().constructParametricType(HashMap.class, String.class, SingleGameAdBean.class));
                map.put(c.this.f49279i, new SingleGameAdBean(MApplication.f1495v1, System.currentTimeMillis()));
                c.this.f49286p.singleGameShowDialog().g(JsonMapper.getInstance().toJson(map));
            }
            c.this.dismiss();
            Bitmap m4 = ImageLoader.q().m(this.f49287b.getPortraitURL());
            if (m4 == null) {
                m4 = c.this.g(this.f49287b.getPortraitURL());
            }
            com.join.mgps.Util.w1.b(c.this.f49278h, this.f49287b.getShowName(), this.f49287b.getCrc_link_type_val(), m4);
        }
    }

    public c(@NonNull Context context) {
        super(context);
        this.f49278h = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap g(String str) {
        e0.c cVar = (e0.c) Fresco.getImagePipelineFactory().l().c(new com.facebook.cache.common.i(Uri.parse(str).toString()));
        if (cVar == null) {
            return null;
        }
        File c5 = cVar.c();
        if (c5.exists()) {
            return BitmapFactory.decodeFile(c5.getPath());
        }
        return null;
    }

    public String e() {
        return this.f49284n;
    }

    public String f() {
        return this.f49285o;
    }

    public void h(View.OnClickListener onClickListener) {
        this.f49276f.setOnClickListener(onClickListener);
    }

    public void i(View.OnClickListener onClickListener) {
        this.f49273c.setOnClickListener(onClickListener);
    }

    public void j(View.OnClickListener onClickListener) {
        this.f49277g.setOnClickListener(onClickListener);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.height = defaultDisplay.getHeight();
        window.setAttributes(attributes);
        setContentView(R.layout.dialog_vip_app_vertical_view);
        this.f49272b = (LinearLayout) findViewById(R.id.rootLl);
        this.f49273c = (SimpleDraweeView) findViewById(R.id.mainDialogAdImg);
        this.f49274d = (TextView) findViewById(R.id.mainDialogContenTv);
        this.f49275e = (TextView) findViewById(R.id.mainDialogTopTv);
        this.f49276f = (TextView) findViewById(R.id.mainDialogCancelTv);
        this.f49277g = (TextView) findViewById(R.id.mainDialogOkIv);
        SingleGameRunAdTextCfgBean singleGameRunAdTextCfgBean = MApplication.f1492p0;
        if (singleGameRunAdTextCfgBean != null) {
            this.f49285o = singleGameRunAdTextCfgBean.getUrl();
            this.f49280j = MApplication.f1492p0.getPic();
            this.f49281k = MApplication.f1492p0.getTitle();
            this.f49282l = MApplication.f1492p0.getBtn_l();
            this.f49283m = MApplication.f1492p0.getBtn_r();
            this.f49284n = MApplication.f1492p0.getBtn_url();
        }
        if (!com.join.mgps.Util.g2.h(this.f49280j)) {
            this.f49273c.setImageURI(this.f49280j);
        }
        if (!com.join.mgps.Util.g2.h(this.f49281k)) {
            this.f49274d.setText(this.f49281k);
        }
        if (!com.join.mgps.Util.g2.h(this.f49282l)) {
            this.f49276f.setText(this.f49282l);
        }
        if (!com.join.mgps.Util.g2.h(this.f49283m)) {
            this.f49277g.setText(this.f49283m);
        }
        if (com.join.mgps.Util.g2.h(this.f49279i)) {
            return;
        }
        DownloadTask F = p1.f.K().F(this.f49279i);
        if (F.getUrl().endsWith(".apk") || "androidobb".equals(F.getRomType()) || "46".equals(F.getRomType())) {
            String url = F.getUrl();
            char[] charArray = url.substring(url.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1).replace(".apk", "").toCharArray();
            String.valueOf(charArray[charArray.length - 1]);
            String packageName = F.getPackageName();
            if (com.join.mgps.Util.w1.d(this.f49278h, F.getCrc_link_type_val())) {
                this.f49275e.setVisibility(8);
            } else if (!com.join.mgps.Util.g2.h(packageName) && com.join.mgps.Util.g.e(this.f49278h, packageName)) {
                this.f49275e.setVisibility(0);
            } else {
                this.f49275e.setVisibility(8);
            }
        }
        this.f49275e.setOnClickListener(new a(F));
    }

    public c(@NonNull Context context, String str) {
        super(context);
        this.f49278h = context;
        this.f49279i = str;
        this.f49286p = new PrefDef_(context);
    }
}
