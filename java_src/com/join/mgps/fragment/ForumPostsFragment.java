package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.MyFlowLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.RecommenGroupClassify;
import com.join.mgps.dto.RecommendLabelTag;
import com.join.mgps.dto.ResultMainBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.mg_forum_all_fragment)
/* loaded from: classes.dex */
public class ForumPostsFragment extends FragmentPagerFragment implements AbsListView.OnScrollListener {
    private static final String D = "key_groups_data";
    private static final String E = "key_fragment_pos";

    /* renamed from: b  reason: collision with root package name */
    private int f51406b;

    /* renamed from: c  reason: collision with root package name */
    private RecommenGroupClassify f51407c;

    /* renamed from: d  reason: collision with root package name */
    private Context f51408d;

    /* renamed from: e  reason: collision with root package name */
    private int f51409e;

    /* renamed from: f  reason: collision with root package name */
    private List<RecommendLabelTag> f51410f;

    /* renamed from: g  reason: collision with root package name */
    private List<ForumBean.ForumPostsBean> f51411g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.mgps.customview.g f51412h;

    /* renamed from: i  reason: collision with root package name */
    private ForumBaseAdapter f51413i;

    /* renamed from: k  reason: collision with root package name */
    com.join.android.app.component.video.c f51415k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ForumLoadingView f51416l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    XListView2 f51417m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.i f51418n;

    /* renamed from: o  reason: collision with root package name */
    public int f51419o;

    /* renamed from: p  reason: collision with root package name */
    public int f51420p;

    /* renamed from: r  reason: collision with root package name */
    ConnectivityManager f51422r;

    /* renamed from: s  reason: collision with root package name */
    MyFlowLayout f51423s;

    /* renamed from: u  reason: collision with root package name */
    private com.join.mgps.rpc.e f51425u;

    /* renamed from: j  reason: collision with root package name */
    String f51414j = "ForumPostsFragment";

    /* renamed from: q  reason: collision with root package name */
    boolean f51421q = false;

    /* renamed from: t  reason: collision with root package name */
    List<Integer> f51424t = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    boolean f51426v = false;

    /* renamed from: w  reason: collision with root package name */
    private Map<String, DownloadTask> f51427w = new ConcurrentHashMap();

