package com.join.mgps.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.GameAppRecyAdapter;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RequestTypePn;
import com.join.mgps.dto.ResultMainBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.classify_list_recy_layout)
/* loaded from: classes.dex */
public class ClassifyListGameFragment extends Fragment implements AbsListView.OnScrollListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f28743b;

    /* renamed from: d  reason: collision with root package name */
    private GameAppRecyAdapter f28745d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XRecyclerView f28746e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f28747f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f28748g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f28749h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    ImageView f28750i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f28751j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.e f28752k;

    /* renamed from: l  reason: collision with root package name */
    LinearLayoutManager f28753l;

    /* renamed from: n  reason: collision with root package name */
    List<DownloadTask> f28755n;

    /* renamed from: v  reason: collision with root package name */
    private ClassifyGameActivity f28763v;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f28744c = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private int f28754m = 1;

    /* renamed from: o  reason: collision with root package name */
    private int f28756o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f28757p = 0;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, DownloadTask> f28758q = new ConcurrentHashMap();

    /* renamed from: r  reason: collision with root package name */
    private int f28759r = 1;

    /* renamed from: s  reason: collision with root package name */
    private String f28760s = "";

    /* renamed from: t  reason: collision with root package name */
    private String f28761t = "";

    /* renamed from: u  reason: collision with root package name */
    private boolean f28762u = false;

    /* renamed from: w  reason: collision with root package name */
    final AtomicInteger f28764w = new AtomicInteger(0);

    /* renamed from: x  reason: collision with root package name */
    private String f28765x = "default";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements XRecyclerView.f {
        a() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
            if (ClassifyListGameFragment.this.f28762u) {
                return;
            }
            ClassifyListGameFragment.X(ClassifyListGameFragment.this);
            ClassifyListGameFragment classifyListGameFragment = ClassifyListGameFragment.this;
            classifyListGameFragment.c0(classifyListGameFragment.f28760s, ClassifyListGameFragment.this.f28761t);
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
        }
    }

    static /* synthetic */ int X(ClassifyListGameFragment classifyListGameFragment) {
        int i4 = classifyListGameFragment.f28754m;
        classifyListGameFragment.f28754m = i4 + 1;
        return i4;
    }

    public static ClassifyListGameFragment e0(int i4, String str) {
        ClassifyListGameFragment_ classifyListGameFragment_ = new ClassifyListGameFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("romType", str);
        bundle.putInt("rankingType", i4);
        classifyListGameFragment_.setArguments(bundle);
        return classifyListGameFragment_;
    }

    public static ClassifyListGameFragment f0(String str, String str2) {
        ClassifyListGameFragment_ classifyListGameFragment_ = new ClassifyListGameFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("romType", str2);
        bundle.putString("type", str);
        classifyListGameFragment_.setArguments(bundle);
        return classifyListGameFragment_;
    }

    public static ClassifyListGameFragment g0(int i4, String str) {
        ClassifyListGameFragment_ classifyListGameFragment_ = new ClassifyListGameFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putInt("rankingType", i4);
        classifyListGameFragment_.setArguments(bundle);
        return classifyListGameFragment_;
    }

    private void k0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f28755n.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f28758q.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f28744c) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f28758q.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f28758q.get(collectionBeanSubBusiness.getGame_id());
                        if (downloadTask2 == null && downloadTask3 == null) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        } else if (downloadTask2 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask2);
                        } else if (downloadTask3 != null) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask3);
                        } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(null);
                        }
                    } else if (collectionBeanSubBusiness.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(null);
                    }
                }
            }
        }
        this.f28745d.notifyDataSetChanged();
    }

    private void l0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f28758q;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f28745d.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void m0(DownloadTask downloadTask) {
        UtilsMy.A4(this.f28755n);
        if (!this.f28758q.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f28755n.add(downloadTask);
            this.f28758q.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        u0(downloadTask);
        this.f28745d.notifyDataSetChanged();
    }

    private void n0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f28758q;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f28755n.add(downloadTask);
            this.f28758q.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        u0(downloadTask);
        DownloadTask downloadTask2 = this.f28758q.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f28745d.notifyDataSetChanged();
    }

    private void u0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f28744c) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f28758q.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f28758q.get(mod_info.getMod_game_id());
                    if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                        z4 = false;
                    }
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            return;
                        }
                    }
                } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v0(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f28755n) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f28755n.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f28758q.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.f28758q.get(mod_info.getMod_game_id());
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

    private void x0() {
        DownloadTask downloadTask;
        try {
            this.f28757p = this.f28753l.findFirstVisibleItemPosition();
            this.f28756o = this.f28753l.findLastVisibleItemPosition();
            for (int i4 = this.f28757p; i4 <= this.f28756o; i4++) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = this.f28745d.getItems().get(i4);
                if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    View childAt = this.f28746e.getChildAt(i4 - this.f28757p);
                    try {
                        TextView textView = (TextView) childAt.findViewById(R.id.appSize);
                        TextView textView2 = (TextView) childAt.findViewById(R.id.loding_info);
                        ProgressBar progressBar = (ProgressBar) childAt.findViewById(R.id.progressBarZip);
                        ProgressBar progressBar2 = (ProgressBar) childAt.findViewById(R.id.progressBar);
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            progressBar.setProgress((int) f5.getProgress());
                        } else {
                            progressBar2.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            textView2.setText(f5.getSpeed() + "/S");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void V() {
        XRecyclerView xRecyclerView;
        if (getActivity() == null || this.f28745d == null || ((ClassifyGameActivity) getActivity()).i0().equals(this.f28765x)) {
            return;
        }
        if (com.join.mgps.Util.g2.h(this.f28760s) && com.join.mgps.Util.g2.h(this.f28761t)) {
            return;
        }
        if (this.f28762u && (xRecyclerView = this.f28746e) != null) {
            xRecyclerView.stopLoadMore();
            this.f28746e.stopRefresh();
            this.f28763v.o0(false);
        }
        LinearLayout linearLayout = this.f28748g;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f28747f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        XRecyclerView xRecyclerView2 = this.f28746e;
        if (xRecyclerView2 != null) {
            xRecyclerView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28749h;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        this.f28754m = 1;
        c0(this.f28760s, this.f28761t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f28752k = com.join.mgps.rpc.impl.d.P1();
        this.f28763v = (ClassifyGameActivity) getActivity();
        com.join.mgps.Util.d0.a().d(this);
        this.f28747f.setBackgroundResource(R.color.activity_default_background);
        this.f28743b = getActivity();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f28760s = arguments.getString("type");
        this.f28761t = arguments.getString("romType");
        int i4 = arguments.getInt("rankingType");
        this.f28759r = i4;
        if (i4 == 0) {
            this.f28759r = 1;
        }
        this.f28754m = 1;
        List<DownloadTask> d5 = p1.f.K().d();
        this.f28755n = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f28755n) {
                this.f28758q.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        GameAppRecyAdapter gameAppRecyAdapter = new GameAppRecyAdapter(this.f28743b);
        this.f28745d = gameAppRecyAdapter;
        this.f28744c = gameAppRecyAdapter.getItems();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f28743b);
        this.f28753l = linearLayoutManager;
        this.f28746e.setLayoutManager(linearLayoutManager);
        this.f28746e.setAdapter(this.f28745d);
        this.f28746e.setPreLoadCount(10);
        showLoding();
        c0(this.f28760s, this.f28761t);
        this.f28746e.setLoadingMoreEnabled(true);
        this.f28746e.setLoadingListener(new a());
    }

    public CommonRequestBean b0(String str, String str2, String str3) {
        return RequestBeanUtil.getInstance(this.f28743b).getGameListRequestBean(this.f28754m, 10, str, str2, this.f28759r, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0(String str, String str2) {
        ResultMainBean<List<CollectionBeanSub>> I0;
        if (com.join.android.app.common.utils.j.j(this.f28743b)) {
            if (getActivity() instanceof ClassifyGameActivity) {
                this.f28765x = ((ClassifyGameActivity) getActivity()).i0();
            }
            this.f28762u = true;
            AtomicInteger atomicInteger = this.f28764w;
            atomicInteger.set(atomicInteger.get() + 1);
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    if (this.f28759r == 1001) {
                        I0 = this.f28752k.g0(RequestBeanUtil.getInstance(this.f28743b).getRankingV3(new RequestTypePn(Integer.parseInt(str), this.f28754m)));
                    } else {
                        I0 = this.f28752k.I0(b0(str, str2, this.f28765x));
                    }
                    AtomicInteger atomicInteger2 = this.f28764w;
                    atomicInteger2.set(atomicInteger2.get() - 1);
                    for (CollectionBeanSub collectionBeanSub : I0.getMessages().getData()) {
                        arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
                    }
                    if (arrayList.size() > 0) {
                        showMain(arrayList);
                    } else if (this.f28754m == 1 && arrayList.size() == 0) {
                        t0(true);
                    } else {
                        h0();
                    }
                } catch (Exception e5) {
                    AtomicInteger atomicInteger3 = this.f28764w;
                    atomicInteger3.set(atomicInteger3.get() - 1);
                    e5.printStackTrace();
                    if (this.f28754m == 1 && arrayList.size() == 0) {
                        t0(false);
                    } else {
                        h0();
                    }
                }
                return;
            } finally {
                this.f28762u = false;
            }
        }
        t0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d0() {
        this.f28754m = 1;
        c0(this.f28760s, this.f28761t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        XRecyclerView xRecyclerView = this.f28746e;
        if (xRecyclerView != null) {
            xRecyclerView.setNoMore();
        }
        this.f28763v.o0(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        if (this.f28759r != 1001) {
            getActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void j0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        GameAppRecyAdapter gameAppRecyAdapter = this.f28745d;
        if (gameAppRecyAdapter != null) {
            gameAppRecyAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        if (this.f28759r != 1001) {
            getActivity().finish();
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
            y0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    y0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    y0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f28758q;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    x0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            y0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            y0(a5, 8);
                            return;
                        case 13:
                            y0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            y0(a5, 5);
        } else {
            y0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        GameAppRecyAdapter gameAppRecyAdapter;
        super.onHiddenChanged(z4);
        if (z4 || (gameAppRecyAdapter = this.f28745d) == null) {
            return;
        }
        gameAppRecyAdapter.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f28756o = (i5 + i4) - 1;
        this.f28757p = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    public void p0(String str) {
        if (str.equals(this.f28760s)) {
            return;
        }
        this.f28760s = str;
        this.f28746e.reset();
        this.f28754m = 1;
        showLoding();
        this.f28744c.clear();
        this.f28745d.notifyDataSetChanged();
        this.f28746e.setVisibility(8);
        c0(this.f28760s, this.f28761t);
    }

    public void q0() {
        if (this.f28762u) {
            return;
        }
        this.f28754m = 1;
        this.f28746e.reset();
        c0(this.f28760s, this.f28761t);
    }

    public void r0(String str) {
        String str2 = this.f28761t;
        if (str2 == null || str == null || str.equals(str2)) {
            return;
        }
        this.f28761t = str;
        XRecyclerView xRecyclerView = this.f28746e;
        if (xRecyclerView != null) {
            xRecyclerView.reset();
        }
        this.f28754m = 1;
        showLoding();
        this.f28744c.clear();
        GameAppRecyAdapter gameAppRecyAdapter = this.f28745d;
        if (gameAppRecyAdapter != null) {
            gameAppRecyAdapter.notifyDataSetChanged();
        }
        this.f28746e.setVisibility(8);
        c0(this.f28760s, this.f28761t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f28754m = 1;
        showLoding();
        c0(this.f28760s, this.f28761t);
    }

    public void s0(String str, String str2) {
        this.f28761t = str2;
        this.f28760s = str;
        this.f28746e.reset();
        this.f28754m = 1;
        showLoding();
        this.f28744c.clear();
        this.f28745d.notifyDataSetChanged();
        this.f28746e.setVisibility(8);
        c0(this.f28760s, this.f28761t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f28743b);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4 && (getActivity() instanceof ClassifyGameActivity)) {
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        LinearLayout linearLayout = this.f28747f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f28748g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f28746e;
        if (xRecyclerView != null) {
            xRecyclerView.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28749h;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<CollectionBeanSubBusiness> list) {
        try {
            if (this.f28764w.get() > 0) {
                return;
            }
            LinearLayout linearLayout = this.f28748g;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f28747f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            XRecyclerView xRecyclerView = this.f28746e;
            if (xRecyclerView != null) {
                xRecyclerView.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f28749h;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            XRecyclerView xRecyclerView2 = this.f28746e;
            if (xRecyclerView2 != null) {
                xRecyclerView2.stopLoadMore();
                this.f28746e.stopRefresh();
                this.f28763v.o0(false);
            }
            if (this.f28754m == 1) {
                this.f28744c.clear();
            }
            v0(list);
            this.f28744c.addAll(list);
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
                collectionBeanSubBusiness.set_from(108);
                collectionBeanSubBusiness.set_from_type(118);
            }
            if (this.f28746e != null) {
                if (list.size() == 0) {
                    this.f28746e.setNoMore();
                }
                this.f28745d.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(boolean z4) {
        XRecyclerView xRecyclerView = this.f28746e;
        if (xRecyclerView != null) {
            xRecyclerView.stopLoadMore();
            this.f28746e.stopRefresh();
            this.f28763v.o0(false);
        }
        if (!z4) {
            if (this.f28754m == 1 && this.f28744c.size() == 0) {
                LinearLayout linearLayout = this.f28748g;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f28747f;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                XRecyclerView xRecyclerView2 = this.f28746e;
                if (xRecyclerView2 != null) {
                    xRecyclerView2.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f28749h;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                return;
            }
            try {
                com.join.mgps.Util.l2.a(this.f28743b).b(getString(R.string.net_connect_failed));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (z4 && this.f28754m == 1 && this.f28744c.size() == 0) {
            LinearLayout linearLayout4 = this.f28748g;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f28747f;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            XRecyclerView xRecyclerView3 = this.f28746e;
            if (xRecyclerView3 != null) {
                xRecyclerView3.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f28749h;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        } else if (z4 && this.f28754m == 1 && this.f28744c.size() > 0) {
            LinearLayout linearLayout7 = this.f28748g;
            if (linearLayout7 != null) {
                linearLayout7.setVisibility(8);
            }
            LinearLayout linearLayout8 = this.f28747f;
            if (linearLayout8 != null) {
                linearLayout8.setVisibility(8);
            }
            XRecyclerView xRecyclerView4 = this.f28746e;
            if (xRecyclerView4 != null) {
                xRecyclerView4.setVisibility(8);
            }
            LinearLayout linearLayout9 = this.f28749h;
            if (linearLayout9 != null) {
                linearLayout9.setVisibility(0);
            }
        }
    }

    public void w0(String str, String str2) {
        this.f28746e.reset();
        this.f28754m = 1;
        this.f28760s = str;
        this.f28761t = str2;
        c0(str, str2);
    }

    void y0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
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
