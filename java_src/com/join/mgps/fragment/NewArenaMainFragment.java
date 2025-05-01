package com.join.mgps.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaLobbyServer;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.arena.ArenaGameListActivity_;
import com.join.mgps.activity.arena.ArenaGameListFragmentMain_;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity_;
import com.join.mgps.activity.arena.NewArenaDownloadActivity_;
import com.join.mgps.adapter.GameInfoAdapterV2;
import com.join.mgps.customview.AutoScrollViewPager;
import com.join.mgps.customview.input.InputNumView;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.n0;
import com.join.mgps.dto.ArenaAdData;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.CollectionCommentRequest;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameListBannerBean;
import com.join.mgps.dto.ResultArenaBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.RoomCategory;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EFragment(R.layout.fragment_new_arenamain)
/* loaded from: classes3.dex */
public class NewArenaMainFragment extends Fragment {
    private static final int A1 = 4112;

    /* renamed from: v1  reason: collision with root package name */
    private static final String f52414v1 = "NewArenaMainFragment";
    TextView A;
    private com.join.mgps.dialog.d1 B;
    private com.join.mgps.socket.fight.arena.a D;
    private GameRoom E;
    private com.join.mgps.dialog.b1 F;
    FragmentManager G;
    ArenaGameListFragmentMain_ H;
    ArenaGameListFragment_ I;
    ArenaGameListFragment_ J;
    View K;
    View L;
    View M;
    View N;
    TextView O;
    TextView P;
    TextView Q;
    TextView R;
    private FragmentManager T;
    private ResultResMainBean<GameListBannerBean> U;
    private GameInfoAdapterV2 Z;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.rpc.l f52416c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.l f52417d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f52418e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f52419f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f52420g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f52421h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    XRecyclerView f52422i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    View f52423j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f52424k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    FrameLayout f52425l;

    /* renamed from: m  reason: collision with root package name */
    AutoScrollViewPager<BannerBean> f52426m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f52427n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f52428o;
    @Bean

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.Util.b f52429p;

    /* renamed from: q  reason: collision with root package name */
    private com.join.mgps.socket.fight.arena.b f52432q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f52433r;

    /* renamed from: s  reason: collision with root package name */
    private String f52434s;

    /* renamed from: t  reason: collision with root package name */
    TextView f52435t;

    /* renamed from: u  reason: collision with root package name */
    TextView f52436u;

    /* renamed from: v  reason: collision with root package name */
    TextView f52437v;

    /* renamed from: w  reason: collision with root package name */
    RelativeLayout f52438w;

    /* renamed from: x  reason: collision with root package name */
    TextView f52439x;

    /* renamed from: y  reason: collision with root package name */
    TextView f52440y;

    /* renamed from: z  reason: collision with root package name */
    TextView f52441z;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52415b = false;
    private final SocketListener.NotifyObserver C = new i();
    int S = 0;
    int V = 20;
    private List<BannerBean> W = new ArrayList();
    private List<Dialog> X = new ArrayList();
    private List<GameInfoBean> Y = new ArrayList();

    /* renamed from: p0  reason: collision with root package name */
    boolean f52430p0 = false;

