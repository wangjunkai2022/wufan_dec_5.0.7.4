package com.join.mgps.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.PaPaStandAloneV2Adapter;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionInfo;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PaPaBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.StandAloneListBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_papa_standalone_v2)
/* loaded from: classes.dex */
public class PaPaStandAloneV2Fragment extends Fragment implements AbsListView.OnScrollListener {
    public static final int A = 2;
    public static final int B = 3;

    /* renamed from: x  reason: collision with root package name */
    private static final int f52576x = 20;

    /* renamed from: y  reason: collision with root package name */
    private static final int f52577y = 3;

    /* renamed from: z  reason: collision with root package name */
    public static final int f52578z = 1;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.e f52582e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f52583f;

    /* renamed from: g  reason: collision with root package name */
    PaPaStandAloneV2Adapter f52584g;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52586i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f52587j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    PtrClassicFrameLayout f52588k;

    /* renamed from: l  reason: collision with root package name */
    private Activity f52589l;

    /* renamed from: m  reason: collision with root package name */
    String f52590m;

    /* renamed from: n  reason: collision with root package name */
    String f52591n;

    /* renamed from: o  reason: collision with root package name */
    private PaPaBean f52592o;

    /* renamed from: s  reason: collision with root package name */
    private int f52596s;

    /* renamed from: t  reason: collision with root package name */
    private int f52597t;

    /* renamed from: b  reason: collision with root package name */
    int f52579b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f52580c = 1;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52581d = false;

    /* renamed from: h  reason: collision with root package name */
    List<PaPaBean> f52585h = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private boolean f52593p = false;

    /* renamed from: q  reason: collision with root package name */
    private List<DownloadTask> f52594q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, DownloadTask> f52595r = new ConcurrentHashMap();

    /* renamed from: u  reason: collision with root package name */
    private boolean f52598u = false;

    /* renamed from: v  reason: collision with root package name */
    private final View.OnClickListener f52599v = new d();

