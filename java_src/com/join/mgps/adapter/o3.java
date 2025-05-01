package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.EverdayNewGameActivity;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.MGInformationActivity_;
import com.join.mgps.activity.NowWufunActivity_;
import com.join.mgps.activity.PapayPayDetialActivity_;
import com.join.mgps.activity.vipzone.bean.IconGame;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.CubeRotateView;
import com.join.mgps.customview.HorizontalRecyclerView;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayout6;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.AppMoreBean;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GameDiscoverTheNewBean;
import com.join.mgps.dto.GameRankingBean;
import com.join.mgps.dto.MgpapaMainItemBean;
import com.join.mgps.dto.ModleBean;
import com.join.mgps.dto.PAPAHomeBeanV7;
import com.join.mgps.dto.PAPAItemTitle2;
import com.join.mgps.dto.PapaMainGameBespeakInfo;
import com.join.mgps.dto.PapaMainLive;
import com.join.mgps.dto.PapaMainLivelistItem;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.fragment.RankingItemFragment;
import com.join.mgps.fragment.RankingItemV2Fragment;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.ExtFrom;
import com.psk.eventmodule.Event;
import com.psk.eventmodule.StatFactory;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PapaMainAdapter.java */
/* loaded from: classes4.dex */
public class o3 extends BaseAdapter {
    public static final int A = 12;
    public static final int B = 13;
    public static final int C = 14;
    public static final int D = 15;
    public static final int E = 16;
    public static final int F = 18;
    public static final int G = 19;
    public static final int H = 20;
    public static final int I = 21;
    public static final int J = 22;
    public static final int K = 23;
    public static final int L = 24;
    public static final int M = 25;
    public static final int N = 26;
    public static final int O = 27;
    public static final int P = 28;
    public static final int Q = 29;
    public static final int R = 30;
    public static final int S = 31;
    public static final int T = 32;
    public static final int U = 33;
    public static final int V = 34;
    public static final int W = 35;
    public static final int X = 36;
    public static final int Y = 37;
    public static final int Z = 38;

    /* renamed from: o  reason: collision with root package name */
    public static final int f45078o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f45079p = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f45080p0 = 39;

    /* renamed from: p1  reason: collision with root package name */
    private static u2 f45081p1 = null;

    /* renamed from: q  reason: collision with root package name */
    public static final int f45082q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f45083r = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final int f45084s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final int f45085t = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final int f45086u = 6;

    /* renamed from: v  reason: collision with root package name */
    public static final int f45087v = 7;

    /* renamed from: w  reason: collision with root package name */
    public static final int f45088w = 8;

    /* renamed from: x  reason: collision with root package name */
    public static final int f45089x = 9;

    /* renamed from: y  reason: collision with root package name */
    public static final int f45090y = 10;

    /* renamed from: z  reason: collision with root package name */
    public static final int f45091z = 11;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f45092b;

    /* renamed from: c  reason: collision with root package name */
    private Context f45093c;

    /* renamed from: d  reason: collision with root package name */
    Fragment f45094d;

    /* renamed from: e  reason: collision with root package name */
    private List<MgpapaMainItemBean> f45095e;

    /* renamed from: g  reason: collision with root package name */
    private CountDownTimer f45097g;

    /* renamed from: h  reason: collision with root package name */
    private CountDownTimer f45098h;

    /* renamed from: i  reason: collision with root package name */
    private c2.f f45099i;

    /* renamed from: j  reason: collision with root package name */
    public int f45100j;

    /* renamed from: l  reason: collision with root package name */
    com.join.android.app.component.video.c f45102l;

    /* renamed from: m  reason: collision with root package name */
    NavigationAdapter f45103m;

    /* renamed from: k  reason: collision with root package name */
    private Handler f45101k = new k();

    /* renamed from: n  reason: collision with root package name */
    private l1 f45104n = null;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, y1> f45096f = new HashMap();

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45093c.startActivity(new Intent(o3.this.f45093c, EverdayNewGameActivity.class));
            o3.this.T("3-3");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class a0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45107c;

