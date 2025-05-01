package com.join.mgps.activity;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.e;
import com.join.mgps.adapter.o5;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SimulatorAreaDataBean;
import com.join.mgps.enums.ConstantIntEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_simulator_area)
/* loaded from: classes.dex */
public class SimulatorAreaActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f37758c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f37759d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f37760e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f37761f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f37762g;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: h  reason: collision with root package name */
    CustomerDownloadView f37763h;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    String f37765j;

    /* renamed from: m  reason: collision with root package name */
    List<DownloadTask> f37768m;

    /* renamed from: o  reason: collision with root package name */
    private com.join.mgps.rpc.impl.d f37770o;

    /* renamed from: p  reason: collision with root package name */
    private o5 f37771p;

    /* renamed from: b  reason: collision with root package name */
    private Context f37757b = this;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    int f37764i = ConstantIntEnum.FBA.value();

    /* renamed from: k  reason: collision with root package name */
    Map<String, DownloadTask> f37766k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    Map<String, DownloadTask> f37767l = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private Map<String, DownloadTask> f37769n = new ConcurrentHashMap();

    /* renamed from: q  reason: collision with root package name */
    private List<o5.g> f37772q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private int f37773r = 1;

    /* renamed from: s  reason: collision with root package name */
    private String f37774s = "m1";

    /* renamed from: t  reason: collision with root package name */
    private boolean f37775t = false;

    /* renamed from: u  reason: collision with root package name */
    private int f37776u = 0;

    /* renamed from: v  reason: collision with root package name */
    private int f37777v = 0;

    /* renamed from: w  reason: collision with root package name */
    private List<Map<String, Object>> f37778w = null;

    /* renamed from: x  reason: collision with root package name */
    private List<SimulatorAreaDataBean.GameTypeBean> f37779x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    int f37780y = 0;

    /* renamed from: z  reason: collision with root package name */
    int f37781z = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (SimulatorAreaActivity.this.f37775t) {
                return;
            }
            SimulatorAreaActivity.this.f37774s = "m2";
            SimulatorAreaActivity simulatorAreaActivity = SimulatorAreaActivity.this;
            simulatorAreaActivity.k0(simulatorAreaActivity.f37774s, SimulatorAreaActivity.this.f37773r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (SimulatorAreaActivity.this.f37775t) {
                return;
            }
            SimulatorAreaActivity.this.f37773r = 1;
            SimulatorAreaActivity.this.f37774s = "m1";
            SimulatorAreaActivity simulatorAreaActivity = SimulatorAreaActivity.this;
            simulatorAreaActivity.k0(simulatorAreaActivity.f37774s, 1);
        }
    }

    private void r0(SimulatorAreaDataBean simulatorAreaDataBean) {
        List<DownloadTask> list;
        if (simulatorAreaDataBean == null || (list = this.f37768m) == null || list.size() == 0) {
            return;
        }
        List<CollectionBeanSubBusiness> top_5 = simulatorAreaDataBean.getTop_5();
        if (top_5 != null && top_5.size() > 0) {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : top_5) {
                Iterator<DownloadTask> it2 = this.f37768m.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        DownloadTask next = it2.next();
                        if (collectionBeanSubBusiness.getMod_info() != null) {
                            ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                            DownloadTask downloadTask = this.f37769n.get(mod_info.getMain_game_id());
                            boolean z4 = true;
                            boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                            DownloadTask downloadTask2 = this.f37769n.get(mod_info.getMod_game_id());
                            z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                            if (!z4 || !z5) {
                                if (z4) {
                                    if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                        collectionBeanSubBusiness.setDownloadTask(next);
                                        break;
                                    }
                                } else if (z5) {
                                    if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                        collectionBeanSubBusiness.setDownloadTask(next);
                                        break;
                                    }
                                } else {
                                    DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                                    if (F == null) {
                                        F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                                    }
                                    if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                        collectionBeanSubBusiness.setDownloadTask(next);
                                        break;
                                    }
                                }
                            } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                                break;
                            }
                        } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(next);
                            break;
                        }
                    }
                }
            }
        }
        List<CollectionBeanSubBusiness> the_new_release = simulatorAreaDataBean.getThe_new_release();
        if (the_new_release != null && the_new_release.size() > 0) {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness2 : the_new_release) {
                Iterator<DownloadTask> it3 = this.f37768m.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        DownloadTask next2 = it3.next();
                        if (next2.getCrc_link_type_val().equals(collectionBeanSubBusiness2.getCrc_sign_id())) {
                            collectionBeanSubBusiness2.setDownloadTask(next2);
                            break;
                        }
                    }
                }
            }
        }
        List<SimulatorAreaDataBean.CollectionRecommendBean> collection_recommend = simulatorAreaDataBean.getCollection_recommend();
        if (collection_recommend == null || collection_recommend.size() <= 0) {
            return;
        }
        for (SimulatorAreaDataBean.CollectionRecommendBean collectionRecommendBean : collection_recommend) {
            List<CollectionBeanSubBusiness> game_list = collectionRecommendBean.getGame_list();
            if (game_list != null && game_list.size() > 0) {
                for (CollectionBeanSubBusiness collectionBeanSubBusiness3 : game_list) {
                    Iterator<DownloadTask> it4 = this.f37768m.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            DownloadTask next3 = it4.next();
                            if (next3.getCrc_link_type_val().equals(collectionBeanSubBusiness3.getCrc_sign_id())) {
                                collectionBeanSubBusiness3.setDownloadTask(next3);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f37768m.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f37769n.remove(next.getCrc_link_type_val());
                it2.remove();
                for (o5.g gVar : this.f37772q) {
                    if (gVar.f45564b == 2) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) gVar.f45563a;
                        if (collectionBeanSubBusiness.getMod_info() != null) {
                            DownloadTask downloadTask2 = this.f37769n.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                            DownloadTask downloadTask3 = this.f37769n.get(collectionBeanSubBusiness.getGame_id());
                            if (downloadTask2 == null && downloadTask3 == null) {
                                collectionBeanSubBusiness.setDownloadTask(null);
                            } else if (downloadTask2 != null) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                            } else if (downloadTask3 != null) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                            } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                                collectionBeanSubBusiness.setDownloadTask(null);
                            }
                        } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    }
                }
            }
        }
        this.f37771p.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f37769n;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f37771p.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.f37768m, downloadTask);
        Map<String, DownloadTask> map = this.f37769n;
        if (map != null) {
            if (map.containsKey(downloadTask.getCrc_link_type_val())) {
                this.f37769n.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            } else {
                this.f37768m.add(downloadTask);
                for (o5.g gVar : this.f37772q) {
                    if (gVar.f45564b == 2) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) gVar.f45563a;
                        if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    }
                }
                this.f37769n.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f37771p.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f37769n;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f37768m.add(downloadTask);
            for (o5.g gVar : this.f37772q) {
                if (gVar.f45564b == 2) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) gVar.f45563a;
                    if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    }
                }
            }
            this.f37769n.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f37769n.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f37771p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f37770o = com.join.mgps.rpc.impl.d.P1();
        org.greenrobot.eventbus.c.f().t(this.f37757b);
        this.f37762g.setVisibility(0);
        this.f37763h.setVisibility(0);
        String str = this.f37765j;
        if (str != null && !str.isEmpty()) {
            this.f37761f.setText(this.f37765j);
        } else {
            this.f37761f.setText("街机");
        }
        getDownloadTaskInfo();
        List<DownloadTask> d5 = p1.f.K().d();
        this.f37768m = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f37768m) {
                this.f37769n.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f37760e.setPreLoadCount(10);
        this.f37760e.setVerticalScrollBarEnabled(false);
        this.f37760e.setPullLoadEnable(new a());
        this.f37760e.setPullRefreshEnable(new b());
        this.f37760e.setOnScrollListener(this);
        o5 o5Var = new o5(this.f37757b, this.f37764i, this.f37761f.getText().toString());
        this.f37771p = o5Var;
        this.f37772q = o5Var.g();
        this.f37760e.setAdapter((ListAdapter) this.f37771p);
        k0(this.f37774s, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37767l
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37767l
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37766k
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37766k
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37767l
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37767l
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37767l
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37767l
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f37766k
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37767l
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37767l
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37766k
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f37766k
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.SimulatorAreaActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f37767l.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f37766k.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str, int i4) {
        ResultMainBean<SimulatorAreaDataBean> K1;
        if (com.join.android.app.common.utils.j.j(this.f37757b.getApplicationContext())) {
            try {
                this.f37775t = true;
                if (this.f37764i == ConstantIntEnum.FBA.value()) {
                    K1 = this.f37770o.K1(RequestBeanUtil.getInstance(this.f37757b).getSimulatorIndexRequestBean(str, i4));
                } else if (this.f37764i == ConstantIntEnum.FC.value()) {
                    K1 = this.f37770o.N1(RequestBeanUtil.getInstance(this.f37757b).getSimulatorIndexRequestBean(str, i4));
                } else if (this.f37764i == ConstantIntEnum.GBA.value()) {
                    K1 = this.f37770o.L1(RequestBeanUtil.getInstance(this.f37757b).getSimulatorIndexRequestBean(str, i4));
                } else if (this.f37764i == ConstantIntEnum.PSP.value()) {
                    K1 = this.f37770o.M1(RequestBeanUtil.getInstance(this.f37757b).getSimulatorIndexRequestBean(str, i4));
                } else {
                    K1 = this.f37770o.K1(RequestBeanUtil.getInstance(this.f37757b).getSimulatorIndexRequestBean(str, i4));
                }
                if (K1 != null && K1.getFlag() == 1 && K1.getMessages() != null) {
                    SimulatorAreaDataBean data = K1.getMessages().getData();
                    if (data != null) {
                        o0(data);
                        return;
                    } else {
                        n0();
                        return;
                    }
                } else if (this.f37771p.getCount() == 0) {
                    n0();
                    return;
                } else {
                    s0(false);
                    return;
                }
            } catch (Exception e5) {
                n0();
                e5.printStackTrace();
                return;
            }
        }
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        this.f37759d.setVisibility(8);
        this.f37758c.setVisibility(0);
        this.f37760e.setVisibility(8);
        this.f37773r = 1;
        this.f37774s = "m1";
        k0("m1", 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void m0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        o5 o5Var = this.f37771p;
        if (o5Var != null) {
            o5Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.f37759d.setVisibility(0);
        this.f37758c.setVisibility(8);
        this.f37760e.setVisibility(8);
        s0(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025e  */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(com.join.mgps.dto.SimulatorAreaDataBean r13) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.SimulatorAreaActivity.o0(com.join.mgps.dto.SimulatorAreaDataBean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this.f37757b);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask downloadTask;
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        if (nVar.c() == 8) {
            for (int i4 = this.f37776u; i4 <= this.f37777v; i4++) {
                o5.g gVar = (o5.g) this.f37760e.getItemAtPosition(i4);
                if (gVar != null && gVar.f45564b == 2 && (downloadTask = ((CollectionBeanSubBusiness) gVar.f45563a).getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    View childAt = this.f37760e.getChildAt(i4 - this.f37776u);
                    if (childAt.getTag() instanceof e.b) {
                        e.b bVar = (e.b) childAt.getTag();
                        try {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                            if (f5 == null) {
                                return;
                            }
                            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                            if (a5.getSize() == 0) {
                                TextView textView = bVar.f44338j;
                                textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                TextView textView2 = bVar.f44338j;
                                textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            if (a5.getStatus() == 12) {
                                bVar.f44341m.setProgress((int) f5.getProgress());
                            } else {
                                bVar.f44340l.setProgress((int) f5.getProgress());
                            }
                            if (a5.getStatus() == 2) {
                                TextView textView3 = bVar.f44339k;
                                textView3.setText(f5.getSpeed() + "/S");
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f37772q.size(); i5++) {
                o5.g gVar2 = this.f37772q.get(i5);
                if (gVar2 != null && gVar2.f45564b == 2 && a5.getCrc_link_type_val().equals(((CollectionBeanSubBusiness) gVar2.f45563a).getCrc_sign_id())) {
                    ((CollectionBeanSubBusiness) this.f37772q.get(i5).f45563a).setDownloadTask(a5);
                }
            }
        }
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 != 6) {
                    if (c5 != 7) {
                        if (c5 != 48) {
                            switch (c5) {
                                case 10:
                                    updateUI(a5, 7);
                                    break;
                                case 12:
                                    updateUI(a5, 8);
                                    break;
                                case 13:
                                    updateUI(a5, 9);
                                    break;
                            }
                        }
                    } else {
                        updateUI(a5, 3);
                    }
                } else {
                    updateUI(a5, 6);
                }
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
        this.f37771p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f37777v = (i5 + i4) - 1;
        this.f37776u = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        SearchHintActivity_.G1(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0(boolean z4) {
        List<SimulatorAreaDataBean.GameTypeBean> list;
        this.f37775t = false;
        this.f37760e.u();
        this.f37760e.v();
        if (z4) {
            return;
        }
        this.f37760e.setNoMore();
        if (this.f37771p.h() || (list = this.f37779x) == null || list.size() <= 0) {
            return;
        }
        this.f37772q.add(new o5.g("游戏分类", 4));
        for (SimulatorAreaDataBean.GameTypeBean gameTypeBean : this.f37779x) {
            this.f37772q.add(new o5.g(gameTypeBean, 5));
        }
        this.f37771p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f37767l.size();
        int size2 = this.f37766k.size();
        this.f37763h.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f37763h.d();
        } else {
            this.f37763h.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    receiveStart(downloadTask);
                    return;
                case 3:
                    receiveDelete(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }
}
