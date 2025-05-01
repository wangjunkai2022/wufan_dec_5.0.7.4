package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.ForumActivity;
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
public class ForumGroupPostsFragment extends FragmentPagerFragment implements AbsListView.OnScrollListener {
    private static final String D = "key_groups_data";
    private static final String E = "key_groups_id";
    private static final String F = "key_groups_name";
    private static final String G = "key_fragment_pos";

    /* renamed from: b  reason: collision with root package name */
    private int f51272b;

    /* renamed from: c  reason: collision with root package name */
    private RecommenGroupClassify f51273c;

    /* renamed from: d  reason: collision with root package name */
    private Context f51274d;

    /* renamed from: e  reason: collision with root package name */
    private int f51275e;

    /* renamed from: f  reason: collision with root package name */
    private List<RecommendLabelTag> f51276f;

    /* renamed from: g  reason: collision with root package name */
    private List<ForumBean.ForumPostsBean> f51277g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.mgps.customview.g f51278h;

    /* renamed from: i  reason: collision with root package name */
    private ForumBaseAdapter f51279i;

    /* renamed from: j  reason: collision with root package name */
    private int f51280j;

    /* renamed from: k  reason: collision with root package name */
    private String f51281k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ForumLoadingView f51282l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    XListView2 f51283m;

    /* renamed from: o  reason: collision with root package name */
    com.join.android.app.component.video.c f51285o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.i f51286p;

    /* renamed from: q  reason: collision with root package name */
    public int f51287q;

    /* renamed from: r  reason: collision with root package name */
    public int f51288r;

    /* renamed from: s  reason: collision with root package name */
    MyFlowLayout f51289s;

    /* renamed from: u  reason: collision with root package name */
    private com.join.mgps.rpc.e f51291u;

    /* renamed from: n  reason: collision with root package name */
    String f51284n = "ForumGroupPostsFragment";

    /* renamed from: t  reason: collision with root package name */
    List<Integer> f51290t = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    private Map<String, DownloadTask> f51292v = new ConcurrentHashMap();

