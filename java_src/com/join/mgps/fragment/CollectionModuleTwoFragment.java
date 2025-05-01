package com.join.mgps.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.e;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.BreakBeanMain;
import com.join.mgps.dto.CollectionBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.lang.reflect.Field;
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
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.collection_break)
/* loaded from: classes.dex */
public class CollectionModuleTwoFragment extends Fragment implements AbsListView.OnScrollListener {

    /* renamed from: c  reason: collision with root package name */
    private Context f50341c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    PtrClassicFrameLayout f50342d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f50343e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50344f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f50345g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f50346h;

    /* renamed from: i  reason: collision with root package name */
    private CollectionBean f50347i;

    /* renamed from: j  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f50348j;

    /* renamed from: k  reason: collision with root package name */
    private com.join.mgps.adapter.e f50349k;

    /* renamed from: l  reason: collision with root package name */
    private CollectionDataBean f50350l;

    /* renamed from: m  reason: collision with root package name */
    private String f50351m;

    /* renamed from: n  reason: collision with root package name */
    private String f50352n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.e f50353o;
    @StringRes(resName = "net_excption")

    /* renamed from: p  reason: collision with root package name */
    String f50354p;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: q  reason: collision with root package name */
    String f50355q;

    /* renamed from: t  reason: collision with root package name */
    private String f50358t;

    /* renamed from: u  reason: collision with root package name */
    private SimpleDraweeView f50359u;

    /* renamed from: v  reason: collision with root package name */
    private TextView f50360v;

    /* renamed from: x  reason: collision with root package name */
    private BreakBeanMain f50362x;

    /* renamed from: y  reason: collision with root package name */
    List<DownloadTask> f50363y;

    /* renamed from: b  reason: collision with root package name */
    private final String f50340b = "CollectionModuleTwoFragment";

    /* renamed from: r  reason: collision with root package name */
    private AtomicInteger f50356r = new AtomicInteger(1);

    /* renamed from: s  reason: collision with root package name */
    private int f50357s = 10;

    /* renamed from: w  reason: collision with root package name */
    private String f50361w = "";