    /* renamed from: x  reason: collision with root package name */
    Map<String, DownloadTask> f51428x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    Map<String, DownloadTask> f51429y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    private List<DownloadTask> f51430z = new ArrayList();
    int A = 0;
    boolean B = false;
    com.join.mgps.customview.o C = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ForumLoadingView.e {
        a(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumPostsFragment.this.i0()) {
                ForumPostsFragment forumPostsFragment = ForumPostsFragment.this;
                forumPostsFragment.e0(forumPostsFragment.f51419o + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements com.join.mgps.customview.g {
        c() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (ForumPostsFragment.this.i0()) {
                if ((ForumPostsFragment.this.getParentFragment() instanceof ForumIndexFragment) && ((ForumIndexFragment) ForumPostsFragment.this.getParentFragment()).s0()) {
                    ForumPostsFragment.this.E0();
                }
                ForumPostsFragment forumPostsFragment = ForumPostsFragment.this;
                forumPostsFragment.f51420p = 0;
                forumPostsFragment.f51419o = 0;
                List<Integer> list = forumPostsFragment.f51424t;
                if (list != null) {
                    list.clear();
                }
                ForumPostsFragment.this.e0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements com.join.mgps.listener.f {
        d() {
        }

        @Override // com.join.mgps.listener.f
        public void a(int i4) {
            ForumPostsFragment forumPostsFragment = ForumPostsFragment.this;
            forumPostsFragment.f51417m.smoothScrollToPositionFromTop(i4, forumPostsFragment.f51408d.getResources().getDimensionPixelOffset(R.dimen.wdp100));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends ForumBaseAdapter.b1 {
        e() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            ForumPostsFragment forumPostsFragment = ForumPostsFragment.this;
            if (!forumPostsFragment.isLogined(forumPostsFragment.f51408d)) {
                ForumPostsFragment forumPostsFragment2 = ForumPostsFragment.this;
                forumPostsFragment2.showMessage(forumPostsFragment2.f51408d.getString(R.string.forum_user_not_login));
            } else if (!ForumPostsFragment.this.H0()) {
                ForumPostsFragment.this.B0();
            } else {
                ForumPostsFragment.this.w0(i4);
                ForumPostsFragment.this.o0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(ForumPostsFragment.this.f51408d, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
            ForumPostsFragment forumPostsFragment = ForumPostsFragment.this;
            forumPostsFragment.B = true;
            forumPostsFragment.c0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements com.join.mgps.customview.f {
        f() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumPostsFragment.this.i0()) {
                ForumPostsFragment forumPostsFragment = ForumPostsFragment.this;
                forumPostsFragment.e0(forumPostsFragment.f51419o + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.join.mgps.Util.w0.e("XListView", "stopXlistRefreshAndLoadMore");
            XListView2 xListView2 = ForumPostsFragment.this.f51417m;
            if (xListView2 == null) {
                return;
            }
            xListView2.v();
            ForumPostsFragment.this.f51417m.u();
            com.join.mgps.Util.w0.e("XListView", "stopXlistRefreshAndLoadMore111111111111");
            if (ForumPostsFragment.this.f51420p == -1) {
                com.join.mgps.Util.w0.e("XListView", "stopXlistRefreshAndLoadMore222222222");
                ForumPostsFragment.this.f51417m.setNoMore();
            }
            if ((ForumPostsFragment.this.getParentFragment() instanceof ForumIndexFragment) && ((ForumIndexFragment) ForumPostsFragment.this.getParentFragment()).i0() == ForumPostsFragment.this.f51406b) {
                ((ForumIndexFragment) ForumPostsFragment.this.getParentFragment()).L0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendLabelTag f51438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f51439c;

        h(RecommendLabelTag recommendLabelTag, TextView textView) {
            this.f51438b = recommendLabelTag;
            this.f51439c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean isSelected = view.isSelected();
            view.setSelected(!isSelected);
            if (isSelected) {
                if (ForumPostsFragment.this.f51424t.contains(Integer.valueOf(this.f51438b.getTag_id()))) {
                    ForumPostsFragment.this.f51424t.remove(Integer.valueOf(this.f51438b.getTag_id()));
                }
            } else {
                ForumPostsFragment.this.f51424t.add(Integer.valueOf(this.f51438b.getTag_id()));
            }
            this.f51439c.getPaint().setFakeBoldText(!isSelected);
            this.f51439c.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends ForumLoadingView.e {
        i(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumPostsFragment.this.a0(1);
            ForumPostsFragment.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j extends ForumLoadingView.e {
        j(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
        }
    }

    private void A0() {
        for (int i4 = 0; i4 < this.f51411g.size(); i4++) {
            z0(this.f51411g.get(i4));
        }
    }

    private com.wufan.user.service.protobuf.n0 Z(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void b0() {
        com.join.mgps.customview.o oVar = this.C;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.C.dismiss();
    }

    private void d0() {
        String string = getArguments().getString(D);
        int i4 = getArguments().getInt(E);
        if (g2.i(string)) {
            this.f51407c = (RecommenGroupClassify) JsonMapper.getInstance().fromJson(string, RecommenGroupClassify.class);
        }
        this.f51406b = i4;
    }

    public static Fragment f0(RecommenGroupClassify recommenGroupClassify, int i4) {
        ForumPostsFragment_ forumPostsFragment_ = new ForumPostsFragment_();
        Bundle bundle = new Bundle();
        bundle.putCharSequence(D, JsonMapper.toJsonString(recommenGroupClassify));
        bundle.putInt(E, i4);
        forumPostsFragment_.setArguments(bundle);
        return forumPostsFragment_;
    }

    private void h0() {
        XListView2 xListView2 = this.f51417m;
        if (xListView2 == null) {
            return;
        }
        xListView2.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f51417m.setPullLoadEnable(new b());
        c cVar = new c();
        this.f51412h = cVar;
        this.f51417m.setPullRefreshEnable(cVar);
        this.f51415k = new com.join.android.app.component.video.c(getContext(), this.f51414j);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(this.f51408d, this.f51415k);
        this.f51413i = forumBaseAdapter;
        forumBaseAdapter.f1(new d());
        this.f51413i.C0(this.f51414j);
        this.f51413i.I0(new e());
        this.f51417m.setOnScrollListener(this);
        this.f51417m.setAdapter((ListAdapter) this.f51413i);
        a0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 Z = Z(context);
        return Z != null && g2.i(Z.getToken());
    }

    private View k0(RecommendLabelTag recommendLabelTag) {
        View inflate = View.inflate(getContext(), R.layout.forum_group_tag_item, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        inflate.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.tagTv);
        if (textView == null) {
            return null;
        }
        textView.setBackgroundResource(R.color.transparent);
        textView.setTextColor(Color.parseColor("#3CA4FD"));
        textView.setText("#" + recommendLabelTag.getTag_name() + "#");
        textView.setOnClickListener(new h(recommendLabelTag, textView));
        return inflate;
    }

    private void q0(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f51430z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f51427w.remove(next.getCrc_link_type_val());
                    it2.remove();
                    break;
                }
            }
            m0(downloadTask, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void r0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51427w;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            m0(downloadTask, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void s0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f51430z, downloadTask);
        if (!this.f51427w.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51430z.add(downloadTask);
            this.f51427w.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        m0(downloadTask, 0);
    }

    private void t0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51427w;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51430z.add(downloadTask);
            this.f51427w.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f51427w.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        m0(downloadTask, 1);
    }

    private void u0() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.f51430z;
            if (list == null || i4 >= list.size()) {
                return;
            }
            m0(p1.f.K().F(this.f51430z.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    private void x0() {
        List<RecommendLabelTag> list = this.f51410f;
        if (list == null || list.size() < 1) {
            return;
        }
        if (this.f51423s == null) {
            MyFlowLayout myFlowLayout = new MyFlowLayout(this.f51408d);
            this.f51423s = myFlowLayout;
            this.f51417m.addHeaderView(myFlowLayout);
        }
        this.f51423s.removeAllViews();
        for (RecommendLabelTag recommendLabelTag : this.f51410f) {
            View k02 = k0(recommendLabelTag);
            if (k02 != null) {
                this.f51423s.addView(k02);
            }
        }
        if (this.f51417m.getHeaderViewsCount() > 0) {
            this.f51417m.removeHeaderView(this.f51423s);
        }
    }

    private void y0() {
        List<RecommendLabelTag> list = this.f51410f;
        if (list == null || list.size() < 1) {
            return;
        }
        this.f51413i.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.TAG_FLOW_LAYOUT, new ForumBaseAdapter.r1.f0(this.f51410f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void z0(com.join.mgps.dto.ForumBean.ForumPostsBean r22) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.ForumPostsFragment.z0(com.join.mgps.dto.ForumBean$ForumPostsBean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        com.join.mgps.Util.b0.f0(this.f51408d).m(this.f51408d);
    }

    void C0(int i4, ForumData.HomepageRecommendLabel homepageRecommendLabel) {
        List<RecommendLabelTag> recommend_tags = homepageRecommendLabel.getRecommend_tags();
        List<ForumBean.ForumPostsBean> post_list = homepageRecommendLabel.getPost_list();
        if (this.f51410f == null) {
            this.f51410f = new ArrayList();
        }
        if (this.f51411g == null) {
            this.f51411g = new ArrayList();
        }
        if (i4 == 1) {
            this.f51410f.clear();
            this.f51411g.clear();
            if (homepageRecommendLabel.getLabel_switcher() == 1 && recommend_tags != null && recommend_tags.size() > 0) {
                RecommendLabelTag recommendLabelTag = new RecommendLabelTag();
                recommendLabelTag.setTag_id(-1);
                recommendLabelTag.setTag_name(this.f51408d.getResources().getString(R.string.mg_f_all_tag));
                this.f51410f.add(recommendLabelTag);
                this.f51410f.addAll(recommend_tags);
            }
        }
        if (post_list != null) {
            this.f51411g.addAll(post_list);
        }
        l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void D0(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f51411g.size(); i4++) {
            ForumBean.ForumPostsBean forumPostsBean = this.f51411g.get(i4);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadtaskDown.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadtaskDown);
                z4 |= true;
            }
        }
        if (z4) {
            l0();
        }
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(this.f51408d, downloadtaskDown.getCrc_link_type_val());
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.o1(this.f51408d, downloadtaskDown)) {
            return;
        }
        if (detailResultBean.getDown_status() == 5) {
            UtilsMy.l1(this.f51408d, downloadtaskDown);
        } else {
            UtilsMy.R0(this.f51408d, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0() {
        this.mHandler.postDelayed(new g(), 100L);
    }

    @Override // ru.noties.scrollable.j
    public void F(int i4, long j4) {
        XListView2 xListView2 = this.f51417m;
        if (xListView2 != null) {
            xListView2.smoothScrollBy(i4, (int) j4);
        }
    }

    public void F0() {
        com.join.android.app.component.video.c cVar = this.f51415k;
        if (cVar != null) {
            cVar.M(1);
            this.f51415k.n(this.f51417m);
        }
    }

    void G0(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            if (i4 != 4) {
                return;
            }
            u0();
            return;
        }
        switch (i4) {
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
                s0(downloadTask);
                return;
            case 3:
                q0(downloadTask);
                return;
            case 4:
                u0();
                return;
            case 5:
                t0(downloadTask);
                return;
            case 6:
                r0(downloadTask);
                return;
            default:
                return;
        }
    }

    boolean H0() {
        if (Z(this.f51408d) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this.f51408d).isTourist();
    }

    synchronized void R() {
        e0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0(int i4) {
        ForumLoadingView forumLoadingView = this.f51416l;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.m();
            this.f51416l.j(1);
        } else if (i4 == 2) {
            forumLoadingView.m();
            this.f51416l.j(2);
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败~");
            ForumLoadingView forumLoadingView2 = this.f51416l;
            forumLoadingView2.setListener(new a(forumLoadingView2));
            this.f51416l.j(16);
        } else if (i4 == 9) {
            forumLoadingView.j(9);
            ForumLoadingView forumLoadingView3 = this.f51416l;
            forumLoadingView3.setListener(new i(forumLoadingView3));
            this.f51416l.j(9);
        } else if (i4 != 10) {
        } else {
            RecommenGroupClassify recommenGroupClassify = this.f51407c;
            String gname = recommenGroupClassify != null ? recommenGroupClassify.getGname() : "";
            if (g2.h(gname)) {
                gname = "帖子";
            }
            ForumLoadingView forumLoadingView4 = this.f51416l;
            forumLoadingView4.setFailedMsg("没有更多" + gname + "帖哦~");
            ForumLoadingView forumLoadingView5 = this.f51416l;
            forumLoadingView5.setListener(new j(forumLoadingView5));
            this.f51416l.setReloadingVisibility(0);
            this.f51416l.j(10);
            this.f51416l.setFailedImgVisibility(8);
            this.f51416l.setReloadingVisibility(0);
            this.f51416l.setFailedReloadingRes(R.drawable.papa_loading_null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51418n = com.join.mgps.rpc.impl.g.A0();
        this.f51408d = getActivity();
        d0();
        if (!this.f51426v) {
            g0();
        }
        h0();
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0(String str) {
        Context context = getContext();
        if (j0(context)) {
            if (this.A == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
                    ResultMainBean<List<DetailResultBean>> R = this.f51425u.R(RequestBeanUtil.getInstance(context).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.B) {
                                D0(detailResultBean);
                            }
                        }
                    } else if (R != null && R.getFlag() != 0) {
                        T("获取游戏信息失败");
                    } else {
                        T("获取游戏信息失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    T("获取游戏信息失败");
                }
                return;
            } finally {
                this.A = 0;
                this.B = false;
            }
        }
        T("获取游戏信息失败");
    }

    void changeDownloadTaskNumber(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        if (i4 == 2) {
            if (!this.f51428x.containsKey(crc_link_type_val)) {
                this.f51428x.put(crc_link_type_val, downloadTask);
            }
            if (this.f51429y.containsKey(crc_link_type_val)) {
                return;
            }
            this.f51429y.put(crc_link_type_val, downloadTask);
        } else if (i4 != 3) {
            if (i4 != 5) {
                if (i4 == 6) {
                    if (this.f51429y.containsKey(crc_link_type_val)) {
                        this.f51429y.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 7) {
                    if (this.f51428x.containsKey(crc_link_type_val)) {
                        this.f51428x.remove(crc_link_type_val);
                    }
                    if (this.f51429y.containsKey(crc_link_type_val)) {
                        this.f51429y.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 10) {
                    if (!this.f51428x.containsKey(crc_link_type_val)) {
                        this.f51428x.put(crc_link_type_val, downloadTask);
                    }
                    if (this.f51429y.containsKey(crc_link_type_val)) {
                        return;
                    }
                    this.f51429y.put(crc_link_type_val, downloadTask);
                    return;
                } else if (i4 != 11) {
                    return;
                }
            } else if (this.f51428x.containsKey(crc_link_type_val)) {
                this.f51428x.remove(crc_link_type_val);
            }
            if (this.f51429y.containsKey(crc_link_type_val)) {
                this.f51429y.remove(crc_link_type_val);
            }
        } else if (this.f51429y.containsKey(crc_link_type_val)) {
            this.f51429y.remove(crc_link_type_val);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
        if (r7.f51420p != (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
        if (r7.f51420p == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d1, code lost:
        r7.f51420p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
        E0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0(int r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.ForumPostsFragment.e0(int):void");
    }

    public void g0() {
        this.f51425u = com.join.mgps.rpc.impl.d.P1();
        try {
            com.join.mgps.Util.d0.a().d(this);
            this.f51426v = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    boolean i0() {
        if (j0(this.f51408d)) {
            return true;
        }
        if (isAdded() && this.f51408d != null) {
            T(getString(R.string.net_connect_failed));
        }
        a0(9);
        E0();
        return false;
    }

    boolean j0(Context context) {
        NetworkInfo[] allNetworkInfo;
        if (context == null) {
            try {
                context = getActivity();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (context == null) {
            return false;
        }
        if (this.f51422r == null) {
            this.f51422r = (ConnectivityManager) context.getSystemService("connectivity");
        }
        ConnectivityManager connectivityManager = this.f51422r;
        if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        ForumBaseAdapter forumBaseAdapter = this.f51413i;
        if (forumBaseAdapter != null && forumBaseAdapter.x() != null) {
            this.f51413i.x().clear();
        }
        y0();
        A0();
        this.f51413i.notifyDataSetChanged();
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    void m0(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return;
        }
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            List<ForumBean.ForumPostsBean> list = this.f51411g;
            if (list == null || i5 >= list.size()) {
                break;
            }
            ForumBean.ForumPostsBean forumPostsBean = this.f51411g.get(i5);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadTask);
                z4 |= true;
            }
            i5++;
        }
        if (z4) {
            l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void n0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumBaseAdapter forumBaseAdapter = this.f51413i;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this.f51408d)) {
                com.join.mgps.Util.j0.L0(this.f51408d);
                l2.a(this.f51408d).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this.f51408d, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f51418n.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                w0(i4);
                B0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.android.app.component.video.c cVar = this.f51415k;
        if (cVar != null) {
            cVar.G();
        }
        com.join.mgps.Util.d0.a().e(this);
        this.f51426v = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        changeDownloadTaskNumber(a5, nVar.c());
        StringBuilder sb = new StringBuilder();
        sb.append("zip DownloadStatus =");
        sb.append(nVar.c());
        switch (nVar.c()) {
            case 2:
                G0(a5, 1);
                return;
            case 3:
                G0(a5, 2);
                return;
            case 4:
            case 9:
            default:
                return;
            case 5:
            case 11:
                G0(a5, 5);
                return;
            case 6:
                G0(a5, 6);
                return;
            case 7:
                G0(a5, 3);
                return;
            case 8:
                G0(a5, 4);
                return;
            case 10:
                G0(a5, 7);
                return;
            case 12:
                G0(a5, 8);
                return;
            case 13:
                G0(a5, 9);
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        com.join.android.app.component.video.c cVar = this.f51415k;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ForumLoadingView forumLoadingView = this.f51416l;
        if (forumLoadingView != null) {
            a0(forumLoadingView.getLoadingState());
        }
        com.join.android.app.component.video.c cVar = this.f51415k;
        if (cVar != null) {
            cVar.I();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (getActivity() != null) {
            this.f51415k.f(absListView, i4, i5, i6);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 0 && Fresco.getImagePipeline().H()) {
            Fresco.getImagePipeline().N();
        }
        if (getActivity() != null) {
            this.f51415k.j(absListView, i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.join.mgps.Util.w0.e("ForumPostsFragment" + this.f51406b, "onViewCreated");
        this.f51421q = true;
    }

    void p0(ForumBean.GameInfo gameInfo) {
        if (gameInfo != null) {
            try {
                DownloadTask F = p1.f.K().F(gameInfo.getGame_id());
                gameInfo.setDownloadTask(F);
                Map<String, DownloadTask> map = this.f51427w;
                if (map == null || F == null || map.containsKey(F.getCrc_link_type_val())) {
                    return;
                }
                this.f51430z.add(F);
                this.f51427w.put(F.getCrc_link_type_val(), F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // ru.noties.scrollable.b
    public boolean q(int i4) {
        XListView2 xListView2 = this.f51417m;
        return xListView2 != null && xListView2.canScrollVertically(i4);
    }

    @Override // com.join.mgps.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        com.join.mgps.Util.w0.e("ForumPostsFragment" + this.f51406b, "setUserVisibleHint--isVisibleToUser=" + z4 + " isInit=" + this.f51421q);
        if (z4 && this.f51419o < 1 && this.f51420p == 0) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f51408d).b(str);
    }

    public void v0() {
        XListView2 xListView2 = this.f51417m;
        if (xListView2 != null) {
            xListView2.setPullLoadEnable(new f());
        }
        com.join.mgps.customview.g gVar = this.f51412h;
        if (gVar != null) {
            gVar.onRefresh();
        }
    }

    void w0(int i4) {
        ForumBean.ForumPostsBean next;
        List<ForumBean.ForumPostsBean> list = this.f51411g;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<ForumBean.ForumPostsBean> it2 = this.f51411g.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            if (next.getPid() == i4) {
                next.setPraise(next.is_praise() ? next.getPraise() - 1 : next.getPraise() + 1);
                next.setIs_praise(!next.is_praise());
                l0();
                return;
            }
        }
    }
}