    /* renamed from: p1  reason: collision with root package name */
    boolean f52431p1 = false;

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FragmentTransaction beginTransaction = NewArenaMainFragment.this.G.beginTransaction();
            NewArenaMainFragment.this.D0(3, beginTransaction);
            NewArenaMainFragment newArenaMainFragment = NewArenaMainFragment.this;
            ArenaGameListFragment_ arenaGameListFragment_ = newArenaMainFragment.I;
            if (arenaGameListFragment_ == null) {
                newArenaMainFragment.I = new ArenaGameListFragment_();
                Bundle bundle = new Bundle();
                bundle.putInt("room_type", 31);
                bundle.putInt("game_type", 1);
                bundle.putInt("pn", 1);
                NewArenaMainFragment.this.I.setArguments(bundle);
                beginTransaction.add(R.id.fragmentLayout, NewArenaMainFragment.this.I);
            } else {
                beginTransaction.show(arenaGameListFragment_);
            }
            beginTransaction.commitAllowingStateLoss();
            NewArenaMainFragment.this.S = 3;
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FragmentTransaction beginTransaction = NewArenaMainFragment.this.G.beginTransaction();
            NewArenaMainFragment.this.D0(4, beginTransaction);
            NewArenaMainFragment newArenaMainFragment = NewArenaMainFragment.this;
            ArenaGameListFragment_ arenaGameListFragment_ = newArenaMainFragment.J;
            if (arenaGameListFragment_ == null) {
                newArenaMainFragment.J = new ArenaGameListFragment_();
                Bundle bundle = new Bundle();
                bundle.putInt("room_type", 35);
                bundle.putInt("game_type", 1);
                bundle.putInt("pn", 1);
                NewArenaMainFragment.this.J.setArguments(bundle);
                beginTransaction.add(R.id.fragmentLayout, NewArenaMainFragment.this.J);
            } else {
                beginTransaction.show(arenaGameListFragment_);
            }
            beginTransaction.commitAllowingStateLoss();
            NewArenaMainFragment.this.S = 4;
        }
    }

    /* loaded from: classes3.dex */
    class c implements XRecyclerView.f {
        c() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onLoadMore() {
        }

        @Override // com.join.android.app.component.xrecyclerview.XRecyclerView.f
        public void onRefresh() {
            NewArenaMainFragment.this.G0();
        }
    }

    /* loaded from: classes3.dex */
    class d implements GameInfoAdapterV2.e {
        d() {
        }

        @Override // com.join.mgps.adapter.GameInfoAdapterV2.e
        public void a(int i4) {
            if (NewArenaMainFragment.this.B != null && NewArenaMainFragment.this.B.isShowing()) {
                NewArenaMainFragment.this.B.dismiss();
            }
            if (i4 == 0) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54062l + "/static/match_v2/index.html");
                intentDateBean.setFrom("11");
                IntentUtil.getInstance().intentActivity(NewArenaMainFragment.this.getActivity(), intentDateBean);
                return;
            }
            NewArenaMainFragment.this.n0();
            if (i4 < NewArenaMainFragment.this.Y.size()) {
                GameInfoBean gameInfoBean = (GameInfoBean) NewArenaMainFragment.this.Y.get(i4);
                GameRoomListActivity_.W3(NewArenaMainFragment.this.f52433r).c(gameInfoBean).b(true).start();
                com.papa.sim.statistic.p.l(NewArenaMainFragment.this.getContext()).y(AccountUtil_.getInstance_(NewArenaMainFragment.this.getContext()).getUid(), gameInfoBean.getCollection_id(), "hall");
                com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(NewArenaMainFragment.this.getContext());
                String uid = AccountUtil_.getInstance_(NewArenaMainFragment.this.getContext()).getUid();
                String collection_id = gameInfoBean.getCollection_id();
                l4.A(uid, collection_id, i4 + "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Callback<ResultMainBean<ArenaAdData>> {
        e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<ArenaAdData>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<ArenaAdData>> call, Response<ResultMainBean<ArenaAdData>> response) {
            View view;
            if (response == null || response.body() == null) {
                return;
            }
            ResultMainBean<ArenaAdData> body = response.body();
            if (body.getCode() == 600 && body.getMessages().getData().isL_has_not_read() && (view = NewArenaMainFragment.this.f52428o) != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends com.facebook.drawee.controller.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f52447b;

        f(int i4) {
            this.f52447b = i4;
        }

        @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
        public void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            NewArenaMainFragment.this.t0(this.f52447b - 1);
        }

        @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            super.onFinalImageSet(str, obj, animatable);
            NewArenaMainFragment.this.M0(this.f52447b);
            NewArenaMainFragment.this.t0(this.f52447b - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements n0.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f52449a;

        g(int i4) {
            this.f52449a = i4;
        }

        @Override // com.join.mgps.dialog.n0.c
        public void a(com.join.mgps.dialog.n0 n0Var) {
            n0Var.dismiss();
            if (NewArenaMainFragment.this.X.size() > 0) {
                NewArenaMainFragment.this.X.remove(0);
            }
        }

        @Override // com.join.mgps.dialog.n0.c
        public void b(com.join.mgps.dialog.n0 n0Var) {
            n0Var.dismiss();
            new IntentDateBean();
            if (NewArenaMainFragment.this.W != null && NewArenaMainFragment.this.W.size() > 0) {
                IntentUtil.getInstance().intentActivity(NewArenaMainFragment.this.f52433r, ((BannerBean) NewArenaMainFragment.this.W.get(this.f52449a)).getIntentDataBean());
                com.papa.sim.statistic.p.l(NewArenaMainFragment.this.getActivity()).n2(AccountUtil_.getInstance_(NewArenaMainFragment.this.getActivity()).getUid(), "vsButton");
            }
            if (NewArenaMainFragment.this.X.size() > 0) {
                NewArenaMainFragment.this.X.remove(0);
                NewArenaMainFragment.this.W.remove(0);
            }
            if (this.f52449a < NewArenaMainFragment.this.W.size() - 1 || NewArenaMainFragment.this.X == null) {
                return;
            }
            NewArenaMainFragment.this.X.clear();
            LinearLayout linearLayout = NewArenaMainFragment.this.f52421h;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f52451a;

        h(com.join.mgps.customview.input.a aVar) {
            this.f52451a = aVar;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f52451a.c();
            if (NewArenaMainFragment.this.f52432q == null) {
                return;
            }
            NewArenaMainFragment.this.f52432q.d().z(NewArenaMainFragment.this.C);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NewArenaMainFragment.this.f52434s = str;
            if (com.join.android.app.common.utils.j.j(NewArenaMainFragment.this.f52433r)) {
                NewArenaMainFragment.this.Q0("正在获取房间...");
                if (!NewArenaMainFragment.this.f52432q.d().s()) {
                    NewArenaMainFragment.this.f52432q.f(ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_ARENAMAIN));
                    return;
                } else {
                    NewArenaMainFragment.this.s0(str);
                    return;
                }
            }
            NewArenaMainFragment.this.showToast("当前网络不可用，请检查网络!");
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f52451a.c();
        }
    }

    /* loaded from: classes3.dex */
    class i implements SocketListener.NotifyObserver {
        i() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            if (NewArenaMainFragment.this.f52433r == null) {
                return;
            }
            NewArenaMainFragment.this.q0();
            int i4 = socketError.errorType;
            if (i4 != 6 && i4 != 3 && i4 != 4) {
                NewArenaMainFragment.this.showToast("网络异常，请稍后重试!");
                return;
            }
            NewArenaMainFragment.this.showToast(socketError.errorInfo);
            NewArenaMainFragment.this.R0();
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            ArenaRequest arenaRequest;
            if (NewArenaMainFragment.this.f52433r == null || (arenaRequest = arenaResponse.request) == null) {
                return;
            }
            String str = arenaRequest.register_type;
            if (str == ArenaConstants.REGISTER_TYPE_ARENAMAIN || str == ArenaConstants.REGISTER_TYPE_PUBLIC) {
                if (arenaResponse.responseCode == 0) {
                    NewArenaMainFragment.this.A0(arenaResponse);
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                    if (TextUtils.isEmpty(NewArenaMainFragment.this.f52434s)) {
                        return;
                    }
                    NewArenaMainFragment newArenaMainFragment = NewArenaMainFragment.this;
                    newArenaMainFragment.s0(newArenaMainFragment.f52434s);
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SEARCH_ROOM_BY_ID)) {
                    NewArenaMainFragment.this.B0((GameRoom) arenaResponse.data);
                } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                    NewArenaMainFragment.this.n0();
                    GameRoom gameRoom = (GameRoom) arenaResponse.data;
                    if (NewArenaMainFragment.this.f52432q == null) {
                        return;
                    }
                    NewArenaMainFragment.this.f52432q.d().E(null);
                    p1.f K = p1.f.K();
                    DownloadTask F = K.F("" + gameRoom.getGameId());
                    int i4 = 0;
                    if (gameRoom.getRoomCategory() == RoomCategory.LIVE) {
                        i4 = 2;
                    } else if (gameRoom.getRoomCategory() == RoomCategory.TOURNAMENT) {
                        i4 = 1;
                    }
                    GameRoomActivity_.V2(NewArenaMainFragment.this.f52433r).l(i4).h(arenaResponse.joinSpectatorReason).d(F.getShowName()).i(gameRoom).b(NewArenaMainFragment.this.V).start();
                    NewArenaMainFragment.this.q0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f52454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f52455b;

        j(com.join.mgps.customview.input.a aVar, GameRoom gameRoom) {
            this.f52454a = aVar;
            this.f52455b = gameRoom;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f52454a.c();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            NewArenaMainFragment.this.Q0("正在获取房间...");
            NewArenaMainFragment.this.r0(this.f52455b, str);
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f52454a.c();
        }
    }

    /* loaded from: classes3.dex */
    class k extends b.c {
        k() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
        }
    }

    /* loaded from: classes3.dex */
    class l extends a.b0 {
        l() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
            super.W(i4, i5, obj);
            if (i4 == 101) {
                if (i5 == 7) {
                    NewArenaMainFragment newArenaMainFragment = NewArenaMainFragment.this;
                    newArenaMainFragment.P0(newArenaMainFragment.E);
                } else if (i5 != 8) {
                } else {
                    NewArenaMainFragment.this.O0();
                }
            }
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void q() {
            super.q();
            NewArenaMainFragment.this.f52433r.finish();
        }
    }

    /* loaded from: classes3.dex */
    class m implements View.OnApplyWindowInsetsListener {
        m() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (com.join.mgps.Util.h1.b(NewArenaMainFragment.this.getActivity())) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) NewArenaMainFragment.this.f52427n.getLayoutParams();
                layoutParams.leftMargin = (int) NewArenaMainFragment.this.x0();
                NewArenaMainFragment.this.f52427n.setLayoutParams(layoutParams);
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    /* loaded from: classes3.dex */
    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(com.join.mgps.rpc.h.f54062l + "/static/match/index.html");
            intentDateBean.setFrom("11");
            IntentUtil.getInstance().intentActivity(NewArenaMainFragment.this.getActivity(), intentDateBean);
        }
    }

    /* loaded from: classes3.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewArenaMainFragment.this.D0(1, null);
            NewArenaMainFragment.this.f52427n.setVisibility(0);
            NewArenaMainFragment.this.S = 1;
        }
    }

    /* loaded from: classes3.dex */
    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!NewArenaMainFragment.this.T0()) {
                NewArenaMainFragment.this.R0();
                return;
            }
            FragmentTransaction beginTransaction = NewArenaMainFragment.this.G.beginTransaction();
            NewArenaMainFragment.this.D0(2, beginTransaction);
            NewArenaMainFragment newArenaMainFragment = NewArenaMainFragment.this;
            ArenaGameListFragmentMain_ arenaGameListFragmentMain_ = newArenaMainFragment.H;
            if (arenaGameListFragmentMain_ == null) {
                newArenaMainFragment.H = new ArenaGameListFragmentMain_();
                Bundle bundle = new Bundle();
                bundle.putInt(ArenaGameListActivity_.B, 1);
                NewArenaMainFragment.this.H.setArguments(bundle);
                beginTransaction.add(R.id.fragmentLayout, NewArenaMainFragment.this.H);
            } else {
                beginTransaction.show(arenaGameListFragmentMain_);
            }
            beginTransaction.commitAllowingStateLoss();
            NewArenaMainFragment.this.S = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(int i4, FragmentTransaction fragmentTransaction) {
        this.O.setTextColor(Color.parseColor("#7B95A4"));
        this.P.setTextColor(Color.parseColor("#7B95A4"));
        this.Q.setTextColor(Color.parseColor("#7B95A4"));
        this.R.setTextColor(Color.parseColor("#7B95A4"));
        this.O.getPaint().setFakeBoldText(false);
        this.P.getPaint().setFakeBoldText(false);
        this.Q.getPaint().setFakeBoldText(false);
        this.R.getPaint().setFakeBoldText(false);
        if (i4 == 1) {
            this.f52425l.setVisibility(8);
            this.K.setVisibility(0);
            this.L.setVisibility(4);
            this.M.setVisibility(4);
            this.N.setVisibility(4);
            this.O.setTextColor(Color.parseColor("#FFC438"));
            this.O.getPaint().setFakeBoldText(true);
        } else if (i4 == 2) {
            this.K.setVisibility(4);
            this.L.setVisibility(0);
            this.M.setVisibility(4);
            this.N.setVisibility(4);
            this.f52425l.setVisibility(0);
            this.f52427n.setVisibility(4);
            ArenaGameListFragment_ arenaGameListFragment_ = this.I;
            if (arenaGameListFragment_ != null) {
                fragmentTransaction.hide(arenaGameListFragment_);
            }
            ArenaGameListFragment_ arenaGameListFragment_2 = this.J;
            if (arenaGameListFragment_2 != null) {
                fragmentTransaction.hide(arenaGameListFragment_2);
            }
            this.P.setTextColor(Color.parseColor("#FFC438"));
            this.P.getPaint().setFakeBoldText(true);
        } else if (i4 == 3) {
            this.K.setVisibility(4);
            this.L.setVisibility(4);
            this.M.setVisibility(0);
            this.N.setVisibility(4);
            this.f52427n.setVisibility(8);
            this.f52425l.setVisibility(0);
            ArenaGameListFragmentMain_ arenaGameListFragmentMain_ = this.H;
            if (arenaGameListFragmentMain_ != null) {
                fragmentTransaction.hide(arenaGameListFragmentMain_);
            }
            ArenaGameListFragment_ arenaGameListFragment_3 = this.J;
            if (arenaGameListFragment_3 != null) {
                fragmentTransaction.hide(arenaGameListFragment_3);
            }
            this.Q.setTextColor(Color.parseColor("#FFC438"));
            this.Q.getPaint().setFakeBoldText(true);
        } else if (i4 != 4) {
        } else {
            this.K.setVisibility(4);
            this.L.setVisibility(4);
            this.M.setVisibility(4);
            this.N.setVisibility(0);
            this.f52427n.setVisibility(8);
            this.f52425l.setVisibility(0);
            ArenaGameListFragment_ arenaGameListFragment_4 = this.I;
            if (arenaGameListFragment_4 != null) {
                fragmentTransaction.hide(arenaGameListFragment_4);
            }
            ArenaGameListFragmentMain_ arenaGameListFragmentMain_2 = this.H;
            if (arenaGameListFragmentMain_2 != null) {
                fragmentTransaction.hide(arenaGameListFragmentMain_2);
            }
            this.R.setTextColor(Color.parseColor("#FFC438"));
            this.R.getPaint().setFakeBoldText(true);
        }
    }

    private boolean E0(String str) {
        try {
            this.f52433r.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(int i4) {
        com.join.mgps.Util.b0.f0(getActivity()).Q(getActivity(), this.W.get(i4).getTitle(), this.W.get(i4).getPic_remote(), new g(i4));
    }

    private void N0(GameRoom gameRoom) {
        com.join.mgps.dialog.b1 b1Var = this.F;
        if (b1Var != null) {
            b1Var.a();
        }
        com.join.mgps.dialog.b1 b1Var2 = new com.join.mgps.dialog.b1(this.f52433r);
        this.F = b1Var2;
        b1Var2.d("加入失败，您与" + gameRoom.getRoomId() + "房间不在同一战区\n请进入该游戏房间列表，并切换至【" + com.join.mgps.socket.fight.arena.c.d(gameRoom.getBattleArea()) + "】后再查找房间号进入");
        this.F.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this.f52433r, "请输入房间号", 5, false);
        aVar.g(new h(aVar));
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(String str) {
        com.join.mgps.dialog.d1 d1Var = this.B;
        if (d1Var != null && d1Var.isShowing()) {
            this.B.dismiss();
        }
        com.join.mgps.dialog.d1 z4 = com.join.mgps.Util.b0.f0(this.f52433r).z(this.f52433r, str, false);
        this.B = z4;
        z4.b();
    }

    private void S0(int i4) {
        Intent intent = new Intent(this.f52433r, NewArenaDownloadActivity_.class);
        intent.putExtra("gameId", "" + this.E.getGameId());
        intent.putExtra(NewArenaDownloadActivity_.P, this.f52431p1);
        intent.putExtra(NewArenaDownloadActivity_.Q, this.f52430p0);
        startActivityForResult(intent, i4);
    }

    private com.wufan.user.service.protobuf.n0 l0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private boolean o0(String str) {
        this.f52430p0 = false;
        this.f52431p1 = false;
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 5) {
            this.f52430p0 = true;
            EMUApkTable n4 = b2.p.o().n(F.getPlugin_num());
            if (n4 != null) {
                if (com.join.android.app.common.utils.l.t(this.f52433r, n4, false, new String[0]) && !UtilsMy.B0(this.f52433r, n4)) {
                    this.f52431p1 = true;
                } else {
                    this.f52431p1 = false;
                }
            } else {
                this.f52431p1 = true;
            }
        } else {
            this.f52430p0 = false;
        }
        return this.f52431p1 && this.f52430p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(int i4) {
        if (i4 < 0) {
            return;
        }
        SimpleDraweeView v02 = v0();
        v02.setController(Fresco.newDraweeControllerBuilder().H(new f(i4)).setUri(this.W.get(i4).getPic_remote()).build());
        this.f52421h.addView(v02);
    }

    private SimpleDraweeView v0() {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this.f52433r);
        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
        return simpleDraweeView;
    }

    private SimpleDraweeView w0(List<BannerBean> list, int i4) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(this.f52433r);
        simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(12.0f);
        MyImageLoader.f(simpleDraweeView, R.drawable.iv_default_newarena_banner, list.get(i4).getPic_remote(), roundingParams);
        return simpleDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0(ArenaResponse arenaResponse) {
        com.join.mgps.dialog.d1 d1Var = this.B;
        if (d1Var != null && d1Var.isShowing()) {
            this.B.dismiss();
        }
        int i4 = arenaResponse.errorType;
        if (i4 == 7) {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, 256, Integer.valueOf(arenaResponse.errorType), "密码输入错误，请重试", "取消", "重试", null);
        } else if (i4 == 8) {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, 256, Integer.valueOf(arenaResponse.errorType), "房间号输入错误，请重试", "取消", "重试", null);
        } else if (i4 == 9) {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已满，无法加入!", "确定");
        } else if (i4 == 13) {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法加入房间", "确定");
        } else if (i4 == 1001) {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, Integer.valueOf((int) com.join.mgps.socket.fight.arena.a.f54751i), Integer.valueOf(arenaResponse.errorType), arenaResponse.errorInfo, "确定");
        } else if (i4 == 16) {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "无法加入，你被禁止加入该房间", "确定");
        } else if (i4 != 17) {
            l2.a(this.f52433r).b(com.join.mgps.socket.fight.arena.c.g(arenaResponse));
        } else {
            this.D.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间为比赛专用房间,非参赛选手无法加入", "我知道了");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0(GameRoom gameRoom) {
        com.join.mgps.dialog.d1 d1Var = this.B;
        if (d1Var != null && d1Var.isShowing()) {
            this.B.dismiss();
        }
        this.E = gameRoom;
        if (!gameRoom.getAllowPeripheralJoin() && com.join.mgps.socket.fight.arena.c.o(this.f52433r)) {
            l2.a(this.f52433r).b("禁止外设用户加入!");
        } else if (this.f52432q != null && this.E.getBattleArea().getNumber() != BattleArea.ALL.getNumber() && this.E.getBattleArea().getNumber() != this.f52432q.d().n().getNumber()) {
            N0(gameRoom);
        } else {
            if (!o0("" + gameRoom.getGameId())) {
                S0(A1);
            } else if (gameRoom.getHasJoinPassword()) {
                P0(gameRoom);
            } else {
                r0(gameRoom, "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0() {
        LinearLayout linearLayout = this.f52419f;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
        this.f52420g.setVisibility(8);
        int i4 = this.S;
        if (i4 == 1 || i4 == 0) {
            this.f52427n.setVisibility(0);
        }
        this.f52422i.stopRefresh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        this.f52428o.setVisibility(8);
        IntentUtil intentUtil = IntentUtil.getInstance();
        FragmentActivity activity = getActivity();
        intentUtil.goShareWebActivity(activity, com.join.mgps.rpc.h.f54095w + "/lobby_active/index/");
    }

    public void G0() {
        ResultResMainBean<GameListBannerBean> resultResMainBean = this.U;
        if (resultResMainBean != null && resultResMainBean.getData() != null) {
            J0(this.U.getData().getBanner_list());
        }
        if (this.f52433r == null) {
            return;
        }
        u0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void H0() {
        try {
            String token = this.f52429p.getAccountData().getToken();
            ResultArenaBean<ArenaLobbyServer> P = this.f52417d.P(this.f52429p.getAccountData().getUid(), token);
            if (P != null && P.getError() == 0 && P.getData() != null) {
                if (P.getData().getDisabled() != 0) {
                    ArenaResponse arenaResponse = new ArenaResponse();
                    arenaResponse.errorType = 1001;
                    arenaResponse.errorInfo = P.getData().getDisabledMessage();
                    A0(arenaResponse);
                    showLodingFailed();
                    return;
                }
                int startGameCopper = P.getData().getStartGameCopper();
                this.V = startGameCopper;
                if (startGameCopper == 0) {
                    this.V = 20;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        ResultResMainBean<GameListBannerBean> resultResMainBean = null;
        try {
            resultResMainBean = this.f52416c.u(AccountUtil_.getInstance_(getActivity()).getUid());
        } catch (Exception e6) {
            z0();
            e6.printStackTrace();
        }
        if (this.f52415b || resultResMainBean == null || resultResMainBean.getData() == null || resultResMainBean.getError() > 0) {
            return;
        }
        this.U = resultResMainBean;
        J0(resultResMainBean.getData().getBanner_list());
        L0(this.U.getData());
        K0(this.U.getData().getGame_list());
        C0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void I0() {
        if (!com.join.android.app.common.utils.j.j(this.f52433r)) {
            showToast("当前网络不可用，请检查网络");
        } else if (!T0()) {
            R0();
        } else {
            com.join.mgps.socket.fight.arena.b bVar = this.f52432q;
            if (bVar != null && bVar.d() == null) {
                showToast("正在连接服务器，请稍后...");
            } else {
                O0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0(List<BannerBean> list) {
        AutoScrollViewPager<BannerBean> autoScrollViewPager;
        if (list != null && list.size() > 0) {
            if (this.W == null) {
                this.W = new ArrayList();
            }
            this.W.clear();
            this.W.addAll(list);
            AutoScrollViewPager<BannerBean> autoScrollViewPager2 = this.f52426m;
            if (autoScrollViewPager2 == null) {
                return;
            }
            autoScrollViewPager2.setVisibility(8);
            List<Dialog> list2 = this.X;
            if (list2 == null) {
                return;
            }
            list2.clear();
            LinearLayout linearLayout = this.f52421h;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
        } else if (this.W.size() >= 0 || (autoScrollViewPager = this.f52426m) == null) {
        } else {
            autoScrollViewPager.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K0(List<GameInfoBean> list) {
        List<GameInfoBean> list2;
        if (list != null) {
            try {
                if (list.size() > 0 && (list2 = this.Y) != null) {
                    list2.clear();
                    this.Y.addAll(list);
                    GameInfoBean gameInfoBean = new GameInfoBean();
                    gameInfoBean.setTitle("悟饭全明星");
                    gameInfoBean.setRoom_count(-1);
                    gameInfoBean.setPic_remote_vertical("res://" + getContext().getPackageName() + net.lingala.zip4j.util.e.F0 + R.drawable.event_entrance_bg);
                    this.Y.add(0, gameInfoBean);
                    this.Z.e(this.Y);
                    this.f52422i.setRefreshing(false);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L0(GameListBannerBean gameListBannerBean) {
        TextView textView = this.f52435t;
        textView.setText("" + gameListBannerBean.getLately_battle());
        TextView textView2 = this.f52436u;
        textView2.setText("" + gameListBannerBean.getArcade_battle());
        TextView textView3 = this.f52437v;
        textView3.setText("" + gameListBannerBean.getFc_battle());
        if (this.f52438w == null) {
            return;
        }
        if (gameListBannerBean.getGame_match() != null && gameListBannerBean.getGame_match().getMatch_title() != null) {
            this.f52438w.setVisibility(0);
            this.f52439x.setText(gameListBannerBean.getGame_match().getMatch_title());
            this.f52440y.setText(gameListBannerBean.getGame_match().getNick_name());
            if (gameListBannerBean.getGame_match().getJoin_number() < 1) {
                this.A.setVisibility(8);
                this.f52441z.setVisibility(8);
            } else {
                TextView textView4 = this.f52441z;
                textView4.setText(gameListBannerBean.getGame_match().getJoin_number() + "");
                this.A.setVisibility(0);
                this.f52441z.setVisibility(0);
            }
        } else {
            this.f52438w.setVisibility(8);
        }
        this.f52438w.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P0(GameRoom gameRoom) {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this.f52433r, "请输入房间密码", 4, false);
        aVar.g(new j(aVar, gameRoom));
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void R0() {
        IntentUtil.getInstance().goLoginBattle(this.f52433r);
    }

    boolean T0() {
        return (l0(getActivity()) == null || AccountUtil_.getInstance_(getActivity()).isTourist()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52416c = com.join.mgps.rpc.impl.l.n0();
        this.f52417d = com.join.mgps.rpc.impl.k.n0();
        this.G = getChildFragmentManager();
        this.T = getChildFragmentManager();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                getActivity().getWindow().getDecorView().setOnApplyWindowInsetsListener(new m());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            this.T.beginTransaction().commit();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        View inflate = LayoutInflater.from(this.f52433r).inflate(R.layout.new_arena_list_header, (ViewGroup) null);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.ad_iv_icon);
        this.f52435t = (TextView) inflate.findViewById(R.id.latest_num_tv);
        this.f52436u = (TextView) inflate.findViewById(R.id.jieji_num_tv);
        this.f52437v = (TextView) inflate.findViewById(R.id.fc_num_tv);
        this.f52439x = (TextView) inflate.findViewById(R.id.event_gamename_tv);
        this.f52440y = (TextView) inflate.findViewById(R.id.event_nike_tv);
        this.f52441z = (TextView) inflate.findViewById(R.id.event_num_tv);
        this.A = (TextView) inflate.findViewById(R.id.event_num_after_tv);
        this.f52438w = (RelativeLayout) inflate.findViewById(R.id.event_root_rl);
        this.K = inflate.findViewById(R.id.jingxuanLine);
        this.L = inflate.findViewById(R.id.newLine);
        this.M = inflate.findViewById(R.id.gbaLine);
        this.N = inflate.findViewById(R.id.fcLine);
        TextView textView = (TextView) inflate.findViewById(R.id.tvJingxuan);
        this.O = textView;
        textView.getPaint().setFakeBoldText(true);
        this.P = (TextView) inflate.findViewById(R.id.tvNew);
        this.Q = (TextView) inflate.findViewById(R.id.tvGBA);
        this.R = (TextView) inflate.findViewById(R.id.tvFC);
        int width = getActivity().getWindowManager().getDefaultDisplay().getWidth();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width - com.join.mgps.Util.c0.a(getActivity(), 10.0f), (width * 112) / 350);
        layoutParams.leftMargin = com.join.mgps.Util.c0.a(getActivity(), 5.0f);
        layoutParams.rightMargin = com.join.mgps.Util.c0.a(getActivity(), 5.0f);
        layoutParams.bottomMargin = com.join.mgps.Util.c0.a(getActivity(), 5.0f);
        this.f52438w.setLayoutParams(layoutParams);
        this.f52438w.setOnClickListener(new n());
        inflate.findViewById(R.id.jingxuan).setOnClickListener(new o());
        inflate.findViewById(R.id.ll_latest).setOnClickListener(new p());
        inflate.findViewById(R.id.ll_jieji).setOnClickListener(new a());
        inflate.findViewById(R.id.ll_fc).setOnClickListener(new b());
        this.f52426m = (AutoScrollViewPager) inflate.findViewById(R.id.ad_viewpager);
        this.f52424k.removeAllViews();
        this.f52424k.addView(inflate);
        this.f52422i.setLayoutManager(new GridLayoutManager(getContext(), ((double) com.join.android.app.common.utils.n.n(getActivity()).j(getActivity())) >= 1.9d ? 5 : 4));
        this.f52422i.setPullRefreshEnabled(true);
        this.f52422i.setLoadingMoreEnabled(false);
        this.f52422i.setLoadingListener(new c());
        GameInfoAdapterV2 gameInfoAdapterV2 = new GameInfoAdapterV2(getActivity(), true);
        this.Z = gameInfoAdapterV2;
        this.f52422i.setAdapter(gameInfoAdapterV2);
        this.Z.f(new d());
        y0();
    }

    public void m0() {
        List<Dialog> list = this.X;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (int i4 = 0; i4 < this.X.size(); i4++) {
            if (this.X.get(i4) != null) {
                this.X.get(i4).dismiss();
            }
        }
    }

    void n0() {
        if (this.f52432q.d() != null) {
            com.join.mgps.Util.v0.b(f52414v1, "--- removeObserver---");
            this.f52432q.d().A(this.C);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == A1 && i5 == -1) {
            if (this.E.getHasJoinPassword()) {
                P0(this.E);
            } else if (this.E.getHasJoinPassword()) {
                P0(this.E);
            } else {
                Q0("正在获取房间...");
                r0(this.E, "");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        this.f52433r = activity;
        com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(activity, new k());
        this.f52432q = bVar;
        bVar.bindService();
        this.D = new com.join.mgps.socket.fight.arena.a(this.f52433r, new l());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f52415b = false;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.v0.b(f52414v1, "--onDestroy--");
        List<BannerBean> list = this.W;
        if (list != null) {
            list.clear();
            this.W = null;
        }
        com.join.mgps.socket.fight.arena.b bVar = this.f52432q;
        if (bVar == null) {
            return;
        }
        if (bVar.d() != null) {
            this.f52432q.g();
        }
        this.f52432q.stopService();
        this.f52432q = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.join.mgps.Util.v0.b(f52414v1, "--onDestroyView--");
        this.f52415b = true;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        StringBuilder sb = new StringBuilder();
        sb.append("tbl:");
        sb.append(z4);
        if (z4) {
            m0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.mgps.Util.v0.b(f52414v1, "--onPause--");
        q0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.join.mgps.Util.v0.b(f52414v1, "--onResume--");
        int i4 = this.S;
        if (i4 == 1 || i4 == 0) {
            u0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        AutoScrollViewPager<BannerBean> autoScrollViewPager = this.f52426m;
        if (autoScrollViewPager != null) {
            autoScrollViewPager.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        if (com.join.android.app.common.utils.j.j(this.f52433r) && com.join.android.app.common.utils.j.l()) {
            showLoding();
            H0();
            return;
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        com.join.mgps.dialog.d1 d1Var = this.B;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.B.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(GameRoom gameRoom, String str) {
        com.join.mgps.socket.fight.arena.b bVar = this.f52432q;
        if (bVar != null) {
            bVar.f(ArenaRequestFactory.joinRoom(ArenaConstants.REGISTER_TYPE_ARENAMAIN, gameRoom.getRoomId(), str, gameRoom.getElite()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        com.join.mgps.Util.v0.b("NewArenaMain", "relodingimag");
        u0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s0(String str) {
        com.join.mgps.socket.fight.arena.b bVar = this.f52432q;
        if (bVar != null) {
            bVar.f(ArenaRequestFactory.searchRoomById(ArenaConstants.REGISTER_TYPE_ARENAMAIN, Integer.parseInt(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        Activity activity = this.f52433r;
        if (activity != null) {
            UtilsMy.w3(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        LinearLayout linearLayout = this.f52419f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52420g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        View view = this.f52427n;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f52420g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f52419f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        View view = this.f52427n;
        if (view != null) {
            view.setVisibility(8);
        }
        XRecyclerView xRecyclerView = this.f52422i;
        if (xRecyclerView != null) {
            xRecyclerView.setRefreshing(false);
            this.f52422i.stopRefresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        Activity activity = this.f52433r;
        if (activity != null) {
            l2.a(activity).b(str);
        }
    }

    void u0() {
        ResultResMainBean<GameListBannerBean> resultResMainBean = this.U;
        if (resultResMainBean != null && resultResMainBean.getData() != null) {
            H0();
        } else {
            p0();
        }
    }

    public float x0() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", q.a.f73126a);
        if (identifier > 0) {
            return getResources().getDimensionPixelOffset(identifier);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void y0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
        CollectionCommentRequest collectionCommentRequest = new CollectionCommentRequest();
        collectionCommentRequest.setCollection_id("");
        collectionCommentRequest.setUid(accountData.getUid());
        com.join.mgps.rpc.impl.d.P1().O1().N1(RequestBeanUtil.getInstance(getContext()).getDefalutRequestBean(collectionCommentRequest)).enqueue(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        if (this.f52415b) {
            return;
        }
        if (this.U == null) {
            showLodingFailed();
        }
        C0();
        this.f52422i.stopRefresh();
    }
}
