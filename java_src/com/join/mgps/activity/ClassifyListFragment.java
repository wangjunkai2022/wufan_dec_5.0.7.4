package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.n0;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.classify_list_layout)
/* loaded from: classes.dex */
public class ClassifyListFragment extends Fragment implements AbsListView.OnScrollListener {

    /* renamed from: b  reason: collision with root package name */
    private Context f28699b;

    /* renamed from: d  reason: collision with root package name */
    private com.join.mgps.adapter.n0 f28701d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f28702e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f28703f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    PtrClassicFrameLayout f28704g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f28705h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f28706i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f28707j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f28708k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ImageView f28709l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.rpc.e f28710m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.k f28711n;

    /* renamed from: p  reason: collision with root package name */
    List<DownloadTask> f28713p;

    /* renamed from: y  reason: collision with root package name */
    private String f28722y;

    /* renamed from: z  reason: collision with root package name */
    private String f28723z;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f28700c = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    private int f28712o = 1;

    /* renamed from: q  reason: collision with root package name */
    private int f28714q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f28715r = 0;

    /* renamed from: s  reason: collision with root package name */
    private Map<String, DownloadTask> f28716s = new ConcurrentHashMap();

    /* renamed from: t  reason: collision with root package name */
    private int f28717t = 1;

    /* renamed from: u  reason: collision with root package name */
    private String f28718u = "";

    /* renamed from: v  reason: collision with root package name */
    private int f28719v = 0;

    /* renamed from: w  reason: collision with root package name */
    private String f28720w = "";

