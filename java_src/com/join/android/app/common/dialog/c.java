package com.join.android.app.common.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: AddShortcutDialog.java */
/* loaded from: classes3.dex */
public class c extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f14554b;

    /* renamed from: c  reason: collision with root package name */
    private SimpleDraweeView f14555c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDraweeView f14556d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f14557e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f14558f;

    /* renamed from: g  reason: collision with root package name */
    private String f14559g;

    /* renamed from: h  reason: collision with root package name */
    private String f14560h;

    /* renamed from: i  reason: collision with root package name */
    private String f14561i;

    /* renamed from: j  reason: collision with root package name */
    private Bitmap f14562j;

    /* renamed from: k  reason: collision with root package name */
    private DownloadTask f14563k;

    /* renamed from: l  reason: collision with root package name */
    private Context f14564l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f14565m;

    public c(@NonNull Context context, String str, String str2, String str3, DownloadTask downloadTask) {
        super(context);
        this.f14565m = true;
        this.f14564l = context;
        this.f14559g = str;
        this.f14560h = str2;
        this.f14561i = str3;
        this.f14563k = downloadTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f14563k.setNotCheckAddShortcut(true);
        UtilsMy.U3(this.f14564l, this.f14563k, 0);
        this.f14563k.setNotCheckAddShortcut(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        dismiss();
        if (this.f14565m) {
            new Handler().postDelayed(new Runnable() { // from class: com.join.android.app.common.dialog.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.d();
                }
            }, 200L);
        }
    }

    private Bitmap f(String str) {
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

    public Bitmap c() {
        if (this.f14562j == null) {
            this.f14562j = BitmapFactory.decodeResource(this.f14564l.getResources(), R.drawable.icon);
        }
        return this.f14562j;
    }

    public void g(View.OnClickListener onClickListener) {
        this.f14558f.setOnClickListener(onClickListener);
    }

    public void h(View.OnClickListener onClickListener) {
        this.f14557e.setOnClickListener(onClickListener);
    }

    public void i(boolean z4) {
        this.f14565m = z4;
        show();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = this.f14564l.getResources().getDimensionPixelSize(R.dimen.wdp672);
        attributes.width = this.f14564l.getResources().getDimensionPixelSize(R.dimen.wdp506);
        attributes.gravity = 17;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_add_shortcut_view);
        this.f14554b = (ImageView) findViewById(R.id.shortcutCloseIv);
        this.f14555c = (SimpleDraweeView) findViewById(R.id.shortcutIconOneIv);
        this.f14556d = (SimpleDraweeView) findViewById(R.id.shortcutIconTwoIv);
        this.f14557e = (TextView) findViewById(R.id.shortcutCreateTv);
        this.f14558f = (TextView) findViewById(R.id.shortcutNoMoreReminderTv);
        MobclickAgent.onEvent(this.f14564l, "showIconAddModal");
        Bitmap m4 = ImageLoader.q().m(this.f14561i);
        this.f14562j = m4;
        if (m4 == null) {
            this.f14562j = f(this.f14561i);
        }
        if (!g2.h(this.f14561i)) {
            this.f14555c.setImageURI(this.f14561i);
            this.f14556d.setImageURI(this.f14561i);
        }
        this.f14554b.setOnClickListener(new View.OnClickListener() { // from class: com.join.android.app.common.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.e(view);
            }
        });
    }
}
