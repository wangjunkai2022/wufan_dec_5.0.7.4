package x1;

import android.content.Context;
import android.content.res.Resources;
import b2.e0;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.DownloadNormalView;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.TipNew;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.php25.PDownload.d;
import w1.e;
/* compiled from: DownloadNormalCallbackImpl.java */
/* loaded from: classes4.dex */
public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private Context f73553a;

    /* renamed from: b  reason: collision with root package name */
    private PayTagInfo f73554b;

    /* renamed from: c  reason: collision with root package name */
    private int f73555c;

    /* renamed from: d  reason: collision with root package name */
    private ModInfoBean f73556d;

    /* renamed from: e  reason: collision with root package name */
    private String f73557e;

    /* renamed from: f  reason: collision with root package name */
    private DownloadTask f73558f;

    /* renamed from: g  reason: collision with root package name */
    private CollectionBeanSub f73559g;

    /* renamed from: h  reason: collision with root package name */
    private int f73560h;

    /* renamed from: i  reason: collision with root package name */
    private int f73561i;

    /* renamed from: j  reason: collision with root package name */
    private String f73562j;

    /* renamed from: k  reason: collision with root package name */
    private String f73563k;

    /* renamed from: l  reason: collision with root package name */
    private String f73564l;

    /* renamed from: m  reason: collision with root package name */
    private Ext f73565m;

    public b(Context context, DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
        this.f73560h = 0;
        this.f73561i = 0;
        this.f73562j = "";
        this.f73563k = "";
        this.f73564l = "";
        this.f73553a = context;
        this.f73559g = collectionBeanSub;
        this.f73557e = collectionBeanSub.getGame_id();
        this.f73554b = collectionBeanSub.getPay_tag_info();
        this.f73558f = downloadTask;
        this.f73555c = collectionBeanSub.getDown_status();
        this.f73560h = collectionBeanSub.get_from();
        this.f73561i = collectionBeanSub.get_from_type();
        this.f73562j = collectionBeanSub.getRecPosition();
        this.f73563k = collectionBeanSub.getReMarks();
        this.f73564l = collectionBeanSub.getNodeId();
        this.f73556d = collectionBeanSub.getMod_info();
    }

    private void g(DownloadNormalView downloadNormalView, TipNew tipNew, DownloadTask downloadTask) {
        if (downloadTask != null) {
            try {
                if (downloadTask.getStatus() != 0) {
                    downloadNormalView.a("", false);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (tipNew != null && tipNew.getCoin() != null) {
            downloadNormalView.a(tipNew.getCoin().getName(), true);
        } else {
            downloadNormalView.a("", false);
        }
    }

    @Override // w1.e
    public void a(DownloadNormalView downloadNormalView) {
        e(downloadNormalView, this.f73558f);
    }

    @Override // w1.e
    public void b() {
    }

    @Override // w1.e
    public void c(DownloadNormalView downloadNormalView) {
        h(downloadNormalView, this.f73558f);
        g(downloadNormalView, this.f73559g.getSp_tag_info(), this.f73558f);
    }

    public int d(int i4, String str) {
        if (i4 <= 0 || e0.o().p(str)) {
            return 0;
        }
        return i4;
    }

    public void e(DownloadNormalView downloadNormalView, DownloadTask downloadTask) {
        if (this.f73565m != null) {
            p.l(this.f73553a).O1(Event.clickAdvDownButton, this.f73565m);
        }
        if (downloadTask != null) {
            if (("" + downloadTask.getPlugin_num()).equals("" + ConstantIntEnum.H5.value())) {
                IntentUtil.getInstance().goShareWebActivity(this.f73553a, downloadTask.getPortraitURL());
                UtilsMy.T2(downloadTask, this.f73553a);
            }
        }
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (downloadTask != null && UtilsMy.w0(this.f73554b, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (downloadTask == null) {
            CollectionBeanSub collectionBeanSub = this.f73559g;
            if (collectionBeanSub != null) {
                UtilsMy.Y0(this.f73553a, collectionBeanSub);
                return;
            }
            ModInfoBean modInfoBean = this.f73556d;
            if (modInfoBean == null) {
                UtilsMy.d1(this.f73553a, this.f73557e, "", this.f73560h, this.f73561i, this.f73562j, this.f73563k, this.f73564l, collectionBeanSub.getPosition_path(), false);
                return;
            } else {
                UtilsMy.d1(this.f73553a, modInfoBean.getMod_game_id(), "", this.f73560h, this.f73561i, this.f73562j, this.f73563k, this.f73564l, this.f73559g.getPosition_path(), false);
                return;
            }
        }
        if (status == 2 || status == 10) {
            d.i(downloadTask);
        } else if (status == 3 || status == 6) {
            d.c(downloadTask, this.f73553a);
        } else if (status == 12 || status == 27) {
            return;
        } else {
            if (status == 13) {
                d.l(this.f73553a, downloadTask);
                return;
            } else if (status == 5) {
                UtilsMy.T3(this.f73553a, downloadTask);
            } else if (status == 9) {
                if (downloadTask.getCrc_link_type_val() == null || downloadTask.getCrc_link_type_val().equals("") || UtilsMy.o1(this.f73553a, downloadTask)) {
                    return;
                }
                if (this.f73555c == 5) {
                    UtilsMy.l1(this.f73553a, downloadTask);
                    return;
                }
                UtilsMy.z4(downloadTask, downloadTask.getCrc_link_type_val());
                d.b(downloadTask);
                downloadTask.setVer(downloadTask.getVer());
                downloadTask.setVer_name(downloadTask.getVer_name());
                downloadTask.setUrl(downloadTask.getUrl());
                downloadTask.setCfg_ver(downloadTask.getCfg_ver());
                downloadTask.setCfg_ver_name(downloadTask.getCfg_ver_name());
                downloadTask.setCfg_down_url(downloadTask.getCfg_down_url());
                d.c(downloadTask, this.f73553a);
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
                UtilsMy.r4(this.f73553a, downloadTask);
            } else if (11 == status) {
                UtilsMy.a4(downloadTask, this.f73553a);
            } else if (43 == status) {
                if (UtilsMy.y0(this.f73554b, downloadTask.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(this.f73553a, downloadTask.getCrc_link_type_val());
                } else if (this.f73555c == 5) {
                    UtilsMy.l1(this.f73553a, downloadTask);
                } else {
                    UtilsMy.R0(this.f73553a, downloadTask, downloadTask.getTp_down_url(), 0, 0);
                }
            } else if (UtilsMy.y0(this.f73554b, downloadTask.getCrc_link_type_val()) > 0) {
                UtilsMy.d4(this.f73553a, downloadTask.getCrc_link_type_val());
            } else if (this.f73555c == 5) {
                UtilsMy.l1(this.f73553a, downloadTask);
            } else {
                UtilsMy.R0(this.f73553a, downloadTask, downloadTask.getTp_down_url(), 0, 0);
            }
        }
        h(downloadNormalView, downloadTask);
    }

    public void f(Ext ext) {
        this.f73565m = ext;
    }

    public void h(DownloadNormalView downloadNormalView, DownloadTask downloadTask) {
        if (downloadTask == null) {
            PayTagInfo payTagInfo = this.f73554b;
            int pay_game_amount = payTagInfo == null ? 0 : payTagInfo.getPay_game_amount();
            boolean z4 = d(pay_game_amount, this.f73557e) > 0;
            int i4 = this.f73555c;
            if (i4 == 3 && !z4) {
                downloadNormalView.c(41, this.f73553a.getResources().getString(R.string.dl_text_pre_down));
                return;
            } else if (i4 == 2 && !z4) {
                downloadNormalView.c(40, this.f73553a.getResources().getString(R.string.dl_text_coming_soon));
                return;
            } else if (i4 == 6 && !z4) {
                downloadNormalView.c(39, this.f73553a.getResources().getString(R.string.dl_text_reservation));
                return;
            } else if (pay_game_amount > 0) {
                Resources resources = this.f73553a.getResources();
                downloadNormalView.c(43, resources.getString(R.string.pay_game_amount, this.f73554b + ""));
                return;
            } else {
                downloadNormalView.b(0);
                return;
            }
        }
        if (downloadTask.getPlugin_num() != null) {
            String plugin_num = downloadTask.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                downloadNormalView.b(0);
                return;
            }
        }
        int status = downloadTask.getStatus();
        if (UtilsMy.w0(this.f73554b, downloadTask.getCrc_link_type_val()) > 0) {
            status = 43;
        }
        if (status == 2 || status == 3 || status == 6 || status == 27) {
            UtilsMy.x4(downloadTask);
            downloadNormalView.b(status);
        } else if (status == 43) {
            PayTagInfo payTagInfo2 = this.f73554b;
            if (payTagInfo2 == null || payTagInfo2.getAmount_check() <= 0) {
                downloadNormalView.b(43);
            } else {
                downloadNormalView.c(43, this.f73553a.getResources().getString(R.string.pay_game_amount, this.f73554b.getPayGameAmount()));
            }
        } else {
            downloadNormalView.b(status);
        }
    }
}
