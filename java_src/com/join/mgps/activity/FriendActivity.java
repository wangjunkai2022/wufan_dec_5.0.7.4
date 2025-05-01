package com.join.mgps.activity;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaResponse;
import com.BaseActivity;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.FriendActivity;
import com.join.mgps.activity.arena.NewArenaDownloadActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.adapter.FriendListAdapter;
import com.join.mgps.customview.input.InputNumView;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.PlugInstallDialog_;
import com.join.mgps.dialog.i;
import com.join.mgps.dto.ArenaGameRoomListConfig;
import com.join.mgps.dto.FriendAccountInfo;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.GameConfig;
import com.join.mgps.dto.GameInfoBean;
import com.join.mgps.dto.GameListBannerBean;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ResultResMainBean;
import com.join.mgps.fragment.CloudListFragment;
import com.join.mgps.fragment.CloudListFragment_;
import com.join.mgps.fragment.FriendAddFragment;
import com.join.mgps.fragment.FriendAddFragment_;
import com.join.mgps.fragment.FriendCardFragment;
import com.join.mgps.fragment.FriendCardFragment_;
import com.join.mgps.fragment.FriendFragment;
import com.join.mgps.fragment.FriendFragment_;
import com.join.mgps.fragment.FriendMessageFragment;
import com.join.mgps.fragment.FriendMessageFragment_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes.dex */
public class FriendActivity extends BaseActivity implements FriendListAdapter.b, View.OnSystemUiVisibilityChangeListener {
    RecyclerView A;
    RecyclerView B;
    GameInfoBean H;
    View J;
    RecyclerView K;

    /* renamed from: b  reason: collision with root package name */
    FragmentManager f31368b;

    /* renamed from: c  reason: collision with root package name */
    protected FriendFragment f31369c;

    /* renamed from: d  reason: collision with root package name */
    private FriendAddFragment f31370d;

    /* renamed from: e  reason: collision with root package name */
    private FriendMessageFragment f31371e;

    /* renamed from: f  reason: collision with root package name */
    private FriendCardFragment f31372f;

    /* renamed from: g  reason: collision with root package name */
    private CloudListFragment f31373g;

    /* renamed from: i  reason: collision with root package name */
    protected String f31375i;

    /* renamed from: j  reason: collision with root package name */
    protected String f31376j;

    /* renamed from: k  reason: collision with root package name */
    protected String f31377k;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.dialog.i f31380n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.dialog.m f31381o;

    /* renamed from: s  reason: collision with root package name */
    BroadcastReceiver f31385s;

    /* renamed from: t  reason: collision with root package name */
    Dialog f31386t;

    /* renamed from: u  reason: collision with root package name */
    SimpleDraweeView f31387u;

    /* renamed from: v  reason: collision with root package name */
    View f31388v;

    /* renamed from: w  reason: collision with root package name */
    View f31389w;

    /* renamed from: x  reason: collision with root package name */
    TextView f31390x;

    /* renamed from: y  reason: collision with root package name */
    TextView f31391y;

    /* renamed from: z  reason: collision with root package name */
    View f31392z;

    /* renamed from: h  reason: collision with root package name */
    Handler f31374h = new Handler();

    /* renamed from: l  reason: collision with root package name */
    LinkedList<Integer> f31378l = new LinkedList<>();

    /* renamed from: m  reason: collision with root package name */
    protected boolean f31379m = true;

    /* renamed from: p  reason: collision with root package name */
    FriendBean f31382p = null;

    /* renamed from: q  reason: collision with root package name */
    boolean f31383q = false;