    /* renamed from: z  reason: collision with root package name */
    private Map<String, DownloadTask> f50364z = new ConcurrentHashMap();
    private int A = 0;
    private CollectionDataBean B = null;
    private int C = 0;
    private boolean D = false;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CollectionModuleTwoFragment.this.D) {
                return;
            }
            CollectionModuleTwoFragment.this.a0();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CollectionModuleTwoFragment.this.D) {
                return;
            }
            CollectionModuleTwoFragment.this.f50356r.set(1);
            CollectionModuleTwoFragment.this.a0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int i5 = i4 - 1;
            if (i5 >= CollectionModuleTwoFragment.this.f50348j.size() || i5 < 0) {
                return;
            }
            CollectionBeanSub collectionBeanSub = (CollectionBeanSub) CollectionModuleTwoFragment.this.f50348j.get(i5);
            if (collectionBeanSub.getGame_id() != null) {
                IntentUtil.getInstance().intentActivity(CollectionModuleTwoFragment.this.f50341c, collectionBeanSub.getIntentDataBean());
            }
        }
    }

    private void g0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f50363y.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f50364z.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f50348j) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f50364z.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f50364z.get(collectionBeanSubBusiness.getGame_id());
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
        this.f50349k.notifyDataSetChanged();
    }

    private void h0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f50364z;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f50349k.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void i0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f50363y, downloadTask);
        if (!this.f50364z.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f50363y.add(downloadTask);
            this.f50364z.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        n0(downloadTask);
        this.f50349k.notifyDataSetChanged();
    }

    private void j0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f50364z;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f50363y.add(downloadTask);
            this.f50364z.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        n0(downloadTask);
        DownloadTask downloadTask2 = this.f50364z.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f50349k.notifyDataSetChanged();
    }

    private List<CollectionBeanSubBusiness> m0(List<CollectionBeanSubBusiness> list) {
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f50363y.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f50364z.get(mod_info.getMain_game_id());
                        boolean z4 = false;
                        boolean d5 = (downloadTask == null || downloadTask.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask.getPackageName());
                        DownloadTask downloadTask2 = this.f50364z.get(mod_info.getMod_game_id());
                        if (downloadTask2 != null && downloadTask2.getStatus() == 5) {
                            z4 = com.join.mgps.va.overmind.d.o().F(downloadTask2.getPackageName());
                        }
                        if (!z4 || !d5) {
                            if (z4) {
                                if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                    collectionBeanSubBusiness.setDownloadTask(next);
                                    break;
                                }
                            } else if (d5) {
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
        return list;
    }

    private void n0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f50348j) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f50364z.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f50364z.get(mod_info.getMod_game_id());
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

    private void p0() {
        DownloadTask downloadTask;
        for (int i4 = this.C; i4 <= this.A; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f50343e.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f50343e.getChildAt(i4 - this.C);
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
    @Background
    public void a0() {
        if (com.join.android.app.common.utils.j.j(this.f50341c)) {
            this.D = true;
            try {
                try {
                    CollectionBean G1 = this.f50353o.G1(c0(this.f50358t, this.f50356r.get()));
                    this.f50347i = G1;
                    if (G1 != null) {
                        if (G1.getMessages().getData() != null && this.f50347i.getMessages().getData().size() > 0) {
                            CollectionDataBean collectionDataBean = this.f50347i.getMessages().getData().get(0);
                            this.f50350l = collectionDataBean;
                            if (collectionDataBean.getInfo().size() > 0) {
                                List<CollectionBeanSub> sub = this.f50350l.getInfo().get(0).getSub();
                                BreakBeanMain main = this.f50350l.getInfo().get(0).getMain();
                                this.f50362x = main;
                                if (main != null) {
                                    this.f50351m = main.getTpl_pic();
                                    this.f50352n = this.f50362x.getInfo();
                                }
                                this.f50356r.incrementAndGet();
                                ArrayList arrayList = new ArrayList();
                                for (CollectionBeanSub collectionBeanSub : sub) {
                                    collectionBeanSub.set_from(111);
                                    collectionBeanSub.set_from_type(121);
                                    arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
                                }
                                showMain(m0(arrayList));
                            } else if (this.f50356r.get() == 1) {
                                showLodingFailed();
                            } else {
                                e0();
                            }
                        }
                    } else {
                        showLodingFailed();
                        o0();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showLodingFailed();
                    o0();
                }
                return;
            } finally {
                this.D = false;
            }
        }
        o0();
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f50353o = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        this.f50341c = getActivity();
        List<DownloadTask> d5 = p1.f.K().d();
        this.f50363y = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f50363y) {
                this.f50364z.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f50358t = getArguments().getString("collection_id");
        showLoding();
        b0(this.B);
        View inflate = LayoutInflater.from(this.f50341c).inflate(R.layout.collection_two_header, (ViewGroup) null);
        this.f50359u = (SimpleDraweeView) inflate.findViewById(R.id.imgBreak);
        this.f50360v = (TextView) inflate.findViewById(R.id.textViewBreak);
        this.f50343e.addHeaderView(inflate);
        this.f50343e.setPreLoadCount(10);
        com.join.mgps.adapter.e eVar = new com.join.mgps.adapter.e(this.f50341c);
        this.f50349k = eVar;
        this.f50348j = eVar.c();
        this.f50343e.setAdapter((ListAdapter) this.f50349k);
        this.f50343e.setPullLoadEnable(new a());
        this.f50343e.setPullRefreshEnable(new b());
        this.f50343e.setOnItemClickListener(new c());
        this.f50343e.setOnScrollListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0(CollectionDataBean collectionDataBean) {
        if (collectionDataBean != null) {
            this.f50356r.incrementAndGet();
            List<CollectionBeanSub> sub = collectionDataBean.getInfo().get(0).getSub();
            this.f50351m = collectionDataBean.getInfo().get(0).getMain().getTpl_pic();
            this.f50352n = collectionDataBean.getInfo().get(0).getMain().getInfo();
            ArrayList arrayList = new ArrayList();
            for (CollectionBeanSub collectionBeanSub : sub) {
                arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
            }
            showMain(m0(arrayList));
            return;
        }
        a0();
    }

    public CommonRequestBean c0(String str, int i4) {
        return RequestBeanUtil.getInstance(this.f50341c).getCollectionRequestBean(str, i4, this.f50357s, "", "", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0() {
        com.join.android.app.common.manager.a.h().j(this.f50341c, this.f50354p, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0() {
        this.f50343e.setNoMore();
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
        com.join.mgps.adapter.e eVar = this.f50349k;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        com.join.android.app.common.manager.a.h().j(this.f50341c, this.f50355q, 1);
    }

    public void l0(CollectionDataBean collectionDataBean) {
        this.B = collectionDataBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        this.f50343e.u();
        this.f50343e.v();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchFieldException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            q0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    q0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    q0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    p0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            q0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            q0(a5, 8);
                            return;
                        case 13:
                            q0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            q0(a5, 5);
        } else {
            q0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.A = (i5 + i4) - 1;
        this.C = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    void q0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    i0(downloadTask);
                    break;
                case 3:
                    g0(downloadTask);
                    break;
                case 5:
                    j0(downloadTask);
                    break;
                case 6:
                    h0(downloadTask);
                    break;
            }
        }
        this.f50349k.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f50356r.set(1);
        showLoding();
        a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f50341c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f50344f.setVisibility(0);
        this.f50345g.setVisibility(8);
        this.f50342d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<CollectionBeanSubBusiness> list = this.f50348j;
        if (list != null || list.size() == 0) {
            this.f50345g.setVisibility(0);
            this.f50344f.setVisibility(8);
            this.f50342d.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<CollectionBeanSubBusiness> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f50345g.setVisibility(8);
        this.f50344f.setVisibility(8);
        this.f50342d.setVisibility(0);
        if (this.f50356r.get() == 2) {
            this.f50348j.clear();
        }
        this.f50348j.addAll(list);
        if (this.f50356r.get() == 2) {
            this.f50361w = list.get(0).getGame_id();
            String str = this.f50352n;
            if (str != null) {
                this.f50360v.setText(str);
            }
            String str2 = this.f50351m;
            if (str2 != null) {
                MyImageLoader.d(this.f50359u, R.drawable.banner_normal_icon, str2.trim());
                this.f50359u.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (list.size() < 10) {
                e0();
            }
        }
        this.f50349k.notifyDataSetChanged();
        o0();
    }
}
