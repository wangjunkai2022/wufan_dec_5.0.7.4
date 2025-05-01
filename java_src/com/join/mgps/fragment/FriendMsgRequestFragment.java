package com.join.mgps.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ListAdapter;
import androidx.constraintlayout.widget.Group;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.adapter.k0;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.join.mgps.ptr.PtrFrameLayout;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_friend_msg_req)
/* loaded from: classes3.dex */
public class FriendMsgRequestFragment extends BaseFragment implements com.join.mgps.customview.f, k0.a {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f51626b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView f51627c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Group f51628d;

    /* renamed from: e  reason: collision with root package name */
    int f51629e = 1;

    /* renamed from: f  reason: collision with root package name */
    int f51630f = 0;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.j f51631g;

    /* renamed from: h  reason: collision with root package name */
    com.join.mgps.adapter.k0 f51632h;

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
            FriendMsgRequestFragment.this.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() {
        XListView xListView = this.f51627c;
        if (xListView == null) {
            return;
        }
        xListView.q();
        if (this.f51630f == -1) {
            this.f51627c.setNoMore();
        }
    }

    @Override // com.join.mgps.adapter.k0.a
    public void E(FriendBean friendBean) {
        Ext ext = new Ext();
        ext.setPosition("0");
        com.papa.sim.statistic.p.l(getContext()).O1(Event.Friendsapplication, ext);
        f0(friendBean.getId(), "ACCEPT");
    }

    /* renamed from: X */
    public void a0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51626b;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.f();
        }
    }

    public boolean Z() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51626b;
        if (ptrClassicFrameLayout != null) {
            return ptrClassicFrameLayout.q();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51631g = com.join.mgps.rpc.impl.h.p();
        d0();
        this.f51627c.setPullLoadEnable(this);
        com.join.mgps.adapter.k0 k0Var = new com.join.mgps.adapter.k0(getContext());
        this.f51632h = k0Var;
        k0Var.k(this);
        this.f51627c.setAdapter((ListAdapter) this.f51632h);
        a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r6.f51630f != (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        r6.f51629e = r7;
        r6.f51630f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r6.f51630f == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        r6.f51629e = r7;
        r6.f51630f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        h0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            r1 = 0
            r2 = -1
            int r3 = r6.f51630f     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
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
            com.join.mgps.rpc.j r4 = r6.f51631g     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r5 = 10
            com.join.mgps.dto.ResponseModel r0 = r4.e(r3, r0, r5, r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r0 == 0) goto L51
            int r3 = r0.getError()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r3 != 0) goto L51
            java.lang.Object r3 = r0.getData()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            r6.j0(r3, r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.lang.Object r3 = r0.getData()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r3 == 0) goto L4e
            java.lang.Object r0 = r0.getData()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
            if (r0 != 0) goto L6d
        L4e:
            r6.f51630f = r2     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L7e
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
            int r0 = r6.f51630f
            if (r0 == r2) goto L8a
            goto L86
        L72:
            if (r3 == r2) goto L78
            r6.f51629e = r7
            r6.f51630f = r1
        L78:
            r6.h0()
            return
        L7c:
            r0 = move-exception
            goto L8e
        L7e:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7c
            int r0 = r6.f51630f
            if (r0 == r2) goto L8a
        L86:
            r6.f51629e = r7
            r6.f51630f = r1
        L8a:
            r6.h0()
            return
        L8e:
            int r3 = r6.f51630f
            if (r3 == r2) goto L96
            r6.f51629e = r7
            r6.f51630f = r1
        L96:
            r6.h0()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.FriendMsgRequestFragment.c0(int):void");
    }

    void d0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51626b;
        if (ptrClassicFrameLayout == null) {
            return;
        }
        ptrClassicFrameLayout.j(true);
        this.f51626b.setPtrHandler(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0() {
        XListView xListView = this.f51627c;
        if (xListView != null) {
            xListView.setPullLoadEnable(this);
        }
        this.f51630f = 0;
        this.f51629e = 1;
        c0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0(int i4, String str) {
        Context context = getContext();
        try {
            if (com.ta.utdid2.android.utils.f.f(context)) {
                String uid = AccountUtil_.getInstance_(context).getUid();
                String token = AccountUtil_.getInstance_(context).getToken();
                HashMap hashMap = new HashMap();
                hashMap.put("uid", uid);
                hashMap.put("token", token);
                hashMap.put("id", Integer.valueOf(i4));
                hashMap.put("friendRequestType", str);
                ResponseModel n4 = this.f51631g.n(hashMap);
                if (n4 != null && n4.getError() == 0) {
                    g0(i4);
                    com.join.mgps.event.q qVar = new com.join.mgps.event.q(4);
                    qVar.k(str.equals("ACCEPT"));
                    org.greenrobot.eventbus.c.f().o(qVar);
                    return;
                }
                T(n4 != null ? n4.getMsg() : getString(R.string.request_failure));
                return;
            }
            T(getString(R.string.net_connect_failed));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(int i4) {
        com.join.mgps.adapter.k0 k0Var = this.f51632h;
        if (k0Var == null) {
            return;
        }
        Iterator<FriendBean> it2 = k0Var.e().iterator();
        while (it2.hasNext()) {
            if (i4 == it2.next().getId()) {
                it2.remove();
            }
        }
        this.f51632h.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        i0();
        this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.w0
            @Override // java.lang.Runnable
            public final void run() {
                FriendMsgRequestFragment.this.b0();
            }
        }, 200L);
    }

    public void i0() {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f51626b;
        if (ptrClassicFrameLayout != null) {
            ptrClassicFrameLayout.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(List<FriendBean> list, int i4) {
        if (i4 == 1) {
            this.f51632h.e().clear();
        }
        if (list != null && list.size() != 0) {
            this.f51632h.e().addAll(list);
        }
        this.f51632h.notifyDataSetChanged();
        if (this.f51628d != null) {
            if (this.f51632h.e().size() == 0) {
                this.f51628d.setVisibility(0);
            } else {
                this.f51628d.setVisibility(8);
            }
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // com.join.mgps.adapter.k0.a
    public void m(FriendBean friendBean) {
        if (getActivity() instanceof FriendActivity) {
            ((FriendActivity) getActivity()).K(friendBean.getUid() + "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.x0
            @Override // java.lang.Runnable
            public final void run() {
                FriendMsgRequestFragment.this.a0();
            }
        }, 200L);
    }

    @Override // com.join.mgps.customview.f
    public void onLoadMore() {
        c0(this.f51629e + 1);
    }

    @Override // com.join.mgps.adapter.k0.a
    public void u(FriendBean friendBean) {
        Ext ext = new Ext();
        ext.setPosition("1");
        com.papa.sim.statistic.p.l(getContext()).O1(Event.Friendsapplication, ext);
        f0(friendBean.getId(), "REJECT");
    }
}
