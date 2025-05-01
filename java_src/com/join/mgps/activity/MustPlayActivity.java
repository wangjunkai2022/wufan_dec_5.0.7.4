package com.join.mgps.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.e;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.MustPlayAd;
import com.join.mgps.dto.MustPlayAdSub;
import com.join.mgps.dto.MustPlayData;
import com.join.mgps.dto.MustPlayNetDataBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.helper.MGFightUtils;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Where;
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
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.must_play_layout)
/* loaded from: classes.dex */
public class MustPlayActivity extends BaseActivity implements AbsListView.OnScrollListener, View.OnClickListener {
    private static final String A = "MustPlayActivity";

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.e f35281b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f35282c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f35283d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f35284e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f35285f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f35286g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f35287h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f35288i;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: j  reason: collision with root package name */
    ImageView f35289j;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: k  reason: collision with root package name */
    CustomerDownloadView f35290k;

    /* renamed from: l  reason: collision with root package name */
    private Context f35291l;

    /* renamed from: m  reason: collision with root package name */
    private List<v1.c> f35292m;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.adapter.d2 f35293n;

    /* renamed from: p  reason: collision with root package name */
    List<DownloadTask> f35295p;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f35301v;

    /* renamed from: w  reason: collision with root package name */
    private LinearLayout f35302w;

    /* renamed from: x  reason: collision with root package name */
    private SimpleDraweeView f35303x;

    /* renamed from: y  reason: collision with root package name */
    private SimpleDraweeView f35304y;

    /* renamed from: o  reason: collision with root package name */
    private int f35294o = 1;

    /* renamed from: q  reason: collision with root package name */
    private int f35296q = 0;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, DownloadTask> f35297r = new ConcurrentHashMap();

    /* renamed from: s  reason: collision with root package name */
    Map<String, DownloadTask> f35298s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    Map<String, DownloadTask> f35299t = new HashMap();

    /* renamed from: u  reason: collision with root package name */
    private int f35300u = 0;

