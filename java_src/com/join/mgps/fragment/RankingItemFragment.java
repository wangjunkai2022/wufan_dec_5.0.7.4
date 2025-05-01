package com.join.mgps.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.adapter.u4;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RankingMainDataBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.psk.eventmodule.StatFactory;
import java.io.Serializable;
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
@EFragment(R.layout.fragment_rank_item)
/* loaded from: classes.dex */
public class RankingItemFragment extends BaseFragment implements AbsListView.OnScrollListener {
    private RecomDatabean B;
    View J;
    SimpleDraweeView K;

    /* renamed from: b  reason: collision with root package name */
    private Context f52646b;

    /* renamed from: d  reason: collision with root package name */
    private u4 f52648d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f52649e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f52650f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    PtrClassicFrameLayout f52651g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52652h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f52653i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f52654j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f52655k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.e f52656l;

    /* renamed from: n  reason: collision with root package name */
    List<DownloadTask> f52658n;

    /* renamed from: w  reason: collision with root package name */
    private boolean f52667w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f52668x;

    /* renamed from: y  reason: collision with root package name */
    List<CollectionBeanSub> f52669y;

    /* renamed from: c  reason: collision with root package name */
    private List<CollectionBeanSubBusiness> f52647c = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private int f52657m = 1;

    /* renamed from: o  reason: collision with root package name */
    private int f52659o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f52660p = 0;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, DownloadTask> f52661q = new ConcurrentHashMap();

    /* renamed from: r  reason: collision with root package name */
    private int f52662r = 1;

    /* renamed from: s  reason: collision with root package name */
    private String f52663s = "";

    /* renamed from: t  reason: collision with root package name */
    private int f52664t = 0;

    /* renamed from: u  reason: collision with root package name */
    private String f52665u = "";

    /* renamed from: v  reason: collision with root package name */
    private boolean f52666v = false;

