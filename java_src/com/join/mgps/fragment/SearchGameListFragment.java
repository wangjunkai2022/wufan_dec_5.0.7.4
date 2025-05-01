package com.join.mgps.fragment;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XQuickRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.GameDetailActivity_;
import com.join.mgps.activity.SearchListActivity1;
import com.join.mgps.adapter.SearchGameListAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.SearchGameListBean;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.Where;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_search_game_list)
/* loaded from: classes.dex */
public class SearchGameListFragment extends BaseFragment implements SearchGameListAdapter.f, w1.l {
    @ViewById
    View A;
    @ViewById
    TextView B;
    @ViewById
    TextView C;
    @ViewById
    TextView D;
    @ViewById(R.id.rv_list_data)

    /* renamed from: b  reason: collision with root package name */
    XQuickRecyclerView f52813b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f52814c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f52815d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    SimpleDraweeView f52816e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f52817f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f52818g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.rpc.k f52819h;

    /* renamed from: i  reason: collision with root package name */
    SearchGameListAdapter f52820i;

    /* renamed from: j  reason: collision with root package name */
    com.join.android.app.component.video.g f52821j;
    @FragmentArg

    /* renamed from: k  reason: collision with root package name */
    int f52822k;
    @FragmentArg

    /* renamed from: l  reason: collision with root package name */
    String f52823l;

    /* renamed from: n  reason: collision with root package name */
    int f52825n;

    /* renamed from: o  reason: collision with root package name */
    int f52826o;

    /* renamed from: p  reason: collision with root package name */
    int f52827p;

    /* renamed from: r  reason: collision with root package name */
    int f52829r;

    /* renamed from: t  reason: collision with root package name */
    private Context f52831t;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    View f52836y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    View f52837z;
    @FragmentArg

    /* renamed from: m  reason: collision with root package name */
    String f52824m = "";

    /* renamed from: q  reason: collision with root package name */
    int f52828q = 20;

    /* renamed from: s  reason: collision with root package name */
    int f52830s = 1;

    /* renamed from: u  reason: collision with root package name */
    private boolean f52832u = false;

    /* renamed from: v  reason: collision with root package name */
    private boolean f52833v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f52834w = false;

    /* renamed from: x  reason: collision with root package name */
    private String f52835x = "";
    List<DownloadTask> E = new ArrayList();
    Map<String, DownloadTask> F = new ConcurrentHashMap();
    private int G = 0;
    private int H = 0;

