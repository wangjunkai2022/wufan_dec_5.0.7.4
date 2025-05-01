package com.join.mgps.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.constraintlayout.widget.Group;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.adapter.g0;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.join.mgps.ptr.PtrFrameLayout;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_friend_msg_like)
/* loaded from: classes3.dex */
public class FriendMsgLikeFragment extends BaseFragment implements com.join.mgps.customview.f, g0.a {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f51608b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView f51609c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Group f51610d;

    /* renamed from: e  reason: collision with root package name */
    int f51611e = 1;

    /* renamed from: f  reason: collision with root package name */
    int f51612f = 0;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.j f51613g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.adapter.g0 f51614h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements com.join.mgps.ptr.b {
        a() {
        }

        @Override // com.join.mgps.ptr.b
        public boolean checkCanDoRefresh(PtrFrameLayout ptrFrameLayout, View view, View view2) {
            return com.join.mgps.ptr.a.checkContentCanBePulledDown(ptrFrameLayout, view, view2);
        }

        @Override // com.join.mgps.ptr.b
        public void onRefreshBegin(PtrFrameLayout ptrFrameLayout) {
            FriendMsgLikeFragment.this.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() {
        XListView xListView = this.f51609c;
        if (xListView != null) {
            xListView.q();
            if (this.f51612f == -1) {
                this.f51609c.setNoMore();
            }
        }
    }

    /* renamed from: X */
    public void a0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51608b;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.f();
        }
    }

    public boolean Z() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51608b;
        if (ptrClassicFrameLayout != null) {
            return ptrClassicFrameLayout.q();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51613g = com.join.mgps.rpc.impl.h.p();
        e0();
        this.f51609c.setPullLoadEnable(this);
        com.join.mgps.adapter.g0 g0Var = new com.join.mgps.adapter.g0(getContext());
        this.f51614h = g0Var;
        g0Var.g(this);
        this.f51609c.setAdapter((ListAdapter) this.f51614h);
        a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c0() {
        Context context = getContext();
        try {
            if (com.ta.utdid2.android.utils.f.f(context)) {
                String uid = AccountUtil_.getInstance_(context).getUid();
                String token = AccountUtil_.getInstance_(context).getToken();
                HashMap hashMap = new HashMap();
                hashMap.put("uid", uid);
                hashMap.put("token", token);
                ResponseModel h4 = this.f51613g.h(hashMap);
                if (h4 == null || h4.getError() != 0) {
                    T(h4 != null ? h4.getMsg() : getString(R.string.loading_failed));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r6.f51612f != (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        r6.f51611e = r7;
        r6.f51612f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r6.f51612f == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        r6.f51611e = r7;
        r6.f51612f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        g0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            r1 = 0
            r2 = -1
            int r3 = r6.f51612f     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r3 == r7) goto L72
            if (r3 != r2) goto Ld
            goto L72
        Ld:
            boolean r3 = com.ta.utdid2.android.utils.f.f(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r3 == 0) goto L63
            com.join.mgps.Util.AccountUtil_ r3 = com.join.mgps.Util.AccountUtil_.getInstance_(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.String r3 = r3.getUid()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            com.join.mgps.Util.AccountUtil_ r0 = com.join.mgps.Util.AccountUtil_.getInstance_(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.String r0 = r0.getToken()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            com.join.mgps.rpc.j r4 = r6.f51613g     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r5 = 10
            com.join.mgps.dto.ResponseModel r0 = r4.l(r3, r0, r5, r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r0 == 0) goto L51
            int r3 = r0.getError()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r3 != 0) goto L51
            java.lang.Object r3 = r0.getData()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r6.i0(r3, r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.Object r3 = r0.getData()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r3 == 0) goto L4e
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r0 != 0) goto L6d
        L4e:
            r6.f51612f = r2     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            goto L6d
        L51:
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.getMsg()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            goto L5f
        L58:
            r0 = 2131755524(0x7f100204, float:1.914193E38)
            java.lang.String r0 = r6.getString(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
        L5f:
            r6.T(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            goto L6d
        L63:
            r0 = 2131755673(0x7f100299, float:1.9142232E38)
            java.lang.String r0 = r6.getString(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r6.T(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
        L6d:
            int r0 = r6.f51612f
            if (r0 == r2) goto L8a
            goto L86
        L72:
            if (r3 == r2) goto L78
            r6.f51611e = r7
            r6.f51612f = r1
        L78:
            r6.g0()
            return
        L7c:
            r0 = move-exception
            goto L8e
        L7e:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7c
            int r0 = r6.f51612f
            if (r0 == r2) goto L8a
        L86:
            r6.f51611e = r7
            r6.f51612f = r1
        L8a:
            r6.g0()
            return
        L8e:
            int r3 = r6.f51612f
            if (r3 == r2) goto L96
            r6.f51611e = r7
            r6.f51612f = r1
        L96:
            r6.g0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.FriendMsgLikeFragment.d0(int):void");
    }

    void e0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51608b;
        if (ptrClassicFrameLayout == null) {
            return;
        }
        ptrClassicFrameLayout.j(true);
        this.f51608b.setPtrHandler(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        XListView xListView = this.f51609c;
        if (xListView != null) {
            xListView.setPullLoadEnable(this);
        }
        this.f51612f = 0;
        this.f51611e = 1;
        d0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        h0();
        this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.v0
            @Override // java.lang.Runnable
            public final void run() {
                FriendMsgLikeFragment.this.b0();
            }
        }, 200L);
    }

    public void h0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51608b;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(List<FriendBean> list, int i4) {
        if (this.f51614h == null || isDetached() || !isAdded()) {
            return;
        }
        if (i4 == 1) {
            this.f51614h.c().clear();
        }
        if (list != null && list.size() != 0) {
            this.f51614h.c().addAll(list);
        }
        this.f51614h.notifyDataSetChanged();
        if (this.f51610d != null) {
            if (this.f51614h.c().size() == 0) {
                this.f51610d.setVisibility(0);
            } else {
                this.f51610d.setVisibility(8);
            }
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // com.join.mgps.adapter.g0.a
    public void m(FriendBean friendBean) {
        if (getActivity() instanceof FriendActivity) {
            ((FriendActivity) getActivity()).K(friendBean.getRuid() + "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.u0
                @Override // java.lang.Runnable
                public final void run() {
                    FriendMsgLikeFragment.this.a0();
                }
            }, 200L);
            return;
        }
        com.join.mgps.adapter.g0 g0Var = this.f51614h;
        if (g0Var == null || g0Var.c() == null || this.f51614h.c().size() <= 0) {
            return;
        }
        for (FriendBean friendBean : this.f51614h.c()) {
            friendBean.setReadFlag(1);
        }
        this.f51614h.notifyDataSetChanged();
    }

    @Override // com.join.mgps.customview.f
    public void onLoadMore() {
        d0(this.f51611e + 1);
    }
}
