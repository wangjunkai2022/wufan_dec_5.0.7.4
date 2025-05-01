package com.join.mgps.fragment;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.adapter.FriendAddAdapter;
import com.join.mgps.base.decoration.UniversalItemDecoration;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.ResponseModel;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_friend_add)
/* loaded from: classes3.dex */
public class FriendAddFragment extends BaseFragment implements FriendAddAdapter.a {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    EditText f51460b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f51461c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    KeyboardListenLayout f51462d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f51463e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f51464f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f51465g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f51466h;

    /* renamed from: i  reason: collision with root package name */
    FriendAddAdapter f51467i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.j f51468j;

    /* loaded from: classes3.dex */
    class a extends UniversalItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UniversalItemDecoration.a f51469a;

        a(UniversalItemDecoration.a aVar) {
            this.f51469a = aVar;
        }

        @Override // com.join.mgps.base.decoration.UniversalItemDecoration
        public UniversalItemDecoration.b getItemOffsets(int i4) {
            return this.f51469a;
        }
    }

    /* loaded from: classes3.dex */
    class b implements KeyboardListenLayout.a {
        b() {
        }

        @Override // com.join.mgps.customview.KeyboardListenLayout.a
        public void onHidden() {
        }

        @Override // com.join.mgps.customview.KeyboardListenLayout.a
        public void onShown() {
            FriendAddFragment friendAddFragment = FriendAddFragment.this;
            friendAddFragment.a0(friendAddFragment.f51460b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() {
        EditText editText = this.f51460b;
        if (editText != null) {
            editText.setText("");
        }
        TextView textView = this.f51464f;
        if (textView != null) {
            textView.setVisibility(8);
        }
        FriendAddAdapter friendAddAdapter = this.f51467i;
        if (friendAddAdapter != null) {
            friendAddAdapter.b().clear();
            this.f51467i.notifyDataSetChanged();
        }
    }

    private void c0() {
        this.f51460b.setText("");
        this.f51464f.setVisibility(8);
        this.f51463e.setVisibility(8);
        this.f51465g.setVisibility(8);
        this.f51466h.setVisibility(8);
    }

    @Override // com.join.mgps.adapter.FriendAddAdapter.a
    public void P(FriendBean friendBean) {
        Ext ext = new Ext();
        ext.setFrom("2");
        com.papa.sim.statistic.p.l(getContext()).O1(Event.addFriends, ext);
        W(friendBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void W(FriendBean friendBean) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            FriendReqBean friendReqBean = new FriendReqBean();
            friendReqBean.setUid(accountData.getUid());
            friendReqBean.setToken(accountData.getToken());
            friendReqBean.setRuid(friendBean.getRuid());
            friendReqBean.setRequestInfo("嘿，交个朋友，少年~(*^▽^*)");
            ResponseModel b5 = this.f51468j.b(friendReqBean);
            if (b5 != null) {
                if (b5.getError() == 0) {
                    X(Boolean.TRUE);
                } else {
                    g0(b5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X(Boolean bool) {
        FriendAddAdapter friendAddAdapter;
        if (!bool.booleanValue() || (friendAddAdapter = this.f51467i) == null || friendAddAdapter.b().size() <= 0) {
            return;
        }
        this.f51467i.b().get(0).setFriendRequestType("INIT");
        this.f51467i.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z() {
        EditText editText = this.f51460b;
        if (editText != null) {
            o2.a.b(editText);
        }
        if (getContext() instanceof FriendActivity) {
            ((FriendActivity) getContext()).T0();
        }
        c0();
    }

    void a0(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            f0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        Context context = getContext();
        this.f51468j = com.join.mgps.rpc.impl.h.p();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        this.f51463e.setLayoutManager(linearLayoutManager);
        UniversalItemDecoration.a aVar = new UniversalItemDecoration.a();
        aVar.f46233f = 0;
        aVar.f46236c = (int) getResources().getDimension(R.dimen.wdp22);
        this.f51463e.addItemDecoration(new a(aVar));
        FriendAddAdapter friendAddAdapter = new FriendAddAdapter(context);
        this.f51467i = friendAddAdapter;
        this.f51463e.setAdapter(friendAddAdapter);
        this.f51462d.setOnSoftKeyboardListener(new b());
        this.f51467i.f(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d0() {
        Context context = getContext();
        o2.a.b(this.f51460b);
        if (com.ta.utdid2.android.utils.f.f(context)) {
            if (TextUtils.isEmpty(this.f51460b.getText().toString().trim())) {
                l2.a(context).b("输入不能为空");
                return;
            } else {
                e0();
                return;
            }
        }
        l2.a(context).b(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            ResponseModel<List<FriendBean>> c5 = this.f51468j.c(accountData.getUid(), accountData.getToken(), this.f51460b.getText().toString());
            if (c5 != null) {
                if (c5.getError() == 0 && c5.getData() != null) {
                    updateUi(c5.getData());
                } else {
                    g0(c5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void f0(View view) {
        view.setSystemUiVisibility(5894);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(String str) {
        l2.a(getContext()).b(str);
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.w
            @Override // java.lang.Runnable
            public final void run() {
                FriendAddFragment.this.b0();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<FriendBean> list) {
        if (list == null) {
            this.f51464f.setVisibility(8);
            this.f51463e.setVisibility(8);
            this.f51465g.setVisibility(0);
            this.f51466h.setVisibility(0);
            return;
        }
        FriendAddAdapter friendAddAdapter = this.f51467i;
        if (friendAddAdapter != null) {
            friendAddAdapter.b().clear();
            if (list.size() > 0) {
                this.f51464f.setVisibility(0);
                this.f51465g.setVisibility(8);
                this.f51466h.setVisibility(8);
                this.f51463e.setVisibility(0);
                this.f51467i.b().addAll(list);
                this.f51463e.scrollToPosition(0);
            } else {
                this.f51464f.setVisibility(8);
                this.f51465g.setVisibility(0);
                this.f51466h.setVisibility(0);
                this.f51463e.setVisibility(8);
            }
            this.f51467i.notifyDataSetChanged();
        }
    }
}