    /* renamed from: z  reason: collision with root package name */
    String f52670z = "";
    String A = "";
    final AtomicInteger C = new AtomicInteger(0);
    private int D = 0;
    private int E = 0;
    Handler F = new Handler();
    Runnable G = new Runnable() { // from class: com.join.mgps.fragment.c1
        @Override // java.lang.Runnable
        public final void run() {
            RankingItemFragment.this.m0();
        }
    };
    List<String> H = new ArrayList();
    private boolean I = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RankingItemFragment.this.expDiscountGame();
        }
    }

    private void E0(DownloadTask downloadTask) {
        try {
            for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f52647c) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f52661q.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f52661q.get(mod_info.getMod_game_id());
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

    private void F0(List<CollectionBeanSubBusiness> list) {
        List<DownloadTask> list2;
        if (list == null || list.size() == 0 || (list2 = this.f52658n) == null || list2.size() == 0) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            Iterator<DownloadTask> it2 = this.f52658n.iterator();
            while (true) {
                if (it2.hasNext()) {
                    DownloadTask next = it2.next();
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask = this.f52661q.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask != null && downloadTask.getStatus() == 5;
                        DownloadTask downloadTask2 = this.f52661q.get(mod_info.getMod_game_id());
                        z4 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : false;
                        if (z4 && z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (z4) {
                            if (collectionBeanSubBusiness.getMod_info() != null && next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else if (z5) {
                            if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        } else {
                            DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                            if (F == null) {
                                F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                            }
                            if (F != null && next.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                collectionBeanSubBusiness.setDownloadTask(next);
                            }
                        }
                    } else if (next.getCrc_link_type_val().equals(collectionBeanSubBusiness.getGame_id())) {
                        collectionBeanSubBusiness.setDownloadTask(next);
                        break;
                    }
                }
            }
        }
    }

    private void G0() {
        DownloadTask downloadTask;
        if (this.f52660p < 0 || this.f52659o >= this.f52650f.getCount()) {
            return;
        }
        for (int i4 = this.f52660p; i4 <= this.f52659o; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) this.f52650f.getItemAtPosition(i4);
            if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                View childAt = this.f52650f.getChildAt(i4 - this.f52660p);
                if (childAt.getTag() instanceof u4.c) {
                    u4.c cVar = (u4.c) childAt.getTag();
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                        if (downloadTask.getSize() == 0) {
                            TextView textView = cVar.f45906m;
                            textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        } else {
                            TextView textView2 = cVar.f45906m;
                            textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        }
                        if (downloadTask.getStatus() == 12) {
                            cVar.f45909p.setProgress((int) f5.getProgress());
                        } else {
                            cVar.f45908o.setProgress((int) f5.getProgress());
                        }
                        if (downloadTask.getStatus() == 2) {
                            TextView textView3 = cVar.f45907n;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void expDiscountGame() {
        try {
            try {
                if (isAdded() && !this.I) {
                    this.I = true;
                    int lastVisiblePosition = this.f52650f.getLastVisiblePosition();
                    for (int i4 = 0; i4 <= lastVisiblePosition; i4++) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f52647c.get(i4);
                        if (!collectionBeanSubBusiness.isHasExposure()) {
                            collectionBeanSubBusiness.setHasExposure(true);
                            if (UtilsMy.f2(collectionBeanSubBusiness)) {
                                try {
                                    Ext ext = new Ext();
                                    ext.setResultCode("discount_game");
                                    ext.setScenesCode(getClass().getSimpleName());
                                    Data data = new Data();
                                    data.setGameId(Long.parseLong(collectionBeanSubBusiness.getGame_id()));
                                    com.papa.sim.statistic.p.l(this.f52646b).Y(Event.expGameAdPage, ext, data);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } finally {
            this.I = false;
        }
    }

    private StatFactory.VolcanoOther f0(CollectionBeanSub collectionBeanSub) {
        List<CollectionBeanSub> list = this.f52669y;
        if (list != null && list.size() > 0) {
            for (CollectionBeanSub collectionBeanSub2 : this.f52669y) {
                if (TextUtils.equals(collectionBeanSub2.getGame_id(), collectionBeanSub.getGame_id())) {
                    return collectionBeanSub2.getPosition_path();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0() {
        if (this.f52666v) {
            return;
        }
        this.f52657m++;
        e0(this.f52663s, this.f52665u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0() {
        if (this.f52666v) {
            return;
        }
        this.f52657m = 1;
        e0(this.f52663s, this.f52665u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(AdapterView adapterView, View view, int i4, long j4) {
        if (this.f52648d.d() && i4 == 0) {
            return;
        }
        if (this.f52648d.d()) {
            i4--;
        }
        if (i4 < 0 || i4 >= this.f52647c.size()) {
            return;
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = this.f52647c.get(i4);
        if (collectionBeanSubBusiness.getCrc_sign_id() != null) {
            IntentUtil.getInstance().intentActivity(this.f52646b, collectionBeanSubBusiness.getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(View view) {
        IntentDateBean intentDateBean = new IntentDateBean();
        if (this.B.getSub() != null && this.B.getSub().size() > 0) {
            intentDateBean = this.B.getSub().get(0).getIntentDataBean();
        }
        IntentUtil.getInstance().intentActivity(view.getContext(), intentDateBean);
    }

    public static Fragment o0(String str, String str2) {
        RankingItemFragment_ rankingItemFragment_ = new RankingItemFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putString("title", str2);
        rankingItemFragment_.setArguments(bundle);
        return rankingItemFragment_;
    }

    public static Fragment p0(boolean z4, String str, String str2, List<CollectionBeanSub> list) {
        RankingItemFragment_ rankingItemFragment_ = new RankingItemFragment_();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        bundle.putBoolean("fromHome", z4);
        bundle.putString("title", str2);
        bundle.putSerializable("datas", (Serializable) list);
        rankingItemFragment_.setArguments(bundle);
        return rankingItemFragment_;
    }

    private void t0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f52658n.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f52661q.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CollectionBeanSubBusiness collectionBeanSubBusiness : this.f52647c) {
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        DownloadTask downloadTask2 = this.f52661q.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                        DownloadTask downloadTask3 = this.f52661q.get(collectionBeanSubBusiness.getGame_id());
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
        this.f52648d.notifyDataSetChanged();
    }

    private void u0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52661q;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            this.f52648d.notifyDataSetChanged();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void v0(DownloadTask downloadTask) {
        UtilsMy.A4(this.f52658n);
        if (!this.f52661q.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52658n.add(downloadTask);
            this.f52661q.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        E0(downloadTask);
        this.f52648d.notifyDataSetChanged();
    }

    private void w0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52661q;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52658n.add(downloadTask);
            this.f52661q.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        E0(downloadTask);
        DownloadTask downloadTask2 = this.f52661q.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        this.f52648d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m0() {
        for (int i4 = 0; i4 < this.f52647c.size(); i4++) {
            if (i4 <= this.f52659o) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = this.f52647c.get(i4);
                String str = this.f52668x ? "home" : "ranking";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                int i5 = i4 + 1;
                sb.append(i5);
                String sb2 = sb.toString();
                if (!this.H.contains(sb2)) {
                    this.H.add(sb2);
                    StatFactory companion = StatFactory.Companion.getInstance(this.f52646b);
                    com.psk.eventmodule.Event event = com.psk.eventmodule.Event.exposure;
                    String game_id = collectionBeanSubBusiness.getGame_id();
                    companion.sendEvent(new StatFactory.VolcanoEvent(event, game_id, new StatFactory.SpmData("wufun", str, "ranking", i5 + "", false), collectionBeanSubBusiness.getPosition_path(), UtilsMy.k2(collectionBeanSubBusiness.getTag_info())));
                }
            }
        }
    }

    public void A0(String str) {
        if (str.equals(this.f52663s)) {
            return;
        }
        this.f52663s = str;
        this.f52650f.l();
        this.f52657m = 1;
        showLoding();
        this.f52647c.clear();
        this.f52648d.notifyDataSetChanged();
        this.f52651g.setVisibility(8);
        e0(this.f52663s, this.f52665u);
    }

    public void B0(String str) {
        String str2 = this.f52665u;
        if (str2 == null || str == null || str.equals(str2)) {
            return;
        }
        this.f52665u = str;
        XListView2 xListView2 = this.f52650f;
        if (xListView2 != null) {
            xListView2.l();
        }
        this.f52657m = 1;
        showLoding();
        this.f52647c.clear();
        u4 u4Var = this.f52648d;
        if (u4Var != null) {
            u4Var.notifyDataSetChanged();
        }
        this.f52651g.setVisibility(8);
        e0(this.f52663s, this.f52665u);
    }

    public void C0(String str, String str2) {
        this.f52665u = str2;
        this.f52663s = str;
        this.f52650f.l();
        this.f52657m = 1;
        showLoding();
        this.f52647c.clear();
        this.f52648d.notifyDataSetChanged();
        this.f52651g.setVisibility(8);
        e0(this.f52663s, this.f52665u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(boolean z4) {
        XListView2 xListView2 = this.f52650f;
        if (xListView2 != null) {
            xListView2.u();
            this.f52650f.v();
        }
        if (!z4) {
            if (this.f52657m == 1 && this.f52647c.size() == 0) {
                LinearLayout linearLayout = this.f52653i;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LinearLayout linearLayout2 = this.f52652h;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                PtrClassicFrameLayout ptrClassicFrameLayout = this.f52651g;
                if (ptrClassicFrameLayout != null) {
                    ptrClassicFrameLayout.setVisibility(8);
                }
                LinearLayout linearLayout3 = this.f52654j;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                    return;
                }
                return;
            }
            try {
                l2.a(this.f52646b).b(getString(R.string.net_connect_failed));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (z4 && this.f52657m == 1 && this.f52647c.size() == 0) {
            LinearLayout linearLayout4 = this.f52653i;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            LinearLayout linearLayout5 = this.f52652h;
            if (linearLayout5 != null) {
                linearLayout5.setVisibility(8);
            }
            PtrClassicFrameLayout ptrClassicFrameLayout2 = this.f52651g;
            if (ptrClassicFrameLayout2 != null) {
                ptrClassicFrameLayout2.setVisibility(8);
            }
            LinearLayout linearLayout6 = this.f52654j;
            if (linearLayout6 != null) {
                linearLayout6.setVisibility(0);
            }
        }
    }

    void H0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    v0(downloadTask);
                    return;
                case 3:
                    t0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    w0(downloadTask);
                    return;
                case 6:
                    u0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        Fragment parentFragment;
        g0();
        this.f52656l = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        this.f52652h.setBackgroundResource(R.color.activity_default_background);
        this.f52646b = getActivity();
        this.f52657m = 1;
        List<DownloadTask> d5 = p1.f.K().d();
        this.f52658n = d5;
        if (d5 != null && d5.size() > 0) {
            for (DownloadTask downloadTask : this.f52658n) {
                this.f52661q.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        this.f52648d = new u4(this.f52646b, this.f52670z);
        if (g2.i(this.f52670z)) {
            this.f52648d.h(Integer.parseInt("0"));
        }
        if (this.f52668x) {
            this.f52648d.f();
        }
        this.f52647c = this.f52648d.e();
        this.f52650f.setAdapter((ListAdapter) this.f52648d);
        this.f52650f.setPreLoadCount(10);
        this.f52667w = false;
        showLoding();
        if (this.f52669y != null) {
            ArrayList arrayList = new ArrayList();
            for (CollectionBeanSub collectionBeanSub : this.f52669y) {
                arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
            }
            showMain(arrayList);
            this.f52650f.setNoMore();
        }
        this.f52650f.setPullLoadEnable(new com.join.mgps.customview.f() { // from class: com.join.mgps.fragment.a1
            @Override // com.join.mgps.customview.f
            public final void onLoadMore() {
                RankingItemFragment.this.i0();
            }
        });
        this.f52650f.setPullRefreshEnable(new com.join.mgps.customview.g() { // from class: com.join.mgps.fragment.b1
            @Override // com.join.mgps.customview.g
            public final void onRefresh() {
                RankingItemFragment.this.j0();
            }
        });
        this.f52650f.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.join.mgps.fragment.z0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                RankingItemFragment.this.k0(adapterView, view, i4, j4);
            }
        });
        this.f52650f.setOnScrollListener(this);
        if (this.isVisible && (parentFragment = getParentFragment()) != null && parentFragment.isVisible()) {
            Ext ext = new Ext();
            ext.setFrom(this.D + "");
            com.papa.sim.statistic.p.l(this.f52646b).O1(Event.goGameRankGame, ext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void c0() {
        if (this.f52667w || !isVisible()) {
            return;
        }
        e0(this.f52663s, this.f52665u);
        c0();
        this.f52667w = true;
    }

    public CommonRequestBean d0(String str, String str2, String str3) {
        return RequestBeanUtil.getInstance(this.f52646b).getGameListRequestBean(this.f52657m, 10, str, str2, this.f52662r, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0(String str, String str2) {
        if (this.f52669y != null) {
            return;
        }
        if (com.join.android.app.common.utils.j.j(this.f52646b)) {
            this.f52666v = true;
            AtomicInteger atomicInteger = this.C;
            atomicInteger.set(atomicInteger.get() + 1);
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    RequestModel requestModel = new RequestModel(this.f52646b);
                    LuckHistoryrequest luckHistoryrequest = new LuckHistoryrequest();
                    luckHistoryrequest.setType(Integer.parseInt(this.f52670z));
                    luckHistoryrequest.setPage(this.f52657m);
                    luckHistoryrequest.setUid(AccountUtil_.getInstance_(this.f52646b).getAccountData().getUid());
                    requestModel.setArgs(luckHistoryrequest);
                    ResponseModel<RankingMainDataBean> body = com.join.mgps.rpc.impl.i.D0().B0().a1(requestModel.makeSign()).execute().body();
                    AtomicInteger atomicInteger2 = this.C;
                    atomicInteger2.set(atomicInteger2.get() - 1);
                    List<CollectionBeanSub> list = null;
                    if (body != null && body.getData() != null) {
                        list = body.getData().getRank_list();
                        if (body.getData().getRank_type() != null && body.getData().getRank_type().size() > 0) {
                            new PrefDef_(this.f52646b).rankingMenu2().g(JsonMapper.toJsonString(body.getData().getRank_type()));
                        }
                    }
                    if (list != null) {
                        Iterator<CollectionBeanSub> it2 = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            CollectionBeanSub next = it2.next();
                            i4++;
                            if (this.f52668x && i4 > 3) {
                                q0();
                                break;
                            }
                            next.set_from_type(this.E);
                            next.set_from(this.D);
                            String str3 = this.f52668x ? "home" : "ranking";
                            next.setRecPosition(str3 + "-ranking-" + (arrayList.size() + i4 + 1));
                            arrayList.add(new CollectionBeanSubBusiness(next));
                        }
                    }
                    if (arrayList.size() > 0) {
                        showMain(arrayList);
                    } else if (this.f52657m == 1 && arrayList.size() == 0) {
                        D0(true);
                    } else {
                        q0();
                    }
                } catch (Exception e5) {
                    AtomicInteger atomicInteger3 = this.C;
                    atomicInteger3.set(atomicInteger3.get() - 1);
                    e5.printStackTrace();
                    if (this.f52657m == 1 && arrayList.size() == 0) {
                        D0(false);
                    } else {
                        q0();
                    }
                }
                return;
            } finally {
                this.f52666v = false;
            }
        }
        D0(false);
    }

    void g0() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f52670z = arguments.getString("type");
        this.f52668x = arguments.getBoolean("fromHome");
        this.A = arguments.getString("title");
        this.f52669y = (List) arguments.getSerializable("datas");
        String str = this.f52670z;
        this.f52663s = str;
        if ("1".equals(str)) {
            this.D = 10903;
            this.E = 10903;
        } else if ("2".equals(this.f52670z)) {
            this.D = 10902;
            this.E = 10902;
        } else if ("3".equals(this.f52670z)) {
            this.D = 10901;
            this.E = 10901;
        } else if ("6".equals(this.f52670z)) {
            this.D = 10904;
            this.E = 10904;
        } else if ("7".equals(this.f52670z)) {
            this.D = 10905;
            this.E = 10905;
        } else if ("8".equals(this.f52670z)) {
            this.D = 10906;
            this.E = 10906;
        }
    }

    void h0() {
        XListView2 xListView2;
        if (TextUtils.isEmpty(this.f52670z) || (xListView2 = this.f52650f) == null) {
            return;
        }
        View view = this.J;
        if (view != null) {
            xListView2.removeHeaderView(view);
            this.f52648d.g(false);
            this.J = null;
            return;
        }
        RecomDatabean recomDatabean = this.B;
        if (recomDatabean == null || recomDatabean.getMain() == null || this.B.getSub() == null || this.B.getSub().size() <= 0) {
            return;
        }
        if (this.J == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_ranking_item_header, (ViewGroup) null, false);
            this.J = inflate;
            this.K = (SimpleDraweeView) inflate.findViewById(R.id.cover);
            xListView2.addHeaderView(this.J);
            this.f52648d.g(true);
        }
        MyImageLoader.d(this.K, R.drawable.img_qs, this.B.getMain() != null ? this.B.getMain().getPic_remote() : "");
        this.J.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RankingItemFragment.this.l0(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void lazyLoad() {
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        this.f52657m = 1;
        e0(this.f52663s, this.f52665u);
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
            H0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    H0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    H0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f52661q;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    G0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            H0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            H0(a5, 8);
                            return;
                        case 13:
                            H0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            H0(a5, 5);
        } else {
            H0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        u4 u4Var;
        super.onHiddenChanged(z4);
        if (z4 || (u4Var = this.f52648d) == null) {
            return;
        }
        u4Var.notifyDataSetChanged();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f52659o = (i5 + i4) - 1;
        this.f52660p = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0) {
            this.mHandler.postDelayed(new a(), 500L);
            if ("1".equals(this.f52670z)) {
                this.F.removeCallbacks(this.G);
                this.F.postDelayed(this.G, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        super.onVisible();
        if (this.isVisible && isAdded()) {
            Ext ext = new Ext();
            ext.setFrom(this.D + "");
            com.papa.sim.statistic.p.l(this.f52646b).O1(Event.goGameRankGame, ext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        XListView2 xListView2 = this.f52650f;
        if (xListView2 != null) {
            xListView2.setNoMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        if (this.f52662r != 1001) {
            getActivity().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f52657m = 1;
        showLoding();
        e0(this.f52663s, this.f52665u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void s0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        u4 u4Var = this.f52648d;
        if (u4Var != null) {
            u4Var.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52646b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        LinearLayout linearLayout = this.f52652h;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52653i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f52651g;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f52654j;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<CollectionBeanSubBusiness> list) {
        try {
            if (this.C.get() > 0) {
                return;
            }
            LinearLayout linearLayout = this.f52653i;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f52652h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            PtrClassicFrameLayout ptrClassicFrameLayout = this.f52651g;
            if (ptrClassicFrameLayout != null) {
                ptrClassicFrameLayout.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f52654j;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            XListView2 xListView2 = this.f52650f;
            if (xListView2 != null) {
                xListView2.u();
                this.f52650f.v();
            }
            if (this.f52657m == 1) {
                this.f52647c.clear();
                h0();
            }
            F0(list);
            this.f52647c.addAll(list);
            if (this.f52650f != null) {
                if (list.size() == 0) {
                    this.f52650f.setNoMore();
                }
                this.f52648d.notifyDataSetChanged();
                if (this.f52657m == 1) {
                    onScrollStateChanged(null, 0);
                    this.f52650f.setSelection(0);
                }
            }
            if (this.f52650f.getLastVisiblePosition() == this.f52650f.getAdapter().getCount() - 1 && this.f52657m == 1) {
                this.f52650f.s();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void x0(List<CollectionBeanSub> list, int i4) {
        if (list == null || list.equals(this.f52669y)) {
            return;
        }
        this.f52669y = list;
        ArrayList arrayList = new ArrayList();
        for (CollectionBeanSub collectionBeanSub : list) {
            collectionBeanSub.set_from_type(i4);
            collectionBeanSub.set_from(i4);
            arrayList.add(new CollectionBeanSubBusiness(collectionBeanSub));
        }
        this.f52647c.clear();
        showMain(arrayList);
        this.f52650f.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        com.join.mgps.Util.d0.a().c(new IntentClassfyEvent(0));
    }
}