    /* renamed from: w  reason: collision with root package name */
    private View.OnClickListener f52600w = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!PaPaStandAloneV2Fragment.this.isActivityFinish() && PaPaStandAloneV2Fragment.this.f52581d) {
                if (!com.join.android.app.common.utils.j.j(PaPaStandAloneV2Fragment.this.f52589l)) {
                    PaPaStandAloneV2Fragment.this.f52583f.u();
                    PaPaStandAloneV2Fragment paPaStandAloneV2Fragment = PaPaStandAloneV2Fragment.this;
                    paPaStandAloneV2Fragment.showToast(paPaStandAloneV2Fragment.getString(R.string.net_connect_failed));
                    return;
                }
                PaPaStandAloneV2Fragment.this.b0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (PaPaStandAloneV2Fragment.this.isActivityFinish()) {
                return;
            }
            if (com.join.android.app.common.utils.j.j(PaPaStandAloneV2Fragment.this.f52589l)) {
                PaPaStandAloneV2Fragment.this.f52580c = 1;
                PaPaStandAloneV2Fragment.this.b0();
                return;
            }
            PaPaStandAloneV2Fragment.this.f52583f.v();
            PaPaStandAloneV2Fragment paPaStandAloneV2Fragment = PaPaStandAloneV2Fragment.this;
            paPaStandAloneV2Fragment.showToast(paPaStandAloneV2Fragment.getString(R.string.net_connect_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            List<PaPaBean> list = PaPaStandAloneV2Fragment.this.f52585h;
            if (list == null || list.size() <= 0 || i4 >= PaPaStandAloneV2Fragment.this.f52585h.size() || PaPaStandAloneV2Fragment.this.f52585h.get(i4).getType() != PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value()) {
                return;
            }
            PaPaStandAloneV2Fragment.this.d0((AppBean) PaPaStandAloneV2Fragment.this.f52585h.get(i4).getTypeValue());
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag() instanceof AppBean) {
                PaPaStandAloneV2Fragment.this.d0((AppBean) view.getTag());
            } else if (view.getTag() instanceof CollectionInfo) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(2);
                intentDateBean.setTpl_type("4");
                intentDateBean.setCrc_link_type_val(((CollectionInfo) view.getTag()).getCollection_id());
                IntentUtil.getInstance().intentActivity(PaPaStandAloneV2Fragment.this.f52589l, intentDateBean);
            } else if (view.getTag() instanceof GameHeadAd.SubInfo) {
                IntentUtil.getInstance().intentActivity(PaPaStandAloneV2Fragment.this.f52589l, ((GameHeadAd.SubInfo) view.getTag()).getIntentDataBean());
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppBean appBean = (AppBean) view.getTag();
            if (appBean == null) {
                return;
            }
            DownloadTask downloadTask = appBean.getDownloadTask();
            String plugin_num = appBean.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(appBean.getDown_url_remote());
                if (downloadTask == null) {
                    downloadTask = appBean.getDownloadtaskDown();
                }
                UtilsMy.T2(downloadTask, PaPaStandAloneV2Fragment.this.f52589l);
                IntentUtil.getInstance().intentActivity(PaPaStandAloneV2Fragment.this.f52589l, intentDateBean);
            } else if (downloadTask == null) {
                if (UtilsMy.o0(appBean.getTag_info()) && com.join.android.app.common.utils.e.l0(PaPaStandAloneV2Fragment.this.f52589l).d(PaPaStandAloneV2Fragment.this.f52589l, appBean.getPackageName())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(PaPaStandAloneV2Fragment.this.f52589l).l(PaPaStandAloneV2Fragment.this.f52589l, appBean.getPackageName());
                    if (!g2.i(appBean.getVer()) || l4.d() >= Integer.parseInt(appBean.getVer())) {
                        com.join.android.app.common.utils.e.l0(PaPaStandAloneV2Fragment.this.f52589l);
                        APKUtils.a0(PaPaStandAloneV2Fragment.this.f52589l, appBean.getPackageName());
                        return;
                    }
                }
                if (UtilsMy.y0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(PaPaStandAloneV2Fragment.this.f52589l, appBean.getCrc_sign_id());
                } else {
                    UtilsMy.W0(PaPaStandAloneV2Fragment.this.f52589l, appBean);
                }
            } else {
                int status = downloadTask != null ? downloadTask.getStatus() : 0;
                if (UtilsMy.w0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    status = 43;
                }
                if (status != 0) {
                    if (status == 13) {
                        com.php25.PDownload.d.l(PaPaStandAloneV2Fragment.this.f52589l, downloadTask);
                        return;
                    }
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(PaPaStandAloneV2Fragment.this.f52589l, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(PaPaStandAloneV2Fragment.this.f52589l)) {
                                            PaPaStandAloneV2Fragment.this.showToast("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(PaPaStandAloneV2Fragment.this.getContext(), downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (com.join.android.app.common.utils.j.j(PaPaStandAloneV2Fragment.this.f52589l)) {
                                                    UtilsMy.I2(PaPaStandAloneV2Fragment.this.f52589l, downloadTask);
                                                    return;
                                                } else {
                                                    PaPaStandAloneV2Fragment.this.showToast("无网络连接");
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, PaPaStandAloneV2Fragment.this.f52589l);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, PaPaStandAloneV2Fragment.this.f52589l);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                if (UtilsMy.y0(appBean.getPay_tag_info(), appBean.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(PaPaStandAloneV2Fragment.this.f52589l, appBean.getCrc_sign_id());
                } else if (appBean.getDown_status() == 5) {
                    UtilsMy.l1(PaPaStandAloneV2Fragment.this.f52589l, downloadTask);
                } else {
                    UtilsMy.R0(PaPaStandAloneV2Fragment.this.f52589l, downloadTask, appBean.getTp_down_url(), appBean.getOther_down_switch(), appBean.getCdn_down_switch());
                }
            }
        }
    }

    private void Z(List<PaPaBean> list, List<DownloadTask> list2) {
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : list2) {
            for (PaPaBean paPaBean : list) {
                boolean z4 = false;
                if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_HORIZONTAL.value()) {
                    for (AppBean appBean : (List) paPaBean.getTypeValue()) {
                        if (appBean.getMod_info() != null) {
                            ModInfoBean mod_info = appBean.getMod_info();
                            DownloadTask downloadTask2 = this.f52595r.get(mod_info.getMain_game_id());
                            boolean d5 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask2.getPackageName());
                            DownloadTask downloadTask3 = this.f52595r.get(mod_info.getMod_game_id());
                            boolean F = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : com.join.mgps.va.overmind.d.o().F(downloadTask3.getPackageName());
                            if (F && d5) {
                                if (downloadTask.getCrc_link_type_val().equals(appBean.getCrc_sign_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            } else if (F) {
                                if (appBean.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean.getMod_info().getMod_game_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            } else if (d5) {
                                if (downloadTask.getCrc_link_type_val().equals(appBean.getCrc_sign_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            } else {
                                DownloadTask F2 = appBean.getMod_info() != null ? p1.f.K().F(appBean.getMod_info().getMod_game_id()) : null;
                                if (F2 == null) {
                                    F2 = p1.f.K().F(appBean.getCrc_sign_id());
                                }
                                if (F2 != null && downloadTask.getCrc_link_type_val().equals(F2.getCrc_link_type_val())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            }
                        } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                            appBean.setDownloadTask(downloadTask);
                        }
                    }
                } else if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value()) {
                    AppBean appBean2 = (AppBean) paPaBean.getTypeValue();
                    if (appBean2.getMod_info() != null) {
                        ModInfoBean mod_info2 = appBean2.getMod_info();
                        DownloadTask downloadTask4 = this.f52595r.get(mod_info2.getMain_game_id());
                        boolean d6 = (downloadTask4 == null || downloadTask4.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask4.getPackageName());
                        DownloadTask downloadTask5 = this.f52595r.get(mod_info2.getMod_game_id());
                        if (downloadTask5 != null && downloadTask5.getStatus() == 5) {
                            z4 = com.join.mgps.va.overmind.d.o().F(downloadTask5.getPackageName());
                        }
                        if (z4 && d6) {
                            if (downloadTask.getCrc_link_type_val().equals(appBean2.getCrc_sign_id())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        } else if (z4) {
                            if (appBean2.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean2.getMod_info().getMod_game_id())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        } else if (d6) {
                            if (downloadTask.getCrc_link_type_val().equals(appBean2.getCrc_sign_id())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        } else {
                            DownloadTask F3 = appBean2.getMod_info() != null ? p1.f.K().F(appBean2.getMod_info().getMod_game_id()) : null;
                            if (F3 == null) {
                                F3 = p1.f.K().F(appBean2.getCrc_sign_id());
                            }
                            if (F3 != null && downloadTask.getCrc_link_type_val().equals(F3.getCrc_link_type_val())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        }
                    } else if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        appBean2.setDownloadTask(downloadTask);
                    }
                }
            }
        }
    }

    private void c0() {
        if (com.join.android.app.common.utils.j.j(this.f52589l)) {
            p0();
            b0();
            return;
        }
        n0();
    }

    private void expDiscountGame() {
        try {
            try {
                if (isAdded() && !this.f52593p) {
                    this.f52593p = true;
                    int lastVisiblePosition = this.f52583f.getLastVisiblePosition();
                    for (int i4 = 0; i4 <= lastVisiblePosition; i4++) {
                        PaPaBean paPaBean = this.f52585h.get(i4);
                        if (!paPaBean.isHasExposure()) {
                            paPaBean.setHasExposure(true);
                            if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_HORIZONTAL.value()) {
                                if (paPaBean.getTypeValue() instanceof List) {
                                    for (AppBean appBean : (List) paPaBean.getTypeValue()) {
                                        if (UtilsMy.e2(appBean)) {
                                            try {
                                                Ext ext = new Ext();
                                                ext.setResultCode("discount_game");
                                                ext.setScenesCode(getClass().getSimpleName());
                                                Data data = new Data();
                                                data.setGameId(Long.parseLong(appBean.getGame_id()));
                                                com.papa.sim.statistic.p.l(com.join.android.app.common.http.c.f14630a).Y(Event.expGameAdPage, ext, data);
                                            } catch (Exception e5) {
                                                e5.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            } else if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value() && (paPaBean.getTypeValue() instanceof AppBean)) {
                                AppBean appBean2 = (AppBean) paPaBean.getTypeValue();
                                if (UtilsMy.e2(appBean2)) {
                                    try {
                                        Ext ext2 = new Ext();
                                        ext2.setResultCode("discount_game");
                                        ext2.setScenesCode(getClass().getSimpleName());
                                        Data data2 = new Data();
                                        data2.setGameId(Long.parseLong(appBean2.getGame_id()));
                                        com.papa.sim.statistic.p.l(com.join.android.app.common.http.c.f14630a).Y(Event.expGameAdPage, ext2, data2);
                                    } catch (Exception e6) {
                                        e6.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                this.f52593p = false;
            }
        } catch (Exception unused) {
        }
    }

    private void f0(ResultMainBean<List<StandAloneListBean>> resultMainBean) {
        if (isActivityFinish()) {
            return;
        }
        if (resultMainBean != null && resultMainBean.getMessages() != null && resultMainBean.getMessages().getData() != null) {
            if (resultMainBean.getFlag() == 0) {
                q0();
                return;
            }
            List<StandAloneListBean> data = resultMainBean.getMessages().getData();
            if (data != null && data.size() > 0) {
                this.f52581d = true;
            } else {
                this.f52581d = false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a0(data));
            u0(arrayList);
            hideLoading();
            return;
        }
        o0();
    }

    public static PaPaStandAloneV2Fragment h0(int i4) {
        PaPaStandAloneV2Fragment_ paPaStandAloneV2Fragment_ = new PaPaStandAloneV2Fragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        paPaStandAloneV2Fragment_.setArguments(bundle);
        return paPaStandAloneV2Fragment_;
    }

    private void j0(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f52594q.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f52595r.remove(next.getCrc_link_type_val());
                    it2.remove();
                    for (PaPaBean paPaBean : this.f52585h) {
                        if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_HORIZONTAL.value()) {
                            for (AppBean appBean : (List) paPaBean.getTypeValue()) {
                                if (appBean.getMod_info() != null) {
                                    DownloadTask downloadTask2 = this.f52595r.get(appBean.getMod_info().getMod_game_id());
                                    DownloadTask downloadTask3 = this.f52595r.get(appBean.getGame_id());
                                    if (downloadTask2 == null && downloadTask3 == null) {
                                        appBean.setDownloadTask(null);
                                    } else if (downloadTask2 != null) {
                                        appBean.setDownloadTask(downloadTask2);
                                    } else if (downloadTask3 != null) {
                                        appBean.setDownloadTask(downloadTask3);
                                    } else if (appBean.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                                        appBean.setDownloadTask(null);
                                    }
                                } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                    appBean.setDownloadTask(null);
                                }
                            }
                        } else if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value()) {
                            AppBean appBean2 = (AppBean) paPaBean.getTypeValue();
                            if (appBean2.getMod_info() != null) {
                                DownloadTask F = p1.f.K().F(appBean2.getMod_info().getMod_game_id());
                                DownloadTask F2 = p1.f.K().F(appBean2.getGame_id());
                                if (F == null && F2 == null) {
                                    appBean2.setDownloadTask(null);
                                } else if (F != null) {
                                    appBean2.setDownloadTask(F);
                                } else if (F2 != null) {
                                    appBean2.setDownloadTask(F2);
                                } else if (appBean2.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                                    appBean2.setDownloadTask(null);
                                }
                            } else if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                appBean2.setDownloadTask(null);
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f52584g.notifyDataSetChanged();
    }

    private void k0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52595r;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f52584g.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void l0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f52594q, downloadTask);
        if (!this.f52595r.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52594q.add(downloadTask);
            this.f52595r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        r0(downloadTask);
        this.f52584g.notifyDataSetChanged();
    }

    private void m0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52595r;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52594q.add(downloadTask);
            this.f52595r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        r0(downloadTask);
        DownloadTask downloadTask2 = this.f52595r.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        this.f52584g.notifyDataSetChanged();
    }

    private void r0(DownloadTask downloadTask) {
        try {
            for (PaPaBean paPaBean : this.f52585h) {
                boolean z4 = false;
                if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_HORIZONTAL.value()) {
                    for (AppBean appBean : (List) paPaBean.getTypeValue()) {
                        if (appBean.getMod_info() != null) {
                            ModInfoBean mod_info = appBean.getMod_info();
                            DownloadTask downloadTask2 = this.f52595r.get(mod_info.getMain_game_id());
                            boolean z5 = true;
                            boolean z6 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                            DownloadTask downloadTask3 = this.f52595r.get(mod_info.getMod_game_id());
                            if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                                z5 = false;
                            }
                            if (z5 && z6) {
                                if (downloadTask.getCrc_link_type_val().equals(appBean.getCrc_sign_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            } else if (z5) {
                                if (appBean.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean.getMod_info().getMod_game_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            } else if (z6) {
                                if (downloadTask.getCrc_link_type_val().equals(appBean.getCrc_sign_id())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            } else {
                                DownloadTask F = appBean.getMod_info() != null ? p1.f.K().F(appBean.getMod_info().getMod_game_id()) : null;
                                if (F == null) {
                                    F = p1.f.K().F(appBean.getCrc_sign_id());
                                }
                                if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                    appBean.setDownloadTask(downloadTask);
                                }
                            }
                        } else if (appBean.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                            appBean.setDownloadTask(downloadTask);
                        }
                    }
                } else if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value()) {
                    AppBean appBean2 = (AppBean) paPaBean.getTypeValue();
                    if (appBean2.getMod_info() != null) {
                        ModInfoBean mod_info2 = appBean2.getMod_info();
                        DownloadTask downloadTask4 = this.f52595r.get(mod_info2.getMain_game_id());
                        boolean d5 = (downloadTask4 == null || downloadTask4.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask4.getPackageName());
                        DownloadTask downloadTask5 = this.f52595r.get(mod_info2.getMod_game_id());
                        if (downloadTask5 != null && downloadTask5.getStatus() == 5) {
                            z4 = com.join.mgps.va.overmind.d.o().F(downloadTask5.getPackageName());
                        }
                        if (z4 && d5) {
                            if (downloadTask.getCrc_link_type_val().equals(appBean2.getCrc_sign_id())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        } else if (z4) {
                            if (appBean2.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(appBean2.getMod_info().getMod_game_id())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        } else if (d5) {
                            if (downloadTask.getCrc_link_type_val().equals(appBean2.getCrc_sign_id())) {
                                appBean2.setDownloadTask(downloadTask);
                            }
                        } else {
                            DownloadTask F2 = appBean2.getMod_info() != null ? p1.f.K().F(appBean2.getMod_info().getMod_game_id()) : null;
                            if (F2 == null) {
                                F2 = p1.f.K().F(appBean2.getCrc_sign_id());
                            }
                            if (F2 != null && downloadTask.getCrc_link_type_val().equals(F2.getCrc_link_type_val())) {
                                appBean2.setDownloadTask(downloadTask);
                                return;
                            }
                        }
                    } else if (appBean2.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        appBean2.setDownloadTask(downloadTask);
                    }
                } else {
                    continue;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void s0() {
        for (int i4 = this.f52597t; i4 <= this.f52596s; i4++) {
            PaPaBean paPaBean = (PaPaBean) this.f52583f.getItemAtPosition(i4);
            if (paPaBean != null) {
                if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value()) {
                    if (i4 >= 14) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("tbl>>>i=");
                        sb.append(i4);
                    }
                    DownloadTask downloadTask = ((AppBean) paPaBean.getTypeValue()).getDownloadTask();
                    if (i4 >= 14) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("tbl>>>downloadTask:");
                        sb2.append(downloadTask);
                    }
                    if (downloadTask != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                        View childAt = this.f52583f.getChildAt(i4 - this.f52597t);
                        if (childAt.getTag() instanceof PaPaStandAloneV2Adapter.e) {
                            PaPaStandAloneV2Adapter.e eVar = (PaPaStandAloneV2Adapter.e) childAt.getTag();
                            try {
                                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                                if (f5 == null) {
                                    return;
                                }
                                long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                                if (downloadTask.getSize() == 0) {
                                    TextView textView = eVar.f43861k;
                                    textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                } else {
                                    TextView textView2 = eVar.f43861k;
                                    textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                }
                                if (downloadTask.getStatus() == 12) {
                                    eVar.f43855e.setProgress((int) f5.getProgress());
                                } else {
                                    eVar.f43856f.setProgress((int) f5.getProgress());
                                }
                                if (downloadTask.getStatus() == 2) {
                                    TextView textView3 = eVar.f43862l;
                                    textView3.setText(f5.getSpeed() + "/S");
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (paPaBean.getType() == PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_HORIZONTAL.value()) {
                    List list = (List) paPaBean.getTypeValue();
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        DownloadTask downloadTask2 = ((AppBean) list.get(i5)).getDownloadTask();
                        if (downloadTask2 != null && (downloadTask2.getStatus() == 2 || downloadTask2.getStatus() == 12)) {
                            View childAt2 = this.f52583f.getChildAt(i4 - this.f52597t);
                            if (childAt2.getTag() instanceof PaPaStandAloneV2Adapter.g) {
                                PaPaStandAloneV2Adapter.g gVar = (PaPaStandAloneV2Adapter.g) childAt2.getTag();
                                try {
                                    DownloadTask f6 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                                    if (f6 == null) {
                                        return;
                                    }
                                    TextView textView4 = (TextView) gVar.f43866a.getLayoutManager().findViewByPosition(i5).findViewById(R.id.mgListviewItemInstall);
                                    if (textView4 != null) {
                                        textView4.setText(f6.getProgress() + "%");
                                    }
                                } catch (Exception e6) {
                                    e6.printStackTrace();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
    }

    List<PaPaBean> a0(List<StandAloneListBean> list) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; list.size() > 0 && i4 < list.size(); i4++) {
            StandAloneListBean standAloneListBean = list.get(i4);
            PaPaBean paPaBean = new PaPaBean();
            String title = standAloneListBean.getTitle();
            if (!g2.h(title)) {
                CollectionInfo collectionInfo = new CollectionInfo();
                collectionInfo.setTitle(title);
                paPaBean.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_TITLE.value());
                paPaBean.setTypeValue(collectionInfo);
            }
            if (standAloneListBean.getType().equals("game_list_h") && standAloneListBean.getGame_list() != null && standAloneListBean.getGame_list().size() > 0) {
                int i5 = this.f52579b;
                if (i5 == 1) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                } else if (i5 == 2 && this.f52580c < 2) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                }
                for (AppBean appBean : standAloneListBean.getGame_list()) {
                    appBean.set_from(107);
                    appBean.set_from_type(117);
                }
                PaPaBean paPaBean2 = new PaPaBean();
                paPaBean2.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_HORIZONTAL.value());
                paPaBean2.setTypeValue(standAloneListBean.getGame_list());
                arrayList.add(paPaBean2);
            } else if (standAloneListBean.getType().equals("game_list_v") && standAloneListBean.getGame_list() != null && standAloneListBean.getGame_list().size() > 0) {
                int i6 = this.f52579b;
                if (i6 == 1) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                } else if (i6 == 2 && this.f52580c < 2) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                }
                for (int i7 = 0; i7 < standAloneListBean.getGame_list().size(); i7++) {
                    PaPaBean paPaBean3 = new PaPaBean();
                    paPaBean3.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_VERTICAL.value());
                    AppBean appBean2 = standAloneListBean.getGame_list().get(i7);
                    appBean2.set_from(107);
                    appBean2.set_from_type(117);
                    paPaBean3.setTypeValue(appBean2);
                    arrayList.add(paPaBean3);
                }
            } else if (standAloneListBean.getType().equals("tag_type") && standAloneListBean.getList() != null && standAloneListBean.getList().size() > 0) {
                int i8 = this.f52579b;
                if (i8 == 1) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                } else if (i8 == 2 && this.f52580c < 2) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < standAloneListBean.getList().size(); i9++) {
                    arrayList2.add(standAloneListBean.getList().get(i9));
                    if (arrayList2.size() == 3 || i9 == standAloneListBean.getList().size() - 1) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList2);
                        PaPaBean paPaBean4 = new PaPaBean();
                        paPaBean4.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_TAG.value());
                        paPaBean4.setTypeValue(arrayList3);
                        arrayList.add(paPaBean4);
                        arrayList2.clear();
                    }
                }
                PaPaBean paPaBean5 = new PaPaBean();
                paPaBean5.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_LINE_40.value());
                arrayList.add(paPaBean5);
            } else if (standAloneListBean.getType().equals("company_type") && standAloneListBean.getList() != null && standAloneListBean.getList().size() > 0) {
                int i10 = this.f52579b;
                if (i10 == 1) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                } else if (i10 == 2 && this.f52580c < 2) {
                    arrayList.add(this.f52592o);
                    arrayList.add(paPaBean);
                }
                PaPaBean paPaBean6 = new PaPaBean();
                paPaBean6.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_COMPANY.value());
                paPaBean6.setTypeValue(standAloneListBean.getList());
                arrayList.add(paPaBean6);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52582e = com.join.mgps.rpc.impl.d.P1();
        g0();
        PaPaStandAloneV2Adapter paPaStandAloneV2Adapter = new PaPaStandAloneV2Adapter(this.f52589l, this.f52585h, this.f52600w);
        this.f52584g = paPaStandAloneV2Adapter;
        paPaStandAloneV2Adapter.d(this.f52599v);
        this.f52588k.j(true);
        this.f52583f.setPreLoadCount(10);
        this.f52583f.setAdapter((ListAdapter) this.f52584g);
        this.f52583f.setPullLoadEnable(new a());
        this.f52583f.setPullRefreshEnable(new b());
        this.f52583f.setOnItemClickListener(new c());
        this.f52583f.setOnScrollListener(this);
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        try {
            PaPaBean paPaBean = new PaPaBean();
            this.f52592o = paPaBean;
            paPaBean.setType(PaPaBean.PaPaBeanTypes.TYPE_STANDSALONE_LINE_20.value());
            int i4 = this.f52579b;
            if (i4 == 1) {
                e0(this.f52582e.T0(RequestBeanUtil.getInstance(this.f52589l).getStandAloneOne()));
            } else if (i4 == 2) {
                f0(this.f52582e.F1(RequestBeanUtil.getInstance(this.f52589l).getStandAloneTwo(this.f52580c)));
            }
        } catch (Exception e5) {
            com.join.mgps.Util.v0.b("PaPaList", "fetchData exception:" + e5.getMessage());
            o0();
        }
    }

    void d0(AppBean appBean) {
        IntentUtil.getInstance().intentActivity(this.f52589l, appBean.getIntentDataBean());
    }

    void e0(ResultMainBean<List<StandAloneListBean>> resultMainBean) {
        if (isActivityFinish()) {
            return;
        }
        if (resultMainBean != null && resultMainBean.getMessages() != null && resultMainBean.getMessages().getData() != null) {
            if (resultMainBean.getFlag() == 0) {
                q0();
                return;
            }
            List<StandAloneListBean> data = resultMainBean.getMessages().getData();
            if (data.size() > 0) {
                this.f52581d = false;
            }
            u0(a0(data));
            hideLoading();
            return;
        }
        o0();
    }

    void g0() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.f52594q = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f52594q) {
            this.f52595r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        if (isDetached()) {
            return;
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f52588k;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(0);
        }
        LinearLayout linearLayout = this.f52587j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f52586i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void i0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        PaPaStandAloneV2Adapter paPaStandAloneV2Adapter = this.f52584g;
        if (paPaStandAloneV2Adapter != null) {
            paPaStandAloneV2Adapter.notifyDataSetChanged();
        }
    }

    boolean isActivityFinish() {
        Activity activity = this.f52589l;
        if (activity == null || activity.isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && this.f52589l.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        if (isDetached()) {
            return;
        }
        this.f52583f.u();
        this.f52583f.v();
        this.f52588k.setVisibility(8);
        this.f52587j.setVisibility(8);
        this.f52586i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        if (this.f52580c <= 1) {
            n0();
        }
        XListView2 xListView2 = this.f52583f;
        if (xListView2 != null) {
            xListView2.u();
            this.f52583f.v();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f52589l = (Activity) context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.join.mgps.Util.d0.a().d(this);
        this.f52579b = getArguments().getInt("type");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f52589l = null;
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        Map<String, DownloadTask> map;
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            t0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    t0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    t0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    if (isHidden() || (map = this.f52595r) == null || map.isEmpty() || this.f52598u) {
                        return;
                    }
                    s0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            t0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            t0(a5, 8);
                            return;
                        case 13:
                            t0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            t0(a5, 5);
        } else {
            t0(a5, 2);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f52596s = (i5 + i4) - 1;
        this.f52597t = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f52598u = i4 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        if (isDetached()) {
            return;
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f52588k;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
        LinearLayout linearLayout = this.f52587j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52586i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        this.f52581d = false;
        if (this.f52580c <= 1) {
            this.f52588k.setVisibility(8);
            this.f52587j.setVisibility(8);
            this.f52586i.setVisibility(8);
        }
        this.f52583f.v();
        this.f52583f.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52589l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (isActivityFinish()) {
            return;
        }
        l2.a(this.f52589l).b(str);
    }

    void t0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    l0(downloadTask);
                    return;
                case 3:
                    j0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    m0(downloadTask);
                    return;
                case 6:
                    k0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(List<PaPaBean> list) {
        if (this.f52580c <= 1) {
            this.f52585h.clear();
            list.add(0, this.f52592o);
        }
        Z(list, this.f52594q);
        if (this.f52581d) {
            this.f52580c++;
        }
        if (list != null && list.size() > 0) {
            this.f52585h.addAll(list);
        }
        XListView2 xListView2 = this.f52583f;
        if (xListView2 != null) {
            xListView2.u();
            this.f52583f.v();
            if (!this.f52581d) {
                this.f52583f.setNoMore();
                if (this.f52585h.size() <= 0) {
                    return;
                }
            }
        }
        this.f52584g.notifyDataSetChanged();
    }
}
