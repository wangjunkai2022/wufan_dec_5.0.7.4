package com.join.mgps.activity.mygame.dialog;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.e;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.c2;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.s1;
import com.join.mgps.Util.v0;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.Filepath;
import com.join.mgps.dto.RequestDomainInfoArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.pref.h;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.rpc.k;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.php25.PDownload.d;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import p1.f;
@EActivity(R.layout.wufungame_unzipfailed_dialog)
/* loaded from: classes4.dex */
public class UnzipFailedDialog extends BaseDialogActivity {
    DownloadTask downloadTask;
    @Extra
    int from;
    @Extra
    String gameId;
    @ViewById
    TextView gameName;
    @ViewById
    TextView goH5;
    @ViewById
    SimpleDraweeView icon;
    @ViewById
    LinearLayout llReUnzip;
    @ViewById
    View main;
    @ViewById
    TextView message;
    @ViewById
    LinearLayout moreSelecter;
    boolean needFinish = false;
    @Pref
    PrefDef_ prefDef_;
    k rpcGameClient;
    @ViewById
    SimpleDraweeView sdv_image;
    @ViewById
    TextView startButn;
    View viewx;

    @RequiresApi(api = 26)
    private void initGoInstall() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.unzip_or_install_failed_item, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(R.drawable.sdcardicon2);
        ((TextView) inflate.findViewById(R.id.title)).setText("安装权限是否允许");
        ((TextView) inflate.findViewById(R.id.subtitle)).setVisibility(8);
        ((TextView) inflate.findViewById(R.id.message)).setText("前往权限管理，找到悟饭游戏厅-应用内安装其他应用，选择允许");
        inflate.findViewById(R.id.main).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UnzipFailedDialog.this.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + view.getContext().getPackageName())), 1);
            }
        });
        this.moreSelecter.addView(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131 A[Catch: Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:29:0x00b3, B:30:0x00bf, B:33:0x00cf, B:35:0x00f5, B:37:0x00ff, B:39:0x0109, B:41:0x0113, B:43:0x011f, B:44:0x012b, B:46:0x0131, B:48:0x0157, B:50:0x0161, B:52:0x016b, B:54:0x0175), top: B:59:0x00b3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openAssignFolder(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.openAssignFolder(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        String path;
        c2.t(this, false);
        this.prefDef_.lastInstallApp().g("");
        this.rpcGameClient = i.D0();
        v0.d("unzipfailedxx", CommonService_.i0.f54387c);
        DownloadTask F = f.K().F(this.gameId);
        this.downloadTask = F;
        if (F == null) {
            finish();
            return;
        }
        MyImageLoader.d(this.icon, R.drawable.main_normal_icon, F.getPortraitURL());
        this.gameName.setText(this.downloadTask.getShowName());
        if (this.from == 1) {
            this.message.setText(Html.fromHtml("<font color=#ff001c>解压失败：</font>请确认下方几项是否正常后解压"));
            this.startButn.setVisibility(8);
            this.llReUnzip.setVisibility(0);
            p.l(this).O1(Event.showFailUnzip, new Ext().setGameId(this.downloadTask.getCrc_link_type_val()));
            getPrivateDomain(this.gameId, 10);
        } else {
            this.message.setText(Html.fromHtml("如果安装失败，请检查以下问题后安装。"));
            this.llReUnzip.setVisibility(8);
            this.startButn.setVisibility(0);
            p.l(this).O1(Event.showFailApkInstall, new Ext().setGameId(this.downloadTask.getCrc_link_type_val()));
            getPrivateDomain(this.gameId, 11);
        }
        final List<Filepath> a5 = s1.a(this);
        Iterator<Filepath> it2 = a5.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            final Filepath next = it2.next();
            if (g2.i(this.downloadTask.getGameZipPath())) {
                path = this.downloadTask.getGameZipPath();
            } else {
                path = g2.i(this.downloadTask.getPath()) ? this.downloadTask.getPath() : "";
            }
            this.moreSelecter.removeAllViews();
            if (path.contains(next.getPathRoot())) {
                next.getAvailable();
                View inflate = LayoutInflater.from(this).inflate(R.layout.unzip_or_install_failed_item, (ViewGroup) null);
                this.viewx = inflate;
                ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(R.drawable.sdcardicon2);
                ((TextView) this.viewx.findViewById(R.id.title)).setText("内存是否充足");
                TextView textView = (TextView) this.viewx.findViewById(R.id.subtitle);
                textView.setText("（可用空间" + UtilsMy.a(next.getAvailable()) + "）");
                if (next.getAvailable() < this.downloadTask.getActual_size() * 2) {
                    textView.setTextColor(Color.parseColor("#ff001c"));
                } else {
                    textView.setTextColor(Color.parseColor("#00c81e"));
                }
                ((TextView) this.viewx.findViewById(R.id.message)).setText("前往手机文件夹，查看手机存储空间是否不足，若不足请清除多余文件");
                this.viewx.findViewById(R.id.main).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        UnzipFailedDialog.this.openAssignFolder(next.getPathHome());
                    }
                });
                this.moreSelecter.addView(this.viewx);
                if (!next.isIslocal() && this.from == 1) {
                    View inflate2 = LayoutInflater.from(this).inflate(R.layout.unzip_or_install_failed_item, (ViewGroup) null);
                    ((ImageView) inflate2.findViewById(R.id.icon)).setImageResource(R.drawable.sdcardicon);
                    ((TextView) inflate2.findViewById(R.id.title)).setText("下载位置设置为手机内存");
                    inflate2.findViewById(R.id.subtitle).setVisibility(8);
                    ((TextView) inflate2.findViewById(R.id.message)).setText("下载位置为SD卡时可能会导致解压失败，点击此处可切换下载位置");
                    inflate2.findViewById(R.id.main).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            for (Filepath filepath : a5) {
                                if (filepath.isIslocal()) {
                                    h.n(view.getContext()).V(filepath.getPathHome());
                                }
                            }
                            AppZipFailed2DialogAcitivity_.intent(view.getContext()).gameId(UnzipFailedDialog.this.gameId).start();
                            UnzipFailedDialog.this.finish();
                        }
                    });
                    this.moreSelecter.addView(inflate2);
                }
            } else {
                View inflate3 = LayoutInflater.from(this).inflate(R.layout.unzip_or_install_failed_item, (ViewGroup) null);
                this.viewx = inflate3;
                ((ImageView) inflate3.findViewById(R.id.icon)).setImageResource(R.drawable.sdcardicon2);
                ((TextView) this.viewx.findViewById(R.id.title)).setText("内存是否充足");
                TextView textView2 = (TextView) this.viewx.findViewById(R.id.subtitle);
                textView2.setText("（可用空间0)");
                textView2.setTextColor(Color.parseColor("#ff001c"));
                ((TextView) this.viewx.findViewById(R.id.message)).setText("前往手机文件夹，查看手机存储空间是否不足，若不足请清除多余文件");
                this.viewx.findViewById(R.id.main).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        UnzipFailedDialog.this.openAssignFolder(next.getPathHome());
                    }
                });
                this.moreSelecter.addView(this.viewx);
                if (this.from == 1) {
                    View inflate4 = LayoutInflater.from(this).inflate(R.layout.unzip_or_install_failed_item, (ViewGroup) null);
                    ((ImageView) inflate4.findViewById(R.id.icon)).setImageResource(R.drawable.sdcardicon);
                    ((TextView) inflate4.findViewById(R.id.title)).setText("下载位置设置为手机内存");
                    inflate4.findViewById(R.id.subtitle).setVisibility(8);
                    ((TextView) inflate4.findViewById(R.id.message)).setText("下载位置为SD卡时可能会导致解压失败，点击此处可切换下载位置");
                    inflate4.findViewById(R.id.main).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            for (Filepath filepath : a5) {
                                if (filepath.isIslocal()) {
                                    h.n(view.getContext()).V(filepath.getPathHome());
                                }
                            }
                            AppZipFailed2DialogAcitivity_.intent(view.getContext()).gameId(UnzipFailedDialog.this.gameId).start();
                            UnzipFailedDialog.this.finish();
                        }
                    });
                    this.moreSelecter.addView(inflate4);
                }
            }
        }
        if (this.from != 2 || Build.VERSION.SDK_INT < 26) {
            return;
        }
        initGoInstall();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void close() {
        finish();
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_bottom_in, R.anim.anim_bottom_out);
    }

    @Override // com.join.mgps.base.dialog.BaseDialogActivity
    public View getContentView() {
        return this.main;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getPrivateDomain(String str, int i4) {
        if (j.j(this)) {
            try {
                RequestDomainInfoArgs requestDomainInfoArgs = new RequestDomainInfoArgs();
                requestDomainInfoArgs.setGameId(str);
                requestDomainInfoArgs.setLocation(Integer.valueOf(i4));
                RequestModel requestModel = new RequestModel(this);
                requestModel.setArgs(requestDomainInfoArgs);
                requestModel.makeSign();
                try {
                    ResponseModel<DomainInfoBean> W = this.rpcGameClient.W(requestModel.makeSign());
                    if (W != null && W.getData() != null) {
                        showDomainUI(W.getData());
                    } else {
                        showDefaultUI();
                    }
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showDefaultUI();
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                showDefaultUI();
                return;
            }
        }
        showDefaultUI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void goH5() {
        if (IntentUtil.getInstance().goLogin(this)) {
            return;
        }
        IntentUtil.getInstance().goFeedback(this);
        this.needFinish = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (e.l0(this).d(this, this.downloadTask.getPackageName())) {
            this.needFinish = true;
        }
        if (this.needFinish) {
            this.prefDef_.lastInstallApp().g("");
            finish();
        }
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showDefaultUI() {
        this.sdv_image.setVisibility(8);
        this.goH5.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showDomainUI(final DomainInfoBean domainInfoBean) {
        this.sdv_image.setVisibility(0);
        this.goH5.setVisibility(8);
        if (g2.i(domainInfoBean.getPic())) {
            MyImageLoader.h(this.sdv_image, domainInfoBean.getPic());
        }
        this.sdv_image.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.mygame.dialog.UnzipFailedDialog.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                p.l(UnzipFailedDialog.this).O1(Event.pdSetupUnzipFailClick, new Ext().setGameId(UnzipFailedDialog.this.gameId).setTestAbNumber(domainInfoBean.getAb_test_number()).setIsJoin(domainInfoBean.getIs_join()).setActType(UnzipFailedDialog.this.from == 1 ? "unzip_fail" : "setup_fail"));
                UtilsMy.h4(UnzipFailedDialog.this, domainInfoBean.getInfo(), UnzipFailedDialog.this.from == 1 ? "game_unzip_fail" : "game_setup_fail");
            }
        });
        p.l(this).O1(Event.pdSetupUnzipFail, new Ext().setGameId(this.gameId).setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()).setActType(this.from == 1 ? "unzip_fail" : "setup_fail"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void startButn() {
        if (!Dtype.MOD.name().equals(this.downloadTask.getFileType()) && !APKUtils.L(this.downloadTask)) {
            e.l0(this).w(this, new File(this.downloadTask.getGameZipPath()));
        } else {
            e.l0(this);
            APKUtils.C(this, this.downloadTask);
        }
        p.l(this).O1(Event.reApkInstall, new Ext().setGameId(this.gameId));
        this.needFinish = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void tvReDownload() {
        if (this.downloadTask != null) {
            com.join.android.app.common.servcie.i.e().c(this, this.downloadTask);
            f.K().n(this.gameId);
            d.c(this.downloadTask, this);
            this.needFinish = true;
            close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void tvReUnzip() {
        p.l(this).O1(Event.reUnzip, new Ext().setGameId(this.gameId));
        d.l(this, this.downloadTask);
        finish();
        this.needFinish = true;
    }
}
