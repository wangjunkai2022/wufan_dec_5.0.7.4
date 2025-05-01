package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.activity.SearchListActivity1;
import com.join.mgps.adapter.l5;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SearchGameFavoriteListBean;
import com.join.mgps.dto.SearchIntegratedBean;
import com.join.mgps.dto.SearchIntegratedFavoriteBean;
import com.join.mgps.dto.SearchPostsBean;
import com.join.mgps.dto.SearchResultAdinfo;
import com.papa91.arc.ext.ToastManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_search_list)
/* loaded from: classes.dex */
public class SearchListFragment extends BaseFragment implements l5.g, w1.l {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XListView2 f52871b;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.e f52872c;

    /* renamed from: d  reason: collision with root package name */
    l5 f52873d;
    @FragmentArg

    /* renamed from: e  reason: collision with root package name */
    int f52874e;
    @FragmentArg

    /* renamed from: f  reason: collision with root package name */
    String f52875f;

    /* renamed from: i  reason: collision with root package name */
    int f52878i;

    /* renamed from: j  reason: collision with root package name */
    int f52879j;

    /* renamed from: k  reason: collision with root package name */
    int f52880k;

    /* renamed from: m  reason: collision with root package name */
    int f52882m;

    /* renamed from: n  reason: collision with root package name */
    private Context f52883n;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    View f52885p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    View f52886q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    View f52887r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f52888s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f52889t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f52890u;
    @FragmentArg

    /* renamed from: g  reason: collision with root package name */
    String f52876g = "";

    /* renamed from: h  reason: collision with root package name */
    List<l5.o> f52877h = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    int f52881l = 10;

    /* renamed from: o  reason: collision with root package name */
    private boolean f52884o = false;

    /* renamed from: v  reason: collision with root package name */
    List<DownloadTask> f52891v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    Map<String, DownloadTask> f52892w = new ConcurrentHashMap();

    /* renamed from: x  reason: collision with root package name */
    private int f52893x = 0;

    /* renamed from: y  reason: collision with root package name */
    private int f52894y = 0;