    /* loaded from: classes3.dex */
    class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0) {
                com.join.android.app.component.video.g gVar = SearchGameListFragment.this.f52821j;
                if (gVar != null) {
                    gVar.g(2);
                }
                SearchGameListFragment.this.r0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            SearchGameListFragment searchGameListFragment = SearchGameListFragment.this;
            searchGameListFragment.G = searchGameListFragment.f52813b.getLastVisiblePosition();
            SearchGameListFragment searchGameListFragment2 = SearchGameListFragment.this;
            searchGameListFragment2.H = searchGameListFragment2.f52813b.getFirstVisiblePosition();
        }
    }

    /* loaded from: classes3.dex */
    class b extends UniversalItemDecoration {
        b() {
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
            aVar.f46233f = 0;
            aVar.f46234a = (int) SearchGameListFragment.this.getResources().getDimension(R.dimen.wdp10);
            aVar.f46235b = (int) SearchGameListFragment.this.getResources().getDimension(R.dimen.wdp10);
            aVar.f46236c = (int) SearchGameListFragment.this.getResources().getDimension(R.dimen.wdp10);
            aVar.f46237d = (int) SearchGameListFragment.this.getResources().getDimension(R.dimen.wdp10);
            return aVar;
        }
    }

    /* loaded from: classes3.dex */
    class c implements XQuickRecyclerView.g {
        c() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XQuickRecyclerView.g
        public void onLoadMore() {
            if (SearchGameListFragment.this.f52834w) {
                SearchGameListFragment searchGameListFragment = SearchGameListFragment.this;
                searchGameListFragment.f52827p = 1;
                searchGameListFragment.f52834w = false;
            }
            if (SearchGameListFragment.this.f52833v) {
                SearchGameListFragment searchGameListFragment2 = SearchGameListFragment.this;
                int i4 = searchGameListFragment2.f52830s + 1;
                searchGameListFragment2.f52830s = i4;
                searchGameListFragment2.i0(i4);
                return;
            }
            SearchGameListFragment searchGameListFragment3 = SearchGameListFragment.this;
            searchGameListFragment3.i0(searchGameListFragment3.f52827p + 1);
        }

        @Override // com.join.android.app.component.xrecyclerview.XQuickRecyclerView.g
        public void onRefresh() {
            SearchGameListFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DomainInfoBean f52841b;

        d(DomainInfoBean domainInfoBean) {
            this.f52841b = domainInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(SearchGameListFragment.this.f52831t).O1(Event.pdGameWishClick, new Ext().setTestAbNumber(this.f52841b.getAb_test_number()).setIsResultPage("0").setIsJoin(this.f52841b.getIs_join()));
            UtilsMy.h4(SearchGameListFragment.this.getContext(), this.f52841b.getInfo(), "game_search_wish");
        }
    }

    private void A0() {
        DownloadTask downloadTask;
        Object a5;
        if (this.H < 0 || this.G >= this.f52820i.getItemCount()) {
            return;
        }
        for (int i4 = this.H; i4 <= this.G; i4++) {
            CommonGameInfoBean commonGameInfoBean = null;
            try {
                a5 = ((SearchGameListAdapter.i) this.f52820i.getItem(i4)).a();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (CommonGameInfoBean.class.isInstance(a5)) {
                commonGameInfoBean = (CommonGameInfoBean) a5;
                if (commonGameInfoBean != null && (downloadTask = commonGameInfoBean.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                    RecyclerView.ViewHolder childViewHolder = this.f52813b.getChildViewHolder(this.f52813b.getChildAt(i4 - this.H));
                    if (childViewHolder instanceof BaseViewHolder) {
                        BaseViewHolder baseViewHolder = (BaseViewHolder) childViewHolder;
                        try {
                            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                            if (f5 == null) {
                                return;
                            }
                            long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                            if (downloadTask.getSize() == 0) {
                                ((TextView) baseViewHolder.getView(R.id.appSize)).setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            } else {
                                ((TextView) baseViewHolder.getView(R.id.appSize)).setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                            }
                            if (downloadTask.getStatus() == 12) {
                                ((ProgressBar) baseViewHolder.getView(R.id.progressBarZip)).setProgress((int) f5.getProgress());
                            } else {
                                ((ProgressBar) baseViewHolder.getView(R.id.progressBar)).setProgress((int) f5.getProgress());
                            }
                            if (downloadTask.getStatus() == 2) {
                                baseViewHolder.setText(R.id.loding_info, f5.getSpeed() + "/S");
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

    private void l0(DownloadTask downloadTask) {
        CommonGameInfoBean commonGameInfoBean;
        GInfoBean g_info;
        Iterator<DownloadTask> it2 = this.E.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.F.remove(next.getCrc_link_type_val());
                it2.remove();
                for (T t4 : this.f52820i.getData()) {
                    if (t4.f44059b == 7 && (g_info = (commonGameInfoBean = (CommonGameInfoBean) t4.f44060c).getG_info()) != null) {
                        if (commonGameInfoBean.isModGameVm()) {
                            DownloadTask downloadTask2 = this.F.get(g_info.getMod_id());
                            DownloadTask downloadTask3 = this.F.get(g_info.getId());
                            if (downloadTask2 == null && downloadTask3 == null) {
                                commonGameInfoBean.setDownloadTask(null);
                            } else if (downloadTask2 != null) {
                                commonGameInfoBean.setDownloadTask(downloadTask2);
                            } else if (downloadTask3 != null) {
                                commonGameInfoBean.setDownloadTask(downloadTask3);
                            } else if (g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                                commonGameInfoBean.setDownloadTask(null);
                            }
                        } else if (g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                            commonGameInfoBean.setDownloadTask(null);
                        }
                    }
                }
            }
        }
        k0();
    }

    private void m0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.F;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            k0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void n0(DownloadTask downloadTask) {
        UtilsMy.A4(this.E);
        if (!this.F.containsKey(downloadTask.getCrc_link_type_val())) {
            this.E.add(downloadTask);
            this.F.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        x0(downloadTask);
        k0();
    }

    private void o0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.F;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.E.add(downloadTask);
            this.F.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        x0(downloadTask);
        DownloadTask downloadTask2 = this.F.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        SearchGameListAdapter searchGameListAdapter;
        if (this.f52813b == null || (searchGameListAdapter = this.f52820i) == null || searchGameListAdapter.getItemCount() <= 0) {
            return;
        }
        int lastCompletelyVisiblePosition = this.f52813b.getLastCompletelyVisiblePosition();
        for (int firstCompletelyVisiblePosition = this.f52813b.getFirstCompletelyVisiblePosition(); firstCompletelyVisiblePosition <= lastCompletelyVisiblePosition; firstCompletelyVisiblePosition++) {
            SearchGameListAdapter.i iVar = (SearchGameListAdapter.i) this.f52820i.getItem(firstCompletelyVisiblePosition);
            if (iVar != null && (iVar.a() instanceof CommonGameInfoBean)) {
                CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) iVar.a();
                if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null && ((commonGameInfoBean.isMiniGame() || (commonGameInfoBean.getStatistics() != null && (commonGameInfoBean.getStatistics().getMin_game_search_source().intValue() == 1 || commonGameInfoBean.getStatistics().getMin_game_search_source().intValue() == 2))) && !commonGameInfoBean.isHasExposure())) {
                    Ext ext = new Ext();
                    ext.setPage("");
                    ext.setFrom("101");
                    ext.setGameId(commonGameInfoBean.getG_info().getId());
                    if (commonGameInfoBean.getStatistics() != null) {
                        ext.setDataFlag(commonGameInfoBean.getStatistics().getMin_game_search_source() + "");
                    }
                    ext.setWhere(Where.search.name());
                    commonGameInfoBean.setHasExposure(true);
                    com.papa.sim.statistic.p.l(this.f52831t).k0(Event.expSmallGameAdPage, ext, commonGameInfoBean.getG_info().getId());
                }
                if (UtilsMy.g2(commonGameInfoBean)) {
                    try {
                        Ext ext2 = new Ext();
                        ext2.setResultCode("discount_game");
                        ext2.setScenesCode(getClass().getSimpleName());
                        Data data = new Data();
                        data.setGameId(Long.parseLong(commonGameInfoBean.getG_info().getId()));
                        com.papa.sim.statistic.p.l(this.f52831t).Y(Event.expGameAdPage, ext2, data);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    private void x0(DownloadTask downloadTask) {
        CommonGameInfoBean commonGameInfoBean;
        GInfoBean g_info;
        for (int i4 = 0; i4 < this.f52820i.getItemCount(); i4++) {
            try {
                Object obj = ((SearchGameListAdapter.i) this.f52820i.getItem(i4)).f44060c;
                if ((obj instanceof CommonGameInfoBean) && (g_info = (commonGameInfoBean = (CommonGameInfoBean) obj).getG_info()) != null) {
                    if (commonGameInfoBean.isModGameVm()) {
                        DownloadTask downloadTask2 = this.F.get(g_info.getId());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.F.get(g_info.getMod_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5 && downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                            commonGameInfoBean.setDownloadTask(downloadTask);
                        } else if (z4 && downloadTask.getCrc_link_type_val().equals(g_info.getMod_id())) {
                            commonGameInfoBean.setDownloadTask(downloadTask);
                        } else if (z5 && downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                            commonGameInfoBean.setDownloadTask(downloadTask);
                        } else {
                            DownloadTask F = p1.f.K().F(g_info.getMod_id());
                            if (F == null) {
                                F = p1.f.K().F(g_info.getId());
                            }
                            if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                commonGameInfoBean.setDownloadTask(downloadTask);
                            }
                        }
                    } else if (downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                        commonGameInfoBean.setDownloadTask(downloadTask);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r3.getCrc_link_type_val().equals(r1.getMod_id()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        r0.setDownloadTask(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y0(java.util.List<com.join.mgps.dto.CommonGameInfoBean> r11) {
        /*
            r10 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r10.E
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Iterator r11 = r11.iterator()
        L9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le3
            java.lang.Object r0 = r11.next()
            com.join.mgps.dto.CommonGameInfoBean r0 = (com.join.mgps.dto.CommonGameInfoBean) r0
            com.join.mgps.dto.GInfoBean r1 = r0.getG_info()
            if (r1 == 0) goto L9
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r2 = r10.E
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3
            boolean r4 = r0.isModGameVm()
            if (r4 == 0) goto Ld0
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.F
            java.lang.String r5 = r1.getId()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            r5 = 1
            r6 = 5
            r7 = 0
            if (r4 == 0) goto L4c
            int r4 = r4.getStatus()
            if (r4 != r6) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r8 = r10.F
            java.lang.String r9 = r1.getMod_id()
            java.lang.Object r8 = r8.get(r9)
            com.github.snowdream.android.app.downloader.DownloadTask r8 = (com.github.snowdream.android.app.downloader.DownloadTask) r8
            if (r8 == 0) goto L62
            int r8 = r8.getStatus()
            if (r8 != r6) goto L62
            goto L63
        L62:
            r5 = 0
        L63:
            if (r5 == 0) goto L79
            if (r4 == 0) goto L79
            java.lang.String r6 = r3.getCrc_link_type_val()
            java.lang.String r7 = r1.getId()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L79
            r0.setDownloadTask(r3)
            goto L21
        L79:
            if (r5 == 0) goto L8d
            java.lang.String r5 = r3.getCrc_link_type_val()
            java.lang.String r6 = r1.getMod_id()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8d
            r0.setDownloadTask(r3)
            goto L21
        L8d:
            if (r4 == 0) goto La1
            java.lang.String r4 = r3.getCrc_link_type_val()
            java.lang.String r5 = r1.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La1
            r0.setDownloadTask(r3)
            goto L21
        La1:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.F
            java.lang.String r5 = r1.getMod_id()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            if (r4 != 0) goto Lbb
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.F
            java.lang.String r5 = r1.getId()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
        Lbb:
            if (r4 == 0) goto L21
            java.lang.String r5 = r3.getCrc_link_type_val()
            java.lang.String r4 = r4.getCrc_link_type_val()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L21
            r0.setDownloadTask(r3)
            goto L21
        Ld0:
            java.lang.String r4 = r3.getCrc_link_type_val()
            java.lang.String r5 = r1.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L21
            r0.setDownloadTask(r3)
            goto L21
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.SearchGameListFragment.y0(java.util.List):void");
    }

    private void z0(String str, int i4) {
        CommonGameInfoBean commonGameInfoBean;
        GInfoBean g_info;
        if (g2.h(str)) {
            return;
        }
        for (int i5 = 0; i5 < this.f52820i.getItemCount(); i5++) {
            Object obj = ((SearchGameListAdapter.i) this.f52820i.getItem(i5)).f44060c;
            if ((obj instanceof CommonGameInfoBean) && (g_info = (commonGameInfoBean = (CommonGameInfoBean) obj).getG_info()) != null && (str.equals(g_info.getId()) || str.equals(g_info.getMod_id()))) {
                commonGameInfoBean.setRequestStatus(i4);
                this.f52820i.notifyItemChanged(i5);
                return;
            }
        }
    }

    void B0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    n0(downloadTask);
                    return;
                case 3:
                    l0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    o0(downloadTask);
                    return;
                case 6:
                    m0(downloadTask);
                    return;
            }
        }
    }

    @Override // w1.l
    public void R() {
        this.f52827p = 0;
        this.f52829r = 0;
        this.f52830s = 1;
        Context context = this.f52831t;
        if (context != null && (context instanceof SearchListActivity1)) {
            this.f52825n = ((SearchListActivity1) context).q0();
            this.f52826o = ((SearchListActivity1) this.f52831t).p0();
            this.f52823l = ((SearchListActivity1) this.f52831t).getGameId();
        }
        showLoadingView();
        this.f52824m = h0();
        this.f52833v = false;
        this.f52834w = false;
        XQuickRecyclerView xQuickRecyclerView = this.f52813b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.reset();
        }
        j0(1, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.fragment.BaseFragment
    @UiThread
    public void T(String str) {
        l2.a(this.f52831t).b(str);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52831t = getActivity();
        this.f52819h = com.join.mgps.rpc.impl.i.E0();
        com.join.mgps.Util.d0.a().d(this);
        this.f52821j = new com.join.android.app.component.video.g(this.f52813b, "SearchGameListFragmentVideoHelper");
        SearchGameListAdapter searchGameListAdapter = new SearchGameListAdapter(this.f52831t, this.f52821j);
        this.f52820i = searchGameListAdapter;
        searchGameListAdapter.Y(this);
        this.f52820i.b0(h0());
        this.f52813b.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        RecyclerView.ItemAnimator itemAnimator = this.f52813b.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        this.f52813b.addOnScrollListener(new a());
        this.f52813b.addItemDecoration(new b());
        XQuickRecyclerView xQuickRecyclerView = this.f52813b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setLoadingListener(new c());
        }
        this.f52813b.setAdapter(this.f52820i);
        q0();
        R();
        this.f52832u = true;
    }

    @Override // com.join.mgps.adapter.SearchGameListAdapter.f
    public void e(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void e0() {
        com.join.android.app.component.video.g gVar = this.f52821j;
        if (gVar != null) {
            gVar.g(2);
        }
        r0();
    }

    @Override // com.join.mgps.adapter.SearchGameListAdapter.f
    public void f(String str) {
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        forumPostsBean.setPid(Integer.parseInt(str));
        com.join.mgps.Util.j0.v0(this.f52831t, forumPostsBean);
    }

    List<CommonGameInfoBean> f0(List<CommonGameInfoBean> list, SearchGameListBean searchGameListBean, boolean z4) {
        DomainInfoBean pd_info;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (searchGameListBean != null) {
            try {
                CommonGameInfoBean ad_info = searchGameListBean.getAd_info();
                if (ad_info != null) {
                    ad_info.setAdInfo(true);
                    int i4 = 0;
                    if (!ad_info.isIs_head()) {
                        i4 = Math.min(ad_info.getPosition(), Math.max(arrayList.size() - 1, 0));
                    }
                    arrayList.add(i4, ad_info);
                }
                if (z4 && (pd_info = searchGameListBean.getPd_info()) != null) {
                    CommonGameInfoBean commonGameInfoBean = new CommonGameInfoBean();
                    commonGameInfoBean.setPd_info(pd_info);
                    commonGameInfoBean.setIsPrivateDomain(true);
                    arrayList.add(Math.min(pd_info.getIndex(), arrayList.size() - 1), commonGameInfoBean);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return arrayList;
    }

    boolean g0(String str) {
        Context context = this.f52831t;
        if (context == null || !(context instanceof SearchListActivity1)) {
            return false;
        }
        return ((SearchListActivity1) context).x0(str);
    }

    String h0() {
        Context context = this.f52831t;
        return (context == null || !(context instanceof SearchListActivity1)) ? "" : ((SearchListActivity1) context).y0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideLoading() {
        View view = this.f52836y;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f52837z;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        XQuickRecyclerView xQuickRecyclerView = this.f52813b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(0);
        }
    }

    void i0(int i4) {
        Context context = this.f52831t;
        if (context != null && (context instanceof SearchListActivity1)) {
            this.f52825n = ((SearchListActivity1) context).q0();
            this.f52826o = ((SearchListActivity1) this.f52831t).p0();
        }
        j0(i4, this.f52833v);
    }

    @Override // com.join.mgps.adapter.SearchGameListAdapter.f
    public void j(String str) {
        com.papa.sim.statistic.p.l(this.f52831t).d0(this.f52822k == 0 ? "searchTotalList" : "searchGameList", str, AccountUtil_.getInstance_(this.f52831t).getUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0235, code lost:
        if (r7.f52833v != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0246, code lost:
        if (r7.f52833v != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0248, code lost:
        r7.f52829r = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x024b, code lost:
        r7.f52827p = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0233  */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.SearchGameListFragment.j0(int, boolean):void");
    }

    @Override // com.join.mgps.adapter.SearchGameListAdapter.f
    public void k(String str) {
        com.papa.sim.statistic.p.l(this.f52831t).E(this.f52822k == 0 ? "searchTotalList" : "searchGameList", str, AccountUtil_.getInstance_(this.f52831t).getUid());
    }

    void k0() {
        SearchGameListAdapter searchGameListAdapter = this.f52820i;
        if (searchGameListAdapter != null) {
            searchGameListAdapter.b0(h0());
            this.f52820i.notifyDataSetChanged();
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // com.join.mgps.adapter.SearchGameListAdapter.f
    public void n(Context context, String str, String str2, String str3, String str4) {
        String str5 = !TextUtils.isEmpty(this.f52823l) ? "fromSearchP2" : "fromSearchP3";
        if (this.f52822k == 0) {
            str5 = "fromSearchP4";
        }
        V(context, str, str2, str3, str4);
        com.papa.sim.statistic.p.l(context).j0(str5, str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
        com.join.android.app.component.video.g gVar = this.f52821j;
        if (gVar != null) {
            gVar.t();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            B0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    B0(a5, 6);
                    return;
                } else if (c5 == 7) {
                    a5.setStatus(7);
                    B0(a5, 3);
                    return;
                } else if (c5 != 8) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
                            B0(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            B0(a5, 8);
                            return;
                        case 13:
                            B0(a5, 9);
                            return;
                        default:
                            switch (c5) {
                                case 48:
                                    break;
                                case 49:
                                case 50:
                                    z0(nVar.b(), nVar.c());
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    Map<String, DownloadTask> map = this.F;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    A0();
                    return;
                }
            }
            B0(a5, 5);
        } else {
            B0(a5, 2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.g gVar = this.f52821j;
        if (gVar != null) {
            gVar.u();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.g gVar = this.f52821j;
        if (gVar != null) {
            gVar.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.fragment.BaseFragment
    public void onVisible() {
        super.onVisible();
        if (this.f52832u && g0(this.f52824m)) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.broadcast.bespeak.sussess"})
    public void p0(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gameid");
            int intExtra = intent.getIntExtra("game_book", 0);
            String stringExtra2 = intent.getStringExtra("message");
            DomainInfoBean domainInfoBean = (DomainInfoBean) intent.getSerializableExtra("pd_info");
            w0(stringExtra, intExtra);
            if (intExtra == 1) {
                if (domainInfoBean != null) {
                    UtilsMy.h4(getContext(), domainInfoBean.getInfo(), "game_search_subscribe");
                }
                com.join.mgps.Util.b0.f0(getContext()).J(getContext(), domainInfoBean, stringExtra2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q0() {
        List<DownloadTask> d5 = p1.f.K().d();
        this.E = d5;
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : this.E) {
            if (downloadTask.getCrc_link_type_val() != null) {
                this.F.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0(SearchGameListBean searchGameListBean, int i4) {
        if (searchGameListBean == null) {
            return;
        }
        if (i4 == 1) {
            searchGameListBean.setKeyword(this.f52824m);
            com.join.mgps.Util.j0.t1("1", JsonMapper.toJsonString(searchGameListBean));
        }
        ArrayList arrayList = new ArrayList();
        List<CommonGameInfoBean> f02 = f0(searchGameListBean.getList(), searchGameListBean, searchGameListBean.getList() != null && searchGameListBean.getList().size() > 0);
        if (f02 != null && f02.size() != 0) {
            u0(false, searchGameListBean.getPd_info());
            y0(f02);
            for (CommonGameInfoBean commonGameInfoBean : f02) {
                if (commonGameInfoBean.isAdInfo()) {
                    commonGameInfoBean.set_from(147);
                    commonGameInfoBean.set_from_type(147);
                } else {
                    commonGameInfoBean.set_from(112);
                    commonGameInfoBean.set_from_type(112);
                }
                int i5 = this.f52822k;
                if (i5 == 0) {
                    commonGameInfoBean.setReMarks("1");
                } else if (i5 == 1) {
                    commonGameInfoBean.setReMarks("2");
                }
                if (commonGameInfoBean.isMiniGame()) {
                    arrayList.add(new SearchGameListAdapter.i(g2.i(commonGameInfoBean.getV_url()) ? 12 : 11, commonGameInfoBean));
                } else if (commonGameInfoBean.getStatistics() != null && (commonGameInfoBean.getStatistics().getMin_game_search_source().intValue() == 1 || commonGameInfoBean.getStatistics().getMin_game_search_source().intValue() == 2)) {
                    arrayList.add(new SearchGameListAdapter.i(g2.i(commonGameInfoBean.getOnlineGameAdVideoUrl()) ? 17 : 16, commonGameInfoBean));
                } else if (commonGameInfoBean.isAdInfo() && commonGameInfoBean.isIs_head()) {
                    arrayList.add(new SearchGameListAdapter.i(14, commonGameInfoBean));
                } else if (commonGameInfoBean.isPrivateDomain()) {
                    arrayList.add(new SearchGameListAdapter.i(15, commonGameInfoBean));
                } else {
                    arrayList.add(new SearchGameListAdapter.i(7, commonGameInfoBean));
                }
            }
        } else {
            u0(true, searchGameListBean.getPd_info());
            if (searchGameListBean.getRecommend_list() != null && searchGameListBean.getRecommend_list().size() != 0) {
                y0(searchGameListBean.getRecommend_list());
                for (CommonGameInfoBean commonGameInfoBean2 : searchGameListBean.getRecommend_list()) {
                    commonGameInfoBean2.set_from(112);
                    commonGameInfoBean2.set_from_type(112);
                    int i6 = this.f52822k;
                    if (i6 == 0) {
                        commonGameInfoBean2.setReMarks("1");
                    } else if (i6 == 1) {
                        commonGameInfoBean2.setReMarks("2");
                    }
                    if (commonGameInfoBean2.isMiniGame()) {
                        arrayList.add(new SearchGameListAdapter.i(g2.i(commonGameInfoBean2.getV_url()) ? 12 : 11, commonGameInfoBean2));
                    } else if (commonGameInfoBean2.getStatistics() != null && (commonGameInfoBean2.getStatistics().getMin_game_search_source().intValue() == 1 || commonGameInfoBean2.getStatistics().getMin_game_search_source().intValue() == 2)) {
                        arrayList.add(new SearchGameListAdapter.i(g2.i(commonGameInfoBean2.getOnlineGameAdVideoUrl()) ? 17 : 16, commonGameInfoBean2));
                    } else {
                        arrayList.add(new SearchGameListAdapter.i(7, commonGameInfoBean2));
                    }
                }
            }
        }
        if (i4 == 1) {
            SearchGameListAdapter searchGameListAdapter = new SearchGameListAdapter(this.f52831t, this.f52821j);
            this.f52820i = searchGameListAdapter;
            searchGameListAdapter.b0(h0());
            XQuickRecyclerView xQuickRecyclerView = this.f52813b;
            if (xQuickRecyclerView != null) {
                xQuickRecyclerView.setAdapter(this.f52820i);
            }
            this.f52820i.setNewData(arrayList);
            e0();
            return;
        }
        this.f52820i.addData((Collection) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52831t);
    }

    @Override // com.join.mgps.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        com.join.android.app.component.video.g gVar;
        super.setUserVisibleHint(z4);
        if (!z4 || (gVar = this.f52821j) == null) {
            return;
        }
        gVar.A();
    }

    void showLoadFailed() {
        showLoadFailed("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadingView() {
        SearchGameListAdapter searchGameListAdapter = this.f52820i;
        if (searchGameListAdapter != null && searchGameListAdapter.getItemCount() > 0) {
            XQuickRecyclerView xQuickRecyclerView = this.f52813b;
            if (xQuickRecyclerView != null && xQuickRecyclerView.getVisibility() == 8) {
                this.f52813b.setVisibility(0);
            }
            View view = this.f52836y;
            if (view != null && view.getVisibility() == 0) {
                this.f52836y.setVisibility(8);
            }
        } else {
            XQuickRecyclerView xQuickRecyclerView2 = this.f52813b;
            if (xQuickRecyclerView2 != null) {
                xQuickRecyclerView2.setVisibility(8);
            }
            View view2 = this.f52836y;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.f52837z;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(List<CommonGameInfoBean> list, boolean z4, boolean z5) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (z5) {
            arrayList.add(new SearchGameListAdapter.i(13, 1));
        }
        if (list.size() != 0) {
            for (CommonGameInfoBean commonGameInfoBean : list) {
                commonGameInfoBean.set_from(103);
                commonGameInfoBean.set_from_type(112);
                commonGameInfoBean.setRecommend(true);
                int i4 = this.f52822k;
                if (i4 == 0) {
                    commonGameInfoBean.setReMarks("1");
                } else if (i4 == 1) {
                    commonGameInfoBean.setReMarks("2");
                }
                if (commonGameInfoBean.isMiniGame()) {
                    arrayList.add(new SearchGameListAdapter.i(g2.i(commonGameInfoBean.getV_url()) ? 12 : 11, commonGameInfoBean));
                } else if (commonGameInfoBean.getStatistics() != null && (commonGameInfoBean.getStatistics().getMin_game_search_source().intValue() == 1 || commonGameInfoBean.getStatistics().getMin_game_search_source().intValue() == 2)) {
                    arrayList.add(new SearchGameListAdapter.i(g2.i(commonGameInfoBean.getOnlineGameAdVideoUrl()) ? 17 : 16, commonGameInfoBean));
                } else if (commonGameInfoBean.isPrivateDomain()) {
                    arrayList.add(new SearchGameListAdapter.i(15, commonGameInfoBean));
                } else {
                    arrayList.add(new SearchGameListAdapter.i(7, commonGameInfoBean));
                }
            }
            y0(list);
        }
        if (z4) {
            SearchGameListAdapter searchGameListAdapter = new SearchGameListAdapter(this.f52831t, this.f52821j);
            this.f52820i = searchGameListAdapter;
            searchGameListAdapter.b0(h0());
            XQuickRecyclerView xQuickRecyclerView = this.f52813b;
            if (xQuickRecyclerView != null) {
                xQuickRecyclerView.setAdapter(this.f52820i);
            }
            this.f52820i.setNewData(arrayList);
            e0();
            return;
        }
        this.f52820i.addData((Collection) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(boolean z4, DomainInfoBean domainInfoBean) {
        if (!z4) {
            View view = this.f52814c;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f52815d;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else if (domainInfoBean != null) {
            View view3 = this.f52815d;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.f52814c;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            SimpleDraweeView simpleDraweeView = this.f52816e;
            if (simpleDraweeView != null) {
                MyImageLoader.h(simpleDraweeView, domainInfoBean.getPic());
                this.f52816e.setOnClickListener(new d(domainInfoBean));
            }
            com.papa.sim.statistic.p.l(this.f52831t).O1(Event.pdGameWish, new Ext().setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()).setIsResultPage("0"));
        } else {
            View view5 = this.f52815d;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.f52814c;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            ImageView imageView = this.f52817f;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.img_bg_game);
            }
            TextView textView = this.f52818g;
            if (textView != null) {
                textView.setText("未搜索到相应游戏\n已为您推荐其它游戏");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        XQuickRecyclerView xQuickRecyclerView = this.f52813b;
        if (xQuickRecyclerView == null) {
            return;
        }
        if (this.f52829r == -1) {
            xQuickRecyclerView.setNoMore();
        } else {
            xQuickRecyclerView.stopLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(String str, int i4) {
        GInfoBean g_info;
        if (g2.h(str)) {
            return;
        }
        Iterator it2 = this.f52820i.getData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SearchGameListAdapter.i iVar = (SearchGameListAdapter.i) it2.next();
            CommonGameInfoBean commonGameInfoBean = iVar.a() instanceof CommonGameInfoBean ? (CommonGameInfoBean) iVar.a() : null;
            if (commonGameInfoBean != null && (g_info = commonGameInfoBean.getG_info()) != null && str.equals(g_info.getId())) {
                g_info.setGame_book(i4);
                break;
            }
        }
        k0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoadFailed(String str) {
        XQuickRecyclerView xQuickRecyclerView = this.f52813b;
        if (xQuickRecyclerView != null) {
            xQuickRecyclerView.setVisibility(8);
        }
        View view = this.f52836y;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f52837z;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
