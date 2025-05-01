package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
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
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.Where;
/* loaded from: classes4.dex */
public class DownloadViewStroke extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f46900b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f46901c;

    /* renamed from: d  reason: collision with root package name */
    private PayTagInfo f46902d;

    /* renamed from: e  reason: collision with root package name */
    private int f46903e;

    /* renamed from: f  reason: collision with root package name */
    private ModInfoBean f46904f;

    /* renamed from: g  reason: collision with root package name */
    private String f46905g;

    /* renamed from: h  reason: collision with root package name */
    private DownloadTask f46906h;

    /* renamed from: i  reason: collision with root package name */
    private CollectionBeanSub f46907i;

    /* renamed from: j  reason: collision with root package name */
    private int f46908j;

    /* renamed from: k  reason: collision with root package name */
    private int f46909k;

    /* renamed from: l  reason: collision with root package name */
    private String f46910l;

    /* renamed from: m  reason: collision with root package name */
    private Ext f46911m;

    public DownloadViewStroke(Context context) {
        super(context);
        this.f46908j = 0;
        this.f46909k = 0;
        this.f46910l = "";
        c(context);
    }

    private void c(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.install_button_stroke_layout, this);
        this.f46900b = (TextView) inflate.findViewById(R.id.instalButtomButn);
        this.f46901c = (TextView) inflate.findViewById(R.id.moneyText);
    }

    public void a(DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
        setCoin(collectionBeanSub.getSp_tag_info(), downloadTask);
        this.f46907i = collectionBeanSub;
        this.f46905g = collectionBeanSub.getGame_id();
        this.f46902d = collectionBeanSub.getPay_tag_info();
        this.f46906h = downloadTask;
        this.f46903e = collectionBeanSub.getDown_status();
        this.f46900b.setOnClickListener(this);
        f(downloadTask);
        this.f46908j = collectionBeanSub.get_from();
        this.f46909k = collectionBeanSub.get_from_type();
        this.f46910l = collectionBeanSub.getRecPosition();
        this.f46904f = collectionBeanSub.getMod_info();
    }

    @Deprecated
    public void b(String str, TipNew tipNew, PayTagInfo payTagInfo, DownloadTask downloadTask, int i4, DownloadPointBase downloadPointBase, ModInfoBean modInfoBean) {
        setCoin(tipNew, downloadTask);
        this.f46905g = str;
        this.f46902d = payTagInfo;
        this.f46906h = downloadTask;
        this.f46903e = i4;
        this.f46900b.setOnClickListener(this);
        f(downloadTask);
        this.f46908j = downloadPointBase.get_from();
        this.f46909k = downloadPointBase.get_from_type();
        this.f46910l = downloadPointBase.getRecPosition();
        this.f46904f = modInfoBean;
    }

    public void d(DownloadTask downloadTask) {
        if (this.f46911m != null) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.clickAdvDownButton, this.f46911m);
        }
        if (downloadTask != null) {
            if (("" + downloadTask.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                IntentUtil.getInstance().goShareWebActivity(getContext(), downloadTask.getPortraitURL());
                UtilsMy.T2(downloadTask, getContext());
            }
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (downloadTask != null && UtilsMy.w0(this.f46902d, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (downloadTask == null) {
            UtilsMy.Y0(getContext(), this.f46907i);
            return;
        }
        if (status == 2 || status == 10) {
            com.php25.PDownload.d.i(downloadTask);
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(getContext(), downloadTask);
                return;
            } else if (status == 5) {
                UtilsMy.T3(getContext(), downloadTask);
            } else if (status == 3 || status == 6) {
                com.php25.PDownload.d.c(downloadTask, getContext());
            } else if (status == 9) {
                if (downloadTask.getCrc_link_type_val() == null || downloadTask.getCrc_link_type_val().equals("") || UtilsMy.o1(getContext(), downloadTask)) {
                    return;
                }
                if (this.f46903e == 5) {
                    UtilsMy.l1(getContext(), downloadTask);
                    return;
                }
                UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                com.php25.PDownload.d.b(downloadTask);
                downloadTask.setVer(downloadTask.getVer());
                downloadTask.setVer_name(downloadTask.getVer_name());
                downloadTask.setUrl(downloadTask.getUrl());
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
                downloadTask.setUrl(downloadTask.getUrl());
                downloadTask.setCfg_ver(downloadTask.getCfg_ver());
                downloadTask.setCfg_ver_name(downloadTask.getCfg_ver_name());
                downloadTask.setCfg_down_url(downloadTask.getCfg_down_url());
                downloadTask.setKeyword(Where.detail.name());
                UtilsMy.r4(getContext(), downloadTask);
            } else if (11 == status) {
                UtilsMy.a4(downloadTask, getContext());
            } else if (43 == status) {
                downloadTask.setKeyword(Where.detail.name());
                if (UtilsMy.y0(this.f46902d, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(getContext(), downloadTask.getCrc_link_type_val());
                } else if (!UtilsMy.o1(getContext(), downloadTask)) {
                    if (this.f46903e == 5) {
                        UtilsMy.l1(getContext(), downloadTask);
                    } else {
                        UtilsMy.R0(getContext(), downloadTask, downloadTask.getTp_down_url(), 0, 0);
                    }
                }
            } else {
                downloadTask.setKeyword(Where.detail.name());
                if (UtilsMy.y0(this.f46902d, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(getContext(), downloadTask.getCrc_link_type_val());
                } else if (!UtilsMy.o1(getContext(), downloadTask)) {
                    if (this.f46903e == 5) {
                        UtilsMy.l1(getContext(), downloadTask);
                    } else {
                        UtilsMy.R0(getContext(), downloadTask, downloadTask.getTp_down_url(), 0, 0);
                    }
                }
            }
        }
        f(downloadTask);
    }

    void e(TipNew tipNew, View view, DownloadTask downloadTask) {
        TextView textView;
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = (TextView) view.findViewById(R.id.moneyText);
        }
        if (textView == null) {
            return;
        }
        if (downloadTask != null && downloadTask.getStatus() != 0) {
            textView.setVisibility(4);
        } else if (tipNew != null && tipNew.getCoin() != null) {
            textView.setText(tipNew.getCoin().getName());
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
    }

    public void f(DownloadTask downloadTask) {
        this.f46900b.setTextColor(getResources().getColor(R.color.app_blue_color));
        if (downloadTask == null) {
            PayTagInfo payTagInfo = this.f46902d;
            if (payTagInfo != null && payTagInfo.getAmount_check() > 0) {
                TextView textView = this.f46900b;
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, this.f46902d.getPayGameAmount()));
            } else {
                TextView textView2 = this.f46900b;
                textView2.setText(textView2.getResources().getString(R.string.download_status_download));
            }
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
            this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
            TextView textView3 = this.f46900b;
            int i4 = this.f46903e;
            PayTagInfo payTagInfo2 = this.f46902d;
            UtilsMy.W2(textView3, i4, payTagInfo2 == null ? 0 : payTagInfo2.getPay_game_amount(), this.f46905g);
            CollectionBeanSub collectionBeanSub = this.f46907i;
            if (collectionBeanSub == null || collectionBeanSub.getPlugin_num() == null) {
                return;
            }
            String plugin_num = this.f46907i.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
                this.f46900b.setText("开始");
                this.f46900b.setTextColor(getResources().getColor(R.color.app_blue_color));
                this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
                this.f46900b.setVisibility(0);
                return;
            }
            return;
        }
        if (downloadTask.getPlugin_num() != null) {
            String plugin_num2 = downloadTask.getPlugin_num();
            if (plugin_num2.equals(ConstantIntEnum.H5.value() + "")) {
                this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
                this.f46900b.setText("开始");
                this.f46900b.setTextColor(getResources().getColor(R.color.app_blue_color));
                this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
                this.f46900b.setVisibility(0);
                return;
            }
        }
        int status = downloadTask.getStatus();
        if (UtilsMy.w0(this.f46902d, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
        if (status == 9) {
            this.f46900b.setText("更新");
            this.f46900b.setBackgroundResource(R.drawable.recom_green_butn);
            this.f46900b.setTextColor(getContext().getResources().getColor(R.color.app_green_color));
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
        } else if (status == 12) {
            this.f46900b.setText("解压中..");
            this.f46900b.setTextSize(2, 10.0f);
        } else if (status == 13) {
            this.f46900b.setText("解压");
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
        } else if (status == 11) {
            this.f46900b.setText("安装");
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
            this.f46900b.setTextColor(getContext().getResources().getColor(R.color.app_green_color));
            this.f46900b.setBackgroundResource(R.drawable.recom_green_butn);
        } else if (status == 48) {
            this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
            this.f46900b.setText("安装中");
            this.f46900b.setTextColor(getContext().getResources().getColor(R.color.app_blue_color));
        } else if (status == 5 || status == 42) {
            this.f46900b.setBackgroundResource(R.drawable.recom_maincolor_butn);
            TextView textView4 = this.f46900b;
            textView4.setText(textView4.getResources().getString(R.string.download_status_finished));
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
            this.f46900b.setTextColor(getResources().getColor(R.color.app_main_color));
        } else if (status == 2) {
            UtilsMy.x4(downloadTask);
            this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
            this.f46900b.setText("暂停");
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
        } else if (status == 3 || status == 6 || status == 27) {
            UtilsMy.x4(downloadTask);
            this.f46900b.setBackgroundResource(R.drawable.recom_blue_butn);
            this.f46900b.setText("继续");
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
        } else if (status == 10) {
            this.f46900b.setText("等待");
            this.f46900b.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp26));
        } else if (status == 1) {
        } else {
            if (status == 43) {
                PayTagInfo payTagInfo3 = this.f46902d;
                if (payTagInfo3 != null && payTagInfo3.getAmount_check() > 0) {
                    TextView textView5 = this.f46900b;
                    textView5.setText(textView5.getResources().getString(R.string.pay_game_amount, this.f46902d.getPayGameAmount()));
                } else {
                    TextView textView6 = this.f46900b;
                    textView6.setText(textView6.getResources().getString(R.string.download_status_download));
                }
                UtilsMy.w0(this.f46902d, downloadTask.getCrc_link_type_val());
                UtilsMy.b3(this.f46900b, downloadTask);
                return;
            }
            PayTagInfo payTagInfo4 = this.f46902d;
            if (payTagInfo4 != null && payTagInfo4.getAmount_check() > 0) {
                TextView textView7 = this.f46900b;
                textView7.setText(textView7.getResources().getString(R.string.pay_game_amount, this.f46902d.getPayGameAmount()));
            } else {
                TextView textView8 = this.f46900b;
                textView8.setText(textView8.getResources().getString(R.string.download_status_download));
            }
            UtilsMy.w0(this.f46902d, downloadTask.getCrc_link_type_val());
            UtilsMy.b3(this.f46900b, downloadTask);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d(this.f46906h);
    }

    public void setCoin(TipNew tipNew, DownloadTask downloadTask) {
        e(tipNew, this, downloadTask);
    }

    public void setExt(Ext ext) {
        this.f46911m = ext;
    }

    public DownloadViewStroke(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46908j = 0;
        this.f46909k = 0;
        this.f46910l = "";
        c(context);
    }

    public DownloadViewStroke(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46908j = 0;
        this.f46909k = 0;
        this.f46910l = "";
        c(context);
    }
}
