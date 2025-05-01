package com.join.mgps.fragment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendCardBean;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.ResponseModel;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_friend_card)
/* loaded from: classes3.dex */
public class FriendCardFragment extends BaseFragment {

    /* renamed from: b  reason: collision with root package name */
    String f51486b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f51487c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f51488d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f51489e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f51490f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f51491g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f51492h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f51493i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f51494j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    View f51495k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    GridView f51496l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Group f51497m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f51498n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.j f51499o;

    /* renamed from: p  reason: collision with root package name */
    private FriendCardBean f51500p;

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.adapter.u f51501q;

    /* renamed from: r  reason: collision with root package name */
    Dialog f51502r = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(String str, View view) {
        v0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(String str, View view) {
        v0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0() {
        if (!com.ta.utdid2.android.utils.f.f(getContext())) {
            View view = this.f51498n;
            if (view != null) {
                view.setVisibility(0);
            }
            Group group = this.f51497m;
            if (group != null) {
                group.setVisibility(4);
            }
            View view2 = this.f51495k;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            GridView gridView = this.f51496l;
            if (gridView != null) {
                gridView.setVisibility(4);
                return;
            }
            return;
        }
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(String str, View view) {
        j0(Integer.parseInt(str));
        this.f51502r.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(View view) {
        this.f51502r.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(View view) {
        this.f51502r.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(View view) {
        if (IntentUtil.getInstance().goLogin(view.getContext())) {
            return;
        }
        v0(this.f51486b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(View view) {
        if (IntentUtil.getInstance().goLogin(view.getContext())) {
            return;
        }
        v0(this.f51486b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(View view) {
        try {
            if (IntentUtil.getInstance().goLogin(view.getContext()) || TextUtils.isEmpty(this.f51486b)) {
                return;
            }
            A0(this.f51486b);
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(View view) {
        try {
            Ext ext = new Ext();
            ext.setFrom("0");
            com.papa.sim.statistic.p.l(getContext()).O1(Event.addFriends, ext);
            if (IntentUtil.getInstance().goLogin(view.getContext()) || TextUtils.isEmpty(this.f51486b)) {
                return;
            }
            g0(Integer.parseInt(this.f51486b));
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0(final String str) {
        Context context = getContext();
        if (this.f51502r == null) {
            Dialog dialog = new Dialog(context, R.style.newtrans_floating_dialog);
            this.f51502r = dialog;
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                this.f51502r.getWindow().setAttributes(attributes);
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_friend_del_dialog, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.iv_close);
            View findViewById2 = inflate.findViewById(R.id.ok);
            View findViewById3 = inflate.findViewById(R.id.cancel);
            inflate.setBackgroundResource(R.drawable.shape_invite_battle_bg1);
            this.f51502r.setContentView(inflate);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wdp526);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.wdp401);
            Window window = this.f51502r.getWindow();
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (dimensionPixelOffset == 0) {
                dimensionPixelOffset = -1;
            }
            attributes2.width = dimensionPixelOffset;
            if (dimensionPixelOffset2 == 0) {
                dimensionPixelOffset2 = -1;
            }
            attributes2.height = dimensionPixelOffset2;
            window.setGravity(17);
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendCardFragment.this.o0(str, view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendCardFragment.this.p0(view);
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendCardFragment.this.q0(view);
                }
            });
        }
        if (this.f51502r.isShowing()) {
            return;
        }
        this.f51502r.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0(FriendCardBean friendCardBean) {
        String str;
        if (friendCardBean == null || isDetached() || !isAdded()) {
            return;
        }
        View view = this.f51498n;
        if (view != null) {
            view.setVisibility(8);
        }
        Group group = this.f51497m;
        if (group != null) {
            group.setVisibility(0);
        }
        GridView gridView = this.f51496l;
        if (gridView != null) {
            gridView.setVisibility(0);
        }
        this.f51500p = friendCardBean;
        DecimalFormat decimalFormat = new DecimalFormat("###.0");
        TextView textView = this.f51491g;
        if (friendCardBean.getLikeCount() < 10000) {
            str = friendCardBean.getLikeCount() + "";
        } else {
            str = decimalFormat.format((friendCardBean.getLikeCount() * 1.0f) / 10000.0f) + "W";
        }
        textView.setText(str);
        if (friendCardBean.isLikeStatus()) {
            this.f51493i.setBackgroundResource(R.drawable.ic_like_gray);
            this.f51493i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FriendCardFragment.this.r0(view2);
                }
            });
            this.f51491g.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FriendCardFragment.this.s0(view2);
                }
            });
        } else {
            this.f51493i.setOnClickListener(null);
            this.f51491g.setOnClickListener(null);
            this.f51493i.setBackgroundResource(R.drawable.ic_like);
        }
        if (friendCardBean.isOnlineStatus()) {
            this.f51492h.setText("在线");
            this.f51492h.setTextColor(Color.parseColor("#FF03DA00"));
        } else {
            this.f51492h.setText("离线");
            this.f51492h.setTextColor(Color.parseColor("#FFC4C4C4"));
        }
        if (friendCardBean.getUserInfo() != null) {
            FriendBean userInfo = friendCardBean.getUserInfo();
            MyImageLoader.x(this.f51487c, userInfo.getAvatar());
            this.f51488d.setText(userInfo.getNickName());
            if (userInfo.getMemberTitle() != null) {
                this.f51489e.setText(userInfo.getMemberTitle().getBattleTitle());
                this.f51489e.setTextColor(Color.parseColor(userInfo.getMemberTitle().getBattleTitleColor()));
            }
            if (userInfo.isVip()) {
                this.f51494j.setVisibility(0);
            } else {
                this.f51494j.setVisibility(8);
            }
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            if (userInfo.getUid() == (accountData != null ? accountData.getUid() : 0)) {
                this.f51490f.setVisibility(8);
            } else {
                this.f51490f.setVisibility(0);
            }
            if (friendCardBean.isFriendStatus()) {
                this.f51490f.setText("删除好友");
                this.f51490f.setBackgroundResource(R.drawable.shape_friend_del);
                this.f51490f.setTextColor(Color.parseColor("#F5F5F5"));
                this.f51490f.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FriendCardFragment.this.t0(view2);
                    }
                });
            } else if (friendCardBean.isAddFriendStatus()) {
                this.f51490f.setText("加好友");
                this.f51490f.setBackgroundResource(R.drawable.shape_friend_add);
                this.f51490f.setTextColor(Color.parseColor("#000000"));
                this.f51490f.setSelected(false);
                this.f51490f.setClickable(true);
                this.f51490f.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FriendCardFragment.this.u0(view2);
                    }
                });
            } else {
                this.f51490f.setText("已发送");
                this.f51490f.setBackgroundResource(R.drawable.shape_friend_sent);
                this.f51490f.setTextColor(Color.parseColor("#BABABA"));
                this.f51490f.setSelected(true);
                this.f51490f.setClickable(false);
                this.f51490f.setOnClickListener(null);
            }
        }
        if (friendCardBean.getPlayGameLevels() != null && friendCardBean.getPlayGameLevels().size() != 0) {
            this.f51496l.setVisibility(0);
            this.f51495k.setVisibility(8);
            this.f51501q.b().clear();
            this.f51501q.b().addAll(friendCardBean.getPlayGameLevels());
            this.f51501q.notifyDataSetChanged();
            return;
        }
        this.f51495k.setVisibility(0);
        this.f51496l.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51499o = com.join.mgps.rpc.impl.h.p();
        Context context = getContext();
        com.join.mgps.adapter.u uVar = new com.join.mgps.adapter.u(getContext());
        this.f51501q = uVar;
        this.f51496l.setAdapter((ListAdapter) uVar);
        if (!com.ta.utdid2.android.utils.f.f(context)) {
            this.f51498n.setVisibility(0);
            this.f51494j.setVisibility(4);
            this.f51490f.setVisibility(4);
            this.f51497m.setVisibility(4);
            this.f51495k.setVisibility(4);
            this.f51496l.setVisibility(4);
        }
        y0();
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            FriendReqBean friendReqBean = new FriendReqBean();
            friendReqBean.setUid(accountData.getUid());
            friendReqBean.setRuid(i4);
            friendReqBean.setToken(accountData.getToken());
            friendReqBean.setRequestInfo("嘿，交个朋友，少年~(*^▽^*)");
            ResponseModel b5 = this.f51499o.b(friendReqBean);
            if (b5 != null) {
                if (b5.getError() == 0) {
                    h0(i4);
                } else {
                    T(b5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0(int i4) {
        T("已发送好友申请");
        FriendCardBean friendCardBean = this.f51500p;
        if (friendCardBean != null) {
            friendCardBean.setFriendStatus(false);
            this.f51500p.setAddFriendStatus(false);
            B0(this.f51500p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        if (getContext() instanceof FriendActivity) {
            ((FriendActivity) getContext()).T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            HashMap hashMap = new HashMap();
            hashMap.put("uid", Integer.valueOf(accountData.getUid()));
            hashMap.put("token", accountData.getToken());
            hashMap.put("delUid", Integer.valueOf(i4));
            ResponseModel m4 = this.f51499o.m(hashMap);
            if (m4 != null) {
                if (m4.getError() == 0) {
                    k0(i4);
                } else {
                    T(m4.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(int i4) {
        T("已删除好友");
        FriendCardBean friendCardBean = this.f51500p;
        if (friendCardBean != null) {
            friendCardBean.setFriendStatus(false);
            this.f51500p.setAddFriendStatus(true);
            B0(this.f51500p);
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f51486b = arguments.getString("ruid");
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (!z4) {
            this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.g0
                @Override // java.lang.Runnable
                public final void run() {
                    FriendCardFragment.this.n0();
                }
            }, 500L);
        } else {
            y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v0(String str) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            HashMap hashMap = new HashMap();
            hashMap.put("uid", Integer.valueOf(accountData.getUid()));
            hashMap.put("token", accountData.getToken());
            hashMap.put("likeUid", str);
            ResponseModel a5 = this.f51499o.a(hashMap);
            if (a5 != null) {
                if (a5.getError() == 0) {
                    w0(str);
                } else {
                    T(a5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(final String str) {
        String format;
        T("点赞成功");
        this.f51500p.setLikeStatus(false);
        FriendCardBean friendCardBean = this.f51500p;
        friendCardBean.setLikeCount(friendCardBean.getLikeCount() + 1);
        DecimalFormat decimalFormat = new DecimalFormat("###.0");
        TextView textView = this.f51491g;
        if (this.f51500p.getLikeCount() < 10000) {
            format = this.f51500p.getLikeCount() + "";
        } else {
            format = decimalFormat.format((this.f51500p.getLikeCount() * 1.0f) / 1000.0f);
        }
        textView.setText(format);
        if (this.f51500p.isLikeStatus()) {
            this.f51493i.setBackgroundResource(R.drawable.ic_like_gray);
            this.f51493i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendCardFragment.this.l0(str, view);
                }
            });
            this.f51491g.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendCardFragment.this.m0(str, view);
                }
            });
            return;
        }
        this.f51493i.setOnClickListener(null);
        this.f51491g.setOnClickListener(null);
        this.f51493i.setBackgroundResource(R.drawable.ic_like);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            com.join.mgps.rpc.j jVar = this.f51499o;
            ResponseModel<FriendCardBean> g4 = jVar.g(accountData.getUid() + "", accountData.getToken(), this.f51486b);
            if (g4 != null) {
                if (g4.getError() == 0 && g4.getData() != null) {
                    B0(g4.getData());
                } else {
                    T(g4.getMsg());
                }
            } else {
                T(getString(R.string.request_failure));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        com.join.mgps.adapter.u uVar = this.f51501q;
        if (uVar != null) {
            uVar.b().clear();
            this.f51501q.notifyDataSetChanged();
            this.f51495k.setVisibility(4);
        }
        TextView textView = this.f51488d;
        if (textView != null) {
            textView.setText("---");
        }
        TextView textView2 = this.f51489e;
        if (textView2 != null) {
            textView2.setText("---");
        }
        TextView textView3 = this.f51492h;
        if (textView3 != null) {
            textView3.setText("--");
        }
        TextView textView4 = this.f51491g;
        if (textView4 != null) {
            textView4.setText("--");
        }
        View view = this.f51493i;
        if (view != null) {
            view.setSelected(false);
        }
        View view2 = this.f51494j;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TextView textView5 = this.f51490f;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
    }

    public void z0(String str) {
        this.f51486b = str;
    }
}
