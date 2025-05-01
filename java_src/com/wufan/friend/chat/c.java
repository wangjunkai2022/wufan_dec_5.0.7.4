package com.wufan.friend.chat;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.n;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.FriendInviteActivity;
import com.join.mgps.activity.GameMainActivity3;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.arena.GameRoomListActivity;
import com.join.mgps.dto.FriendAccountInfo;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendInviteBean;
import com.join.mgps.event.q;
import com.join.mgps.rpc.h;
import com.join.mgps.socket.fight.arena.b;
import com.papa91.arc.bean.ButtonBean;
import com.wufan.friend.chat.protocol.ChatRoomArgs;
import com.wufan.friend.chat.protocol.OnlineState;
import com.wufan.friend.chat.protocol.PlayGameArgs;
import com.wufan.friend.chat.protocol.PlayType;
import com.wufan.user.service.protobuf.n0;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1.f;
/* compiled from: FriendPresenter.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: n  reason: collision with root package name */
    private static volatile c f64887n;

    /* renamed from: a  reason: collision with root package name */
    private Context f64888a;

    /* renamed from: b  reason: collision with root package name */
    com.wufan.friend.chat.rpc.b f64889b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f64891d;

    /* renamed from: f  reason: collision with root package name */
    private FriendAccountInfo f64893f;

    /* renamed from: g  reason: collision with root package name */
    private com.join.mgps.socket.fight.arena.b f64894g;

    /* renamed from: h  reason: collision with root package name */
    FriendBean f64895h;

    /* renamed from: c  reason: collision with root package name */
    Handler f64890c = new Handler();

    /* renamed from: e  reason: collision with root package name */
    private int f64892e = 1;

    /* renamed from: i  reason: collision with root package name */
    LinkedList<FriendInviteBean> f64896i = new LinkedList<>();

    /* renamed from: j  reason: collision with root package name */
    List<FriendBean> f64897j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    final int f64898k = com.join.mgps.socket.entity.b.f54676c;

    /* renamed from: l  reason: collision with root package name */
    private b.InterfaceC0385b f64899l = new b();

    /* renamed from: m  reason: collision with root package name */
    public final SocketListener.NotifyObserver f64900m = new C0684c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FriendPresenter.java */
    /* loaded from: classes6.dex */
    public class a implements GameRoomActivity.x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendBean f64901a;

        a(FriendBean friendBean) {
            this.f64901a = friendBean;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            c cVar = c.this;
            FriendBean friendBean = this.f64901a;
            cVar.f64895h = friendBean;
            if (friendBean == null) {
                return;
            }
            friendBean.setAction("invite");
            c.this.k(this.f64901a.getGameId());
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* compiled from: FriendPresenter.java */
    /* loaded from: classes6.dex */
    class b extends b.c {
        b() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            if (c.this.getContext() instanceof GameMainActivity3) {
                return;
            }
            boolean z4 = c.this.getContext() instanceof GameRoomListActivity;
        }
    }

    /* compiled from: FriendPresenter.java */
    /* renamed from: com.wufan.friend.chat.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0684c implements SocketListener.NotifyObserver {
        C0684c() {
        }

        void a(int i4, String str) {
            if (c.this.f64894g != null) {
                c.this.f64894g.f(ArenaRequestFactory.setRoomPassword(ArenaConstants.REGISTER_TYPE_GAMEROOM, i4, str));
            }
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            int i4 = socketError.errorType;
            if (i4 == 6 || i4 == 2) {
                c.this.X();
            } else if (i4 == 5) {
                c.this.X();
            } else if (i4 == 3 || i4 == 4) {
                c.this.X();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
            if (r14.f64904a.f64895h.getSource() == 2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
            if (r0.getRoomCategory() == com.papa91.battle.protocol.RoomCategory.TOURNAMENT) goto L57;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onServerResponse(app.mgsim.arena.ArenaResponse r15) {
            /*
                Method dump skipped, instructions count: 411
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wufan.friend.chat.c.C0684c.onServerResponse(app.mgsim.arena.ArenaResponse):void");
        }
    }

    public c(Context context) {
        this.f64888a = context;
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(FriendBean friendBean) {
        this.f64897j.remove(friendBean);
        org.greenrobot.eventbus.c.f().o(new q(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(PlayGameArgs.State state, PlayType playType, long j4, int i4, int i5) {
        List<DownloadTask> s4 = f.K().s();
        ArrayList arrayList = new ArrayList();
        for (DownloadTask downloadTask : s4) {
            arrayList.add(Long.valueOf(downloadTask.getCrc_link_type_val()));
        }
        com.wufan.friend.chat.rpc.b bVar = this.f64889b;
        bVar.h(state, playType, j4, i4, i5, Y(j4 + ""), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        try {
            Toast.makeText(getContext(), "网络不稳定，请重试", 0).show();
        } catch (Exception unused) {
        }
    }

    public static c u() {
        if (f64887n == null) {
            f64887n = new c(MApplication.j());
        }
        return f64887n;
    }

    public int A() {
        return this.f64892e;
    }

    public void B() {
        if (this.f64888a == null) {
            return;
        }
        this.f64889b.m();
    }

    public void C() {
        String str = h.J;
        int i4 = h.K;
        try {
            com.wufan.friend.chat.rpc.b bVar = this.f64889b;
            if (bVar != null && !bVar.o(str, i4)) {
                this.f64889b.d();
            }
            this.f64889b = new com.wufan.friend.chat.rpc.b(str, i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean D() {
        FriendAccountInfo friendAccountInfo = this.f64893f;
        return friendAccountInfo != null && friendAccountInfo.isBanned();
    }

    public boolean E(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<FriendBean> it2 = this.f64897j.iterator();
        while (it2.hasNext()) {
            FriendBean next = it2.next();
            if (System.currentTimeMillis() - next.getTimestamp() > AbstractTrafficShapingHandler.DEFAULT_MAX_TIME) {
                it2.remove();
            } else {
                if (str.equals(next.getUid() + "")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean F() {
        return this.f64889b.n() && this.f64891d;
    }

    public boolean G(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    void H(int i4, String str, boolean z4) {
        com.join.mgps.socket.fight.arena.b bVar = this.f64894g;
        if (bVar != null) {
            if (bVar.d().s()) {
                this.f64894g.f(ArenaRequestFactory.joinRoom(z(), i4, str, z4));
                return;
            }
            ArenaRequest login = ArenaRequestFactory.login(z());
            login.isRefreshing = true;
            login.isElite = false;
            this.f64894g.f(login);
        }
    }

    public void K() {
        n0 accountData;
        Context context = this.f64888a;
        if (context == null || (accountData = AccountUtil_.getInstance_(context).getAccountData()) == null) {
            return;
        }
        L(accountData.getUid(), accountData.getToken());
    }

    public void L(int i4, String str) {
        if (this.f64888a == null) {
            return;
        }
        this.f64889b.q(String.valueOf(i4), str);
    }

    public void M() {
        com.wufan.friend.chat.rpc.b bVar;
        try {
            this.f64891d = false;
            this.f64892e = 1;
            this.f64893f = null;
            if (this.f64888a == null || (bVar = this.f64889b) == null || !bVar.n()) {
                return;
            }
            this.f64889b.e();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void N() {
        LinkedList<FriendInviteBean> linkedList = this.f64896i;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        org.greenrobot.eventbus.c.f().o(this.f64896i.getFirst());
    }

    public void O() {
        LinkedList<FriendInviteBean> linkedList = this.f64896i;
        FriendInviteBean pop = (linkedList == null || linkedList.size() <= 0) ? null : this.f64896i.pop();
        if (pop != null) {
            FriendBean friendBean = new FriendBean();
            friendBean.setRoomPwd(pop.getRoomPasswd());
            friendBean.setRoomId(pop.getLobbyRoomId());
            friendBean.setElite(pop.isEliteField());
            friendBean.setSource(pop.getSource());
            p(friendBean);
        }
        LinkedList<FriendInviteBean> linkedList2 = this.f64896i;
        if (linkedList2 == null || linkedList2.size() <= 0) {
            return;
        }
        this.f64896i.clear();
    }

    public void P() {
        FriendInviteBean pop;
        LinkedList<FriendInviteBean> linkedList = this.f64896i;
        if (linkedList != null && linkedList.size() > 0 && (pop = this.f64896i.pop()) != null) {
            q qVar = new q(5);
            qVar.m(pop.getFromAccountId());
            org.greenrobot.eventbus.c.f().o(qVar);
        }
        N();
    }

    public void Q() {
        FriendInviteBean pop;
        LinkedList<FriendInviteBean> linkedList = this.f64896i;
        if (linkedList != null && linkedList.size() > 0 && (pop = this.f64896i.pop()) != null) {
            new q(5).m(pop.getFromAccountId());
        }
        N();
    }

    public void R(FriendInviteBean friendInviteBean) {
        FriendInviteBean first;
        LinkedList<FriendInviteBean> linkedList = this.f64896i;
        if (linkedList == null || friendInviteBean == null) {
            return;
        }
        if (linkedList.size() >= 5) {
            first = this.f64896i.size() > 0 ? this.f64896i.getFirst() : null;
            if (n.G(getContext())) {
                Activity w4 = n.w();
                if (w4 == null || !(w4 instanceof FriendInviteActivity)) {
                    org.greenrobot.eventbus.c.f().o(first);
                    return;
                }
                return;
            }
            org.greenrobot.eventbus.c.f().o(first);
            return;
        }
        this.f64896i.addLast(friendInviteBean);
        first = this.f64896i.size() > 0 ? this.f64896i.getFirst() : null;
        if (n.G(getContext())) {
            Activity w5 = n.w();
            if (w5 == null || !(w5 instanceof FriendInviteActivity)) {
                org.greenrobot.eventbus.c.f().o(first);
                return;
            }
            return;
        }
        org.greenrobot.eventbus.c.f().o(first);
    }

    public void S(FriendAccountInfo friendAccountInfo) {
        this.f64893f = friendAccountInfo;
    }

    public void T(boolean z4) {
        this.f64891d = z4;
    }

    public void U(int i4) {
        OnlineState onlineState;
        if (this.f64888a == null) {
            return;
        }
        if (i4 == 0) {
            onlineState = OnlineState.ONLINE;
        } else if (i4 == 1) {
            onlineState = OnlineState.INVISIBLE;
        } else {
            onlineState = OnlineState.OFFLINE;
        }
        this.f64889b.s(onlineState);
    }

    public void V(FriendBean friendBean) {
        this.f64895h = friendBean;
    }

    public void W(int i4) {
        this.f64892e = i4;
    }

    boolean Y(String str) {
        try {
            DownloadTask F = f.K().F(str);
            if (F != null && !TextUtils.isEmpty(F.getFight_fun()) && F.getFight_fun().length() >= 7) {
                return F.getFight_fun().toCharArray()[6] == '1';
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    public void Z() {
        try {
            com.join.mgps.socket.fight.arena.b bVar = this.f64894g;
            if (bVar != null && bVar.d() != null) {
                this.f64894g.d().A(this.f64900m);
            }
            com.join.mgps.socket.fight.arena.b bVar2 = this.f64894g;
            if (bVar2 != null) {
                bVar2.g();
                this.f64894g.stopService();
                this.f64894g = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void e(final FriendBean friendBean) {
        if (friendBean == null) {
            return;
        }
        friendBean.setTimestamp(System.currentTimeMillis());
        this.f64897j.add(friendBean);
        org.greenrobot.eventbus.c.f().o(new q(10));
        this.f64890c.postDelayed(new Runnable() { // from class: com.wufan.friend.chat.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.I(friendBean);
            }
        }, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
    }

    public void f(Activity activity) {
        try {
            if (this.f64894g == null) {
                com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(activity, this.f64899l);
                this.f64894g = bVar;
                bVar.bindService();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void g() {
        this.f64891d = false;
        if (this.f64888a == null) {
            return;
        }
        this.f64889b.e();
        this.f64889b.d();
    }

    Context getContext() {
        Activity activity = MApplication.f1497x.getActivity();
        this.f64888a = activity;
        if (activity == null) {
            this.f64888a = n.w();
        }
        if (this.f64888a == null) {
            this.f64888a = MApplication.j();
        }
        return this.f64888a;
    }

    public void h(String str) {
        com.wufan.friend.chat.rpc.b bVar = this.f64889b;
        if (bVar == null) {
            return;
        }
        bVar.c(str);
    }

    public void i(int i4, long j4) {
        try {
            com.wufan.friend.chat.rpc.b bVar = this.f64889b;
            if (bVar == null) {
                return;
            }
            ChatRoomArgs.State state = null;
            if (i4 == 0) {
                state = ChatRoomArgs.State.JOIN;
            } else if (i4 == 1) {
                state = ChatRoomArgs.State.LEAVE;
            }
            bVar.b(state, j4, Integer.parseInt(AccountUtil_.getInstance_(this.f64888a).getUid()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean j(ArenaResponse arenaResponse) {
        if (w() != null) {
            this.f64900m.onServerResponse(arenaResponse);
            return true;
        }
        return false;
    }

    void k(String str) {
        DownloadTask F;
        Context context = getContext();
        if (TextUtils.isEmpty(str) || (F = f.K().F(str)) == null) {
            return;
        }
        if (j.j(context)) {
            if (IntentUtil.getInstance().goLoginBattle(context)) {
                return;
            }
            if (UtilsMy.W(context, F) == null) {
                l2.a(context).b("正在下载插件...");
                return;
            }
            com.join.mgps.socket.fight.arena.b bVar = this.f64894g;
            if (bVar == null || bVar.d() == null) {
                return;
            }
            if (this.f64894g.d().s()) {
                this.f64894g.f(ArenaRequestFactory.createRoom(z(), str, 0, AccountUtil_.getInstance_(context).getAccountData().getUid(), true));
                return;
            }
            ArenaRequest login = ArenaRequestFactory.login(z());
            login.isRefreshing = true;
            login.isElite = false;
            this.f64894g.f(login);
            return;
        }
        l2.a(context).b("无网络连接");
    }

    public int l(String str) {
        try {
            Matcher matcher = Pattern.compile("\\$(.*?)\\$").matcher(str);
            while (matcher.find()) {
                String group = matcher.group(1);
                if (!TextUtils.isEmpty(group)) {
                    String trim = new String(com.join.mgps.Util.j.b().f(group.getBytes())).trim();
                    if (G(trim)) {
                        return Integer.parseInt(trim);
                    }
                }
            }
            return 0;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public String m(int i4) {
        try {
            return String.format("复制口令$%s$打开悟饭游戏厅，加我好友【下载地址https://tuis.12345fun.com/?aid=7Fp12l】", new String(com.join.mgps.Util.j.b().g(String.format("%10d", Integer.valueOf(i4)).getBytes())));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "复制口令$%s$打开悟饭游戏厅，加我好友【下载地址https://tuis.12345fun.com/?aid=7Fp12l】";
        }
    }

    public void n(int i4, int i5, String str, boolean z4, long j4) {
        com.wufan.friend.chat.rpc.b bVar = this.f64889b;
        if (bVar == null) {
            return;
        }
        bVar.f(i4, i5, str, z4, j4, Y(j4 + ""));
    }

    public void o(FriendBean friendBean) {
        UtilsMy.z0(getContext(), 1, "", "FIGHT_LOBBY", new a(friendBean));
    }

    public void p(FriendBean friendBean) {
        this.f64895h = friendBean;
        if (friendBean == null) {
            return;
        }
        friendBean.setAction("join");
        H(friendBean.getRoomId(), friendBean.getRoomPwd(), friendBean.isElite());
    }

    public void q(int i4, int i5, final long j4, final int i6, final int i7) {
        if (this.f64889b == null) {
            return;
        }
        PlayGameArgs.State state = null;
        if (i4 == 0) {
            state = PlayGameArgs.State.START;
        } else if (i4 == 2) {
            state = PlayGameArgs.State.OVER;
        }
        final PlayGameArgs.State state2 = state;
        final PlayType x4 = x(i5);
        this.f64890c.post(new Runnable() { // from class: com.wufan.friend.chat.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.J(state2, x4, j4, i6, i7);
            }
        });
        if (i4 != 2 || i6 == 0) {
            return;
        }
        i(1, i6);
    }

    public FriendAccountInfo r() {
        return this.f64893f;
    }

    public FriendInviteBean s() {
        if (this.f64896i.size() > 0) {
            return this.f64896i.getFirst();
        }
        return null;
    }

    public void t() {
        if (this.f64888a == null) {
            return;
        }
        this.f64889b.i();
    }

    public void v(int i4, long j4) {
        com.wufan.friend.chat.rpc.b bVar = this.f64889b;
        if (bVar == null) {
            return;
        }
        bVar.j(i4, j4);
    }

    public FriendBean w() {
        return this.f64895h;
    }

    PlayType x(int i4) {
        if (i4 == 0) {
            return PlayType.STAND;
        }
        if (i4 != 8 && i4 != 9 && i4 != 10 && i4 != 11 && i4 != 12) {
            return PlayType.UNRECOGNIZED;
        }
        return PlayType.NET_BATTLE;
    }

    public void y(long j4, String str, List<Long> list, int i4) {
        if (this.f64888a == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f64889b.l(j4, str, list, i4);
    }

    String z() {
        return ArenaConstants.REGISTER_TYPE_PUBLIC;
    }
}
