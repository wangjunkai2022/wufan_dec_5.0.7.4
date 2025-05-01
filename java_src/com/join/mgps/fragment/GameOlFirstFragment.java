package com.join.mgps.fragment;

import android.app.Activity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.adapter.k1;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.GameOLDataBean;
import com.join.mgps.dto.GameOLFirstBean;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.dto.GameOLHeadAdMain;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
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
@EFragment(R.layout.game_online_first_layout)
/* loaded from: classes.dex */
public class GameOlFirstFragment extends Fragment implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f51790b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f51791c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f51792d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f51793e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f51794f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.e f51795g;

    /* renamed from: h  reason: collision with root package name */
    private Activity f51796h;

    /* renamed from: j  reason: collision with root package name */
    private List<DownloadTask> f51798j;

    /* renamed from: m  reason: collision with root package name */
    List<v1.a<GameOLFirstBean>> f51801m;

    /* renamed from: n  reason: collision with root package name */
    private int f51802n;

    /* renamed from: o  reason: collision with root package name */
    private int f51803o;

    /* renamed from: q  reason: collision with root package name */
    private com.join.mgps.adapter.k1 f51805q;

    /* renamed from: i  reason: collision with root package name */
    private boolean f51797i = false;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, DownloadTask> f51799k = new ConcurrentHashMap();

    /* renamed from: l  reason: collision with root package name */
    private int f51800l = 1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f51804p = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f51806r = true;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameOlFirstFragment.this.f51797i) {
                return;
            }
            GameOlFirstFragment.this.f51800l = 1;
            GameOlFirstFragment.this.f51806r = true;
            GameOlFirstFragment.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameOlFirstFragment.this.f51797i) {
                return;
            }
            GameOlFirstFragment.this.b0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 > GameOlFirstFragment.this.f51801m.size() || i4 < 0) {
                return;
            }
            v1.a<GameOLFirstBean> aVar = GameOlFirstFragment.this.f51801m.get(i4);
            if (aVar.d() == 2 && GameOlFirstFragment.this.f51801m.get(i4).c().getGame_id() != null) {
                IntentUtil.getInstance().intentActivity(GameOlFirstFragment.this.f51796h, aVar.c().getIntentDataBean());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r1.d() == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        r2 = r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r2.getMod_info() == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        r3 = r7.f51799k.get(r2.getMod_info().getMod_game_id());
        r5 = r7.f51799k.get(r2.getGame_id());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        r1.f(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        r1.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
        r1.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r2.getGame_id().equals(r8.getCrc_link_type_val()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
        r1.f(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r2.getCrc_sign_id().equals(r8.getCrc_link_type_val()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r1.f(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        r7.f51799k.remove(r1.getCrc_link_type_val());
        r0.remove();
        r0 = r7.f51801m.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0.hasNext() == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g0(com.github.snowdream.android.app.downloader.DownloadTask r8) {
        /*
            r7 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r7.f51798j     // Catch: java.lang.Exception -> La7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> La7
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> La7
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> La7
            com.github.snowdream.android.app.downloader.DownloadTask r1 = (com.github.snowdream.android.app.downloader.DownloadTask) r1     // Catch: java.lang.Exception -> La7
            java.lang.String r2 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = r8.getCrc_link_type_val()     // Catch: java.lang.Exception -> La7
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> La7
            if (r2 == 0) goto L6
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r2 = r7.f51799k     // Catch: java.lang.Exception -> La7
            java.lang.String r1 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> La7
            r2.remove(r1)     // Catch: java.lang.Exception -> La7
            r0.remove()     // Catch: java.lang.Exception -> La7
            java.util.List<v1.a<com.join.mgps.dto.GameOLFirstBean>> r0 = r7.f51801m     // Catch: java.lang.Exception -> La7
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> La7
        L32:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> La7
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> La7
            v1.a r1 = (v1.a) r1     // Catch: java.lang.Exception -> La7
            int r2 = r1.d()     // Catch: java.lang.Exception -> La7
            r3 = 2
            if (r2 == r3) goto L46
            goto L32
        L46:
            java.lang.Object r2 = r1.c()     // Catch: java.lang.Exception -> La7
            com.join.mgps.dto.GameOLFirstBean r2 = (com.join.mgps.dto.GameOLFirstBean) r2     // Catch: java.lang.Exception -> La7
            com.join.mgps.dto.ModInfoBean r3 = r2.getMod_info()     // Catch: java.lang.Exception -> La7
            r4 = 0
            if (r3 == 0) goto L95
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r7.f51799k     // Catch: java.lang.Exception -> La7
            com.join.mgps.dto.ModInfoBean r5 = r2.getMod_info()     // Catch: java.lang.Exception -> La7
            java.lang.String r5 = r5.getMod_game_id()     // Catch: java.lang.Exception -> La7
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Exception -> La7
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3     // Catch: java.lang.Exception -> La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r5 = r7.f51799k     // Catch: java.lang.Exception -> La7
            java.lang.String r6 = r2.getGame_id()     // Catch: java.lang.Exception -> La7
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> La7
            com.github.snowdream.android.app.downloader.DownloadTask r5 = (com.github.snowdream.android.app.downloader.DownloadTask) r5     // Catch: java.lang.Exception -> La7
            if (r3 != 0) goto L77
            if (r5 != 0) goto L77
            r1.f(r4)     // Catch: java.lang.Exception -> La7
            goto L32
        L77:
            if (r3 == 0) goto L7d
            r1.f(r3)     // Catch: java.lang.Exception -> La7
            goto L32
        L7d:
            if (r5 == 0) goto L83
            r1.f(r5)     // Catch: java.lang.Exception -> La7
            goto L32
        L83:
            java.lang.String r2 = r2.getGame_id()     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = r8.getCrc_link_type_val()     // Catch: java.lang.Exception -> La7
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> La7
            if (r2 == 0) goto L32
            r1.f(r4)     // Catch: java.lang.Exception -> La7
            goto L32
        L95:
            java.lang.String r2 = r2.getCrc_sign_id()     // Catch: java.lang.Exception -> La7
            java.lang.String r3 = r8.getCrc_link_type_val()     // Catch: java.lang.Exception -> La7
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> La7
            if (r2 == 0) goto L32
            r1.f(r4)     // Catch: java.lang.Exception -> La7
            goto L32
        La7:
            r8 = move-exception
            r8.printStackTrace()
        Lab:
            com.join.mgps.adapter.k1 r8 = r7.f51805q
            r8.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.GameOlFirstFragment.g0(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    private void h0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51799k;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f51805q.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void i0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f51798j, downloadTask);
        if (!this.f51799k.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51799k.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        this.f51798j.add(downloadTask);
        k0(downloadTask);
        this.f51805q.notifyDataSetChanged();
    }

    private void j0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51799k;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51798j.add(downloadTask);
            this.f51799k.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        k0(downloadTask);
        DownloadTask downloadTask2 = this.f51799k.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        this.f51805q.notifyDataSetChanged();
    }

    private void k0(DownloadTask downloadTask) {
        try {
            for (v1.a<GameOLFirstBean> aVar : this.f51801m) {
                if (aVar.d() == 2) {
                    GameOLFirstBean c5 = aVar.c();
                    if (c5.getMod_info() != null) {
                        ModInfoBean mod_info = c5.getMod_info();
                        DownloadTask downloadTask2 = this.f51799k.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.f51799k.get(mod_info.getMod_game_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5) {
                            if (downloadTask.getCrc_link_type_val().equals(c5.getCrc_sign_id())) {
                                aVar.f(downloadTask);
                                return;
                            }
                        } else if (z4) {
                            if (c5.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(c5.getMod_info().getMod_game_id())) {
                                aVar.f(downloadTask);
                                return;
                            }
                        } else if (z5) {
                            if (downloadTask.getCrc_link_type_val().equals(c5.getCrc_sign_id())) {
                                aVar.f(downloadTask);
                                return;
                            }
                        } else {
                            DownloadTask F = c5.getMod_info() != null ? p1.f.K().F(c5.getMod_info().getMod_game_id()) : null;
                            if (F == null) {
                                F = p1.f.K().F(c5.getCrc_sign_id());
                            }
                            if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                aVar.f(downloadTask);
                                return;
                            }
                        }
                    } else if (c5.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        aVar.f(downloadTask);
                        return;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void m0() {
        DownloadTask a5;
        for (int i4 = this.f51803o; i4 <= this.f51802n; i4++) {
            v1.a aVar = (v1.a) this.f51791c.getItemAtPosition(i4);
            if (aVar != null && (a5 = aVar.a()) != null && (a5.getStatus() == 2 || a5.getStatus() == 12)) {
                View childAt = this.f51791c.getChildAt(i4 - this.f51803o);
                if (childAt.getTag() instanceof k1.e) {
                    k1.e eVar = (k1.e) childAt.getTag();
                    try {
                        if (aVar.d() == 2) {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(a5.getCrc_link_type_val());
                            if (f5 == null) {
                                return;
                            }
                            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                            if (a5.getSize() == 0) {
                                TextView textView = eVar.f44507k;
                                textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                TextView textView2 = eVar.f44507k;
                                textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            if (a5.getStatus() == 12) {
                                eVar.f44500d.setProgress((int) f5.getProgress());
                            } else {
                                eVar.f44501e.setProgress((int) f5.getProgress());
                            }
                            if (a5.getStatus() == 2) {
                                TextView textView3 = eVar.f44508l;
                                textView3.setText(f5.getSpeed() + "/S");
                            }
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
    public void a0() {
        this.f51795g = com.join.mgps.rpc.impl.d.P1();
        this.f51796h = getActivity();
        this.f51798j = p1.f.K().d();
        com.join.mgps.Util.d0.a().d(this);
        List<DownloadTask> list = this.f51798j;
        if (list != null && list.size() > 0) {
            for (DownloadTask downloadTask : this.f51798j) {
                this.f51799k.put(downloadTask.getCrc_link_type_val(), downloadTask);
                com.join.mgps.Util.v0.d("infoo", this.f51798j.size() + " tasksiz     mapsize  " + downloadTask.getStatus());
                com.join.mgps.Util.v0.d("infoo", downloadTask.toString());
            }
        }
        com.join.mgps.adapter.k1 k1Var = new com.join.mgps.adapter.k1(this.f51796h);
        this.f51805q = k1Var;
        this.f51801m = k1Var.c();
        showLoding();
        b0();
        this.f51791c.setPreLoadCount(10);
        this.f51791c.setPullRefreshEnable(new a());
        this.f51791c.setPullLoadEnable(new b());
        this.f51791c.setOnItemClickListener(new c());
        this.f51791c.setOnScrollListener(this);
        this.f51791c.setAdapter((ListAdapter) this.f51805q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0() {
        GameOLHeadAdBean gameOLHeadAdBean;
        GameOLHeadAdMain main;
        if (com.join.android.app.common.utils.j.j(this.f51796h)) {
            this.f51797i = true;
            try {
                try {
                    ResultMainBean<GameOLDataBean<GameOLFirstBean>> A = this.f51795g.A(c0(this.f51800l));
                    if (A != null && A.getFlag() == 1) {
                        GameOLDataBean<GameOLFirstBean> data = A.getMessages().getData();
                        if (data != null) {
                            ArrayList arrayList = new ArrayList();
                            List<GameOLHeadAdBean> head_ad = data.getHead_ad();
                            if (head_ad != null && head_ad.size() > 0 && this.f51800l == 1 && (gameOLHeadAdBean = head_ad.get(0)) != null && (main = gameOLHeadAdBean.getMain()) != null && "1".equals(main.getAd_switch())) {
                                v1.a<GameOLFirstBean> aVar = new v1.a<>();
                                aVar.i(0);
                                aVar.g(gameOLHeadAdBean);
                                arrayList.add(aVar);
                            }
                            List<GameOLFirstBean> game_list = data.getGame_list();
                            if (game_list != null && game_list.size() > 0) {
                                for (GameOLFirstBean gameOLFirstBean : game_list) {
                                    String update_times = gameOLFirstBean.getUpdate_times();
                                    if (g2.i(update_times)) {
                                        if (com.join.android.app.common.utils.g.g(Long.parseLong(update_times + "000"))) {
                                            this.f51806r = true;
                                            v1.a<GameOLFirstBean> aVar2 = new v1.a<>();
                                            aVar2.i(2);
                                            aVar2.h(gameOLFirstBean);
                                            arrayList.add(aVar2);
                                        } else {
                                            v1.a<GameOLFirstBean> aVar3 = new v1.a<>();
                                            aVar3.i(2);
                                            aVar3.h(gameOLFirstBean);
                                            arrayList.add(aVar3);
                                        }
                                    }
                                }
                                if (game_list.size() < 10) {
                                    e0();
                                }
                            } else if (this.f51800l == 1) {
                                showLodingFailed();
                            } else {
                                e0();
                            }
                            this.f51800l++;
                            showMain(arrayList);
                            l0();
                        } else if (this.f51800l == 1) {
                            showLodingFailed();
                        } else {
                            e0();
                        }
                    } else {
                        l0();
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    l0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.f51797i = false;
            }
        }
        l0();
        showLodingFailed();
    }

    public CommonRequestBean c0(int i4) {
        return RequestBeanUtil.getInstance(this.f51796h).getGameOLRequest(i4, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d0() {
        this.f51800l = 1;
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        this.f51791c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void f0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.k1 k1Var = this.f51805q;
        if (k1Var != null) {
            k1Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        try {
            this.f51791c.u();
            this.f51791c.v();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void n0(List<v1.a<GameOLFirstBean>> list, List<DownloadTask> list2) {
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : list2) {
            Iterator<v1.a<GameOLFirstBean>> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    v1.a<GameOLFirstBean> next = it2.next();
                    if (next.d() == 2) {
                        if (next.c().getMod_info() != null) {
                            ModInfoBean mod_info = next.c().getMod_info();
                            DownloadTask downloadTask2 = this.f51799k.get(mod_info.getMain_game_id());
                            boolean z4 = false;
                            boolean d5 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask2.getPackageName());
                            DownloadTask downloadTask3 = this.f51799k.get(mod_info.getMod_game_id());
                            if (downloadTask3 != null && downloadTask3.getStatus() == 5) {
                                z4 = com.join.mgps.va.overmind.d.o().F(downloadTask3.getPackageName());
                            }
                            if (!z4 || !d5) {
                                if (z4) {
                                    if (next.c().getMod_info() != null && downloadTask.getCrc_link_type_val().equals(next.c().getMod_info().getMod_game_id())) {
                                        next.f(downloadTask);
                                        break;
                                    }
                                } else if (d5) {
                                    if (downloadTask.getCrc_link_type_val().equals(next.c().getCrc_sign_id())) {
                                        next.f(downloadTask);
                                        break;
                                    }
                                } else {
                                    DownloadTask F = next.c().getMod_info() != null ? p1.f.K().F(next.c().getMod_info().getMod_game_id()) : null;
                                    if (F == null) {
                                        F = p1.f.K().F(next.c().getCrc_sign_id());
                                    }
                                    if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                        next.f(downloadTask);
                                        break;
                                    }
                                }
                            } else if (downloadTask.getCrc_link_type_val().equals(next.c().getCrc_sign_id())) {
                                next.f(downloadTask);
                                break;
                            }
                        } else if (downloadTask.getCrc_link_type_val().equals(next.c().getGame_id())) {
                            next.f(downloadTask);
                            break;
                        }
                    }
                }
            }
        }
    }

    void o0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    i0(downloadTask);
                    return;
                case 3:
                    g0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    j0(downloadTask);
                    return;
                case 6:
                    h0(downloadTask);
                    return;
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
        Map<String, DownloadTask> map;
        DownloadTask a5 = nVar.a();
        switch (nVar.c()) {
            case 2:
                o0(a5, 1);
                return;
            case 3:
                o0(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                o0(a5, 5);
                return;
            case 6:
                o0(a5, 6);
                return;
            case 7:
                o0(a5, 3);
                return;
            case 8:
                if (isHidden() || (map = this.f51799k) == null || map.isEmpty() || this.f51804p) {
                    return;
                }
                m0();
                return;
            case 10:
                o0(a5, 7);
                return;
            case 12:
                o0(a5, 8);
                return;
            case 13:
                o0(a5, 9);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f51802n = (i5 + i4) - 1;
        this.f51803o = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        this.f51804p = i4 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51800l = 1;
        showLoding();
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f51792d.setVisibility(0);
        this.f51793e.setVisibility(8);
        this.f51790b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            List<v1.a<GameOLFirstBean>> list = this.f51801m;
            if (list == null || list.size() == 0) {
                this.f51793e.setVisibility(0);
                this.f51792d.setVisibility(8);
                this.f51790b.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<v1.a<GameOLFirstBean>> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            this.f51793e.setVisibility(8);
            this.f51792d.setVisibility(8);
            this.f51790b.setVisibility(0);
            if (this.f51800l == 2) {
                this.f51801m.clear();
            }
            n0(list, this.f51798j);
            this.f51801m.addAll(list);
            if (this.f51800l == 2) {
                this.f51801m.size();
            }
            com.join.mgps.Util.v0.d("infoo", this.f51801m.size() + "   showMain");
            this.f51805q.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
