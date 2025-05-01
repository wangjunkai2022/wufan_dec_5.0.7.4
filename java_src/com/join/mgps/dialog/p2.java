package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.ModGameIndexActivity_;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.enums.Dtype;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: VaExtSupportDialog.java */
/* loaded from: classes4.dex */
public class p2 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private SimpleDraweeView f49593b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49594c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49595d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49596e;

    /* renamed from: f  reason: collision with root package name */
    private Button f49597f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f49598g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f49599h;

    /* renamed from: i  reason: collision with root package name */
    DownloadTask f49600i;

    /* renamed from: j  reason: collision with root package name */
    EMUApkTable f49601j;

    public p2(@NonNull Context context) {
        super(context);
    }

    private void d() {
        if (APKUtils.L(this.f49600i)) {
            APKUtils.t(getContext(), this.f49600i);
        } else if (APKUtils.G(this.f49600i)) {
            if (com.join.android.app.common.utils.n.w() instanceof ModGameIndexActivity_) {
                Intent intent = new Intent(o1.a.f72025s0);
                intent.putExtra("from", "modStdDialog");
                getContext().sendBroadcast(intent);
                return;
            }
            ModInfoBean modInfoBean = this.f49600i.getModInfoBean();
            if (modInfoBean != null) {
                String mod_game_id = modInfoBean.getMod_game_id();
                ModGameIndexActivity_.o2(getContext()).a("modStdDialog").b(mod_game_id).c(modInfoBean.getMain_game_id()).start();
            }
        }
    }

    public void a(DownloadTask downloadTask, EMUApkTable eMUApkTable) {
        super.show();
        this.f49600i = downloadTask;
        this.f49601j = eMUApkTable;
        if (downloadTask != null) {
            MyImageLoader.h(this.f49593b, downloadTask.getPortraitURL());
            this.f49594c.setText(this.f49600i.getShowName());
            this.f49595d.setText(getContext().getResources().getString(R.string.str_va_support_install_more, Integer.valueOf(com.join.mgps.va.overmind.d.f54937g.g() ? 32 : 64)));
            c(this.f49600i);
        }
    }

    public void b(CommonGameInfoBean commonGameInfoBean, EMUApkTable eMUApkTable) {
        super.show();
        this.f49601j = eMUApkTable;
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return;
        }
        GInfoBean g_info = commonGameInfoBean.getG_info();
        if (g_info != null) {
            MyImageLoader.h(this.f49593b, g_info.getIco());
            this.f49594c.setText(g_info.getName());
            this.f49595d.setText(getContext().getResources().getString(R.string.str_va_support_install_more, Integer.valueOf(com.join.mgps.va.overmind.d.D() ? 32 : 64)));
        }
        if (commonGameInfoBean.getDownloadTask() != null) {
            c(commonGameInfoBean.getDownloadTask());
        }
    }

    void c(DownloadTask downloadTask) {
        if (APKUtils.L(downloadTask)) {
            if (!com.join.android.app.common.utils.e.l0(getContext()).e(getContext(), downloadTask.getPackageName(), APKUtils.DEVICE_TYPE.REAL)) {
                boolean z4 = true;
                if (downloadTask.getCost_type() != 1) {
                    if (!downloadTask.getRomType().equals(Dtype.androidobb.name()) && !downloadTask.getRomType().equals(Dtype.androiddata.name()) && !downloadTask.getRomType().equals(Dtype.androidobbdata.name())) {
                        z4 = false;
                    }
                    if (Build.VERSION.SDK_INT >= 30 && z4) {
                        this.f49599h.setVisibility(8);
                        return;
                    } else {
                        this.f49599h.setVisibility(0);
                        return;
                    }
                }
            }
            this.f49599h.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_install) {
            EMUApkTable eMUApkTable = this.f49601j;
            if (eMUApkTable != null) {
                UtilsMy.q1(eMUApkTable, getContext());
            }
            dismiss();
        } else if (id == R.id.iv_close) {
            dismiss();
        } else if (id == R.id.tv_install_local) {
            if (this.f49600i != null) {
                d();
            }
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        setContentView(R.layout.dialog_va_ext_support);
        this.f49593b = (SimpleDraweeView) findViewById(R.id.appIcon);
        this.f49594c = (TextView) findViewById(R.id.appName);
        this.f49595d = (TextView) findViewById(R.id.tv_install_tip);
        this.f49596e = (TextView) findViewById(R.id.tv_install_local);
        this.f49597f = (Button) findViewById(R.id.btn_install);
        this.f49598g = (ImageView) findViewById(R.id.iv_close);
        this.f49599h = (LinearLayout) findViewById(R.id.ll_install_local);
        this.f49597f.setOnClickListener(this);
        this.f49598g.setOnClickListener(this);
        this.f49596e.setOnClickListener(this);
    }
}
