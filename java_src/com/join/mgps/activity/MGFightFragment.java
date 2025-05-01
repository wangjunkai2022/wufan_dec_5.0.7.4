package com.join.mgps.activity;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.j256.ormlite.dao.ForeignCollection;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.basefragment.BaseLoadingFragment;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.DownloadUrlTable;
import com.join.mgps.db.tables.FightMainTable;
import com.join.mgps.db.tables.WarMatchAndLocalTable;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.FightDataBean;
import com.join.mgps.dto.FightMainDataBean;
import com.join.mgps.dto.FightSubDataBean;
import com.join.mgps.dto.LoadWarCenterBean;
import com.join.mgps.dto.WarIndexDataBean;
import com.join.mgps.dto.WarIndexResultMainBean;
import com.join.mgps.helper.MGFightUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.mg_fight_layout)
/* loaded from: classes.dex */
public class MGFightFragment extends BaseLoadingFragment implements AbsListView.OnScrollListener {

    /* renamed from: c  reason: collision with root package name */
    private Context f34296c;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f34298e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.e f34299f;

    /* renamed from: g  reason: collision with root package name */
    private com.join.mgps.adapter.p f34300g;

    /* renamed from: h  reason: collision with root package name */
    private List<DownloadTask> f34301h;

    /* renamed from: r  reason: collision with root package name */
    private LoadWarCenterBean f34311r;

    /* renamed from: s  reason: collision with root package name */
    private long f34312s;

    /* renamed from: u  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34314u;

    /* renamed from: v  reason: collision with root package name */
    private List<FightMainTable> f34315v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f34316w;

    /* renamed from: x  reason: collision with root package name */
    private int f34317x;

    /* renamed from: d  reason: collision with root package name */
    private String f34297d = getClass().getSimpleName();

    /* renamed from: i  reason: collision with root package name */
    private Map<String, DownloadTask> f34302i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    private List<FightMainTable> f34303j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34304k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34305l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34306m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34307n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34308o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34309p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private List<WarMatchAndLocalTable> f34310q = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    private boolean f34313t = false;