    /* renamed from: w  reason: collision with root package name */
    Map<String, DownloadTask> f51293w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    Map<String, DownloadTask> f51294x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    private List<DownloadTask> f51295y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    int f51296z = 0;
    boolean A = false;
    boolean B = true;
    com.join.mgps.customview.o C = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ForumLoadingView.e {
        a(ForumLoadingView forumLoadingView) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends ForumLoadingView.e {
        b(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumGroupPostsFragment.this.j0()) {
                ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
                forumGroupPostsFragment.f0(forumGroupPostsFragment.f51287q + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements com.join.mgps.customview.g {
        d() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (ForumGroupPostsFragment.this.j0()) {
                if ((ForumGroupPostsFragment.this.getActivity() instanceof ForumActivity) && ((ForumActivity) ForumGroupPostsFragment.this.getActivity()).w0()) {
                    ForumGroupPostsFragment.this.F0();
                }
                ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
                forumGroupPostsFragment.f51288r = 0;
                forumGroupPostsFragment.f51287q = 0;
                forumGroupPostsFragment.f0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements com.join.mgps.listener.f {
        e() {
        }

        @Override // com.join.mgps.listener.f
        public void a(int i4) {
            ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
            forumGroupPostsFragment.f51283m.smoothScrollToPositionFromTop(i4, forumGroupPostsFragment.f51274d.getResources().getDimensionPixelOffset(R.dimen.wdp100));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends ForumBaseAdapter.b1 {
        f() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void a(int i4) {
            ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
            if (!forumGroupPostsFragment.isLogined(forumGroupPostsFragment.f51274d)) {
                ForumGroupPostsFragment forumGroupPostsFragment2 = ForumGroupPostsFragment.this;
                forumGroupPostsFragment2.showMessage(forumGroupPostsFragment2.f51274d.getString(R.string.forum_user_not_login));
            } else if (!ForumGroupPostsFragment.this.H0()) {
                ForumGroupPostsFragment.this.C0();
            } else {
                ForumGroupPostsFragment.this.x0(i4);
                ForumGroupPostsFragment.this.p0(i4);
            }
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void d(int i4) {
            super.d(i4);
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(ForumGroupPostsFragment.this.f51274d, forumPostsBean);
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void e(String str) {
            ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
            forumGroupPostsFragment.A = true;
            forumGroupPostsFragment.d0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements XListView2.e {

        /* renamed from: a  reason: collision with root package name */
        private int f51303a;

        g() {
        }

        @Override // com.join.mgps.customview.XListView2.e
        public void a(int i4, int i5, boolean z4, boolean z5) {
            if (this.f51303a != i5) {
                boolean z6 = ForumGroupPostsFragment.this.getActivity() instanceof ForumActivity;
                this.f51303a = i5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XListView2 xListView2 = ForumGroupPostsFragment.this.f51283m;
            if (xListView2 == null) {
                return;
            }
            xListView2.v();
            ForumGroupPostsFragment.this.f51283m.u();
            if ((ForumGroupPostsFragment.this.getActivity() instanceof ForumActivity) && ((ForumActivity) ForumGroupPostsFragment.this.getActivity()).r0() == ForumGroupPostsFragment.this.f51272b) {
                ((ForumActivity) ForumGroupPostsFragment.this.getActivity()).I0();
            }
            ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
            if (forumGroupPostsFragment.f51288r == -1) {
                forumGroupPostsFragment.f51283m.setNoMore();
                ForumGroupPostsFragment.this.b0(10);
                return;
            }
            forumGroupPostsFragment.b0(2);
        }
    }

    /* loaded from: classes3.dex */
    class i implements com.join.mgps.customview.f {
        i() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumGroupPostsFragment.this.j0()) {
                ForumGroupPostsFragment forumGroupPostsFragment = ForumGroupPostsFragment.this;
                forumGroupPostsFragment.f0(forumGroupPostsFragment.f51287q + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendLabelTag f51307b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TextView f51308c;

        j(RecommendLabelTag recommendLabelTag, TextView textView) {
            this.f51307b = recommendLabelTag;
            this.f51308c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean isSelected = view.isSelected();
            view.setSelected(!isSelected);
            if (isSelected) {
                if (ForumGroupPostsFragment.this.f51290t.contains(Integer.valueOf(this.f51307b.getTag_id()))) {
                    ForumGroupPostsFragment.this.f51290t.remove(Integer.valueOf(this.f51307b.getTag_id()));
                }
            } else {
                ForumGroupPostsFragment.this.f51290t.add(Integer.valueOf(this.f51307b.getTag_id()));
            }
            this.f51308c.getPaint().setFakeBoldText(!isSelected);
            this.f51308c.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k extends ForumLoadingView.e {
        k(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            ForumGroupPostsFragment.this.b0(1);
            ForumGroupPostsFragment.this.R();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0(com.join.mgps.dto.ForumBean.ForumPostsBean r22) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.ForumGroupPostsFragment.A0(com.join.mgps.dto.ForumBean$ForumPostsBean):void");
    }

    private void B0() {
        for (int i4 = 0; i4 < this.f51277g.size(); i4++) {
            A0(this.f51277g.get(i4));
        }
    }

    private com.wufan.user.service.protobuf.n0 Z(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void c0() {
        com.join.mgps.customview.o oVar = this.C;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.C.dismiss();
    }

    private void e0() {
        String string = getArguments().getString(D);
        int i4 = getArguments().getInt(G);
        int i5 = getArguments().getInt(E);
        String string2 = getArguments().getString(F);
        if (g2.i(string)) {
            this.f51273c = (RecommenGroupClassify) JsonMapper.getInstance().fromJson(string, RecommenGroupClassify.class);
        }
        this.f51272b = i4;
        this.f51280j = i5;
        this.f51281k = string2;
    }

    public static Fragment g0(int i4, String str, RecommenGroupClassify recommenGroupClassify, int i5) {
        ForumGroupPostsFragment_ forumGroupPostsFragment_ = new ForumGroupPostsFragment_();
        Bundle bundle = new Bundle();
        bundle.putCharSequence(D, JsonMapper.toJsonString(recommenGroupClassify));
        bundle.putInt(G, i5);
        bundle.putInt(E, i4);
        bundle.putString(F, str);
        forumGroupPostsFragment_.setArguments(bundle);
        return forumGroupPostsFragment_;
    }

    private void i0() {
        XListView2 xListView2 = this.f51283m;
        if (xListView2 == null) {
            return;
        }
        xListView2.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f51283m.setPullLoadEnable(new c());
        d dVar = new d();
        this.f51278h = dVar;
        this.f51283m.setPullRefreshEnable(dVar);
        Context context = this.f51274d;
        this.f51285o = new com.join.android.app.component.video.c(context, this.f51284n + this.f51272b);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(this.f51274d, this.f51285o);
        this.f51279i = forumBaseAdapter;
        forumBaseAdapter.f1(new e());
        ForumBaseAdapter forumBaseAdapter2 = this.f51279i;
        forumBaseAdapter2.C0(this.f51284n + this.f51272b);
        this.f51279i.I0(new f());
        this.f51283m.setOnScrollListener(this);
        this.f51283m.setOnOverScrolled(new g());
        this.f51283m.setAdapter((ListAdapter) this.f51279i);
        b0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 Z = Z(context);
        return Z != null && g2.i(Z.getToken());
    }

    private View l0(RecommendLabelTag recommendLabelTag) {
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
        textView.setOnClickListener(new j(recommendLabelTag, textView));
        return inflate;
    }

    private void r0(DownloadTask downloadTask) {
        try {
            Iterator<DownloadTask> it2 = this.f51295y.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                    this.f51292v.remove(next.getCrc_link_type_val());
                    it2.remove();
                    break;
                }
            }
            n0(downloadTask, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void s0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51292v;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            n0(downloadTask, 3);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void t0(DownloadTask downloadTask) {
        UtilsMy.B4(this.f51295y, downloadTask);
        if (!this.f51292v.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51295y.add(downloadTask);
            this.f51292v.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        n0(downloadTask, 0);
    }

    private void u0(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f51292v;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f51295y.add(downloadTask);
            this.f51292v.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.f51292v.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        downloadTask2.setGameZipPath(downloadTask.getGameZipPath());
        n0(downloadTask, 1);
    }

    private void v0() {
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.f51295y;
            if (list == null || i4 >= list.size()) {
                return;
            }
            n0(p1.f.K().F(this.f51295y.get(i4).getCrc_link_type_val()), 4);
            i4++;
        }
    }

    private void y0() {
        List<RecommendLabelTag> list = this.f51276f;
        if (list != null && list.size() >= 1) {
            if (this.f51289s == null) {
                MyFlowLayout myFlowLayout = new MyFlowLayout(this.f51274d);
                this.f51289s = myFlowLayout;
                this.f51283m.addHeaderView(myFlowLayout);
            }
            this.f51289s.removeAllViews();
            for (RecommendLabelTag recommendLabelTag : this.f51276f) {
                View l02 = l0(recommendLabelTag);
                if (l02 != null) {
                    this.f51289s.addView(l02);
                }
            }
        } else if (this.f51283m.getHeaderViewsCount() > 0) {
            this.f51283m.removeHeaderView(this.f51289s);
        }
    }

    private void z0() {
        List<RecommendLabelTag> list = this.f51276f;
        if (list == null || list.size() < 1) {
            return;
        }
        this.f51279i.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.TAG_FLOW_LAYOUT, new ForumBaseAdapter.r1.f0(this.f51280j, this.f51281k, this.f51276f)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        com.join.mgps.Util.b0.f0(this.f51274d).m(this.f51274d);
    }

    void D0(int i4, ForumData.HomepageRecommendLabel homepageRecommendLabel) {
        List<RecommendLabelTag> recommend_tags = homepageRecommendLabel.getRecommend_tags();
        List<ForumBean.ForumPostsBean> post_list = homepageRecommendLabel.getPost_list();
        if (this.f51276f == null) {
            this.f51276f = new ArrayList();
        }
        if (this.f51277g == null) {
            this.f51277g = new ArrayList();
        }
        if (i4 == 1) {
            this.f51276f.clear();
            this.f51277g.clear();
            if (recommend_tags != null && recommend_tags.size() > 0) {
                RecommendLabelTag recommendLabelTag = new RecommendLabelTag();
                recommendLabelTag.setTag_id(-1);
                recommendLabelTag.setTag_name(this.f51274d.getResources().getString(R.string.mg_f_all_tag));
                this.f51276f.add(recommendLabelTag);
                this.f51276f.addAll(recommend_tags);
            }
        }
        this.f51277g.addAll(post_list);
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(DetailResultBean detailResultBean) {
        DownloadTask downloadtaskDown;
        if (detailResultBean == null || (downloadtaskDown = detailResultBean.getDownloadtaskDown()) == null) {
            return;
        }
        boolean z4 = false;
        for (int i4 = 0; i4 < this.f51277g.size(); i4++) {
            ForumBean.ForumPostsBean forumPostsBean = this.f51277g.get(i4);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadtaskDown.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadtaskDown);
                z4 |= true;
            }
        }
        if (z4) {
            m0();
        }
        if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
            UtilsMy.d4(this.f51274d, downloadtaskDown.getCrc_link_type_val());
            return;
        }
        UtilsMy.z1(downloadtaskDown, detailResultBean);
        if (UtilsMy.o1(this.f51274d, downloadtaskDown)) {
            return;
        }
        if (detailResultBean.getDown_status() == 5) {
            UtilsMy.l1(this.f51274d, downloadtaskDown);
        } else {
            UtilsMy.R0(this.f51274d, downloadtaskDown, downloadtaskDown.getTp_down_url(), downloadtaskDown.getOther_down_switch(), downloadtaskDown.getCdn_down_switch());
        }
    }

    @Override // ru.noties.scrollable.j
    public void F(int i4, long j4) {
        XListView2 xListView2 = this.f51283m;
        if (xListView2 != null) {
            xListView2.smoothScrollBy(i4, (int) j4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F0() {
        this.mHandler.postDelayed(new h(), 1500L);
    }

    void G0(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            if (i4 != 4) {
                return;
            }
            v0();
            return;
        }
        switch (i4) {
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
                t0(downloadTask);
                return;
            case 3:
                r0(downloadTask);
                return;
            case 4:
                v0();
                return;
            case 5:
                u0(downloadTask);
                return;
            case 6:
                s0(downloadTask);
                return;
            default:
                return;
        }
    }

    boolean H0() {
        if (Z(this.f51274d) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this.f51274d).isTourist();
    }

    void R() {
        f0(1);
    }

    public void a0() {
        try {
            com.join.android.app.component.video.c cVar = this.f51285o;
            if (cVar != null) {
                cVar.M(1);
                this.f51285o.n(this.f51283m);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51286p = com.join.mgps.rpc.impl.g.A0();
        this.f51274d = getActivity();
        e0();
        h0();
        i0();
        this.f51288r = 0;
        this.f51287q = 0;
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b0(int i4) {
        ForumLoadingView forumLoadingView = this.f51282l;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            if (forumLoadingView != null) {
                forumLoadingView.m();
                this.f51282l.j(1);
            }
        } else if (i4 == 2) {
            if (forumLoadingView != null) {
                forumLoadingView.m();
                this.f51282l.j(2);
            }
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败~");
            ForumLoadingView forumLoadingView2 = this.f51282l;
            forumLoadingView2.setListener(new b(forumLoadingView2));
            this.f51282l.j(16);
        } else if (i4 == 9) {
            forumLoadingView.j(9);
            ForumLoadingView forumLoadingView3 = this.f51282l;
            forumLoadingView3.setListener(new k(forumLoadingView3));
            this.f51282l.j(9);
        } else if (i4 != 10) {
        } else {
            RecommenGroupClassify recommenGroupClassify = this.f51273c;
            String gname = recommenGroupClassify != null ? recommenGroupClassify.getGname() : "";
            if (g2.h(gname)) {
                gname = "帖子";
            }
            ForumLoadingView forumLoadingView4 = this.f51282l;
            forumLoadingView4.setFailedMsg("没有更多" + gname + "帖哦~");
            ForumLoadingView forumLoadingView5 = this.f51282l;
            forumLoadingView5.setListener(new a(forumLoadingView5));
            this.f51282l.setReloadingVisibility(0);
            this.f51282l.j(10);
            this.f51282l.setFailedImgVisibility(8);
            this.f51282l.setReloadingVisibility(0);
            this.f51282l.setFailedReloadingRes(R.drawable.papa_loading_null);
        }
    }

    void changeDownloadTaskNumber(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        if (i4 == 2) {
            if (!this.f51293w.containsKey(crc_link_type_val)) {
                this.f51293w.put(crc_link_type_val, downloadTask);
            }
            if (this.f51294x.containsKey(crc_link_type_val)) {
                return;
            }
            this.f51294x.put(crc_link_type_val, downloadTask);
        } else if (i4 != 3) {
            if (i4 != 5) {
                if (i4 == 6) {
                    if (this.f51294x.containsKey(crc_link_type_val)) {
                        this.f51294x.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 7) {
                    if (this.f51293w.containsKey(crc_link_type_val)) {
                        this.f51293w.remove(crc_link_type_val);
                    }
                    if (this.f51294x.containsKey(crc_link_type_val)) {
                        this.f51294x.remove(crc_link_type_val);
                        return;
                    }
                    return;
                } else if (i4 == 10) {
                    if (!this.f51293w.containsKey(crc_link_type_val)) {
                        this.f51293w.put(crc_link_type_val, downloadTask);
                    }
                    if (this.f51294x.containsKey(crc_link_type_val)) {
                        return;
                    }
                    this.f51294x.put(crc_link_type_val, downloadTask);
                    return;
                } else if (i4 != 11) {
                    return;
                }
            } else if (this.f51293w.containsKey(crc_link_type_val)) {
                this.f51293w.remove(crc_link_type_val);
            }
            if (this.f51294x.containsKey(crc_link_type_val)) {
                this.f51294x.remove(crc_link_type_val);
            }
        } else if (this.f51294x.containsKey(crc_link_type_val)) {
            this.f51294x.remove(crc_link_type_val);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0(String str) {
        Context context = getContext();
        if (com.join.android.app.common.utils.j.j(context)) {
            if (this.f51296z == 1) {
                return;
            }
            try {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
                    ResultMainBean<List<DetailResultBean>> R = this.f51291u.R(RequestBeanUtil.getInstance(context).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                    if (R != null && R.getFlag() != 0) {
                        List<DetailResultBean> data = R.getMessages().getData();
                        if (data.size() != 0) {
                            DetailResultBean detailResultBean = data.get(0);
                            if (this.A) {
                                E0(detailResultBean);
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
                this.f51296z = 0;
                this.A = false;
            }
        }
        T("获取游戏信息失败");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r12.f51288r != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
        if (r12.f51288r == (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
        r12.f51288r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
        F0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(int r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.f51274d
            boolean r0 = com.join.android.app.common.utils.j.j(r0)
            if (r0 == 0) goto Lc6
            r0 = 4
            r1 = 0
            r2 = -1
            int r3 = r12.f51288r     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            if (r3 != r2) goto L17
            if (r3 == r2) goto L13
            r12.f51288r = r1
        L13:
            r12.F0()
            return
        L17:
            if (r3 != r13) goto L21
            if (r3 == r2) goto L1d
            r12.f51288r = r1
        L1d:
            r12.F0()
            return
        L21:
            r12.f51288r = r13     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            android.content.Context r3 = r12.f51274d     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            com.join.mgps.Util.AccountUtil_ r3 = com.join.mgps.Util.AccountUtil_.getInstance_(r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            java.lang.String r10 = r3.getUid()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            android.content.Context r3 = r12.f51274d     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            com.join.mgps.Util.AccountUtil_ r3 = com.join.mgps.Util.AccountUtil_.getInstance_(r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            java.lang.String r11 = r3.getToken()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            com.join.mgps.dto.RecommenGroupClassify r3 = r12.f51273c     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r6 = r3.getGid()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            com.join.mgps.rpc.i r4 = r12.f51286p     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r5 = r12.f51280j     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r8 = com.join.mgps.activity.ForumActivity.E     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r9 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r7 = r13
            com.join.mgps.dto.ForumResponse r3 = r4.M(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            if (r3 == 0) goto L97
            int r4 = r3.getError()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            if (r4 != 0) goto L97
            java.lang.Object r4 = r3.getData()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            if (r4 != 0) goto L65
            r12.b0(r0)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r13 = r12.f51288r
            if (r13 == r2) goto L61
            r12.f51288r = r1
        L61:
            r12.F0()
            return
        L65:
            java.lang.Object r3 = r3.getData()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            com.join.mgps.dto.ForumData$HomepageRecommendLabel r3 = (com.join.mgps.dto.ForumData.HomepageRecommendLabel) r3     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            java.util.List r4 = r3.getPost_list()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            if (r4 == 0) goto L86
            java.util.List r4 = r3.getPost_list()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            if (r4 != 0) goto L7c
            goto L86
        L7c:
            r12.D0(r13, r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r12.f51287q = r13     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r3 = 2
            r12.b0(r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            goto L97
        L86:
            r12.f51288r = r2     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            r3 = 10
            r12.b0(r3)     // Catch: java.lang.Throwable -> L9c java.lang.Exception -> L9e
            int r13 = r12.f51288r
            if (r13 == r2) goto L93
            r12.f51288r = r1
        L93:
            r12.F0()
            return
        L97:
            int r13 = r12.f51288r
            if (r13 == r2) goto Lb8
            goto Lb6
        L9c:
            r13 = move-exception
            goto Lbc
        L9e:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L9c
            r12.F0()     // Catch: java.lang.Throwable -> L9c
            r3 = 1
            if (r13 != r3) goto Laf
            com.join.mgps.customview.ForumLoadingView r13 = r12.f51282l     // Catch: java.lang.Throwable -> L9c
            if (r13 == 0) goto Laf
            r13.m()     // Catch: java.lang.Throwable -> L9c
        Laf:
            r12.b0(r0)     // Catch: java.lang.Throwable -> L9c
            int r13 = r12.f51288r
            if (r13 == r2) goto Lb8
        Lb6:
            r12.f51288r = r1
        Lb8:
            r12.F0()
            goto Ld5
        Lbc:
            int r0 = r12.f51288r
            if (r0 == r2) goto Lc2
            r12.f51288r = r1
        Lc2:
            r12.F0()
            throw r13
        Lc6:
            r13 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r13 = r12.getString(r13)
            r12.T(r13)
            r13 = 9
            r12.b0(r13)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.ForumGroupPostsFragment.f0(int):void");
    }

    public void h0() {
        this.f51291u = com.join.mgps.rpc.impl.d.P1();
        com.join.mgps.Util.d0.a().d(this);
    }

    boolean j0() {
        if (com.join.android.app.common.utils.j.j(this.f51274d)) {
            return true;
        }
        T(getString(R.string.net_connect_failed));
        b0(9);
        F0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void k0() {
        this.f51285o.M(1);
        this.f51285o.n(this.f51283m);
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        ForumBaseAdapter forumBaseAdapter = this.f51279i;
        if (forumBaseAdapter != null && forumBaseAdapter.x() != null) {
            this.f51279i.x().clear();
        }
        z0();
        B0();
        this.f51279i.notifyDataSetChanged();
        k0();
    }

    void n0(DownloadTask downloadTask, int i4) {
        boolean z4 = false;
        for (int i5 = 0; i5 < this.f51277g.size(); i5++) {
            ForumBean.ForumPostsBean forumPostsBean = this.f51277g.get(i5);
            if (forumPostsBean != null && forumPostsBean.getRelation_game() != null && !TextUtils.isEmpty(forumPostsBean.getRelation_game().getGame_id()) && forumPostsBean.getRelation_game().getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                forumPostsBean.getRelation_game().setDownloadTask(downloadTask);
                z4 |= true;
            }
        }
        if (z4) {
            m0();
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
        ForumBaseAdapter forumBaseAdapter = this.f51279i;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    public boolean onBackPressedMy() {
        Context context = this.f51274d;
        return com.join.android.app.component.video.a.c0(context, this.f51284n + this.f51272b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.android.app.component.video.c cVar = this.f51285o;
        if (cVar != null) {
            cVar.G();
        }
        com.join.mgps.Util.d0.a().e(this);
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
        super.onPause();
        this.B = false;
        com.join.android.app.component.video.c cVar = this.f51285o;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity instanceof ForumActivity) {
            if (((ForumActivity) activity).r0() == this.f51272b) {
                this.B = true;
                if (this.f51283m != null) {
                    k0();
                }
            } else {
                this.B = false;
            }
        }
        b0(this.f51282l.getLoadingState());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (getActivity() == null || !this.B) {
            return;
        }
        this.f51285o.f(absListView, i4, i5, i6);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
        if (this.B) {
            if (i4 == 0 && Fresco.getImagePipeline().H()) {
                Fresco.getImagePipeline().N();
            }
            if (getActivity() != null) {
                this.f51285o.j(absListView, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(int i4) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this.f51274d)) {
                com.join.mgps.Util.j0.L0(this.f51274d);
                l2.a(this.f51274d).b("尚未登录，请先登录！");
                return;
            }
            ForumRequestBean.ForumPostsPraiseRequestBean e02 = com.join.mgps.Util.j0.e0(this.f51274d, i4);
            e02.setDevice_id("");
            ForumResponse<ForumData.ForumPostsPraiseData> o4 = this.f51286p.o(e02.getParams());
            if (o4 == null) {
                return;
            }
            if (o4.getError() == 706) {
                x0(i4);
                C0();
                return;
            }
            ForumData.ForumPostsPraiseData data = o4.getData();
            data.isResult();
            com.join.mgps.Util.j0.m1(e02, data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // ru.noties.scrollable.b
    public boolean q(int i4) {
        XListView2 xListView2 = this.f51283m;
        return xListView2 != null && xListView2.canScrollVertically(i4);
    }

    void q0(ForumBean.GameInfo gameInfo) {
        if (gameInfo != null) {
            try {
                DownloadTask F2 = p1.f.K().F(gameInfo.getGame_id());
                gameInfo.setDownloadTask(F2);
                Map<String, DownloadTask> map = this.f51292v;
                if (map == null || F2 == null || map.containsKey(F2.getCrc_link_type_val())) {
                    return;
                }
                this.f51295y.add(F2);
                this.f51292v.put(F2.getCrc_link_type_val(), F2);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f51274d).b(str);
    }

    public void w0() {
        XListView2 xListView2 = this.f51283m;
        if (xListView2 != null) {
            xListView2.setPullLoadEnable(new i());
        }
        com.join.mgps.customview.g gVar = this.f51278h;
        if (gVar != null) {
            gVar.onRefresh();
        }
    }

    void x0(int i4) {
        ForumBean.ForumPostsBean next;
        List<ForumBean.ForumPostsBean> list = this.f51277g;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<ForumBean.ForumPostsBean> it2 = this.f51277g.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            if (next.getPid() == i4) {
                next.setPraise(next.is_praise() ? next.getPraise() - 1 : next.getPraise() + 1);
                next.setIs_praise(!next.is_praise());
                m0();
                return;
            }
        }
    }
}
