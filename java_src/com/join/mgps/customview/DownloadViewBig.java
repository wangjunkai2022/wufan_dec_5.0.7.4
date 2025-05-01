package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DownloadPointBase;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.TipNew;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Where;
/* loaded from: classes4.dex */
public class DownloadViewBig extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f46868b;

    /* renamed from: c  reason: collision with root package name */
    private RelativeLayout f46869c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f46870d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f46871e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f46872f;

    /* renamed from: g  reason: collision with root package name */
    private ProgressBar f46873g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f46874h;

    /* renamed from: i  reason: collision with root package name */
    private PayTagInfo f46875i;

    /* renamed from: j  reason: collision with root package name */
    private int f46876j;

    /* renamed from: k  reason: collision with root package name */
    private ModInfoBean f46877k;

    /* renamed from: l  reason: collision with root package name */
    private String f46878l;

    /* renamed from: m  reason: collision with root package name */
    private DownloadTask f46879m;

    /* renamed from: n  reason: collision with root package name */
    private CollectionBeanSub f46880n;

    /* renamed from: o  reason: collision with root package name */
    private int f46881o;

    /* renamed from: p  reason: collision with root package name */
    private int f46882p;

    /* renamed from: q  reason: collision with root package name */
    private String f46883q;

    /* renamed from: r  reason: collision with root package name */
    private String f46884r;

    /* renamed from: s  reason: collision with root package name */
    private String f46885s;

    public DownloadViewBig(Context context) {
        super(context);
        this.f46881o = 0;
        this.f46882p = 0;
        this.f46883q = "";
        this.f46884r = "";
        this.f46885s = "";
        c(context);
    }

    private void c(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.install_button_big_layout, this);
        this.f46868b = (RelativeLayout) inflate.findViewById(R.id.instalbutnLayout);
        this.f46869c = (RelativeLayout) inflate.findViewById(R.id.progressbarLayout);
        this.f46870d = (TextView) inflate.findViewById(R.id.instalButtomButn);
        this.f46871e = (TextView) inflate.findViewById(R.id.moneyText);
        this.f46872f = (TextView) inflate.findViewById(R.id.percent);
        this.f46873g = (ProgressBar) inflate.findViewById(R.id.butnProgressBar);
        this.f46874h = (ImageView) inflate.findViewById(R.id.butn_showdownload);
    }

    public void a(DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
        setCoin(collectionBeanSub.getSp_tag_info(), downloadTask);
        this.f46880n = collectionBeanSub;
        this.f46878l = collectionBeanSub.getGame_id();
        this.f46875i = collectionBeanSub.getPay_tag_info();
        this.f46879m = downloadTask;
        this.f46876j = collectionBeanSub.getDown_status();
        this.f46870d.setOnClickListener(this);
        g(downloadTask);
        this.f46881o = collectionBeanSub.get_from();
        this.f46882p = collectionBeanSub.get_from_type();
        this.f46883q = collectionBeanSub.getRecPosition();
        this.f46884r = collectionBeanSub.getReMarks();
        this.f46885s = collectionBeanSub.getNodeId();
        this.f46877k = collectionBeanSub.getMod_info();
    }

    @Deprecated
    public void b(String str, TipNew tipNew, PayTagInfo payTagInfo, DownloadTask downloadTask, int i4, DownloadPointBase downloadPointBase, ModInfoBean modInfoBean) {
        setCoin(tipNew, downloadTask);
        this.f46875i = payTagInfo;
        this.f46878l = str;
        this.f46879m = downloadTask;
        this.f46876j = i4;
        setOnClickListener(this);
        g(downloadTask);
        this.f46881o = downloadPointBase.get_from();
        this.f46882p = downloadPointBase.get_from_type();
        this.f46877k = modInfoBean;
        this.f46885s = downloadPointBase.getNodeId();
        this.f46884r = downloadPointBase.getReMarks();
    }

    public void d(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (("" + downloadTask.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                IntentUtil.getInstance().goShareWebActivity(getContext(), downloadTask.getPortraitURL());
                UtilsMy.T2(downloadTask, getContext());
            }
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (downloadTask != null && UtilsMy.w0(this.f46875i, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (downloadTask == null) {
            if (this.f46880n != null) {
                UtilsMy.Y0(getContext(), this.f46880n);
                return;
            } else if (this.f46877k == null) {
                UtilsMy.d1(getContext(), this.f46878l, "", this.f46881o, this.f46882p, this.f46883q, this.f46884r, this.f46885s, this.f46880n.getPosition_path(), false);
                return;
            } else {
                UtilsMy.d1(getContext(), this.f46877k.getMod_game_id(), "", this.f46881o, this.f46882p, this.f46883q, this.f46884r, this.f46885s, this.f46880n.getPosition_path(), false);
                return;
            }
        }
        if (status == 2 || status == 10) {
            com.php25.PDownload.d.i(downloadTask);
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(getContext(), downloadTask);
                return;
            } else if (status == 3 || status == 6) {
                com.php25.PDownload.d.c(downloadTask, getContext());
            } else if (status == 5) {
                UtilsMy.T3(getContext(), downloadTask);
            } else if (status == 9) {
                if (downloadTask.getCrc_link_type_val() == null || downloadTask.getCrc_link_type_val().equals("") || UtilsMy.o1(getContext(), downloadTask)) {
                    return;
                }
                if (this.f46876j == 5) {
                    UtilsMy.l1(getContext(), downloadTask);
                    return;
                }
                UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                com.php25.PDownload.d.b(downloadTask);
                downloadTask.setVer(downloadTask.getVer());
                downloadTask.setVer_name(downloadTask.getVer_name());
                downloadTask.setUrl(downloadTask.getPortraitURL());
                downloadTask.setCfg_ver(downloadTask.getCfg_ver());
                downloadTask.setCfg_ver_name(downloadTask.getCfg_ver_name());
                downloadTask.setCfg_down_url(downloadTask.getCfg_down_url());
                downloadTask.setKeyword(Where.detail.name());
                com.php25.PDownload.d.c(downloadTask, getContext());
            } else if (status == 42) {
                if (downloadTask.getCrc_link_type_val() == null || downloadTask.getCrc_link_type_val().equals("")) {
                    return;
                }
                UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                downloadTask.setVer(downloadTask.getVer());
                downloadTask.setVer_name(downloadTask.getVer_name());
                downloadTask.setUrl(downloadTask.getPortraitURL());
                downloadTask.setCfg_ver(downloadTask.getCfg_ver());
                downloadTask.setCfg_ver_name(downloadTask.getCfg_ver_name());
                downloadTask.setCfg_down_url(downloadTask.getCfg_down_url());
                downloadTask.setKeyword(Where.detail.name());
                UtilsMy.r4(getContext(), downloadTask);
            } else if (11 == status) {
                UtilsMy.a4(downloadTask, getContext());
            } else if (43 == status) {
                downloadTask.setKeyword(Where.detail.name());
                if (UtilsMy.y0(this.f46875i, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(getContext(), downloadTask.getCrc_link_type_val());
                } else if (!UtilsMy.o1(getContext(), downloadTask)) {
                    if (this.f46876j == 5) {
                        UtilsMy.l1(getContext(), downloadTask);
                    } else {
                        UtilsMy.R0(getContext(), downloadTask, downloadTask.getTp_down_url(), 0, 0);
                    }
                }
            } else {
                downloadTask.setKeyword(Where.detail.name());
                if (UtilsMy.y0(this.f46875i, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(getContext(), downloadTask.getCrc_link_type_val());
                } else if (!UtilsMy.o1(getContext(), downloadTask)) {
                    if (this.f46876j == 5) {
                        UtilsMy.l1(getContext(), downloadTask);
                    } else {
                        UtilsMy.R0(getContext(), downloadTask, downloadTask.getTp_down_url(), 0, 0);
                    }
                }
            }
        }
        g(downloadTask);
    }

    void e() {
        this.f46869c.setVisibility(8);
        this.f46868b.setVisibility(0);
    }

    void f() {
        this.f46868b.setVisibility(8);
        this.f46869c.setVisibility(0);
    }

    public void g(DownloadTask downloadTask) {
        if (downloadTask == null) {
            e();
            this.f46870d.setBackgroundResource(R.drawable.installbutn_big_normal);
            PayTagInfo payTagInfo = this.f46875i;
            if (payTagInfo != null && payTagInfo.getAmount_check() > 0) {
                TextView textView = this.f46870d;
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, this.f46875i.getPayGameAmount()));
            } else {
                TextView textView2 = this.f46870d;
                textView2.setText(textView2.getResources().getString(R.string.download_status_download));
            }
            this.f46870d.setVisibility(0);
            TextView textView3 = this.f46870d;
            int i4 = this.f46876j;
            PayTagInfo payTagInfo2 = this.f46875i;
            UtilsMy.W2(textView3, i4, payTagInfo2 != null ? payTagInfo2.getPay_game_amount() : 0, this.f46878l);
            return;
        }
        if (downloadTask.getPlugin_num() != null) {
            String plugin_num = downloadTask.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f46870d.setBackgroundResource(R.drawable.installbutn_big_normal);
                this.f46870d.setText("开始");
                this.f46870d.setVisibility(0);
                e();
                return;
            }
        }
        this.f46870d.setBackgroundResource(R.drawable.installbutn_big_normal);
        int status = downloadTask.getStatus();
        if (UtilsMy.w0(this.f46875i, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (status == 9) {
            e();
            this.f46870d.setText("更新");
            this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
            this.f46874h.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 12) {
            e();
            this.f46870d.setText("解压中..");
        } else if (status == 13) {
            e();
            this.f46870d.setText("解压");
            this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 11) {
            e();
            this.f46870d.setText("安装");
            this.f46870d.setBackgroundResource(R.drawable.installbutn_big_installl);
            this.f46874h.setImageResource(R.drawable.detial_simple_install_selecter);
        } else if (status == 5 || status == 42) {
            e();
            this.f46870d.setBackgroundResource(R.drawable.installbutn_big_open);
            TextView textView4 = this.f46870d;
            textView4.setText(textView4.getResources().getString(R.string.download_status_finished));
            this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 2) {
            f();
            this.f46874h.setImageResource(R.drawable.detail_comment_download_pause);
            UtilsMy.x4(downloadTask);
            this.f46873g.setProgress((int) downloadTask.getProgress());
            TextView textView5 = this.f46872f;
            textView5.setText(downloadTask.getProgress() + "%");
        } else if (status == 3 || status == 6 || status == 27) {
            f();
            this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
            UtilsMy.x4(downloadTask);
            this.f46873g.setProgress((int) downloadTask.getProgress());
            TextView textView6 = this.f46872f;
            textView6.setText(downloadTask.getProgress() + "%");
        } else if (status == 10) {
            e();
            this.f46870d.setText("等待");
            this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
        } else if (status == 1) {
        } else {
            if (status == 43) {
                e();
                PayTagInfo payTagInfo3 = this.f46875i;
                if (payTagInfo3 != null && payTagInfo3.getAmount_check() > 0) {
                    TextView textView7 = this.f46870d;
                    textView7.setText(textView7.getResources().getString(R.string.pay_game_amount, this.f46875i.getPayGameAmount()));
                } else {
                    TextView textView8 = this.f46870d;
                    textView8.setText(textView8.getResources().getString(R.string.download_status_download));
                }
                this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
                UtilsMy.w0(this.f46875i, downloadTask.getCrc_link_type_val());
                UtilsMy.x3(this.f46870d, downloadTask);
                return;
            }
            e();
            PayTagInfo payTagInfo4 = this.f46875i;
            if (payTagInfo4 != null && payTagInfo4.getAmount_check() > 0) {
                TextView textView9 = this.f46870d;
                textView9.setText(textView9.getResources().getString(R.string.pay_game_amount, this.f46875i.getPayGameAmount()));
            } else {
                TextView textView10 = this.f46870d;
                textView10.setText(textView10.getResources().getString(R.string.download_status_download));
            }
            this.f46874h.setImageResource(R.drawable.detail_comment_download_continue);
            UtilsMy.w0(this.f46875i, downloadTask.getCrc_link_type_val());
            UtilsMy.x3(this.f46870d, downloadTask);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d(this.f46879m);
    }

    public void setCoin(TipNew tipNew, DownloadTask downloadTask) {
        UtilsMy.j3(tipNew, this.f46871e, downloadTask);
    }

    public void setProgress(int i4) {
        this.f46868b.setVisibility(8);
        this.f46869c.setVisibility(0);
        TextView textView = this.f46872f;
        textView.setText(i4 + "%");
        this.f46873g.setProgress(i4);
    }

    public DownloadViewBig(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46881o = 0;
        this.f46882p = 0;
        this.f46883q = "";
        this.f46884r = "";
        this.f46885s = "";
        c(context);
    }

    public DownloadViewBig(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46881o = 0;
        this.f46882p = 0;
        this.f46883q = "";
        this.f46884r = "";
        this.f46885s = "";
        c(context);
    }
}