    /* renamed from: z  reason: collision with root package name */
    boolean f35305z = false;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            MustPlayActivity mustPlayActivity = MustPlayActivity.this;
            if (mustPlayActivity.f35305z) {
                return;
            }
            mustPlayActivity.loadData(mustPlayActivity.f35294o);
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            MustPlayActivity mustPlayActivity = MustPlayActivity.this;
            if (mustPlayActivity.f35305z) {
                return;
            }
            mustPlayActivity.f35294o = 1;
            MustPlayActivity.this.loadData(1);
        }
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f35295p.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f35297r.remove(next.getCrc_link_type_val());
                it2.remove();
                for (v1.c cVar : this.f35292m) {
                    if (!cVar.c()) {
                        for (CollectionBeanSubBusiness collectionBeanSubBusiness : cVar.a()) {
                            if (collectionBeanSubBusiness.getMod_info() != null) {
                                DownloadTask downloadTask2 = this.f35297r.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                                DownloadTask downloadTask3 = this.f35297r.get(collectionBeanSubBusiness.getCrc_sign_id());
                                if (downloadTask2 == null && downloadTask3 == null) {
                                    collectionBeanSubBusiness.setDownloadTask(null);
                                } else if (downloadTask2 != null) {
                                    collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                                } else if (downloadTask3 != null) {
                                    collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                    collectionBeanSubBusiness.setDownloadTask(null);
                                }
                            } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            }
                        }
                    }
                }
            }
        }
        this.f35282c.requestLayout();
        this.f35293n.notifyDataSetChanged();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f35297r;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            map.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
            this.f35282c.requestLayout();
            this.f35293n.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.B4(this.f35295p, downloadTask);
        if (this.f35297r.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f35297r.get(downloadTask.getCrc_link_type_val()).setStatus(downloadTask.getStatus());
        } else {
            this.f35295p.add(downloadTask);
            this.f35297r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        this.f35293n.notifyDataSetChanged();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f35297r;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f35295p.add(downloadTask);
            this.f35297r.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.f35297r.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f35282c.requestLayout();
        this.f35293n.notifyDataSetChanged();
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        try {
            for (v1.c cVar : this.f35292m) {
                if (!cVar.c()) {
                    Iterator<CollectionBeanSubBusiness> it2 = cVar.a().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            CollectionBeanSubBusiness next = it2.next();
                            if (next.getMod_info() != null) {
                                ModInfoBean mod_info = next.getMod_info();
                                DownloadTask downloadTask2 = this.f35297r.get(mod_info.getMain_game_id());
                                boolean z4 = true;
                                boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                                DownloadTask downloadTask3 = this.f35297r.get(mod_info.getMod_game_id());
                                if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                                    z4 = false;
                                }
                                if (!z4 || !z5) {
                                    if (z4) {
                                        if (next.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(next.getMod_info().getMod_game_id())) {
                                            next.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    } else if (z5) {
                                        if (downloadTask.getCrc_link_type_val().equals(next.getCrc_sign_id())) {
                                            next.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    } else {
                                        DownloadTask F = next.getMod_info() != null ? p1.f.K().F(next.getMod_info().getMod_game_id()) : null;
                                        if (F == null) {
                                            F = p1.f.K().F(next.getCrc_sign_id());
                                        }
                                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                            next.setDownloadTask(downloadTask);
                                            break;
                                        }
                                    }
                                } else if (downloadTask.getCrc_link_type_val().equals(next.getCrc_sign_id())) {
                                    next.setDownloadTask(downloadTask);
                                    break;
                                }
                            } else if (next.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                                next.setDownloadTask(downloadTask);
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        for (int i4 = this.f35300u; i4 <= this.f35296q; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f35282c.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f35282c.getChildAt(i4 - this.f35300u);
                if (childAt.getTag() instanceof e.b) {
                    e.b bVar = (e.b) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = bVar.f44338j;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = bVar.f44338j;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            bVar.f44341m.setProgress((int) f5.getProgress());
                        } else {
                            bVar.f44340l.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f35281b = com.join.mgps.rpc.impl.d.P1();
        try {
            this.f35291l = this;
            com.join.mgps.Util.d0.a().d(this);
            List<DownloadTask> d5 = p1.f.K().d();
            this.f35295p = d5;
            if (d5 != null && d5.size() > 0) {
                for (DownloadTask downloadTask : this.f35295p) {
                    this.f35297r.put(downloadTask.getCrc_link_type_val(), downloadTask);
                }
            }
            this.f35285f.setText("必玩游戏");
            this.f35289j.setVisibility(0);
            this.f35290k.setVisibility(0);
            getDownloadTaskInfo();
            this.f35292m = new ArrayList();
            this.f35293n = new com.join.mgps.adapter.d2(this, this.f35292m);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout_play_must_header, (ViewGroup) null);
            this.f35301v = linearLayout;
            this.f35302w = (LinearLayout) linearLayout.findViewById(R.id.palyMustHeaderLayout);
            this.f35303x = (SimpleDraweeView) this.f35301v.findViewById(R.id.playLeft);
            this.f35304y = (SimpleDraweeView) this.f35301v.findViewById(R.id.playRight);
            this.f35303x.setOnClickListener(this);
            this.f35304y.setOnClickListener(this);
            this.f35282c.addHeaderView(this.f35301v);
            this.f35282c.setAdapter((ListAdapter) this.f35293n);
            this.f35282c.setPreLoadCount(15);
            this.f35282c.setPullLoadEnable(new a());
            this.f35282c.setPullRefreshEnable(new b());
            loadData(this.f35294o);
            this.f35282c.setOnScrollListener(this);
        } catch (Exception unused) {
        }
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35298s
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35298s
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35299t
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35299t
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35298s
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35298s
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35298s
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35298s
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f35299t
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35298s
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35298s
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35299t
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f35299t
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MustPlayActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f35298s.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f35299t.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        this.f35294o = 1;
        loadData(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        this.f35282c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void k0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.d2 d2Var = this.f35293n;
        if (d2Var != null) {
            d2Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(List<MustPlayAd> list) {
        for (int i4 = 0; i4 < 2; i4++) {
            MustPlayAd mustPlayAd = list.get(i4);
            this.f35302w.setVisibility(0);
            if (i4 == 0) {
                MyImageLoader.h(this.f35303x, mustPlayAd.getMain().getPic_remote());
                IntentDateBean intentDateBean = new IntentDateBean();
                MustPlayAdSub mustPlayAdSub = mustPlayAd.getSub().get(0);
                if (mustPlayAdSub != null) {
                    intentDateBean.setLink_type_val(mustPlayAdSub.getLink_type_val());
                    intentDateBean.setJump_type(Integer.parseInt(mustPlayAdSub.getJump_type()));
                    intentDateBean.setCrc_link_type_val(mustPlayAdSub.getCrc_link_type_val());
                    intentDateBean.setLink_type(Integer.parseInt(mustPlayAdSub.getLink_type()));
                    intentDateBean.setTpl_type(mustPlayAdSub.getTpl_type());
                }
                this.f35303x.setTag(intentDateBean);
                this.f35303x.setVisibility(0);
            } else if (i4 == 1) {
                MyImageLoader.h(this.f35304y, mustPlayAd.getMain().getPic_remote());
                IntentDateBean intentDateBean2 = new IntentDateBean();
                MustPlayAdSub mustPlayAdSub2 = mustPlayAd.getSub().get(0);
                if (mustPlayAdSub2 != null) {
                    intentDateBean2.setLink_type_val(mustPlayAdSub2.getLink_type_val());
                    intentDateBean2.setJump_type(Integer.parseInt(mustPlayAdSub2.getJump_type()));
                    intentDateBean2.setCrc_link_type_val(mustPlayAdSub2.getCrc_link_type_val());
                    intentDateBean2.setLink_type(Integer.parseInt(mustPlayAdSub2.getLink_type()));
                    intentDateBean2.setTpl_type(mustPlayAdSub2.getTpl_type());
                }
                this.f35304y.setTag(intentDateBean2);
                this.f35304y.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData(int i4) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f35291l) && !this.f35305z) {
                try {
                    this.f35305z = true;
                    ArrayList arrayList = new ArrayList();
                    ResultMainBean<MustPlayData> s12 = this.f35281b.s1(RequestBeanUtil.getInstance(getApplicationContext()).getMustplay(i4));
                    if (s12 != null) {
                        if (s12.getFlag() == 1) {
                            List<MustPlayAd> head_ad = s12.getMessages().getData().getHead_ad();
                            if (head_ad != null && head_ad.size() > 0) {
                                l0(head_ad);
                            }
                            List<MustPlayNetDataBean> list = s12.getMessages().getData().getList();
                            if (list != null) {
                                if (list.size() > 0) {
                                    for (MustPlayNetDataBean mustPlayNetDataBean : list) {
                                        arrayList.add(new v1.c(true, mustPlayNetDataBean.getTitle()));
                                        List<CollectionBeanSub> gamelist = mustPlayNetDataBean.getGamelist();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (CollectionBeanSub collectionBeanSub : gamelist) {
                                            arrayList2.add(new CollectionBeanSubBusiness(collectionBeanSub));
                                            if (arrayList2.size() == 4) {
                                                arrayList.add(new v1.c(false, (List<CollectionBeanSubBusiness>) arrayList2));
                                                arrayList2 = new ArrayList();
                                            }
                                        }
                                        if (arrayList2.size() > 0) {
                                            arrayList.add(new v1.c(false, (List<CollectionBeanSubBusiness>) arrayList2));
                                        }
                                    }
                                    int i5 = this.f35294o + i4;
                                    this.f35294o = i5;
                                    m0(arrayList, i5);
                                } else {
                                    j0();
                                }
                            } else {
                                n0();
                            }
                        } else {
                            j0();
                        }
                    } else {
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLodingFailed();
                }
                this.f35305z = false;
                return;
            }
            n0();
            showLodingFailed();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(List<v1.c> list, int i4) {
        if (list == null || list.size() == 0) {
            return;
        }
        com.join.mgps.Util.v0.c("mustplay mustPlayx.size= " + list.size() + " mustPlay.size=" + this.f35292m.size() + "   pn=" + i4);
        this.f35287h.setVisibility(8);
        this.f35286g.setVisibility(8);
        this.f35283d.setVisibility(0);
        for (v1.c cVar : list) {
            if (!cVar.c()) {
                MGFightUtils.updateStatus(this, cVar.a(), this.f35295p, this.f35297r);
            }
        }
        if (i4 == 2) {
            this.f35292m.clear();
            this.f35292m.addAll(list);
        } else {
            this.f35292m.addAll(list);
        }
        this.f35293n.c(this.f35292m);
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.f35282c.u();
        this.f35282c.v();
        this.f35305z = false;
    }

    @Override // android.view.View.OnClickListener
    @Click({R.id.playLeft, R.id.playRight, R.id.title_normal_search_img, R.id.title_normal_download_cdv})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.playLeft /* 2131300366 */:
                IntentUtil.getInstance().intentActivity(this, (IntentDateBean) this.f35303x.getTag());
                return;
            case R.id.playRight /* 2131300367 */:
                IntentUtil.getInstance().intentActivity(this, (IntentDateBean) this.f35304y.getTag());
                return;
            case R.id.title_normal_download_cdv /* 2131301508 */:
                IntentUtil.getInstance().goDownloadCenterActivity(this);
                return;
            case R.id.title_normal_search_img /* 2131301510 */:
                IntentUtil.getInstance().goSearchHintActivity(this);
                com.papa.sim.statistic.p.l(this.f35291l).u2(Where.mustplay, AccountUtil_.getInstance_(this.f35291l).getUid());
                return;
            default:
                return;
        }
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    updateUI(a5, 6);
                    return;
                } else if (c5 == 7) {
                    updateUI(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f35297r;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    updateProgressPartly();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            updateUI(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            updateUI(a5, 8);
                            return;
                        case 13:
                            updateUI(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f35296q = (i5 + i4) - 1;
        this.f35300u = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    @Override // com.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f35294o = 1;
        showLoding();
        loadData(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f35291l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f35286g.setVisibility(0);
        this.f35287h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<v1.c> list = this.f35292m;
        if (list == null || list.size() == 0) {
            this.f35287h.setVisibility(0);
            this.f35286g.setVisibility(8);
            this.f35283d.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f35298s.size();
        int size2 = this.f35299t.size();
        this.f35290k.setDownloadGameNum(size);
        StringBuilder sb = new StringBuilder();
        sb.append("updateDownloadView: ");
        sb.append(size2);
        sb.append("::::已经进入下载队列中的数量:::");
        sb.append(size);
        if (size2 > 0) {
            this.f35290k.d();
        } else {
            this.f35290k.g();
        }
    }

    void updateUI(DownloadTask downloadTask, int i4) {
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