    /* renamed from: y  reason: collision with root package name */
    private int f34318y = 0;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (MGFightFragment.this.f34313t) {
                return;
            }
            MGFightFragment.this.j0();
        }
    }

    private WarMatchAndLocalTable g0(WarMatchAndLocalTable warMatchAndLocalTable) {
        if (this.f34302i != null && warMatchAndLocalTable.getCrc_link_type_val() != null) {
            if (this.f34302i.containsKey(warMatchAndLocalTable.getCrc_link_type_val())) {
                DownloadTask downloadTask = this.f34302i.get(warMatchAndLocalTable.getCrc_link_type_val());
                downloadTask.setCdn_down_switch(warMatchAndLocalTable.getCdn_down_switch());
                downloadTask.setOther_down_switch(warMatchAndLocalTable.getOther_down_switch());
                downloadTask.setPay_game_amount(warMatchAndLocalTable.getPay_game_amount());
                ForeignCollection<DownloadUrlTable> tp_down_url = warMatchAndLocalTable.getTp_down_url();
                ArrayList arrayList = new ArrayList();
                for (DownloadUrlTable downloadUrlTable : tp_down_url) {
                    arrayList.add(downloadUrlTable.getDownUrlBean());
                }
                downloadTask.setTp_down_url(arrayList);
                this.f34302i.put(warMatchAndLocalTable.getCrc_link_type_val(), downloadTask);
            } else {
                this.f34302i.put(warMatchAndLocalTable.getCrc_link_type_val(), MGFightUtils.warDataToTask(warMatchAndLocalTable));
            }
        }
        return warMatchAndLocalTable;
    }

    private void k0(DownloadTask downloadTask) {
        if (this.f34302i == null || downloadTask.getCrc_link_type_val() == null || !this.f34302i.containsKey(downloadTask.getCrc_link_type_val())) {
            return;
        }
        this.f34302i.get(downloadTask.getCrc_link_type_val()).setStatus(0);
        this.f34302i.get(downloadTask.getCrc_link_type_val()).setSpeed("0");
        this.f34302i.get(downloadTask.getCrc_link_type_val()).setCurrentSize(0L);
        this.f34300g.notifyDataSetChanged();
    }

    private void l0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f34302i;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            map.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            boolean z4 = false;
            for (DownloadTask downloadTask2 : this.f34301h) {
                if (downloadTask.getCrc_link_type_val().equals(downloadTask2.getCrc_link_type_val())) {
                    downloadTask2.setStatus(downloadTask.getStatus());
                    z4 = true;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f34300g.notifyDataSetChanged();
    }

    private void m0(DownloadTask downloadTask) {
        try {
            if (this.f34302i != null && downloadTask.getCrc_link_type_val() != null) {
                if (this.f34302i.containsKey(downloadTask.getCrc_link_type_val())) {
                    this.f34302i.put(downloadTask.getCrc_link_type_val(), downloadTask);
                } else {
                    this.f34301h.add(downloadTask);
                    this.f34302i.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f34311r.setDownloadTasksMap(this.f34302i);
        this.f34300g.h(this.f34311r);
    }

    private void n0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f34302i;
        if (map == null || downloadTask == null) {
            return;
        }
        if (map != null && downloadTask.getCrc_link_type_val() != null && !this.f34302i.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f34301h.add(downloadTask);
            this.f34302i.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        if (this.f34302i.get(downloadTask.getCrc_link_type_val()) == null) {
            return;
        }
        if (this.f34302i.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f34302i.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        for (DownloadTask downloadTask2 : this.f34301h) {
            if (downloadTask.getCrc_link_type_val().equals(downloadTask2.getCrc_link_type_val())) {
                downloadTask2.setStatus(downloadTask.getStatus());
                downloadTask2.setVer(downloadTask.getVer());
                downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
                downloadTask2.setSource_ver(downloadTask.getSource_ver());
                downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
            }
        }
        this.f34300g.notifyDataSetChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0385 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void s0() {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGFightFragment.s0():void");
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int W() {
        return R.layout.mg_fight_layout;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int X() {
        return R.id.container;
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected int Z() {
        return com.join.mgps.Util.c0.a(getActivity(), 48.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f34299f = com.join.mgps.rpc.impl.d.P1();
        this.f34316w.setVisibility(8);
        this.f34296c = getActivity();
        com.join.mgps.Util.d0.a().d(this);
        com.papa.sim.statistic.p.l(this.f34296c).q2(AccountUtil_.getInstance_(getActivity()).getUid());
        com.papa.sim.statistic.p.l(this.f34296c).v2(AccountUtil_.getInstance_(getActivity()).getUid());
        List<DownloadTask> d5 = p1.f.K().d();
        this.f34301h = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f34301h) {
                this.f34302i.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f34311r = new LoadWarCenterBean();
        com.join.mgps.adapter.p pVar = new com.join.mgps.adapter.p(this);
        this.f34300g = pVar;
        this.f34298e.setAdapter((ListAdapter) pVar);
        this.f34300g.h(this.f34311r);
        this.f34298e.setOnScrollListener(this);
        this.f34298e.setPullRefreshEnable(new a());
        loadData();
    }

    public CommonRequestBean h0(int i4) {
        return RequestBeanUtil.getInstance(this.f34296c).loadWarIndexRequestBean(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0() {
        List<FightMainTable> list;
        this.f34314u = b2.o0.n().d();
        this.f34315v = b2.r.n().d();
        List<WarMatchAndLocalTable> list2 = this.f34314u;
        if ((list2 != null && list2.size() > 0) || ((list = this.f34315v) != null && list.size() > 0)) {
            List<FightMainTable> list3 = this.f34315v;
            if (list3 != null && list3.size() > 0) {
                this.f34303j.clear();
                this.f34303j.addAll(this.f34315v);
            }
            List<WarMatchAndLocalTable> list4 = this.f34314u;
            if (list4 != null && list4.size() > 0) {
                this.f34304k.clear();
                this.f34305l.clear();
                this.f34306m.clear();
                this.f34307n.clear();
                this.f34308o.clear();
                this.f34309p.clear();
                this.f34310q.clear();
                for (int i4 = 0; i4 < this.f34314u.size(); i4++) {
                    WarMatchAndLocalTable warMatchAndLocalTable = this.f34314u.get(i4);
                    switch (warMatchAndLocalTable.getWarType()) {
                        case 0:
                            this.f34304k.add(g0(warMatchAndLocalTable));
                            break;
                        case 1:
                            this.f34305l.add(g0(warMatchAndLocalTable));
                            break;
                        case 2:
                            this.f34306m.add(g0(warMatchAndLocalTable));
                            break;
                        case 3:
                            this.f34307n.add(g0(warMatchAndLocalTable));
                            break;
                        case 4:
                            this.f34308o.add(g0(warMatchAndLocalTable));
                            break;
                        case 5:
                            this.f34309p.add(g0(warMatchAndLocalTable));
                            break;
                        case 6:
                            this.f34310q.add(g0(warMatchAndLocalTable));
                            break;
                    }
                }
            }
            q0();
        }
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        WarIndexResultMainBean<List<WarIndexDataBean>> i4;
        if (com.join.android.app.common.utils.j.j(this.f34296c)) {
            this.f34313t = true;
            new ArrayList();
            try {
                try {
                    i4 = this.f34299f.i(h0(1));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (i4 != null) {
                    List<WarIndexDataBean> data = i4.getMessages().getData();
                    if (data != null && data.size() > 0) {
                        r0(data.get(0));
                    } else {
                        p0();
                    }
                    this.f34313t = false;
                    return;
                }
                p0();
                this.f34313t = false;
                return;
            } catch (Throwable th) {
                p0();
                this.f34313t = false;
                throw th;
            }
        }
        p0();
    }

    @Override // com.join.mgps.basefragment.BaseLoadingFragment
    protected void loadData() {
        i0();
    }

    void o0(List<FightDataBean> list, int i4) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            FightMainDataBean main = list.get(i5).getMain();
            FightSubDataBean fightSubDataBean = list.get(i5).getSub().get(0);
            if (i4 == 0) {
                FightMainTable fightMainTable = new FightMainTable();
                fightMainTable.setTitle(main.getTitle());
                fightMainTable.setLabel(main.getLabel());
                fightMainTable.setPic_remote(main.getPic_remote());
                fightMainTable.setIco_remote(main.getIco_remote());
                fightMainTable.setTitle_type(main.getTitle_type());
                fightMainTable.setMargin(main.getMargin());
                fightMainTable.setSub_title(main.getSub_title());
                fightMainTable.setModel_type(main.getModel_type());
                fightMainTable.setCrc_link_type_val(fightSubDataBean.getCrc_link_type_val());
                fightMainTable.setLink_type(fightSubDataBean.getLink_type());
                fightMainTable.setJump_type(fightSubDataBean.getJump_type());
                fightMainTable.setTpl_type(fightSubDataBean.getTpl_type());
                fightMainTable.setLink_type_val(fightSubDataBean.getLink_type_val());
                fightMainTable.setDown_status(fightSubDataBean.getGame_info().getDown_status());
                fightMainTable.setPay_game_amount((fightSubDataBean.getGame_info() == null || fightSubDataBean.getGame_info().getPay_tag_info() == null) ? 0 : fightSubDataBean.getGame_info().getPay_tag_info().getPay_game_amount());
                b2.r.n().k(fightMainTable);
                if (fightMainTable.getLink_type() == 1) {
                    WarMatchAndLocalTable warDataToTable = MGFightUtils.warDataToTable(fightSubDataBean.getGame_info());
                    warDataToTable.setWarType(i4);
                    warDataToTable.setPic_remote(main.getPic_remote());
                    if (fightSubDataBean.getGame_info() != null && fightSubDataBean.getGame_info().getPay_tag_info() != null) {
                        warDataToTable.setPay_game_amount(fightSubDataBean.getGame_info().getPay_tag_info().getPay_game_amount());
                    }
                    b2.o0.n().k(warDataToTable);
                }
            } else {
                WarMatchAndLocalTable warDataToTable2 = MGFightUtils.warDataToTable(fightSubDataBean.getGame_info());
                warDataToTable2.setWarType(i4);
                warDataToTable2.setPic_remote(main.getPic_remote());
                warDataToTable2.setMain_title(main.getTitle());
                warDataToTable2.setMain_sub_title(main.getSub_title());
                if (fightSubDataBean.getGame_info() != null && fightSubDataBean.getGame_info().getPay_tag_info() != null) {
                    warDataToTable2.setPay_game_amount(fightSubDataBean.getGame_info().getPay_tag_info().getPay_game_amount());
                }
                b2.o0.n().k(warDataToTable2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
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
                    a5.setStatus(7);
                    t0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    t0(a5, 4);
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
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

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (isHidden() || System.currentTimeMillis() - this.f34312s < 7200000) {
            return;
        }
        j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f34317x = (i5 + i4) - 1;
        this.f34318y = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        List<FightMainTable> list;
        try {
            List<WarMatchAndLocalTable> list2 = this.f34314u;
            if ((list2 == null || list2.size() <= 0) && ((list = this.f34315v) == null || list.size() <= 0)) {
                c0();
            }
            com.join.mgps.Util.l2.a(this.f34296c).b(getString(R.string.net_connect_failed));
            this.f34298e.v();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        a0();
        this.f34311r.setDownloadTasksMap(this.f34302i);
        this.f34311r.setFightMainTables(this.f34303j);
        this.f34311r.setWaradInfoDataBeans(this.f34304k);
        this.f34311r.setHotGameInfoDataBeans(this.f34305l);
        this.f34311r.setPkGameInfoDataBeans(this.f34306m);
        this.f34311r.setPkPassInfoDataBeans(this.f34307n);
        this.f34311r.setPkMatchingInfoDataBeans(this.f34308o);
        this.f34311r.setPkLocalInfoDataBeans(this.f34309p);
        this.f34311r.setPkRoomInfoDataBeans(this.f34310q);
        this.f34300g.h(this.f34311r);
        this.f34300g.notifyDataSetChanged();
        this.f34298e.v();
        this.f34298e.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(WarIndexDataBean warIndexDataBean) {
        List<FightMainTable> list;
        this.f34312s = System.currentTimeMillis();
        List<FightDataBean> warad = warIndexDataBean.getWarad();
        List<FightDataBean> hotgame = warIndexDataBean.getHotgame();
        List<FightDataBean> pkgame = warIndexDataBean.getPkgame();
        List<FightDataBean> pkpass = warIndexDataBean.getPkpass();
        List<FightDataBean> pkmatching = warIndexDataBean.getPkmatching();
        List<FightDataBean> pklocal = warIndexDataBean.getPklocal();
        List<FightDataBean> pkroom = warIndexDataBean.getPkroom();
        b2.o0.n().a();
        b2.r.n().a();
        o0(warad, 0);
        o0(hotgame, 1);
        o0(pkgame, 2);
        o0(pkpass, 3);
        o0(pkmatching, 4);
        o0(pklocal, 5);
        o0(pkroom, 6);
        this.f34314u = b2.o0.n().d();
        this.f34315v = b2.r.n().d();
        List<WarMatchAndLocalTable> list2 = this.f34314u;
        if ((list2 != null && list2.size() > 0) || ((list = this.f34315v) != null && list.size() > 0)) {
            List<FightMainTable> list3 = this.f34315v;
            if (list3 != null && list3.size() > 0) {
                this.f34303j.clear();
                this.f34303j.addAll(this.f34315v);
            }
            List<WarMatchAndLocalTable> list4 = this.f34314u;
            if (list4 != null && list4.size() > 0) {
                this.f34304k.clear();
                this.f34305l.clear();
                this.f34306m.clear();
                this.f34307n.clear();
                this.f34308o.clear();
                this.f34309p.clear();
                this.f34310q.clear();
                for (int i4 = 0; i4 < this.f34314u.size(); i4++) {
                    WarMatchAndLocalTable warMatchAndLocalTable = this.f34314u.get(i4);
                    switch (warMatchAndLocalTable.getWarType()) {
                        case 0:
                            this.f34304k.add(g0(warMatchAndLocalTable));
                            break;
                        case 1:
                            this.f34305l.add(g0(warMatchAndLocalTable));
                            break;
                        case 2:
                            this.f34306m.add(g0(warMatchAndLocalTable));
                            break;
                        case 3:
                            this.f34307n.add(g0(warMatchAndLocalTable));
                            break;
                        case 4:
                            this.f34308o.add(g0(warMatchAndLocalTable));
                            break;
                        case 5:
                            this.f34309p.add(g0(warMatchAndLocalTable));
                            break;
                        case 6:
                            this.f34310q.add(g0(warMatchAndLocalTable));
                            break;
                    }
                }
            }
            q0();
            return;
        }
        p0();
    }

    void t0(DownloadTask downloadTask, int i4) {
        if (i4 == 4) {
            Map<String, DownloadTask> map = this.f34302i;
            if (map == null || map.isEmpty()) {
                return;
            }
            s0();
        } else if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                    m0(downloadTask);
                    return;
                case 3:
                    k0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    n0(downloadTask);
                    return;
                case 6:
                    l0(downloadTask);
                    return;
            }
        }
    }
}
