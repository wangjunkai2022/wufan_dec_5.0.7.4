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
public class DownloadViewNormal extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f46886b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f46887c;

    /* renamed from: d  reason: collision with root package name */
    private PayTagInfo f46888d;

    /* renamed from: e  reason: collision with root package name */
    private int f46889e;

    /* renamed from: f  reason: collision with root package name */
    private ModInfoBean f46890f;

    /* renamed from: g  reason: collision with root package name */
    private String f46891g;

    /* renamed from: h  reason: collision with root package name */
    private DownloadTask f46892h;

    /* renamed from: i  reason: collision with root package name */
    private CollectionBeanSub f46893i;

    /* renamed from: j  reason: collision with root package name */
    private int f46894j;

    /* renamed from: k  reason: collision with root package name */
    private int f46895k;

    /* renamed from: l  reason: collision with root package name */
    private String f46896l;

    /* renamed from: m  reason: collision with root package name */
    private String f46897m;

    /* renamed from: n  reason: collision with root package name */
    private String f46898n;

    /* renamed from: o  reason: collision with root package name */
    private Ext f46899o;

    public DownloadViewNormal(Context context) {
        super(context);
        this.f46894j = 0;
        this.f46895k = 0;
        this.f46896l = "";
        this.f46897m = "";
        this.f46898n = "";
        c(context);
    }

    private void c(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.install_button_normal_layout, this);
        this.f46886b = (TextView) inflate.findViewById(R.id.instalButtomButn);
        this.f46887c = (TextView) inflate.findViewById(R.id.moneyText);
    }

    public void a(DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
        setCoin(collectionBeanSub.getSp_tag_info(), downloadTask);
        this.f46893i = collectionBeanSub;
        this.f46891g = collectionBeanSub.getGame_id();
        this.f46888d = collectionBeanSub.getPay_tag_info();
        this.f46892h = downloadTask;
        this.f46889e = collectionBeanSub.getDown_status();
        this.f46886b.setOnClickListener(this);
        e(downloadTask);
        this.f46894j = collectionBeanSub.get_from();
        this.f46895k = collectionBeanSub.get_from_type();
        this.f46896l = collectionBeanSub.getRecPosition();
        this.f46897m = collectionBeanSub.getReMarks();
        this.f46898n = collectionBeanSub.getNodeId();
        this.f46890f = collectionBeanSub.getMod_info();
    }

    @Deprecated
    public void b(String str, TipNew tipNew, PayTagInfo payTagInfo, DownloadTask downloadTask, int i4, DownloadPointBase downloadPointBase, ModInfoBean modInfoBean) {
        setCoin(tipNew, downloadTask);
        this.f46891g = str;
        this.f46888d = payTagInfo;
        this.f46892h = downloadTask;
        this.f46889e = i4;
        this.f46886b.setOnClickListener(this);
        e(downloadTask);
        this.f46894j = downloadPointBase.get_from();
        this.f46895k = downloadPointBase.get_from_type();
        this.f46890f = modInfoBean;
        this.f46898n = downloadPointBase.getNodeId();
        this.f46897m = downloadPointBase.getReMarks();
    }

    public void d(DownloadTask downloadTask) {
        if (this.f46899o != null) {
            com.papa.sim.statistic.p.l(getContext()).O1(Event.clickAdvDownButton, this.f46899o);
        }
        if (downloadTask != null) {
            if (("" + downloadTask.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                IntentUtil.getInstance().goShareWebActivity(getContext(), downloadTask.getPortraitURL());
                UtilsMy.T2(downloadTask, getContext());
            }
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (downloadTask != null && UtilsMy.w0(this.f46888d, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (downloadTask == null) {
            if (this.f46893i != null) {
                UtilsMy.Y0(getContext(), this.f46893i);
                return;
            } else if (this.f46890f == null) {
                UtilsMy.d1(getContext(), this.f46891g, "", this.f46894j, this.f46895k, this.f46896l, this.f46897m, this.f46898n, this.f46893i.getPosition_path(), false);
                return;
            } else {
                UtilsMy.d1(getContext(), this.f46890f.getMod_game_id(), "", this.f46894j, this.f46895k, this.f46896l, this.f46897m, this.f46898n, this.f46893i.getPosition_path(), false);
                return;
            }
        }
        if (status == 2 || status == 10) {
            com.php25.PDownload.d.i(downloadTask);
        } else if (status == 3 || status == 6) {
            com.php25.PDownload.d.c(downloadTask, getContext());
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                com.php25.PDownload.d.l(getContext(), downloadTask);
                return;
            } else if (status == 5) {
                UtilsMy.T3(getContext(), downloadTask);
            } else if (status == 9) {
                if (downloadTask.getCrc_link_type_val() == null || downloadTask.getCrc_link_type_val().equals("") || UtilsMy.o1(getContext(), downloadTask)) {
                    return;
                }
                if (this.f46889e == 5) {
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
                if (UtilsMy.y0(this.f46888d, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(getContext(), downloadTask.getCrc_link_type_val());
                } else if (!UtilsMy.o1(getContext(), downloadTask)) {
                    if (this.f46889e == 5) {
                        UtilsMy.l1(getContext(), downloadTask);
                    } else {
                        UtilsMy.R0(getContext(), downloadTask, downloadTask.getTp_down_url(), 0, 0);
                    }
                }
            } else {
                downloadTask.setKeyword(Where.detail.name());
                if (UtilsMy.y0(this.f46888d, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(getContext(), downloadTask.getCrc_link_type_val());
                } else if (!UtilsMy.o1(getContext(), downloadTask)) {
                    if (this.f46889e == 5) {
                        UtilsMy.l1(getContext(), downloadTask);
                    } else {
                        UtilsMy.R0(getContext(), downloadTask, downloadTask.getTp_down_url(), 0, 0);
                    }
                }
            }
        }
        e(downloadTask);
    }

    public void e(DownloadTask downloadTask) {
        if (downloadTask == null) {
            PayTagInfo payTagInfo = this.f46888d;
            if (payTagInfo != null && payTagInfo.getAmount_check() > 0) {
                TextView textView = this.f46886b;
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, this.f46888d.getPayGameAmount()));
            } else {
                this.f46886b.setText(getResources().getString(R.string.download_status_download));
            }
            this.f46886b.setBackgroundResource(R.drawable.installbutn_big_normal);
            TextView textView2 = this.f46886b;
            int i4 = this.f46889e;
            PayTagInfo payTagInfo2 = this.f46888d;
            UtilsMy.W2(textView2, i4, payTagInfo2 != null ? payTagInfo2.getPay_game_amount() : 0, this.f46891g);
            return;
        }
        if (downloadTask.getPlugin_num() != null) {
            String plugin_num = downloadTask.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                this.f46886b.setBackgroundResource(R.drawable.installbutn_big_normal);
                this.f46886b.setText("开始");
                this.f46886b.setVisibility(0);
                return;
            }
        }
        int status = downloadTask.getStatus();
        if (UtilsMy.w0(this.f46888d, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        this.f46886b.setBackgroundResource(R.drawable.installbutn_big_normal);
        if (status == 9) {
            this.f46886b.setText("更新");
        } else if (status == 12) {
            this.f46886b.setText("解压中..");
        } else if (status == 13) {
            this.f46886b.setText("解压");
        } else if (status == 11) {
            this.f46886b.setText("安装");
            this.f46886b.setBackgroundResource(R.drawable.installbutn_big_installl);
        } else if (status == 5 || status == 42) {
            this.f46886b.setBackgroundResource(R.drawable.installbutn_big_open);
            TextView textView3 = this.f46886b;
            textView3.setText(textView3.getResources().getString(R.string.download_status_finished));
        } else if (status == 2) {
            UtilsMy.x4(downloadTask);
            this.f46886b.setBackgroundResource(R.drawable.installbutn_big_normal);
            this.f46886b.setText("暂停");
        } else if (status == 3 || status == 6 || status == 27) {
            UtilsMy.x4(downloadTask);
            this.f46886b.setBackgroundResource(R.drawable.installbutn_big_normal);
            this.f46886b.setText("继续");
        } else if (status == 10) {
            this.f46886b.setText("等待");
        } else if (status == 1) {
        } else {
            if (status == 43) {
                PayTagInfo payTagInfo3 = this.f46888d;
                if (payTagInfo3 != null && payTagInfo3.getAmount_check() > 0) {
                    TextView textView4 = this.f46886b;
                    textView4.setText(textView4.getResources().getString(R.string.pay_game_amount, this.f46888d.getPayGameAmount()));
                } else {
                    this.f46886b.setText(getResources().getString(R.string.download_status_download));
                }
                UtilsMy.w0(this.f46888d, downloadTask.getCrc_link_type_val());
                UtilsMy.x3(this.f46886b, downloadTask);
                return;
            }
            PayTagInfo payTagInfo4 = this.f46888d;
            if (payTagInfo4 != null && payTagInfo4.getAmount_check() > 0) {
                TextView textView5 = this.f46886b;
                textView5.setText(textView5.getResources().getString(R.string.pay_game_amount, this.f46888d.getPayGameAmount()));
            } else {
                this.f46886b.setText(getResources().getString(R.string.download_status_download));
            }
            UtilsMy.w0(this.f46888d, downloadTask.getCrc_link_type_val());
            UtilsMy.x3(this.f46886b, downloadTask);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d(this.f46892h);
    }

    public void setCoin(TipNew tipNew, DownloadTask downloadTask) {
        UtilsMy.j3(tipNew, this, downloadTask);
    }

    public void setExt(Ext ext) {
        this.f46899o = ext;
    }

    public DownloadViewNormal(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46894j = 0;
        this.f46895k = 0;
        this.f46896l = "";
        this.f46897m = "";
        this.f46898n = "";
        c(context);
    }

    public DownloadViewNormal(Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46894j = 0;
        this.f46895k = 0;
        this.f46896l = "";
        this.f46897m = "";
        this.f46898n = "";
        c(context);
    }
}
