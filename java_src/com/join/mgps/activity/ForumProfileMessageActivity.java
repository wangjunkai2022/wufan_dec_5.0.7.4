package com.join.mgps.activity;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.adapter.ForumProfileMessageAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.ForumBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.mg_forum_profile_message_activity)
/* loaded from: classes4.dex */
public class ForumProfileMessageActivity extends BaseActivity implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f31069b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f31070c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ForumLoadingView f31071d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    XListView2 f31072e;

    /* renamed from: f  reason: collision with root package name */
    List<ForumBean.ForumProfileMessageBean> f31073f;

    /* renamed from: g  reason: collision with root package name */
    ForumProfileMessageAdapter f31074g;

    /* renamed from: h  reason: collision with root package name */
    List<ForumProfileMessageAdapter.j> f31075h;
    @StringRes(resName = "net_excption")

    /* renamed from: i  reason: collision with root package name */
    String f31076i;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: j  reason: collision with root package name */
    String f31077j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.i f31078k;

    /* renamed from: l  reason: collision with root package name */
    private int f31079l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f31080m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final int f31081n = 0;

    /* renamed from: o  reason: collision with root package name */
    private final int f31082o = 16;

    /* renamed from: p  reason: collision with root package name */
    private final int f31083p = 32;

    /* renamed from: q  reason: collision with root package name */
    private final int f31084q = 17;

    /* renamed from: r  reason: collision with root package name */
    private final int f31085r = 18;

    /* renamed from: s  reason: collision with root package name */
    private final int f31086s = 20;

    /* renamed from: t  reason: collision with root package name */
    private final int f31087t = 24;

    /* renamed from: u  reason: collision with root package name */
    private int f31088u = 0;

    /* renamed from: v  reason: collision with root package name */
    ForumProfileMessageAdapter.d f31089v = new a();

    /* renamed from: w  reason: collision with root package name */
    Handler f31090w = new b();

    /* loaded from: classes4.dex */
    class a implements ForumProfileMessageAdapter.d {
        a() {
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageAdapter.d
        public void a(int i4, int i5, int i6, String str) {
            ForumBean.ForumCommentReplyBean forumCommentReplyBean;
            ForumBean.ForumCommentBean forumCommentBean = new ForumBean.ForumCommentBean();
            forumCommentBean.setPid(i5);
            forumCommentBean.setNickname(str);
            if (i6 != 0) {
                forumCommentReplyBean = new ForumBean.ForumCommentReplyBean();
                forumCommentReplyBean.setRid(i6);
                forumCommentReplyBean.setNickname(str);
            } else {
                forumCommentReplyBean = null;
            }
            ForumProfileMessageActivity forumProfileMessageActivity = ForumProfileMessageActivity.this;
            com.join.mgps.Util.j0.A0(forumProfileMessageActivity, forumProfileMessageActivity.m0(i4), forumCommentBean, forumCommentReplyBean);
        }

        @Override // com.join.mgps.adapter.ForumProfileMessageAdapter.d
        public void d(int i4) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(ForumProfileMessageActivity.this, forumPostsBean);
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ForumProfileMessageActivity.this.f31072e.v();
            ForumProfileMessageActivity.this.f31072e.u();
            if (ForumProfileMessageActivity.this.f31080m == -1) {
                ForumProfileMessageActivity.this.f31072e.setNoMore();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements com.join.mgps.customview.f {
        c() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (!com.join.android.app.common.utils.j.j(ForumProfileMessageActivity.this)) {
                ForumProfileMessageActivity forumProfileMessageActivity = ForumProfileMessageActivity.this;
                forumProfileMessageActivity.showToast(forumProfileMessageActivity.getString(R.string.net_connect_failed));
                ForumProfileMessageActivity.this.w0();
                return;
            }
            ForumProfileMessageActivity forumProfileMessageActivity2 = ForumProfileMessageActivity.this;
            forumProfileMessageActivity2.n0(forumProfileMessageActivity2.f31079l + 1);
            if (ForumProfileMessageActivity.this.f31080m == -1) {
                ForumProfileMessageActivity.this.w0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements com.join.mgps.customview.g {
        d() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (com.join.android.app.common.utils.j.j(ForumProfileMessageActivity.this)) {
                ForumProfileMessageActivity.this.f31080m = 0;
                ForumProfileMessageActivity.this.n0(1);
                return;
            }
            ForumProfileMessageActivity.this.w0();
            ForumProfileMessageActivity forumProfileMessageActivity = ForumProfileMessageActivity.this;
            forumProfileMessageActivity.showToast(forumProfileMessageActivity.getString(R.string.net_connect_failed));
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
            Context applicationContext = ForumProfileMessageActivity.this.getApplicationContext();
            if (com.join.mgps.Util.j0.Y0(applicationContext)) {
                ForumProfileMessageActivity.this.r0();
                return;
            }
            ForumProfileMessageActivity.this.showToast("用户未登录，请登录！");
            com.join.mgps.Util.j0.L0(applicationContext);
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
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends ForumLoadingView.e {
        g(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            Context applicationContext = ForumProfileMessageActivity.this.getApplicationContext();
            if (com.join.mgps.Util.j0.Y0(applicationContext)) {
                ForumProfileMessageActivity.this.r0();
                return;
            }
            ForumProfileMessageActivity.this.showToast("用户未登录，请登录！");
            com.join.mgps.Util.j0.L0(applicationContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends ForumLoadingView.e {
        h(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            Context applicationContext = ForumProfileMessageActivity.this.getApplicationContext();
            if (com.join.mgps.Util.j0.Y0(applicationContext)) {
                ForumProfileMessageActivity.this.r0();
                return;
            }
            ForumProfileMessageActivity.this.showToast("用户未登录，请登录！");
            com.join.mgps.Util.j0.L0(applicationContext);
        }
    }

    private void o0() {
        this.f31070c.setText("我的消息");
        this.f31073f = new ArrayList();
        this.f31072e.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f31072e.setPullLoadEnable(new c());
        this.f31072e.setPullRefreshEnable(new d());
        this.f31074g = new ForumProfileMessageAdapter(this);
        this.f31075h = new ArrayList();
        this.f31074g.j(this.f31089v);
        this.f31072e.setAdapter((ListAdapter) this.f31074g);
        this.f31072e.setOnScrollListener(this);
    }

    private void p0() {
        k0(18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        k0(0);
        p0();
        if (com.join.android.app.common.utils.j.j(this)) {
            q0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        k0(17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f31078k = com.join.mgps.rpc.impl.g.A0();
        o0();
        r0();
        if (com.join.mgps.Util.j0.Y0(this)) {
            return;
        }
        showToast("用户未登录，请登录！");
        com.join.mgps.Util.j0.L0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(int i4) {
        int i5 = this.f31088u;
        if (i5 == 32) {
            return;
        }
        if (i4 == 32) {
            this.f31088u = 32;
            this.f31071d.j(2);
        } else if (i4 == 0) {
            this.f31088u = 0;
            this.f31071d.m();
            this.f31071d.j(1);
        } else {
            this.f31088u = i4 | i5;
            if (l0(-11)) {
                this.f31088u = 16;
                ForumLoadingView forumLoadingView = this.f31071d;
                forumLoadingView.setListener(new e(forumLoadingView));
                this.f31071d.j(9);
            } else if (l0(22)) {
                this.f31088u = 16;
                this.f31071d.setFailedMsg("还没有收到消息哦~");
                ForumLoadingView forumLoadingView2 = this.f31071d;
                forumLoadingView2.setListener(new f(forumLoadingView2));
                this.f31071d.j(10);
            } else if (!l0(31) && !l0(26)) {
                if (l0(17)) {
                    this.f31088u = 16;
                    ForumLoadingView forumLoadingView3 = this.f31071d;
                    forumLoadingView3.setListener(new h(forumLoadingView3));
                    this.f31071d.j(9);
                }
            } else {
                this.f31088u = 16;
                this.f31071d.setFailedMsg("加载失败，再试试吧~");
                ForumLoadingView forumLoadingView4 = this.f31071d;
                forumLoadingView4.setListener(new g(forumLoadingView4));
                this.f31071d.j(16);
            }
        }
    }

    boolean l0(int i4) {
        return (this.f31088u & i4) == i4;
    }

    ForumBean.ForumPostsBean m0(int i4) {
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        int i5 = 0;
        while (true) {
            List<ForumBean.ForumProfileMessageBean> list = this.f31073f;
            if (list == null || i5 >= list.size()) {
                return forumPostsBean;
            }
            ForumBean.ForumProfileMessageBean forumProfileMessageBean = this.f31073f.get(i5);
            if (forumProfileMessageBean.getPosts().getPid() == i4) {
                return forumProfileMessageBean.getPosts();
            }
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r12.f31080m != (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
        if (r12.f31080m == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
        r12.f31080m = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
        w0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(int r13) {
        /*
            r12 = this;
            int r0 = r12.f31080m
            if (r13 != r0) goto L5
            return
        L5:
            r1 = -1
            if (r0 != r1) goto Lb
            r12.w0()
        Lb:
            r12.f31080m = r13
            boolean r0 = com.join.android.app.common.utils.j.j(r12)
            if (r0 == 0) goto La6
            r0 = 24
            r2 = 1
            r3 = 0
            if (r13 <= r2) goto L1c
            r12.v0()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
        L1c:
            com.wufan.user.service.protobuf.n0 r4 = com.join.mgps.Util.j0.T(r12)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            boolean r5 = com.join.mgps.Util.j0.Y0(r12)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            if (r5 == 0) goto L7c
            com.join.mgps.rpc.i r6 = r12.f31078k     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            int r7 = r4.getUid()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.String r8 = r4.getToken()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            int r10 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            java.lang.String r11 = ""
            r9 = r13
            com.join.mgps.dto.ForumResponse r4 = r6.t(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r5 = 0
            if (r4 == 0) goto L43
            java.lang.Object r4 = r4.getData()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            com.join.mgps.dto.ForumData$ForumProfileMessageData r4 = (com.join.mgps.dto.ForumData.ForumProfileMessageData) r4     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            goto L46
        L43:
            r12.f31080m = r3     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r4 = r5
        L46:
            r6 = 20
            if (r4 == 0) goto L4f
            java.util.List r5 = r4.getMessage_list()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            goto L54
        L4f:
            if (r13 != r2) goto L54
            r12.k0(r6)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
        L54:
            if (r5 == 0) goto L6b
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            if (r4 == 0) goto L6b
            r12.f31079l = r13     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r12.x0(r5, r13)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            r13 = 32
            r12.k0(r13)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            int r13 = r12.f31080m
            if (r13 == r1) goto L98
            goto L96
        L6b:
            r12.f31080m = r1     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            if (r13 != r2) goto L72
            r12.k0(r6)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
        L72:
            int r13 = r12.f31080m
            if (r13 == r1) goto L78
            r12.f31080m = r3
        L78:
            r12.w0()
            return
        L7c:
            r12.k0(r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8b
            int r13 = r12.f31080m
            if (r13 == r1) goto L85
            r12.f31080m = r3
        L85:
            r12.w0()
            return
        L89:
            r13 = move-exception
            goto L9c
        L8b:
            r13 = move-exception
            r12.k0(r0)     // Catch: java.lang.Throwable -> L89
            r13.printStackTrace()     // Catch: java.lang.Throwable -> L89
            int r13 = r12.f31080m
            if (r13 == r1) goto L98
        L96:
            r12.f31080m = r3
        L98:
            r12.w0()
            goto Lb5
        L9c:
            int r0 = r12.f31080m
            if (r0 == r1) goto La2
            r12.f31080m = r3
        La2:
            r12.w0()
            throw r13
        La6:
            r13 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r13 = r12.getString(r13)
            r12.showToast(r13)
            r13 = 17
            r12.k0(r13)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumProfileMessageActivity.n0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f31088u == 16) {
            r0();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if ((i6 - (i4 + i5) < com.join.mgps.Util.j0.f27866f) && (this.f31080m != -1)) {
            n0(this.f31079l + 1);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q0() {
        n0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0() {
        this.f31074g.h(this.f31075h);
        this.f31074g.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    synchronized void t0() {
        if (this.f31073f == null) {
            return;
        }
        this.f31075h.clear();
        int i4 = 0;
        while (i4 < this.f31073f.size()) {
            u0(this.f31073f.get(i4), i4 == 0);
            i4++;
        }
        s0();
    }

    void u0(ForumBean.ForumProfileMessageBean forumProfileMessageBean, boolean z4) {
        try {
            ForumBean.ForumPostsBean posts = forumProfileMessageBean.getPosts();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
            String str = "";
            this.f31075h.add(new ForumProfileMessageAdapter.j(ForumProfileMessageAdapter.ViewType.PROFILE_HEADER, new ForumProfileMessageAdapter.j.b(z4, forumProfileMessageBean.getFrom_avatar_src(), forumProfileMessageBean.getFrom_nickname(), forumProfileMessageBean.getAdd_time(), posts.getFirst() > 0, posts.getPid(), posts.getForum_auth() == 1, forumProfileMessageBean.isFrom_officialAccount(), forumProfileMessageBean.getComment_id(), forumProfileMessageBean.getFrom_type(), forumProfileMessageBean.getRid(), forumProfileMessageBean.getVip_level(), forumProfileMessageBean.getSvip_level(), posts.getCopper_title() != null ? posts.getCopper_title().getBattleTitle() : "", posts.getCopper_title() != null ? posts.getCopper_title().getBattleColor() : "", posts.getUid())));
            this.f31075h.add(new ForumProfileMessageAdapter.j(ForumProfileMessageAdapter.ViewType.PROFILE_MESSAGE_ITEM, new ForumProfileMessageAdapter.j.c(posts.getPid(), forumProfileMessageBean.getFrom_type(), accountData != null ? accountData.getNickname() : "我", forumProfileMessageBean.getMessage(), forumProfileMessageBean.getComment_id(), forumProfileMessageBean.getRid(), false)));
            ForumProfileMessageAdapter.ViewType viewType = ForumProfileMessageAdapter.ViewType.PROFILE_FOOTER;
            int pid = posts.getPid();
            if (posts.getRs_list() != null && posts.getRs_list().size() != 0) {
                str = posts.getRs_list().get(0).getThumb();
            }
            this.f31075h.add(new ForumProfileMessageAdapter.j(viewType, new ForumProfileMessageAdapter.j.a(pid, str, !com.join.mgps.Util.g2.h(posts.getSubject()) ? posts.getSubject() : posts.getMessage(), forumProfileMessageBean.getComment_id(), forumProfileMessageBean.getFrom_type(), forumProfileMessageBean.getFrom_nickname(), forumProfileMessageBean.getRid())));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        if (this.f31072e.j()) {
            this.f31090w.sendEmptyMessageDelayed(0, 3000L);
        } else {
            this.f31090w.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(List<ForumBean.ForumProfileMessageBean> list, int i4) {
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f31073f.clear();
                this.f31079l = 1;
                w0();
            }
            this.f31073f.addAll(list);
        }
        w0();
        t0();
    }
}
