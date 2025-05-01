package com.join.mgps.activity;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.adapter.ForumProfileCommentAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.mg_forum_profile_comment_activity)
/* loaded from: classes4.dex */
public class ForumProfileCommentActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f30914b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f30915c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ForumLoadingView f30916d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    PtrClassicFrameLayout f30917e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    XListView2 f30918f;

    /* renamed from: g  reason: collision with root package name */
    List<ForumData.ForumProfileCommentData> f30919g;

    /* renamed from: h  reason: collision with root package name */
    ForumProfileCommentAdapter f30920h;

    /* renamed from: i  reason: collision with root package name */
    List<ForumProfileCommentAdapter.i> f30921i;
    @StringRes(resName = "net_excption")

    /* renamed from: j  reason: collision with root package name */
    String f30922j;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: k  reason: collision with root package name */
    String f30923k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.i f30924l;

    /* renamed from: m  reason: collision with root package name */
    private int f30925m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f30926n = 0;

    /* renamed from: o  reason: collision with root package name */
    private final int f30927o = 0;

    /* renamed from: p  reason: collision with root package name */
    private final int f30928p = 16;

    /* renamed from: q  reason: collision with root package name */
    private final int f30929q = 32;

    /* renamed from: r  reason: collision with root package name */
    private final int f30930r = 17;

    /* renamed from: s  reason: collision with root package name */
    private final int f30931s = 18;

    /* renamed from: t  reason: collision with root package name */
    private final int f30932t = 20;

    /* renamed from: u  reason: collision with root package name */
    private final int f30933u = 24;

    /* renamed from: v  reason: collision with root package name */
    private int f30934v = 0;

    /* renamed from: w  reason: collision with root package name */
    ForumProfileCommentAdapter.c f30935w = new a();

    /* renamed from: x  reason: collision with root package name */
    Handler f30936x = new b();

    /* loaded from: classes4.dex */
    class a implements ForumProfileCommentAdapter.c {
        a() {
        }

        @Override // com.join.mgps.adapter.ForumProfileCommentAdapter.c
        public void d(int i4) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(i4);
            com.join.mgps.Util.j0.v0(ForumProfileCommentActivity.this, forumPostsBean);
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            ForumProfileCommentActivity.this.f30918f.v();
            ForumProfileCommentActivity.this.f30918f.u();
            if (ForumProfileCommentActivity.this.f30926n == -1) {
                ForumProfileCommentActivity.this.f30918f.setNoMore();
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
            if (!com.join.android.app.common.utils.j.j(ForumProfileCommentActivity.this)) {
                ForumProfileCommentActivity forumProfileCommentActivity = ForumProfileCommentActivity.this;
                forumProfileCommentActivity.showToast(forumProfileCommentActivity.getString(R.string.net_connect_failed));
                ForumProfileCommentActivity.this.v0();
                return;
            }
            ForumProfileCommentActivity forumProfileCommentActivity2 = ForumProfileCommentActivity.this;
            forumProfileCommentActivity2.m0(forumProfileCommentActivity2.f30925m + 1);
            if (ForumProfileCommentActivity.this.f30926n == -1) {
                ForumProfileCommentActivity.this.v0();
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
            if (com.join.android.app.common.utils.j.j(ForumProfileCommentActivity.this)) {
                ForumProfileCommentActivity.this.f30926n = 0;
                ForumProfileCommentActivity.this.m0(1);
                return;
            }
            ForumProfileCommentActivity forumProfileCommentActivity = ForumProfileCommentActivity.this;
            forumProfileCommentActivity.showToast(forumProfileCommentActivity.getString(R.string.net_connect_failed));
            ForumProfileCommentActivity.this.v0();
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
            ForumProfileCommentActivity.this.q0();
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
            ForumProfileCommentActivity.this.q0();
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
            ForumProfileCommentActivity.this.q0();
        }
    }

    private void n0() {
        this.f30915c.setText("我的评论");
        this.f30919g = new ArrayList();
        this.f30918f.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f30918f.setPullLoadEnable(new c());
        this.f30918f.setPullRefreshEnable(new d());
        this.f30920h = new ForumProfileCommentAdapter(this);
        this.f30921i = new ArrayList();
        this.f30920h.h(this.f30935w);
        this.f30918f.setAdapter((ListAdapter) this.f30920h);
    }

    private void o0() {
        k0(18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        k0(0);
        o0();
        if (com.join.android.app.common.utils.j.j(this)) {
            p0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        k0(17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30924l = com.join.mgps.rpc.impl.g.A0();
        n0();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(int i4) {
        int i5 = this.f30934v;
        if (i5 == 32) {
            return;
        }
        if (i4 == 32) {
            this.f30934v = 32;
            this.f30916d.j(2);
        } else if (i4 == 0) {
            this.f30934v = 0;
            this.f30916d.m();
            this.f30916d.j(1);
        } else {
            this.f30934v = i4 | i5;
            if (l0(-11)) {
                this.f30934v = 16;
                ForumLoadingView forumLoadingView = this.f30916d;
                forumLoadingView.setListener(new e(forumLoadingView));
                this.f30916d.j(9);
            } else if (l0(22)) {
                this.f30934v = 16;
                this.f30916d.setFailedMsg("还没有发布评论~");
                ForumLoadingView forumLoadingView2 = this.f30916d;
                forumLoadingView2.setListener(new f(forumLoadingView2));
                this.f30916d.j(10);
                this.f30916d.setReloadingVisibility(0);
                this.f30916d.setFailedReloadingRes(R.drawable.papa_loading_null);
            } else if (!l0(31) && !l0(26)) {
                if (l0(17)) {
                    this.f30934v = 16;
                    ForumLoadingView forumLoadingView3 = this.f30916d;
                    forumLoadingView3.setListener(new h(forumLoadingView3));
                    this.f30916d.j(9);
                }
            } else {
                this.f30934v = 16;
                this.f30916d.setFailedMsg("加载失败，再试试吧~");
                ForumLoadingView forumLoadingView4 = this.f30916d;
                forumLoadingView4.setListener(new g(forumLoadingView4));
                this.f30916d.j(16);
            }
        }
    }

    boolean l0(int i4) {
        return (this.f30934v & i4) == i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r11.f30926n != (-1)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        if (r11.f30926n == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
        r11.f30926n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        v0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m0(int r12) {
        /*
            r11 = this;
            int r0 = r11.f30926n
            if (r12 != r0) goto L5
            return
        L5:
            r1 = -1
            if (r0 != r1) goto Lb
            r11.v0()
        Lb:
            r11.f30926n = r12
            boolean r0 = com.join.android.app.common.utils.j.j(r11)
            if (r0 == 0) goto La3
            r0 = 1
            r2 = 0
            if (r12 <= r0) goto L1a
            r11.u0()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
        L1a:
            com.wufan.user.service.protobuf.n0 r3 = com.join.mgps.Util.j0.T(r11)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            boolean r4 = com.join.mgps.Util.j0.Y0(r11)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            if (r4 == 0) goto L7a
            com.join.mgps.rpc.i r5 = r11.f30924l     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            int r6 = r3.getUid()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r7 = r3.getToken()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            int r9 = com.join.mgps.Util.j0.f27864d     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.lang.String r10 = ""
            r8 = r12
            com.join.mgps.dto.ForumResponse r3 = r5.a(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r4 = 20
            if (r3 == 0) goto L69
            java.lang.Object r3 = r3.getData()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            if (r3 == 0) goto L58
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            if (r5 == 0) goto L58
            r11.f30925m = r12     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r11.w0(r3, r12)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            r12 = 32
            r11.k0(r12)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            int r12 = r11.f30926n
            if (r12 == r1) goto L95
            goto L93
        L58:
            r11.f30926n = r1     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            if (r12 != r0) goto L5f
            r11.k0(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
        L5f:
            int r12 = r11.f30926n
            if (r12 == r1) goto L65
            r11.f30926n = r2
        L65:
            r11.v0()
            return
        L69:
            r11.f30926n = r2     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
            if (r12 != r0) goto L70
            r11.k0(r4)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L86
        L70:
            int r12 = r11.f30926n
            if (r12 == r1) goto L76
            r11.f30926n = r2
        L76:
            r11.v0()
            return
        L7a:
            int r12 = r11.f30926n
            if (r12 == r1) goto L80
            r11.f30926n = r2
        L80:
            r11.v0()
            return
        L84:
            r12 = move-exception
            goto L99
        L86:
            r12 = move-exception
            r0 = 24
            r11.k0(r0)     // Catch: java.lang.Throwable -> L84
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L84
            int r12 = r11.f30926n
            if (r12 == r1) goto L95
        L93:
            r11.f30926n = r2
        L95:
            r11.v0()
            goto Lb2
        L99:
            int r0 = r11.f30926n
            if (r0 == r1) goto L9f
            r11.f30926n = r2
        L9f:
            r11.v0()
            throw r12
        La3:
            r12 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r12 = r11.getString(r12)
            r11.showToast(r12)
            r12 = 17
            r11.k0(r12)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumProfileCommentActivity.m0(int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        m0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        this.f30920h.g(this.f30921i);
        this.f30920h.notifyDataSetChanged();
    }

    synchronized void s0() {
        if (this.f30919g == null) {
            return;
        }
        this.f30921i.clear();
        int i4 = 0;
        while (i4 < this.f30919g.size()) {
            t0(this.f30919g.get(i4), i4 == 0);
            i4++;
        }
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void t0(ForumData.ForumProfileCommentData forumProfileCommentData, boolean z4) {
        try {
            ForumBean.ForumPostsBean posts = forumProfileCommentData.getPosts();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            String str = "";
            this.f30921i.add(new ForumProfileCommentAdapter.i(ForumProfileCommentAdapter.ViewType.PROFILE_HEADER, new ForumProfileCommentAdapter.i.b(z4, accountData.d0(), accountData.getNickname(), forumProfileCommentData.getLast_update_time(), posts.getFirst() > 0, posts.getPid(), accountData.M(), accountData.j1(), posts.getCopper_title() != null ? posts.getCopper_title().getBattleTitle() : "", posts.getCopper_title() != null ? posts.getCopper_title().getBattleColor() : "", posts.getUid())));
            List<ForumBean.ForumProfileCommentBean> list = forumProfileCommentData.getList();
            int i4 = 0;
            while (list != null && i4 < list.size()) {
                this.f30921i.add(new ForumProfileCommentAdapter.i(ForumProfileCommentAdapter.ViewType.PROFILE_MESSAGE_ITEM, new ForumProfileCommentAdapter.i.c(posts.getPid(), i4 == list.size() + (-1), list.get(i4))));
                i4++;
            }
            ForumProfileCommentAdapter.ViewType viewType = ForumProfileCommentAdapter.ViewType.PROFILE_FOOTER;
            int pid = posts.getPid();
            if (posts.getRs_list() != null && posts.getRs_list().size() != 0) {
                str = posts.getRs_list().get(0).getThumb();
            }
            this.f30921i.add(new ForumProfileCommentAdapter.i(viewType, new ForumProfileCommentAdapter.i.a(pid, str, !com.join.mgps.Util.g2.h(posts.getSubject()) ? posts.getSubject() : posts.getMessage())));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0() {
        if (this.f30918f.j()) {
            this.f30936x.sendEmptyMessageDelayed(0, 3000L);
        } else {
            this.f30936x.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(List<ForumData.ForumProfileCommentData> list, int i4) {
        if (list != null && list.size() != 0) {
            if (i4 == 1) {
                this.f30919g.clear();
                this.f30925m = 1;
                v0();
            }
            this.f30919g.addAll(list);
        }
        v0();
        s0();
    }
}
