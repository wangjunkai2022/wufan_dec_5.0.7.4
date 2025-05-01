package com.join.mgps.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.beizi.fusion.widget.TwistView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.activity.GameMainActivity4_;
import com.join.mgps.activity.arena.GameRoomListActivity;
import com.join.mgps.adapter.FriendListAdapter;
import com.join.mgps.customview.smartpopupwindow.SmartPopupWindow;
import com.join.mgps.dto.FriendAccountInfo;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendRecommendRequest;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ShareBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.ext.ToastManager;
import com.wufan.friend.chat.protocol.l1;
import com.wufan.friend.chat.protocol.o1;
import com.wufan.friend.chat.protocol.w1;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_friend_my)
/* loaded from: classes.dex */
public class FriendFragment extends BaseFragment {
    View A;
    ImageView B;
    ImageView C;
    TextView D;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f51525b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f51526c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f51527d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f51528e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f51529f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f51530g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    View f51531h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    View f51532i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f51533j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    View f51534k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RecyclerView f51535l;

    /* renamed from: m  reason: collision with root package name */
    SmartPopupWindow f51536m;

    /* renamed from: o  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f51538o;

    /* renamed from: p  reason: collision with root package name */
    private FriendListAdapter f51539p;

    /* renamed from: q  reason: collision with root package name */
    com.join.mgps.rpc.j f51540q;

    /* renamed from: r  reason: collision with root package name */
    String f51541r;

    /* renamed from: u  reason: collision with root package name */
    String f51544u;

    /* renamed from: v  reason: collision with root package name */
    private FriendAccountInfo f51545v;

    /* renamed from: z  reason: collision with root package name */
    ClipboardManager f51549z;

    /* renamed from: n  reason: collision with root package name */
    com.wufan.friend.chat.c f51537n = com.wufan.friend.chat.c.u();

    /* renamed from: s  reason: collision with root package name */
    String f51542s = "";

    /* renamed from: t  reason: collision with root package name */
    List<GameInfoBean> f51543t = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    private int f51546w = 1;

    /* renamed from: x  reason: collision with root package name */
    boolean f51547x = false;

    /* renamed from: y  reason: collision with root package name */
    Dialog f51548y = null;

