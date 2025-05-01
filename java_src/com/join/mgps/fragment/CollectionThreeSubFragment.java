package com.join.mgps.fragment;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBeanInfo;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import java.io.File;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.collection_three_item)
/* loaded from: classes.dex */
public class CollectionThreeSubFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f50383b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f50384c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f50385d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f50386e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f50387f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f50388g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f50389h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f50390i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f50391j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ProgressBar f50392k;

    /* renamed from: l  reason: collision with root package name */
    private Context f50393l;

    /* renamed from: m  reason: collision with root package name */
    private CollectionDataBeanInfo f50394m;

    /* renamed from: n  reason: collision with root package name */
    private CollectionBeanSub f50395n;

    /* renamed from: o  reason: collision with root package name */
    private DownloadTask f50396o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.e f50397p;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void V(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        updateButn();
    }

    void W(int i4) {
        this.f50392k.setProgress(i4);
        TextView textView = this.f50391j;
        textView.setText(i4 + "%");
    }

    public void X(CollectionDataBeanInfo collectionDataBeanInfo) {
        this.f50394m = collectionDataBeanInfo;
        this.f50395n = collectionDataBeanInfo.getSub().get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z() {
        if (this.f50395n != null) {
            MyImageLoader.h(this.f50383b, this.f50394m.getMain().getTpl_pic());
            MyImageLoader.f(this.f50384c, R.drawable.main_normal_icon, this.f50395n.getIco_remote(), MyImageLoader.D(this.f50393l));
            this.f50386e.setText(this.f50395n.getGame_name());
            this.f50385d.setText(this.f50395n.getInfo());
        }
        updateButn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50397p = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        this.f50393l = getActivity();
        if (this.f50395n != null) {
            DownloadTask F = p1.f.K().F(this.f50395n.getGame_id());
            this.f50396o = F;
            if (F == null) {
                this.f50396o = this.f50395n.getDownloadtaskDown();
                if (UtilsMy.o0(this.f50395n.getTag_info())) {
                    this.f50396o.setFileType(Dtype.android.name());
                    if (com.join.android.app.common.utils.e.l0(this.f50393l).d(this.f50393l, this.f50395n.getPackage_name())) {
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f50393l).l(this.f50393l, this.f50395n.getPackage_name());
                        if (g2.i(this.f50395n.getVer()) && l4.d() < Integer.parseInt(this.f50395n.getVer())) {
                            this.f50396o.setStatus(9);
                        } else {
                            this.f50396o.setStatus(5);
                        }
                    } else {
                        this.f50396o.setStatus(0);
                    }
                } else {
                    this.f50396o.setStatus(0);
                }
            } else {
                F.setScreenshot_pic(this.f50395n.getScreenshot_pic());
            }
        }
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void instalButtomButn() {
        DownloadTask downloadTask = this.f50396o;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (this.f50396o != null && UtilsMy.w0(this.f50395n.getPay_tag_info(), this.f50395n.getCrc_sign_id()) > 0) {
            status = 43;
        }
        DownloadTask downloadTask2 = this.f50396o;
        if (downloadTask2 == null) {
            return;
        }
        if (downloadTask2 != null && (status == 2 || status == 10)) {
            downloadTask2.setStatus(3);
            com.php25.PDownload.d.i(this.f50396o);
        } else if (status == 12) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(getActivity(), this.f50396o);
                return;
            } else if (status == 5) {
                UtilsMy.T3(this.f50393l, downloadTask2);
            } else if (status == 9) {
                if (!com.join.android.app.common.utils.j.j(this.f50393l)) {
                    l2.a(this.f50393l).b("无网络连接");
                    return;
                }
                int downloadType = this.f50396o.getDownloadType();
                if (downloadType == 0 || downloadType == 1) {
                    if (this.f50396o.getCrc_link_type_val() == null || this.f50396o.getCrc_link_type_val().equals("")) {
                        return;
                    }
                    DownloadTask downloadTask3 = this.f50396o;
                    UtilsMy.z4(downloadTask3, downloadTask3.getCrc_link_type_val());
                    com.php25.PDownload.d.b(this.f50396o);
                    this.f50396o.setVer(this.f50395n.getVer());
                    this.f50396o.setVer_name(this.f50395n.getVer_name());
                    this.f50396o.setUrl(this.f50395n.getDown_url_remote());
                    this.f50396o.setCfg_ver(this.f50395n.getCfg_ver());
                    this.f50396o.setCfg_ver_name(this.f50395n.getCfg_ver_name());
                    this.f50396o.setCfg_down_url(this.f50395n.getCfg_down_url());
                    if (UtilsMy.y0(this.f50395n.getPay_tag_info(), this.f50395n.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(getActivity(), this.f50396o.getCrc_link_type_val());
                    } else {
                        UtilsMy.y1(this.f50396o, this.f50395n);
                        if (!UtilsMy.o1(this.f50393l, this.f50396o)) {
                            if (this.f50395n.getDown_status() == 5) {
                                UtilsMy.l1(this.f50393l, this.f50396o);
                            } else {
                                UtilsMy.R0(this.f50393l, this.f50396o, this.f50395n.getTp_down_url(), this.f50395n.getOther_down_switch(), this.f50395n.getCdn_down_switch());
                            }
                        }
                    }
                } else if (downloadType == 2) {
                    UtilsMy.u4(this.f50396o);
                }
            } else if (status == 42) {
                if (downloadTask2.getCrc_link_type_val() == null || this.f50396o.getCrc_link_type_val().equals("")) {
                    return;
                }
                DownloadTask downloadTask4 = this.f50396o;
                UtilsMy.z4(downloadTask4, downloadTask4.getCrc_link_type_val());
                this.f50396o.setVer(this.f50395n.getVer());
                this.f50396o.setVer_name(this.f50395n.getVer_name());
                this.f50396o.setUrl(this.f50395n.getDown_url_remote());
                this.f50396o.setCfg_ver(this.f50395n.getCfg_ver());
                this.f50396o.setCfg_ver_name(this.f50395n.getCfg_ver_name());
                this.f50396o.setCfg_down_url(this.f50395n.getCfg_down_url());
                UtilsMy.r4(this.f50393l, this.f50396o);
            } else if (11 == status) {
                UtilsMy.a4(downloadTask2, this.f50393l);
            } else {
                if (UtilsMy.y0(this.f50395n.getPay_tag_info(), this.f50395n.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(getActivity(), this.f50396o.getCrc_link_type_val());
                } else {
                    UtilsMy.y1(this.f50396o, this.f50395n);
                    if (!UtilsMy.o1(this.f50393l, this.f50396o)) {
                        if (this.f50395n.getDown_status() == 5) {
                            UtilsMy.l1(this.f50393l, this.f50396o);
                        } else {
                            UtilsMy.R0(this.f50393l, this.f50396o, this.f50395n.getTp_down_url(), this.f50395n.getOther_down_switch(), this.f50395n.getCdn_down_switch());
                        }
                    }
                }
                this.f50396o.setStatus(2);
            }
        }
        updateButn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r4 != 11) goto L25;
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEventMainThread(com.join.mgps.event.n r4) {
        /*
            r3 = this;
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r4.a()
            if (r0 == 0) goto L7a
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r3.f50396o
            if (r1 == 0) goto L7a
            java.lang.String r1 = r0.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r2 = r3.f50396o
            java.lang.String r2 = r2.getCrc_link_type_val()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7a
            r3.f50396o = r0
            int r4 = r4.c()
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 8
            if (r4 == r1) goto L2c
            r1 = 11
            if (r4 == r1) goto L64
            goto L7a
        L2c:
            com.github.snowdream.android.app.downloader.DownloadTask r4 = r3.f50396o
            if (r4 == 0) goto L7a
            java.lang.String r4 = r4.getPath()
            if (r4 == 0) goto L7a
            com.github.snowdream.android.app.downloader.DownloadTask r4 = r3.f50396o
            com.join.mgps.Util.UtilsMy.x4(r4)
            android.widget.ProgressBar r4 = r3.f50392k
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r3.f50396o
            long r0 = r0.getProgress()
            int r1 = (int) r0
            r4.setProgress(r1)
            android.widget.TextView r4 = r3.f50391j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r3.f50396o
            long r1 = r1.getProgress()
            r0.append(r1)
            java.lang.String r1 = "%"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
            return
        L64:
            com.github.snowdream.android.app.downloader.DownloadTask r4 = r3.f50396o
            if (r4 == 0) goto L7a
            java.lang.String r4 = r0.getCrc_link_type_val()
            com.github.snowdream.android.app.downloader.DownloadTask r1 = r3.f50396o
            java.lang.String r1 = r1.getCrc_link_type_val()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L7a
            r3.f50396o = r0
        L7a:
            r3.updateButn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.CollectionThreeSubFragment.onEventMainThread(com.join.mgps.event.n):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        DownloadTask F = p1.f.K().F(this.f50395n.getGame_id());
        if (F == null || this.f50396o == null) {
            return;
        }
        this.f50396o = F;
        if (F.getFileType().equals(Dtype.android.name()) && this.f50396o.getStatus() == 5) {
            if (Boolean.valueOf(com.join.android.app.common.utils.e.l0(this.f50393l).d(this.f50393l, this.f50396o.getPackageName())).booleanValue()) {
                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f50393l).l(this.f50393l, this.f50396o.getPackageName());
                if (g2.i(this.f50396o.getVer()) && l4.d() < Integer.parseInt(this.f50396o.getVer())) {
                    this.f50396o.setStatus(9);
                } else {
                    this.f50396o.setStatus(5);
                }
            } else {
                this.f50396o.setStatus(11);
            }
        } else {
            this.f50396o.setStatus(F.getStatus());
        }
        updateButn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void progress_layout() {
        DownloadTask downloadTask = this.f50396o;
        if (downloadTask == null) {
            return;
        }
        if (downloadTask.getStatus() == 2) {
            this.f50396o.setStatus(3);
            com.php25.PDownload.d.i(this.f50396o);
            updateButn();
        } else if (this.f50396o.getStatus() == 3 || this.f50396o.getStatus() == 6) {
            com.php25.PDownload.d.c(this.f50396o, this.f50393l);
            this.f50396o.setStatus(2);
            updateButn();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallButn() {
        this.f50389h.setVisibility(0);
        this.f50388g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showProgress() {
        this.f50389h.setVisibility(8);
        this.f50388g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateButn() {
        if (this.f50395n == null || this.f50396o == null) {
            return;
        }
        this.f50387f.setBackgroundResource(R.drawable.detial_simple_install_selecter);
        DownloadTask downloadTask = this.f50396o;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.f50395n.getPay_tag_info(), this.f50395n.getCrc_sign_id()) > 0) {
            status = 43;
        }
        String plugin_num = this.f50396o.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            this.f50387f.setBackgroundResource(R.drawable.recom_blue_butn);
            this.f50387f.setText("开始");
            this.f50387f.setTextColor(getResources().getColor(R.color.app_blue_color));
        } else if (status == 12) {
            showInstallButn();
            this.f50387f.setText("解压中..");
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.extract);
        } else if (status == 13) {
            showInstallButn();
            this.f50387f.setText("解压");
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.reextract);
        } else if (status == 9) {
            showInstallButn();
            this.f50387f.setText("更新");
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 11) {
            showInstallButn();
            this.f50387f.setText("安装");
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 5 || status == 42) {
            showInstallButn();
            this.f50387f.setBackgroundResource(R.drawable.detial_simple_open_selecter);
            this.f50387f.setText(this.f50393l.getResources().getString(R.string.download_status_finished));
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 2) {
            showProgress();
            this.f50390i.setImageResource(R.drawable.detail_comment_download_pause);
            if (new File(this.f50396o.getPath()).exists()) {
                int j4 = (int) com.php25.PDownload.d.j(this.f50396o.getPath(), this.f50396o.getSize());
                this.f50392k.setProgress(j4);
                TextView textView = this.f50391j;
                textView.setText(j4 + "%");
            }
        } else if (status == 3) {
            showProgress();
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
            if (new File(this.f50396o.getPath()).exists()) {
                W((int) com.php25.PDownload.d.j(this.f50396o.getPath(), this.f50396o.getSize()));
            }
        } else if (status == 10) {
            showInstallButn();
            Button button = this.f50387f;
            button.setText("等待\u3000" + this.f50395n.getSize() + "M");
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 43) {
            showInstallButn();
            if (this.f50395n.getPay_tag_info() != null && this.f50395n.getPay_tag_info().getPay_game_amount() > 0 && !b2.e0.o().p(this.f50395n.getCrc_sign_id())) {
                Button button2 = this.f50387f;
                button2.setText(button2.getResources().getString(R.string.pay_game_amount, this.f50395n.getPay_tag_info().getPayGameAmount()));
            } else {
                Button button3 = this.f50387f;
                button3.setText(this.f50393l.getResources().getString(R.string.download_status_download) + "\u3000" + this.f50395n.getSize() + "M");
            }
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
            CollectionBeanSub collectionBeanSub = this.f50395n;
            if (collectionBeanSub != null) {
                UtilsMy.w0(collectionBeanSub.getPay_tag_info(), this.f50395n.getCrc_sign_id());
                UtilsMy.d3(this.f50387f, this.f50395n);
            }
        } else if (status == 48) {
            showInstallButn();
            this.f50387f.setText(this.f50393l.getResources().getString(R.string.download_status_installing));
        } else {
            showInstallButn();
            if (this.f50395n.getPay_tag_info() != null && this.f50395n.getPay_tag_info().getPay_game_amount() > 0 && !b2.e0.o().p(this.f50395n.getCrc_sign_id())) {
                Button button4 = this.f50387f;
                button4.setText(button4.getResources().getString(R.string.pay_game_amount, this.f50395n.getPay_tag_info().getPayGameAmount()));
            } else {
                Button button5 = this.f50387f;
                button5.setText(this.f50393l.getResources().getString(R.string.download_status_download) + "\u3000" + this.f50395n.getSize() + "M");
            }
            this.f50387f.setTextColor(-1);
            this.f50390i.setImageResource(R.drawable.detail_comment_download_continue);
            CollectionBeanSub collectionBeanSub2 = this.f50395n;
            if (collectionBeanSub2 != null) {
                UtilsMy.w0(collectionBeanSub2.getPay_tag_info(), this.f50395n.getCrc_sign_id());
                UtilsMy.d3(this.f50387f, this.f50395n);
            }
        }
    }
}