        a0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45106b = recomDatabeanBusiness;
            this.f45107c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDataBean = this.f45106b.getSub().get(0).getIntentDataBean();
            ExtBean extBean = intentDataBean.getExtBean();
            extBean.setRecPosition(this.f45107c.getMoreType2());
            extBean.setReMarks(this.f45107c.getReMarks());
            intentDataBean.setExtBean(extBean);
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
            if (this.f45106b.getSub() != null && this.f45106b.getSub().size() > 0) {
                AppBean game_info = this.f45106b.getSub().get(0).getGame_info();
                o3.this.W(this.f45107c.getMoreType2(), intentDataBean.getCrc_link_type_val(), game_info.getPosition_path(), UtilsMy.k2(game_info.getTag_info()));
            }
            o3 o3Var = o3.this;
            o3Var.T(this.f45107c.getMoreType2().replace("-x", "-1") + "-0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class a1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45109b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppBean f45110c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45111d;

        a1(RecomDatabeanBusiness recomDatabeanBusiness, AppBean appBean, int i4) {
            this.f45109b = recomDatabeanBusiness;
            this.f45110c = appBean;
            this.f45111d = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask a5 = this.f45109b.a();
            String plugin_num = this.f45110c.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f45110c.getDown_url_remote());
                if (a5 == null) {
                    a5 = this.f45110c.getDownloadtaskDown();
                }
                UtilsMy.T2(a5, o3.this.f45093c);
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDateBean);
            } else if (a5 == null) {
                if (UtilsMy.o0(this.f45110c.getTag_info()) && com.join.android.app.common.utils.e.l0(o3.this.f45093c).d(o3.this.f45093c, this.f45110c.getPackageName())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(o3.this.f45093c).l(o3.this.f45093c, this.f45110c.getPackageName());
                    if (!com.join.mgps.Util.g2.i(this.f45110c.getVer()) || l4.d() >= Integer.parseInt(this.f45110c.getVer())) {
                        com.join.android.app.common.utils.e.l0(o3.this.f45093c);
                        APKUtils.a0(o3.this.f45093c, this.f45110c.getPackageName());
                        return;
                    }
                }
                if (UtilsMy.y0(this.f45110c.getPay_tag_info(), this.f45110c.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(o3.this.f45093c, this.f45110c.getCrc_sign_id());
                } else {
                    UtilsMy.W0(o3.this.f45093c, this.f45110c);
                }
                o3 o3Var = o3.this;
                o3Var.T("10-" + this.f45111d + "-1");
            } else {
                int status = a5 != null ? a5.getStatus() : 0;
                if (UtilsMy.w0(this.f45110c.getPay_tag_info(), this.f45110c.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 13) {
                        com.php25.PDownload.d.l(o3.this.f45093c, a5);
                        return;
                    }
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(o3.this.f45093c, a5);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (a5.getCrc_link_type_val() == null || a5.getCrc_link_type_val().equals("")) {
                                            return;
                                        }
                                        a5.setId(p1.f.K().F(a5.getCrc_link_type_val()).getId());
                                        a5.setVer(this.f45110c.getVer());
                                        a5.setVer_name(this.f45110c.getVer_name());
                                        a5.setUrl(this.f45110c.getDown_url_remote());
                                        UtilsMy.r4(o3.this.f45093c, a5);
                                        return;
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(o3.this.f45093c)) {
                                                    com.join.mgps.Util.l2.a(o3.this.f45093c).b("无网络连接");
                                                    return;
                                                }
                                                int downloadType = this.f45110c.getDownloadType();
                                                if (downloadType != 0 && downloadType != 1) {
                                                    if (downloadType != 2) {
                                                        return;
                                                    }
                                                    UtilsMy.u4(a5);
                                                    return;
                                                } else if (a5.getCrc_link_type_val() == null || a5.getCrc_link_type_val().equals("")) {
                                                    return;
                                                } else {
                                                    DownloadTask F = p1.f.K().F(a5.getCrc_link_type_val());
                                                    if (UtilsMy.o1(o3.this.f45093c, a5)) {
                                                        return;
                                                    }
                                                    if (this.f45110c.getDown_status() == 5) {
                                                        UtilsMy.l1(o3.this.f45093c, a5);
                                                        return;
                                                    }
                                                    a5.setId(F.getId());
                                                    com.php25.PDownload.d.b(a5);
                                                    a5.setVer(this.f45110c.getVer());
                                                    a5.setVer_name(this.f45110c.getVer_name());
                                                    a5.setUrl(this.f45110c.getDown_url_remote());
                                                    com.php25.PDownload.d.c(a5, o3.this.f45093c);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(a5, o3.this.f45093c);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(a5, o3.this.f45093c);
                        return;
                    }
                    com.php25.PDownload.d.i(a5);
                    return;
                }
                o3 o3Var2 = o3.this;
                o3Var2.T("10-" + this.f45111d + 1);
                AppBean appBean = this.f45110c;
                if (appBean != null) {
                    if (UtilsMy.y0(appBean.getPay_tag_info(), this.f45110c.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(o3.this.f45093c, this.f45110c.getCrc_sign_id());
                        return;
                    }
                    UtilsMy.x1(a5, this.f45110c);
                    if (UtilsMy.o1(o3.this.f45093c, a5)) {
                        return;
                    }
                    if (this.f45110c.getDown_status() == 5) {
                        UtilsMy.l1(o3.this.f45093c, a5);
                    } else {
                        UtilsMy.R0(o3.this.f45093c, a5, this.f45110c.getTp_down_url(), this.f45110c.getOther_down_switch(), this.f45110c.getCdn_down_switch());
                    }
                }
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class a2 {

        /* renamed from: a  reason: collision with root package name */
        private TextView f45113a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45114b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f45115c;

        /* renamed from: d  reason: collision with root package name */
        public View f45116d;

        a2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45118b;

        b(RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45118b = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppMoreBean> more = this.f45118b.getMore();
            if (more == null || more.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, more.get(0).getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class b0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45120b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45121c;

        b0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45120b = recomDatabeanBusiness;
            this.f45121c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDataBean = this.f45120b.getSub().get(0).getIntentDataBean();
            ExtBean extBean = intentDataBean.getExtBean();
            extBean.setRecPosition(this.f45121c.getMoreType2());
            extBean.setReMarks(this.f45121c.getReMarks());
            intentDataBean.setExtBean(extBean);
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
            if (this.f45120b.getSub() != null && this.f45120b.getSub().size() > 0) {
                AppBean game_info = this.f45120b.getSub().get(0).getGame_info();
                o3.this.W(this.f45121c.getMoreType2(), intentDataBean.getCrc_link_type_val(), game_info.getPosition_path(), UtilsMy.k2(game_info.getTag_info()));
            }
            o3 o3Var = o3.this;
            o3Var.T(this.f45121c.getMoreType2().replace("-x", "-0") + "-1");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class b1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f45123b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45124c;

        b1(IntentDateBean intentDateBean, int i4) {
            this.f45123b = intentDateBean;
            this.f45124c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45123b);
            o3 o3Var = o3.this;
            o3Var.T("10-" + this.f45124c + "-1");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class b2 {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f45126a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45127b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f45128c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f45129d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45130e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45131f;

        /* renamed from: g  reason: collision with root package name */
        public RelativeLayout f45132g;

        /* renamed from: h  reason: collision with root package name */
        public RelativeLayout f45133h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f45134i;

        /* renamed from: j  reason: collision with root package name */
        public LinearLayout f45135j;

        b2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45137b;

        c(RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45137b = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppMoreBean> more = this.f45137b.getMore();
            if (more == null || more.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, more.get(0).getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class c0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45139b;

        c0(int i4) {
            this.f45139b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45102l.F(this.f45139b);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class c1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v2 f45141b;

        c1(v2 v2Var) {
            this.f45141b = v2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f45141b.f45489a.setVisibility(8);
            new PrefDef_(o3.this.f45093c).lastTopTip().g(this.f45141b.f45490b.getText().toString());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class c2 {
        public TextView A;

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f45143a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45144b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f45145c;

        /* renamed from: d  reason: collision with root package name */
        public SimpleDraweeView f45146d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45147e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45148f;

        /* renamed from: g  reason: collision with root package name */
        public RelativeLayout f45149g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f45150h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f45151i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f45152j;

        /* renamed from: k  reason: collision with root package name */
        public SimpleDraweeView f45153k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f45154l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f45155m;

        /* renamed from: n  reason: collision with root package name */
        public RelativeLayout f45156n;

        /* renamed from: o  reason: collision with root package name */
        public LinearLayout f45157o;

        /* renamed from: p  reason: collision with root package name */
        public TextView f45158p;

        /* renamed from: q  reason: collision with root package name */
        public TextView f45159q;

        /* renamed from: r  reason: collision with root package name */
        public SimpleDraweeView f45160r;

        /* renamed from: s  reason: collision with root package name */
        public TextView f45161s;

        /* renamed from: t  reason: collision with root package name */
        public TextView f45162t;

        /* renamed from: u  reason: collision with root package name */
        public RelativeLayout f45163u;

        /* renamed from: v  reason: collision with root package name */
        public LinearLayout f45164v;

        /* renamed from: w  reason: collision with root package name */
        public TextView f45165w;

        /* renamed from: x  reason: collision with root package name */
        public TextView f45166x;

        /* renamed from: y  reason: collision with root package name */
        public TextView f45167y;

        /* renamed from: z  reason: collision with root package name */
        public TextView f45168z;

        c2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45169b;

        d(MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45169b = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGInformationActivity_.v0(o3.this.f45093c).start();
            o3.this.T(this.f45169b.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class d0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45172c;

        d0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45171b = recomDatabeanBusiness;
            this.f45172c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45171b.getSub().get(0).getIntentDataBean());
            o3.this.T(this.f45172c.getMoreType2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class d1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f45174b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f45175c;

        d1(IntentDateBean intentDateBean, int i4) {
            this.f45174b = intentDateBean;
            this.f45175c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45174b);
            o3 o3Var = o3.this;
            o3Var.T("10-" + this.f45175c + "-1");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class d2 {

        /* renamed from: a  reason: collision with root package name */
        private TextView f45177a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45178b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f45179c;

        d2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45181b;

        e(MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45181b = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.T(this.f45181b.getMoreType2());
            MGInformationActivity_.v0(o3.this.f45093c).start();
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = o3.this.f45093c;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54092v + "/live/index.html");
            o3.this.T("9-1-0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class e1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45184b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f45185c;

        e1(int i4, IntentDateBean intentDateBean) {
            this.f45184b = i4;
            this.f45185c = intentDateBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3 o3Var = o3.this;
            o3Var.T("10-" + this.f45184b + "-0");
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45185c);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class e2 {

        /* renamed from: a  reason: collision with root package name */
        private CubeRotateView f45187a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45188b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f45189c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f45190d;

        e2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45192b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45193c;

        f(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45192b = recomDatabeanBusiness;
            this.f45193c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppMoreBean> more = this.f45192b.getMore();
            if (more != null && more.size() > 0) {
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, more.get(0).getIntentDataBean());
            }
            o3.this.T(this.f45193c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = o3.this.f45093c;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54092v + "/live/index.html");
            o3.this.T("9-2-0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class f1 extends CountDownTimer {

        /* compiled from: PapaMainAdapter.java */
        /* loaded from: classes4.dex */
        class a extends Thread {
            a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
                o3.this.f45101k.sendEmptyMessage(1);
            }
        }

        f1(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (o3.f45081p1 == null) {
                return;
            }
            o3.f45081p1.f45467m.setVisibility(0);
            o3.f45081p1.f45464j.setVisibility(8);
            new a().start();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class f2 {

        /* renamed from: a  reason: collision with root package name */
        private ConstraintLayout f45198a;

        /* renamed from: b  reason: collision with root package name */
        private SlidingTabLayout6 f45199b;

        /* renamed from: c  reason: collision with root package name */
        private ViewPager f45200c;

        /* renamed from: d  reason: collision with root package name */
        private LinearLayout f45201d;

        f2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45203b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45204c;

        g(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45203b = recomDatabeanBusiness;
            this.f45204c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppMoreBean> more = this.f45203b.getMore();
            if (more != null && more.size() > 0) {
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, more.get(0).getIntentDataBean());
            }
            o3.this.T(this.f45204c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerBean f45206b;

        g0(BannerBean bannerBean) {
            this.f45206b = bannerBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45206b.getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class g1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f45208b;

        g1(List list) {
            this.f45208b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Build.VERSION.SDK_INT < 15) {
                return;
            }
            try {
                com.join.mgps.Util.v0.h(PapayPayDetialActivity_.f36841l, System.currentTimeMillis() + "  onclick");
                IntentDateBean intentDataBean = ((RecomDatabeanBusiness) this.f45208b.get(0)).getSub().get(0).getIntentDataBean();
                o3.this.T("3-1");
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class g2 {

        /* renamed from: a  reason: collision with root package name */
        private SlidingTabLayout6 f45210a;

        /* renamed from: b  reason: collision with root package name */
        private ViewPager f45211b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45212c;

        g2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f45214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppBean f45216d;

        h(AppBeanMain appBeanMain, MgpapaMainItemBean mgpapaMainItemBean, AppBean appBean) {
            this.f45214b = appBeanMain;
            this.f45215c = mgpapaMainItemBean;
            this.f45216d = appBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDataBean = this.f45214b.getIntentDataBean();
            if (!this.f45215c.getMoreType2().startsWith("4-")) {
                this.f45215c.getMoreType2().startsWith("6-");
            }
            o3.this.W(this.f45215c.getMoreType2(), this.f45216d.getGame_id(), this.f45216d.getPosition_path(), UtilsMy.k2(this.f45216d.getTag_info()));
            o3 o3Var = o3.this;
            o3Var.T(this.f45215c.getMoreType2() + 0);
            ExtBean extBean = intentDataBean.getExtBean();
            extBean.setRecPosition(this.f45215c.getMoreType2());
            extBean.setReMarks(this.f45215c.getReMarks());
            intentDataBean.setExtBean(extBean);
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class h0 implements View.OnClickListener {
        h0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = o3.this.f45093c;
            intentUtil.goShareWebActivity(context, com.join.mgps.rpc.h.f54092v + "/live/index.html");
            o3.this.T("9-3-0");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class h1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f45219b;

        h1(List list) {
            this.f45219b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                IntentDateBean intentDataBean = ((RecomDatabeanBusiness) this.f45219b.get(0)).getSub().get(0).getIntentDataBean();
                o3.this.T("3-2");
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class h2 {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f45221a;

        /* renamed from: b  reason: collision with root package name */
        TextView f45222b;

        /* renamed from: c  reason: collision with root package name */
        RelativeLayout f45223c;

        /* renamed from: d  reason: collision with root package name */
        TextView f45224d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45225e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f45226f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f45227g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f45228h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f45229i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f45230j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f45231k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f45232l;

        /* renamed from: m  reason: collision with root package name */
        public RelativeLayout f45233m;

        /* renamed from: n  reason: collision with root package name */
        ImageView f45234n;

        /* renamed from: o  reason: collision with root package name */
        View f45235o;

        public h2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45238c;

        i(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45237b = recomDatabeanBusiness;
            this.f45238c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45237b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentDateBean intentDataBean = sub.get(0).getIntentDataBean();
            if (this.f45238c.getMoreType() == 1) {
                intentDataBean.setExtBean(new ExtBean("home", "9-1000"));
            } else if (this.f45238c.getMoreType() == 2) {
                intentDataBean.setExtBean(new ExtBean("home", "10-1000"));
            } else {
                intentDataBean.setExtBean(new ExtBean("home", "6-1-1"));
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class i0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45240b;

        i0(RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45240b = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.T("0-1-0-0");
            try {
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45240b.getSub().get(0).getIntentDataBean());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class i1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f45242b;

        i1(List list) {
            this.f45242b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                IntentDateBean intentDataBean = ((RecomDatabeanBusiness) this.f45242b.get(0)).getSub().get(0).getIntentDataBean();
                o3.this.T("3-4");
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class i2 {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView f45244a;

        public i2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class j implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f45246a;

        j(ArrayList arrayList) {
            this.f45246a = arrayList;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            o3.this.C(this.f45246a, i4);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class j0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45248b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45249c;

        j0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45248b = recomDatabeanBusiness;
            this.f45249c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45248b.getSub().get(0).getIntentDataBean());
            o3 o3Var = o3.this;
            o3Var.T(this.f45249c.getMoreType2() + "0");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class j1 implements View.OnClickListener {
        j1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45093c.startActivity(new Intent(o3.this.f45093c, EverdayNewGameActivity.class));
            o3.this.T("3-3");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class j2 {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f45252a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45253b;

        j2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class k extends Handler {
        k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                o3.this.d0();
            } else if (i4 != 2) {
            } else {
                o3.this.c0();
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class k0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45257c;

        k0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45256b = recomDatabeanBusiness;
            this.f45257c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45256b.getSub().get(0).getIntentDataBean());
            o3 o3Var = o3.this;
            o3Var.T(this.f45257c.getMoreType2() + "0");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class k1 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        AppBean f45259b;

        /* renamed from: c  reason: collision with root package name */
        RecomDatabeanBusiness f45260c;

        /* renamed from: d  reason: collision with root package name */
        int f45261d;

        /* renamed from: e  reason: collision with root package name */
        String f45262e;

        public k1(RecomDatabeanBusiness recomDatabeanBusiness, int i4, String str, String str2) {
            List<AppBeanMain> sub = recomDatabeanBusiness.getSub();
            if (sub != null && sub.size() > 0) {
                AppBean game_info = sub.get(0).getGame_info();
                this.f45259b = game_info;
                game_info.setReMarks(str2);
            }
            this.f45260c = recomDatabeanBusiness;
            this.f45261d = i4;
            this.f45262e = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask a5 = this.f45260c.a();
            if (!this.f45262e.startsWith("4-") && !this.f45262e.startsWith("6-")) {
                this.f45262e.startsWith("5-");
            }
            o3.this.V(Event.check, this.f45262e, this.f45259b.getGame_id(), this.f45259b.getPosition_path(), UtilsMy.k2(this.f45259b.getTag_info()));
            o3 o3Var = o3.this;
            o3Var.T(this.f45262e + 1);
            String plugin_num = this.f45259b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f45259b.getDown_url_remote());
                if (a5 == null) {
                    a5 = this.f45259b.getDownloadtaskDown();
                }
                UtilsMy.T2(a5, o3.this.f45093c);
                IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDateBean);
            } else if (a5 == null) {
                if (UtilsMy.o0(this.f45259b.getTag_info())) {
                    if (this.f45259b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(o3.this.f45093c).d(o3.this.f45093c, this.f45259b.getPackageName())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(o3.this.f45093c).l(o3.this.f45093c, this.f45259b.getPackageName());
                            if (!com.join.mgps.Util.g2.i(this.f45259b.getVer()) || l4.d() >= Integer.parseInt(this.f45259b.getVer())) {
                                com.join.android.app.common.utils.e.l0(o3.this.f45093c);
                                APKUtils.a0(o3.this.f45093c, this.f45259b.getPackageName());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(o3.this.f45093c).d(o3.this.f45093c, this.f45259b.getPackageName());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f45259b.getPackageName());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(o3.this.f45093c);
                            APKUtils.V(o3.this.f45093c, this.f45259b.getMod_info());
                            return;
                        }
                    }
                }
                if (UtilsMy.y0(this.f45259b.getPay_tag_info(), this.f45259b.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(o3.this.f45093c, this.f45259b.getCrc_sign_id());
                } else {
                    UtilsMy.W0(o3.this.f45093c, this.f45259b);
                }
            } else {
                int status = a5 != null ? a5.getStatus() : 0;
                AppBean appBean = this.f45259b;
                if (appBean != null && UtilsMy.w0(appBean.getPay_tag_info(), this.f45259b.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 13) {
                        com.php25.PDownload.d.l(o3.this.f45093c, a5);
                        return;
                    }
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(o3.this.f45093c, a5);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(o3.this.f45093c)) {
                                            com.join.mgps.Util.l2.a(o3.this.f45093c).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(o3.this.f45093c, a5);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(o3.this.f45093c)) {
                                                    com.join.mgps.Util.l2.a(o3.this.f45093c).b("无网络连接");
                                                    return;
                                                }
                                                int downloadType = this.f45259b.getDownloadType();
                                                if (downloadType == 0 || downloadType == 1) {
                                                    UtilsMy.I2(o3.this.f45093c, a5);
                                                    return;
                                                } else if (downloadType != 2) {
                                                    return;
                                                } else {
                                                    UtilsMy.u4(a5);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(a5, o3.this.f45093c);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(a5, o3.this.f45093c);
                        return;
                    }
                    com.php25.PDownload.d.i(a5);
                    return;
                }
                o3 o3Var2 = o3.this;
                o3Var2.T(this.f45262e + 1);
                AppBean appBean2 = this.f45259b;
                if (appBean2 != null) {
                    if (UtilsMy.y0(appBean2.getPay_tag_info(), this.f45259b.getCrc_sign_id()) > 0) {
                        UtilsMy.d4(o3.this.f45093c, this.f45259b.getCrc_sign_id());
                        return;
                    }
                    UtilsMy.x1(a5, this.f45259b);
                    if (UtilsMy.o1(o3.this.f45093c, a5)) {
                        return;
                    }
                    if (this.f45259b.getDown_status() == 5) {
                        UtilsMy.l1(o3.this.f45093c, a5);
                    } else {
                        UtilsMy.R0(o3.this.f45093c, a5, this.f45259b.getTp_down_url(), this.f45259b.getOther_down_switch(), this.f45259b.getCdn_down_switch());
                    }
                }
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class k2 {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView f45264a;

        k2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45266b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45267c;

        l(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45266b = recomDatabeanBusiness;
            this.f45267c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45266b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, sub.get(0).getIntentDataBean());
            o3.this.T(this.f45267c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class l0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45270c;

        l0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45269b = recomDatabeanBusiness;
            this.f45270c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45269b.getSub().get(0).getIntentDataBean());
            o3 o3Var = o3.this;
            o3Var.T(this.f45270c.getMoreType2() + "0");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public interface l1 {
        void a(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO);

        void b(int i4, List<List<PAPAHomeBeanV7.HomeBeanDTO>> list);

        void c(int i4, PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO);
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class l2 {

        /* renamed from: a  reason: collision with root package name */
        private View f45272a;

        l2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45275c;

        m(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45274b = recomDatabeanBusiness;
            this.f45275c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45274b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, sub.get(0).getIntentDataBean());
            o3.this.T(this.f45275c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class m0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45278c;

        m0(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45277b = recomDatabeanBusiness;
            this.f45278c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45277b.getSub().get(0).getIntentDataBean());
            o3 o3Var = o3.this;
            o3Var.T(this.f45278c.getMoreType2() + "0");
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class m1 {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f45280a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f45281b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45282c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f45283d;

        /* renamed from: e  reason: collision with root package name */
        public RelativeLayout f45284e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45285f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f45286g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f45287h;

        /* renamed from: i  reason: collision with root package name */
        public FrameLayout f45288i;

        m1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class m2 {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f45290a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f45291b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45292c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f45293d;

        /* renamed from: e  reason: collision with root package name */
        public LinearLayout f45294e;

        m2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45296b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45297c;

        n(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45296b = recomDatabeanBusiness;
            this.f45297c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45296b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, sub.get(0).getIntentDataBean());
            o3.this.T(this.f45297c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class n0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45299b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45300c;

        n0(MgpapaMainItemBean mgpapaMainItemBean, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45299b = mgpapaMainItemBean;
            this.f45300c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3 o3Var = o3.this;
            o3Var.T(this.f45299b.getMoreType2() + "1-0");
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45300c.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class n1 {

        /* renamed from: a  reason: collision with root package name */
        private TextView f45302a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45303b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45304c;

        n1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class n2 {

        /* renamed from: a  reason: collision with root package name */
        View f45306a;

        n2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45308b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45309c;

        o(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45308b = recomDatabeanBusiness;
            this.f45309c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45308b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, sub.get(0).getIntentDataBean());
            o3.this.T(this.f45309c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class o0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45311b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45312c;

        o0(MgpapaMainItemBean mgpapaMainItemBean, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45311b = mgpapaMainItemBean;
            this.f45312c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3 o3Var = o3.this;
            o3Var.T(this.f45311b.getMoreType2() + "2-0");
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45312c.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class o1 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45314a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f45315b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f45316c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f45317d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f45318e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f45319f;

        /* renamed from: g  reason: collision with root package name */
        private SimpleDraweeView f45320g;

        /* renamed from: h  reason: collision with root package name */
        private SimpleDraweeView f45321h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f45322i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f45323j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f45324k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f45325l;

        o1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class o2 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45327a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45328b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45329c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f45330d;

        /* renamed from: e  reason: collision with root package name */
        private SimpleDraweeView f45331e;

        /* renamed from: f  reason: collision with root package name */
        private SimpleDraweeView f45332f;

        o2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45334b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45335c;

        p(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45334b = recomDatabeanBusiness;
            this.f45335c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45334b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, sub.get(0).getIntentDataBean());
            o3.this.T(this.f45335c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class p0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45338c;

        p0(MgpapaMainItemBean mgpapaMainItemBean, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45337b = mgpapaMainItemBean;
            this.f45338c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3 o3Var = o3.this;
            o3Var.T(this.f45337b.getMoreType2() + "3-0");
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45338c.getSub().get(0).getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class p1 {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f45340a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f45341b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45342c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f45343d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45344e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45345f;

        /* renamed from: g  reason: collision with root package name */
        public ProgressBar f45346g;

        /* renamed from: h  reason: collision with root package name */
        public ProgressBar f45347h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f45348i;

        /* renamed from: j  reason: collision with root package name */
        public FrameLayout f45349j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f45350k;

        /* renamed from: l  reason: collision with root package name */
        public SimpleDraweeView f45351l;

        /* renamed from: m  reason: collision with root package name */
        public FrameLayout f45352m;

        /* renamed from: n  reason: collision with root package name */
        public ProgressBar f45353n;

        public p1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class p2 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45355a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45356b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45357c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f45358d;

        /* renamed from: e  reason: collision with root package name */
        public SimpleDraweeView f45359e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45360f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f45361g;

        /* renamed from: h  reason: collision with root package name */
        public RelativeLayout f45362h;

        /* renamed from: i  reason: collision with root package name */
        public RelativeLayout f45363i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f45364j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f45365k;

        p2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45367b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45368c;

        q(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45367b = recomDatabeanBusiness;
            this.f45368c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45367b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            IntentDateBean intentDataBean = sub.get(0).getIntentDataBean();
            try {
                try {
                    this.f45367b.getSub().get(0).getCrc_link_type_val();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                o3 o3Var = o3.this;
                o3Var.T(this.f45368c.getMoreType2() + "-2");
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class q0 implements View.OnClickListener {
        q0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NowWufunActivity_.p0(o3.this.f45093c).a(0).start();
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class q1 {

        /* renamed from: a  reason: collision with root package name */
        private FrameLayout f45371a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45372b;

        /* renamed from: c  reason: collision with root package name */
        public SimpleDraweeView f45373c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f45374d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45375e;

        /* renamed from: f  reason: collision with root package name */
        public RelativeLayout f45376f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f45377g;

        /* renamed from: h  reason: collision with root package name */
        public RelativeLayout f45378h;

        q1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class q2 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45380a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f45381b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45382c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f45383d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f45384e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f45385f;

        /* renamed from: g  reason: collision with root package name */
        private SimpleDraweeView f45386g;

        /* renamed from: h  reason: collision with root package name */
        private SimpleDraweeView f45387h;

        /* renamed from: i  reason: collision with root package name */
        private SimpleDraweeView f45388i;

        q2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45391c;

        r(RecomDatabeanBusiness recomDatabeanBusiness, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45390b = recomDatabeanBusiness;
            this.f45391c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<AppBeanMain> sub = this.f45390b.getSub();
            if (sub == null || sub.size() <= 0) {
                return;
            }
            AppBeanMain appBeanMain = sub.get(0);
            IntentUtil.getInstance().goGameDetialActivity(o3.this.f45093c, appBeanMain.getGame_info().getCrc_sign_id(), appBeanMain.getGame_info().getGame_info_tpl_type(), appBeanMain.getGame_info().getSp_tpl_two_position(), appBeanMain.getGame_info().get_from_type());
            try {
                try {
                    this.f45390b.getSub().get(0).getCrc_link_type_val();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                o3 o3Var = o3.this;
                o3Var.T(this.f45391c.getMoreType2() + "-0");
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class r0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f45393b;

        r0(AppBeanMain appBeanMain) {
            this.f45393b = appBeanMain;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDataBean = this.f45393b.getIntentDataBean();
            intentDataBean.setExtBean(new ExtBean("home", "3-0"));
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class r1 {

        /* renamed from: a  reason: collision with root package name */
        private RecyclerView f45395a;

        r1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class r2 {

        /* renamed from: a  reason: collision with root package name */
        private HListView f45397a;

        r2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val("http://h5.5fun.com/team.html");
            intentDateBean.setObject("悟饭有你更精彩");
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDateBean);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class s0 implements BaseQuickAdapter.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f45400a;

        s0(List list) {
            this.f45400a = list;
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            int i5;
            o3 o3Var = o3.this;
            o3Var.T("2-" + (i4 + 1));
            PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) this.f45400a.get(i4);
            IntentDateBean intentDataBean = homeBeanDTO.getIntentDataBean();
            try {
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (com.join.mgps.Util.g2.i(intentDataBean.getLink_type_val())) {
                i5 = Integer.parseInt(intentDataBean.getLink_type_val());
                if (intentDataBean.getLink_type() != 3 && intentDataBean.getJump_type() == 31) {
                    com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
                } else if (intentDataBean.getLink_type() != 3 && intentDataBean.getJump_type() == 2 && i5 == 1) {
                    com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(2));
                } else {
                    intentDataBean.setExt1(homeBeanDTO.getSub_title());
                    IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
                }
                o3.this.a0(null);
            }
            i5 = 1;
            if (intentDataBean.getLink_type() != 3) {
            }
            if (intentDataBean.getLink_type() != 3) {
            }
            intentDataBean.setExt1(homeBeanDTO.getSub_title());
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, intentDataBean);
            o3.this.a0(null);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class s1 {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f45402a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f45403b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f45404c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f45405d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f45406e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f45407f;

        /* renamed from: g  reason: collision with root package name */
        public ProgressBar f45408g;

        /* renamed from: h  reason: collision with root package name */
        public ProgressBar f45409h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f45410i;

        /* renamed from: j  reason: collision with root package name */
        public FrameLayout f45411j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f45412k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f45413l;

        public s1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class s2 {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f45415a;

        s2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f45417b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45418c;

        t(AppBeanMain appBeanMain, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45417b = appBeanMain;
            this.f45418c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45417b.getIntentDataBean());
            o3 o3Var = o3.this;
            o3Var.T(this.f45418c.b() + 0);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class t0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45420b;

        t0(int i4) {
            this.f45420b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45102l.F(this.f45420b);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class t1 {

        /* renamed from: a  reason: collision with root package name */
        private ConstraintLayout f45422a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45423b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45424c;

        /* renamed from: d  reason: collision with root package name */
        private LinearLayout f45425d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f45426e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f45427f;

        /* renamed from: g  reason: collision with root package name */
        private ProgressBar f45428g;

        /* renamed from: h  reason: collision with root package name */
        private ProgressBar f45429h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f45430i;

        /* renamed from: j  reason: collision with root package name */
        private FrameLayout f45431j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f45432k;

        t1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class t2 {

        /* renamed from: a  reason: collision with root package name */
        private View f45434a;

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f45435b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f45436c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f45437d;

        /* renamed from: e  reason: collision with root package name */
        private RelativeLayout f45438e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f45439f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f45440g;

        /* renamed from: h  reason: collision with root package name */
        private SimpleDraweeView f45441h;

        /* renamed from: i  reason: collision with root package name */
        private RelativeLayout f45442i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f45443j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f45444k;

        /* renamed from: l  reason: collision with root package name */
        private LinearLayout f45445l;

        t2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f45447b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45448c;

        u(AppBeanMain appBeanMain, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45447b = appBeanMain;
            this.f45448c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45099i.a(this.f45447b.getGame_info().getCrc_sign_id(), this.f45447b.getGame_info().getIs_bespeak());
            o3 o3Var = o3.this;
            o3Var.T(this.f45448c.b() + 1);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class u0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f45450b;

        u0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f45450b = homeBeanDTO;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45450b.getIntentDataBean());
            o3.this.a0(this.f45450b.getPosition());
            o3.this.U(this.f45450b.getPosition());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class u1 {

        /* renamed from: a  reason: collision with root package name */
        private FrameLayout f45452a;

        /* renamed from: b  reason: collision with root package name */
        private HorizontalRecyclerView f45453b;

        u1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class u2 {

        /* renamed from: a  reason: collision with root package name */
        private RelativeLayout f45455a;

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f45456b;

        /* renamed from: c  reason: collision with root package name */
        private RelativeLayout f45457c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f45458d;

        /* renamed from: e  reason: collision with root package name */
        private LinearLayout f45459e;

        /* renamed from: f  reason: collision with root package name */
        private SimpleDraweeView f45460f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f45461g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f45462h;

        /* renamed from: i  reason: collision with root package name */
        private SimpleDraweeView f45463i;

        /* renamed from: j  reason: collision with root package name */
        private LinearLayout f45464j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f45465k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f45466l;

        /* renamed from: m  reason: collision with root package name */
        private LinearLayout f45467m;

        /* renamed from: n  reason: collision with root package name */
        private TextView f45468n;

        /* renamed from: o  reason: collision with root package name */
        private TextView f45469o;

        /* renamed from: p  reason: collision with root package name */
        private SimpleDraweeView f45470p;

        /* renamed from: q  reason: collision with root package name */
        private SimpleDraweeView f45471q;

        /* renamed from: r  reason: collision with root package name */
        private SimpleDraweeView f45472r;

        /* renamed from: s  reason: collision with root package name */
        private SimpleDraweeView f45473s;

        /* renamed from: t  reason: collision with root package name */
        public LinearLayout f45474t;

        u2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerBean f45476b;

        v(BannerBean bannerBean) {
            this.f45476b = bannerBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45476b.getIntentDataBean());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class v0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PAPAHomeBeanV7.HomeBeanDTO f45478b;

        v0(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
            this.f45478b = homeBeanDTO;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45478b.getIntentDataBean());
            o3.this.a0(this.f45478b.getPosition());
            o3.this.U(this.f45478b.getPosition());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class v1 {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f45480a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f45481b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f45482c;

        /* renamed from: d  reason: collision with root package name */
        private SimpleDraweeView f45483d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f45484e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f45485f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f45486g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f45487h;

        v1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class v2 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45489a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45490b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f45491c;

        v2() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class w implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f45493b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45494c;

        w(AppBeanMain appBeanMain, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45493b = appBeanMain;
            this.f45494c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(o3.this.f45093c, this.f45493b.getIntentDataBean());
            o3 o3Var = o3.this;
            o3Var.T(this.f45494c.b() + 0);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class w0 extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f45496a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u1 f45497b;

        w0(List list, u1 u1Var) {
            this.f45496a = list;
            this.f45497b = u1Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            o3.this.R(this.f45496a, this.f45497b.f45453b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class w1 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f45499a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f45500b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f45501c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f45502d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f45503e;

        /* renamed from: f  reason: collision with root package name */
        private SimpleDraweeView f45504f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f45505g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f45506h;

        w1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppBeanMain f45508b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecomDatabeanBusiness f45509c;

        x(AppBeanMain appBeanMain, RecomDatabeanBusiness recomDatabeanBusiness) {
            this.f45508b = appBeanMain;
            this.f45509c = recomDatabeanBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45099i.a(this.f45508b.getGame_info().getCrc_sign_id(), this.f45508b.getGame_info().getIs_bespeak());
            o3 o3Var = o3.this;
            o3Var.T(this.f45509c.b() + 1);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class x0 implements ViewPager.OnPageChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f45511b;

        x0(List list) {
            this.f45511b = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (o3.this.f45104n != null) {
                o3.this.f45104n.b(i4, this.f45511b);
            }
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class x1 {

        /* renamed from: a  reason: collision with root package name */
        private TextView f45513a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45514b;

        x1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PapaMainGameBespeakInfo f45516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MgpapaMainItemBean f45517c;

        y(PapaMainGameBespeakInfo papaMainGameBespeakInfo, MgpapaMainItemBean mgpapaMainItemBean) {
            this.f45516b = papaMainGameBespeakInfo;
            this.f45517c = mgpapaMainItemBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(o3.this.f45093c, this.f45516b.getBespeak_list_url());
            o3.this.T(this.f45517c.getMoreType2());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class y0 extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f45519a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i2 f45520b;

        y0(List list, i2 i2Var) {
            this.f45519a = list;
            this.f45520b = i2Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            o3.this.S(this.f45519a, this.f45520b.f45244a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class y1 {

        /* renamed from: a  reason: collision with root package name */
        private ImageView f45522a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45523b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f45524c;

        y1() {
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class z implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45526b;

        z(int i4) {
            this.f45526b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.f45102l.F(this.f45526b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    public class z0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.papa.sim.statistic.e f45528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppBean f45529c;

        z0(com.papa.sim.statistic.e eVar, AppBean appBean) {
            this.f45528b = eVar;
            this.f45529c = appBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o3.this.X(this.f45528b);
            IntentUtil.getInstance().goGameDetialActivity(o3.this.f45093c, this.f45529c.getCrc_sign_id(), this.f45529c.getGame_info_tpl_type(), this.f45529c.getSp_tpl_two_position(), this.f45529c.get_from_type());
        }
    }

    /* compiled from: PapaMainAdapter.java */
    /* loaded from: classes4.dex */
    class z1 {

        /* renamed from: a  reason: collision with root package name */
        private TextView f45531a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f45532b;

        z1() {
        }
    }

    public o3(Context context, Fragment fragment, List<MgpapaMainItemBean> list, com.join.android.app.component.video.c cVar, c2.f fVar) {
        this.f45093c = context;
        this.f45094d = fragment;
        this.f45102l = cVar;
        this.f45092b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f45099i = fVar;
        this.f45095e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(List<RecomDatabeanBusiness> list, int i4) {
        if (i4 < list.size()) {
            RecomDatabeanBusiness recomDatabeanBusiness = list.get(i4);
            IntentUtil.getInstance().intentActivity(this.f45093c, recomDatabeanBusiness.getSub().get(0).getIntentDataBean());
            T(recomDatabeanBusiness.b() + "0");
        }
    }

    private String D(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO) {
        if (homeBeanDTO == null || homeBeanDTO.getG_info() == null) {
            return null;
        }
        if (!TextUtils.isEmpty(homeBeanDTO.getG_info().getId()) && !TextUtils.equals(homeBeanDTO.getG_info().getId(), "0")) {
            return homeBeanDTO.getG_info().getId();
        }
        return homeBeanDTO.getG_info().getMod_id();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(View view) {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(View view) {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(List list, int i4, BaseQuickAdapter baseQuickAdapter, View view, int i5) {
        PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) list.get(i5);
        homeBeanDTO.setRequesting(homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null);
        try {
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loading_progress);
            TextView textView = (TextView) view.findViewById(R.id.tvBtn);
            progressBar.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
            textView.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        l1 l1Var = this.f45104n;
        if (l1Var != null) {
            l1Var.a(i4, homeBeanDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f45093c, homeBeanDTO.getIntentDataBean());
        a0(null);
        T("3-1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        this.f45093c.startActivity(new Intent(this.f45093c, EverdayNewGameActivity.class));
        a0(null);
        T("3-3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f45093c, homeBeanDTO.getIntentDataBean());
        a0(null);
        T("3-2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, p1 p1Var, int i4, View view) {
        homeBeanDTO.setRequesting(homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null);
        p1Var.f45353n.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
        p1Var.f45350k.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        l1 l1Var = this.f45104n;
        if (l1Var != null) {
            l1Var.a(i4, homeBeanDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f45093c, homeBeanDTO.getIntentDataBean());
        a0(homeBeanDTO.getPosition());
        U(homeBeanDTO.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(List list, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        PAPAHomeBeanV7.NgSelectionDTO ngSelectionDTO = (PAPAHomeBeanV7.NgSelectionDTO) list.get(i4);
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(1);
        intentDateBean.setCrc_link_type_val(ngSelectionDTO.getId());
        if (intentDateBean.getExtBean() == null) {
            intentDateBean.setExtBean(new ExtBean());
        }
        intentDateBean.getExtBean().setFrom(String.valueOf(ngSelectionDTO.get_from()));
        intentDateBean.getExtBean().set_from_type(ngSelectionDTO.get_from_type());
        IntentUtil.getInstance().intentActivity(this.f45093c, intentDateBean);
        a0(ngSelectionDTO.getPosition());
        U(ngSelectionDTO.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(1));
        a0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(List list, BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        IntentUtil.getInstance().intentActivity(this.f45093c, ((PAPAHomeBeanV7.HomeBeanDTO) list.get(i4)).getIntentDataBean());
        a0(((PAPAHomeBeanV7.HomeBeanDTO) list.get(i4)).getPosition());
        U(((PAPAHomeBeanV7.HomeBeanDTO) list.get(i4)).getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, View view) {
        IntentUtil.getInstance().intentActivity(this.f45093c, homeBeanDTO.getIntentDataBean());
        a0(homeBeanDTO.getPosition());
        U(homeBeanDTO.getPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, ProgressBar progressBar, TextView textView, int i4, View view) {
        homeBeanDTO.setRequesting(homeBeanDTO.getGameBean() == null && homeBeanDTO.getDownloadTask() == null);
        progressBar.setVisibility(homeBeanDTO.isRequesting() ? 0 : 4);
        textView.setVisibility(homeBeanDTO.isRequesting() ? 4 : 0);
        l1 l1Var = this.f45104n;
        if (l1Var != null) {
            l1Var.a(i4, homeBeanDTO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(List<PAPAHomeBeanV7.NgSelectionDTO> list, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView == null || list == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        for (int i4 = 0; i4 <= Math.min(findLastCompletelyVisibleItemPosition, list.size() - 1); i4++) {
            if (!list.get(i4).isHasExposure()) {
                Ext ext = new Ext();
                ext.setPage("home");
                ext.setFrom("204");
                ext.setGameId(list.get(i4).getId());
                ext.setPosition(list.get(i4).getPosition());
                com.papa.sim.statistic.p.l(this.f45093c).k0(com.papa.sim.statistic.Event.expGameAdPage, ext, list.get(i4).getId());
                list.get(i4).setHasExposure(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(List<PAPAHomeBeanV7.HomeBeanDTO> list, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView == null || list == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null) {
            return;
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        for (int i4 = 0; i4 <= Math.min(findLastCompletelyVisibleItemPosition, list.size() - 1); i4++) {
            if (!list.get(i4).isHasExposure()) {
                Ext ext = new Ext();
                ext.setPage("home");
                ext.setFrom("206");
                ext.setGameId(D(list.get(i4)));
                ext.setPosition(list.get(i4).getPosition());
                com.papa.sim.statistic.p.l(this.f45093c).k0(com.papa.sim.statistic.Event.expGameAdPage, ext, D(list.get(i4)));
                list.get(i4).setHasExposure(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(String str) {
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this.f45093c);
        String name = ExtFrom.home.name();
        l4.t(name, "22-" + str, AccountUtil_.getInstance_(this.f45093c).getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(String str) {
        com.papa.sim.statistic.p.l(this.f45093c).t(ExtFrom.home.name(), str, AccountUtil_.getInstance_(this.f45093c).getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(Event event, String str, String str2, StatFactory.VolcanoOther volcanoOther, boolean z4) {
        String str3;
        String str4;
        String str5;
        String[] split = str.split("-");
        String str6 = "模块";
        str3 = "0";
        if (split.length > 0) {
            if (split[0].equals("4")) {
                str5 = split.length > 1 ? split[1] : "0";
                str4 = "大家都在玩";
            } else if (split[0].equals("7")) {
                str5 = split.length > 1 ? split[1] : "0";
                str4 = "网游推荐";
            } else if (split[0].equals("5")) {
                str5 = split.length > 1 ? split[1] : "0";
                str4 = "最新网游";
            } else if (split[0].equals("0")) {
                str3 = split.length > 2 ? split[2] : "0";
                if (split.length > 3) {
                    str6 = "模块" + split[1];
                    str3 = split[3];
                }
                str4 = str6;
                str5 = str3;
            }
            com.join.mgps.Util.v0.d("volcannoEvent", str4 + "  " + str5);
            StatFactory.Companion.getInstance(this.f45093c).sendEvent(new StatFactory.VolcanoEvent(event, str2, new StatFactory.SpmData("wufun", "home", str4, str5, false), volcanoOther, z4));
        }
        str6 = "";
        str4 = str6;
        str5 = str3;
        com.join.mgps.Util.v0.d("volcannoEvent", str4 + "  " + str5);
        StatFactory.Companion.getInstance(this.f45093c).sendEvent(new StatFactory.VolcanoEvent(event, str2, new StatFactory.SpmData("wufun", "home", str4, str5, false), volcanoOther, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(String str, String str2, StatFactory.VolcanoOther volcanoOther, boolean z4) {
        V(Event.click, str, str2, volcanoOther, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(com.papa.sim.statistic.e eVar) {
        eVar.j(AccountUtil_.getInstance_(this.f45093c).getUid());
        com.papa.sim.statistic.p.l(this.f45093c).s(eVar);
    }

    private void Y(AppBean appBean, TextView textView, SimpleDraweeView simpleDraweeView, com.papa.sim.statistic.e eVar) {
        textView.setText(appBean.getGame_name());
        textView.setVisibility(0);
        simpleDraweeView.setVisibility(0);
        MyImageLoader.d(simpleDraweeView, R.drawable.banner_normal_icon, appBean.getIco_remote());
        simpleDraweeView.setOnClickListener(new z0(eVar, appBean));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (f45081p1 == null) {
            return;
        }
        long time = com.join.mgps.Util.y.F(com.join.mgps.Util.y.m() + " 23:59:59").getTime() - System.currentTimeMillis();
        if (time <= 0 || this.f45097g != null) {
            return;
        }
        f1 f1Var = new f1(time, 1000L);
        this.f45097g = f1Var;
        f1Var.start();
    }

    private void e0(TextView textView, RecomDatabeanBusiness recomDatabeanBusiness, SimpleDraweeView simpleDraweeView, TextView textView2, TextView textView3, RelativeLayout relativeLayout, String str, String str2) {
        AppBean game_info = recomDatabeanBusiness.getSub().get(0).getGame_info();
        if (game_info == null) {
            return;
        }
        MyImageLoader.d(simpleDraweeView, R.drawable.main_normal_icon, game_info.getIco_remote());
        textView2.setText(game_info.getGame_name());
        if (textView3 != null) {
            textView3.setText(game_info.getSize() + "M");
        }
        DownloadTask a5 = recomDatabeanBusiness.a();
        UtilsMy.j3(game_info.getSp_tag_info(), relativeLayout, a5);
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        if ((ConstantIntEnum.H5.value() + "").equals(game_info.getPlugin_num())) {
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setText("开始");
            textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
            textView3.setVisibility(8);
        } else if (a5 == null) {
            if (UtilsMy.o0(game_info.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f45093c).d(this.f45093c, game_info.getPackageName()) && UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45093c).l(this.f45093c, game_info.getPackageName());
                    if (com.join.mgps.Util.g2.i(game_info.getVer()) && l4.d() < Integer.parseInt(game_info.getVer())) {
                        textView.setBackgroundResource(R.drawable.recom_green_butn);
                        textView.setText("更新");
                        textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                    } else {
                        textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        textView.setText(this.f45093c.getResources().getString(R.string.download_status_finished));
                        textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_main_color));
                    }
                } else {
                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                    UtilsMy.Y2(textView, relativeLayout, game_info);
                }
            } else {
                textView.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                UtilsMy.Y2(textView, relativeLayout, game_info);
            }
        } else {
            int status = a5.getStatus();
            if (UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    textView.setText("暂停中");
                } else if (status == 48) {
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("安装中");
                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                    textView.setText("更新");
                                                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                    break;
                                                case 10:
                                                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    textView.setText("等待");
                                                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                                case 11:
                                                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                    textView.setText("安装");
                                                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                    break;
                                                case 12:
                                                    textView.setBackgroundResource(R.drawable.extract);
                                                    textView.setText("解压中");
                                                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    textView.setBackgroundResource(R.drawable.reextract);
                                                    textView.setText("解压");
                                                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        textView.setText(this.f45093c.getResources().getString(R.string.download_status_finished));
                        textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_main_color));
                    }
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("继续");
                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                } else {
                    UtilsMy.x4(a5);
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("暂停");
                    textView.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                }
            }
            textView.setBackgroundResource(R.drawable.recom_green_butn);
            UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
            UtilsMy.Y2(textView, relativeLayout, game_info);
        }
        relativeLayout.setOnClickListener(new k1(recomDatabeanBusiness, 1, str, str2));
    }

    private void f0(s1 s1Var, final PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, boolean z4, final int i4) {
        if (s1Var == null) {
            return;
        }
        ConstraintLayout constraintLayout = s1Var.f45402a;
        SimpleDraweeView simpleDraweeView = s1Var.f45403b;
        TextView textView = s1Var.f45404c;
        TextView textView2 = s1Var.f45410i;
        FrameLayout frameLayout = s1Var.f45411j;
        final TextView textView3 = s1Var.f45412k;
        LinearLayout linearLayout = s1Var.f45405d;
        TextView textView4 = s1Var.f45406e;
        TextView textView5 = s1Var.f45407f;
        ProgressBar progressBar = s1Var.f45408g;
        ProgressBar progressBar2 = s1Var.f45409h;
        final ProgressBar progressBar3 = s1Var.f45413l;
        MyImageLoader.i(simpleDraweeView, homeBeanDTO.getBig_pic(), r.c.f11300g);
        PAPAHomeBeanV7.GInfoDTO g_info = homeBeanDTO.getG_info();
        textView.setText(g_info == null ? homeBeanDTO.getTitle() : g_info.getName());
        textView3.setVisibility(0);
        progressBar3.setVisibility(4);
        if (g_info != null && !TextUtils.isEmpty(g_info.getTag_name())) {
            StringBuilder sb = new StringBuilder();
            String[] split = g_info.getTag_name().split(",");
            for (int i5 = 0; i5 < split.length; i5++) {
                sb.append(split[i5]);
                sb.append(" | ");
                if (i5 >= 1) {
                    break;
                }
            }
            textView2.setText(sb.substring(0, sb.length() - 3));
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3.this.P(homeBeanDTO, view);
            }
        });
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o3.this.Q(homeBeanDTO, progressBar3, textView3, i4, view);
            }
        });
        update(homeBeanDTO, textView, textView2, frameLayout, textView3, linearLayout, textView4, textView5, progressBar, progressBar2);
    }

    private void h0(TextView textView, LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, boolean z4, boolean z5) {
        if (z4) {
            textView.setVisibility(0);
            linearLayout.setVisibility(8);
            progressBar.setVisibility(8);
            progressBar2.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(8);
        if (z5) {
            progressBar2.setVisibility(0);
            progressBar.setVisibility(8);
            return;
        }
        progressBar.setVisibility(0);
        progressBar2.setVisibility(8);
    }

    private void update(PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, LinearLayout linearLayout, TextView textView4, TextView textView5, ProgressBar progressBar, ProgressBar progressBar2) {
        DownloadTask downloadTask = homeBeanDTO.getDownloadTask();
        CollectionBeanSub gameBean = homeBeanDTO.getGameBean();
        long size = downloadTask != null ? downloadTask.getSize() : 0L;
        if (gameBean != null) {
            if ((ConstantIntEnum.H5.value() + "").equals(gameBean.getPlugin_num())) {
                textView3.setText("开始");
                textView.setVisibility(8);
                return;
            }
        }
        if (downloadTask == null) {
            h0(textView2, linearLayout, progressBar2, progressBar, true, false);
            textView3.setText("获取");
            if (gameBean == null) {
                return;
            }
            if (UtilsMy.o0(gameBean.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(this.f45093c).d(this.f45093c, gameBean.getPackageName()) && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45093c).l(this.f45093c, gameBean.getPackageName());
                    if (com.join.mgps.Util.g2.i(gameBean.getVer()) && l4.d() < Integer.parseInt(gameBean.getVer())) {
                        textView3.setText("更新");
                        return;
                    } else {
                        textView3.setText("启动");
                        return;
                    }
                }
                UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
                UtilsMy.f3(textView3, frameLayout, gameBean);
                return;
            }
            UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
            UtilsMy.f3(textView3, frameLayout, gameBean);
            return;
        }
        int status = downloadTask.getStatus();
        if (gameBean != null && UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 27) {
                textView3.setText("暂停");
                return;
            } else if (status == 48) {
                textView3.setText("安装中");
                h0(textView2, linearLayout, progressBar2, progressBar, true, false);
                return;
            } else if (status != 2) {
                if (status != 3) {
                    if (status != 5) {
                        if (status != 6) {
                            if (status != 7) {
                                if (status != 42) {
                                    if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                textView3.setText("更新");
                                                h0(textView2, linearLayout, progressBar2, progressBar, true, false);
                                                return;
                                            case 10:
                                                textView3.setText("等待");
                                                h0(textView2, linearLayout, progressBar2, progressBar, false, false);
                                                textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                try {
                                                    progressBar2.setProgress((int) downloadTask.getProgress());
                                                } catch (Exception e5) {
                                                    e5.printStackTrace();
                                                }
                                                textView5.setText("等待中");
                                                return;
                                            case 11:
                                                textView3.setText("安装");
                                                h0(textView2, linearLayout, progressBar2, progressBar, true, false);
                                                return;
                                            case 12:
                                                h0(textView2, linearLayout, progressBar2, progressBar, false, true);
                                                textView4.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                textView5.setText("解压中..");
                                                progressBar.setProgress((int) downloadTask.getProgress());
                                                textView3.setText("解压中");
                                                return;
                                            case 13:
                                                h0(textView2, linearLayout, progressBar2, progressBar, false, true);
                                                textView4.setText(UtilsMy.g(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                                                textView5.setText("点击重新解压");
                                                progressBar.setProgress((int) downloadTask.getProgress());
                                                textView3.setText("解压");
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView3.setText("启动");
                    h0(textView2, linearLayout, progressBar2, progressBar, true, true);
                    return;
                }
                textView3.setText("继续");
                h0(textView2, linearLayout, progressBar2, progressBar, false, false);
                try {
                    if (downloadTask.getSize() == 0) {
                        textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    } else {
                        textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                    }
                    progressBar2.setProgress((int) downloadTask.getProgress());
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                textView5.setText("暂停中");
                return;
            } else {
                UtilsMy.x4(downloadTask);
                textView3.setText("暂停");
                h0(textView2, linearLayout, progressBar2, progressBar, false, false);
                if (downloadTask.getSize() == 0) {
                    textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                } else {
                    textView4.setText(UtilsMy.g(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(size));
                }
                progressBar2.setProgress((int) downloadTask.getProgress());
                String speed = downloadTask.getSpeed();
                textView5.setText(speed + "/S");
                return;
            }
        }
        textView3.setText("获取");
        UtilsMy.w0(gameBean.getPay_tag_info(), gameBean.getCrc_sign_id());
        UtilsMy.f3(textView3, frameLayout, gameBean);
        h0(textView2, linearLayout, progressBar2, progressBar, true, false);
    }

    public void Z(List<MgpapaMainItemBean> list) {
        this.f45095e = list;
        notifyDataSetChanged();
    }

    public void b0(l1 l1Var) {
        this.f45104n = l1Var;
    }

    public void d0() {
        u2 u2Var = f45081p1;
        if (u2Var == null) {
            return;
        }
        u2Var.f45467m.setVisibility(8);
        f45081p1.f45464j.setVisibility(0);
        TextView textView = f45081p1.f45465k;
        textView.setText(this.f45100j + "");
    }

    void g0(w1 w1Var, RecomDatabeanBusiness recomDatabeanBusiness, int i4, int i5) {
        TextView textView;
        TextView textView2;
        int i6;
        TextView textView3;
        List<AppBeanMain> sub;
        ConstantIntEnum constantIntEnum;
        SimpleDraweeView simpleDraweeView = null;
        if (i5 == 0) {
            simpleDraweeView = w1Var.f45501c;
            textView = w1Var.f45502d;
            textView2 = w1Var.f45503e;
            i6 = (i4 * 2) - 1;
            textView3 = (TextView) w1Var.f45499a.findViewById(R.id.moneyText);
        } else if (i5 != 1) {
            textView = null;
            textView2 = null;
            textView3 = null;
            i6 = 0;
        } else if (recomDatabeanBusiness == null) {
            w1Var.f45500b.setVisibility(4);
            return;
        } else {
            TextView textView4 = (TextView) w1Var.f45500b.findViewById(R.id.moneyText2);
            w1Var.f45500b.setVisibility(0);
            i6 = i4 * 2;
            simpleDraweeView = w1Var.f45504f;
            textView = w1Var.f45505g;
            textView2 = w1Var.f45506h;
            textView3 = textView4;
        }
        if (recomDatabeanBusiness == null || (sub = recomDatabeanBusiness.getSub()) == null || sub.size() <= 0) {
            return;
        }
        AppBeanMain appBeanMain = sub.get(0);
        IntentDateBean intentDataBean = appBeanMain.getIntentDataBean();
        ModleBean main = recomDatabeanBusiness.getMain();
        if (main != null) {
            int link_type = intentDataBean.getLink_type();
            if (link_type == 1) {
                AppBean game_info = appBeanMain.getGame_info();
                if (game_info != null) {
                    UtilsMy.k3(game_info.getSp_tag_info(), textView3);
                    MyImageLoader.f(simpleDraweeView, R.drawable.rect_normal_icon, main.getPic_remote(), MyImageLoader.D(this.f45093c));
                    textView.setText(game_info.getGame_name());
                    StringBuilder sb = new StringBuilder();
                    sb.append(ConstantIntEnum.H5.value());
                    sb.append("");
                    if (sb.toString().equals(game_info.getPlugin_num())) {
                        textView2.setBackgroundResource(R.drawable.recom_blue_butn);
                        textView2.setText("开始");
                        textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                    } else {
                        if (game_info.getPlugin_num().equals(constantIntEnum.value() + "")) {
                            textView2.setBackgroundResource(R.drawable.recom_blue_butn);
                            textView2.setText("开始");
                            textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                        } else if (recomDatabeanBusiness.a() == null) {
                            if (UtilsMy.o0(game_info.getTag_info())) {
                                boolean d5 = com.join.android.app.common.utils.e.l0(this.f45093c).d(this.f45093c, game_info.getPackageName());
                                if (UtilsMy.w0(appBeanMain.getGame_info().getPay_tag_info(), appBeanMain.getGame_info().getCrc_sign_id()) > 0) {
                                    d5 = false;
                                }
                                if (d5) {
                                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45093c).l(this.f45093c, game_info.getPackageName());
                                    if (com.join.mgps.Util.g2.i(game_info.getVer()) && l4.d() < Integer.parseInt(game_info.getVer())) {
                                        textView2.setBackgroundResource(R.drawable.app_green_butn);
                                        textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                        textView2.setText("更新");
                                    } else {
                                        textView2.setBackgroundResource(R.drawable.app_maincolor_butn);
                                        textView2.setText(this.f45093c.getResources().getString(R.string.download_status_finished));
                                        textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_main_color));
                                    }
                                } else {
                                    textView2.setBackgroundResource(R.drawable.app_green_butn);
                                    if (appBeanMain.getGame_info() == null || appBeanMain.getGame_info().getPay_tag_info() == null || appBeanMain.getGame_info().getPay_tag_info().getPay_game_amount() <= 0 || b2.e0.o().p(appBeanMain.getGame_info().getCrc_sign_id())) {
                                        textView2.setText(this.f45093c.getResources().getString(R.string.download_status_download));
                                    } else {
                                        textView2.setText(this.f45093c.getResources().getString(R.string.pay_game_amount, appBeanMain.getGame_info().getPay_tag_info().getPayGameAmount()));
                                    }
                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                    UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                                    UtilsMy.c3(textView2, game_info);
                                }
                            } else {
                                textView2.setBackgroundResource(R.drawable.app_green_butn);
                                if (appBeanMain.getGame_info() == null || appBeanMain.getGame_info().getPay_tag_info() == null || appBeanMain.getGame_info().getPay_tag_info().getPay_game_amount() <= 0 || b2.e0.o().p(appBeanMain.getGame_info().getCrc_sign_id())) {
                                    textView2.setText(this.f45093c.getResources().getString(R.string.download_status_download));
                                } else {
                                    textView2.setText(this.f45093c.getResources().getString(R.string.pay_game_amount, appBeanMain.getGame_info().getPay_tag_info().getPayGameAmount()));
                                }
                                textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                                UtilsMy.c3(textView2, game_info);
                            }
                        } else {
                            if (UtilsMy.w0(appBeanMain.getGame_info().getPay_tag_info(), appBeanMain.getGame_info().getCrc_sign_id()) > 0) {
                                recomDatabeanBusiness.a().setStatus(43);
                            }
                            int status = recomDatabeanBusiness.a().getStatus();
                            if (status != 0) {
                                if (status == 27) {
                                    textView2.setText("暂停中");
                                } else if (status == 48) {
                                    textView2.setBackgroundResource(R.drawable.app_blue_butn);
                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                    textView2.setText("安装中");
                                } else if (status != 2) {
                                    if (status != 3) {
                                        if (status != 5) {
                                            if (status != 6) {
                                                if (status != 7) {
                                                    if (status != 42) {
                                                        if (status != 43) {
                                                            switch (status) {
                                                                case 9:
                                                                    textView2.setBackgroundResource(R.drawable.app_green_butn);
                                                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                                    textView2.setText("更新");
                                                                    break;
                                                                case 10:
                                                                    textView2.setBackgroundResource(R.drawable.app_blue_butn);
                                                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                                    textView2.setText("等待");
                                                                    break;
                                                                case 11:
                                                                    textView2.setBackgroundResource(R.drawable.app_green_butn);
                                                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                                    textView2.setText("安装");
                                                                    break;
                                                                case 12:
                                                                    textView2.setBackgroundResource(R.drawable.app_extract);
                                                                    textView2.setText("解压中");
                                                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_grey_color));
                                                                    break;
                                                                case 13:
                                                                    textView2.setBackgroundResource(R.drawable.app_blue_butn);
                                                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                                    textView2.setText("解压");
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        textView2.setBackgroundResource(R.drawable.app_maincolor_butn);
                                        textView2.setText(this.f45093c.getResources().getString(R.string.download_status_finished));
                                        textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_main_color));
                                    }
                                    textView2.setBackgroundResource(R.drawable.app_blue_butn);
                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                    textView2.setText("继续");
                                } else {
                                    textView2.setBackgroundResource(R.drawable.app_blue_butn);
                                    textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                    textView2.setText("暂停");
                                }
                            }
                            textView2.setBackgroundResource(R.drawable.app_blue_butn);
                            textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                            if (appBeanMain.getGame_info() == null || appBeanMain.getGame_info().getPay_tag_info() == null || appBeanMain.getGame_info().getPay_tag_info().getPay_game_amount() <= 0 || b2.e0.o().p(appBeanMain.getGame_info().getCrc_sign_id())) {
                                textView2.setText(this.f45093c.getResources().getString(R.string.download_status_download));
                            } else {
                                textView2.setText(this.f45093c.getResources().getString(R.string.pay_game_amount, appBeanMain.getGame_info().getPay_tag_info().getPayGameAmount()));
                            }
                            UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                            UtilsMy.c3(textView2, game_info);
                        }
                    }
                    textView2.setOnClickListener(new a1(recomDatabeanBusiness, game_info, i6));
                }
            } else if (link_type != 4 && link_type != 5) {
                MyImageLoader.f(simpleDraweeView, R.drawable.rect_normal_icon, main.getPic_remote(), MyImageLoader.D(this.f45093c));
                textView.setText(main.getSub_title());
                textView2.setBackgroundResource(R.drawable.app_green_butn);
                textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                textView2.setText("查看");
                textView2.setTextSize(2, 12.0f);
                textView2.setOnClickListener(new d1(intentDataBean, i6));
            } else {
                MyImageLoader.f(simpleDraweeView, R.drawable.rect_normal_icon, main.getPic_remote(), MyImageLoader.D(this.f45093c));
                textView.setText(main.getSub_title());
                textView2.setBackgroundResource(R.drawable.app_green_butn);
                textView2.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                textView2.setText("打开");
                textView2.setTextSize(2, 12.0f);
                textView2.setOnClickListener(new b1(intentDataBean, i6));
            }
        }
        simpleDraweeView.setOnClickListener(new e1(i6, intentDataBean));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f45095e.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f45095e.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f45095e.get(i4).getShowtype();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v104, types: [com.join.mgps.adapter.o3$b2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v98, types: [com.join.mgps.adapter.o3$m1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v165 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v38 */
    /* JADX WARN: Type inference failed for: r16v39 */
    /* JADX WARN: Type inference failed for: r16v54 */
    /* JADX WARN: Type inference failed for: r16v55 */
    /* JADX WARN: Type inference failed for: r16v57 */
    /* JADX WARN: Type inference failed for: r16v58 */
    /* JADX WARN: Type inference failed for: r16v59 */
    /* JADX WARN: Type inference failed for: r16v60 */
    /* JADX WARN: Type inference failed for: r16v61 */
    /* JADX WARN: Type inference failed for: r16v62 */
    /* JADX WARN: Type inference failed for: r16v63 */
    /* JADX WARN: Type inference failed for: r16v64 */
    /* JADX WARN: Type inference failed for: r16v65 */
    /* JADX WARN: Type inference failed for: r16v66 */
    /* JADX WARN: Type inference failed for: r16v67 */
    /* JADX WARN: Type inference failed for: r16v68 */
    /* JADX WARN: Type inference failed for: r16v69 */
    /* JADX WARN: Type inference failed for: r16v70 */
    /* JADX WARN: Type inference failed for: r16v71 */
    /* JADX WARN: Type inference failed for: r16v72 */
    /* JADX WARN: Type inference failed for: r16v73 */
    /* JADX WARN: Type inference failed for: r16v74 */
    /* JADX WARN: Type inference failed for: r16v75 */
    /* JADX WARN: Type inference failed for: r16v76 */
    /* JADX WARN: Type inference failed for: r16v77 */
    /* JADX WARN: Type inference failed for: r16v78 */
    /* JADX WARN: Type inference failed for: r16v79 */
    /* JADX WARN: Type inference failed for: r16v80 */
    /* JADX WARN: Type inference failed for: r16v81 */
    /* JADX WARN: Type inference failed for: r16v82 */
    /* JADX WARN: Type inference failed for: r16v83 */
    /* JADX WARN: Type inference failed for: r16v85 */
    /* JADX WARN: Type inference failed for: r16v86 */
    /* JADX WARN: Type inference failed for: r16v87 */
    /* JADX WARN: Type inference failed for: r16v88 */
    /* JADX WARN: Type inference failed for: r16v89 */
    /* JADX WARN: Type inference failed for: r16v90 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v38 */
    /* JADX WARN: Type inference failed for: r17v39, types: [com.join.mgps.adapter.o3$l2] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v87 */
    /* JADX WARN: Type inference failed for: r17v88 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r19v81 */
    /* JADX WARN: Type inference failed for: r20v77 */
    /* JADX WARN: Type inference failed for: r21v19, types: [com.join.mgps.adapter.o3$s1] */
    /* JADX WARN: Type inference failed for: r22v77 */
    /* JADX WARN: Type inference failed for: r24v33 */
    /* JADX WARN: Type inference failed for: r24v37 */
    /* JADX WARN: Type inference failed for: r24v38 */
    /* JADX WARN: Type inference failed for: r24v40 */
    /* JADX WARN: Type inference failed for: r24v42 */
    /* JADX WARN: Type inference failed for: r24v43 */
    /* JADX WARN: Type inference failed for: r24v44 */
    /* JADX WARN: Type inference failed for: r24v45 */
    /* JADX WARN: Type inference failed for: r24v46 */
    /* JADX WARN: Type inference failed for: r24v47 */
    /* JADX WARN: Type inference failed for: r24v48 */
    /* JADX WARN: Type inference failed for: r24v49 */
    /* JADX WARN: Type inference failed for: r24v50 */
    /* JADX WARN: Type inference failed for: r24v51 */
    /* JADX WARN: Type inference failed for: r24v52 */
    /* JADX WARN: Type inference failed for: r24v53 */
    /* JADX WARN: Type inference failed for: r24v54 */
    /* JADX WARN: Type inference failed for: r24v55 */
    /* JADX WARN: Type inference failed for: r24v56 */
    /* JADX WARN: Type inference failed for: r24v57 */
    /* JADX WARN: Type inference failed for: r24v58 */
    /* JADX WARN: Type inference failed for: r24v59 */
    /* JADX WARN: Type inference failed for: r24v60 */
    /* JADX WARN: Type inference failed for: r24v61 */
    /* JADX WARN: Type inference failed for: r24v62 */
    /* JADX WARN: Type inference failed for: r24v63 */
    /* JADX WARN: Type inference failed for: r24v64 */
    /* JADX WARN: Type inference failed for: r24v65 */
    /* JADX WARN: Type inference failed for: r24v66 */
    /* JADX WARN: Type inference failed for: r24v67 */
    /* JADX WARN: Type inference failed for: r24v68 */
    /* JADX WARN: Type inference failed for: r24v69 */
    /* JADX WARN: Type inference failed for: r24v70 */
    /* JADX WARN: Type inference failed for: r24v71 */
    /* JADX WARN: Type inference failed for: r24v72 */
    /* JADX WARN: Type inference failed for: r24v73 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v103 */
    /* JADX WARN: Type inference failed for: r25v104 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v23 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v36 */
    /* JADX WARN: Type inference failed for: r25v37, types: [com.join.mgps.adapter.o3$t2] */
    /* JADX WARN: Type inference failed for: r25v39 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v40 */
    /* JADX WARN: Type inference failed for: r25v41 */
    /* JADX WARN: Type inference failed for: r25v42 */
    /* JADX WARN: Type inference failed for: r25v43 */
    /* JADX WARN: Type inference failed for: r25v44 */
    /* JADX WARN: Type inference failed for: r25v45 */
    /* JADX WARN: Type inference failed for: r25v46 */
    /* JADX WARN: Type inference failed for: r25v47 */
    /* JADX WARN: Type inference failed for: r25v48 */
    /* JADX WARN: Type inference failed for: r25v49 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v50 */
    /* JADX WARN: Type inference failed for: r25v51 */
    /* JADX WARN: Type inference failed for: r25v52 */
    /* JADX WARN: Type inference failed for: r25v53 */
    /* JADX WARN: Type inference failed for: r25v54 */
    /* JADX WARN: Type inference failed for: r25v56 */
    /* JADX WARN: Type inference failed for: r25v57 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29, types: [com.join.mgps.adapter.o3$o2] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v71 */
    /* JADX WARN: Type inference failed for: r27v72 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r28v29 */
    /* JADX WARN: Type inference failed for: r28v30 */
    /* JADX WARN: Type inference failed for: r28v32 */
    /* JADX WARN: Type inference failed for: r28v33 */
    /* JADX WARN: Type inference failed for: r28v34 */
    /* JADX WARN: Type inference failed for: r28v35 */
    /* JADX WARN: Type inference failed for: r28v36 */
    /* JADX WARN: Type inference failed for: r28v37 */
    /* JADX WARN: Type inference failed for: r28v38 */
    /* JADX WARN: Type inference failed for: r28v39 */
    /* JADX WARN: Type inference failed for: r28v40 */
    /* JADX WARN: Type inference failed for: r28v41 */
    /* JADX WARN: Type inference failed for: r28v42 */
    /* JADX WARN: Type inference failed for: r28v43 */
    /* JADX WARN: Type inference failed for: r28v44 */
    /* JADX WARN: Type inference failed for: r28v45 */
    /* JADX WARN: Type inference failed for: r28v46 */
    /* JADX WARN: Type inference failed for: r28v47 */
    /* JADX WARN: Type inference failed for: r28v48 */
    /* JADX WARN: Type inference failed for: r28v50 */
    /* JADX WARN: Type inference failed for: r28v51 */
    /* JADX WARN: Type inference failed for: r28v52 */
    /* JADX WARN: Type inference failed for: r28v53 */
    /* JADX WARN: Type inference failed for: r28v54 */
    /* JADX WARN: Type inference failed for: r28v55 */
    /* JADX WARN: Type inference failed for: r28v56 */
    /* JADX WARN: Type inference failed for: r28v57 */
    /* JADX WARN: Type inference failed for: r28v58 */
    /* JADX WARN: Type inference failed for: r28v59 */
    /* JADX WARN: Type inference failed for: r28v60 */
    /* JADX WARN: Type inference failed for: r28v61 */
    /* JADX WARN: Type inference failed for: r28v62 */
    /* JADX WARN: Type inference failed for: r28v63 */
    /* JADX WARN: Type inference failed for: r28v64 */
    /* JADX WARN: Type inference failed for: r28v65 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v17, types: [com.join.mgps.adapter.o3$f2] */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v25, types: [com.join.mgps.adapter.o3$f2] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v67 */
    /* JADX WARN: Type inference failed for: r29v68 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r33v23 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v26 */
    /* JADX WARN: Type inference failed for: r33v27 */
    /* JADX WARN: Type inference failed for: r33v28 */
    /* JADX WARN: Type inference failed for: r33v29 */
    /* JADX WARN: Type inference failed for: r33v30 */
    /* JADX WARN: Type inference failed for: r33v31 */
    /* JADX WARN: Type inference failed for: r33v32 */
    /* JADX WARN: Type inference failed for: r33v33 */
    /* JADX WARN: Type inference failed for: r33v34 */
    /* JADX WARN: Type inference failed for: r33v35 */
    /* JADX WARN: Type inference failed for: r33v36 */
    /* JADX WARN: Type inference failed for: r33v37 */
    /* JADX WARN: Type inference failed for: r33v38 */
    /* JADX WARN: Type inference failed for: r33v39 */
    /* JADX WARN: Type inference failed for: r33v40 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v42 */
    /* JADX WARN: Type inference failed for: r33v43 */
    /* JADX WARN: Type inference failed for: r33v44 */
    /* JADX WARN: Type inference failed for: r33v46 */
    /* JADX WARN: Type inference failed for: r33v47 */
    /* JADX WARN: Type inference failed for: r33v48 */
    /* JADX WARN: Type inference failed for: r33v49 */
    /* JADX WARN: Type inference failed for: r33v50 */
    /* JADX WARN: Type inference failed for: r33v51 */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v53 */
    /* JADX WARN: Type inference failed for: r33v54 */
    /* JADX WARN: Type inference failed for: r33v55 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58 */
    /* JADX WARN: Type inference failed for: r33v59 */
    /* JADX WARN: Type inference failed for: r34v17 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.join.mgps.adapter.o3$b2] */
    /* JADX WARN: Type inference failed for: r5v230 */
    /* JADX WARN: Type inference failed for: r5v231 */
    /* JADX WARN: Type inference failed for: r5v248, types: [java.lang.Object, com.join.mgps.adapter.o3$x1] */
    /* JADX WARN: Type inference failed for: r5v249, types: [java.lang.Object, com.join.mgps.adapter.o3$w1] */
    /* JADX WARN: Type inference failed for: r5v250, types: [com.join.mgps.adapter.o3$o2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v268, types: [com.join.mgps.adapter.o3$m2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v337, types: [com.join.mgps.adapter.o3$e2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v339, types: [java.lang.Object, com.join.mgps.adapter.o3$v1] */
    /* JADX WARN: Type inference failed for: r5v341 */
    /* JADX WARN: Type inference failed for: r5v344, types: [com.join.mgps.adapter.o3$t2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v346, types: [com.join.mgps.adapter.o3$s1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v348, types: [java.lang.Object, com.join.mgps.adapter.o3$u1] */
    /* JADX WARN: Type inference failed for: r5v350, types: [java.lang.Object, com.join.mgps.adapter.o3$f2] */
    /* JADX WARN: Type inference failed for: r5v351, types: [com.join.mgps.adapter.o3$l2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v363 */
    /* JADX WARN: Type inference failed for: r5v364 */
    /* JADX WARN: Type inference failed for: r6v264 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v341, types: [com.join.mgps.adapter.o3$q1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51, types: [com.join.mgps.adapter.o3$e2] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v587 */
    /* JADX WARN: Type inference failed for: r7v588 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v63, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r8v82, types: [com.join.mgps.adapter.o3$b2] */
    @Override // android.widget.Adapter
    public View getView(final int i4, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        Exception exc;
        View view4;
        v2 v2Var;
        final p1 p1Var;
        x1 x1Var;
        Object obj;
        x1 x1Var2;
        View view5;
        d2 d2Var;
        n1 n1Var;
        n1 n1Var2;
        n1 n1Var3;
        r1 r1Var;
        z1 z1Var;
        ?? r17;
        u1 u1Var;
        q1 q1Var;
        p2 p2Var;
        m1 m1Var;
        s2 s2Var;
        r2 r2Var;
        q2 q2Var;
        ?? r27;
        j2 j2Var;
        ?? r29;
        o1 o1Var;
        g2 g2Var;
        k2 k2Var;
        k2 k2Var2;
        m2 m2Var;
        h2 h2Var;
        n1 n1Var4;
        n1 n1Var5;
        x1 x1Var3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        s2 s2Var2;
        x1 x1Var4;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        m1 m1Var2;
        x1 x1Var5;
        Object obj15;
        Object obj16;
        Object obj17;
        x1 x1Var6;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        x1 x1Var7;
        Object obj24;
        Object obj25;
        x1 x1Var8;
        Object obj26;
        Object obj27;
        Object obj28;
        x1 x1Var9;
        Object obj29;
        Object obj30;
        Object obj31;
        Object obj32;
        ?? r292;
        x1 x1Var10;
        Object obj33;
        Object obj34;
        x1 x1Var11;
        Object obj35;
        Object obj36;
        x1 x1Var12;
        x1 x1Var13;
        Object obj37;
        Object obj38;
        Object obj39;
        x1 x1Var14;
        Object obj40;
        Object obj41;
        Object obj42;
        g2 g2Var2;
        k2 k2Var3;
        x1 x1Var15;
        Object obj43;
        Object obj44;
        Object obj45;
        k2 k2Var4;
        x1 x1Var16;
        Object obj46;
        Object obj47;
        Object obj48;
        Object obj49;
        Object obj50;
        x1 x1Var17;
        Object obj51;
        Object obj52;
        Object obj53;
        x1 x1Var18;
        Object obj54;
        x1 x1Var19;
        Object obj55;
        Object obj56;
        Object obj57;
        g2 g2Var3;
        Object obj58;
        Object obj59;
        Object obj60;
        x1 x1Var20;
        TextView textView;
        SimpleDraweeView simpleDraweeView;
        v2 v2Var2;
        ModleBean main;
        ModleBean main2;
        RecomDatabeanBusiness recomDatabeanBusiness;
        ModleBean main3;
        h2 h2Var2;
        RecomDatabeanBusiness recomDatabeanBusiness2;
        p2 p2Var2;
        m1 m1Var3;
        m2 m2Var2;
        long j4;
        String str;
        int i5;
        c2 c2Var;
        String str2;
        int i6;
        View inflate;
        n1 n1Var6;
        d2 d2Var2;
        h2 h2Var3;
        n1 n1Var7;
        n1 n1Var8;
        a2 a2Var;
        r1 r1Var2;
        h2 h2Var4;
        p1 p1Var2;
        p1 p1Var3;
        h2 h2Var5;
        i2 i2Var;
        s2 s2Var3;
        q2 q2Var2;
        q2 q2Var3;
        h2 h2Var6;
        o1 o1Var2;
        o1 o1Var3;
        o1 o1Var4;
        k2 k2Var5;
        k2 k2Var6;
        n1 n1Var9;
        n1 n1Var10;
        Object obj61;
        n1 n1Var11;
        v2 v2Var3;
        n1 n1Var12;
        d2 d2Var3;
        n1 n1Var13;
        a2 a2Var2;
        r1 r1Var3;
        h2 h2Var7;
        s2 s2Var4;
        q2 q2Var4;
        q2 q2Var5;
        h2 h2Var8;
        o1 o1Var5;
        k2 k2Var7;
        n1 n1Var14;
        n1 n1Var15;
        n1 n1Var16;
        n1 n1Var17;
        n1 n1Var18;
        h2 h2Var9;
        v2 v2Var4;
        s2 s2Var5;
        i2 i2Var2;
        q2 q2Var6;
        q2 q2Var7;
        h2 h2Var10;
        o1 o1Var6;
        k2 k2Var8;
        k2 k2Var9;
        n1 n1Var19;
        n1 n1Var20;
        n1 n1Var21;
        n1 n1Var22;
        View inflate2;
        x1 x1Var21;
        n1 n1Var23;
        d2 d2Var4;
        h2 h2Var11;
        Object obj62;
        r1 r1Var4;
        h2 h2Var12;
        v2 v2Var5;
        h2 h2Var13;
        s2 s2Var6;
        q2 q2Var8;
        q2 q2Var9;
        h2 h2Var14;
        o1 o1Var7;
        k2 k2Var10;
        k2 k2Var11;
        n1 n1Var24;
        p2 p2Var3;
        n1 n1Var25;
        x1 x1Var22;
        n1 n1Var26;
        d2 d2Var5;
        r1 r1Var5;
        h2 h2Var15;
        s2 s2Var7;
        q2 q2Var10;
        q2 q2Var11;
        h2 h2Var16;
        o1 o1Var8;
        k2 k2Var12;
        n1 n1Var27;
        h2 h2Var17;
        try {
            int itemViewType = getItemViewType(i4);
            i2 i2Var3 = null;
            if (itemViewType == 21) {
                return LayoutInflater.from(this.f45093c).inflate(R.layout.line_layout, (ViewGroup) null);
            }
            try {
                if (view == null) {
                    ?? r5 = 2131298473;
                    try {
                        try {
                            switch (itemViewType) {
                                case 0:
                                    v2 v2Var6 = new v2();
                                    inflate = this.f45092b.inflate(R.layout.toptip_layout, (ViewGroup) null);
                                    v2Var6.f45489a = (LinearLayout) inflate.findViewById(R.id.topTip);
                                    v2Var6.f45491c = (ImageView) inflate.findViewById(R.id.topTipClose);
                                    v2Var6.f45490b = (TextView) inflate.findViewById(R.id.toptipText);
                                    inflate.setTag(v2Var6);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    v2Var3 = v2Var6;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 1:
                                    f45081p1 = new u2();
                                    View inflate3 = this.f45092b.inflate(R.layout.mgpapa_localfight_include, (ViewGroup) null);
                                    f45081p1.f45455a = (RelativeLayout) inflate3.findViewById(R.id.localfight_layout);
                                    f45081p1.f45456b = (RelativeLayout) inflate3.findViewById(R.id.recommendTop);
                                    f45081p1.f45457c = (RelativeLayout) inflate3.findViewById(R.id.recommendRight);
                                    f45081p1.f45458d = (TextView) inflate3.findViewById(R.id.fight_appname);
                                    f45081p1.f45459e = (LinearLayout) inflate3.findViewById(R.id.everdayGame);
                                    f45081p1.f45460f = (SimpleDraweeView) inflate3.findViewById(R.id.fightapp_image);
                                    f45081p1.f45461g = (TextView) inflate3.findViewById(R.id.recomenTopName);
                                    f45081p1.f45462h = (TextView) inflate3.findViewById(R.id.recomenTopSubTitle);
                                    f45081p1.f45463i = (SimpleDraweeView) inflate3.findViewById(R.id.recomenTopImage);
                                    f45081p1.f45464j = (LinearLayout) inflate3.findViewById(R.id.updatedmore);
                                    f45081p1.f45465k = (TextView) inflate3.findViewById(R.id.everday_newnumber);
                                    f45081p1.f45466l = (TextView) inflate3.findViewById(R.id.everday_newtime);
                                    f45081p1.f45467m = (LinearLayout) inflate3.findViewById(R.id.everdaytimetick);
                                    f45081p1.f45468n = (TextView) inflate3.findViewById(R.id.recomenRightName);
                                    f45081p1.f45469o = (TextView) inflate3.findViewById(R.id.recomenRightLabel);
                                    f45081p1.f45474t = (LinearLayout) inflate3.findViewById(R.id.main);
                                    f45081p1.f45470p = (SimpleDraweeView) inflate3.findViewById(R.id.recomenRightImage);
                                    f45081p1.f45471q = (SimpleDraweeView) inflate3.findViewById(R.id.game1);
                                    f45081p1.f45472r = (SimpleDraweeView) inflate3.findViewById(R.id.game2);
                                    f45081p1.f45473s = (SimpleDraweeView) inflate3.findViewById(R.id.game3);
                                    inflate3.setTag(f45081p1);
                                    n1Var12 = null;
                                    d2Var3 = null;
                                    h2Var3 = null;
                                    n1Var13 = null;
                                    n1Var8 = null;
                                    a2Var2 = null;
                                    r1Var3 = null;
                                    z1Var = null;
                                    h2Var7 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var4 = null;
                                    r2Var = null;
                                    q2Var4 = null;
                                    q2Var = null;
                                    q2Var5 = null;
                                    j2Var = null;
                                    h2Var8 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var5 = null;
                                    g2Var = null;
                                    k2Var7 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    r5 = inflate3;
                                    inflate = r5;
                                    n1Var6 = n1Var12;
                                    d2Var2 = d2Var3;
                                    n1Var7 = n1Var13;
                                    a2Var = a2Var2;
                                    r1Var2 = r1Var3;
                                    h2Var4 = h2Var7;
                                    s2Var3 = s2Var4;
                                    q2Var2 = q2Var4;
                                    q2Var3 = q2Var5;
                                    h2Var6 = h2Var8;
                                    o1Var4 = o1Var5;
                                    k2Var5 = k2Var7;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 2:
                                    a2 a2Var3 = new a2();
                                    inflate = this.f45092b.inflate(R.layout.papmain_item_title_layout, (ViewGroup) null);
                                    a2Var3.f45113a = (TextView) inflate.findViewById(R.id.titleText);
                                    a2Var3.f45114b = (TextView) inflate.findViewById(R.id.subtitle);
                                    a2Var3.f45115c = (LinearLayout) inflate.findViewById(R.id.look_other);
                                    a2Var3.f45116d = inflate.findViewById(R.id.line);
                                    inflate.setTag(a2Var3);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    a2Var = a2Var3;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 3:
                                    h2 h2Var18 = new h2();
                                    View inflate4 = this.f45092b.inflate(R.layout.app_listview_item, (ViewGroup) null);
                                    try {
                                        h2Var18.f45221a = (SimpleDraweeView) inflate4.findViewById(R.id.mgListviewItemIcon);
                                        h2Var18.f45234n = (ImageView) inflate4.findViewById(R.id.giftPackageSwich);
                                        h2Var18.f45233m = (RelativeLayout) inflate4.findViewById(R.id.relateLayoutApp);
                                        h2Var18.f45222b = (TextView) inflate4.findViewById(R.id.mgListviewItemAppname);
                                        h2Var18.f45223c = (RelativeLayout) inflate4.findViewById(R.id.rLayoutRight);
                                        h2Var18.f45224d = (TextView) inflate4.findViewById(R.id.mgListviewItemInstall);
                                        h2Var18.f45225e = (TextView) inflate4.findViewById(R.id.mgListviewItemDescribe);
                                        h2Var18.f45226f = (LinearLayout) inflate4.findViewById(R.id.linearLayout2);
                                        h2Var18.f45227g = (LinearLayout) inflate4.findViewById(R.id.tipsLayout);
                                        h2Var18.f45228h = (TextView) inflate4.findViewById(R.id.appSize);
                                        h2Var18.f45229i = (TextView) inflate4.findViewById(R.id.loding_info);
                                        h2Var18.f45231k = (ProgressBar) inflate4.findViewById(R.id.progressBar);
                                        h2Var18.f45232l = (ProgressBar) inflate4.findViewById(R.id.progressBarZip);
                                        h2Var18.f45230j = (TextView) inflate4.findViewById(R.id.moneyText);
                                        h2Var18.f45235o = inflate4.findViewById(R.id.line);
                                        inflate4.findViewById(R.id.line).setVisibility(0);
                                        inflate4.setTag(h2Var18);
                                        n1Var14 = null;
                                        n1Var15 = null;
                                        n1Var16 = null;
                                        n1Var17 = null;
                                        n1Var3 = null;
                                        n1Var18 = null;
                                        z1Var = null;
                                        h2Var9 = null;
                                        v2Var4 = null;
                                        p1Var2 = null;
                                        p1Var3 = null;
                                        s2Var5 = null;
                                        i2Var = null;
                                        i2Var2 = null;
                                        r2Var = null;
                                        q2Var6 = null;
                                        q2Var = null;
                                        q2Var7 = null;
                                        j2Var = null;
                                        h2Var10 = null;
                                        o1Var3 = null;
                                        o1Var6 = null;
                                        g2Var = null;
                                        k2Var8 = null;
                                        k2Var9 = null;
                                        n1Var9 = null;
                                        n1Var10 = null;
                                        n1Var19 = null;
                                        n1Var20 = null;
                                        o1Var2 = h2Var18;
                                        inflate = inflate4;
                                        n1Var21 = null;
                                        n1Var22 = null;
                                        v2Var = v2Var4;
                                        p1Var = p1Var2;
                                        k2Var2 = p1Var3;
                                        m2Var = s2Var5;
                                        i2Var3 = i2Var;
                                        h2Var = o1Var2;
                                        u1Var = o1Var3;
                                        q1Var = k2Var9;
                                        n1Var4 = n1Var9;
                                        n1Var5 = n1Var10;
                                        p2Var = n1Var19;
                                        m1Var = n1Var20;
                                        n1 n1Var28222 = n1Var17;
                                        view4 = inflate;
                                        obj = n1Var28222;
                                        x1Var2 = n1Var21;
                                        view5 = n1Var14;
                                        d2Var = n1Var22;
                                        n1Var = n1Var15;
                                        n1Var2 = n1Var16;
                                        r1Var = n1Var18;
                                        r17 = h2Var9;
                                        s2Var = i2Var2;
                                        view2 = q2Var6;
                                        r27 = q2Var7;
                                        r29 = h2Var10;
                                        o1Var = o1Var6;
                                        k2Var = k2Var8;
                                        break;
                                    } catch (Exception e5) {
                                        exc = e5;
                                        view3 = inflate4;
                                        exc.printStackTrace();
                                        return view3;
                                    }
                                case 4:
                                    s2 s2Var8 = new s2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_intersting_top_layout, (ViewGroup) null);
                                    s2Var8.f45415a = (SimpleDraweeView) inflate.findViewById(R.id.intersting_top_image);
                                    inflate.setTag(s2Var8);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    s2Var3 = s2Var8;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 5:
                                    r2 r2Var2 = new r2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_intersting_midle_layout, (ViewGroup) null);
                                    r2Var2.f45397a = (HListView) inflate.findViewById(R.id.interstinglist);
                                    inflate.setTag(r2Var2);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    r2Var = r2Var2;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 6:
                                    q2 q2Var12 = new q2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_broadcase_top_layout, (ViewGroup) null);
                                    q2Var12.f45380a = (LinearLayout) inflate.findViewById(R.id.gamebroadcastTop);
                                    q2Var12.f45381b = (LinearLayout) inflate.findViewById(R.id.topTextLayout);
                                    q2Var12.f45382c = (TextView) inflate.findViewById(R.id.gamebroadcastTopText1);
                                    q2Var12.f45383d = (TextView) inflate.findViewById(R.id.gamebroadcastTopText2);
                                    q2Var12.f45384e = (TextView) inflate.findViewById(R.id.readNumber);
                                    q2Var12.f45385f = (TextView) inflate.findViewById(R.id.commentNumber);
                                    q2Var12.f45386g = (SimpleDraweeView) inflate.findViewById(R.id.gamebroadcastTopImage1);
                                    q2Var12.f45387h = (SimpleDraweeView) inflate.findViewById(R.id.gamebroadcastTopImage2);
                                    q2Var12.f45388i = (SimpleDraweeView) inflate.findViewById(R.id.gamebroadcastTopImage3);
                                    inflate.setTag(q2Var12);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    q2Var = q2Var12;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 7:
                                    p2 p2Var4 = new p2();
                                    inflate2 = this.f45092b.inflate(R.layout.papamain_broadcase_bottom1_layout, (ViewGroup) null);
                                    p2Var4.f45355a = (LinearLayout) inflate2.findViewById(R.id.gamebroadcastbottom1);
                                    p2Var4.f45358d = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastbottom1Image);
                                    p2Var4.f45359e = (SimpleDraweeView) inflate2.findViewById(R.id.gameIcon);
                                    p2Var4.f45360f = (TextView) inflate2.findViewById(R.id.appname);
                                    p2Var4.f45356b = (TextView) inflate2.findViewById(R.id.gamebroadcastbottom1Text1);
                                    p2Var4.f45361g = (TextView) inflate2.findViewById(R.id.appSize);
                                    p2Var4.f45357c = (TextView) inflate2.findViewById(R.id.gamebroadcastbottom1Text2);
                                    p2Var4.f45362h = (RelativeLayout) inflate2.findViewById(R.id.rLayoutRight);
                                    p2Var4.f45363i = (RelativeLayout) inflate2.findViewById(R.id.gameLayout);
                                    p2Var4.f45364j = (TextView) inflate2.findViewById(R.id.itemInstall);
                                    p2Var4.f45365k = (TextView) inflate2.findViewById(R.id.emptyView);
                                    inflate2.setTag(p2Var4);
                                    x1Var21 = null;
                                    n1Var23 = null;
                                    d2Var4 = null;
                                    h2Var11 = null;
                                    obj62 = null;
                                    r1Var4 = null;
                                    z1Var = null;
                                    h2Var12 = null;
                                    v2Var5 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var13 = null;
                                    i2Var = null;
                                    s2Var6 = null;
                                    r2Var = null;
                                    q2Var8 = null;
                                    q2Var = null;
                                    q2Var9 = null;
                                    j2Var = null;
                                    h2Var14 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var7 = null;
                                    g2Var = null;
                                    k2Var10 = null;
                                    k2Var11 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    n1Var24 = null;
                                    p2Var3 = p2Var4;
                                    inflate = inflate2;
                                    n1Var27 = n1Var24;
                                    x1Var22 = x1Var21;
                                    n1Var26 = n1Var23;
                                    d2Var5 = d2Var4;
                                    r1Var5 = r1Var4;
                                    h2Var15 = h2Var12;
                                    s2Var7 = s2Var6;
                                    q2Var10 = q2Var8;
                                    q2Var11 = q2Var9;
                                    h2Var16 = h2Var14;
                                    o1Var8 = o1Var7;
                                    k2Var12 = k2Var10;
                                    n1Var17 = n1Var27;
                                    n1Var21 = x1Var22;
                                    n1Var14 = n1Var26;
                                    n1Var22 = d2Var5;
                                    n1Var15 = h2Var11;
                                    n1Var16 = n1Var27;
                                    n1Var3 = obj62;
                                    n1Var18 = r1Var5;
                                    h2Var9 = h2Var15;
                                    v2Var4 = v2Var5;
                                    s2Var5 = h2Var13;
                                    i2Var2 = s2Var7;
                                    q2Var6 = q2Var10;
                                    q2Var7 = q2Var11;
                                    h2Var10 = h2Var16;
                                    o1Var6 = o1Var8;
                                    k2Var8 = k2Var12;
                                    k2Var9 = k2Var11;
                                    n1Var19 = p2Var3;
                                    n1Var20 = n1Var24;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 8:
                                    ?? x1Var23 = new x1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_guessyoulike_top_layout, (ViewGroup) null);
                                    ((x1) x1Var23).f45513a = (TextView) inflate.findViewById(R.id.guessyoulikeTitle);
                                    ((x1) x1Var23).f45514b = (TextView) inflate.findViewById(R.id.hideh5);
                                    inflate.setTag(x1Var23);
                                    n1Var25 = null;
                                    h2Var17 = x1Var23;
                                    n1 n1Var29 = n1Var25;
                                    n1 n1Var30 = n1Var29;
                                    n1 n1Var31 = n1Var30;
                                    n1 n1Var32 = n1Var31;
                                    n1 n1Var33 = n1Var32;
                                    n1 n1Var34 = n1Var33;
                                    z1Var = n1Var34;
                                    i2 i2Var4 = z1Var;
                                    v2 v2Var7 = i2Var4;
                                    p1Var2 = v2Var7;
                                    p1Var3 = p1Var2;
                                    s2 s2Var9 = p1Var3;
                                    i2Var = s2Var9;
                                    i2 i2Var5 = i2Var;
                                    r2Var = i2Var5;
                                    q2 q2Var13 = r2Var;
                                    q2Var = q2Var13;
                                    q2 q2Var14 = q2Var;
                                    j2Var = q2Var14;
                                    o1 o1Var9 = j2Var;
                                    o1Var2 = o1Var9;
                                    o1Var3 = o1Var2;
                                    o1 o1Var10 = o1Var3;
                                    g2Var = o1Var10;
                                    n1 n1Var35 = g2Var;
                                    k2 k2Var13 = n1Var35;
                                    n1Var9 = k2Var13;
                                    n1Var10 = n1Var9;
                                    n1 n1Var36 = n1Var10;
                                    n1Var20 = n1Var36;
                                    n1Var21 = h2Var17;
                                    n1Var14 = n1Var25;
                                    n1Var22 = n1Var29;
                                    n1Var15 = n1Var30;
                                    n1Var16 = n1Var31;
                                    n1Var17 = n1Var32;
                                    n1Var3 = n1Var33;
                                    n1Var18 = n1Var34;
                                    h2Var9 = i2Var4;
                                    v2Var4 = v2Var7;
                                    s2Var5 = s2Var9;
                                    i2Var2 = i2Var5;
                                    q2Var6 = q2Var13;
                                    q2Var7 = q2Var14;
                                    h2Var10 = o1Var9;
                                    o1Var6 = o1Var10;
                                    k2Var8 = n1Var35;
                                    k2Var9 = k2Var13;
                                    n1Var19 = n1Var36;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 9:
                                    ?? w1Var = new w1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_guessyoulike_item_layout, (ViewGroup) null);
                                    ((w1) w1Var).f45499a = (LinearLayout) inflate.findViewById(R.id.itemLeft);
                                    ((w1) w1Var).f45500b = (LinearLayout) inflate.findViewById(R.id.itemRight);
                                    ((w1) w1Var).f45501c = (SimpleDraweeView) inflate.findViewById(R.id.appimage);
                                    ((w1) w1Var).f45504f = (SimpleDraweeView) inflate.findViewById(R.id.appimage2);
                                    ((w1) w1Var).f45502d = (TextView) inflate.findViewById(R.id.appname);
                                    ((w1) w1Var).f45505g = (TextView) inflate.findViewById(R.id.appname2);
                                    ((w1) w1Var).f45503e = (TextView) inflate.findViewById(R.id.downloadapp);
                                    ((w1) w1Var).f45506h = (TextView) inflate.findViewById(R.id.downloadapp2);
                                    inflate.setTag(w1Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    h2Var3 = w1Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 10:
                                    ?? o2Var = new o2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_broadcase_bottom_layout, (ViewGroup) null);
                                    ((o2) o2Var).f45327a = (LinearLayout) inflate.findViewById(R.id.gamebroadcastBottom);
                                    ((o2) o2Var).f45328b = (TextView) inflate.findViewById(R.id.gamebroadcastBottomText1);
                                    ((o2) o2Var).f45329c = (TextView) inflate.findViewById(R.id.gamebroadcastBottomText2);
                                    ((o2) o2Var).f45330d = (SimpleDraweeView) inflate.findViewById(R.id.gamebroadcastBottomImage1);
                                    ((o2) o2Var).f45331e = (SimpleDraweeView) inflate.findViewById(R.id.gamebroadcastBottomImage2);
                                    ((o2) o2Var).f45332f = (SimpleDraweeView) inflate.findViewById(R.id.gamebroadcastBottomImage3);
                                    inflate.setTag(o2Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    q2Var3 = o2Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 11:
                                    o1 o1Var11 = new o1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_bespeak_item_layout, (ViewGroup) null);
                                    o1Var11.f45314a = (LinearLayout) inflate.findViewById(R.id.itemLeft);
                                    o1Var11.f45315b = (LinearLayout) inflate.findViewById(R.id.itemRight);
                                    o1Var11.f45316c = (SimpleDraweeView) inflate.findViewById(R.id.appimage);
                                    o1Var11.f45320g = (SimpleDraweeView) inflate.findViewById(R.id.appimage2);
                                    o1Var11.f45317d = (SimpleDraweeView) inflate.findViewById(R.id.gameIcon);
                                    o1Var11.f45321h = (SimpleDraweeView) inflate.findViewById(R.id.gameIcon2);
                                    o1Var11.f45318e = (TextView) inflate.findViewById(R.id.appname);
                                    o1Var11.f45322i = (TextView) inflate.findViewById(R.id.appname2);
                                    o1Var11.f45319f = (TextView) inflate.findViewById(R.id.downloadapp);
                                    o1Var11.f45323j = (TextView) inflate.findViewById(R.id.downloadapp2);
                                    o1Var11.f45325l = (TextView) inflate.findViewById(R.id.bespeakNumber2);
                                    o1Var11.f45324k = (TextView) inflate.findViewById(R.id.bespeakNumber);
                                    inflate.setTag(o1Var11);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    o1Var4 = o1Var11;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 12:
                                    n1 n1Var37 = new n1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_bespeak_bottom_layout, (ViewGroup) null);
                                    n1Var37.f45302a = (TextView) inflate.findViewById(R.id.title);
                                    n1Var37.f45303b = (TextView) inflate.findViewById(R.id.subtitle);
                                    n1Var37.f45304c = (TextView) inflate.findViewById(R.id.butn);
                                    inflate.setTag(n1Var37);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    n1Var7 = n1Var37;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 13:
                                    ?? m1Var4 = new m1();
                                    View inflate5 = this.f45092b.inflate(R.layout.papamain_video_banner_layout, (ViewGroup) null);
                                    ((m1) m1Var4).f45280a = (SimpleDraweeView) inflate5.findViewById(R.id.bannerView);
                                    m1Var4.f45288i = (FrameLayout) inflate5.findViewById(R.id.videoContner);
                                    m1Var4.f45281b = (SimpleDraweeView) inflate5.findViewById(R.id.gameIcon);
                                    m1Var4.f45282c = (TextView) inflate5.findViewById(R.id.appname);
                                    m1Var4.f45283d = (TextView) inflate5.findViewById(R.id.appSize);
                                    m1Var4.f45284e = (RelativeLayout) inflate5.findViewById(R.id.rLayoutRight);
                                    m1Var4.f45285f = (TextView) inflate5.findViewById(R.id.itemInstall);
                                    m1Var4.f45286g = (LinearLayout) inflate5.findViewById(R.id.bannerLayout);
                                    m1Var4.f45287h = (LinearLayout) inflate5.findViewById(R.id.tipsLayout);
                                    inflate5.setTag(m1Var4);
                                    x1Var22 = null;
                                    n1Var26 = null;
                                    d2Var5 = null;
                                    h2Var11 = null;
                                    obj62 = null;
                                    r1Var5 = null;
                                    z1Var = null;
                                    h2Var15 = null;
                                    v2Var5 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var13 = null;
                                    i2Var = null;
                                    s2Var7 = null;
                                    r2Var = null;
                                    q2Var10 = null;
                                    q2Var = null;
                                    q2Var11 = null;
                                    j2Var = null;
                                    h2Var16 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var8 = null;
                                    g2Var = null;
                                    k2Var12 = null;
                                    k2Var11 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    p2Var3 = null;
                                    n1Var24 = m1Var4;
                                    inflate = inflate5;
                                    n1Var27 = null;
                                    n1Var17 = n1Var27;
                                    n1Var21 = x1Var22;
                                    n1Var14 = n1Var26;
                                    n1Var22 = d2Var5;
                                    n1Var15 = h2Var11;
                                    n1Var16 = n1Var27;
                                    n1Var3 = obj62;
                                    n1Var18 = r1Var5;
                                    h2Var9 = h2Var15;
                                    v2Var4 = v2Var5;
                                    s2Var5 = h2Var13;
                                    i2Var2 = s2Var7;
                                    q2Var6 = q2Var10;
                                    q2Var7 = q2Var11;
                                    h2Var10 = h2Var16;
                                    o1Var6 = o1Var8;
                                    k2Var8 = k2Var12;
                                    k2Var9 = k2Var11;
                                    n1Var19 = p2Var3;
                                    n1Var20 = n1Var24;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 14:
                                    ?? q1Var2 = new q1();
                                    View inflate6 = this.f45092b.inflate(R.layout.papamain_broadcast_sptop_layout, (ViewGroup) null);
                                    try {
                                        ((q1) q1Var2).f45371a = (FrameLayout) inflate6.findViewById(R.id.videoContner);
                                        ((q1) q1Var2).f45372b = (SimpleDraweeView) inflate6.findViewById(R.id.bannerView);
                                        q1Var2.f45373c = (SimpleDraweeView) inflate6.findViewById(R.id.gameIcon);
                                        q1Var2.f45374d = (TextView) inflate6.findViewById(R.id.appname);
                                        q1Var2.f45375e = (TextView) inflate6.findViewById(R.id.describe);
                                        q1Var2.f45376f = (RelativeLayout) inflate6.findViewById(R.id.rLayoutRight);
                                        q1Var2.f45377g = (TextView) inflate6.findViewById(R.id.itemInstall);
                                        q1Var2.f45378h = (RelativeLayout) inflate6.findViewById(R.id.bannerLayout);
                                        inflate6.setTag(q1Var2);
                                        n1Var21 = null;
                                        n1Var22 = null;
                                        n1Var15 = null;
                                        n1Var17 = null;
                                        n1Var3 = null;
                                        n1Var18 = null;
                                        z1Var = null;
                                        h2Var9 = null;
                                        v2Var4 = null;
                                        p1Var2 = null;
                                        p1Var3 = null;
                                        s2Var5 = null;
                                        i2Var = null;
                                        i2Var2 = null;
                                        r2Var = null;
                                        q2Var6 = null;
                                        q2Var = null;
                                        q2Var7 = null;
                                        j2Var = null;
                                        h2Var10 = null;
                                        o1Var2 = null;
                                        o1Var3 = null;
                                        o1Var6 = null;
                                        g2Var = null;
                                        k2Var8 = null;
                                        n1Var9 = null;
                                        n1Var10 = null;
                                        n1Var19 = null;
                                        n1Var20 = null;
                                        k2Var9 = q1Var2;
                                        inflate = inflate6;
                                        n1Var14 = null;
                                        n1Var16 = null;
                                        v2Var = v2Var4;
                                        p1Var = p1Var2;
                                        k2Var2 = p1Var3;
                                        m2Var = s2Var5;
                                        i2Var3 = i2Var;
                                        h2Var = o1Var2;
                                        u1Var = o1Var3;
                                        q1Var = k2Var9;
                                        n1Var4 = n1Var9;
                                        n1Var5 = n1Var10;
                                        p2Var = n1Var19;
                                        m1Var = n1Var20;
                                        n1 n1Var2822222222222222 = n1Var17;
                                        view4 = inflate;
                                        obj = n1Var2822222222222222;
                                        x1Var2 = n1Var21;
                                        view5 = n1Var14;
                                        d2Var = n1Var22;
                                        n1Var = n1Var15;
                                        n1Var2 = n1Var16;
                                        r1Var = n1Var18;
                                        r17 = h2Var9;
                                        s2Var = i2Var2;
                                        view2 = q2Var6;
                                        r27 = q2Var7;
                                        r29 = h2Var10;
                                        o1Var = o1Var6;
                                        k2Var = k2Var8;
                                        break;
                                    } catch (Exception e6) {
                                        exc = e6;
                                        view3 = inflate6;
                                        exc.printStackTrace();
                                        return view3;
                                    }
                                case 15:
                                    ?? m2Var3 = new m2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_live_layout, (ViewGroup) null);
                                    m2Var3.f45293d = (LinearLayout) inflate.findViewById(R.id.goLive);
                                    m2Var3.f45290a = (SimpleDraweeView) inflate.findViewById(R.id.picImage);
                                    m2Var3.f45291b = (TextView) inflate.findViewById(R.id.subtitle);
                                    m2Var3.f45294e = (LinearLayout) inflate.findViewById(R.id.tvLiveListLayout);
                                    m2Var3.f45292c = (TextView) inflate.findViewById(R.id.title);
                                    inflate.setTag(m2Var3);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    p1Var3 = m2Var3;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 16:
                                    ?? b2Var = new b2();
                                    inflate2 = this.f45092b.inflate(R.layout.papamain_mode_five, (ViewGroup) null);
                                    ((b2) b2Var).f45126a = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastTopImage1);
                                    ((b2) b2Var).f45127b = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastTopImage2);
                                    ((b2) b2Var).f45128c = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastTopImage3);
                                    b2Var.f45129d = (SimpleDraweeView) inflate2.findViewById(R.id.gameIcon);
                                    b2Var.f45130e = (TextView) inflate2.findViewById(R.id.appname);
                                    b2Var.f45131f = (TextView) inflate2.findViewById(R.id.appSize);
                                    b2Var.f45132g = (RelativeLayout) inflate2.findViewById(R.id.rLayoutRight);
                                    b2Var.f45133h = (RelativeLayout) inflate2.findViewById(R.id.gameLayout);
                                    b2Var.f45134i = (TextView) inflate2.findViewById(R.id.itemInstall);
                                    b2Var.f45135j = (LinearLayout) inflate2.findViewById(R.id.tipsLayout);
                                    inflate2.setTag(b2Var);
                                    x1Var21 = null;
                                    n1Var23 = null;
                                    d2Var4 = null;
                                    h2Var11 = null;
                                    obj62 = null;
                                    r1Var4 = null;
                                    z1Var = null;
                                    h2Var12 = null;
                                    v2Var5 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var13 = null;
                                    i2Var = null;
                                    s2Var6 = null;
                                    r2Var = null;
                                    q2Var8 = null;
                                    q2Var = null;
                                    q2Var9 = null;
                                    j2Var = null;
                                    h2Var14 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var7 = null;
                                    g2Var = null;
                                    k2Var10 = null;
                                    k2Var11 = null;
                                    n1Var10 = null;
                                    p2Var3 = null;
                                    n1Var24 = null;
                                    n1Var9 = b2Var;
                                    inflate = inflate2;
                                    n1Var27 = n1Var24;
                                    x1Var22 = x1Var21;
                                    n1Var26 = n1Var23;
                                    d2Var5 = d2Var4;
                                    r1Var5 = r1Var4;
                                    h2Var15 = h2Var12;
                                    s2Var7 = s2Var6;
                                    q2Var10 = q2Var8;
                                    q2Var11 = q2Var9;
                                    h2Var16 = h2Var14;
                                    o1Var8 = o1Var7;
                                    k2Var12 = k2Var10;
                                    n1Var17 = n1Var27;
                                    n1Var21 = x1Var22;
                                    n1Var14 = n1Var26;
                                    n1Var22 = d2Var5;
                                    n1Var15 = h2Var11;
                                    n1Var16 = n1Var27;
                                    n1Var3 = obj62;
                                    n1Var18 = r1Var5;
                                    h2Var9 = h2Var15;
                                    v2Var4 = v2Var5;
                                    s2Var5 = h2Var13;
                                    i2Var2 = s2Var7;
                                    q2Var6 = q2Var10;
                                    q2Var7 = q2Var11;
                                    h2Var10 = h2Var16;
                                    o1Var6 = o1Var8;
                                    k2Var8 = k2Var12;
                                    k2Var9 = k2Var11;
                                    n1Var19 = p2Var3;
                                    n1Var20 = n1Var24;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 17:
                                case 21:
                                default:
                                    inflate = view;
                                    h2Var17 = null;
                                    n1Var25 = null;
                                    n1 n1Var292 = n1Var25;
                                    n1 n1Var302 = n1Var292;
                                    n1 n1Var312 = n1Var302;
                                    n1 n1Var322 = n1Var312;
                                    n1 n1Var332 = n1Var322;
                                    n1 n1Var342 = n1Var332;
                                    z1Var = n1Var342;
                                    i2 i2Var42 = z1Var;
                                    v2 v2Var72 = i2Var42;
                                    p1Var2 = v2Var72;
                                    p1Var3 = p1Var2;
                                    s2 s2Var92 = p1Var3;
                                    i2Var = s2Var92;
                                    i2 i2Var52 = i2Var;
                                    r2Var = i2Var52;
                                    q2 q2Var132 = r2Var;
                                    q2Var = q2Var132;
                                    q2 q2Var142 = q2Var;
                                    j2Var = q2Var142;
                                    o1 o1Var92 = j2Var;
                                    o1Var2 = o1Var92;
                                    o1Var3 = o1Var2;
                                    o1 o1Var102 = o1Var3;
                                    g2Var = o1Var102;
                                    n1 n1Var352 = g2Var;
                                    k2 k2Var132 = n1Var352;
                                    n1Var9 = k2Var132;
                                    n1Var10 = n1Var9;
                                    n1 n1Var362 = n1Var10;
                                    n1Var20 = n1Var362;
                                    n1Var21 = h2Var17;
                                    n1Var14 = n1Var25;
                                    n1Var22 = n1Var292;
                                    n1Var15 = n1Var302;
                                    n1Var16 = n1Var312;
                                    n1Var17 = n1Var322;
                                    n1Var3 = n1Var332;
                                    n1Var18 = n1Var342;
                                    h2Var9 = i2Var42;
                                    v2Var4 = v2Var72;
                                    s2Var5 = s2Var92;
                                    i2Var2 = i2Var52;
                                    q2Var6 = q2Var132;
                                    q2Var7 = q2Var142;
                                    h2Var10 = o1Var92;
                                    o1Var6 = o1Var102;
                                    k2Var8 = n1Var352;
                                    k2Var9 = k2Var132;
                                    n1Var19 = n1Var362;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 18:
                                    c2 c2Var2 = new c2();
                                    inflate2 = this.f45092b.inflate(R.layout.papamain_mode_seven, (ViewGroup) null);
                                    c2Var2.f45143a = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastTopImage1);
                                    c2Var2.f45144b = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastTopImage2);
                                    c2Var2.f45145c = (SimpleDraweeView) inflate2.findViewById(R.id.gamebroadcastTopImage3);
                                    c2Var2.f45146d = (SimpleDraweeView) inflate2.findViewById(R.id.gameIcon);
                                    c2Var2.f45147e = (TextView) inflate2.findViewById(R.id.appname);
                                    c2Var2.f45148f = (TextView) inflate2.findViewById(R.id.appSize);
                                    c2Var2.f45149g = (RelativeLayout) inflate2.findViewById(R.id.rLayoutRight);
                                    c2Var2.f45150h = (LinearLayout) inflate2.findViewById(R.id.gameLayout);
                                    c2Var2.f45151i = (TextView) inflate2.findViewById(R.id.itemInstall);
                                    c2Var2.f45152j = (TextView) inflate2.findViewById(R.id.appdescribe);
                                    c2Var2.f45146d = (SimpleDraweeView) inflate2.findViewById(R.id.gameIcon);
                                    c2Var2.f45154l = (TextView) inflate2.findViewById(R.id.appname2);
                                    c2Var2.f45155m = (TextView) inflate2.findViewById(R.id.appSize2);
                                    c2Var2.f45156n = (RelativeLayout) inflate2.findViewById(R.id.rLayoutRight2);
                                    c2Var2.f45157o = (LinearLayout) inflate2.findViewById(R.id.gameLayout2);
                                    c2Var2.f45158p = (TextView) inflate2.findViewById(R.id.itemInstall2);
                                    c2Var2.f45159q = (TextView) inflate2.findViewById(R.id.appdescribe2);
                                    c2Var2.f45153k = (SimpleDraweeView) inflate2.findViewById(R.id.gameIcon2);
                                    c2Var2.f45161s = (TextView) inflate2.findViewById(R.id.appname3);
                                    c2Var2.f45162t = (TextView) inflate2.findViewById(R.id.appSize3);
                                    c2Var2.f45163u = (RelativeLayout) inflate2.findViewById(R.id.rLayoutRight3);
                                    c2Var2.f45164v = (LinearLayout) inflate2.findViewById(R.id.gameLayout3);
                                    c2Var2.f45165w = (TextView) inflate2.findViewById(R.id.itemInstall3);
                                    c2Var2.f45166x = (TextView) inflate2.findViewById(R.id.appdescribe3);
                                    c2Var2.f45160r = (SimpleDraweeView) inflate2.findViewById(R.id.gameIcon3);
                                    c2Var2.f45167y = (TextView) inflate2.findViewById(R.id.moneyText1);
                                    c2Var2.f45168z = (TextView) inflate2.findViewById(R.id.moneyText2);
                                    c2Var2.A = (TextView) inflate2.findViewById(R.id.moneyText3);
                                    inflate2.setTag(c2Var2);
                                    x1Var21 = null;
                                    n1Var23 = null;
                                    d2Var4 = null;
                                    h2Var11 = null;
                                    obj62 = null;
                                    r1Var4 = null;
                                    z1Var = null;
                                    h2Var12 = null;
                                    v2Var5 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var13 = null;
                                    i2Var = null;
                                    s2Var6 = null;
                                    r2Var = null;
                                    q2Var8 = null;
                                    q2Var = null;
                                    q2Var9 = null;
                                    j2Var = null;
                                    h2Var14 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var7 = null;
                                    g2Var = null;
                                    k2Var10 = null;
                                    k2Var11 = null;
                                    n1Var9 = null;
                                    p2Var3 = null;
                                    n1Var24 = null;
                                    n1Var10 = c2Var2;
                                    inflate = inflate2;
                                    n1Var27 = n1Var24;
                                    x1Var22 = x1Var21;
                                    n1Var26 = n1Var23;
                                    d2Var5 = d2Var4;
                                    r1Var5 = r1Var4;
                                    h2Var15 = h2Var12;
                                    s2Var7 = s2Var6;
                                    q2Var10 = q2Var8;
                                    q2Var11 = q2Var9;
                                    h2Var16 = h2Var14;
                                    o1Var8 = o1Var7;
                                    k2Var12 = k2Var10;
                                    n1Var17 = n1Var27;
                                    n1Var21 = x1Var22;
                                    n1Var14 = n1Var26;
                                    n1Var22 = d2Var5;
                                    n1Var15 = h2Var11;
                                    n1Var16 = n1Var27;
                                    n1Var3 = obj62;
                                    n1Var18 = r1Var5;
                                    h2Var9 = h2Var15;
                                    v2Var4 = v2Var5;
                                    s2Var5 = h2Var13;
                                    i2Var2 = s2Var7;
                                    q2Var6 = q2Var10;
                                    q2Var7 = q2Var11;
                                    h2Var10 = h2Var16;
                                    o1Var6 = o1Var8;
                                    k2Var8 = k2Var12;
                                    k2Var9 = k2Var11;
                                    n1Var19 = p2Var3;
                                    n1Var20 = n1Var24;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 19:
                                    d2 d2Var6 = new d2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_modle_item_title, (ViewGroup) null);
                                    d2Var6.f45177a = (TextView) inflate.findViewById(R.id.title);
                                    d2Var6.f45178b = (TextView) inflate.findViewById(R.id.subtitle);
                                    d2Var6.f45179c = (LinearLayout) inflate.findViewById(R.id.look_other);
                                    inflate.setTag(d2Var6);
                                    n1Var6 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    d2Var2 = d2Var6;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 20:
                                    ?? e2Var = new e2();
                                    inflate = this.f45092b.inflate(R.layout.cube_roate_view_layout, (ViewGroup) null);
                                    ((e2) e2Var).f45187a = (CubeRotateView) inflate.findViewById(R.id.cubeView);
                                    ((e2) e2Var).f45188b = (SimpleDraweeView) inflate.findViewById(R.id.background);
                                    ((e2) e2Var).f45189c = (SimpleDraweeView) inflate.findViewById(R.id.foreground);
                                    ((e2) e2Var).f45190d = (TextView) inflate.findViewById(R.id.date);
                                    inflate.setTag(e2Var);
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    n1Var6 = e2Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 22:
                                    j2 j2Var2 = new j2();
                                    inflate = this.f45092b.inflate(R.layout.wufun_main_recom_item_layout, (ViewGroup) null);
                                    j2Var2.f45252a = (SimpleDraweeView) inflate.findViewById(R.id.leftImage);
                                    j2Var2.f45253b = (SimpleDraweeView) inflate.findViewById(R.id.rightImage);
                                    inflate.setTag(j2Var2);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    j2Var = j2Var2;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 23:
                                    ?? v1Var = new v1();
                                    inflate = this.f45092b.inflate(R.layout.wufun_main_games_item_layout, (ViewGroup) null);
                                    ((v1) v1Var).f45480a = (SimpleDraweeView) inflate.findViewById(R.id.appIcon1);
                                    ((v1) v1Var).f45481b = (SimpleDraweeView) inflate.findViewById(R.id.appIcon2);
                                    ((v1) v1Var).f45482c = (SimpleDraweeView) inflate.findViewById(R.id.appIcon3);
                                    ((v1) v1Var).f45483d = (SimpleDraweeView) inflate.findViewById(R.id.appIcon4);
                                    ((v1) v1Var).f45484e = (TextView) inflate.findViewById(R.id.appname1);
                                    ((v1) v1Var).f45485f = (TextView) inflate.findViewById(R.id.appname2);
                                    ((v1) v1Var).f45486g = (TextView) inflate.findViewById(R.id.appname3);
                                    ((v1) v1Var).f45487h = (TextView) inflate.findViewById(R.id.appname4);
                                    inflate.setTag(v1Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    n1Var8 = v1Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 24:
                                    g2 g2Var4 = new g2();
                                    inflate = this.f45092b.inflate(R.layout.home_rank_layout, (ViewGroup) null);
                                    g2Var4.f45210a = (SlidingTabLayout6) inflate.findViewById(R.id.tabLayout);
                                    g2Var4.f45211b = (ViewPager) inflate.findViewById(R.id.viewPager);
                                    g2Var4.f45212c = (TextView) inflate.findViewById(R.id.moreLayout);
                                    inflate.setTag(g2Var4);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    g2Var = g2Var4;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 25:
                                    View inflate7 = this.f45092b.inflate(R.layout.choice_gamelist_layout, (ViewGroup) null);
                                    k2 k2Var14 = new k2();
                                    k2Var14.f45264a = (RecyclerView) inflate7.findViewById(R.id.recycleView);
                                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f45093c);
                                    linearLayoutManager.setOrientation(0);
                                    k2Var14.f45264a.setLayoutManager(linearLayoutManager);
                                    inflate7.setTag(k2Var14);
                                    n1Var12 = null;
                                    d2Var3 = null;
                                    h2Var3 = null;
                                    n1Var13 = null;
                                    n1Var8 = null;
                                    a2Var2 = null;
                                    r1Var3 = null;
                                    z1Var = null;
                                    h2Var7 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var4 = null;
                                    r2Var = null;
                                    q2Var4 = null;
                                    q2Var = null;
                                    q2Var5 = null;
                                    j2Var = null;
                                    h2Var8 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var5 = null;
                                    g2Var = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    k2Var7 = k2Var14;
                                    r5 = inflate7;
                                    inflate = r5;
                                    n1Var6 = n1Var12;
                                    d2Var2 = d2Var3;
                                    n1Var7 = n1Var13;
                                    a2Var = a2Var2;
                                    r1Var2 = r1Var3;
                                    h2Var4 = h2Var7;
                                    s2Var3 = s2Var4;
                                    q2Var2 = q2Var4;
                                    q2Var3 = q2Var5;
                                    h2Var6 = h2Var8;
                                    o1Var4 = o1Var5;
                                    k2Var5 = k2Var7;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 26:
                                    ?? t2Var = new t2();
                                    inflate = this.f45092b.inflate(R.layout.mgpapa_localfight_include_v2, (ViewGroup) null);
                                    ((t2) t2Var).f45434a = inflate.findViewById(R.id.gradientView);
                                    ((t2) t2Var).f45435b = (RelativeLayout) inflate.findViewById(R.id.rlDailyDiscovery);
                                    ((t2) t2Var).f45436c = (TextView) inflate.findViewById(R.id.fight_appname);
                                    ((t2) t2Var).f45437d = (SimpleDraweeView) inflate.findViewById(R.id.fightapp_image);
                                    ((t2) t2Var).f45438e = (RelativeLayout) inflate.findViewById(R.id.rlDzg);
                                    ((t2) t2Var).f45439f = (TextView) inflate.findViewById(R.id.tvDzg);
                                    ((t2) t2Var).f45440g = (TextView) inflate.findViewById(R.id.tvDzgSub);
                                    ((t2) t2Var).f45441h = (SimpleDraweeView) inflate.findViewById(R.id.ivDzg);
                                    ((t2) t2Var).f45442i = (RelativeLayout) inflate.findViewById(R.id.rlDailyNew);
                                    ((t2) t2Var).f45443j = (TextView) inflate.findViewById(R.id.tvDialyNew);
                                    ((t2) t2Var).f45444k = (TextView) inflate.findViewById(R.id.tvDailyNewCount);
                                    ((t2) t2Var).f45445l = (LinearLayout) inflate.findViewById(R.id.llDailyNewIcon);
                                    inflate.setTag(t2Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    q2Var2 = t2Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 27:
                                    r1 r1Var6 = new r1();
                                    inflate = this.f45092b.inflate(R.layout.mgpapa_fast_entry_item, (ViewGroup) null);
                                    r1Var6.f45395a = (RecyclerView) inflate.findViewById(R.id.rvFastEntry);
                                    inflate.setTag(r1Var6);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    r1Var2 = r1Var6;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 28:
                                case 34:
                                case 37:
                                case 38:
                                    ?? s1Var = new s1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_gamelist_grid_layout, (ViewGroup) null);
                                    s1Var.f45402a = (ConstraintLayout) inflate.findViewById(R.id.item1);
                                    s1Var.f45403b = (SimpleDraweeView) inflate.findViewById(R.id.ivGamePic);
                                    s1Var.f45404c = (TextView) inflate.findViewById(R.id.tvGameName);
                                    s1Var.f45405d = (LinearLayout) inflate.findViewById(R.id.llInfo);
                                    s1Var.f45406e = (TextView) inflate.findViewById(R.id.appSize);
                                    s1Var.f45407f = (TextView) inflate.findViewById(R.id.loding_info);
                                    s1Var.f45408g = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
                                    s1Var.f45409h = (ProgressBar) inflate.findViewById(R.id.progressBar);
                                    s1Var.f45410i = (TextView) inflate.findViewById(R.id.tvGameTags);
                                    s1Var.f45411j = (FrameLayout) inflate.findViewById(R.id.flBtn);
                                    s1Var.f45412k = (TextView) inflate.findViewById(R.id.tvBtn);
                                    s1Var.f45413l = (ProgressBar) inflate.findViewById(R.id.loading_progress);
                                    inflate.setTag(s1Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    h2Var5 = s1Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 29:
                                case 36:
                                    p1 p1Var4 = new p1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_video_game, (ViewGroup) null);
                                    p1Var4.f45340a = (ConstraintLayout) inflate.findViewById(R.id.root);
                                    p1Var4.f45341b = (SimpleDraweeView) inflate.findViewById(R.id.ivGameIcon);
                                    p1Var4.f45342c = (TextView) inflate.findViewById(R.id.tvGameName);
                                    p1Var4.f45343d = (LinearLayout) inflate.findViewById(R.id.llInfo);
                                    p1Var4.f45344e = (TextView) inflate.findViewById(R.id.appSize);
                                    p1Var4.f45345f = (TextView) inflate.findViewById(R.id.loding_info);
                                    p1Var4.f45346g = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
                                    p1Var4.f45347h = (ProgressBar) inflate.findViewById(R.id.progressBar);
                                    p1Var4.f45348i = (TextView) inflate.findViewById(R.id.tvGameTags);
                                    p1Var4.f45349j = (FrameLayout) inflate.findViewById(R.id.flBtn);
                                    p1Var4.f45350k = (TextView) inflate.findViewById(R.id.tvBtn);
                                    p1Var4.f45351l = (SimpleDraweeView) inflate.findViewById(R.id.bannerView);
                                    p1Var4.f45352m = (FrameLayout) inflate.findViewById(R.id.videoContner);
                                    p1Var4.f45353n = (ProgressBar) inflate.findViewById(R.id.loading_progress);
                                    inflate.setTag(p1Var4);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    p1Var2 = p1Var4;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 30:
                                    ?? u1Var2 = new u1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_item_game_news, (ViewGroup) null);
                                    ((u1) u1Var2).f45453b = (HorizontalRecyclerView) inflate.findViewById(R.id.recyclerView);
                                    ((u1) u1Var2).f45452a = (FrameLayout) inflate.findViewById(R.id.flRoot);
                                    inflate.setTag(u1Var2);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    o1Var3 = u1Var2;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 31:
                                    z1 z1Var2 = new z1();
                                    inflate = this.f45092b.inflate(R.layout.papamain_item_title_layout_v2, (ViewGroup) null);
                                    z1Var2.f45531a = (TextView) inflate.findViewById(R.id.tvTitle);
                                    z1Var2.f45532b = (TextView) inflate.findViewById(R.id.tvSubTitle);
                                    inflate.setTag(z1Var2);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    z1Var = z1Var2;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 32:
                                    ?? f2Var = new f2();
                                    inflate = this.f45092b.inflate(R.layout.home_rank_layout_v2, (ViewGroup) null);
                                    ((f2) f2Var).f45198a = (ConstraintLayout) inflate.findViewById(R.id.root);
                                    ((f2) f2Var).f45199b = (SlidingTabLayout6) inflate.findViewById(R.id.tabLayout);
                                    ((f2) f2Var).f45200c = (ViewPager) inflate.findViewById(R.id.viewPager);
                                    ((f2) f2Var).f45201d = (LinearLayout) inflate.findViewById(R.id.moreLayout);
                                    inflate.setTag(f2Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    h2Var6 = f2Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 33:
                                    ?? l2Var = new l2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_item_spacing_layout, (ViewGroup) null);
                                    ((l2) l2Var).f45272a = inflate.findViewById(R.id.spacingView);
                                    inflate.setTag(l2Var);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    i2Var = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    h2Var4 = l2Var;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var2822222222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var2822222222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 35:
                                    i2 i2Var6 = new i2();
                                    inflate = this.f45092b.inflate(R.layout.papamain_item_recommend_style2, (ViewGroup) null);
                                    i2Var6.f45244a = (RecyclerView) inflate.findViewById(R.id.recyclerView);
                                    inflate.setTag(i2Var6);
                                    n1Var6 = null;
                                    d2Var2 = null;
                                    h2Var3 = null;
                                    n1Var7 = null;
                                    n1Var8 = null;
                                    a2Var = null;
                                    r1Var2 = null;
                                    z1Var = null;
                                    h2Var4 = null;
                                    v2Var3 = null;
                                    p1Var2 = null;
                                    p1Var3 = null;
                                    h2Var5 = null;
                                    s2Var3 = null;
                                    r2Var = null;
                                    q2Var2 = null;
                                    q2Var = null;
                                    q2Var3 = null;
                                    j2Var = null;
                                    h2Var6 = null;
                                    o1Var2 = null;
                                    o1Var3 = null;
                                    o1Var4 = null;
                                    g2Var = null;
                                    k2Var5 = null;
                                    k2Var6 = null;
                                    n1Var9 = null;
                                    n1Var10 = null;
                                    obj61 = null;
                                    n1Var11 = null;
                                    i2Var = i2Var6;
                                    n1Var21 = n1Var11;
                                    n1Var14 = n1Var6;
                                    n1Var22 = d2Var2;
                                    n1Var15 = h2Var3;
                                    n1Var16 = n1Var7;
                                    n1Var17 = n1Var8;
                                    n1Var3 = a2Var;
                                    n1Var18 = r1Var2;
                                    h2Var9 = h2Var4;
                                    v2Var4 = v2Var3;
                                    s2Var5 = h2Var5;
                                    i2Var2 = s2Var3;
                                    q2Var6 = q2Var2;
                                    q2Var7 = q2Var3;
                                    h2Var10 = h2Var6;
                                    o1Var6 = o1Var4;
                                    k2Var8 = k2Var5;
                                    k2Var9 = k2Var6;
                                    n1Var19 = obj61;
                                    n1Var20 = n1Var11;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var28222222222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var28222222222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                                case 39:
                                    n2 n2Var = new n2();
                                    inflate = this.f45092b.inflate(R.layout.mgpapa_home_underline, (ViewGroup) null);
                                    n2Var.f45306a = inflate.findViewById(R.id.line);
                                    inflate.setTag(n2Var);
                                    h2Var17 = null;
                                    n1Var25 = null;
                                    n1 n1Var2922 = n1Var25;
                                    n1 n1Var3022 = n1Var2922;
                                    n1 n1Var3122 = n1Var3022;
                                    n1 n1Var3222 = n1Var3122;
                                    n1 n1Var3322 = n1Var3222;
                                    n1 n1Var3422 = n1Var3322;
                                    z1Var = n1Var3422;
                                    i2 i2Var422 = z1Var;
                                    v2 v2Var722 = i2Var422;
                                    p1Var2 = v2Var722;
                                    p1Var3 = p1Var2;
                                    s2 s2Var922 = p1Var3;
                                    i2Var = s2Var922;
                                    i2 i2Var522 = i2Var;
                                    r2Var = i2Var522;
                                    q2 q2Var1322 = r2Var;
                                    q2Var = q2Var1322;
                                    q2 q2Var1422 = q2Var;
                                    j2Var = q2Var1422;
                                    o1 o1Var922 = j2Var;
                                    o1Var2 = o1Var922;
                                    o1Var3 = o1Var2;
                                    o1 o1Var1022 = o1Var3;
                                    g2Var = o1Var1022;
                                    n1 n1Var3522 = g2Var;
                                    k2 k2Var1322 = n1Var3522;
                                    n1Var9 = k2Var1322;
                                    n1Var10 = n1Var9;
                                    n1 n1Var3622 = n1Var10;
                                    n1Var20 = n1Var3622;
                                    n1Var21 = h2Var17;
                                    n1Var14 = n1Var25;
                                    n1Var22 = n1Var2922;
                                    n1Var15 = n1Var3022;
                                    n1Var16 = n1Var3122;
                                    n1Var17 = n1Var3222;
                                    n1Var3 = n1Var3322;
                                    n1Var18 = n1Var3422;
                                    h2Var9 = i2Var422;
                                    v2Var4 = v2Var722;
                                    s2Var5 = s2Var922;
                                    i2Var2 = i2Var522;
                                    q2Var6 = q2Var1322;
                                    q2Var7 = q2Var1422;
                                    h2Var10 = o1Var922;
                                    o1Var6 = o1Var1022;
                                    k2Var8 = n1Var3522;
                                    k2Var9 = k2Var1322;
                                    n1Var19 = n1Var3622;
                                    v2Var = v2Var4;
                                    p1Var = p1Var2;
                                    k2Var2 = p1Var3;
                                    m2Var = s2Var5;
                                    i2Var3 = i2Var;
                                    h2Var = o1Var2;
                                    u1Var = o1Var3;
                                    q1Var = k2Var9;
                                    n1Var4 = n1Var9;
                                    n1Var5 = n1Var10;
                                    p2Var = n1Var19;
                                    m1Var = n1Var20;
                                    n1 n1Var282222222222222222222222222222222222 = n1Var17;
                                    view4 = inflate;
                                    obj = n1Var282222222222222222222222222222222222;
                                    x1Var2 = n1Var21;
                                    view5 = n1Var14;
                                    d2Var = n1Var22;
                                    n1Var = n1Var15;
                                    n1Var2 = n1Var16;
                                    r1Var = n1Var18;
                                    r17 = h2Var9;
                                    s2Var = i2Var2;
                                    view2 = q2Var6;
                                    r27 = q2Var7;
                                    r29 = h2Var10;
                                    o1Var = o1Var6;
                                    k2Var = k2Var8;
                                    break;
                            }
                        } catch (Exception e7) {
                            exc = e7;
                            view3 = R.id.rLayoutRight;
                        }
                    } catch (Exception e8) {
                        exc = e8;
                        view3 = r5;
                    }
                } else {
                    switch (itemViewType) {
                        case 0:
                            view4 = view;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = null;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            v2Var = (v2) view.getTag();
                            break;
                        case 1:
                            f45081p1 = (u2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var = null;
                            obj = null;
                            Object obj63 = obj;
                            obj22 = obj63;
                            x1Var12 = x1Var;
                            obj36 = obj63;
                            obj23 = obj22;
                            x1Var11 = x1Var12;
                            obj35 = obj36;
                            obj3 = obj22;
                            obj25 = obj23;
                            x1Var7 = x1Var11;
                            obj24 = obj35;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var5 = p2Var;
                            s2Var2 = p2Var5;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var5;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4 = k2Var4;
                            h2Var = m2Var4;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4;
                            break;
                        case 2:
                            n1Var3 = (a2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var3 = null;
                            obj = null;
                            obj2 = null;
                            obj3 = null;
                            obj4 = null;
                            obj5 = null;
                            obj6 = null;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var52 = p2Var;
                            s2Var2 = p2Var52;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var52;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42 = k2Var4;
                            h2Var = m2Var42;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42;
                            break;
                        case 3:
                            h2 h2Var19 = (h2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            h2Var = h2Var19;
                            break;
                        case 4:
                            s2Var2 = (s2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var4 = null;
                            obj = null;
                            obj7 = null;
                            obj8 = null;
                            obj9 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            r2Var = null;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422 = k2Var4;
                            h2Var = m2Var422;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422;
                            break;
                        case 5:
                            r2Var = (r2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var5 = null;
                            obj = null;
                            obj15 = null;
                            obj8 = null;
                            obj16 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            obj17 = null;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4222 = k2Var4;
                            h2Var = m2Var4222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222;
                            break;
                        case 6:
                            q2Var = (q2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var6 = null;
                            obj = null;
                            obj18 = null;
                            obj8 = null;
                            obj19 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj20 = null;
                            obj21 = null;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42222 = k2Var4;
                            h2Var = m2Var42222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42222;
                            break;
                        case 7:
                            p2 p2Var6 = (p2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            p2Var = p2Var6;
                            break;
                        case 8:
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            obj = null;
                            x1Var = (x1) view.getTag();
                            Object obj632 = obj;
                            obj22 = obj632;
                            x1Var12 = x1Var;
                            obj36 = obj632;
                            obj23 = obj22;
                            x1Var11 = x1Var12;
                            obj35 = obj36;
                            obj3 = obj22;
                            obj25 = obj23;
                            x1Var7 = x1Var11;
                            obj24 = obj35;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var522 = p2Var;
                            s2Var2 = p2Var522;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var522;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422222 = k2Var4;
                            h2Var = m2Var422222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422222;
                            break;
                        case 9:
                            obj23 = (w1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var7 = null;
                            obj = null;
                            obj24 = null;
                            obj3 = null;
                            obj25 = null;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var5222 = p2Var;
                            s2Var2 = p2Var5222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var5222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4222222 = k2Var4;
                            h2Var = m2Var4222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222222;
                            break;
                        case 10:
                            Object obj64 = (o2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var8 = null;
                            obj = null;
                            obj26 = null;
                            obj8 = null;
                            obj27 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj28 = null;
                            q2Var = null;
                            j2Var = null;
                            obj32 = obj64;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42222222 = k2Var4;
                            h2Var = m2Var42222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42222222;
                            break;
                        case 11:
                            o1 o1Var12 = (o1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var9 = null;
                            obj = null;
                            obj29 = null;
                            obj8 = null;
                            obj30 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj31 = null;
                            q2Var = null;
                            obj32 = null;
                            j2Var = null;
                            r292 = null;
                            g2Var = null;
                            g2Var2 = o1Var12;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422222222 = k2Var4;
                            h2Var = m2Var422222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422222222;
                            break;
                        case 12:
                            Object obj65 = (n1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var10 = null;
                            obj = null;
                            obj33 = null;
                            obj3 = null;
                            obj34 = null;
                            n1Var3 = null;
                            obj5 = obj65;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var52222 = p2Var;
                            s2Var2 = p2Var52222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var52222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4222222222 = k2Var4;
                            h2Var = m2Var4222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222222222;
                            break;
                        case 13:
                            m1 m1Var5 = (m1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            m1Var = m1Var5;
                            break;
                        case 14:
                            q1 q1Var3 = (q1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            q1Var = q1Var3;
                            break;
                        case 15:
                            m2 m2Var5 = (m2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            k2Var2 = m2Var5;
                            q1Var = null;
                            break;
                        case 16:
                            ?? r36 = (b2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var5 = null;
                            n1Var4 = r36;
                            break;
                        case 17:
                        case 21:
                        default:
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var = null;
                            obj = null;
                            Object obj6322 = obj;
                            obj22 = obj6322;
                            x1Var12 = x1Var;
                            obj36 = obj6322;
                            obj23 = obj22;
                            x1Var11 = x1Var12;
                            obj35 = obj36;
                            obj3 = obj22;
                            obj25 = obj23;
                            x1Var7 = x1Var11;
                            obj24 = obj35;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var522222 = p2Var;
                            s2Var2 = p2Var522222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var522222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42222222222 = k2Var4;
                            h2Var = m2Var42222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42222222222;
                            break;
                        case 18:
                            c2 c2Var3 = (c2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = c2Var3;
                            break;
                        case 19:
                            Object obj66 = (d2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var11 = null;
                            obj = null;
                            obj35 = null;
                            obj23 = null;
                            obj3 = obj66;
                            obj25 = obj23;
                            x1Var7 = x1Var11;
                            obj24 = obj35;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var5222222 = p2Var;
                            s2Var2 = p2Var5222222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var5222222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422222222222 = k2Var4;
                            h2Var = m2Var422222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422222222222;
                            break;
                        case 20:
                            Object obj67 = (e2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var12 = null;
                            obj = null;
                            obj22 = null;
                            obj36 = obj67;
                            obj23 = obj22;
                            x1Var11 = x1Var12;
                            obj35 = obj36;
                            obj3 = obj22;
                            obj25 = obj23;
                            x1Var7 = x1Var11;
                            obj24 = obj35;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var52222222 = p2Var;
                            s2Var2 = p2Var52222222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var52222222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4222222222222 = k2Var4;
                            h2Var = m2Var4222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222222222222;
                            break;
                        case 22:
                            j2Var = (j2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var13 = null;
                            obj = null;
                            obj37 = null;
                            obj8 = null;
                            obj38 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj39 = null;
                            q2Var = null;
                            obj32 = null;
                            r292 = null;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42222222222222 = k2Var4;
                            h2Var = m2Var42222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42222222222222;
                            break;
                        case 23:
                            p1Var = null;
                            x1Var2 = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            obj = (v1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            break;
                        case 24:
                            g2Var = (g2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var14 = null;
                            obj = null;
                            obj40 = null;
                            obj8 = null;
                            obj41 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj42 = null;
                            q2Var = null;
                            obj32 = null;
                            j2Var = null;
                            r292 = null;
                            g2Var2 = null;
                            k2Var3 = null;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422222222222222 = k2Var4;
                            h2Var = m2Var422222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422222222222222;
                            break;
                        case 25:
                            k2Var3 = (k2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var15 = null;
                            obj = null;
                            obj43 = null;
                            obj8 = null;
                            obj44 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj45 = null;
                            q2Var = null;
                            obj32 = null;
                            j2Var = null;
                            r292 = null;
                            g2Var2 = null;
                            g2Var = null;
                            k2Var4 = null;
                            m2 m2Var4222222222222222 = k2Var4;
                            h2Var = m2Var4222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222222222222222;
                            break;
                        case 26:
                            Object obj68 = (t2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var16 = null;
                            obj = null;
                            obj46 = null;
                            obj8 = null;
                            obj47 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            q2Var = null;
                            obj58 = obj68;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42222222222222222 = k2Var4;
                            h2Var = m2Var42222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42222222222222222;
                            break;
                        case 27:
                            obj6 = (r1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var17 = null;
                            obj = null;
                            obj50 = null;
                            obj49 = null;
                            obj4 = null;
                            obj48 = null;
                            n1Var3 = null;
                            z1Var = null;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var522222222 = p2Var;
                            s2Var2 = p2Var522222222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var522222222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422222222222222222 = k2Var4;
                            h2Var = m2Var422222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422222222222222222;
                            break;
                        case 28:
                        case 34:
                        case 37:
                        case 38:
                            ?? r21 = (s1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            m2Var = r21;
                            p2Var = null;
                            break;
                        case 29:
                        case 36:
                            p1 p1Var5 = (p1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            p1Var = p1Var5;
                            u1Var = null;
                            break;
                        case 30:
                            u1 u1Var3 = (u1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            q1Var = null;
                            p2Var = null;
                            m1Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            u1Var = u1Var3;
                            break;
                        case 31:
                            z1Var = (z1) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var18 = null;
                            obj = null;
                            obj53 = null;
                            obj8 = null;
                            obj4 = null;
                            obj52 = null;
                            n1Var3 = null;
                            obj11 = null;
                            obj51 = null;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var5222222222 = p2Var;
                            s2Var2 = p2Var5222222222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var5222222222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4222222222222222222 = k2Var4;
                            h2Var = m2Var4222222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222222222222222222;
                            break;
                        case 32:
                            r292 = (f2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var19 = null;
                            obj = null;
                            obj55 = null;
                            obj8 = null;
                            obj56 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj12 = null;
                            obj13 = null;
                            obj14 = null;
                            p2Var = null;
                            m1Var2 = null;
                            s2Var2 = null;
                            r2Var = null;
                            obj57 = null;
                            q2Var = null;
                            obj32 = null;
                            j2Var = null;
                            g2Var3 = null;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var42222222222222222222 = k2Var4;
                            h2Var = m2Var42222222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var42222222222222222222;
                            break;
                        case 33:
                            Object obj69 = (l2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var20 = null;
                            obj = null;
                            obj60 = null;
                            obj8 = null;
                            obj4 = null;
                            obj10 = null;
                            n1Var3 = null;
                            obj11 = null;
                            z1Var = null;
                            obj54 = null;
                            obj59 = obj69;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var52222222222 = p2Var;
                            s2Var2 = p2Var52222222222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var52222222222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var422222222222222222222 = k2Var4;
                            h2Var = m2Var422222222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var422222222222222222222;
                            break;
                        case 35:
                            i2 i2Var7 = (i2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var2 = null;
                            obj = null;
                            view5 = 0;
                            d2Var = null;
                            n1Var = null;
                            n1Var2 = null;
                            n1Var3 = null;
                            r1Var = null;
                            z1Var = null;
                            r17 = null;
                            u1Var = null;
                            q1Var = null;
                            p2Var = null;
                            s2Var = null;
                            r2Var = null;
                            view2 = 0;
                            q2Var = null;
                            r27 = null;
                            j2Var = null;
                            r29 = null;
                            o1Var = null;
                            g2Var = null;
                            k2Var = null;
                            k2Var2 = null;
                            m2Var = null;
                            h2Var = null;
                            n1Var4 = null;
                            n1Var5 = null;
                            i2Var3 = i2Var7;
                            m1Var = null;
                            break;
                        case 39:
                            n2 n2Var2 = (n2) view.getTag();
                            view4 = view;
                            v2Var = null;
                            p1Var = null;
                            x1Var = null;
                            obj = null;
                            Object obj63222 = obj;
                            obj22 = obj63222;
                            x1Var12 = x1Var;
                            obj36 = obj63222;
                            obj23 = obj22;
                            x1Var11 = x1Var12;
                            obj35 = obj36;
                            obj3 = obj22;
                            obj25 = obj23;
                            x1Var7 = x1Var11;
                            obj24 = obj35;
                            n1Var3 = obj25;
                            x1Var10 = x1Var7;
                            obj33 = obj24;
                            obj34 = obj23;
                            obj5 = obj25;
                            obj6 = n1Var3;
                            x1Var3 = x1Var10;
                            obj2 = obj33;
                            obj4 = obj34;
                            z1Var = obj6;
                            x1Var17 = x1Var3;
                            obj50 = obj2;
                            obj49 = obj3;
                            obj48 = obj5;
                            obj51 = z1Var;
                            x1Var18 = x1Var17;
                            obj53 = obj50;
                            obj8 = obj49;
                            obj52 = obj48;
                            obj11 = obj6;
                            obj54 = obj51;
                            x1Var20 = x1Var18;
                            obj60 = obj53;
                            obj10 = obj52;
                            obj59 = obj51;
                            obj14 = obj54;
                            p2Var = obj14;
                            p2 p2Var522222222222 = p2Var;
                            s2Var2 = p2Var522222222222;
                            r2Var = s2Var2;
                            x1Var4 = x1Var20;
                            obj7 = obj60;
                            obj9 = obj4;
                            obj12 = obj59;
                            obj13 = obj54;
                            m1Var2 = p2Var522222222222;
                            obj17 = r2Var;
                            x1Var5 = x1Var4;
                            obj15 = obj7;
                            obj16 = obj9;
                            q2Var = obj17;
                            x1Var16 = x1Var5;
                            obj46 = obj15;
                            obj47 = obj16;
                            obj58 = obj17;
                            obj21 = q2Var;
                            x1Var6 = x1Var16;
                            obj18 = obj46;
                            obj19 = obj47;
                            obj20 = obj58;
                            j2Var = obj21;
                            x1Var8 = x1Var6;
                            obj26 = obj18;
                            obj27 = obj19;
                            obj28 = obj20;
                            obj32 = obj21;
                            r292 = j2Var;
                            x1Var13 = x1Var8;
                            obj37 = obj26;
                            obj38 = obj27;
                            obj39 = obj28;
                            g2Var3 = r292;
                            x1Var19 = x1Var13;
                            obj55 = obj37;
                            obj56 = obj38;
                            obj57 = obj39;
                            g2Var = g2Var3;
                            x1Var9 = x1Var19;
                            obj29 = obj55;
                            obj30 = obj56;
                            obj31 = obj57;
                            g2Var2 = g2Var3;
                            k2Var3 = g2Var;
                            x1Var14 = x1Var9;
                            obj40 = obj29;
                            obj41 = obj30;
                            obj42 = obj31;
                            k2Var4 = k2Var3;
                            x1Var15 = x1Var14;
                            obj43 = obj40;
                            obj44 = obj41;
                            obj45 = obj42;
                            m2 m2Var4222222222222222222222 = k2Var4;
                            h2Var = m2Var4222222222222222222222;
                            n1Var4 = h2Var;
                            n1Var5 = n1Var4;
                            x1Var2 = x1Var15;
                            view5 = obj43;
                            d2Var = obj8;
                            n1Var = obj44;
                            n1Var2 = obj10;
                            r1Var = obj11;
                            r17 = obj12;
                            u1Var = obj13;
                            q1Var = obj14;
                            m1Var = m1Var2;
                            s2Var = s2Var2;
                            view2 = obj45;
                            r27 = obj32;
                            r29 = r292;
                            o1Var = g2Var2;
                            k2Var = k2Var3;
                            k2Var2 = k2Var4;
                            m2Var = m2Var4222222222222222222222;
                            break;
                    }
                }
                try {
                    MgpapaMainItemBean mgpapaMainItemBean = this.f45095e.get(i4);
                    a2 a2Var4 = n1Var3;
                    n1 n1Var38 = n1Var2;
                    w1 w1Var2 = n1Var;
                    try {
                        try {
                            switch (itemViewType) {
                                case 0:
                                    view5 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans = mgpapaMainItemBean.getRecomDatabeans();
                                    if (recomDatabeans == null || recomDatabeans.size() <= 0) {
                                        v2Var.f45489a.setVisibility(8);
                                        break;
                                    } else {
                                        int i7 = 0;
                                        while (i7 < recomDatabeans.size()) {
                                            RecomDatabeanBusiness recomDatabeanBusiness3 = recomDatabeans.get(i7);
                                            if (recomDatabeanBusiness3 == null) {
                                                v2Var2 = v2Var;
                                            } else {
                                                List<AppBeanMain> sub = recomDatabeanBusiness3.getSub();
                                                AppBeanMain appBeanMain = (sub == null || sub.size() <= 0) ? null : sub.get(0);
                                                String label = recomDatabeanBusiness3.getMain().getLabel();
                                                PrefDef_ prefDef_ = new PrefDef_(this.f45093c);
                                                if (!com.join.mgps.Util.g2.i(label) || label.equals(prefDef_.lastTopTip().d())) {
                                                    v2Var.f45489a.setVisibility(8);
                                                } else {
                                                    v2Var.f45489a.setVisibility(0);
                                                    v2Var.f45490b.setText(recomDatabeanBusiness3.getMain().getLabel());
                                                }
                                                v2Var.f45489a.setOnClickListener(new r0(appBeanMain));
                                                v2Var2 = v2Var;
                                                v2Var.f45491c.setOnClickListener(new c1(v2Var2));
                                            }
                                            i7++;
                                            v2Var = v2Var2;
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    view5 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans2 = mgpapaMainItemBean.getRecomDatabeans();
                                    if (recomDatabeans2 != null && recomDatabeans2.size() > 0 && (main3 = (recomDatabeanBusiness = recomDatabeans2.get(0)).getMain()) != null) {
                                        f45081p1.f45458d.setText(main3.getSub_title());
                                        MyImageLoader.f(f45081p1.f45460f, R.drawable.main_normal_icon, main3.getPic_remote(), MyImageLoader.D(this.f45093c));
                                        if (recomDatabeanBusiness.getSub() != null) {
                                            recomDatabeanBusiness.getSub().size();
                                        }
                                        f45081p1.f45455a.setOnClickListener(new g1(recomDatabeans2));
                                    }
                                    List<RecomDatabeanBusiness> recomDatabeans22 = mgpapaMainItemBean.getRecomDatabeans2();
                                    if (recomDatabeans22 != null && recomDatabeans22.size() > 0 && (main2 = recomDatabeans22.get(0).getMain()) != null) {
                                        f45081p1.f45461g.setText(main2.getSub_title());
                                        f45081p1.f45462h.setText(main2.getLabel());
                                        MyImageLoader.f(f45081p1.f45463i, R.drawable.main_normal_icon, main2.getPic_remote(), MyImageLoader.D(this.f45093c));
                                        f45081p1.f45456b.setOnClickListener(new h1(recomDatabeans22));
                                    }
                                    List<RecomDatabeanBusiness> recomDatabeans3 = mgpapaMainItemBean.getRecomDatabeans3();
                                    if (recomDatabeans3 != null && recomDatabeans3.size() > 0 && (main = recomDatabeans3.get(0).getMain()) != null) {
                                        f45081p1.f45468n.setText(main.getSub_title());
                                        f45081p1.f45469o.setText(main.getLabel());
                                        MyImageLoader.d(f45081p1.f45470p, R.drawable.main_normal_icon, main.getPic_remote());
                                        f45081p1.f45457c.setOnClickListener(new i1(recomDatabeans3));
                                    }
                                    GameDiscoverTheNewBean gameDiscoverTheNewBean = (GameDiscoverTheNewBean) mgpapaMainItemBean.getObject();
                                    if (gameDiscoverTheNewBean != null) {
                                        f45081p1.f45465k.setText(gameDiscoverTheNewBean.getGame_count() + "款");
                                        List<IconGame> game_list = gameDiscoverTheNewBean.getGame_list();
                                        if (game_list != null && game_list.size() > 0) {
                                            MyImageLoader.h(f45081p1.f45471q, game_list.get(0).getGame_ico());
                                        }
                                        if (game_list != null && game_list.size() > 1) {
                                            MyImageLoader.h(f45081p1.f45472r, game_list.get(1).getGame_ico());
                                        }
                                        if (game_list != null && game_list.size() > 2) {
                                            MyImageLoader.h(f45081p1.f45473s, game_list.get(2).getGame_ico());
                                        }
                                    }
                                    f45081p1.f45459e.setOnClickListener(new j1());
                                    f45081p1.f45464j.setOnClickListener(new a());
                                    break;
                                case 2:
                                    view5 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans23 = mgpapaMainItemBean.getRecomDatabeans2();
                                    mgpapaMainItemBean.getRecomDatabeans();
                                    RecomDatabeanBusiness recomDatabeanLeft = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    a2Var4.f45114b.setVisibility(8);
                                    a2Var4.f45115c.setVisibility(8);
                                    a2Var4.f45113a.setOnClickListener(null);
                                    View view6 = a2Var4.f45116d;
                                    if (view6 != null) {
                                        view6.setVisibility(8);
                                    }
                                    if (recomDatabeans23 == null || recomDatabeans23.size() <= 0) {
                                        a2Var4.f45115c.setVisibility(8);
                                    } else {
                                        a2Var4.f45115c.setVisibility(0);
                                        RecomDatabeanBusiness recomDatabeanBusiness4 = recomDatabeans23.get(0);
                                        a2Var4.f45115c.setOnClickListener(new b(recomDatabeanBusiness4));
                                        a2Var4.f45113a.setOnClickListener(new c(recomDatabeanBusiness4));
                                    }
                                    int moreType = mgpapaMainItemBean.getMoreType();
                                    if (moreType != 0) {
                                        if (moreType != 2) {
                                            switch (moreType) {
                                                case 4:
                                                    a2Var4.f45113a.setText("最新网游");
                                                    a2Var4.f45115c.setVisibility(0);
                                                    if (recomDatabeanLeft != null) {
                                                        a2Var4.f45113a.setText(recomDatabeanLeft.getMain().getTitle());
                                                    }
                                                    if (recomDatabeans23 == null || recomDatabeans23.size() <= 0) {
                                                        a2Var4.f45115c.setVisibility(8);
                                                        break;
                                                    } else {
                                                        RecomDatabeanBusiness recomDatabeanBusiness5 = recomDatabeans23.get(0);
                                                        a2Var4.f45115c.setOnClickListener(new f(recomDatabeanBusiness5, mgpapaMainItemBean));
                                                        a2Var4.f45113a.setOnClickListener(new g(recomDatabeanBusiness5, mgpapaMainItemBean));
                                                        break;
                                                    }
                                                    break;
                                                case 5:
                                                    a2Var4.f45113a.setText("游戏预约");
                                                    if (recomDatabeanLeft != null) {
                                                        a2Var4.f45113a.setText(recomDatabeanLeft.getMain().getTitle());
                                                        break;
                                                    }
                                                    break;
                                                case 6:
                                                    a2Var4.f45113a.setText("网游精选推荐");
                                                    if (recomDatabeanLeft != null) {
                                                        a2Var4.f45113a.setText(recomDatabeanLeft.getMain().getTitle());
                                                        break;
                                                    }
                                                    break;
                                                case 7:
                                                    a2Var4.f45113a.setText(((PapaMainLive) mgpapaMainItemBean.getObject()).getTitle());
                                                    break;
                                                case 8:
                                                    a2Var4.f45113a.setText("猜你喜欢");
                                                    if (recomDatabeanLeft != null) {
                                                        a2Var4.f45113a.setText(recomDatabeanLeft.getMain().getTitle());
                                                        break;
                                                    }
                                                    break;
                                                case 9:
                                                    a2Var4.f45113a.setText((String) mgpapaMainItemBean.getObject());
                                                    break;
                                                case 10:
                                                    a2Var4.f45113a.setText("热门游戏单");
                                                    a2Var4.f45115c.setVisibility(0);
                                                    a2Var4.f45115c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.n3
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view7) {
                                                            o3.E(view7);
                                                        }
                                                    });
                                                    break;
                                            }
                                        } else {
                                            a2Var4.f45113a.setText("大总管播报");
                                            if (recomDatabeans23 == null || recomDatabeans23.size() <= 0) {
                                                a2Var4.f45114b.setVisibility(8);
                                            } else {
                                                RecomDatabeanBusiness recomDatabeanBusiness6 = recomDatabeans23.get(0);
                                                if (recomDatabeanBusiness6 != null) {
                                                    a2Var4.f45113a.setText(recomDatabeanBusiness6.getMain().getTitle());
                                                }
                                            }
                                            a2Var4.f45115c.setVisibility(0);
                                            a2Var4.f45115c.setOnClickListener(new d(mgpapaMainItemBean));
                                            a2Var4.f45113a.setOnClickListener(new e(mgpapaMainItemBean));
                                            break;
                                        }
                                    } else {
                                        a2Var4.f45113a.setText("近期热门");
                                        if (recomDatabeanLeft != null) {
                                            a2Var4.f45113a.setText(recomDatabeanLeft.getMain().getTitle());
                                        }
                                        View findViewById = view5.findViewById(R.id.main);
                                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                                        layoutParams.height = this.f45093c.getResources().getDimensionPixelOffset(R.dimen.wdp60);
                                        findViewById.setLayoutParams(layoutParams);
                                        break;
                                    }
                                    break;
                                case 3:
                                    view2 = view4;
                                    try {
                                        RecomDatabeanBusiness recomDatabeanLeft2 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                        List<AppBeanMain> sub2 = recomDatabeanLeft2.getSub();
                                        if (sub2 != null && sub2.size() > 0) {
                                            AppBeanMain appBeanMain2 = sub2.get(0);
                                            AppBean game_info = appBeanMain2.getGame_info();
                                            DownloadTask a5 = recomDatabeanLeft2.a();
                                            if (game_info.getGift_package_switch() == 1) {
                                                h2Var2 = h2Var;
                                                h2Var2.f45234n.setVisibility(0);
                                            } else {
                                                h2Var2 = h2Var;
                                                h2Var2.f45234n.setVisibility(8);
                                            }
                                            h2Var2.f45222b.setText(game_info.getGame_name());
                                            h2Var2.f45225e.setText(game_info.getInfo());
                                            long size = a5 != null ? a5.getSize() : 0L;
                                            if (com.join.mgps.Util.g2.i(game_info.getGif_ico_remote())) {
                                                MyImageLoader.n(h2Var2.f45221a, game_info.getGif_ico_remote());
                                            } else {
                                                MyImageLoader.h(h2Var2.f45221a, game_info.getIco_remote());
                                            }
                                            UtilsMy.O(game_info.getScore(), game_info.getDown_count(), game_info.getSize(), game_info.getSp_tag_info(), game_info.getTag_info(), h2Var2.f45227g, this.f45093c, "3".equals(appBeanMain2.getTpl_type()));
                                            view5 = view2;
                                            UtilsMy.j3(game_info.getSp_tag_info(), view5, a5);
                                            h2Var2.f45223c.setEnabled(true);
                                            if ((ConstantIntEnum.H5.value() + "").equals(game_info.getPlugin_num())) {
                                                h2Var2.f45224d.setBackgroundResource(R.drawable.recom_blue_butn);
                                                h2Var2.f45224d.setText("开始");
                                                h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                h2Var2.f45227g.setVisibility(8);
                                                h2Var2.f45234n.setVisibility(8);
                                            } else if (a5 == null) {
                                                i0(h2Var2, Boolean.TRUE, Boolean.FALSE);
                                                if (UtilsMy.o0(game_info.getTag_info())) {
                                                    if (com.join.android.app.common.utils.e.l0(this.f45093c).d(this.f45093c, game_info.getPackageName()) && UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id()) == 0) {
                                                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f45093c).l(this.f45093c, game_info.getPackageName());
                                                        if (com.join.mgps.Util.g2.i(game_info.getVer()) && l4.d() < Integer.parseInt(game_info.getVer())) {
                                                            h2Var2.f45224d.setBackgroundResource(R.drawable.recom_green_butn);
                                                            h2Var2.f45224d.setText("更新");
                                                            h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                        } else {
                                                            h2Var2.f45224d.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                                            h2Var2.f45224d.setText(this.f45093c.getResources().getString(R.string.download_status_finished));
                                                            h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_main_color));
                                                        }
                                                    } else {
                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_green_butn);
                                                        UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                                                        UtilsMy.Y2(h2Var2.f45224d, h2Var2.f45223c, game_info);
                                                    }
                                                } else {
                                                    h2Var2.f45224d.setBackgroundResource(R.drawable.recom_green_butn);
                                                    UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                                                    UtilsMy.Y2(h2Var2.f45224d, h2Var2.f45223c, game_info);
                                                }
                                            } else {
                                                int status = a5.getStatus();
                                                if (UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id()) > 0) {
                                                    status = 43;
                                                }
                                                if (status != 0) {
                                                    if (status == 27) {
                                                        h2Var2.f45224d.setText("暂停中");
                                                    } else if (status == 48) {
                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        h2Var2.f45224d.setText("安装中");
                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                        i0(h2Var2, Boolean.TRUE, Boolean.FALSE);
                                                    } else if (status != 2) {
                                                        if (status != 3) {
                                                            if (status != 5) {
                                                                if (status != 6) {
                                                                    if (status != 7) {
                                                                        if (status != 42) {
                                                                            if (status != 43) {
                                                                                switch (status) {
                                                                                    case 9:
                                                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_green_butn);
                                                                                        h2Var2.f45224d.setText("更新");
                                                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                                                        i0(h2Var2, Boolean.TRUE, Boolean.FALSE);
                                                                                        break;
                                                                                    case 10:
                                                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_blue_butn);
                                                                                        h2Var2.f45224d.setText("等待");
                                                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                                                        Boolean bool = Boolean.FALSE;
                                                                                        i0(h2Var2, bool, bool);
                                                                                        h2Var2.f45228h.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                                                        try {
                                                                                            h2Var2.f45231k.setProgress((int) a5.getProgress());
                                                                                        } catch (Exception e9) {
                                                                                            e9.printStackTrace();
                                                                                        }
                                                                                        h2Var2.f45229i.setText("等待中");
                                                                                        break;
                                                                                    case 11:
                                                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_green_butn);
                                                                                        h2Var2.f45224d.setText("安装");
                                                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_green_color));
                                                                                        i0(h2Var2, Boolean.TRUE, Boolean.FALSE);
                                                                                        break;
                                                                                    case 12:
                                                                                        i0(h2Var2, Boolean.FALSE, Boolean.TRUE);
                                                                                        h2Var2.f45228h.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                                                        h2Var2.f45229i.setText("解压中..");
                                                                                        h2Var2.f45232l.setProgress((int) a5.getProgress());
                                                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.extract);
                                                                                        h2Var2.f45224d.setText("解压中");
                                                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_grey_color));
                                                                                        break;
                                                                                    case 13:
                                                                                        i0(h2Var2, Boolean.FALSE, Boolean.TRUE);
                                                                                        h2Var2.f45228h.setText(UtilsMy.a(size) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                                                        h2Var2.f45229i.setText("点击重新解压");
                                                                                        h2Var2.f45232l.setProgress((int) a5.getProgress());
                                                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.reextract);
                                                                                        h2Var2.f45224d.setText("解压");
                                                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            h2Var2.f45224d.setBackgroundResource(R.drawable.recom_maincolor_butn);
                                                            h2Var2.f45224d.setText(this.f45093c.getResources().getString(R.string.download_status_finished));
                                                            h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_main_color));
                                                            Boolean bool2 = Boolean.TRUE;
                                                            i0(h2Var2, bool2, bool2);
                                                        }
                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        h2Var2.f45224d.setText("继续");
                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                        Boolean bool3 = Boolean.FALSE;
                                                        i0(h2Var2, bool3, bool3);
                                                        try {
                                                            if (a5.getSize() == 0) {
                                                                h2Var2.f45228h.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                            } else {
                                                                h2Var2.f45228h.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                            }
                                                            h2Var2.f45231k.setProgress((int) a5.getProgress());
                                                        } catch (Exception e10) {
                                                            e10.printStackTrace();
                                                        }
                                                        h2Var2.f45229i.setText("暂停中");
                                                    } else {
                                                        UtilsMy.x4(a5);
                                                        h2Var2.f45224d.setBackgroundResource(R.drawable.recom_blue_butn);
                                                        h2Var2.f45224d.setText("暂停");
                                                        h2Var2.f45224d.setTextColor(this.f45093c.getResources().getColor(R.color.app_blue_color));
                                                        Boolean bool4 = Boolean.FALSE;
                                                        i0(h2Var2, bool4, bool4);
                                                        if (a5.getSize() == 0) {
                                                            h2Var2.f45228h.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                        } else {
                                                            h2Var2.f45228h.setText(UtilsMy.a(a5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(size));
                                                        }
                                                        h2Var2.f45231k.setProgress((int) a5.getProgress());
                                                        String speed = a5.getSpeed();
                                                        h2Var2.f45229i.setText(speed + "/S");
                                                    }
                                                }
                                                h2Var2.f45224d.setBackgroundResource(R.drawable.recom_green_butn);
                                                UtilsMy.w0(game_info.getPay_tag_info(), game_info.getCrc_sign_id());
                                                UtilsMy.Y2(h2Var2.f45224d, h2Var2.f45223c, game_info);
                                                i0(h2Var2, Boolean.TRUE, Boolean.FALSE);
                                            }
                                            h2Var2.f45223c.setOnClickListener(new k1(recomDatabeanLeft2, mgpapaMainItemBean.getMoreType(), mgpapaMainItemBean.getMoreType2(), mgpapaMainItemBean.getReMarks()));
                                            h2Var2.f45233m.setOnClickListener(new h(appBeanMain2, mgpapaMainItemBean, game_info));
                                            h2Var2.f45233m.setBackgroundColor(0);
                                            h2Var2.f45235o.setVisibility(8);
                                            break;
                                        }
                                        view5 = view2;
                                        break;
                                    } catch (Exception e11) {
                                        e = e11;
                                        exc = e;
                                        view3 = view2;
                                        exc.printStackTrace();
                                        return view3;
                                    }
                                    break;
                                case 4:
                                    view2 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans4 = mgpapaMainItemBean.getRecomDatabeans();
                                    if (recomDatabeans4 != null && recomDatabeans4.size() > 0) {
                                        RecomDatabeanBusiness recomDatabeanBusiness7 = recomDatabeans4.get(0);
                                        MyImageLoader.d(s2Var.f45415a, R.drawable.banner_normal_icon, recomDatabeanBusiness7.getMain().getPic_remote());
                                        s2Var.f45415a.setOnClickListener(new i(recomDatabeanBusiness7, mgpapaMainItemBean));
                                    }
                                    view5 = view2;
                                    break;
                                case 5:
                                    view2 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans5 = mgpapaMainItemBean.getRecomDatabeans();
                                    ArrayList arrayList = new ArrayList();
                                    com.join.mgps.adapter.x1 x1Var24 = new com.join.mgps.adapter.x1(this.f45093c, arrayList);
                                    r2Var.f45397a.setAdapter((ListAdapter) x1Var24);
                                    r2Var.f45397a.setOnItemClickListener(new j(arrayList));
                                    arrayList.clear();
                                    arrayList.addAll(recomDatabeans5);
                                    x1Var24.notifyDataSetChanged();
                                    view5 = view2;
                                    break;
                                case 6:
                                    view2 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans6 = mgpapaMainItemBean.getRecomDatabeans();
                                    if (recomDatabeans6 != null && recomDatabeans6.size() > 0 && (recomDatabeanBusiness2 = recomDatabeans6.get(0)) != null) {
                                        ModleBean main4 = recomDatabeanBusiness2.getMain();
                                        q2Var.f45382c.setText(Html.fromHtml(main4.getSub_title()), TextView.BufferType.SPANNABLE);
                                        q2Var.f45383d.setText(main4.getLabel());
                                        String[] split = main4.getPic_remote().split("\\|");
                                        if (split.length > 0) {
                                            MyImageLoader.d(q2Var.f45386g, R.drawable.main_normal_icon, split[0]);
                                        }
                                        if (split.length > 1) {
                                            MyImageLoader.d(q2Var.f45387h, R.drawable.main_normal_icon, split[1]);
                                        }
                                        if (split.length > 2) {
                                            MyImageLoader.d(q2Var.f45388i, R.drawable.main_normal_icon, split[2]);
                                        }
                                        q2Var.f45385f.setText(main4.getComment_count() + "");
                                        q2Var.f45384e.setText(main4.getPv_count() + "");
                                        q2Var.f45386g.setOnClickListener(new l(recomDatabeanBusiness2, mgpapaMainItemBean));
                                        q2Var.f45381b.setOnClickListener(new m(recomDatabeanBusiness2, mgpapaMainItemBean));
                                        q2Var.f45387h.setOnClickListener(new n(recomDatabeanBusiness2, mgpapaMainItemBean));
                                        q2Var.f45380a.setOnClickListener(new o(recomDatabeanBusiness2, mgpapaMainItemBean));
                                    }
                                    view5 = view2;
                                    break;
                                case 7:
                                    view2 = view4;
                                    RecomDatabeanBusiness recomDatabeanLeft3 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    if (recomDatabeanLeft3 != null) {
                                        ModleBean main5 = recomDatabeanLeft3.getMain();
                                        p2Var.f45356b.setText(main5.getSub_title());
                                        p2Var.f45357c.setText(main5.getLabel());
                                        MyImageLoader.h(p2Var.f45358d, main5.getPic_remote());
                                        p2Var.f45355a.setOnClickListener(new q(recomDatabeanLeft3, mgpapaMainItemBean));
                                        if (recomDatabeanLeft3.getSub().get(0).getGame_info() == null) {
                                            p2Var2 = p2Var;
                                            p2Var2.f45363i.setVisibility(8);
                                            p2Var2.f45365k.setVisibility(0);
                                        } else {
                                            p2Var2 = p2Var;
                                            p2Var2.f45363i.setVisibility(0);
                                            p2Var2.f45365k.setVisibility(8);
                                        }
                                        e0(p2Var2.f45364j, recomDatabeanLeft3, p2Var2.f45359e, p2Var2.f45360f, p2Var2.f45361g, p2Var2.f45362h, mgpapaMainItemBean.getMoreType2() + "-", mgpapaMainItemBean.getReMarks());
                                        p2Var2.f45363i.setOnClickListener(new r(recomDatabeanLeft3, mgpapaMainItemBean));
                                    }
                                    view5 = view2;
                                    break;
                                case 8:
                                    view2 = view4;
                                    x1Var2.f45513a.setText("猜你喜欢");
                                    x1Var2.f45514b.setOnClickListener(new s());
                                    view5 = view2;
                                    break;
                                case 9:
                                    view2 = view4;
                                    RecomDatabeanBusiness recomDatabeanLeft4 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    RecomDatabeanBusiness recomDatabeanRight = mgpapaMainItemBean.getRecomDatabeanRight();
                                    g0(w1Var2, recomDatabeanLeft4, mgpapaMainItemBean.getMoreType(), 0);
                                    g0(w1Var2, recomDatabeanRight, mgpapaMainItemBean.getMoreType(), 1);
                                    view5 = view2;
                                    break;
                                case 10:
                                    view2 = view4;
                                    List<RecomDatabeanBusiness> recomDatabeans7 = mgpapaMainItemBean.getRecomDatabeans();
                                    if (recomDatabeans7 != null && recomDatabeans7.size() > 2) {
                                        RecomDatabeanBusiness recomDatabeanBusiness8 = recomDatabeans7.get(0);
                                        if (recomDatabeanBusiness8 != null) {
                                            ModleBean main6 = recomDatabeanBusiness8.getMain();
                                            ((o2) r27).f45328b.setText(main6.getTitle());
                                            ((o2) r27).f45329c.setText(main6.getSub_title());
                                            MyImageLoader.h(((o2) r27).f45330d, main6.getPic_remote());
                                            ((o2) r27).f45327a.setOnClickListener(new p(recomDatabeanBusiness8, mgpapaMainItemBean));
                                        }
                                        RecomDatabeanBusiness recomDatabeanBusiness9 = recomDatabeans7.get(1);
                                        if (recomDatabeanBusiness9 != null) {
                                            MyImageLoader.h(((o2) r27).f45331e, recomDatabeanBusiness9.getMain().getPic_remote());
                                        }
                                        RecomDatabeanBusiness recomDatabeanBusiness10 = recomDatabeans7.get(2);
                                        if (recomDatabeanBusiness9 != null) {
                                            MyImageLoader.h(((o2) r27).f45332f, recomDatabeanBusiness10.getMain().getPic_remote());
                                        }
                                    }
                                    view5 = view2;
                                    break;
                                case 11:
                                    view2 = view4;
                                    RecomDatabeanBusiness recomDatabeanLeft5 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    RecomDatabeanBusiness recomDatabeanRight2 = mgpapaMainItemBean.getRecomDatabeanRight();
                                    if (recomDatabeanLeft5.getSub() != null && recomDatabeanLeft5.getSub().size() > 0) {
                                        AppBeanMain appBeanMain3 = recomDatabeanLeft5.getSub().get(0);
                                        o1Var.f45316c.setHierarchy(com.facebook.drawee.generic.b.t(this.f45093c.getResources()).Y(RoundingParams.d(10.0f)).a());
                                        MyImageLoader.d(o1Var.f45317d, R.drawable.main_normal_icon, appBeanMain3.getGame_info().getIco_remote());
                                        MyImageLoader.d(o1Var.f45316c, R.drawable.main_normal_icon, recomDatabeanLeft5.getMain().getPic_remote());
                                        o1Var.f45318e.setText(appBeanMain3.getGame_info().getGame_name());
                                        o1Var.f45324k.setText(Html.fromHtml("已有<font color = '#000000'>" + appBeanMain3.getGame_info().getBespeak_count() + "</font>人预约"), TextView.BufferType.SPANNABLE);
                                        o1Var.f45314a.setOnClickListener(new t(appBeanMain3, recomDatabeanLeft5));
                                        if (appBeanMain3.getGame_info().getIs_bespeak() == 1) {
                                            o1Var.f45319f.setText("已预约");
                                            o1Var.f45319f.setEnabled(false);
                                            o1Var.f45319f.setTextColor(-1);
                                            o1Var.f45319f.setBackgroundResource(R.drawable.download_maincolor_butn);
                                        } else {
                                            o1Var.f45319f.setBackgroundResource(R.drawable.stroke_button_maincolor_selecter);
                                            o1Var.f45319f.setEnabled(true);
                                            o1Var.f45319f.setTextColor(-756480);
                                            o1Var.f45319f.setOnClickListener(new u(appBeanMain3, recomDatabeanLeft5));
                                            o1Var.f45319f.setText("预约");
                                        }
                                    }
                                    if (recomDatabeanRight2.getSub() == null || recomDatabeanRight2.getSub().size() <= 0) {
                                        o1Var.f45315b.setVisibility(4);
                                    } else {
                                        o1Var.f45315b.setVisibility(0);
                                        AppBeanMain appBeanMain4 = recomDatabeanRight2.getSub().get(0);
                                        o1Var.f45320g.setHierarchy(com.facebook.drawee.generic.b.t(this.f45093c.getResources()).Y(RoundingParams.d(10.0f)).a());
                                        MyImageLoader.d(o1Var.f45321h, R.drawable.main_normal_icon, appBeanMain4.getGame_info().getIco_remote());
                                        MyImageLoader.d(o1Var.f45320g, R.drawable.main_normal_icon, recomDatabeanRight2.getMain().getPic_remote());
                                        o1Var.f45322i.setText(appBeanMain4.getGame_info().getGame_name());
                                        o1Var.f45325l.setText(Html.fromHtml("已有<font color = '#000000'>" + appBeanMain4.getGame_info().getBespeak_count() + "</font>人预约"), TextView.BufferType.SPANNABLE);
                                        o1Var.f45315b.setOnClickListener(new w(appBeanMain4, recomDatabeanRight2));
                                        if (appBeanMain4.getGame_info().getIs_bespeak() == 1) {
                                            o1Var.f45323j.setText("已预约");
                                            o1Var.f45323j.setEnabled(false);
                                            o1Var.f45323j.setTextColor(-1);
                                            o1Var.f45323j.setBackgroundResource(R.drawable.download_maincolor_butn);
                                        } else {
                                            o1Var.f45323j.setBackgroundResource(R.drawable.stroke_button_maincolor_selecter);
                                            o1Var.f45323j.setText("预约");
                                            o1Var.f45323j.setTextColor(-756480);
                                            o1Var.f45323j.setEnabled(true);
                                            o1Var.f45323j.setOnClickListener(new x(appBeanMain4, recomDatabeanRight2));
                                        }
                                    }
                                    view5 = view2;
                                    break;
                                case 12:
                                    view2 = view4;
                                    PapaMainGameBespeakInfo papaMainGameBespeakInfo = (PapaMainGameBespeakInfo) mgpapaMainItemBean.getObject();
                                    n1Var38.f45302a.setText(papaMainGameBespeakInfo.getGame_bespeak_count());
                                    n1Var38.f45303b.setText(Html.fromHtml(papaMainGameBespeakInfo.getMember_bespeak_count() + ""), TextView.BufferType.SPANNABLE);
                                    n1Var38.f45304c.setOnClickListener(new y(papaMainGameBespeakInfo, mgpapaMainItemBean));
                                    view5 = view2;
                                    break;
                                case 13:
                                    view2 = view4;
                                    RecomDatabeanBusiness recomDatabeanLeft6 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    if (com.join.mgps.Util.g2.i(recomDatabeanLeft6.getMain().getVedio_url())) {
                                        MyImageLoader.d(m1Var.f45280a, R.drawable.banner_normal_icon, recomDatabeanLeft6.getMain().getPic_remote());
                                        int i8 = i4 + 1;
                                        m1Var.f45280a.setTag(Integer.valueOf(i8));
                                        if (com.join.mgps.Util.g2.i(recomDatabeanLeft6.getMain().getVedio_url())) {
                                            String vedio_url = recomDatabeanLeft6.getMain().getVedio_url();
                                            IntentDateBean intentDataBean = recomDatabeanLeft6.getSub().get(0).getIntentDataBean();
                                            ExtBean extBean = intentDataBean.getExtBean();
                                            extBean.setReMarks(mgpapaMainItemBean.getReMarks());
                                            intentDataBean.setExtBean(extBean);
                                            this.f45102l.e(i8, new c.l(i8, vedio_url, recomDatabeanLeft6.getMain().getPic_remote(), intentDataBean), new boolean[0]);
                                        }
                                        m1Var3 = m1Var;
                                        m1Var3.f45288i.setOnClickListener(new z(i8));
                                    } else {
                                        m1Var3 = m1Var;
                                        m1Var3.f45280a.setVisibility(0);
                                        MyImageLoader.d(m1Var3.f45280a, R.drawable.banner_normal_icon, recomDatabeanLeft6.getMain().getPic_remote());
                                    }
                                    e0(m1Var3.f45285f, recomDatabeanLeft6, m1Var3.f45281b, m1Var3.f45282c, m1Var3.f45283d, m1Var3.f45284e, mgpapaMainItemBean.getMoreType2().replace("-x", "-1-"), mgpapaMainItemBean.getReMarks());
                                    if (recomDatabeanLeft6.getSub() != null && recomDatabeanLeft6.getSub().size() > 0) {
                                        AppBean game_info2 = recomDatabeanLeft6.getSub().get(0).getGame_info();
                                        m1Var3.f45283d.setVisibility(8);
                                        UtilsMy.O(game_info2.getScore(), game_info2.getDown_count(), game_info2.getSize(), game_info2.getSp_tag_info(), game_info2.getTag_info(), m1Var3.f45287h, this.f45093c, "3".equals(recomDatabeanLeft6.getSub().get(0).getTpl_type()));
                                    }
                                    m1Var3.f45286g.setOnClickListener(new a0(recomDatabeanLeft6, mgpapaMainItemBean));
                                    m1Var3.f45280a.setOnClickListener(new b0(recomDatabeanLeft6, mgpapaMainItemBean));
                                    view5 = view2;
                                    break;
                                case 14:
                                    view2 = view4;
                                    RecomDatabeanBusiness recomDatabeanBusiness11 = mgpapaMainItemBean.getRecomDatabeans().get(0);
                                    if (com.join.mgps.Util.g2.i(recomDatabeanBusiness11.getMain().getVedio_url())) {
                                        MyImageLoader.d(q1Var.f45372b, R.drawable.banner_normal_icon, recomDatabeanBusiness11.getMain().getPic_remote());
                                        int i9 = i4 + 1;
                                        q1Var.f45372b.setTag(Integer.valueOf(i9));
                                        if (com.join.mgps.Util.g2.i(recomDatabeanBusiness11.getMain().getVedio_url())) {
                                            this.f45102l.e(i9, new c.l(i9, recomDatabeanBusiness11.getMain().getVedio_url(), recomDatabeanBusiness11.getMain().getPic_remote(), recomDatabeanBusiness11.getSub().get(0).getIntentDataBean()), new boolean[0]);
                                        }
                                        q1Var.f45371a.setOnClickListener(new c0(i9));
                                    } else {
                                        q1Var.f45372b.setVisibility(0);
                                        MyImageLoader.d(q1Var.f45372b, R.drawable.banner_normal_icon, recomDatabeanBusiness11.getMain().getPic_remote());
                                    }
                                    q1 q1Var4 = q1Var;
                                    q1Var4.f45375e.setText(recomDatabeanBusiness11.getMain().getLabel());
                                    e0(q1Var4.f45377g, recomDatabeanBusiness11, q1Var4.f45373c, q1Var4.f45374d, null, q1Var4.f45376f, mgpapaMainItemBean.getMoreType2() + "-", mgpapaMainItemBean.getReMarks());
                                    q1Var4.f45378h.setOnClickListener(new d0(recomDatabeanBusiness11, mgpapaMainItemBean));
                                    view5 = view2;
                                    break;
                                case 15:
                                    view2 = view4;
                                    PapaMainLive papaMainLive = (PapaMainLive) mgpapaMainItemBean.getObject();
                                    List<PapaMainLivelistItem> list = papaMainLive.getList();
                                    if (papaMainLive.getFirst() != null) {
                                        m2 m2Var6 = k2Var2;
                                        m2Var6.f45292c.setText(papaMainLive.getFirst().getTitle());
                                        m2Var6.f45291b.setText(papaMainLive.getFirst().getReason());
                                        SimpleDraweeView simpleDraweeView2 = m2Var6.f45290a;
                                        String cover_img = papaMainLive.getFirst().getCover_img();
                                        Context context = this.f45093c;
                                        MyImageLoader.f(simpleDraweeView2, R.drawable.main_normal_icon, cover_img, MyImageLoader.E(context, com.join.android.app.common.utils.n.n(context).g() * 6.0f));
                                        m2Var2 = m2Var6;
                                    } else {
                                        m2 m2Var7 = k2Var2;
                                        m2Var2 = m2Var7;
                                        if (list != null) {
                                            m2Var2 = m2Var7;
                                            if (list.size() > 0) {
                                                PapaMainLivelistItem papaMainLivelistItem = list.get(0);
                                                m2Var7.f45292c.setText(papaMainLivelistItem.getTitle());
                                                SimpleDraweeView simpleDraweeView3 = m2Var7.f45290a;
                                                String cover_img2 = papaMainLivelistItem.getCover_img();
                                                Context context2 = this.f45093c;
                                                MyImageLoader.f(simpleDraweeView3, R.drawable.main_normal_icon, cover_img2, MyImageLoader.E(context2, com.join.android.app.common.utils.n.n(context2).g() * 6.0f));
                                                m2Var2 = m2Var7;
                                            }
                                        }
                                    }
                                    if (list != null) {
                                        m2Var2.f45294e.removeAllViews();
                                        for (PapaMainLivelistItem papaMainLivelistItem2 : list) {
                                            View inflate8 = LayoutInflater.from(this.f45093c).inflate(R.layout.papamain_tv_right_item, (ViewGroup) null);
                                            TextView textView2 = (TextView) inflate8.findViewById(R.id.title);
                                            TextView textView3 = (TextView) inflate8.findViewById(R.id.time);
                                            String cover_img3 = papaMainLivelistItem2.getCover_img();
                                            Context context3 = this.f45093c;
                                            MyImageLoader.f((SimpleDraweeView) inflate8.findViewById(R.id.icon), R.drawable.main_normal_icon, cover_img3, MyImageLoader.E(context3, com.join.android.app.common.utils.n.n(context3).g() * 5.0f));
                                            textView2.setText(papaMainLivelistItem2.getTitle());
                                            long start_timestamp = papaMainLivelistItem2.getStart_timestamp();
                                            long end_timestamp = papaMainLivelistItem2.getEnd_timestamp();
                                            long j5 = start_timestamp * 1000;
                                            if (j5 < System.currentTimeMillis()) {
                                                if (1000 * end_timestamp > System.currentTimeMillis()) {
                                                    textView3.setTextColor(-756480);
                                                    textView2.setTextColor(-756480);
                                                    textView3.setText("正在播出：" + com.join.mgps.Util.y.A(j5) + "-" + com.join.mgps.Util.y.A(j4));
                                                    m2Var2.f45294e.addView(inflate8);
                                                }
                                            }
                                            if (com.join.android.app.common.utils.g.g(j5)) {
                                                textView3.setText(com.join.mgps.Util.y.A(j5) + "-" + com.join.mgps.Util.y.A(end_timestamp * 1000));
                                            } else {
                                                textView3.setText(com.join.mgps.Util.y.z(j5) + "日" + com.join.mgps.Util.y.A(j5) + "-" + com.join.mgps.Util.y.A(end_timestamp * 1000));
                                            }
                                            m2Var2.f45294e.addView(inflate8);
                                        }
                                    }
                                    m2Var2.f45293d.setOnClickListener(new e0());
                                    m2Var2.f45290a.setOnClickListener(new f0());
                                    m2Var2.f45294e.setOnClickListener(new h0());
                                    view5 = view2;
                                    break;
                                case 16:
                                    view2 = view4;
                                    RecomDatabeanBusiness recomDatabeanLeft7 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    ?? r8 = n1Var4;
                                    e0(r8.f45134i, recomDatabeanLeft7, r8.f45129d, r8.f45130e, r8.f45131f, r8.f45132g, mgpapaMainItemBean.getMoreType2() + "", mgpapaMainItemBean.getReMarks());
                                    if (recomDatabeanLeft7.getSub() != null && recomDatabeanLeft7.getSub().size() > 0) {
                                        AppBean game_info3 = recomDatabeanLeft7.getSub().get(0).getGame_info();
                                        r8.f45131f.setVisibility(8);
                                        UtilsMy.O(game_info3.getScore(), game_info3.getDown_count(), game_info3.getSize(), game_info3.getSp_tag_info(), game_info3.getTag_info(), r8.f45135j, this.f45093c, "3".equals(recomDatabeanLeft7.getSub().get(0).getTpl_type()));
                                    }
                                    String[] split2 = recomDatabeanLeft7.getMain().getPic_remote().split("\\|");
                                    if (split2.length > 0) {
                                        MyImageLoader.h(((b2) r8).f45126a, split2[0]);
                                    }
                                    if (split2.length > 1) {
                                        MyImageLoader.h(((b2) r8).f45127b, split2[1]);
                                    }
                                    if (split2.length > 2) {
                                        MyImageLoader.h(((b2) r8).f45128c, split2[2]);
                                    }
                                    r8.f45133h.setOnClickListener(new j0(recomDatabeanLeft7, mgpapaMainItemBean));
                                    ((b2) r8).f45126a.setOnClickListener(new k0(recomDatabeanLeft7, mgpapaMainItemBean));
                                    ((b2) r8).f45127b.setOnClickListener(new l0(recomDatabeanLeft7, mgpapaMainItemBean));
                                    ((b2) r8).f45128c.setOnClickListener(new m0(recomDatabeanLeft7, mgpapaMainItemBean));
                                    view5 = view2;
                                    break;
                                case 17:
                                case 21:
                                default:
                                    view5 = view4;
                                    break;
                                case 18:
                                    try {
                                        List<RecomDatabeanBusiness> recomDatabeans8 = mgpapaMainItemBean.getRecomDatabeans();
                                        c2 c2Var4 = n1Var5;
                                        c2Var4.f45164v.setVisibility(4);
                                        c2Var4.f45157o.setVisibility(4);
                                        if (recomDatabeans8 == null || recomDatabeans8.size() <= 0) {
                                            str = "-";
                                            view2 = view4;
                                            i5 = 1;
                                            c2Var = c2Var4;
                                        } else {
                                            RecomDatabeanBusiness recomDatabeanBusiness12 = recomDatabeans8.get(0);
                                            c2Var4.f45152j.setText(recomDatabeanBusiness12.getSub().get(0).getGame_info().getInfo());
                                            MyImageLoader.d(c2Var4.f45143a, R.drawable.main_normal_icon, recomDatabeanBusiness12.getMain().getPic_remote());
                                            view2 = view4;
                                            c2Var = c2Var4;
                                            str = "-";
                                            i5 = 1;
                                            e0(c2Var4.f45151i, recomDatabeanBusiness12, c2Var4.f45146d, c2Var4.f45147e, c2Var4.f45148f, c2Var4.f45149g, mgpapaMainItemBean.getMoreType2() + "1-", mgpapaMainItemBean.getReMarks());
                                            c2Var.f45150h.setOnClickListener(new n0(mgpapaMainItemBean, recomDatabeanBusiness12));
                                            UtilsMy.k3(recomDatabeanBusiness12.getSub().get(0).getGame_info().getSp_tag_info(), c2Var.f45167y);
                                        }
                                        if (recomDatabeans8 == null || recomDatabeans8.size() <= i5) {
                                            str2 = str;
                                            i6 = 2;
                                        } else {
                                            c2Var.f45157o.setVisibility(0);
                                            RecomDatabeanBusiness recomDatabeanBusiness13 = recomDatabeans8.get(i5);
                                            c2Var.f45159q.setText(recomDatabeanBusiness13.getSub().get(0).getGame_info().getInfo());
                                            MyImageLoader.d(c2Var.f45144b, R.drawable.main_normal_icon, recomDatabeanBusiness13.getMain().getPic_remote());
                                            TextView textView4 = c2Var.f45158p;
                                            SimpleDraweeView simpleDraweeView4 = c2Var.f45153k;
                                            TextView textView5 = c2Var.f45154l;
                                            TextView textView6 = c2Var.f45155m;
                                            RelativeLayout relativeLayout = c2Var.f45156n;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(mgpapaMainItemBean.getMoreType2());
                                            i6 = 2;
                                            sb.append(2);
                                            String str3 = str;
                                            sb.append(str3);
                                            str2 = str3;
                                            e0(textView4, recomDatabeanBusiness13, simpleDraweeView4, textView5, textView6, relativeLayout, sb.toString(), mgpapaMainItemBean.getReMarks());
                                            c2Var.f45157o.setOnClickListener(new o0(mgpapaMainItemBean, recomDatabeanBusiness13));
                                            UtilsMy.k3(recomDatabeanBusiness13.getSub().get(0).getGame_info().getSp_tag_info(), c2Var.f45168z);
                                        }
                                        if (recomDatabeans8 != null && recomDatabeans8.size() > i6) {
                                            RecomDatabeanBusiness recomDatabeanBusiness14 = recomDatabeans8.get(i6);
                                            c2Var.f45164v.setVisibility(0);
                                            c2Var.f45166x.setText(recomDatabeanBusiness14.getSub().get(0).getGame_info().getInfo());
                                            MyImageLoader.d(c2Var.f45145c, R.drawable.main_normal_icon, recomDatabeanBusiness14.getMain().getPic_remote());
                                            UtilsMy.k3(recomDatabeanBusiness14.getSub().get(0).getGame_info().getSp_tag_info(), c2Var.A);
                                            e0(c2Var.f45165w, recomDatabeanBusiness14, c2Var.f45160r, c2Var.f45161s, c2Var.f45162t, c2Var.f45163u, mgpapaMainItemBean.getMoreType2() + 3 + str2, mgpapaMainItemBean.getReMarks());
                                            c2Var.f45164v.setOnClickListener(new p0(mgpapaMainItemBean, recomDatabeanBusiness14));
                                        }
                                        view5 = view2;
                                        break;
                                    } catch (Exception e12) {
                                        e = e12;
                                        view2 = view4;
                                        exc = e;
                                        view3 = view2;
                                        exc.printStackTrace();
                                        return view3;
                                    }
                                    break;
                                case 19:
                                    RecomDatabeanBusiness recomDatabeanLeft8 = mgpapaMainItemBean.getRecomDatabeanLeft();
                                    d2Var.f45177a.setText(recomDatabeanLeft8.getMain().getTitle());
                                    d2Var.f45178b.setText(recomDatabeanLeft8.getMain().getSub_title());
                                    d2Var.f45179c.setVisibility(8);
                                    if (mgpapaMainItemBean.getMoreType() == 2) {
                                        if (recomDatabeanLeft8.getSub() != null && recomDatabeanLeft8.getSub().size() >= 1 && recomDatabeanLeft8.getSub().get(0).getIntentDataBean() != null) {
                                            IntentDateBean intentDataBean2 = recomDatabeanLeft8.getSub().get(0).getIntentDataBean();
                                            if (intentDataBean2 != null && (intentDataBean2.getLink_type() != 3 || !"9".equals(intentDataBean2.getLink_type_val()))) {
                                                d2Var.f45179c.setVisibility(0);
                                                d2Var.f45179c.setOnClickListener(new i0(recomDatabeanLeft8));
                                            }
                                            d2Var.f45179c.setVisibility(8);
                                            d2Var.f45179c.setOnClickListener(new i0(recomDatabeanLeft8));
                                        }
                                        d2Var.f45179c.setVisibility(8);
                                        d2Var.f45179c.setOnClickListener(new i0(recomDatabeanLeft8));
                                    }
                                    view5 = view4;
                                    break;
                                case 20:
                                    ((e2) view5).f45190d.setText(com.join.mgps.Util.y.D(System.currentTimeMillis()));
                                    ((e2) view5).f45187a.setTimeAnim();
                                    ((e2) view5).f45187a.setOnClickListener(new q0());
                                    view5 = view4;
                                    break;
                                case 22:
                                    try {
                                        List list2 = (List) mgpapaMainItemBean.getObject();
                                        if (list2 != null && list2.size() == 2) {
                                            BannerBean bannerBean = (BannerBean) list2.get(0);
                                            if (bannerBean == null) {
                                                return view4;
                                            }
                                            MyImageLoader.d(j2Var.f45252a, R.drawable.banner_normal_icon, bannerBean.getPic_remote());
                                            j2Var.f45252a.setOnClickListener(new v(bannerBean));
                                            BannerBean bannerBean2 = (BannerBean) list2.get(1);
                                            MyImageLoader.d(j2Var.f45253b, R.drawable.banner_normal_icon, bannerBean2.getPic_remote());
                                            j2Var.f45253b.setOnClickListener(new g0(bannerBean2));
                                        }
                                    } catch (Exception e13) {
                                        e13.printStackTrace();
                                    }
                                    view5 = view4;
                                    break;
                                case 23:
                                    try {
                                        List list3 = (List) mgpapaMainItemBean.getObject();
                                        obj.f45484e.setVisibility(4);
                                        obj.f45480a.setVisibility(4);
                                        obj.f45485f.setVisibility(4);
                                        obj.f45481b.setVisibility(4);
                                        obj.f45486g.setVisibility(4);
                                        obj.f45482c.setVisibility(4);
                                        obj.f45487h.setVisibility(4);
                                        obj.f45483d.setVisibility(4);
                                        int i10 = 0;
                                        while (i10 < list3.size()) {
                                            AppBean appBean = (AppBean) list3.get(i10);
                                            if (i10 == 0) {
                                                textView = obj.f45484e;
                                                simpleDraweeView = obj.f45480a;
                                            } else if (i10 == 1) {
                                                textView = obj.f45485f;
                                                simpleDraweeView = obj.f45481b;
                                            } else if (i10 == 2) {
                                                textView = obj.f45486g;
                                                simpleDraweeView = obj.f45482c;
                                            } else if (i10 != 3) {
                                                textView = null;
                                                simpleDraweeView = null;
                                            } else {
                                                textView = obj.f45487h;
                                                simpleDraweeView = obj.f45483d;
                                            }
                                            String str4 = "组件" + mgpapaMainItemBean.getMoreType2();
                                            int i11 = mgpapaMainItemBean.getMoreType() == 1 ? i10 + 1 : i10 + 5;
                                            String crc_sign_id = appBean.getCrc_sign_id();
                                            StringBuilder sb2 = new StringBuilder();
                                            List list4 = list3;
                                            sb2.append(Integer.parseInt(mgpapaMainItemBean.getMoreType2()) + 7);
                                            sb2.append("-");
                                            sb2.append(i11);
                                            Y(appBean, textView, simpleDraweeView, new com.papa.sim.statistic.e(crc_sign_id, str4, sb2.toString(), appBean.getGame_name()));
                                            i10++;
                                            list3 = list4;
                                        }
                                    } catch (Exception e14) {
                                        e14.printStackTrace();
                                    }
                                    view5 = view4;
                                    break;
                                case 24:
                                    GameRankingBean gameRankingBean = (GameRankingBean) mgpapaMainItemBean.getObject();
                                    NavigationAdapter navigationAdapter = this.f45103m;
                                    int i12 = 11706;
                                    if (navigationAdapter == null) {
                                        String d5 = new PrefDef_(this.f45093c).rankingMenu().d();
                                        if (!TextUtils.isEmpty(d5)) {
                                            d5.split(",");
                                            ArrayList arrayList2 = new ArrayList();
                                            ArrayList arrayList3 = new ArrayList();
                                            List<String> ranking_title = gameRankingBean.getRanking_title();
                                            if (ranking_title != null) {
                                                int i13 = 0;
                                                while (i13 < ranking_title.size()) {
                                                    if (ranking_title.size() != 0) {
                                                        String str5 = (i13 + 1) + "";
                                                        String str6 = ranking_title.get(i13);
                                                        if (i13 == 0) {
                                                            int i14 = 1;
                                                            for (CollectionBeanSub collectionBeanSub : gameRankingBean.getOnline_ranking()) {
                                                                collectionBeanSub.set_from(i12);
                                                                collectionBeanSub.set_from_type(i12);
                                                                collectionBeanSub.setRecPosition("home-ranking-" + i14);
                                                                i14++;
                                                                i12 = 11706;
                                                            }
                                                            arrayList2.add(RankingItemFragment.p0(true, str5, str6, gameRankingBean.getOnline_ranking()));
                                                        } else if (i13 == 1) {
                                                            for (CollectionBeanSub collectionBeanSub2 : gameRankingBean.getSingle_ranking()) {
                                                                collectionBeanSub2.set_from(11706);
                                                                collectionBeanSub2.set_from_type(11706);
                                                            }
                                                            arrayList2.add(RankingItemFragment.p0(true, str5, str6, gameRankingBean.getSingle_ranking()));
                                                        } else if (i13 == 2) {
                                                            for (CollectionBeanSub collectionBeanSub3 : gameRankingBean.getSimulator_ranking()) {
                                                                collectionBeanSub3.set_from(11706);
                                                                collectionBeanSub3.set_from_type(11706);
                                                            }
                                                            arrayList2.add(RankingItemFragment.p0(true, str5, str6, gameRankingBean.getSimulator_ranking()));
                                                        } else if (i13 == 3) {
                                                            for (CollectionBeanSub collectionBeanSub4 : gameRankingBean.getSimulator_ranking()) {
                                                                collectionBeanSub4.set_from(11706);
                                                                collectionBeanSub4.set_from_type(11706);
                                                            }
                                                            arrayList2.add(RankingItemFragment.p0(true, str5, str6, gameRankingBean.getFree_play_ranking()));
                                                        }
                                                        arrayList3.add(str6);
                                                        NavigationAdapter navigationAdapter2 = new NavigationAdapter(this.f45094d.getChildFragmentManager(), arrayList2, arrayList3);
                                                        this.f45103m = navigationAdapter2;
                                                        navigationAdapter2.d(arrayList2, arrayList3);
                                                        g2Var.f45211b.setAdapter(this.f45103m);
                                                        g2Var.f45211b.setOffscreenPageLimit(3);
                                                        g2Var.f45210a.setViewPager(g2Var.f45211b);
                                                        g2Var.f45212c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.m3
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view7) {
                                                                o3.F(view7);
                                                            }
                                                        });
                                                    }
                                                    i13++;
                                                    i12 = 11706;
                                                }
                                            }
                                            this.f45103m.notifyDataSetChanged();
                                        }
                                    } else {
                                        ArrayList<Fragment> c5 = navigationAdapter.c();
                                        for (int i15 = 0; i15 < c5.size(); i15++) {
                                            if (i15 == 0) {
                                                ((RankingItemFragment) c5.get(i15)).x0(gameRankingBean.getOnline_ranking(), 11706);
                                            } else if (i15 == 1) {
                                                ((RankingItemFragment) c5.get(i15)).x0(gameRankingBean.getSingle_ranking(), 11706);
                                            } else if (i15 == 2) {
                                                ((RankingItemFragment) c5.get(i15)).x0(gameRankingBean.getSimulator_ranking(), 11706);
                                            } else if (i15 == 3) {
                                                ((RankingItemFragment) c5.get(i15)).x0(gameRankingBean.getFree_play_ranking(), 11706);
                                            }
                                        }
                                    }
                                    view5 = view4;
                                    break;
                                case 25:
                                    k2Var.f45264a.setAdapter(new HomeGameListAdapter(this.f45093c, (List) mgpapaMainItemBean.getObject()));
                                    view5 = view4;
                                    break;
                                case 26:
                                    PAPAHomeBeanV7.TopChannelDTO topChannelDTO = (PAPAHomeBeanV7.TopChannelDTO) mgpapaMainItemBean.getObject();
                                    if (topChannelDTO != null) {
                                        if (topChannelDTO.getDiscover() != null) {
                                            final PAPAHomeBeanV7.HomeBeanDTO discover = topChannelDTO.getDiscover();
                                            MyImageLoader.h(((t2) view2).f45437d, discover.getBig_pic());
                                            ((t2) view2).f45436c.setText(discover.getTitle());
                                            ((t2) view2).f45435b.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.h3
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view7) {
                                                    o3.this.H(discover, view7);
                                                }
                                            });
                                        }
                                        if (topChannelDTO.getTheNew() != null) {
                                            PAPAHomeBeanV7.TheNewDTO theNew = topChannelDTO.getTheNew();
                                            ((t2) view2).f45444k.setText(theNew.getCount() + "款");
                                            ((t2) view2).f45442i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.f3
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view7) {
                                                    o3.this.I(view7);
                                                }
                                            });
                                            List<PAPAHomeBeanV7.ListDTO> list5 = theNew.getList();
                                            if (list5 != null && list5.size() > 0) {
                                                ((t2) view2).f45445l.removeAllViews();
                                                for (PAPAHomeBeanV7.ListDTO listDTO : list5) {
                                                    View inflate9 = LayoutInflater.from(this.f45093c).inflate(R.layout.mgpapa_home_item_new_icon, (ViewGroup) null);
                                                    MyImageLoader.h((SimpleDraweeView) inflate9.findViewById(R.id.newIcon), listDTO.getIco());
                                                    ((t2) view2).f45445l.addView(inflate9);
                                                }
                                            }
                                        }
                                        if (topChannelDTO.getBroadcast() != null) {
                                            final PAPAHomeBeanV7.HomeBeanDTO broadcast = topChannelDTO.getBroadcast();
                                            ((t2) view2).f45439f.setText(broadcast.getTitle());
                                            ((t2) view2).f45440g.setText(broadcast.getSub_title());
                                            MyImageLoader.h(((t2) view2).f45441h, broadcast.getBig_pic());
                                            ((t2) view2).f45438e.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.i3
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view7) {
                                                    o3.this.J(broadcast, view7);
                                                }
                                            });
                                        }
                                        String bg_color = topChannelDTO.getBg_color();
                                        if (TextUtils.isEmpty(bg_color)) {
                                            bg_color = "#F7F8F9";
                                        }
                                        GradientDrawable gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                                        gradientDrawable.setColors(new int[]{Color.parseColor(bg_color), Color.parseColor("#F7F8F9")});
                                        gradientDrawable.setGradientType(0);
                                        ((t2) view2).f45434a.setBackground(gradientDrawable);
                                    }
                                    view5 = view4;
                                    break;
                                case 27:
                                    List list6 = (List) mgpapaMainItemBean.getObject();
                                    if (list6 != null) {
                                        if (r1Var.f45395a.getAdapter() == null || !(r1Var.f45395a.getAdapter() instanceof FastEntryAdapter)) {
                                            r1Var.f45395a.setNestedScrollingEnabled(false);
                                            r1Var.f45395a.setHasFixedSize(true);
                                            FastEntryAdapter fastEntryAdapter = new FastEntryAdapter(list6);
                                            r1Var.f45395a.setLayoutManager(new GridLayoutManager(this.f45093c, 5));
                                            r1Var.f45395a.setAdapter(fastEntryAdapter);
                                            fastEntryAdapter.setOnItemClickListener(new s0(list6));
                                        } else {
                                            FastEntryAdapter fastEntryAdapter2 = (FastEntryAdapter) r1Var.f45395a.getAdapter();
                                            if (!list6.equals(fastEntryAdapter2.getData())) {
                                                fastEntryAdapter2.setNewData(list6);
                                            }
                                        }
                                    }
                                    view5 = view4;
                                    break;
                                case 28:
                                case 34:
                                case 37:
                                case 38:
                                    List list7 = (List) mgpapaMainItemBean.getObject();
                                    if (list7 != null && list7.size() >= 2) {
                                        s1 s1Var2 = m2Var;
                                        f0(s1Var2, (PAPAHomeBeanV7.HomeBeanDTO) list7.get(0), true, i4);
                                        f0(s1Var2, (PAPAHomeBeanV7.HomeBeanDTO) list7.get(1), false, i4);
                                    }
                                    view5 = view4;
                                    break;
                                case 29:
                                case 36:
                                    final PAPAHomeBeanV7.HomeBeanDTO homeBeanDTO = (PAPAHomeBeanV7.HomeBeanDTO) mgpapaMainItemBean.getObject();
                                    PAPAHomeBeanV7.GInfoDTO g_info = homeBeanDTO.getG_info();
                                    if (g_info != null) {
                                        MyImageLoader.h(p1Var.f45341b, g_info.getIco());
                                        p1Var.f45342c.setText(g_info.getName());
                                        if (!TextUtils.isEmpty(g_info.getTag_name())) {
                                            StringBuilder sb3 = new StringBuilder();
                                            String[] split3 = g_info.getTag_name().split(",");
                                            for (int i16 = 0; i16 < split3.length; i16++) {
                                                sb3.append(split3[i16]);
                                                sb3.append(" | ");
                                                if (i16 >= 1) {
                                                    p1Var.f45348i.setText(sb3.substring(0, sb3.length() - 3));
                                                }
                                            }
                                            p1Var.f45348i.setText(sb3.substring(0, sb3.length() - 3));
                                        }
                                    }
                                    if (com.join.mgps.Util.g2.i(homeBeanDTO.getV_url())) {
                                        MyImageLoader.d(p1Var.f45351l, R.drawable.banner_normal_icon, homeBeanDTO.getBig_pic());
                                        int i17 = i4 + 1;
                                        p1Var.f45351l.setTag(Integer.valueOf(i17));
                                        c.l lVar = new c.l(i17, homeBeanDTO.getV_url(), homeBeanDTO.getBig_pic(), homeBeanDTO.getIntentDataBean());
                                        lVar.n(homeBeanDTO.getPosition());
                                        this.f45102l.e(i17, lVar, new boolean[0]);
                                        p1Var.f45352m.setOnClickListener(new t0(i17));
                                    } else {
                                        p1Var.f45351l.setTag(null);
                                        p1Var.f45351l.setVisibility(0);
                                        MyImageLoader.d(p1Var.f45351l, R.drawable.banner_normal_icon, homeBeanDTO.getBig_pic());
                                    }
                                    p1Var.f45352m.setOnClickListener(new u0(homeBeanDTO));
                                    p1Var.f45351l.setOnClickListener(new v0(homeBeanDTO));
                                    p1Var.f45349j.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.l3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view7) {
                                            o3.this.K(homeBeanDTO, p1Var, i4, view7);
                                        }
                                    });
                                    p1Var.f45340a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.j3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view7) {
                                            o3.this.L(homeBeanDTO, view7);
                                        }
                                    });
                                    p1Var.f45350k.setVisibility(0);
                                    p1Var.f45353n.setVisibility(4);
                                    update(homeBeanDTO, p1Var.f45342c, p1Var.f45348i, p1Var.f45349j, p1Var.f45350k, p1Var.f45343d, p1Var.f45344e, p1Var.f45345f, p1Var.f45346g, p1Var.f45347h);
                                    view5 = view4;
                                    break;
                                case 30:
                                    final List list8 = (List) mgpapaMainItemBean.getObject();
                                    LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.f45093c, 0, false);
                                    linearLayoutManager2.setInitialPrefetchItemCount(5);
                                    HomeGameListGameNewsAdapter homeGameListGameNewsAdapter = new HomeGameListGameNewsAdapter(list8);
                                    homeGameListGameNewsAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.adapter.e3
                                        @Override // com.join.mgps.base.BaseQuickAdapter.j
                                        public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view7, int i18) {
                                            o3.this.M(list8, baseQuickAdapter, view7, i18);
                                        }
                                    });
                                    u1Var.f45453b.setHasFixedSize(true);
                                    u1Var.f45453b.setItemViewCacheSize(10);
                                    u1Var.f45453b.setNestedScrollingEnabled(false);
                                    u1Var.f45453b.setLayoutManager(linearLayoutManager2);
                                    u1Var.f45453b.setAdapter(homeGameListGameNewsAdapter);
                                    u1Var.f45453b.addOnScrollListener(new w0(list8, u1Var));
                                    view5 = view4;
                                    break;
                                case 31:
                                    PAPAItemTitle2 pAPAItemTitle2 = (PAPAItemTitle2) mgpapaMainItemBean.getObject();
                                    if (pAPAItemTitle2 != null) {
                                        z1Var.f45531a.setText(pAPAItemTitle2.getTitle());
                                        z1Var.f45532b.setText(pAPAItemTitle2.getSubTitle());
                                        z1Var.f45532b.setVisibility(TextUtils.isEmpty(pAPAItemTitle2.getSubTitle()) ? 8 : 0);
                                    }
                                    view5 = view4;
                                    break;
                                case 32:
                                    PAPAHomeBeanV7.RankingListDTO rankingListDTO = (PAPAHomeBeanV7.RankingListDTO) mgpapaMainItemBean.getObject();
                                    if (rankingListDTO == null || TextUtils.isEmpty(rankingListDTO.getTxt()) || rankingListDTO.getList() == null) {
                                        ((f2) r29).f45198a.setVisibility(8);
                                    } else {
                                        ((f2) r29).f45198a.setVisibility(0);
                                        List<List<PAPAHomeBeanV7.HomeBeanDTO>> list9 = rankingListDTO.getList();
                                        NavigationAdapter navigationAdapter3 = this.f45103m;
                                        if (navigationAdapter3 == null) {
                                            String[] split4 = rankingListDTO.getTxt().split(",");
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i18 = 0; i18 < Math.min(split4.length, list9.size()); i18++) {
                                                if (!TextUtils.isEmpty(split4[i18]) && list9.get(i18) != null) {
                                                    arrayList4.add(split4[i18]);
                                                    arrayList5.add(RankingItemV2Fragment.j0(true, split4[i18], list9.get(i18), i18 + 20501));
                                                }
                                            }
                                            NavigationAdapter navigationAdapter4 = new NavigationAdapter(this.f45094d.getChildFragmentManager(), arrayList5, arrayList4);
                                            this.f45103m = navigationAdapter4;
                                            navigationAdapter4.d(arrayList5, arrayList4);
                                            ((f2) r29).f45200c.setAdapter(this.f45103m);
                                            ((f2) r29).f45200c.setOffscreenPageLimit(3);
                                            ((f2) r29).f45199b.setViewPager(((f2) r29).f45200c);
                                            ((f2) r29).f45201d.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.b3
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view7) {
                                                    o3.this.N(view7);
                                                }
                                            });
                                            ((f2) r29).f45200c.addOnPageChangeListener(new x0(list9));
                                        } else {
                                            ArrayList<Fragment> c6 = navigationAdapter3.c();
                                            for (int i19 = 0; i19 < Math.min(c6.size(), list9.size()); i19++) {
                                                ((RankingItemV2Fragment) c6.get(i19)).r0(list9.get(i19));
                                            }
                                        }
                                    }
                                    view5 = view4;
                                    break;
                                case 33:
                                    float floatValue = ((Float) mgpapaMainItemBean.getObject()).floatValue();
                                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) ((l2) r17).f45272a.getLayoutParams();
                                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) floatValue;
                                    ((l2) r17).f45272a.setLayoutParams(layoutParams2);
                                    view5 = view4;
                                    break;
                                case 35:
                                    final List list10 = (List) mgpapaMainItemBean.getObject();
                                    if (list10 != null && list10.size() > 0) {
                                        if (i2Var3.f45244a.getAdapter() != null && (i2Var3.f45244a.getAdapter() instanceof HomeRecommendAdapter) && ((HomeRecommendAdapter) i2Var3.f45244a.getAdapter()).getData().equals(list10)) {
                                            ((HomeRecommendAdapter) i2Var3.f45244a.getAdapter()).setNewData(list10);
                                        } else {
                                            LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(this.f45093c, 0, false);
                                            HomeRecommendAdapter homeRecommendAdapter = new HomeRecommendAdapter(list10);
                                            ((SimpleItemAnimator) i2Var3.f45244a.getItemAnimator()).setSupportsChangeAnimations(false);
                                            i2Var3.f45244a.setHasFixedSize(true);
                                            i2Var3.f45244a.setLayoutManager(linearLayoutManager3);
                                            i2Var3.f45244a.setAdapter(homeRecommendAdapter);
                                            homeRecommendAdapter.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.adapter.d3
                                                @Override // com.join.mgps.base.BaseQuickAdapter.j
                                                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view7, int i20) {
                                                    o3.this.O(list10, baseQuickAdapter, view7, i20);
                                                }
                                            });
                                            homeRecommendAdapter.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.mgps.adapter.c3
                                                @Override // com.join.mgps.base.BaseQuickAdapter.h
                                                public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view7, int i20) {
                                                    o3.this.G(list10, i4, baseQuickAdapter, view7, i20);
                                                }
                                            });
                                            i2Var3.f45244a.addOnScrollListener(new y0(list10, i2Var3));
                                        }
                                    }
                                    view5 = view4;
                                    break;
                            }
                            return view5;
                        } catch (Exception e15) {
                            e = e15;
                            exc = e;
                            view3 = view5;
                            exc.printStackTrace();
                            return view3;
                        }
                    } catch (Exception e16) {
                        e = e16;
                    }
                } catch (Exception e17) {
                    e = e17;
                    view5 = view4;
                }
            } catch (Exception e18) {
                exc = e18;
                view3 = view4;
            }
        } catch (Exception e19) {
            e = e19;
            view2 = view;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 40;
    }

    void i0(h2 h2Var, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            h2Var.f45226f.setVisibility(8);
            h2Var.f45231k.setVisibility(8);
            h2Var.f45232l.setVisibility(8);
            h2Var.f45227g.setVisibility(0);
            h2Var.f45225e.setVisibility(0);
            return;
        }
        h2Var.f45226f.setVisibility(0);
        if (bool2.booleanValue()) {
            h2Var.f45231k.setVisibility(8);
            h2Var.f45232l.setVisibility(0);
        } else {
            h2Var.f45232l.setVisibility(8);
            h2Var.f45231k.setVisibility(0);
        }
        h2Var.f45227g.setVisibility(8);
        h2Var.f45225e.setVisibility(8);
    }
}
