package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import com.BaseAppCompatActivity;
import com.MApplication;
import com.beizi.fusion.widget.TwistView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.adapter.CommentSelfListAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentPraiseBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentSelfListBean;
import com.join.mgps.dto.FavoritesCenterData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_comment_self_list)
/* loaded from: classes4.dex */
public class CommentSelfListActivity extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f29546b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f29547c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f29548d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f29549e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f29550f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f29551g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    XListView2 f29552h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f29553i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ForumLoadingView f29554j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.b f29555k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.f f29556l;
    @Pref

    /* renamed from: m  reason: collision with root package name */
    PrefDef_ f29557m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    int f29558n;

    /* renamed from: o  reason: collision with root package name */
    public int f29559o;

    /* renamed from: p  reason: collision with root package name */
    public int f29560p;

    /* renamed from: q  reason: collision with root package name */
    private com.join.mgps.customview.g f29561q;

    /* renamed from: r  reason: collision with root package name */
    private CommentSelfListAdapter f29562r;

    /* renamed from: t  reason: collision with root package name */
    Context f29564t;

    /* renamed from: u  reason: collision with root package name */
    FavoritesCenterData f29565u;

    /* renamed from: s  reason: collision with root package name */
    private List<CommentSelfListBean> f29563s = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    Handler f29566v = new Handler();

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.customview.o f29567w = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CommentSelfListActivity.this.n0()) {
                CommentSelfListActivity commentSelfListActivity = CommentSelfListActivity.this;
                commentSelfListActivity.l0(commentSelfListActivity.f29559o + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (CommentSelfListActivity.this.n0()) {
                CommentSelfListActivity.this.A0();
                CommentSelfListActivity commentSelfListActivity = CommentSelfListActivity.this;
                commentSelfListActivity.f29560p = 0;
                commentSelfListActivity.f29559o = 0;
                commentSelfListActivity.l0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements CommentSelfListAdapter.j {
        c() {
        }

        @Override // com.join.mgps.adapter.CommentSelfListAdapter.j
        public void a(int i4, String str, int i5) {
            CommentSelfListActivity commentSelfListActivity = CommentSelfListActivity.this;
            if (!commentSelfListActivity.isLogined(commentSelfListActivity)) {
                CommentSelfListActivity.this.showMessage(commentSelfListActivity.getString(R.string.forum_user_not_login));
            } else if (!CommentSelfListActivity.this.D0()) {
                CommentSelfListActivity.this.y0();
            } else {
                CommentSelfListActivity.this.s0(i4, str, i5);
                CommentSelfListActivity.this.j0(i4, str, i5);
            }
        }

        @Override // com.join.mgps.adapter.CommentSelfListAdapter.j
        public void b(int i4, String str, int i5) {
            CommentSelfListActivity commentSelfListActivity = CommentSelfListActivity.this;
            if (!commentSelfListActivity.isLogined(commentSelfListActivity)) {
                CommentSelfListActivity.this.showMessage(commentSelfListActivity.getString(R.string.forum_user_not_login));
            } else if (!CommentSelfListActivity.this.D0()) {
                CommentSelfListActivity.this.y0();
            } else {
                CommentSelfListActivity.this.t0(i4, str, i5);
                CommentSelfListActivity.this.r0(i4, str, i5);
            }
        }

        @Override // com.join.mgps.adapter.CommentSelfListAdapter.j
        public void c(int i4, String str, String str2) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            CommentSelfListActivity commentSelfListActivity = CommentSelfListActivity.this;
            intentUtil.goCommentDetailActivity(commentSelfListActivity, i4 + "", str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XListView2 xListView2 = CommentSelfListActivity.this.f29552h;
            if (xListView2 == null) {
                return;
            }
            xListView2.v();
            CommentSelfListActivity.this.f29552h.u();
            CommentSelfListActivity commentSelfListActivity = CommentSelfListActivity.this;
            if (commentSelfListActivity.f29560p == -1) {
                commentSelfListActivity.f29552h.setNoMore();
            }
            if (CommentSelfListActivity.this.f29563s.size() != 0) {
                if (CommentSelfListActivity.this.f29563s.size() < 10) {
                    CommentSelfListActivity.this.f29552h.setNoMore();
                    return;
                }
                return;
            }
            CommentSelfListActivity.this.f29552h.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends ForumLoadingView.e {
        e(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            CommentSelfListActivity.this.i0(1);
            CommentSelfListActivity.this.getData();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends ForumLoadingView.e {
        f(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            CommentSelfListActivity.this.i0(1);
            CommentSelfListActivity.this.getData();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends ForumLoadingView.e {
        g(ForumLoadingView forumLoadingView) {
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
    /* loaded from: classes4.dex */
    public class h extends ForumLoadingView.e {
        h(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            CommentSelfListActivity.this.i0(1);
            CommentSelfListActivity.this.getData();
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private void k0() {
        com.join.mgps.customview.o oVar = this.f29567w;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f29567w.dismiss();
    }

    private void m0() {
        XListView2 xListView2 = this.f29552h;
        if (xListView2 == null) {
            return;
        }
        xListView2.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f29552h.setPullLoadEnable(new a());
        b bVar = new b();
        this.f29561q = bVar;
        this.f29552h.setPullRefreshEnable(bVar);
        CommentSelfListAdapter commentSelfListAdapter = new CommentSelfListAdapter(this, this.f29558n);
        this.f29562r = commentSelfListAdapter;
        commentSelfListAdapter.o(new c());
        this.f29552h.setOnScrollListener(this);
        this.f29552h.setAdapter((ListAdapter) this.f29562r);
        i0(1);
    }

    private void u0(CommentSelfListBean commentSelfListBean, boolean z4) {
        if (commentSelfListBean == null || commentSelfListBean.getGame_info() == null || commentSelfListBean.getSelf_comment() == null) {
            return;
        }
        int id = commentSelfListBean.getSelf_comment().getId();
        String game_id = commentSelfListBean.getGame_info().getGame_id();
        this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.COMMENT_LIST_ITEM_HEADER, new CommentSelfListAdapter.k.c(z4, id, game_id, commentSelfListBean.getGame_info().getGame_ico(), commentSelfListBean.getGame_info().getGame_name(), commentSelfListBean.getGame_info().getComment_score_switch(), commentSelfListBean.getSelf_comment().getAdd_times(), commentSelfListBean.getSelf_comment().getStars_score(), commentSelfListBean.getSelf_comment().getIs_old())));
        this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.COMMENT_LIST_ITEM_CONTENT, new CommentSelfListAdapter.k.a(id, game_id, commentSelfListBean.getSelf_comment().getContent(), commentSelfListBean.getSelf_comment().getIs_old(), commentSelfListBean.getGame_info().getComment_score_switch())));
        this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.COMMENT_LIST_ITEM_FOOTER, new CommentSelfListAdapter.k.b(id, game_id, commentSelfListBean.getSelf_comment().getPraise_count(), commentSelfListBean.getSelf_comment().getDespise_count(), commentSelfListBean.getSelf_comment().getReply_count(), commentSelfListBean.getSelf_comment().getIs_praise(), commentSelfListBean.getSelf_comment().getIs_despise(), commentSelfListBean.getSelf_comment().getIs_old(), commentSelfListBean.getGame_info().getComment_score_switch())));
    }

    private void v0() {
        int i4 = 0;
        while (i4 < this.f29563s.size()) {
            u0(this.f29563s.get(i4), i4 == 0);
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        this.f29566v.postDelayed(new d(), 100L);
    }

    @Receiver(actions = {o1.a.f72022r})
    public void B0(Context context) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(FavoritesCenterData favoritesCenterData) {
        this.f29565u = favoritesCenterData;
        o0();
    }

    boolean D0() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setFlags(TTAdConstant.KEY_CLICK_AREA, TTAdConstant.KEY_CLICK_AREA);
            new com.join.android.app.common.manager.b(this).n(R.color.black_30_alpha);
        }
        this.f29564t = this;
        this.f29556l = com.join.mgps.rpc.impl.e.m();
        if (this.f29558n != AccountUtil_.getInstance_(this).getAccountData().getUid() && this.f29558n != 0) {
            this.f29550f.setVisibility(8);
            this.f29551g.setVisibility(8);
        } else {
            this.f29550f.setVisibility(0);
            this.f29551g.setVisibility(0);
        }
        try {
            this.f29555k = com.join.mgps.rpc.impl.a.c0();
            m0();
            getData();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = TwistView.DELAY_TIME_TWIST)
    public void getData() {
        if (com.join.android.app.common.utils.j.j(this.f29564t)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("uid", "" + this.f29558n);
                hashMap.put("device_id", "");
                StringBuilder sb = new StringBuilder();
                sb.append("");
                RequestBeanUtil.getInstance(this);
                sb.append(RequestBeanUtil.getVersionAndVersionName());
                hashMap.put("version ", sb.toString());
                hashMap.put("page", "1");
                hashMap.put("type", "");
                ForumResponse<FavoritesCenterData> Y = this.f29555k.Y(hashMap);
                if (Y == null || Y.getError() != 0) {
                    return;
                }
                C0(Y.getData());
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        i0(9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(int i4) {
        if (i4 == 1) {
            this.f29554j.m();
            this.f29554j.j(1);
        } else if (i4 == 2) {
            this.f29554j.m();
            this.f29554j.j(2);
        } else if (i4 == 4) {
            this.f29554j.j(4);
            ForumLoadingView forumLoadingView = this.f29554j;
            forumLoadingView.setListener(new e(forumLoadingView));
        } else if (i4 == 16) {
            this.f29554j.setFailedMsg("加载失败~");
            ForumLoadingView forumLoadingView2 = this.f29554j;
            forumLoadingView2.setListener(new h(forumLoadingView2));
            this.f29554j.j(16);
        } else if (i4 == 9) {
            this.f29554j.j(9);
            ForumLoadingView forumLoadingView3 = this.f29554j;
            forumLoadingView3.setListener(new f(forumLoadingView3));
            this.f29554j.j(9);
        } else if (i4 != 10) {
        } else {
            this.f29554j.setFailedMsg("没有更多点评哦~");
            ForumLoadingView forumLoadingView4 = this.f29554j;
            forumLoadingView4.setListener(new g(forumLoadingView4));
            this.f29554j.setReloadingVisibility(0);
            this.f29554j.j(10);
            this.f29554j.setFailedImgVisibility(8);
            this.f29554j.setReloadingVisibility(0);
            this.f29554j.setFailedReloadingRes(R.drawable.papa_loading_null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0(int i4, String str, int i5) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            CommentResponse<CommentPraiseBean> f5 = this.f29556l.f(RequestBeanUtil.getInstance(this).getCommentPraiseRequestBean(AccountUtil_.getInstance_(this).getUid(), this.f29557m.commentToken().d(), AccountUtil_.getInstance_(this).getToken(), i4, str, i5));
            if (f5 == null) {
                return;
            }
            int code = f5.getCode();
            if (code != 0) {
                if (TextUtils.isEmpty(f5.getMsg())) {
                    f0(i5 == 1 ? "点踩失败" : "取消点踩失败");
                } else {
                    f0(f5.getMsg());
                }
                s0(i4, str, i5);
            } else if (TextUtils.isEmpty(f5.getMsg())) {
                f0(i5 == 1 ? "点踩成功" : "取消点踩成功");
            } else {
                f0(f5.getMsg());
            }
            if (code == 706) {
                y0();
            }
        } catch (Exception e5) {
            f0(i5 != 1 ? "取消点踩失败" : "点踩失败");
            s0(i4, str, i5);
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
        if (r11.f29560p != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
        if (r11.f29560p == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ec, code lost:
        r11.f29560p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ee, code lost:
        A0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l0(int r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CommentSelfListActivity.l0(int):void");
    }

    boolean n0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            return true;
        }
        f0(getString(R.string.net_connect_failed));
        i0(9);
        A0();
        return false;
    }

    void o0() {
        l0(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MApplication.f1497x.f();
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i0(this.f29554j.getLoadingState());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (i4 == 0) {
            View childAt = this.f29552h.getChildAt(0);
            if (childAt != null && childAt.getTop() == 0) {
                this.f29547c.setVisibility(0);
                this.f29546b.setVisibility(8);
                this.f29553i.setVisibility(8);
            } else if (this.f29546b.getVisibility() == 8) {
                this.f29547c.setVisibility(8);
                this.f29546b.setVisibility(0);
                this.f29553i.setVisibility(0);
            }
        } else if (this.f29546b.getVisibility() == 8) {
            this.f29547c.setVisibility(8);
            this.f29546b.setVisibility(0);
            this.f29553i.setVisibility(0);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72022r})
    public void p0(Intent intent) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        CommentSelfListAdapter.k kVar;
        CommentSelfListAdapter.k kVar2;
        CommentSelfListAdapter commentSelfListAdapter = this.f29562r;
        if (commentSelfListAdapter != null && commentSelfListAdapter.k() != null) {
            this.f29562r.k().clear();
        }
        this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_TITLE, this.f29565u.getMember_info()));
        FavoritesCenterData favoritesCenterData = this.f29565u;
        if (favoritesCenterData != null && favoritesCenterData.getCreate_group_list() != null && this.f29565u.getCreate_group_list().size() > 0) {
            if (this.f29565u.getCreate_group_list().size() < 10) {
                kVar2 = new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_ITEM_TITLE, 1);
            } else {
                kVar2 = new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_ITEM_TITLE, 2);
            }
            this.f29562r.c(kVar2);
            this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_F, this.f29565u.getCreate_group_list()));
        }
        FavoritesCenterData favoritesCenterData2 = this.f29565u;
        if (favoritesCenterData2 != null && favoritesCenterData2.getBook_group_list() != null && this.f29565u.getBook_group_list().size() > 0) {
            if (this.f29565u.getBook_group_list().size() < 10) {
                kVar = new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_ITEM_TITLE, 3);
            } else {
                kVar = new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_ITEM_TITLE, 4);
            }
            this.f29562r.c(kVar);
            this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_F, this.f29565u.getBook_group_list()));
        }
        if (this.f29563s.size() > 0) {
            this.f29562r.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.FAVORITES_ITEM_TITLE, 5));
        } else {
            this.f29552h.g();
        }
        v0();
        this.f29562r.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(int i4, String str, int i5) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            CommentResponse<CommentPraiseBean> i6 = this.f29556l.i(RequestBeanUtil.getInstance(this).getCommentPraiseRequestBean(AccountUtil_.getInstance_(this).getUid(), this.f29557m.commentToken().d(), AccountUtil_.getInstance_(this).getToken(), i4, str, i5));
            if (i6 == null) {
                return;
            }
            int code = i6.getCode();
            if (code != 0) {
                if (TextUtils.isEmpty(i6.getMsg())) {
                    f0(i5 == 1 ? "点赞失败" : "取消点赞失败");
                } else {
                    f0(i6.getMsg());
                }
                t0(i4, str, i5);
            } else if (TextUtils.isEmpty(i6.getMsg())) {
                f0(i5 == 1 ? "点赞成功" : "取消点赞成功");
            } else {
                f0(i6.getMsg());
            }
            if (code == 706) {
                y0();
            }
        } catch (Exception e5) {
            f0(i5 != 1 ? "取消点赞失败" : "点赞失败");
            t0(i4, str, i5);
            e5.printStackTrace();
        }
    }

    void s0(int i4, String str, int i5) {
        CommentSelfListBean next;
        List<CommentSelfListBean> list = this.f29563s;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<CommentSelfListBean> it2 = this.f29563s.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            if (next.getSelf_comment().getId() == i4 && next.getSelf_comment() != null && !TextUtils.isEmpty(next.getSelf_comment().getGame_id()) && next.getSelf_comment().getGame_id().equals(str)) {
                int is_despise = next.getSelf_comment().getIs_despise();
                int despise_count = next.getSelf_comment().getDespise_count();
                int i6 = is_despise == 1 ? despise_count - 1 : despise_count + 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                next.getSelf_comment().setIs_despise(is_despise == 1 ? 0 : 1);
                next.getSelf_comment().setDespise_count(i6);
                int is_praise = next.getSelf_comment().getIs_praise();
                if (is_despise != 1 && is_praise == 1) {
                    int praise_count = next.getSelf_comment().getPraise_count();
                    int i7 = is_praise == 1 ? praise_count - 1 : praise_count + 1;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    next.getSelf_comment().setIs_praise(is_praise == 1 ? 0 : 1);
                    next.getSelf_comment().setPraise_count(i7);
                }
                q0();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void t0(int i4, String str, int i5) {
        CommentSelfListBean next;
        List<CommentSelfListBean> list = this.f29563s;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<CommentSelfListBean> it2 = this.f29563s.iterator();
        while (it2.hasNext() && (next = it2.next()) != null) {
            if (next.getSelf_comment().getId() == i4 && next.getSelf_comment() != null && !TextUtils.isEmpty(next.getSelf_comment().getGame_id()) && next.getSelf_comment().getGame_id().equals(str)) {
                int is_praise = next.getSelf_comment().getIs_praise();
                int praise_count = next.getSelf_comment().getPraise_count();
                int i6 = is_praise == 1 ? praise_count - 1 : praise_count + 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                next.getSelf_comment().setIs_praise(is_praise == 1 ? 0 : 1);
                next.getSelf_comment().setPraise_count(i6);
                int is_despise = next.getSelf_comment().getIs_despise();
                if (is_praise != 1 && is_despise == 1) {
                    int despise_count = next.getSelf_comment().getDespise_count();
                    int i7 = is_despise == 1 ? despise_count - 1 : despise_count + 1;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    next.getSelf_comment().setIs_despise(is_despise == 1 ? 0 : 1);
                    next.getSelf_comment().setDespise_count(i7);
                }
                q0();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        IntentUtil.getInstance().goMYAccountDetialActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        IntentUtil.getInstance().goMYAccountDetialActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    void z0(int i4, List<CommentSelfListBean> list) {
        if (i4 == 1) {
            this.f29563s.clear();
        }
        if (this.f29565u != null) {
            this.f29563s.addAll(list);
        }
        q0();
    }
}
