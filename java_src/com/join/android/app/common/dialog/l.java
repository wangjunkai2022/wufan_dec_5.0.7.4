package com.join.android.app.common.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.w1;
import com.join.mgps.adapter.o;
import com.join.mgps.enums.Dtype;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: ShowBottomDialog.java */
/* loaded from: classes3.dex */
public class l extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f14596b;

    /* renamed from: c  reason: collision with root package name */
    private DownloadTask f14597c;

    /* renamed from: d  reason: collision with root package name */
    private o f14598d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f14599e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f14600f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f14601g;

    /* compiled from: ShowBottomDialog.java */
    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f14602b;

        a(Dialog dialog) {
            this.f14602b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f14602b.dismiss();
        }
    }

    /* compiled from: ShowBottomDialog.java */
    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f14604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Dialog f14605c;

        b(boolean z4, Dialog dialog) {
            this.f14604b = z4;
            this.f14605c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f14604b) {
                if (com.join.android.app.common.utils.e.l0(l.this.f14596b).d(l.this.f14596b, l.this.f14597c.getPackageName())) {
                    com.join.android.app.common.utils.e.l0(l.this.f14596b).f0(l.this.f14596b, l.this.f14597c.getPackageName());
                } else {
                    l.this.f14598d.a(l.this.f14597c);
                    UtilsMy.x4(l.this.f14597c);
                    l.this.f14598d.notifyDataSetChanged();
                }
            } else {
                l.this.f14598d.a(l.this.f14597c);
                UtilsMy.x4(l.this.f14597c);
                l.this.f14598d.notifyDataSetChanged();
            }
            this.f14605c.dismiss();
        }
    }

    public l(@NonNull Context context, DownloadTask downloadTask, o oVar) {
        super(context);
        this.f14596b = context;
        this.f14597c = downloadTask;
        this.f14598d = oVar;
    }

    private Bitmap d(String str) {
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismiss();
        int id = view.getId();
        if (id == R.id.showAddShortcutTv) {
            Bitmap m4 = ImageLoader.q().m(this.f14597c.getPortraitURL());
            if (m4 == null) {
                m4 = d(this.f14597c.getPortraitURL());
            }
            w1.b(this.f14596b, this.f14597c.getShowName(), this.f14597c.getCrc_link_type_val(), m4);
        } else if (id != R.id.showDeleteGameTv) {
            if (id != R.id.showGameDetailTv) {
                return;
            }
            if (this.f14597c.getFileType() == null || !this.f14597c.getFileType().equals(Dtype.chajian.name())) {
                this.f14597c.set_from_type(127);
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(this.f14596b, this.f14597c);
            }
        } else {
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f14596b, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
            TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除游戏");
            boolean z4 = false;
            String fileType = this.f14597c.getFileType();
            if (fileType != null && fileType.equals(Dtype.android.name())) {
                if (com.join.android.app.common.utils.e.l0(this.f14596b).d(this.f14596b, this.f14597c.getPackageName())) {
                    textView.setText("你确定要卸载该游戏？");
                    button.setText("卸载");
                } else {
                    textView.setText("你确定要删除该游戏？");
                    button.setText("删除");
                }
                z4 = true;
            } else {
                textView.setText("你确定要删除该游戏及文件？");
                button.setText("删除");
            }
            ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new a(oVar));
            button.setOnClickListener(new b(z4, oVar));
            oVar.show();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Window window = getWindow();
        window.setWindowAnimations(R.style.PopupAnimation_100);
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(80);
        setContentView(R.layout.dialog_show_bottom_view);
        MobclickAgent.onEvent(this.f14596b, "showMenuMyGame");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f14599e = (TextView) findViewById(R.id.showAddShortcutTv);
        this.f14600f = (TextView) findViewById(R.id.showGameDetailTv);
        this.f14601g = (TextView) findViewById(R.id.showDeleteGameTv);
        DownloadTask F = p1.f.K().F(this.f14597c.getCrc_link_type_val());
        if ((F != null && F.getUrl().endsWith(".apk")) || "androidobb".equals(F.getRomType()) || "46".equals(F.getRomType())) {
            String url = F.getUrl();
            url.substring(url.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1).replace(".apk", "").toCharArray();
            String packageName = F.getPackageName();
            if (!g2.h(packageName) && com.join.mgps.Util.g.e(this.f14596b, packageName) && g2.i(this.f14597c.getTips()) && !this.f14597c.getTips().contains("网游")) {
                this.f14599e.setVisibility(0);
            } else {
                this.f14599e.setVisibility(8);
            }
        }
        this.f14599e.setOnClickListener(this);
        this.f14600f.setOnClickListener(this);
        this.f14601g.setOnClickListener(this);
    }
}