    /* loaded from: classes3.dex */
    class a extends RecyclerView.AdapterDataObserver {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            if (FriendFragment.this.f51539p != null) {
                FriendFragment friendFragment = FriendFragment.this;
                if (friendFragment.f51532i != null) {
                    if (friendFragment.f51539p.getItemCount() > 0) {
                        FriendFragment.this.f51532i.setVisibility(8);
                    } else {
                        FriendFragment.this.f51532i.setVisibility(0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(View view) {
        this.f51548y.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(View view) {
        b1(0);
        this.f51548y.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(View view) {
        b1(2);
        this.f51548y.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(View view) {
        Z0(0);
        com.wufan.friend.chat.c.u().U(0);
        this.f51536m.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(View view) {
        Z0(1);
        com.wufan.friend.chat.c.u().U(1);
        this.f51536m.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0() {
        this.f51534k.setRotation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(View view) {
        l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(View view) {
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view) {
        X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K0(View view) {
        IntentUtil.getInstance().goLogin(view.getContext());
    }

    private void m0() {
        this.f51547x = false;
    }

    private void o0(String str) {
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        this.f51549z = clipboardManager;
        clipboardManager.setText(str.trim());
    }

    private String p0() {
        return com.wufan.friend.chat.c.u().m(Integer.parseInt(AccountUtil_.getInstance_(getContext()).getUid()));
    }

    private void q0(String str) throws Exception {
        PackageInfo packageInfo = getContext().getPackageManager().getPackageInfo(str, 0);
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        ResolveInfo next = getContext().getPackageManager().queryIntentActivities(intent, 0).iterator().next();
        if (next != null) {
            ActivityInfo activityInfo = next.activityInfo;
            String str2 = activityInfo.packageName;
            String str3 = activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addFlags(268435456);
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setComponent(new ComponentName(str2, str3));
            startActivity(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        Context context = getContext();
        if (IntentUtil.getInstance().goLogin(context)) {
            return;
        }
        if (this.f51548y == null) {
            Dialog dialog = new Dialog(context, R.style.newtrans_floating_dialog);
            this.f51548y = dialog;
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                this.f51548y.getWindow().setAttributes(attributes);
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_invite_battle1, (ViewGroup) null);
            this.A = inflate.findViewById(R.id.iv_close);
            this.B = (ImageView) inflate.findViewById(R.id.button);
            this.C = (ImageView) inflate.findViewById(R.id.button1);
            this.D = (TextView) inflate.findViewById(R.id.txt);
            this.f51548y.setContentView(inflate);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wdp622);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.wdp447);
            Window window = this.f51548y.getWindow();
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
            this.A.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendFragment.this.B0(view);
                }
            });
        }
        this.B.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendFragment.this.C0(view);
            }
        });
        this.C.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendFragment.this.D0(view);
            }
        });
        this.D.setText(p0());
        if (this.f51548y.isShowing()) {
            return;
        }
        this.f51548y.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void L0() {
        if (getActivity() instanceof FriendActivity) {
            ((FriendActivity) getActivity()).y0(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0() {
        Iterator<FriendBean> it2 = this.f51539p.o().iterator();
        while (it2.hasNext()) {
            if (it2.next().isRecommend()) {
                it2.remove();
            }
        }
        if (this.f51539p.p() != null && this.f51539p.p().size() != 0) {
            this.f51539p.o().addAll(this.f51539p.p());
        }
        this.f51539p.K();
        this.f51539p.notifyDataSetChanged();
    }

    public void N0(String str, List<GameInfoBean> list) {
        this.f51542s = str;
        this.f51543t.clear();
        if (list != null) {
            this.f51543t.addAll(list);
        }
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0(com.wufan.friend.chat.protocol.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f51539p.E(eVar.P());
        ArrayList arrayList = new ArrayList();
        for (com.wufan.friend.chat.protocol.r rVar : eVar.D1()) {
            FriendBean r02 = r0(rVar);
            r02.setState(0);
            arrayList.add(r02);
        }
        arrayList.addAll(this.f51539p.p());
        for (com.wufan.friend.chat.protocol.r rVar2 : eVar.T0()) {
            FriendBean r03 = r0(rVar2);
            r03.setState(1);
            arrayList.add(r03);
        }
        this.f51539p.o().clear();
        this.f51539p.o().addAll(arrayList);
        this.f51539p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0(com.wufan.friend.chat.protocol.g gVar) {
        FriendListAdapter friendListAdapter;
        if (gVar == null || (friendListAdapter = this.f51539p) == null) {
            return;
        }
        friendListAdapter.E(gVar.P());
        ArrayList arrayList = new ArrayList();
        for (com.wufan.friend.chat.protocol.r rVar : gVar.O0()) {
            FriendBean friendBean = new FriendBean();
            friendBean.setNickName(rVar.getAccount().getNickname());
            friendBean.setAvatar(rVar.getAccount().getAvatar());
            friendBean.setUid(rVar.getAccount().d());
            friendBean.setLevel(rVar.getAccount().i());
            friendBean.setVip(rVar.getAccount().getVip());
            friendBean.setBanned(rVar.getAccount().D());
            if (rVar.getState() != null) {
                friendBean.setGameId(rVar.getState().getGameId() + "");
                friendBean.setGameName(rVar.getState().getGameName());
                friendBean.setRoomId((int) rVar.getState().f());
                friendBean.setRoomType(rVar.getState().getRoomType());
                friendBean.setPlayType(rVar.getState().t0());
            }
            arrayList.add(friendBean);
        }
        this.f51539p.o().clear();
        if (arrayList.size() != 0) {
            this.f51539p.o().addAll(arrayList);
        }
        this.f51539p.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0(com.wufan.friend.chat.protocol.v vVar) {
        String str;
        int i4;
        int i5;
        if (vVar == null || vVar.g() == null) {
            return;
        }
        com.wufan.friend.chat.protocol.a g4 = vVar.g();
        FriendListAdapter friendListAdapter = this.f51539p;
        if (friendListAdapter != null) {
            Iterator<FriendBean> it2 = friendListAdapter.o().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FriendBean next = it2.next();
                if (next.getUid() == g4.d()) {
                    int i6 = 0;
                    String str2 = "";
                    if (vVar.getState() != null) {
                        str2 = vVar.getState().getGameId() + "";
                        str = vVar.getState().getGameName();
                        i6 = (int) vVar.getState().f();
                        i5 = vVar.getState().t0();
                        i4 = vVar.getState().getRoomType();
                    } else {
                        str = "";
                        i4 = 0;
                        i5 = 0;
                    }
                    next.setGameId(str2);
                    next.setGameName(str);
                    next.setRoomId(i6);
                    next.setPlayType(i5);
                    next.setRoomType(i4);
                }
            }
            this.f51539p.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0(com.wufan.friend.chat.protocol.x xVar) {
        if (xVar == null || xVar.g() == null) {
            return;
        }
        com.wufan.friend.chat.protocol.a g4 = xVar.g();
        String uid = AccountUtil_.getInstance_(getContext()).getUid();
        if (uid.equals(g4.d() + "")) {
            FriendAccountInfo friendAccountInfo = this.f51545v;
            if (friendAccountInfo != null) {
                friendAccountInfo.setOnLineStatus(xVar.getState().name());
                Z0(!"ONLINE".equals(this.f51545v.getOnLineStatus()) ? 1 : 0);
                return;
            }
            return;
        }
        FriendListAdapter friendListAdapter = this.f51539p;
        if (friendListAdapter != null) {
            FriendBean friendBean = null;
            Iterator<FriendBean> it2 = friendListAdapter.o().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FriendBean next = it2.next();
                if (next.getUid() == g4.d()) {
                    next.setNickName(g4.getNickname());
                    next.setAvatar(g4.getAvatar());
                    next.setUid(g4.d());
                    next.setLevel(g4.i());
                    next.setBanned(g4.D());
                    if (xVar.q() != null) {
                        next.setGameId(xVar.q().getGameId() + "");
                        next.setGameName(xVar.q().getGameName());
                        next.setRoomId((int) xVar.q().f());
                        next.setRoomType(xVar.q().getRoomType());
                        next.setPlayType(xVar.q().t0());
                    } else {
                        next.setGameId("");
                        next.setGameName("");
                        next.setRoomId(0);
                        next.setRoomType(0);
                        next.setPlayType(0);
                    }
                    next.setState(xVar.getStateValue());
                    friendBean = next;
                }
            }
            if (friendBean == null) {
                FriendBean friendBean2 = new FriendBean();
                friendBean2.setState(xVar.getStateValue());
                friendBean2.setNickName(g4.getNickname());
                friendBean2.setAvatar(g4.getAvatar());
                friendBean2.setUid(g4.d());
                friendBean2.setLevel(g4.i());
                friendBean2.setBanned(g4.D());
                if (xVar.q() != null) {
                    friendBean2.setGameId(xVar.q().getGameId() + "");
                    friendBean2.setGameName(xVar.q().getGameName());
                    friendBean2.setRoomId((int) xVar.q().f());
                    friendBean2.setRoomType(xVar.q().getRoomType());
                    friendBean2.setPlayType(xVar.q().t0());
                }
                this.f51539p.o().add(friendBean2);
                FriendListAdapter friendListAdapter2 = this.f51539p;
                friendListAdapter2.E(friendListAdapter2.n() + 1);
            }
            this.f51539p.K();
            this.f51539p.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void S0(l1 l1Var) {
        if (l1Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.wufan.friend.chat.protocol.j1 j1Var : l1Var.I1()) {
            FriendBean t02 = t0(j1Var);
            t02.setState(0);
            arrayList.add(t02);
        }
        updateUi(arrayList);
        if (getActivity() instanceof GameMainActivity4_) {
            ((GameMainActivity4_) getActivity()).b2(arrayList.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void T0() {
        if (this.f51536m == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.pop_friend_alive, (ViewGroup) null);
            this.f51536m = SmartPopupWindow.f.a((Activity) getContext(), inflate).e(true).b();
            inflate.findViewById(R.id.online).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendFragment.this.E0(view);
                }
            });
            inflate.findViewById(R.id.notDisturb).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendFragment.this.F0(view);
                }
            });
            this.f51536m.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.join.mgps.fragment.q0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    FriendFragment.this.G0();
                }
            });
            this.f51536m.setWidth(getResources().getDimensionPixelOffset(R.dimen.wdp350));
            this.f51536m.setHeight(getResources().getDimensionPixelOffset(R.dimen.wdp193));
        }
        this.f51534k.setRotation(180.0f);
        boolean isFocusable = this.f51536m.isFocusable();
        m0();
        this.f51536m.C(this.f51528e, 2, 0, getResources().getDimensionPixelOffset(R.dimen.wdp80), 0);
        k0(isFocusable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void U0() {
        T0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void V0() {
        ShareBean shareBean = new ShareBean();
        shareBean.setTitle("邀请你一起联机对战");
        shareBean.setText("畅玩海量免费经典游戏，体验超爽联机！");
        shareBean.setQqUrl("https://tuis.12345fun.com/?aid=7Fp12l");
        com.join.mgps.Util.s.p(getContext(), 2, shareBean);
        Ext ext = new Ext();
        ext.setPosition("0");
        com.papa.sim.statistic.p.l(getContext()).O1(Event.InviteFriends, ext);
    }

    public void W0() {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void X0() {
        if (getActivity() instanceof FriendActivity) {
            ((FriendActivity) getActivity()).u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y0(int i4) {
        TextView textView = this.f51529f;
        if (textView == null) {
            return;
        }
        if (i4 < 1) {
            textView.setVisibility(4);
            return;
        }
        textView.setVisibility(0);
        if (i4 < 100) {
            textView.setCompoundDrawables(null, null, null, null);
            textView.setBackgroundResource(R.drawable.mygame_big_round);
            textView.setPadding(1, 0, 0, 1);
        } else {
            textView.setCompoundDrawables(null, null, null, null);
            textView.setBackgroundResource(R.drawable.message_round);
            textView.setPadding(1, 0, 2, 1);
        }
        textView.setText(i4 + "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(int i4) {
        TextView textView = this.f51528e;
        if (textView == null) {
            return;
        }
        if (i4 == 0) {
            textView.setText("在线");
            this.f51528e.setSelected(true);
            this.f51528e.setTextColor(Color.parseColor("#FF16DB16"));
        } else if (i4 == 1) {
            textView.setText("勿扰");
            this.f51528e.setTextColor(Color.parseColor("#FFC4C4C4"));
            this.f51528e.setSelected(false);
        } else {
            textView.setText("离线");
            this.f51528e.setTextColor(Color.parseColor("#FFC4C4C4"));
            this.f51528e.setSelected(false);
        }
    }

    void a1(View view) {
        if (view == null) {
            return;
        }
        view.setSystemUiVisibility(5894);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        Context context = getContext();
        this.f51540q = com.join.mgps.rpc.impl.h.p();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        this.f51535l.setLayoutManager(linearLayoutManager);
        RecyclerView.ItemAnimator itemAnimator = this.f51535l.getItemAnimator();
        if (itemAnimator != null && (itemAnimator instanceof DefaultItemAnimator)) {
            ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        FriendListAdapter friendListAdapter = new FriendListAdapter(context);
        this.f51539p = friendListAdapter;
        this.f51535l.setAdapter(friendListAdapter);
        if (context instanceof FriendActivity) {
            this.f51539p.J((FriendActivity) context);
        }
        this.f51539p.registerAdapterDataObserver(new a());
        j0();
    }

    void b1(int i4) {
        String m4 = com.wufan.friend.chat.c.u().m(Integer.parseInt(AccountUtil_.getInstance_(getContext()).getUid()));
        if (i4 == 2) {
            ShareBean shareBean = new ShareBean();
            shareBean.setTitle("邀请你一起联机对战");
            shareBean.setText(m4);
            shareBean.setQqUrl("https://tuis.12345fun.com/?aid=7Fp12l");
            Ext ext = new Ext();
            ext.setPosition("0");
            com.papa.sim.statistic.p.l(getContext()).O1(Event.pasteInviteCode, ext);
        } else if (i4 == 0) {
            ShareBean shareBean2 = new ShareBean();
            shareBean2.setTitle("邀请你一起联机对战");
            shareBean2.setText(m4);
            shareBean2.setWechatShareUrl("https://tuis.12345fun.com/?aid=7Fp12l");
            com.join.mgps.Util.s.q(getContext(), 0, m4, 1, 0);
            Ext ext2 = new Ext();
            ext2.setPosition("1");
            com.papa.sim.statistic.p.l(getContext()).O1(Event.pasteInviteCode, ext2);
        }
        o0(m4);
        e1("已复制到粘贴板");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c1() {
        Context context = getContext();
        if (n0(context, "com.tencent.mobileqq")) {
            d1(context);
        } else {
            Toast.makeText(context, "本机未安装QQ应用", 0).show();
        }
    }

    void d1(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", p0());
        intent.setType(HttpPostBodyUtil.DEFAULT_TEXT_CONTENT_TYPE);
        try {
            intent.setClassName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity");
            Intent createChooser = Intent.createChooser(intent, "选择分享途径");
            if (createChooser == null) {
                return;
            }
            context.startActivity(createChooser);
        } catch (Exception unused) {
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e1(String str) {
        ToastManager.show(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f1() {
        if (IntentUtil.getInstance().isLogined(getContext()) && !IntentUtil.getInstance().isTourist(getContext())) {
            TextView textView = this.f51527d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = this.f51526c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f51528e;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            View view = this.f51534k;
            if (view != null) {
                view.setVisibility(0);
            }
            TextView textView4 = this.f51526c;
            if (textView4 != null) {
                textView4.setText(this.f51538o.getNickname());
            }
            if (this.f51530g != null) {
                if (com.join.mgps.Util.b.piv(this.f51538o)) {
                    this.f51530g.setVisibility(0);
                } else {
                    this.f51530g.setVisibility(8);
                }
            }
            SimpleDraweeView simpleDraweeView = this.f51525b;
            if (simpleDraweeView != null) {
                simpleDraweeView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.j0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FriendFragment.this.H0(view2);
                    }
                });
            }
            View view2 = this.f51531h;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        FriendFragment.this.I0(view3);
                    }
                });
            }
            View view3 = this.f51533j;
            if (view3 != null) {
                view3.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        FriendFragment.this.J0(view4);
                    }
                });
                return;
            }
            return;
        }
        TextView textView5 = this.f51527d;
        if (textView5 != null) {
            textView5.setVisibility(0);
        }
        TextView textView6 = this.f51526c;
        if (textView6 != null) {
            textView6.setVisibility(4);
        }
        TextView textView7 = this.f51528e;
        if (textView7 != null) {
            textView7.setVisibility(4);
        }
        View view4 = this.f51534k;
        if (view4 != null) {
            view4.setVisibility(4);
        }
        View view5 = this.f51530g;
        if (view5 != null) {
            view5.setVisibility(4);
        }
        p0 p0Var = new View.OnClickListener() { // from class: com.join.mgps.fragment.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                FriendFragment.K0(view6);
            }
        };
        TextView textView8 = this.f51527d;
        if (textView8 != null) {
            textView8.setOnClickListener(p0Var);
        }
        SimpleDraweeView simpleDraweeView2 = this.f51525b;
        if (simpleDraweeView2 != null) {
            simpleDraweeView2.setOnClickListener(p0Var);
        }
        View view6 = this.f51531h;
        if (view6 != null) {
            view6.setOnClickListener(p0Var);
        }
        View view7 = this.f51533j;
        if (view7 != null) {
            view7.setOnClickListener(p0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1(com.wufan.friend.chat.protocol.x xVar) {
        if (xVar == null) {
            return;
        }
        if (xVar.g().d() == AccountUtil_.getInstance_(getContext()).getAccountData().getUid()) {
            Z0(xVar.getStateValue());
            return;
        }
        FriendListAdapter friendListAdapter = this.f51539p;
        if (friendListAdapter != null) {
            for (FriendBean friendBean : friendListAdapter.o()) {
                if (friendBean.getUid() == xVar.g().d()) {
                    friendBean.setState(xVar.getStateValue());
                    this.f51539p.notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            FriendReqBean friendReqBean = new FriendReqBean();
            friendReqBean.setUid(accountData.getUid());
            friendReqBean.setToken(accountData.getToken());
            friendReqBean.setRuid(i4);
            friendReqBean.setRequestInfo("嘿，交个朋友，少年~(*^▽^*)");
            ResponseModel b5 = this.f51540q.b(friendReqBean);
            if (b5 != null) {
                if (b5.getError() == 0) {
                    i0(Boolean.TRUE);
                } else {
                    e1(b5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h1(FriendAccountInfo friendAccountInfo) {
        int i4;
        try {
            this.f51545v = friendAccountInfo;
            if (friendAccountInfo == null) {
                return;
            }
            com.wufan.friend.chat.c.u().S(this.f51545v);
            MyImageLoader.x(this.f51525b, this.f51545v.getAvatar());
            TextView textView = this.f51526c;
            if (textView != null) {
                textView.setText(this.f51545v.getNickname());
            }
            if ("OFFLINE".equals(this.f51545v.getOnLineStatus())) {
                i4 = 2;
            } else {
                i4 = (!"ONLINE".equals(this.f51545v.getOnLineStatus()) && "INVISIBLE".equals(this.f51545v.getOnLineStatus())) ? 1 : 0;
            }
            com.wufan.friend.chat.c.u().W(i4);
            Z0(i4);
            int requestFriendCount = this.f51545v.getRequestFriendCount() + this.f51545v.getLikedCount();
            if (requestFriendCount > 0) {
                TextView textView2 = this.f51529f;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                Y0(requestFriendCount);
            } else {
                TextView textView3 = this.f51529f;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            if (this.f51530g != null) {
                if (friendAccountInfo.isVip()) {
                    this.f51530g.setVisibility(0);
                } else {
                    this.f51530g.setVisibility(8);
                }
            }
            f1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(Boolean bool) {
        if (bool.booleanValue()) {
            e1("已发送申请");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i1() {
        try {
            if (this.f51545v == null) {
                return;
            }
            com.wufan.friend.chat.c.u().S(this.f51545v);
            MyImageLoader.x(this.f51525b, this.f51545v.getAvatar());
            TextView textView = this.f51526c;
            if (textView != null) {
                textView.setText(this.f51545v.getNickname());
            }
            Z0("ONLINE".equals(this.f51545v.getOnLineStatus()) ? 0 : 1);
            int requestFriendCount = this.f51545v.getRequestFriendCount() + this.f51545v.getLikedCount();
            if (requestFriendCount > 0) {
                TextView textView2 = this.f51529f;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                Y0(requestFriendCount);
            } else {
                TextView textView3 = this.f51529f;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            }
            if (this.f51530g != null) {
                if (this.f51545v.isVip()) {
                    this.f51530g.setVisibility(0);
                } else {
                    this.f51530g.setVisibility(8);
                }
            }
            f1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.action_login_success"})
    public void j0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
        this.f51538o = accountData;
        MyImageLoader.x(this.f51525b, accountData.d0());
        f1();
        w0();
        x0();
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j1() {
        ShareBean shareBean = new ShareBean();
        shareBean.setTitle("邀请你一起联机对战");
        shareBean.setText("畅玩海量免费经典游戏，体验超爽联机！");
        shareBean.setWechatShareUrl("https://tuis.12345fun.com/?aid=7Fp12l");
        com.join.mgps.Util.s.p(getContext(), 0, shareBean);
        Ext ext = new Ext();
        ext.setPosition("1");
        com.papa.sim.statistic.p.l(getContext()).O1(Event.InviteFriends, ext);
    }

    void k0(boolean z4) {
        z0(this.f51536m.getContentView());
        this.f51547x = z4;
        this.f51536m.update();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        if (getActivity() instanceof FriendActivity) {
            ((FriendActivity) getActivity()).K(AccountUtil_.getInstance_(getContext()).getUid());
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    public boolean n0(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 8192);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!org.greenrobot.eventbus.c.f().m(this)) {
            com.join.mgps.Util.d0.a().d(this);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f51541r = arguments.getString("gameId");
            this.f51542s = arguments.getString("gameSeries");
            this.f51544u = arguments.getString("type");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendEvent(com.join.mgps.event.q qVar) {
        FriendListAdapter friendListAdapter;
        if (qVar == null || qVar.a() != 10 || (friendListAdapter = this.f51539p) == null) {
            return;
        }
        friendListAdapter.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
    }

    FriendBean r0(com.wufan.friend.chat.protocol.r rVar) {
        FriendBean friendBean = new FriendBean();
        friendBean.setNickName(rVar.getAccount().getNickname());
        friendBean.setAvatar(rVar.getAccount().getAvatar());
        friendBean.setUid(rVar.getAccount().d());
        friendBean.setLevel(rVar.getAccount().i());
        friendBean.setVip(rVar.getAccount().getVip());
        friendBean.setBanned(rVar.getAccount().D());
        if (rVar.getState() != null) {
            friendBean.setGameId(rVar.getState().getGameId() + "");
            friendBean.setGameName(rVar.getState().getGameName());
            friendBean.setRoomId((int) rVar.getState().f());
            friendBean.setRoomType(rVar.getState().getRoomType());
            friendBean.setPlayType(rVar.getState().t0());
        }
        return friendBean;
    }

    FriendBean s0(com.wufan.friend.chat.protocol.t tVar) {
        FriendBean friendBean = new FriendBean();
        com.wufan.friend.chat.protocol.a g4 = tVar.g();
        friendBean.setNickName(g4.getNickname());
        friendBean.setAvatar(g4.getAvatar());
        friendBean.setUid(g4.d());
        friendBean.setLevel(g4.i());
        friendBean.setVip(g4.getVip());
        friendBean.setBanned(g4.D());
        friendBean.setState(tVar.U0().getNumber());
        com.wufan.friend.chat.protocol.d1 q4 = tVar.q();
        if (q4 != null) {
            friendBean.setGameId(q4.getGameId() + "");
            friendBean.setGameName(q4.getGameName());
            friendBean.setRoomId((int) q4.f());
            friendBean.setRoomType(q4.getRoomType());
            friendBean.setPlayType(q4.t0());
        }
        return friendBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        l2.a(getContext()).b(str);
    }

    FriendBean t0(com.wufan.friend.chat.protocol.j1 j1Var) {
        FriendBean friendBean = new FriendBean();
        friendBean.setRecommend(true);
        friendBean.setNickName(j1Var.getNickname());
        friendBean.setAvatar(j1Var.getAvatar());
        friendBean.setUid(j1Var.d());
        friendBean.setLevel(j1Var.i());
        friendBean.setBanned(j1Var.D());
        friendBean.setGameId(j1Var.getGameId() + "");
        friendBean.setGameName(j1Var.getGameName());
        return friendBean;
    }

    FriendBean u0(o1 o1Var) {
        FriendBean friendBean = new FriendBean();
        friendBean.setRecommend(true);
        com.wufan.friend.chat.protocol.a g4 = o1Var.g();
        friendBean.setNickName(g4.getNickname());
        friendBean.setAvatar(g4.getAvatar());
        friendBean.setUid(g4.d());
        friendBean.setLevel(g4.i());
        friendBean.setVip(g4.getVip());
        friendBean.setBanned(g4.D());
        friendBean.setState(o1Var.getState().getNumber());
        com.wufan.friend.chat.protocol.d1 q4 = o1Var.q();
        if (q4 != null) {
            friendBean.setGameId(q4.getGameId() + "");
            friendBean.setGameName(q4.getGameName());
            friendBean.setRoomId((int) q4.f());
            friendBean.setRoomType(q4.getRoomType());
            friendBean.setPlayType(q4.t0());
        }
        return friendBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<FriendBean> list) {
        if (this.f51539p == null) {
            return;
        }
        if (list != null && list.size() != 0) {
            for (FriendBean friendBean : list) {
                friendBean.setState(0);
                friendBean.setRecommend(true);
            }
            this.f51539p.p().clear();
            this.f51539p.p().addAll(list);
            Iterator<FriendBean> it2 = this.f51539p.o().iterator();
            while (it2.hasNext()) {
                if (it2.next().isRecommend()) {
                    it2.remove();
                }
            }
            this.f51539p.o().addAll(list);
            this.f51539p.K();
            this.f51539p.notifyDataSetChanged();
            return;
        }
        this.f51539p.p().clear();
        M0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = me.relex.photodraweeview.d.f71604s1)
    public void v0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            com.join.mgps.rpc.j jVar = this.f51540q;
            ResponseModel<FriendAccountInfo> f5 = jVar.f(accountData.getUid() + "", accountData.getToken());
            if (f5 != null) {
                if (f5.getError() == 0 && f5.getData() != null) {
                    h1(f5.getData());
                } else {
                    e1(f5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = TwistView.DELAY_TIME_TWIST)
    public void w0() {
        if (!this.f51537n.F()) {
            this.f51537n.L(this.f51538o.getUid(), this.f51538o.getToken());
        } else {
            this.f51537n.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:1|2|3|(1:11)|12|(2:15|13)|16|17|(8:22|(1:24)(2:37|(1:39)(2:40|(1:42)))|25|26|27|(1:29)|31|33)|43|25|26|27|(0)|31|33) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[Catch: NumberFormatException -> 0x00a2, Exception -> 0x00af, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x00a2, blocks: (B:32:0x0093, B:34:0x009b), top: B:45:0x0093, outer: #0 }] */
    @org.androidannotations.annotations.Background(delay = me.relex.photodraweeview.d.f71604s1)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x0() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "BATTLE_ROOM_LIST"
            if (r0 != 0) goto L2e
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0 instanceof com.join.mgps.activity.arena.GameRoomListActivity     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L2e
            java.lang.String r0 = r8.f51542s     // Catch: java.lang.Exception -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentActivity r0 = r8.getActivity()     // Catch: java.lang.Exception -> Laf
            com.join.mgps.activity.arena.GameRoomListActivity r0 = (com.join.mgps.activity.arena.GameRoomListActivity) r0     // Catch: java.lang.Exception -> Laf
            java.lang.String r0 = r0.i2()     // Catch: java.lang.Exception -> Laf
            r8.f51542s = r0     // Catch: java.lang.Exception -> Laf
        L2e:
            p1.f r0 = p1.f.K()     // Catch: java.lang.Exception -> Laf
            java.util.List r0 = r0.u()     // Catch: java.lang.Exception -> Laf
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> Laf
            r6.<init>()     // Catch: java.lang.Exception -> Laf
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Laf
        L3f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> Laf
            if (r2 == 0) goto L57
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> Laf
            com.github.snowdream.android.app.downloader.DownloadTask r2 = (com.github.snowdream.android.app.downloader.DownloadTask) r2     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = r2.getCrc_link_type_val()     // Catch: java.lang.Exception -> Laf
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Laf
            r6.add(r2)     // Catch: java.lang.Exception -> Laf
            goto L3f
        L57:
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Laf
            r2 = 0
            if (r0 != 0) goto L90
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            java.lang.String r3 = "BATTLE_HOME_PAGE"
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L6b
            goto L90
        L6b:
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L76
            r0 = 1
            r7 = 1
            goto L91
        L76:
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "BATTLE_ROOM"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L83
            r0 = 2
            r7 = 2
            goto L91
        L83:
            java.lang.String r0 = r8.f51544u     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "GAME_HOME_PAGE"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L90
            r0 = 3
            r7 = 3
            goto L91
        L90:
            r7 = 0
        L91:
            r0 = 0
            java.lang.String r2 = r8.f51541r     // Catch: java.lang.NumberFormatException -> La2 java.lang.Exception -> Laf
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.NumberFormatException -> La2 java.lang.Exception -> Laf
            if (r2 != 0) goto La6
            java.lang.String r2 = r8.f51541r     // Catch: java.lang.NumberFormatException -> La2 java.lang.Exception -> Laf
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> La2 java.lang.Exception -> Laf
            goto La6
        La2:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Exception -> Laf
        La6:
            r3 = r0
            com.wufan.friend.chat.c r2 = r8.f51537n     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = r8.f51542s     // Catch: java.lang.Exception -> Laf
            r2.y(r3, r5, r6, r7)     // Catch: java.lang.Exception -> Laf
            goto Lb3
        Laf:
            r0 = move-exception
            r0.printStackTrace()
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.FriendFragment.x0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = me.relex.photodraweeview.d.f71604s1)
    public void y0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            if (!TextUtils.isEmpty(this.f51544u) && this.f51544u.equals("BATTLE_ROOM_LIST") && (getActivity() instanceof GameRoomListActivity)) {
                if (TextUtils.isEmpty(this.f51542s)) {
                    this.f51542s = ((GameRoomListActivity) getActivity()).i2();
                }
                if (((GameRoomListActivity) getActivity()).j2() != null && ((GameRoomListActivity) getActivity()).j2().size() > 0) {
                    this.f51543t.clear();
                    this.f51543t.addAll(((GameRoomListActivity) getActivity()).j2());
                }
                if (TextUtils.isEmpty(this.f51542s)) {
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            List<GameInfoBean> list = this.f51543t;
            if (list != null && list.size() > 0) {
                for (GameInfoBean gameInfoBean : this.f51543t) {
                    DownloadTask F = p1.f.K().F(gameInfoBean.getGame_id());
                    if (F != null) {
                        arrayList.add(F.getCrc_link_type_val());
                    }
                }
            }
            FriendRecommendRequest friendRecommendRequest = new FriendRecommendRequest();
            friendRecommendRequest.setUid(accountData.getUid());
            friendRecommendRequest.setToken(accountData.getToken());
            friendRecommendRequest.setPage(1);
            friendRecommendRequest.setGameId(this.f51541r);
            friendRecommendRequest.setGameSeries(this.f51542s);
            friendRecommendRequest.setLocationPageType(this.f51544u);
            friendRecommendRequest.setLocalDownloadGameIds(arrayList);
            ResponseModel<List<FriendBean>> d5 = this.f51540q.d(friendRecommendRequest);
            if (d5 != null) {
                if (d5.getError() == 0 && d5.getData() != null) {
                    updateUi(d5.getData());
                } else {
                    e1(d5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void z0(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            a1(view);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendEvent(w1 w1Var) {
        if (w1Var == null) {
            return;
        }
        if (w1Var.C() == 1) {
            if (w1Var.I() == 1) {
                if (w1Var.getData() != null && w1Var.getData().z2() != null && w1Var.getData().z2().D0()) {
                    Z0(0);
                    com.wufan.friend.chat.c.u().T(true);
                    com.wufan.friend.chat.c.u().U(0);
                    this.f51537n.t();
                    this.f51546w = 1;
                } else if (this.f51546w > 0) {
                    v0();
                    this.f51546w--;
                }
                if (IntentUtil.getInstance().isLogined(getContext())) {
                    x0();
                }
            } else if (w1Var.I() == 5 && w1Var.getData() != null && w1Var.getData().getNotification() != null && w1Var.getData().getNotification().m2() != null) {
                g1(w1Var.getData().getNotification().m2());
            }
        }
        if (w1Var.C() == 4 && (w1Var.I() == 11 || w1Var.I() == 12)) {
            S0(w1Var.getData().F1());
        }
        if (w1Var.getData() == null || w1Var.getData().getNotification() == null) {
            return;
        }
        com.wufan.friend.chat.protocol.y0 notification = w1Var.getData().getNotification();
        if (w1Var.B1() == 3) {
            Q0(notification.L0());
        } else if (w1Var.B1() == 2) {
            R0(notification.m2());
        } else if (w1Var.B1() == 11) {
            if (notification.Z1() != null) {
                O0(notification.Z1());
            }
        } else if (w1Var.B1() == 7) {
            if (notification.w1() == null || this.f51545v == null) {
                return;
            }
            int count = notification.w1().getCount();
            if (notification.w1().getTypeValue() == 0) {
                FriendAccountInfo friendAccountInfo = this.f51545v;
                friendAccountInfo.setRequestFriendCount(friendAccountInfo.getRequestFriendCount() + count >= 0 ? this.f51545v.getRequestFriendCount() + count : 0);
            } else if (notification.w1().getTypeValue() == 1) {
                FriendAccountInfo friendAccountInfo2 = this.f51545v;
                friendAccountInfo2.setLikedCount(friendAccountInfo2.getLikedCount() + count >= 0 ? this.f51545v.getLikedCount() + count : 0);
            }
            i1();
        } else if (w1Var.B1() == 9) {
            if (notification.d1() != null) {
                com.wufan.friend.chat.protocol.t d12 = notification.d1();
                if (d12.U0().getNumber() == 0) {
                    FriendBean s02 = s0(d12);
                    FriendListAdapter friendListAdapter = this.f51539p;
                    friendListAdapter.E(friendListAdapter.n() + 1);
                    this.f51539p.o().add(s02);
                    this.f51539p.K();
                    this.f51539p.notifyDataSetChanged();
                }
            }
        } else if (w1Var.B1() == 12) {
            if (notification.r1() != null) {
                o1 r12 = notification.r1();
                List<FriendBean> p4 = this.f51539p.p();
                Iterator<FriendBean> it2 = p4.iterator();
                while (it2.hasNext()) {
                    FriendBean next = it2.next();
                    if (next.getUid() == r12.g().d()) {
                        if (r12.q() != null && r12.q().getGameId() != 0) {
                            com.wufan.friend.chat.protocol.d1 q4 = r12.q();
                            next.setGameId(q4.getGameId() + "");
                            next.setGameName(q4.getGameName());
                            next.setRoomId((int) q4.f());
                            next.setRoomType(q4.getRoomType());
                            next.setPlayType(q4.t0());
                        } else {
                            it2.remove();
                        }
                    }
                }
                M0();
                if (p4.size() == 0) {
                    x0();
                }
            }
        } else if (w1Var.B1() == 13) {
            if (notification.g2() == null || this.f51539p == null) {
                return;
            }
            com.wufan.friend.chat.protocol.z g22 = notification.g2();
            Iterator<FriendBean> it3 = this.f51539p.o().iterator();
            while (it3.hasNext()) {
                FriendBean next2 = it3.next();
                if (!next2.isRecommend() && next2.getUid() == g22.H()) {
                    it3.remove();
                }
            }
            this.f51539p.notifyDataSetChanged();
        } else if (w1Var.B1() == 14 && notification.P0() != null && notification.P0().S2() != null) {
            com.wufan.friend.chat.protocol.a S2 = notification.P0().S2();
            FriendListAdapter friendListAdapter2 = this.f51539p;
            if (friendListAdapter2 != null) {
                for (FriendBean friendBean : friendListAdapter2.o()) {
                    if (friendBean.getUid() == S2.d()) {
                        friendBean.setBanned(S2.D());
                    }
                }
                this.f51539p.notifyDataSetChanged();
            }
            FriendAccountInfo friendAccountInfo3 = this.f51545v;
            if (friendAccountInfo3 == null || friendAccountInfo3.getAccountId() != S2.d()) {
                return;
            }
            this.f51545v.setBanned(S2.D());
            i1();
        }
    }
}