    /* renamed from: r  reason: collision with root package name */
    boolean f31384r = false;
    j C = null;
    g D = null;
    private int E = -1024;
    List<GameInfoBean> F = new ArrayList();
    List<GameInfoBean> G = new ArrayList();
    boolean I = false;
    g L = null;
    List<GameInfoBean> M = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            FriendActivity.this.autoSendAdd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Callback<ResponseModel> {
        b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
            if (response != null && response.body() != null) {
                ResponseModel body = response.body();
                if (body.getError() == 0) {
                    FriendActivity.this.addSuccess(Boolean.TRUE);
                    return;
                } else {
                    FriendActivity.this.toast(body.getMsg());
                    return;
                }
            }
            FriendActivity.this.toast("添加失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends AsyncTask<Integer, Void, FriendAccountInfo> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public FriendAccountInfo doInBackground(Integer... numArr) {
            int intValue = numArr[0].intValue();
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(FriendActivity.this).getAccountData();
                FriendReqBean friendReqBean = new FriendReqBean();
                friendReqBean.setUid(accountData.getUid());
                friendReqBean.setToken(accountData.getToken());
                friendReqBean.setRuid(intValue);
                ResponseModel<FriendAccountInfo> i4 = com.join.mgps.rpc.impl.h.p().i(accountData.getUid() + "", accountData.getToken() + "", intValue + "");
                if (i4 != null) {
                    if (i4.getError() == 0) {
                        return i4.getData();
                    }
                    FriendActivity.this.toast(i4.getMsg());
                    return null;
                }
                return null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(FriendAccountInfo friendAccountInfo) {
            super.onPostExecute(friendAccountInfo);
            if (friendAccountInfo == null) {
                return;
            }
            MyImageLoader.x(FriendActivity.this.f31387u, friendAccountInfo.getAvatar());
            FriendActivity.this.f31390x.setText(friendAccountInfo.getNickName());
            TextView textView = FriendActivity.this.f31391y;
            textView.setText(friendAccountInfo.getAccount() + "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Callback<ResultResMainBean<GameListBannerBean>> {
        d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultResMainBean<GameListBannerBean>> call, Throwable th) {
            FriendActivity.this.A0();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultResMainBean<GameListBannerBean>> call, Response<ResultResMainBean<GameListBannerBean>> response) {
            ResultResMainBean<GameListBannerBean> body = response.body();
            if (body != null) {
                try {
                    List<GameInfoBean> game_list = body.getData().getGame_list();
                    if (game_list != null && game_list.size() > 0) {
                        FriendActivity.this.F.addAll(game_list);
                        FriendActivity friendActivity = FriendActivity.this;
                        friendActivity.E = friendActivity.E == -1024 ? 0 : FriendActivity.this.E;
                        FriendActivity friendActivity2 = FriendActivity.this;
                        friendActivity2.H = friendActivity2.F.get(friendActivity2.E);
                        FriendActivity.this.w0();
                        FriendActivity.this.C.notifyDataSetChanged();
                        return;
                    }
                    FriendActivity.this.A0();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    FriendActivity.this.A0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Callback<ResultMainBean<ArenaGameRoomListConfig>> {
        e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<ArenaGameRoomListConfig>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<ArenaGameRoomListConfig>> call, Response<ResultMainBean<ArenaGameRoomListConfig>> response) {
            ResultMainBean<ArenaGameRoomListConfig> body = response.body();
            if (body != null && body.getMessages().getData() != null) {
                if (body.getMessages().getData().getCurrent_collection_cfg() == null) {
                    return;
                }
                String collection_id = body.getMessages().getData().getCurrent_collection_cfg().getCollection_id();
                if (TextUtils.isEmpty(collection_id) || Integer.parseInt(collection_id) <= 0 || body.getMessages().getData().getGame_list() == null || body.getMessages().getData().getGame_list().size() <= 0) {
                    return;
                }
                List<GameConfig> game_list = body.getMessages().getData().getGame_list();
                ArrayList arrayList = new ArrayList();
                for (GameConfig gameConfig : game_list) {
                    GameInfoBean gameInfoBean = new GameInfoBean();
                    gameInfoBean.setCollection_id(gameConfig.getCollection_id());
                    gameInfoBean.setPic_remote(gameConfig.getGame_ico());
                    gameInfoBean.setGame_ico(gameConfig.getGame_ico());
                    gameInfoBean.setGame_id(gameConfig.getGame_id());
                    gameInfoBean.setGame_name(gameConfig.getGame_name());
                    gameInfoBean.setRoom_count(gameConfig.getRoom_count());
                    gameInfoBean.setTitle(gameConfig.getTitle());
                    gameInfoBean.setPic_cover(gameConfig.getPic_cover());
                    arrayList.add(gameInfoBean);
                }
                FriendActivity.this.G.clear();
                FriendActivity.this.G.addAll(arrayList);
                FriendActivity.this.D.notifyDataSetChanged();
                return;
            }
            FriendActivity.this.toast("获取游戏配置信息失败！");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f31398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaRequest f31399b;

        f(com.join.mgps.customview.input.a aVar, ArenaRequest arenaRequest) {
            this.f31398a = aVar;
            this.f31399b = arenaRequest;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f31398a.c();
            if (this.f31399b == null) {
                return;
            }
            FriendBean friendBean = new FriendBean();
            friendBean.setGameId(this.f31399b.gameId + "");
            friendBean.setRoomId(this.f31399b.roomId);
            friendBean.setElite(this.f31399b.isElite);
            friendBean.setRoomPwd(str);
            com.wufan.friend.chat.c.u().p(friendBean);
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f31398a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends RecyclerView.Adapter {

        /* renamed from: b  reason: collision with root package name */
        private boolean f31402b;

        /* renamed from: d  reason: collision with root package name */
        private Context f31404d;

        /* renamed from: e  reason: collision with root package name */
        private h f31405e;

        /* renamed from: a  reason: collision with root package name */
        private List<GameInfoBean> f31401a = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private boolean f31403c = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            private SimpleDraweeView f31407a;

            /* renamed from: b  reason: collision with root package name */
            private TextView f31408b;

            /* renamed from: c  reason: collision with root package name */
            private TextView f31409c;

            public a(@NonNull View view) {
                super(view);
                this.f31407a = (SimpleDraweeView) view.findViewById(R.id.cover);
                this.f31408b = (TextView) view.findViewById(R.id.state);
                this.f31409c = (TextView) view.findViewById(R.id.name);
            }
        }

        public g(Context context, boolean z4) {
            this.f31402b = false;
            this.f31404d = context;
            this.f31402b = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(int i4, View view) {
            this.f31405e.onItemClick(i4);
        }

        public List<GameInfoBean> b() {
            return this.f31401a;
        }

        public void c(final int i4, a aVar) {
            GameInfoBean gameInfoBean = this.f31401a.get(i4);
            aVar.f31409c.setText(gameInfoBean.getGame_name());
            MyImageLoader.e(aVar.f31407a, R.drawable.bg_gameinfo, gameInfoBean.getPic_cover(), r.c.f11294a);
            if (!this.f31403c || !FriendActivity.this.C0(gameInfoBean.getGame_id())) {
                aVar.f31408b.setVisibility(8);
            } else {
                aVar.f31408b.setVisibility(0);
            }
            if (this.f31403c) {
                View view = aVar.itemView;
                view.setPadding(view.getPaddingLeft(), aVar.itemView.getPaddingTop(), aVar.itemView.getPaddingRight(), aVar.itemView.getPaddingBottom() + FriendActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp6));
            }
            aVar.f31407a.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FriendActivity.g.this.d(i4, view2);
                }
            });
        }

        public void e(List<GameInfoBean> list) {
            this.f31401a = list;
            notifyDataSetChanged();
        }

        public void f(boolean z4) {
            this.f31402b = z4;
        }

        public void g(h hVar) {
            this.f31405e = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<GameInfoBean> list = this.f31401a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        public void h(boolean z4) {
            this.f31403c = z4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
            c(i4, (a) viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            return new a(LayoutInflater.from(this.f31404d).inflate(R.layout.item_gameinfo_2, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface h {
        void onItemClick(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f31411a;

        public i(@NonNull View view) {
            super(view);
            this.f31411a = (TextView) view.findViewById(R.id.name);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends RecyclerView.Adapter<i> {

        /* renamed from: a  reason: collision with root package name */
        private Context f31413a;

        /* renamed from: b  reason: collision with root package name */
        private h f31414b;

        public j(Context context) {
            this.f31413a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i4, View view) {
            notifyItemChanged(FriendActivity.this.E);
            FriendActivity.this.E = i4;
            notifyItemChanged(FriendActivity.this.E);
            this.f31414b.onItemClick(i4);
        }

        public GameInfoBean b() {
            List<GameInfoBean> list = FriendActivity.this.F;
            if (list != null && list.size() != 0) {
                if (FriendActivity.this.E < 0) {
                    return FriendActivity.this.F.get(0);
                }
                if (FriendActivity.this.E < getItemCount()) {
                    FriendActivity friendActivity = FriendActivity.this;
                    return friendActivity.F.get(friendActivity.E);
                }
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public void onBindViewHolder(@NonNull i iVar, final int i4) {
            GameInfoBean gameInfoBean = FriendActivity.this.F.get(i4);
            if (FriendActivity.this.E != -1024 || FriendActivity.this.H == null || !gameInfoBean.getCollection_id().equals(FriendActivity.this.H.getCollection_id())) {
                if (FriendActivity.this.E == i4) {
                    iVar.f31411a.setTextColor(-16777216);
                } else {
                    iVar.f31411a.setTextColor(Color.parseColor("#C3C3C3"));
                }
            } else {
                FriendActivity.this.E = i4;
                iVar.itemView.setSelected(true);
                iVar.f31411a.setTextColor(-1);
            }
            iVar.f31411a.setTypeface(FriendActivity.this.E == i4 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            iVar.itemView.setSelected(FriendActivity.this.E == i4);
            iVar.f31411a.setText(gameInfoBean.getTitle());
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendActivity.j.this.c(i4, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* renamed from: e */
        public i onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
            View inflate = LayoutInflater.from(this.f31413a).inflate(R.layout.newarena_roomselecter_item, viewGroup, false);
            inflate.setBackgroundResource(R.drawable.new_arena_roomselecter_listselecter1);
            inflate.getLayoutParams().height = FriendActivity.this.getResources().getDimensionPixelOffset(R.dimen.wdp100);
            return new i(inflate);
        }

        public void f(h hVar) {
            this.f31414b = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FriendActivity.this.F.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(View view) {
        this.f31386t.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(int i4, View view) {
        if (IntentUtil.getInstance().isLogined(view.getContext()) && !IntentUtil.getInstance().isTourist(view.getContext())) {
            add(i4);
            Ext ext = new Ext();
            ext.setFrom("3");
            com.papa.sim.statistic.p.l(view.getContext()).O1(Event.addFriends, ext);
            this.f31386t.dismiss();
            return;
        }
        IntentUtil.getInstance().goMyAccountLoginActivity(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Context context, DownloadTask downloadTask) {
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        this.f31382p.setGameId(crc_link_type_val);
        this.f31382p.setElite(false);
        if (D0(crc_link_type_val)) {
            DownloadTask F = p1.f.K().F(crc_link_type_val);
            PlugInstallDialog_.k0(context).c(b2.o.o().n(F.getPlugin_num())).a(F).b(2).start();
        } else if (checkGameIsInstall(crc_link_type_val)) {
            if (R0(crc_link_type_val)) {
                return;
            }
            com.wufan.friend.chat.c.u().o(this.f31382p);
            this.f31382p = null;
        } else {
            startDownloadActivity(crc_link_type_val, 10000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view) {
        View view2 = this.f31392z;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(int i4) {
        this.H = this.F.get(i4);
        w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(int i4) {
        GameInfoBean gameInfoBean = this.G.get(i4);
        this.H = gameInfoBean;
        S0(gameInfoBean.getGame_id());
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(View view) {
        View view2 = this.J;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(int i4) {
        S0(this.M.get(i4).getGame_id());
        B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(ArenaRequest arenaRequest) {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this, "请输入房间密码", 4, false);
        aVar.g(new f(aVar, arenaRequest));
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    private boolean R0(String str) {
        try {
            DownloadTask F = p1.f.K().F(str);
            return UtilsMy.V1(this, str, F, b2.o.o().n(F.getPlugin_num()), true);
        } catch (Exception unused) {
            return false;
        }
    }

    private void V0() {
        if (this.f31373g == null) {
            this.f31373g = new CloudListFragment_();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            bundle.putString("gameid", this.f31375i);
            bundle.putInt("typeIndex", 3);
            this.f31373g.setArguments(bundle);
            this.f31368b.beginTransaction().replace(R.id.frameLayout, this.f31373g).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        String collection_id;
        int i4;
        try {
            if (TextUtils.isEmpty(this.H.getCollection_id())) {
                collection_id = this.H.getGame_id();
                i4 = 1;
            } else {
                collection_id = this.H.getCollection_id();
                i4 = 2;
            }
            com.join.mgps.rpc.impl.d.P1().O1().q(RequestBeanUtil.getInstance(this).getRequestArenaRoomListArgs(collection_id, i4)).enqueue(new e());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void x0() {
        com.join.mgps.rpc.impl.l.n0().m0().u(AccountUtil_.getInstance_(this).getUid()).enqueue(new d());
    }

    public void A0() {
        View view = this.f31392z;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void B0() {
        View view = this.J;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    boolean C0(String str) {
        FriendBean friendBean = this.f31382p;
        return (friendBean == null || TextUtils.isEmpty(friendBean.getGameId()) || !this.f31382p.getGameId().equals(str)) ? false : true;
    }

    public boolean D0(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F == null || F.getDown_type() == 2) {
            EMUApkTable n4 = F != null ? b2.o.o().n(F.getPlugin_num()) : null;
            if (F == null || F.getStatus() != 11) {
                return n4 != null && com.join.android.app.common.utils.l.i(n4);
            }
            return true;
        }
        return false;
    }

    protected boolean E0() {
        return true;
    }

    @Override // com.join.mgps.adapter.FriendListAdapter.b
    public void K(String str) {
        if (!TextUtils.isEmpty(this.f31377k) && this.f31377k.equals(str) && this.f31378l.getFirst().intValue() == 3) {
            return;
        }
        this.f31377k = str;
        y0(3);
    }

    @Override // com.join.mgps.adapter.FriendListAdapter.b
    public void O(FriendBean friendBean) {
        if (IntentUtil.getInstance().goLogin(this) || friendBean == null) {
            return;
        }
        this.f31382p = friendBean;
        String gameId = friendBean.getGameId();
        if (D0(gameId)) {
            DownloadTask F = p1.f.K().F(gameId);
            PlugInstallDialog_.k0(this).c(b2.o.o().n(F.getPlugin_num())).a(F).b(2).start();
        } else if (checkGameIsInstall(gameId)) {
            if (R0(gameId)) {
                return;
            }
            com.wufan.friend.chat.c.u().p(friendBean);
            this.f31382p = null;
        } else {
            startDownloadActivity(gameId, 10001);
        }
    }

    void Q0(int i4) {
        FragmentTransaction beginTransaction = this.f31368b.beginTransaction();
        if (this.f31369c != null) {
            if (this instanceof GameMainActivity4_) {
                u0(beginTransaction);
            }
            beginTransaction.hide(this.f31369c);
        }
        if (this.f31370d != null) {
            u0(beginTransaction);
            beginTransaction.hide(this.f31370d);
        }
        if (this.f31371e != null) {
            u0(beginTransaction);
            beginTransaction.hide(this.f31371e);
        }
        if (this.f31372f != null) {
            u0(beginTransaction);
            beginTransaction.hide(this.f31372f);
        }
        try {
            beginTransaction.commit();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        FragmentTransaction beginTransaction2 = this.f31368b.beginTransaction();
        if (i4 == 0) {
            if (this instanceof GameMainActivity4_) {
                u0(beginTransaction2);
            }
            FriendFragment friendFragment = this.f31369c;
            if (friendFragment == null) {
                this.f31369c = new FriendFragment_();
                Bundle bundle = new Bundle();
                bundle.putString("gameId", this.f31375i);
                bundle.putString("type", this.f31376j);
                this.f31369c.setArguments(bundle);
                beginTransaction2.add(v0(), this.f31369c);
            } else {
                beginTransaction2.show(friendFragment);
            }
        } else if (i4 == 1) {
            u0(beginTransaction2);
            FriendAddFragment friendAddFragment = this.f31370d;
            if (friendAddFragment == null) {
                this.f31370d = new FriendAddFragment_();
                beginTransaction2.add(v0(), this.f31370d);
            } else {
                beginTransaction2.show(friendAddFragment);
            }
        } else if (i4 == 2) {
            u0(beginTransaction2);
            FriendMessageFragment friendMessageFragment = this.f31371e;
            if (friendMessageFragment == null) {
                this.f31371e = new FriendMessageFragment_();
                beginTransaction2.add(v0(), this.f31371e);
            } else {
                beginTransaction2.show(friendMessageFragment);
            }
        } else if (i4 == 3) {
            u0(beginTransaction2);
            FriendCardFragment friendCardFragment = this.f31372f;
            if (friendCardFragment == null) {
                this.f31372f = new FriendCardFragment_();
                Bundle bundle2 = new Bundle();
                bundle2.putString("ruid", this.f31377k);
                this.f31372f.setArguments(bundle2);
                beginTransaction2.add(v0(), this.f31372f);
            } else {
                friendCardFragment.z0(this.f31377k);
                beginTransaction2.show(this.f31372f);
            }
        }
        try {
            beginTransaction2.commit();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    void S0(String str) {
        try {
            this.f31382p.setGameId(str);
            this.f31382p.setElite(false);
            if (D0(str)) {
                DownloadTask F = p1.f.K().F(str);
                PlugInstallDialog_.k0(this).c(b2.o.o().n(F.getPlugin_num())).a(F).b(2).start();
            } else if (checkGameIsInstall(str)) {
                if (R0(str)) {
                    return;
                }
                com.wufan.friend.chat.c.u().o(this.f31382p);
                this.f31382p = null;
            } else {
                startDownloadActivity(str, 10000);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void T0() {
        if (this.f31378l.size() < 2) {
            return;
        }
        this.f31378l.pop();
        Q0(this.f31378l.getFirst().intValue());
    }

    void U0() {
        if (this.f31381o == null) {
            this.f31381o = new com.join.mgps.dialog.m(this);
        }
        this.f31381o.g();
    }

    void W0() {
        com.join.mgps.dialog.i iVar = this.f31380n;
        if (iVar != null) {
            iVar.c();
        }
        List<DownloadTask> s4 = p1.f.K().s();
        com.join.mgps.dialog.i iVar2 = new com.join.mgps.dialog.i(this, new i.c() { // from class: com.join.mgps.activity.z
            @Override // com.join.mgps.dialog.i.c
            public final void a(DownloadTask downloadTask) {
                FriendActivity.this.I0(this, downloadTask);
            }
        });
        this.f31380n = iVar2;
        iVar2.h(s4, false);
        if (s4 != null && s4.size() != 0) {
            this.f31380n.j();
        } else {
            U0();
        }
        hideNavigationBar();
    }

    public void X0() {
        if (this.f31392z == null) {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            View inflate = LayoutInflater.from(this).inflate(R.layout.newarena_gameroom_selecter_activity1, viewGroup, false);
            this.f31392z = inflate;
            this.B = (RecyclerView) inflate.findViewById(R.id.recyclerView);
            this.A = (RecyclerView) this.f31392z.findViewById(R.id.recyclerViewGamelist);
            View findViewById = this.f31392z.findViewById(R.id.close);
            this.f31388v = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendActivity.this.J0(view);
                }
            });
            this.B.setLayoutManager(new LinearLayoutManager(this));
            j jVar = new j(this);
            this.C = jVar;
            this.B.setAdapter(jVar);
            this.A.setLayoutManager(new GridLayoutManager(this, 3));
            g gVar = new g(this, false);
            this.D = gVar;
            this.G = gVar.b();
            this.A.setAdapter(this.D);
            this.C.f(new h() { // from class: com.join.mgps.activity.y
                @Override // com.join.mgps.activity.FriendActivity.h
                public final void onItemClick(int i4) {
                    FriendActivity.this.K0(i4);
                }
            });
            this.D.g(new h() { // from class: com.join.mgps.activity.x
                @Override // com.join.mgps.activity.FriendActivity.h
                public final void onItemClick(int i4) {
                    FriendActivity.this.L0(i4);
                }
            });
            viewGroup.addView(this.f31392z);
        }
        FriendBean friendBean = this.f31382p;
        if (friendBean != null && friendBean.getSource() == 1) {
            this.D.f(true);
        } else {
            this.D.f(false);
        }
        this.D.h(false);
        this.f31392z.setVisibility(0);
        x0();
    }

    public void Y0(List<com.wufan.friend.chat.protocol.r0> list) {
        if (this.J == null) {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            View inflate = LayoutInflater.from(this).inflate(R.layout.newarena_gameroom_selecter_activity2, viewGroup, false);
            this.J = inflate;
            this.K = (RecyclerView) inflate.findViewById(R.id.recyclerViewGamelist);
            this.J.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendActivity.this.M0(view);
                }
            });
            this.K.setLayoutManager(new GridLayoutManager(this, 3));
            g gVar = new g(this, false);
            this.L = gVar;
            this.M = gVar.b();
            this.K.setAdapter(this.L);
            this.L.g(new h() { // from class: com.join.mgps.activity.w
                @Override // com.join.mgps.activity.FriendActivity.h
                public final void onItemClick(int i4) {
                    FriendActivity.this.N0(i4);
                }
            });
            viewGroup.addView(this.J);
        }
        this.L.h(true);
        this.J.setVisibility(0);
        this.M.clear();
        for (com.wufan.friend.chat.protocol.r0 r0Var : list) {
            GameInfoBean gameInfoBean = new GameInfoBean();
            gameInfoBean.setPic_cover(r0Var.J1());
            gameInfoBean.setTitle(r0Var.getGameName());
            gameInfoBean.setGame_id(r0Var.getGameId() + "");
            gameInfoBean.setGame_name(r0Var.getGameName() + "");
            this.M.add(gameInfoBean);
        }
        this.L.notifyDataSetChanged();
    }

    void add(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            FriendReqBean friendReqBean = new FriendReqBean();
            friendReqBean.setUid(accountData.getUid());
            friendReqBean.setToken(accountData.getToken());
            friendReqBean.setRuid(i4);
            friendReqBean.setRequestInfo("嘿，交个朋友，少年~(*^▽^*)");
            com.join.mgps.rpc.impl.h.p().o().b(friendReqBean).enqueue(new b());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void addSuccess(Boolean bool) {
        if (bool.booleanValue()) {
            toast("已发送加好友申请");
        }
    }

    void autoSendAdd() {
        Dialog dialog;
        try {
            if (this.f31389w == null || (dialog = this.f31386t) == null || !dialog.isShowing()) {
                return;
            }
            this.f31389w.performClick();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: checkClipboard */
    public void F0() {
        int l4;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager.hasPrimaryClip()) {
                ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                if (itemAt.getText() == null || (l4 = com.wufan.friend.chat.c.u().l(itemAt.getText().toString())) == 0) {
                    return;
                }
                showAddFriend(l4);
                clipboardManager.setText("");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean checkGameIsInstall(String str) {
        this.f31383q = false;
        this.f31384r = false;
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 5) {
            this.f31383q = true;
            EMUApkTable n4 = b2.o.o().n(F.getPlugin_num());
            if (n4 != null) {
                if (com.join.android.app.common.utils.l.t(this, n4, false, new String[0]) && !UtilsMy.B0(this, n4)) {
                    this.f31384r = true;
                } else {
                    this.f31384r = false;
                }
            } else {
                this.f31384r = true;
            }
        } else {
            this.f31383q = false;
        }
        return this.f31384r && this.f31383q;
    }

    void getFriendInfo(int i4) {
        new c().execute(Integer.valueOf(i4));
    }

    public String getGameId() {
        return this.f31375i;
    }

    void hideNavigationBar() {
        if (Build.VERSION.SDK_INT >= 19) {
            setSystemUiVisibility();
        }
    }

    @Override // com.join.mgps.adapter.FriendListAdapter.b
    public void n(FriendBean friendBean) {
        if (IntentUtil.getInstance().goLogin(this) || friendBean == null) {
            return;
        }
        if (!com.join.android.app.common.utils.j.j(this)) {
            toast(getString(R.string.net_connect_failed));
            return;
        }
        this.f31382p = friendBean;
        if (!friendBean.isRecommend()) {
            X0();
            return;
        }
        try {
            com.wufan.friend.chat.c.u().v(this.f31382p.getUid(), Long.parseLong(this.f31382p.getGameId()));
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1) {
            if (i4 == 10000) {
                com.wufan.friend.chat.c.u().o(this.f31382p);
                this.f31382p = null;
            } else if (i4 == 10001) {
                com.wufan.friend.chat.c.u().p(this.f31382p);
                this.f31382p = null;
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onArenaResponse(ArenaResponse arenaResponse) {
        if (arenaResponse != null && arenaResponse.errorType == 10) {
            showInputRoomPwdDialog(arenaResponse.request);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31378l.size() > 1 && this.f31379m) {
            T0();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!org.greenrobot.eventbus.c.f().m(this)) {
            org.greenrobot.eventbus.c.f().t(this);
        }
        registerReceiver();
        this.f31368b = getSupportFragmentManager();
        if (this instanceof FriendInviteActivity) {
            return;
        }
        boolean E0 = E0();
        this.f31379m = E0;
        if (E0) {
            y0(0);
        } else {
            V0();
        }
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (org.greenrobot.eventbus.c.f().m(this)) {
            org.greenrobot.eventbus.c.f().y(this);
        }
        if (this.f31379m) {
            unregisterReceiver();
            this.I = false;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendEvent(com.wufan.friend.chat.protocol.w1 w1Var) {
        List<com.wufan.friend.chat.protocol.r0> b12;
        if (w1Var == null || w1Var.C() != 4 || w1Var.I() != 13 || w1Var.getData() == null || w1Var.getData().W0() == null || w1Var.getData().W0().b1() == null || !this.I || (b12 = w1Var.getData().W0().b1()) == null || b12.size() == 0) {
            return;
        }
        Y0(b12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f31378l.clear();
        this.f31369c = null;
        this.f31370d = null;
        this.f31371e = null;
        this.f31372f = null;
        this.f31373g = null;
        this.f31368b = getSupportFragmentManager();
        if (this instanceof FriendInviteActivity) {
            return;
        }
        boolean E0 = E0();
        this.f31379m = E0;
        if (E0) {
            y0(0);
        } else {
            V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.I = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f31379m) {
            this.I = true;
            FriendFragment friendFragment = this.f31369c;
            if (friendFragment != null) {
                friendFragment.W0();
            }
            this.f31374h.postDelayed(new Runnable() { // from class: com.join.mgps.activity.a0
                @Override // java.lang.Runnable
                public final void run() {
                    FriendActivity.this.F0();
                }
            }, 500L);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i4) {
        if (i4 == 0) {
            hideNavigationBar();
        }
    }

    @Override // com.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
    }

    void registerReceiver() {
        this.f31385s = new a();
        registerReceiver(this.f31385s, new IntentFilter("com.join.android.app.mgsim.wufun.broadcast.action_login_success"));
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
    }

    void setSystemUiVisibility() {
        getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5894 : 1799);
    }

    void showAddFriend(final int i4) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData == null || accountData.getUid() == i4 || accountData.getUid() == 0) {
            return;
        }
        if (this.f31386t == null) {
            Dialog dialog = new Dialog(this, R.style.newtrans_floating_dialog);
            this.f31386t = dialog;
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                this.f31386t.getWindow().setAttributes(attributes);
            }
            View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_friend_add, (ViewGroup) null);
            this.f31388v = inflate.findViewById(R.id.close);
            this.f31389w = inflate.findViewById(R.id.button);
            this.f31390x = (TextView) inflate.findViewById(R.id.name);
            this.f31391y = (TextView) inflate.findViewById(R.id.accountId);
            this.f31387u = (SimpleDraweeView) inflate.findViewById(R.id.avatar);
            this.f31386t.setContentView(inflate);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp526);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.wdp509);
            Window window = this.f31386t.getWindow();
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
            this.f31388v.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendActivity.this.G0(view);
                }
            });
        }
        this.f31389w.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendActivity.this.H0(i4, view);
            }
        });
        getFriendInfo(i4);
        if (!this.f31386t.isShowing()) {
            this.f31386t.show();
        }
        com.papa.sim.statistic.p.l(this).O1(Event.showInviteCode, new Ext());
    }

    void showInputRoomPwdDialog(final ArenaRequest arenaRequest) {
        if (this.I) {
            this.f31374h.post(new Runnable() { // from class: com.join.mgps.activity.b0
                @Override // java.lang.Runnable
                public final void run() {
                    FriendActivity.this.O0(arenaRequest);
                }
            });
        }
    }

    public void startDownloadActivity(String str, int i4) {
        Intent intent = new Intent(this, NewArenaDownloadActivity_.class);
        intent.putExtra("gameId", str);
        intent.putExtra(NewArenaDownloadActivity_.P, this.f31384r);
        intent.putExtra(NewArenaDownloadActivity_.Q, this.f31383q);
        startActivityForResult(intent, i4);
    }

    void toast(final String str) {
        this.f31374h.post(new Runnable() { // from class: com.join.mgps.activity.s
            @Override // java.lang.Runnable
            public final void run() {
                FriendActivity.this.P0(str);
            }
        });
    }

    @Override // com.join.mgps.adapter.FriendListAdapter.b
    public void u() {
        if (IntentUtil.getInstance().isLogined(this) && !IntentUtil.getInstance().isTourist(this)) {
            y0(1);
        } else {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this).flags(268435456)).start();
        }
    }

    void u0(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.setCustomAnimations(R.anim.from_right, R.anim.out_right);
    }

    void unregisterReceiver() {
        BroadcastReceiver broadcastReceiver = this.f31385s;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    protected int v0() {
        return this instanceof GameMainActivity4_ ? R.id.friendContainer : R.id.frameLayout;
    }

    public void y0(int i4) {
        if (this.f31378l.contains(3)) {
            this.f31378l.remove((Object) 3);
        }
        this.f31378l.push(Integer.valueOf(i4));
        if (this.f31378l.size() > 0) {
            Q0(this.f31378l.getFirst().intValue());
        }
    }

    public void z0() {
        FragmentTransaction beginTransaction = this.f31368b.beginTransaction();
        if (this.f31369c != null) {
            if (this instanceof GameMainActivity4_) {
                u0(beginTransaction);
            }
            beginTransaction.hide(this.f31369c);
        }
        if (this.f31370d != null) {
            u0(beginTransaction);
            beginTransaction.hide(this.f31370d);
        }
        if (this.f31371e != null) {
            u0(beginTransaction);
            beginTransaction.hide(this.f31371e);
        }
        if (this.f31372f != null) {
            u0(beginTransaction);
            beginTransaction.hide(this.f31372f);
        }
        try {
            beginTransaction.commit();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
