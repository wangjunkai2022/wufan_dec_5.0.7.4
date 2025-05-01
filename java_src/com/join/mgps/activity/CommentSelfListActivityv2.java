package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseAppCompatActivity;
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
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_comment_self_list_v2)
/* loaded from: classes4.dex */
public class CommentSelfListActivityv2 extends BaseAppCompatActivity implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f29608b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f29609c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f29610d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29611e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f29612f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ForumLoadingView f29613g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    PtrClassicFrameLayout f29614h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.f f29615i;
    @Pref

    /* renamed from: j  reason: collision with root package name */
    PrefDef_ f29616j;

    /* renamed from: k  reason: collision with root package name */
    public int f29617k;

    /* renamed from: l  reason: collision with root package name */
    public int f29618l;

    /* renamed from: m  reason: collision with root package name */
    private com.join.mgps.customview.g f29619m;

    /* renamed from: n  reason: collision with root package name */
    private CommentSelfListAdapter f29620n;

    /* renamed from: o  reason: collision with root package name */
    private List<CommentSelfListBean> f29621o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    Handler f29622p = new Handler();

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.customview.o f29623q = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (CommentSelfListActivityv2.this.m0()) {
                CommentSelfListActivityv2 commentSelfListActivityv2 = CommentSelfListActivityv2.this;
                commentSelfListActivityv2.k0(commentSelfListActivityv2.f29617k + 1);
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
            if (CommentSelfListActivityv2.this.m0()) {
                CommentSelfListActivityv2.this.w0();
                CommentSelfListActivityv2 commentSelfListActivityv2 = CommentSelfListActivityv2.this;
                commentSelfListActivityv2.f29618l = 0;
                commentSelfListActivityv2.f29617k = 0;
                commentSelfListActivityv2.k0(1);
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
            CommentSelfListActivityv2 commentSelfListActivityv2 = CommentSelfListActivityv2.this;
            if (!commentSelfListActivityv2.isLogined(commentSelfListActivityv2)) {
                CommentSelfListActivityv2.this.showMessage(commentSelfListActivityv2.getString(R.string.forum_user_not_login));
            } else if (!CommentSelfListActivityv2.this.x0()) {
                CommentSelfListActivityv2.this.u0();
            } else {
                CommentSelfListActivityv2.this.q0(i4, str, i5);
                CommentSelfListActivityv2.this.i0(i4, str, i5);
            }
        }

        @Override // com.join.mgps.adapter.CommentSelfListAdapter.j
        public void b(int i4, String str, int i5) {
            CommentSelfListActivityv2 commentSelfListActivityv2 = CommentSelfListActivityv2.this;
            if (!commentSelfListActivityv2.isLogined(commentSelfListActivityv2)) {
                CommentSelfListActivityv2.this.showMessage(commentSelfListActivityv2.getString(R.string.forum_user_not_login));
            } else if (!CommentSelfListActivityv2.this.x0()) {
                CommentSelfListActivityv2.this.u0();
            } else {
                CommentSelfListActivityv2.this.r0(i4, str, i5);
                CommentSelfListActivityv2.this.p0(i4, str, i5);
            }
        }

        @Override // com.join.mgps.adapter.CommentSelfListAdapter.j
        public void c(int i4, String str, String str2) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            CommentSelfListActivityv2 commentSelfListActivityv2 = CommentSelfListActivityv2.this;
            intentUtil.goCommentDetailActivity(commentSelfListActivityv2, i4 + "", str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XListView2 xListView2 = CommentSelfListActivityv2.this.f29612f;
            if (xListView2 == null) {
                return;
            }
            xListView2.v();
            CommentSelfListActivityv2.this.f29612f.u();
            CommentSelfListActivityv2 commentSelfListActivityv2 = CommentSelfListActivityv2.this;
            if (commentSelfListActivityv2.f29618l == -1) {
                commentSelfListActivityv2.f29612f.setNoMore();
            }
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
            CommentSelfListActivityv2.this.h0(1);
            CommentSelfListActivityv2.this.n0();
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
            CommentSelfListActivityv2.this.h0(1);
            CommentSelfListActivityv2.this.n0();
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
            CommentSelfListActivityv2.this.h0(1);
            CommentSelfListActivityv2.this.n0();
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

    private void j0() {
        com.join.mgps.customview.o oVar = this.f29623q;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f29623q.dismiss();
    }

    private void l0() {
        this.f29610d.setVisibility(0);
        this.f29610d.setText("我的点评");
        this.f29614h.j(true);
        XListView2 xListView2 = this.f29612f;
        if (xListView2 == null) {
            return;
        }
        xListView2.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f29612f.setPullLoadEnable(new a());
        b bVar = new b();
        this.f29619m = bVar;
        this.f29612f.setPullRefreshEnable(bVar);
        CommentSelfListAdapter commentSelfListAdapter = new CommentSelfListAdapter(this);
        this.f29620n = commentSelfListAdapter;
        commentSelfListAdapter.o(new c());
        this.f29612f.setOnScrollListener(this);
        this.f29612f.setAdapter((ListAdapter) this.f29620n);
        h0(1);
    }

    private void s0(CommentSelfListBean commentSelfListBean, boolean z4) {
        if (commentSelfListBean == null || commentSelfListBean.getGame_info() == null || commentSelfListBean.getSelf_comment() == null) {
            return;
        }
        int id = commentSelfListBean.getSelf_comment().getId();
        String game_id = commentSelfListBean.getGame_info().getGame_id();
        this.f29620n.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.COMMENT_LIST_ITEM_HEADER, new CommentSelfListAdapter.k.c(z4, id, game_id, commentSelfListBean.getGame_info().getGame_ico(), commentSelfListBean.getGame_info().getGame_name(), commentSelfListBean.getGame_info().getComment_score_switch(), commentSelfListBean.getSelf_comment().getAdd_times(), commentSelfListBean.getSelf_comment().getStars_score(), commentSelfListBean.getSelf_comment().getIs_old())));
        this.f29620n.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.COMMENT_LIST_ITEM_CONTENT, new CommentSelfListAdapter.k.a(id, game_id, commentSelfListBean.getSelf_comment().getContent(), commentSelfListBean.getSelf_comment().getIs_old(), commentSelfListBean.getGame_info().getComment_score_switch())));
        this.f29620n.c(new CommentSelfListAdapter.k(CommentSelfListAdapter.ViewType.COMMENT_LIST_ITEM_FOOTER, new CommentSelfListAdapter.k.b(id, game_id, commentSelfListBean.getSelf_comment().getPraise_count(), commentSelfListBean.getSelf_comment().getDespise_count(), commentSelfListBean.getSelf_comment().getReply_count(), commentSelfListBean.getSelf_comment().getIs_praise(), commentSelfListBean.getSelf_comment().getIs_despise(), commentSelfListBean.getSelf_comment().getIs_old(), commentSelfListBean.getGame_info().getComment_score_switch())));
    }

    private void t0() {
        int i4 = 0;
        while (i4 < this.f29621o.size()) {
            s0(this.f29621o.get(i4), i4 == 0);
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29615i = com.join.mgps.rpc.impl.e.m();
        try {
            l0();
            n0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
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
    @UiThread
    public void h0(int i4) {
        if (i4 == 1) {
            this.f29613g.m();
            this.f29613g.j(1);
        } else if (i4 == 2) {
            this.f29613g.m();
            this.f29613g.j(2);
        } else if (i4 == 4) {
            this.f29613g.j(4);
            ForumLoadingView forumLoadingView = this.f29613g;
            forumLoadingView.setListener(new e(forumLoadingView));
        } else if (i4 == 16) {
            this.f29613g.setFailedMsg("加载失败~");
            ForumLoadingView forumLoadingView2 = this.f29613g;
            forumLoadingView2.setListener(new h(forumLoadingView2));
            this.f29613g.j(16);
        } else if (i4 == 9) {
            this.f29613g.j(9);
            ForumLoadingView forumLoadingView3 = this.f29613g;
            forumLoadingView3.setListener(new f(forumLoadingView3));
            this.f29613g.j(9);
        } else if (i4 != 10) {
        } else {
            this.f29613g.setFailedMsg("没有更多点评哦~");
            ForumLoadingView forumLoadingView4 = this.f29613g;
            forumLoadingView4.setListener(new g(forumLoadingView4));
            this.f29613g.setReloadingVisibility(0);
            this.f29613g.j(10);
            this.f29613g.setFailedImgVisibility(8);
            this.f29613g.setReloadingVisibility(0);
            this.f29613g.setFailedReloadingRes(R.drawable.papa_loading_null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(int i4, String str, int i5) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            CommentResponse<CommentPraiseBean> f5 = this.f29615i.f(RequestBeanUtil.getInstance(this).getCommentPraiseRequestBean(AccountUtil_.getInstance_(this).getUid(), this.f29616j.commentToken().d(), AccountUtil_.getInstance_(this).getToken(), i4, str, i5));
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
                q0(i4, str, i5);
            } else if (TextUtils.isEmpty(f5.getMsg())) {
                f0(i5 == 1 ? "点踩成功" : "取消点踩成功");
            } else {
                f0(f5.getMsg());
            }
            if (code == 706) {
                u0();
            }
        } catch (Exception e5) {
            f0(i5 != 1 ? "取消点踩失败" : "点踩失败");
            q0(i4, str, i5);
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r10.f29618l != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e6, code lost:
        if (r10.f29618l == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
        r10.f29618l = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ea, code lost:
        w0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k0(int r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CommentSelfListActivityv2.k0(int):void");
    }

    boolean m0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            return true;
        }
        f0(getString(R.string.net_connect_failed));
        h0(9);
        w0();
        return false;
    }

    void n0() {
        k0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        CommentSelfListAdapter commentSelfListAdapter = this.f29620n;
        if (commentSelfListAdapter != null && commentSelfListAdapter.k() != null) {
            this.f29620n.k().clear();
        }
        t0();
        this.f29620n.notifyDataSetChanged();
    }

    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        h0(this.f29613g.getLoadingState());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(int i4, String str, int i5) {
        try {
            if (!com.join.mgps.Util.j0.Y0(this)) {
                com.join.mgps.Util.j0.L0(this);
                com.join.mgps.Util.l2.a(this).b("尚未登录，请先登录！");
                return;
            }
            CommentResponse<CommentPraiseBean> i6 = this.f29615i.i(RequestBeanUtil.getInstance(this).getCommentPraiseRequestBean(AccountUtil_.getInstance_(this).getUid(), this.f29616j.commentToken().d(), AccountUtil_.getInstance_(this).getToken(), i4, str, i5));
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
                r0(i4, str, i5);
            } else if (TextUtils.isEmpty(i6.getMsg())) {
                f0(i5 == 1 ? "点赞成功" : "取消点赞成功");
            } else {
                f0(i6.getMsg());
            }
            if (code == 706) {
                u0();
            }
        } catch (Exception e5) {
            f0(i5 != 1 ? "取消点赞失败" : "点赞失败");
            r0(i4, str, i5);
            e5.printStackTrace();
        }
    }

    void q0(int i4, String str, int i5) {
        CommentSelfListBean next;
        List<CommentSelfListBean> list = this.f29621o;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<CommentSelfListBean> it2 = this.f29621o.iterator();
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
                o0();
                return;
            }
        }
    }

    void r0(int i4, String str, int i5) {
        CommentSelfListBean next;
        List<CommentSelfListBean> list = this.f29621o;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<CommentSelfListBean> it2 = this.f29621o.iterator();
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
                o0();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        com.join.mgps.Util.b0.f0(this).m(this);
    }

    void v0(int i4, List<CommentSelfListBean> list) {
        if (i4 == 1) {
            this.f29621o.clear();
        }
        if (list != null) {
            this.f29621o.addAll(list);
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        this.f29622p.postDelayed(new d(), 100L);
    }

    boolean x0() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }
}
