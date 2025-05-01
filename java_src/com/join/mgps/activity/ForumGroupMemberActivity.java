package com.join.mgps.activity;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.BaseAppCompatActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumResponse;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.mg_forum_group_member_activity)
/* loaded from: classes4.dex */
public class ForumGroupMemberActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    XListView2 f30381b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f30382c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ForumLoadingView f30383d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.rpc.i f30384e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    int f30385f;

    /* renamed from: g  reason: collision with root package name */
    public int f30386g;

    /* renamed from: h  reason: collision with root package name */
    public int f30387h;

    /* renamed from: j  reason: collision with root package name */
    private com.join.mgps.customview.g f30389j;

    /* renamed from: k  reason: collision with root package name */
    private ForumBaseAdapter f30390k;

    /* renamed from: l  reason: collision with root package name */
    private List<ForumData.GroupMemberBean> f30391l;

    /* renamed from: m  reason: collision with root package name */
    private List<ForumData.GroupMemberBean> f30392m;

    /* renamed from: n  reason: collision with root package name */
    private ForumData.GroupMemberBean f30393n;

    /* renamed from: p  reason: collision with root package name */
    com.join.android.app.component.video.c f30395p;

    /* renamed from: i  reason: collision with root package name */
    private Handler f30388i = new Handler();

    /* renamed from: o  reason: collision with root package name */
    String f30394o = "ForumGroupMemberActivity";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (ForumGroupMemberActivity.this.m0()) {
                ForumGroupMemberActivity forumGroupMemberActivity = ForumGroupMemberActivity.this;
                forumGroupMemberActivity.j0(forumGroupMemberActivity.f30386g + 1);
                return;
            }
            ForumGroupMemberActivity.this.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (ForumGroupMemberActivity.this.m0()) {
                ForumGroupMemberActivity forumGroupMemberActivity = ForumGroupMemberActivity.this;
                forumGroupMemberActivity.f30386g = 0;
                forumGroupMemberActivity.f30387h = 0;
                forumGroupMemberActivity.j0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends ForumBaseAdapter.b1 {
        c() {
        }

        @Override // com.join.mgps.adapter.ForumBaseAdapter.b1, com.join.mgps.adapter.ForumBaseAdapter.t0
        public void m(int i4) {
            ForumGroupMemberActivity.this.i0(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            XListView2 xListView2 = ForumGroupMemberActivity.this.f30381b;
            if (xListView2 == null) {
                return;
            }
            xListView2.v();
            ForumGroupMemberActivity.this.f30381b.u();
            ForumGroupMemberActivity forumGroupMemberActivity = ForumGroupMemberActivity.this;
            if (forumGroupMemberActivity.f30387h == -1) {
                forumGroupMemberActivity.f30381b.setNoMore();
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
            ForumGroupMemberActivity.this.n0();
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
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
            ForumGroupMemberActivity.this.n0();
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
            ForumGroupMemberActivity.this.n0();
        }
    }

    private void k0() {
        this.f30381b.setPreLoadCount(com.join.mgps.Util.j0.f27865e);
        this.f30381b.setPullLoadEnable(new a());
        b bVar = new b();
        this.f30389j = bVar;
        this.f30381b.setPullRefreshEnable(bVar);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(this, this.f30395p);
        this.f30390k = forumBaseAdapter;
        forumBaseAdapter.C0(this.f30394o);
        this.f30390k.I0(new c());
        this.f30381b.setAdapter((ListAdapter) this.f30390k);
    }

    private void l0() {
        k0();
    }

    private void q0() {
        List<ForumData.GroupMemberBean> list = this.f30391l;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f30390k.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.GROUP_MEMBER_SECTION_TITLE, new ForumBaseAdapter.r1.d("组员们")));
        String uid = AccountUtil_.getInstance_(this).getUid();
        int i4 = 0;
        while (i4 < this.f30391l.size()) {
            ForumData.GroupMemberBean groupMemberBean = this.f30391l.get(i4);
            this.f30390k.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.GROUP_MEMBER_ITEM, new ForumBaseAdapter.r1.c(groupMemberBean.getAvatar_src(), groupMemberBean.getNickname(), false, groupMemberBean.getGrade(), groupMemberBean.getJoin_time(), (TextUtils.isEmpty(uid) || TextUtils.isEmpty(groupMemberBean.getUid()) || !uid.equals(groupMemberBean.getUid())) ? false : true, false, this.f30385f, Integer.parseInt(groupMemberBean.getUid()))));
            i4++;
            uid = uid;
        }
    }

    private void r0() {
        List<ForumData.GroupMemberBean> list = this.f30392m;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f30390k.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.GROUP_MEMBER_SECTION_TITLE, new ForumBaseAdapter.r1.d("管理们")));
        String uid = AccountUtil_.getInstance_(this).getUid();
        int i4 = 0;
        while (i4 < this.f30392m.size()) {
            ForumData.GroupMemberBean groupMemberBean = this.f30392m.get(i4);
            this.f30390k.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.GROUP_MEMBER_ITEM, new ForumBaseAdapter.r1.c(groupMemberBean.getAvatar_src(), groupMemberBean.getNickname(), true, groupMemberBean.getGrade(), groupMemberBean.getJoin_time(), (TextUtils.isEmpty(uid) || TextUtils.isEmpty(groupMemberBean.getUid()) || !uid.equals(groupMemberBean.getUid())) ? false : true, false, this.f30385f, Integer.parseInt(groupMemberBean.getUid()))));
            i4++;
            uid = uid;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f30384e = com.join.mgps.rpc.impl.g.A0();
        this.f30382c.setVisibility(0);
        this.f30382c.setText("小组成员");
        this.f30395p = new com.join.android.app.component.video.c(this, this.f30394o);
        l0();
        h0(1);
        n0();
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
    public void g0(boolean z4) {
        ForumData.GroupMemberBean groupMemberBean = this.f30393n;
        if (groupMemberBean != null) {
            groupMemberBean.setIs_joined(z4);
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(int i4) {
        ForumLoadingView forumLoadingView = this.f30383d;
        if (forumLoadingView == null) {
            return;
        }
        if (i4 == 1) {
            forumLoadingView.j(1);
        } else if (i4 == 2) {
            forumLoadingView.j(2);
        } else if (i4 == 4) {
            forumLoadingView.j(4);
        } else if (i4 == 16) {
            forumLoadingView.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView2 = this.f30383d;
            forumLoadingView2.setListener(new g(forumLoadingView2));
            this.f30383d.j(16);
        } else if (i4 == 9) {
            forumLoadingView.setListener(new e(forumLoadingView));
            this.f30383d.j(9);
        } else if (i4 != 10) {
        } else {
            forumLoadingView.setFailedMsg("没有更多内容哦~");
            ForumLoadingView forumLoadingView3 = this.f30383d;
            forumLoadingView3.setListener(new f(forumLoadingView3));
            this.f30383d.setReloadingVisibility(0);
            this.f30383d.j(10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(int i4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<ForumData.HomepageRecommendLabel> i5 = this.f30384e.i(i4, AccountUtil_.getInstance_(this).getUid(), AccountUtil_.getInstance_(this).getToken());
                if (i5 != null && i5.getData() != null) {
                    if (i5.getError() == 0) {
                        g0(false);
                    }
                    f0(i5.getData().getMsg());
                    return;
                }
                f0(getString(R.string.exit_group_failed));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        f0(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r8.f30387h != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        r8.f30387h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ad, code lost:
        if (r8.f30387h == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00af, code lost:
        r8.f30387h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
        t0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(int r9) {
        /*
            r8 = this;
            boolean r0 = com.join.android.app.common.utils.j.j(r8)
            if (r0 == 0) goto Lbf
            r0 = 4
            r1 = 1
            r2 = 0
            r3 = -1
            int r4 = r8.f30387h     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r4 == r3) goto L90
            if (r4 != r9) goto L12
            goto L90
        L12:
            r8.f30387h = r9     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            com.join.mgps.Util.AccountUtil_ r4 = com.join.mgps.Util.AccountUtil_.getInstance_(r8)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r4 = r4.getUid()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            com.join.mgps.Util.AccountUtil_ r5 = com.join.mgps.Util.AccountUtil_.getInstance_(r8)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.lang.String r5 = r5.getToken()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            com.join.mgps.rpc.i r6 = r8.f30384e     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            int r7 = r8.f30385f     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            com.join.mgps.dto.ForumResponse r4 = r6.Z(r7, r9, r4, r5)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r4 == 0) goto L8b
            int r5 = r4.getError()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r5 != 0) goto L8b
            java.lang.Object r5 = r4.getData()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r5 != 0) goto L47
            r8.h0(r0)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            int r9 = r8.f30387h
            if (r9 == r3) goto L43
            r8.f30387h = r2
        L43:
            r8.t0()
            return
        L47:
            java.lang.Object r4 = r4.getData()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            com.join.mgps.dto.ForumData$GroupFans r4 = (com.join.mgps.dto.ForumData.GroupFans) r4     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            java.util.List r5 = r4.getList()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r5 == 0) goto L5d
            java.util.List r5 = r4.getList()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r5 != 0) goto L82
        L5d:
            if (r9 != r1) goto L6f
            java.util.List r5 = r4.getManagers()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r5 == 0) goto L71
            java.util.List r5 = r4.getList()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            if (r5 == 0) goto L71
        L6f:
            if (r9 <= r1) goto L82
        L71:
            r8.f30387h = r3     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r4 = 10
            r8.h0(r4)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            int r9 = r8.f30387h
            if (r9 == r3) goto L7e
            r8.f30387h = r2
        L7e:
            r8.t0()
            return
        L82:
            r8.s0(r9, r4)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r8.f30386g = r9     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
            r4 = 2
            r8.h0(r4)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9a
        L8b:
            int r9 = r8.f30387h
            if (r9 == r3) goto Lb1
            goto Laf
        L90:
            if (r4 == r3) goto L94
            r8.f30387h = r2
        L94:
            r8.t0()
            return
        L98:
            r9 = move-exception
            goto Lb5
        L9a:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L98
            r8.t0()     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto La8
            com.join.mgps.customview.ForumLoadingView r9 = r8.f30383d     // Catch: java.lang.Throwable -> L98
            r9.m()     // Catch: java.lang.Throwable -> L98
        La8:
            r8.h0(r0)     // Catch: java.lang.Throwable -> L98
            int r9 = r8.f30387h
            if (r9 == r3) goto Lb1
        Laf:
            r8.f30387h = r2
        Lb1:
            r8.t0()
            goto Lce
        Lb5:
            int r0 = r8.f30387h
            if (r0 == r3) goto Lbb
            r8.f30387h = r2
        Lbb:
            r8.t0()
            throw r9
        Lbf:
            r9 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r9 = r8.getString(r9)
            r8.f0(r9)
            r9 = 9
            r8.h0(r9)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ForumGroupMemberActivity.j0(int):void");
    }

    boolean m0() {
        if (com.join.android.app.common.utils.j.j(getBaseContext())) {
            return true;
        }
        f0(getString(R.string.net_connect_failed));
        h0(9);
        t0();
        return false;
    }

    void n0() {
        j0(1);
    }

    synchronized void o0() {
        ForumBaseAdapter forumBaseAdapter = this.f30390k;
        if (forumBaseAdapter != null && forumBaseAdapter.x() != null) {
            this.f30390k.x().clear();
        }
        r0();
        q0();
        ForumBaseAdapter forumBaseAdapter2 = this.f30390k;
        if (forumBaseAdapter2 != null) {
            forumBaseAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.android.app.component.video.c cVar = this.f30395p;
        if (cVar != null) {
            cVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        com.join.android.app.component.video.c cVar = this.f30395p;
        if (cVar != null) {
            cVar.H();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.c cVar = this.f30395p;
        if (cVar != null) {
            cVar.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G, o1.a.I})
    public void p0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = b2.e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            b2.e0.o().m(n4);
        }
        ForumBaseAdapter forumBaseAdapter = this.f30390k;
        if (forumBaseAdapter != null) {
            forumBaseAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0(int i4, ForumData.GroupFans groupFans) {
        if (groupFans == null) {
            return;
        }
        if (this.f30391l == null) {
            this.f30391l = new ArrayList();
        }
        if (this.f30392m == null) {
            this.f30392m = new ArrayList();
        }
        if (i4 == 1) {
            this.f30393n = groupFans.getMe();
            this.f30391l.clear();
            this.f30392m.clear();
            if (groupFans.getManagers() != null) {
                this.f30392m.addAll(groupFans.getManagers());
            }
        }
        if (groupFans.getList() != null) {
            this.f30391l.addAll(groupFans.getList());
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0() {
        this.f30388i.postDelayed(new d(), 1500L);
    }
}