    /* loaded from: classes3.dex */
    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            SearchListFragment.this.f52893x = (i5 + i4) - 1;
            SearchListFragment.this.f52894y = i4;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            SearchListFragment.this.c0();
        }
    }

    /* loaded from: classes3.dex */
    class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            SearchListFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements com.join.mgps.customview.f {
        d() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            SearchListFragment.this.c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements com.join.mgps.customview.g {
        e() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            SearchListFragment.this.R();
        }
    }

    private void i0(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f52891v.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f52892w.remove(next.getCrc_link_type_val());
                it2.remove();
                for (l5.o oVar : this.f52877h) {
                    if (oVar.f44624a == 7) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) oVar.f44625b;
                        if (collectionBeanSubBusiness.getMod_info() != null) {
                            DownloadTask downloadTask2 = this.f52892w.get(collectionBeanSubBusiness.getMod_info().getMod_game_id());
                            DownloadTask downloadTask3 = this.f52892w.get(collectionBeanSubBusiness.getGame_id());
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
        }
        h0();
    }

    private void j0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52892w;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            h0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void k0(DownloadTask downloadTask) {
        UtilsMy.A4(this.f52891v);
        if (!this.f52892w.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52891v.add(downloadTask);
            this.f52892w.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        t0(downloadTask);
        h0();
    }

    private void l0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f52892w;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f52891v.add(downloadTask);
            this.f52892w.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        t0(downloadTask);
        DownloadTask downloadTask2 = this.f52892w.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        h0();
    }

    private void q0(ForumBean.ForumSearchQueryBean forumSearchQueryBean) {
        b0();
        boolean z4 = true;
        if (forumSearchQueryBean.getSubject() != null && !g2.h(forumSearchQueryBean.getSubject().trim())) {
            this.f52877h.add(new l5.o(1, forumSearchQueryBean));
            z4 = false;
        }
        if (!g2.h(forumSearchQueryBean.getMessage()) && !g2.h(forumSearchQueryBean.getMessage().trim())) {
            forumSearchQueryBean.setShowDivider(z4);
            this.f52877h.add(new l5.o(2, forumSearchQueryBean));
        }
        this.f52877h.add(new l5.o(3, forumSearchQueryBean));
    }

    private void t0(DownloadTask downloadTask) {
        try {
            for (l5.o oVar : this.f52877h) {
                if (oVar.f44624a == 7) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) oVar.f44625b;
                    if (collectionBeanSubBusiness.getMod_info() != null) {
                        ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                        DownloadTask downloadTask2 = this.f52892w.get(mod_info.getMain_game_id());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.f52892w.get(mod_info.getMod_game_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5) {
                            if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            }
                        } else if (z4) {
                            if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            }
                        } else if (z5) {
                            if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            }
                        } else {
                            DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                            if (F == null) {
                                F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                            }
                            if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                collectionBeanSubBusiness.setDownloadTask(downloadTask);
                            }
                        }
                    } else if (collectionBeanSubBusiness.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                        collectionBeanSubBusiness.setDownloadTask(downloadTask);
                    }
                }
            }
            this.f52873d.I(this.f52877h);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void u0(List<CollectionBeanSubBusiness> list) {
        if (this.f52891v == null) {
            return;
        }
        for (CollectionBeanSubBusiness collectionBeanSubBusiness : list) {
            for (DownloadTask downloadTask : this.f52891v) {
                if (collectionBeanSubBusiness.getMod_info() != null) {
                    ModInfoBean mod_info = collectionBeanSubBusiness.getMod_info();
                    DownloadTask downloadTask2 = this.f52892w.get(mod_info.getMain_game_id());
                    boolean z4 = true;
                    boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                    DownloadTask downloadTask3 = this.f52892w.get(mod_info.getMod_game_id());
                    z4 = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : false;
                    if (z4 && z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else if (z4) {
                        if (collectionBeanSubBusiness.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getMod_info().getMod_game_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else if (z5) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    } else {
                        DownloadTask F = collectionBeanSubBusiness.getMod_info() != null ? p1.f.K().F(collectionBeanSubBusiness.getMod_info().getMod_game_id()) : null;
                        if (F == null) {
                            F = p1.f.K().F(collectionBeanSubBusiness.getCrc_sign_id());
                        }
                        if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    }
                } else if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                    collectionBeanSubBusiness.setDownloadTask(downloadTask);
                }
            }
        }
    }

    private void v0() {
        DownloadTask downloadTask;
        Object itemAtPosition;
        if (this.f52894y < 0 || this.f52893x >= this.f52871b.getCount()) {
            return;
        }
        for (int i4 = this.f52894y; i4 <= this.f52893x; i4++) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = null;
            try {
                itemAtPosition = this.f52871b.getItemAtPosition(i4);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (CollectionBeanSubBusiness.class.isInstance(itemAtPosition)) {
                collectionBeanSubBusiness = (CollectionBeanSubBusiness) itemAtPosition;
                if (collectionBeanSubBusiness != null && (downloadTask = collectionBeanSubBusiness.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    View childAt = this.f52871b.getChildAt(i4 - this.f52894y);
                    if (childAt.getTag() instanceof l5.t) {
                        l5.t tVar = (l5.t) childAt.getTag();
                        try {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                            if (f5 == null) {
                                return;
                            }
                            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                            if (downloadTask.getSize() == 0) {
                                TextView textView = tVar.f44656j;
                                textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                TextView textView2 = tVar.f44656j;
                                textView2.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            if (downloadTask.getStatus() == 12) {
                                tVar.f44659m.setProgress((int) f5.getProgress());
                            } else {
                                tVar.f44658l.setProgress((int) f5.getProgress());
                            }
                            if (downloadTask.getStatus() == 2) {
                                TextView textView3 = tVar.f44657k;
                                textView3.setText(f5.getSpeed() + "/S");
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // w1.l
    public void R() {
        this.f52880k = 0;
        this.f52882m = 0;
        XListView2 xListView2 = this.f52871b;
        if (xListView2 != null) {
            xListView2.setPullLoadEnable(new d());
            this.f52871b.setPullRefreshEnable(new e());
            if (this.f52877h.size() != 0) {
                this.f52871b.smoothScrollToPosition(0);
            }
        }
        Context context = this.f52883n;
        if (context != null && (context instanceof SearchListActivity1)) {
            this.f52878i = ((SearchListActivity1) context).q0();
            this.f52879j = ((SearchListActivity1) this.f52883n).p0();
            this.f52875f = ((SearchListActivity1) this.f52883n).getGameId();
        }
        this.f52877h.clear();
        showLoadingView();
        this.f52876g = b0();
        g0();
        int i4 = this.f52874e;
        if (i4 == 0) {
            d0(1);
        } else if (i4 == 2) {
            e0(1);
        } else if (i4 != 3) {
        } else {
            f0(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.BaseFragment
    @UiThread
    public void T(String str) {
        ToastManager.show(str);
    }

    void V(Context context, String str, String str2, String str3, String str4) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, GameDetailActivity_.class);
        intent.putExtra("fromid", str);
        intent.putExtra("_from", 11102);
        intent.putExtra("groupuid", TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2));
        intent.putExtra("gameid", str3);
        intent.putExtra("company_id", str4);
        context.startActivity(intent);
    }

    List<CollectionBeanSubBusiness> Z(List<CollectionBeanSubBusiness> list, SearchResultAdinfo searchResultAdinfo) {
        if (searchResultAdinfo != null) {
            this.f52873d.G(searchResultAdinfo);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            if (searchResultAdinfo != null) {
                try {
                    arrayList2.add(searchResultAdinfo.getPosition(), new CollectionBeanSubBusiness(searchResultAdinfo.getGame_info()));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (searchResultAdinfo != null && i4 == searchResultAdinfo.getPosition()) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness((CollectionBeanSub) arrayList2.get(i4));
                    collectionBeanSubBusiness.setViewType(2);
                    arrayList.add(collectionBeanSubBusiness);
                    ((CollectionBeanSubBusiness) arrayList2.get(i4)).setAd(true);
                    arrayList.add((CollectionBeanSubBusiness) arrayList2.get(i4));
                    if ((((CollectionBeanSubBusiness) arrayList2.get(i4)).getPic_info() != null && ((CollectionBeanSubBusiness) arrayList2.get(i4)).getPic_info().size() > 0) || (g2.i(((CollectionBeanSubBusiness) arrayList2.get(i4)).getVedio_cover_pic()) && g2.i(((CollectionBeanSubBusiness) arrayList2.get(i4)).getVedio_url()))) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness2 = new CollectionBeanSubBusiness((CollectionBeanSub) arrayList2.get(i4));
                        collectionBeanSubBusiness2.setViewType(1);
                        arrayList.add(collectionBeanSubBusiness2);
                    }
                } else {
                    arrayList.add((CollectionBeanSubBusiness) arrayList2.get(i4));
                    if ((((CollectionBeanSubBusiness) arrayList2.get(i4)).getPic_info() != null && ((CollectionBeanSubBusiness) arrayList2.get(i4)).getPic_info().size() > 0) || (g2.i(((CollectionBeanSubBusiness) arrayList2.get(i4)).getVedio_cover_pic()) && g2.i(((CollectionBeanSubBusiness) arrayList2.get(i4)).getVedio_url()))) {
                        CollectionBeanSubBusiness collectionBeanSubBusiness3 = new CollectionBeanSubBusiness((CollectionBeanSub) arrayList2.get(i4));
                        collectionBeanSubBusiness3.setViewType(1);
                        arrayList.add(collectionBeanSubBusiness3);
                    }
                }
            }
        }
        return arrayList;
    }

    boolean a0(String str) {
        Context context = this.f52883n;
        if (context == null || !(context instanceof SearchListActivity1)) {
            return false;
        }
        return ((SearchListActivity1) context).x0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52883n = getActivity();
        this.f52872c = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
        l5 l5Var = new l5(this.f52883n);
        this.f52873d = l5Var;
        l5Var.F(this);
        this.f52873d.L(b0());
        this.f52871b.setOnScrollListener(new a());
        this.f52871b.setAdapter((ListAdapter) this.f52873d);
        this.f52871b.setPreLoadCount(5);
        m0();
        R();
        this.f52884o = true;
    }

    String b0() {
        Context context = this.f52883n;
        return (context == null || !(context instanceof SearchListActivity1)) ? "" : ((SearchListActivity1) context).y0();
    }

    void c0() {
        Context context = this.f52883n;
        if (context != null && (context instanceof SearchListActivity1)) {
            this.f52878i = ((SearchListActivity1) context).q0();
            this.f52879j = ((SearchListActivity1) this.f52883n).p0();
        }
        int i4 = this.f52874e;
        if (i4 == 0) {
            d0(this.f52880k + 1);
        } else if (i4 == 2) {
            e0(this.f52880k + 1);
        } else if (i4 != 3) {
        } else {
            f0(this.f52880k + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(int i4) {
        List<l5.o> list;
        if (com.join.android.app.common.utils.j.j(this.f52883n)) {
            int i5 = this.f52882m;
            if (i4 != i5) {
                if (i5 == -1) {
                    return;
                }
                this.f52882m = i4;
                showLoadingView();
                try {
                    try {
                        try {
                            ResultMainBean<SearchIntegratedBean> D1 = this.f52872c.D1(RequestBeanUtil.getInstance(this.f52883n).getSearchIntegratedRequestBean(b0(), i4, this.f52881l, this.f52878i, this.f52879j, this.f52875f));
                            if (D1 != null && D1.getFlag() == 1 && D1.getMessages() != null && D1.getMessages().getData() != null) {
                                o0(D1.getMessages().getData(), i4);
                            }
                            hideLoading();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            showLoadFailed();
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    return;
                } finally {
                    this.f52882m = -1;
                    s0();
                }
            }
            return;
        }
        if (i4 == 1 && ((list = this.f52877h) == null || list.size() == 0)) {
            showLoadFailed();
        }
        Context context = this.f52883n;
        if (context != null) {
            T(context.getResources().getString(R.string.net_connect_failed));
        }
    }

    @Override // com.join.mgps.adapter.l5.g
    public void e(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
        r11.f52882m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b7, code lost:
        r11.f52880k = r12;
        r11.f52882m = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
        s0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: Exception -> 0x009b, all -> 0x00bf, TRY_ENTER, TryCatch #2 {Exception -> 0x009b, blocks: (B:27:0x0077, B:32:0x0097, B:30:0x0088), top: B:73:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v28 */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0(int r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.SearchListFragment.e0(int):void");
    }

    @Override // com.join.mgps.adapter.l5.g
    public void f(String str) {
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        forumPostsBean.setPid(Integer.parseInt(str));
        com.join.mgps.Util.j0.v0(this.f52883n, forumPostsBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
        if (r4 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
        r11.f52882m = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cf, code lost:
        r11.f52880k = r12;
        r11.f52882m = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        s0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: Exception -> 0x00b3, all -> 0x00d7, TRY_ENTER, TryCatch #2 {all -> 0x00d7, blocks: (B:29:0x008f, B:34:0x00af, B:32:0x00a0, B:40:0x00b7, B:49:0x00c7), top: B:75:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v33 */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(int r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.SearchListFragment.f0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        String n02 = com.join.mgps.Util.j0.n0(this.f52874e + "");
        if (TextUtils.isEmpty(n02)) {
            return;
        }
        int i4 = this.f52874e;
        if (i4 == 0) {
            SearchIntegratedBean searchIntegratedBean = (SearchIntegratedBean) JsonMapper.getInstance().fromJson(n02, SearchIntegratedBean.class);
            if (TextUtils.isEmpty(searchIntegratedBean.getKeyword()) || !searchIntegratedBean.getKeyword().equals(b0())) {
                return;
            }
            o0(searchIntegratedBean, 1);
            hideLoading();
        } else if (i4 == 2) {
            SearchGameFavoriteListBean searchGameFavoriteListBean = (SearchGameFavoriteListBean) JsonMapper.getInstance().fromJson(n02, SearchGameFavoriteListBean.class);
            if (TextUtils.isEmpty(searchGameFavoriteListBean.getKeyword()) || !searchGameFavoriteListBean.getKeyword().equals(b0())) {
                return;
            }
            n0(searchGameFavoriteListBean, 1);
            hideLoading();
        } else if (i4 == 3) {
            SearchPostsBean searchPostsBean = (SearchPostsBean) JsonMapper.getInstance().fromJson(n02, SearchPostsBean.class);
            if (TextUtils.isEmpty(searchPostsBean.getKeyword()) || !searchPostsBean.getKeyword().equals(b0())) {
                return;
            }
            p0(searchPostsBean, 1);
            hideLoading();
        }
    }

    void h0() {
        l5 l5Var = this.f52873d;
        if (l5Var != null) {
            l5Var.L(b0());
            this.f52873d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        View view = this.f52885p;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f52886q;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        XListView2 xListView2 = this.f52871b;
        if (xListView2 != null) {
            xListView2.setVisibility(0);
        }
    }

    @Override // com.join.mgps.adapter.l5.g
    public void j(String str) {
        com.papa.sim.statistic.p.l(this.f52883n).d0(this.f52874e == 0 ? "searchTotalList" : "searchGameList", str, AccountUtil_.getInstance_(this.f52883n).getUid());
    }

    @Override // com.join.mgps.adapter.l5.g
    public void k(String str) {
        com.papa.sim.statistic.p.l(this.f52883n).E(this.f52874e == 0 ? "searchTotalList" : "searchGameList", str, AccountUtil_.getInstance_(this.f52883n).getUid());
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.f52891v = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.f52891v) {
            if (downloadTask.getCrc_link_type_val() != null) {
                this.f52892w.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
    }

    @Override // com.join.mgps.adapter.l5.g
    public void n(Context context, String str, String str2, String str3, String str4) {
        String str5 = !TextUtils.isEmpty(this.f52875f) ? "fromSearchP2" : "fromSearchP3";
        if (this.f52874e == 0) {
            str5 = "fromSearchP4";
        }
        V(context, str, str2, str3, str4);
        com.papa.sim.statistic.p.l(context).j0(str5, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0(SearchGameFavoriteListBean searchGameFavoriteListBean, int i4) {
        if (searchGameFavoriteListBean == null) {
            return;
        }
        if (i4 == 1) {
            this.f52877h.clear();
            if (!TextUtils.isEmpty(this.f52875f)) {
                this.f52877h.add(new l5.o(5, b0()));
            }
            searchGameFavoriteListBean.setKeyword(this.f52876g);
            com.join.mgps.Util.j0.t1("2", JsonMapper.toJsonString(searchGameFavoriteListBean));
        }
        if (searchGameFavoriteListBean.getList() != null && searchGameFavoriteListBean.getList().size() != 0) {
            for (SearchIntegratedFavoriteBean.FavoriteBean favoriteBean : searchGameFavoriteListBean.getList()) {
                this.f52877h.add(new l5.o(6, favoriteBean));
            }
        } else {
            this.f52877h.add(new l5.o(11, 2));
            if (searchGameFavoriteListBean.getRecommend_list() != null && searchGameFavoriteListBean.getRecommend_list().size() != 0) {
                for (SearchIntegratedFavoriteBean.FavoriteBean favoriteBean2 : searchGameFavoriteListBean.getRecommend_list()) {
                    this.f52877h.add(new l5.o(6, favoriteBean2));
                }
            }
        }
        this.f52873d.I(this.f52877h);
        if (this.f52873d != null) {
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0(SearchIntegratedBean searchIntegratedBean, int i4) {
        if (i4 == 1) {
            this.f52877h.clear();
            if (searchIntegratedBean != null) {
                searchIntegratedBean.setKeyword(this.f52876g);
            }
            com.join.mgps.Util.j0.t1("0", JsonMapper.toJsonString(searchIntegratedBean));
        }
        if (searchIntegratedBean != null) {
            this.f52877h.add(new l5.o(10, 1));
            if (searchIntegratedBean.getGame_list() != null) {
                if (searchIntegratedBean.getGame_list().getAd_info() != null) {
                    this.f52873d.G(searchIntegratedBean.getGame_list().getAd_info());
                    CollectionBeanSubBusiness collectionBeanSubBusiness = new CollectionBeanSubBusiness(searchIntegratedBean.getGame_list().getAd_info().getGame_info());
                    int i5 = this.f52874e;
                    if (i5 == 0) {
                        collectionBeanSubBusiness.setReMarks("1");
                    } else if (i5 == 1) {
                        collectionBeanSubBusiness.setReMarks("2");
                    }
                    for (DownloadTask downloadTask : this.f52891v) {
                        if (downloadTask.getCrc_link_type_val().equals(collectionBeanSubBusiness.getCrc_sign_id())) {
                            collectionBeanSubBusiness.setDownloadTask(downloadTask);
                        }
                    }
                    collectionBeanSubBusiness.set_from(147);
                    collectionBeanSubBusiness.set_from_type(147);
                    this.f52877h.add(new l5.o(9, collectionBeanSubBusiness));
                    this.f52877h.add(new l5.o(7, collectionBeanSubBusiness));
                    if ((collectionBeanSubBusiness.getPic_info() != null && collectionBeanSubBusiness.getPic_info().size() > 0) || (g2.i(collectionBeanSubBusiness.getVedio_cover_pic()) && g2.i(collectionBeanSubBusiness.getVedio_url()))) {
                        new CollectionBeanSubBusiness(collectionBeanSubBusiness).setViewType(1);
                        this.f52877h.add(new l5.o(8, collectionBeanSubBusiness));
                    }
                }
                if (searchIntegratedBean.getGame_list().getList() == null || searchIntegratedBean.getGame_list().getList().size() == 0) {
                    this.f52877h.add(new l5.o(11, 1));
                    if (searchIntegratedBean.getGame_list().getRecommend_list() != null && searchIntegratedBean.getGame_list().getRecommend_list().size() != 0) {
                        u0(searchIntegratedBean.getGame_list().getRecommend_list());
                        for (CollectionBeanSubBusiness collectionBeanSubBusiness2 : searchIntegratedBean.getGame_list().getRecommend_list()) {
                            collectionBeanSubBusiness2.set_from(103);
                            collectionBeanSubBusiness2.set_from_type(112);
                            int i6 = this.f52874e;
                            if (i6 == 0) {
                                collectionBeanSubBusiness2.setReMarks("1");
                            } else if (i6 == 1) {
                                collectionBeanSubBusiness2.setReMarks("2");
                            }
                            this.f52877h.add(new l5.o(7, collectionBeanSubBusiness2).a(true));
                        }
                    }
                } else {
                    u0(searchIntegratedBean.getGame_list().getList());
                    if (searchIntegratedBean.getGame_list().getList() != null && searchIntegratedBean.getGame_list().getList().size() != 0) {
                        for (CollectionBeanSubBusiness collectionBeanSubBusiness3 : searchIntegratedBean.getGame_list().getList()) {
                            collectionBeanSubBusiness3.set_from(103);
                            collectionBeanSubBusiness3.set_from_type(112);
                            int i7 = this.f52874e;
                            if (i7 == 0) {
                                collectionBeanSubBusiness3.setReMarks("1");
                            } else if (i7 == 1) {
                                collectionBeanSubBusiness3.setReMarks("2");
                            }
                            this.f52877h.add(new l5.o(7, collectionBeanSubBusiness3).a(true));
                        }
                    }
                    if (searchIntegratedBean.getGame_list().getList().size() >= 5) {
                        this.f52877h.add(new l5.o(12, 1));
                    }
                }
            }
            this.f52877h.add(new l5.o(10, 2));
            if (searchIntegratedBean.getGame_favorite_list() != null) {
                if (searchIntegratedBean.getGame_favorite_list().getList() != null && searchIntegratedBean.getGame_favorite_list().getList().size() != 0) {
                    for (SearchIntegratedFavoriteBean.FavoriteBean favoriteBean : searchIntegratedBean.getGame_favorite_list().getList()) {
                        this.f52877h.add(new l5.o(6, favoriteBean));
                    }
                    if (searchIntegratedBean.getGame_favorite_list().getList().size() >= 5) {
                        this.f52877h.add(new l5.o(12, 2));
                    }
                } else {
                    this.f52877h.add(new l5.o(11, 2));
                    if (searchIntegratedBean.getGame_favorite_list().getRecommend_list() != null && searchIntegratedBean.getGame_favorite_list().getRecommend_list().size() != 0) {
                        for (SearchIntegratedFavoriteBean.FavoriteBean favoriteBean2 : searchIntegratedBean.getGame_favorite_list().getRecommend_list()) {
                            this.f52877h.add(new l5.o(6, favoriteBean2));
                        }
                    }
                }
            }
            if ((searchIntegratedBean.getPosts_list() != null && searchIntegratedBean.getPosts_list().getList() != null && searchIntegratedBean.getPosts_list().getList().size() != 0) || searchIntegratedBean.getPosts_list().getTop_area() != null) {
                this.f52877h.add(new l5.o(10, 3));
                if (searchIntegratedBean.getPosts_list().getTop_area() != null) {
                    this.f52877h.add(new l5.o(4, searchIntegratedBean.getPosts_list().getTop_area()));
                }
                if (searchIntegratedBean.getPosts_list().getList() != null) {
                    for (ForumBean.ForumSearchQueryBean forumSearchQueryBean : searchIntegratedBean.getPosts_list().getList()) {
                        q0(forumSearchQueryBean);
                    }
                    if (searchIntegratedBean.getPosts_list().getList().size() >= 5) {
                        this.f52877h.add(new l5.o(12, 3));
                    }
                }
            } else if (searchIntegratedBean.getPosts_list().getRecommend_list() != null && searchIntegratedBean.getPosts_list().getRecommend_list().size() != 0) {
                this.f52877h.add(new l5.o(10, 3));
                this.f52877h.add(new l5.o(11, 3));
                for (ForumBean.ForumSearchQueryBean forumSearchQueryBean2 : searchIntegratedBean.getPosts_list().getRecommend_list()) {
                    q0(forumSearchQueryBean2);
                }
            }
            this.f52873d.I(this.f52877h);
            if (this.f52873d != null) {
                h0();
            }
            XListView2 xListView2 = this.f52871b;
            if (xListView2 != null) {
                xListView2.requestLayout();
                return;
            }
            return;
        }
        this.f52873d.I(this.f52877h);
        if (this.f52873d != null) {
            h0();
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
            w0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    w0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    a5.setStatus(7);
                    w0(a5, 3);
                    return;
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f52892w;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    v0();
                    return;
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
                            w0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            w0(a5, 8);
                            return;
                        case 13:
                            w0(a5, 9);
                            return;
                        default:
                            return;
                    }
                }
            }
            w0(a5, 5);
        } else {
            w0(a5, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        super.onVisible();
        if (this.f52884o && a0(this.f52876g)) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(SearchPostsBean searchPostsBean, int i4) {
        if (searchPostsBean == null) {
            return;
        }
        if (i4 == 1) {
            this.f52877h.clear();
            searchPostsBean.setKeyword(this.f52876g);
            com.join.mgps.Util.j0.t1("3", JsonMapper.toJsonString(searchPostsBean));
        }
        if ((searchPostsBean.getPosts_list() != null && searchPostsBean.getPosts_list().getList() != null && searchPostsBean.getPosts_list().getList().size() != 0) || searchPostsBean.getPosts_list().getTop_area() != null) {
            if (searchPostsBean.getPosts_list().getTop_area() != null && i4 == 1) {
                this.f52877h.add(new l5.o(4, searchPostsBean.getPosts_list().getTop_area()));
            }
            if (searchPostsBean.getPosts_list().getList() != null) {
                for (ForumBean.ForumSearchQueryBean forumSearchQueryBean : searchPostsBean.getPosts_list().getList()) {
                    q0(forumSearchQueryBean);
                }
            }
        } else {
            this.f52877h.add(new l5.o(11, 3));
            if (searchPostsBean.getPosts_list().getRecommend_list() != null) {
                for (ForumBean.ForumSearchQueryBean forumSearchQueryBean2 : searchPostsBean.getPosts_list().getRecommend_list()) {
                    q0(forumSearchQueryBean2);
                }
            }
        }
        this.f52873d.I(this.f52877h);
        if (this.f52873d != null) {
            h0();
        }
        XListView2 xListView2 = this.f52871b;
        if (xListView2 != null) {
            xListView2.requestLayout();
        }
    }

    public void r0(int i4) {
        this.f52874e = i4;
        if (i4 == 0) {
            this.f52871b.e();
        } else {
            this.f52871b.setPullLoadEnable(new b());
            this.f52871b.setPullRefreshEnable(new c());
        }
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        XListView2 xListView2 = this.f52871b;
        if (xListView2 == null) {
            return;
        }
        if (this.f52882m == -1) {
            xListView2.setNoMore();
        } else {
            xListView2.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52883n);
    }

    void showLoadFailed() {
        showLoadFailed("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingView() {
        if (this.f52877h.size() > 0) {
            XListView2 xListView2 = this.f52871b;
            if (xListView2 != null && xListView2.getVisibility() == 8) {
                this.f52871b.setVisibility(0);
            }
            View view = this.f52885p;
            if (view != null && view.getVisibility() == 0) {
                this.f52885p.setVisibility(8);
            }
        } else {
            XListView2 xListView22 = this.f52871b;
            if (xListView22 != null) {
                xListView22.setVisibility(8);
            }
            View view2 = this.f52885p;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.f52886q;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    void w0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    k0(downloadTask);
                    return;
                case 3:
                    i0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    l0(downloadTask);
                    return;
                case 6:
                    j0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailed(String str) {
        XListView2 xListView2 = this.f52871b;
        if (xListView2 != null) {
            xListView2.setVisibility(8);
        }
        View view = this.f52885p;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f52886q;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