    /* renamed from: x  reason: collision with root package name */
    private boolean f28721x = false;
    final AtomicInteger A = new AtomicInteger(0);
    private String B = "";
    private boolean C = false;
    private int D = 0;
    private int E = 0;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ClassifyListFragment.this.f28721x) {
                return;
            }
            ClassifyListFragment.Z(ClassifyListFragment.this);
            ClassifyListFragment classifyListFragment = ClassifyListFragment.this;
            classifyListFragment.f0(classifyListFragment.f28718u, ClassifyListFragment.this.f28720w);
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (ClassifyListFragment.this.f28721x) {
                return;
            }
            ClassifyListFragment.this.f28712o = 1;
            ClassifyListFragment classifyListFragment = ClassifyListFragment.this;
            classifyListFragment.f0(classifyListFragment.f28718u, ClassifyListFragment.this.f28720w);
        }
    }

    /* loaded from: classes4.dex */
    class c implements AdapterView.OnItemClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (i4 > ClassifyListFragment.this.f28700c.size() || i4 < 0) {
                return;
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) ClassifyListFragment.this.f28700c.get(i4);
            if (collectionBeanSubBusiness.getCrc_sign_id() != null) {
                IntentUtil.getInstance().intentActivity(ClassifyListFragment.this.f28699b, collectionBeanSubBusiness.getIntentDataBean());
            }
        }
    }

    private void B0() {
        DownloadTask downloadTask;
        if (this.f28715r < 0 || this.f28714q >= this.f28703f.getCount()) {
            return;
        }
        for (int i4 = this.f28715r; i4 <= this.f28714q; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f28703f.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f28703f.getChildAt(i4 - this.f28715r);
                if (childAt.getTag() instanceof n0.b) {
                    n0.b bVar = (n0.b) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = bVar.f44936l;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = bVar.f44936l;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            bVar.f44939o.setProgress((int) f5.getProgress());
                        } else {
                            bVar.f44938n.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = bVar.f44937m;
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

    static /* synthetic */ int Z(ClassifyListFragment classifyListFragment) {
        int i4 = classifyListFragment.f28712o;
        classifyListFragment.f28712o = i4 + 1;
        return i4;
    }

    private void expDiscountGame() {
        try {
            try {
                if (!this.C) {
                    this.C = true;
                    int lastVisiblePosition = this.f28703f.getLastVisiblePosition();
                    for (int i4 = 0; i4 <= lastVisiblePosition; i4++) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f28700c.get(i4);
                        if (!collectionBeanSubBusiness.isHasExposure()) {
                            collectionBeanSubBusiness.setHasExposure(true);
                            if (UtilsMy.f2(collectionBeanSubBusiness)) {
                                try {
                                    Ext ext = new Ext();
                                    ext.setResultCode("discount_game");
                                    ext.setScenesCode(getClass().getSimpleName());
                                    Data data = new Data();
                                    data.setGameId(Long.parseLong(collectionBeanSubBusiness.getGame_id()));
                                    com.papa.sim.statistic.p.l(this.f28699b).Y(Event.expGameAdPage, ext, data);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } finally {
                this.C = false;
            }
        } catch (Exception unused) {
        }
    }

    public static ClassifyListFragment h0(int i4, String str) {
        ClassifyListFragment_ classifyListFragment_ = new ClassifyListFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("romType", str);
        bundle.putInt("uiType", 0);
        bundle.putInt("rankingType", i4);
        classifyListFragment_.setArguments(bundle);
        return classifyListFragment_;
    }

    public static ClassifyListFragment i0(String str, String str2) {
        ClassifyListFragment_ classifyListFragment_ = new ClassifyListFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("romType", str2);
        bundle.putString("type", str);
        bundle.putInt("uiType", 0);
        classifyListFragment_.setArguments(bundle);
        return classifyListFragment_;
    }

    public static ClassifyListFragment j0(int i4, String str, String str2, String str3) {
        ClassifyListFragment_ classifyListFragment_ = new ClassifyListFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        int i5 = 0;
        bundle.putInt("uiType", 0);
        bundle.putInt("rankingType", i4);
        if ("4".equals(str)) {
            bundle.putString(RankingHomeActivity_.f37087s, str2);
            bundle.putString(RankingHomeActivity_.f37088t, str3);
        }
        int i6 = 119;
        if (i4 != 1001) {
            i5 = 109;
        } else if ("1".equals(str)) {
            i5 = 10902;
            i6 = 10902;
        } else if ("2".equals(str)) {
            i5 = 10901;
            i6 = 10901;
        } else if ("3".equals(str)) {
            i5 = 10903;
            i6 = 10903;
        } else if ("4".equals(str)) {
            i5 = 12101;
            i6 = 12101;
        }
        bundle.putInt("_from", i5);
        bundle.putInt("_from_type", i6);
        classifyListFragment_.setArguments(bundle);
        return classifyListFragment_;
    }

    public static ClassifyListFragment k0(int i4, String str) {
        return j0(i4, str, "", "0");
    }

    public static ClassifyListFragment l0(int i4, String str, int i5) {
        ClassifyListFragment_ classifyListFragment_ = new ClassifyListFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putInt("uiType", i5);
        bundle.putInt("rankingType", i4);
        bundle.putInt("_from", 107);
        bundle.putInt("_from_type", 117);
        classifyListFragment_.setArguments(bundle);
        return classifyListFragment_;
    }

    private void p0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f28713p.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f28716s.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f28700c) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f28716s.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f28716s.get(collectionBeanSubBusiness.getGame_id());
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
        this.f28701d.notifyDataSetChanged();
    }

    private void q0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f28716s;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f28701d.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void r0(DownloadTask downloadTask) {
        UtilsMy.A4(this.f28713p);
        if (!this.f28716s.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f28713p.add(downloadTask);
            this.f28716s.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        y0(downloadTask);
        this.f28701d.notifyDataSetChanged();
    }

    private void s0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f28716s;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f28713p.add(downloadTask);
            this.f28716s.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        y0(downloadTask);
        DownloadTask downloadTask2 = this.f28716s.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f28701d.notifyDataSetChanged();
    }

    private void y0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f28700c) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f28716s.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f28716s.get(mod_info.getMod_game_id());
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

    private void z0(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f28713p) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f28713p.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f28716s.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.f28716s.get(mod_info.getMod_game_id());
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

    public void A0(String str, String str2) {
        this.f28712o = 1;
        f0(str, str2);
    }

    void C0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    r0(downloadTask);
                    return;
                case 3:
                    p0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    s0(downloadTask);
                    return;
                case 6:
                    q0(downloadTask);
                    return;
            }
        }
    }

    public void V() {
        XListView2 xListView2;
        if (getActivity() == null || this.f28701d == null || ((ClassifyGameActivity) getActivity()).i0() == this.B) {
            return;
        }
        if (com.join.mgps.Util.g2.h(this.f28718u) && com.join.mgps.Util.g2.h(this.f28720w)) {
            return;
        }
        if (this.f28721x && (xListView2 = this.f28703f) != null) {
            xListView2.u();
            this.f28703f.v();
        }
        LinearLayout linearLayout = this.f28706i;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f28705h;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f28704g;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28707j;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        this.f28712o = 1;
        f0(this.f28718u, this.f28720w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f28710m = com.join.mgps.rpc.impl.d.P1();
        this.f28711n = com.join.mgps.rpc.impl.i.D0();
        com.join.mgps.Util.d0.a().d(this);
        this.f28705h.setBackgroundResource(R.color.activity_default_background);
        this.f28699b = getActivity();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f28718u = arguments.getString("type");
        this.f28719v = arguments.getInt("uiType");
        this.f28720w = arguments.getString("romType");
        this.f28717t = arguments.getInt("rankingType");
        this.D = arguments.getInt("_from");
        this.E = arguments.getInt("_from_type");
        this.f28722y = arguments.getString(RankingHomeActivity_.f37087s);
        this.f28723z = arguments.getString(RankingHomeActivity_.f37088t);
        if ("4".equals(this.f28718u)) {
            com.papa.sim.statistic.p.l(this.f28699b).O1(Event.goGameListPage, new Ext().setFrom("1"));
        }
        if (this.f28719v > 0) {
            this.f28702e.setBackgroundColor(Color.parseColor("#efeff4"));
        }
        if (this.f28717t == 0) {
            this.f28717t = 1;
        }
        this.f28712o = 1;
        List<DownloadTask> d5 = p1.f.K().d();
        this.f28713p = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f28713p) {
                this.f28716s.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        com.join.mgps.adapter.n0 n0Var = new com.join.mgps.adapter.n0(this.f28699b);
        this.f28701d = n0Var;
        n0Var.c(this.f28719v);
        this.f28700c = this.f28701d.b();
        this.f28703f.setAdapter((ListAdapter) this.f28701d);
        this.f28703f.setPreLoadCount(10);
        showLoding();
        f0(this.f28718u, this.f28720w);
        this.f28703f.setPullLoadEnable(new a());
        this.f28703f.setPullRefreshEnable(new b());
        this.f28703f.setOnItemClickListener(new c());
        this.f28703f.setOnScrollListener(this);
    }

    public CommonRequestBean e0(String str, String str2, String str3) {
        return RequestBeanUtil.getInstance(this.f28699b).getGameListRequestBean(this.f28712o, 10, str, str2, this.f28717t, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[Catch: all -> 0x010f, Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:8:0x002f, B:11:0x0038, B:13:0x003e, B:17:0x00a7, B:20:0x00b9, B:24:0x00d0, B:25:0x00d4, B:27:0x00da, B:28:0x00f3, B:30:0x00f9, B:31:0x00fd, B:33:0x0101, B:35:0x0107, B:36:0x010b, B:22:0x00c3, B:14:0x007e, B:15:0x009a), top: B:52:0x002f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9 A[Catch: all -> 0x010f, Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:8:0x002f, B:11:0x0038, B:13:0x003e, B:17:0x00a7, B:20:0x00b9, B:24:0x00d0, B:25:0x00d4, B:27:0x00da, B:28:0x00f3, B:30:0x00f9, B:31:0x00fd, B:33:0x0101, B:35:0x0107, B:36:0x010b, B:22:0x00c3, B:14:0x007e, B:15:0x009a), top: B:52:0x002f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd A[Catch: all -> 0x010f, Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:8:0x002f, B:11:0x0038, B:13:0x003e, B:17:0x00a7, B:20:0x00b9, B:24:0x00d0, B:25:0x00d4, B:27:0x00da, B:28:0x00f3, B:30:0x00f9, B:31:0x00fd, B:33:0x0101, B:35:0x0107, B:36:0x010b, B:22:0x00c3, B:14:0x007e, B:15:0x009a), top: B:52:0x002f, outer: #1 }] */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ClassifyListFragment.f0(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        this.f28712o = 1;
        f0(this.f28718u, this.f28720w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        XListView2 xListView2 = this.f28703f;
        if (xListView2 != null) {
            xListView2.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        if (this.f28717t != 1001) {
            getActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void o0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        com.join.mgps.adapter.n0 n0Var = this.f28701d;
        if (n0Var != null) {
            n0Var.notifyDataSetChanged();
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
            C0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    C0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    C0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f28716s;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    B0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            C0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            C0(a5, 8);
                            return;
                        case 13:
                            C0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            C0(a5, 5);
        } else {
            C0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        com.join.mgps.adapter.n0 n0Var;
        super.onHiddenChanged(z4);
        if (z4 || (n0Var = this.f28701d) == null) {
            return;
        }
        n0Var.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f28714q = (i5 + i4) - 1;
        this.f28715r = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        expDiscountGame();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f28712o = 1;
        showLoding();
        f0(this.f28718u, this.f28720w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f28699b);
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
        LinearLayout linearLayout = this.f28705h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f28706i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f28704g;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f28707j;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<CollectionBeanSubBusiness> list) {
        try {
            if (this.A.get() > 0) {
                return;
            }
            LinearLayout linearLayout = this.f28706i;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f28705h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            PtrClassicFrameLayout ptrClassicFrameLayout = this.f28704g;
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f28707j;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            XListView2 xListView2 = this.f28703f;
            if (xListView2 != null) {
                xListView2.u();
                this.f28703f.v();
            }
            if (this.f28712o == 1) {
                this.f28700c.clear();
            }
            z0(list);
            this.f28700c.addAll(list);
            if (this.f28703f != null) {
                if (list.size() == 0) {
                    this.f28703f.setNoMore();
                }
                this.f28701d.notifyDataSetChanged();
                if (this.f28712o == 1) {
                    this.f28703f.setSelection(0);
                    expDiscountGame();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        if (this.f28717t != 1001) {
            getActivity().finish();
        }
    }

    public void u0(String str) {
        if (str.equals(this.f28718u)) {
            return;
        }
        this.f28718u = str;
        this.f28703f.l();
        this.f28712o = 1;
        showLoding();
        this.f28700c.clear();
        this.f28701d.notifyDataSetChanged();
        this.f28704g.setVisibility(8);
        f0(this.f28718u, this.f28720w);
    }

    public void v0(String str) {
        String str2 = this.f28720w;
        if (str2 == null || str == null || str.equals(str2)) {
            return;
        }
        this.f28720w = str;
        XListView2 xListView2 = this.f28703f;
        if (xListView2 != null) {
            xListView2.l();
        }
        this.f28712o = 1;
        showLoding();
        this.f28700c.clear();
        com.join.mgps.adapter.n0 n0Var = this.f28701d;
        if (n0Var != null) {
            n0Var.notifyDataSetChanged();
        }
        this.f28704g.setVisibility(8);
        f0(this.f28718u, this.f28720w);
    }

    public void w0(String str, String str2) {
        this.f28720w = str2;
        this.f28718u = str;
        this.f28703f.l();
        this.f28712o = 1;
        showLoding();
        this.f28700c.clear();
        this.f28701d.notifyDataSetChanged();
        this.f28704g.setVisibility(8);
        f0(this.f28718u, this.f28720w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(boolean z4) {
        XListView2 xListView2 = this.f28703f;
        if (xListView2 != null) {
            xListView2.u();
            this.f28703f.v();
        }
        if (!z4) {
            if (this.f28712o == 1 && this.f28700c.size() == 0) {
                LinearLayout linearLayout = this.f28706i;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f28705h;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                PtrClassicFrameLayout ptrClassicFrameLayout = this.f28704g;
                if (ptrClassicFrameLayout != null) {
                    ptrClassicFrameLayout.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f28707j;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                return;
            }
            try {
                com.join.mgps.Util.l2.a(this.f28699b).b(getString(R.string.net_connect_failed));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (z4 && this.f28712o == 1 && this.f28700c.size() == 0) {
            LinearLayout linearLayout4 = this.f28706i;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f28705h;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            PtrClassicFrameLayout ptrClassicFrameLayout2 = this.f28704g;
            if (ptrClassicFrameLayout2 != null) {
                ptrClassicFrameLayout2.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f28707j;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        }
    }
}
