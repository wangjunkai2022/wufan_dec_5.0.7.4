package com.join.mgps.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.List;
/* loaded from: classes4.dex */
public class InstallAppDialogActivity extends AlertDialog implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public static final int f34067j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final int f34068k = 1;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f34069b;

    /* renamed from: c  reason: collision with root package name */
    private Context f34070c;

    /* renamed from: d  reason: collision with root package name */
    TextView f34071d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f34072e;

    /* renamed from: f  reason: collision with root package name */
    MYAdapter f34073f;

    /* renamed from: g  reason: collision with root package name */
    PrefDef_ f34074g;

    /* renamed from: h  reason: collision with root package name */
    int f34075h;

    /* renamed from: i  reason: collision with root package name */
    List<DownloadTask> f34076i;

    /* loaded from: classes4.dex */
    public class MYAdapter extends BaseQuickAdapter<DownloadTask, BaseViewHolder> {
        public MYAdapter() {
            super((int) R.layout.install_app_list);
        }

        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(BaseViewHolder baseViewHolder, DownloadTask downloadTask) {
            LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.tipsLayout);
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_star);
            TextView textView = (TextView) baseViewHolder.getView(R.id.tv_score);
            Button button = (Button) baseViewHolder.getView(R.id.btn_install);
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.appIcon), downloadTask.getPortraitURL());
            ((TextView) baseViewHolder.getView(R.id.appName)).setText(downloadTask.getShowName());
            button.setBackgroundResource(R.drawable.recom_blue_butn);
            if (!com.join.mgps.Util.g2.h(downloadTask.getScore()) && Float.valueOf(downloadTask.getScore()).floatValue() > 0.0f) {
                textView.setVisibility(0);
                textView.setText(downloadTask.getScore());
                imageView.setVisibility(0);
            } else {
                textView.setVisibility(8);
                imageView.setVisibility(8);
            }
            InstallAppDialogActivity installAppDialogActivity = InstallAppDialogActivity.this;
            if (installAppDialogActivity.f34075h == 1) {
                button.setText(installAppDialogActivity.f34070c.getResources().getString(R.string.download_status_finished));
                button.setBackgroundResource(R.drawable.recom_maincolor_butn);
                button.setTextColor(InstallAppDialogActivity.this.f34070c.getResources().getColor(R.color.app_main_color));
            } else {
                button.setText(installAppDialogActivity.f34070c.getResources().getString(R.string.install));
                button.setBackgroundResource(R.drawable.recom_green_butn);
                button.setTextColor(InstallAppDialogActivity.this.f34070c.getResources().getColor(R.color.app_green_color));
            }
            UtilsMy.J(downloadTask.getTipBeans(), downloadTask.getSp_tag_info(), linearLayout, InstallAppDialogActivity.this.f34070c);
            baseViewHolder.addOnClickListener(R.id.btn_install);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements BaseQuickAdapter.h {
        a() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.h
        public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            DownloadTask item = InstallAppDialogActivity.this.f34073f.getItem(i4);
            if (view.getId() == R.id.btn_install) {
                InstallAppDialogActivity installAppDialogActivity = InstallAppDialogActivity.this;
                if (installAppDialogActivity.f34075h != 1) {
                    installAppDialogActivity.e(item);
                    com.papa.sim.statistic.p.l(InstallAppDialogActivity.this.f34070c).O1(Event.onclickGameInstall, new Ext().setGameId(item.getCrc_link_type_val()));
                    InstallAppDialogActivity.this.f34073f.remove(i4);
                    InstallAppDialogActivity.this.f34073f.notifyItemRemoved(i4);
                    if (InstallAppDialogActivity.this.f34073f.getItemCount() > 0) {
                        InstallAppDialogActivity.this.g();
                        return;
                    } else {
                        InstallAppDialogActivity.this.dismiss();
                        return;
                    }
                }
                if (item.isSo()) {
                    if (item.isMod()) {
                        com.papa.sim.statistic.p.l(InstallAppDialogActivity.this.f34070c).O1(Event.onclickSoGameStart, new Ext().setGameId(item.getCrc_link_type_val()).setGameFlag(1));
                    } else {
                        com.papa.sim.statistic.p.l(InstallAppDialogActivity.this.f34070c).O1(Event.onclickSoGameStart, new Ext().setGameId(item.getCrc_link_type_val()));
                    }
                } else if (item.isMod()) {
                    com.papa.sim.statistic.p.l(InstallAppDialogActivity.this.f34070c).O1(Event.onclickSinGameStart, new Ext().setGameId(item.getCrc_link_type_val()).setGameFlag(1));
                } else {
                    com.papa.sim.statistic.p.l(InstallAppDialogActivity.this.f34070c).O1(Event.onclickSinGameStart, new Ext().setGameId(item.getCrc_link_type_val()));
                }
                com.papa.sim.statistic.p.l(InstallAppDialogActivity.this.f34070c).O1(Event.onclickGameStart, new Ext().setGameId(item.getCrc_link_type_val()));
                UtilsMy.T3(InstallAppDialogActivity.this.f34070c, item);
                InstallAppDialogActivity.this.dismiss();
            }
        }
    }

    public InstallAppDialogActivity(Context context, int i4, List<DownloadTask> list) {
        super(context, R.style.Dialog);
        this.f34075h = 0;
        this.f34070c = context;
        this.f34075h = i4;
        this.f34074g = new PrefDef_(getContext());
        this.f34076i = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DownloadTask downloadTask) {
        try {
            if (com.join.android.app.common.utils.l.I(this.f34070c, downloadTask, null)) {
                UtilsMy.S2(downloadTask, 5);
                return;
            }
            if (!APKUtils.G(downloadTask) && !APKUtils.L(downloadTask)) {
                com.join.android.app.common.utils.e.l0(this.f34070c).x(this.f34070c, downloadTask.getGameZipPath());
                return;
            }
            APKUtils.C(this.f34070c, downloadTask);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f34075h == 1) {
            this.f34071d.setText(this.f34070c.getResources().getString(R.string.str_not_open_tip_title));
        } else {
            this.f34071d.setText(this.f34070c.getResources().getString(R.string.str_not_install_tip_title));
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f34069b.getLayoutParams();
        List<DownloadTask> list = this.f34076i;
        if (list != null && list.size() > 3) {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) this.f34070c.getResources().getDimension(R.dimen.wdp420);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        }
        this.f34069b.setLayoutParams(layoutParams);
        this.f34069b.invalidate();
    }

    public void d() {
        if (this.f34073f == null) {
            MYAdapter mYAdapter = new MYAdapter();
            this.f34073f = mYAdapter;
            mYAdapter.setOnItemChildClickListener(new a());
            this.f34069b.setAdapter(this.f34073f);
        }
        this.f34073f.setNewData(this.f34076i);
        g();
    }

    public void f() {
        Context context = this.f34070c;
        if (context instanceof MGMainActivity) {
            ((MGMainActivity) context).onActivityResult(10003, -1, new Intent());
        }
        dismiss();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.iv_close) {
            f();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.install_notinstall_app_dialog_activity);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        this.f34069b = (RecyclerView) findViewById(R.id.appList);
        this.f34071d = (TextView) findViewById(R.id.describ);
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.f34072e = imageView;
        imageView.setOnClickListener(this);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (this.f34075h == 1) {
            com.papa.sim.statistic.p.l(this.f34070c).O1(Event.gameStartShow, new Ext());
        } else {
            com.papa.sim.statistic.p.l(this.f34070c).O1(Event.gameInstallShow, new Ext());
        }
        d();
    }
}
