package com.wufan.friend.chat.rpc;

import android.text.TextUtils;
import com.join.mgps.event.q;
import com.wufan.friend.chat.protocol.ChatRoomArgs;
import com.wufan.friend.chat.protocol.HeartArgs;
import com.wufan.friend.chat.protocol.OnlineState;
import com.wufan.friend.chat.protocol.PlayGameArgs;
import com.wufan.friend.chat.protocol.PlayType;
import com.wufan.friend.chat.protocol.RecommendPlayerArgs;
import com.wufan.friend.chat.protocol.ServiceName;
import com.wufan.friend.chat.protocol.ServicePath;
import com.wufan.friend.chat.protocol.a1;
import com.wufan.friend.chat.protocol.e0;
import com.wufan.friend.chat.protocol.i;
import com.wufan.friend.chat.protocol.i0;
import com.wufan.friend.chat.protocol.s1;
import com.wufan.friend.chat.protocol.t0;
import com.wufan.friend.chat.protocol.t1;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: FriendClient.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    Bootstrap f65327b;

    /* renamed from: c  reason: collision with root package name */
    private String f65328c;

    /* renamed from: d  reason: collision with root package name */
    private int f65329d;

    /* renamed from: e  reason: collision with root package name */
    private Channel f65330e;

    /* renamed from: a  reason: collision with root package name */
    EventLoopGroup f65326a = new NioEventLoopGroup();

    /* renamed from: f  reason: collision with root package name */
    boolean f65331f = false;

    /* renamed from: g  reason: collision with root package name */
    long f65332g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FriendClient.java */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d();
        }
    }

    public b(String str, int i4) {
        this.f65328c = str;
        this.f65329d = i4;
        Bootstrap bootstrap = new Bootstrap();
        this.f65327b = bootstrap;
        bootstrap.group(this.f65326a).channel(NioSocketChannel.class).handler(new d());
        this.f65327b.option(ChannelOption.SO_KEEPALIVE, Boolean.TRUE);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(ChannelFuture channelFuture) throws Exception {
        this.f65331f = false;
        if (channelFuture.isSuccess()) {
            this.f65330e = channelFuture.channel();
            org.greenrobot.eventbus.c.f().o(new q(1));
            return;
        }
        channelFuture.channel().eventLoop().schedule((Runnable) new a(), 5L, TimeUnit.SECONDS);
    }

    private void r(s1 s1Var) {
        try {
            Channel channel = this.f65330e;
            if (channel != null && channel.isActive()) {
                this.f65330e.writeAndFlush(s1Var);
                return;
            }
            d();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b(ChatRoomArgs.State state, long j4, int i4) {
        r(s1.w3().l3(ServiceName.BATTLE).g3(ServicePath.BAT_CHAT_ROOM).n3(System.currentTimeMillis()).f3(t1.f4().t3(ChatRoomArgs.g3().Z2(state).Y2(j4).X2(i4).build()).build()).build());
    }

    public void c(String str) {
        r(s1.w3().l3(ServiceName.BATTLE).g3(ServicePath.BAT_CHAT_SEND).n3(System.currentTimeMillis()).f3(t1.f4().r3(i.a3().V2(str).build()).build()).build());
    }

    public void d() {
        try {
            Channel channel = this.f65330e;
            if ((channel == null || !channel.isActive()) && !this.f65331f && System.currentTimeMillis() - this.f65332g >= 2000) {
                this.f65331f = true;
                this.f65332g = System.currentTimeMillis();
                this.f65327b.connect(this.f65328c, this.f65329d).addListener((GenericFutureListener<? extends Future<? super Void>>) new ChannelFutureListener() { // from class: com.wufan.friend.chat.rpc.a
                    @Override // io.netty.util.concurrent.GenericFutureListener
                    public final void operationComplete(ChannelFuture channelFuture) {
                        b.this.p(channelFuture);
                    }
                });
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void e() {
        try {
            Channel channel = this.f65330e;
            if (channel == null || !channel.isActive()) {
                return;
            }
            this.f65330e.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void f(int i4, int i5, String str, boolean z4, long j4, boolean z5) {
        r(s1.w3().l3(ServiceName.BATTLE).g3(ServicePath.BTL_GAME_INVITE).n3(System.currentTimeMillis()).f3(t1.f4().v3(e0.p3().c3(j4).d3(i5).b3(i4).e3(str).a3(z4).g3(z5).build()).build()).build());
    }

    public void g(PlayGameArgs.State state, PlayType playType, long j4, int i4, int i5, boolean z4) {
        r(s1.w3().l3(ServiceName.BATTLE).g3(ServicePath.BTL_GAME_PLAY).n3(System.currentTimeMillis()).f3(t1.f4().D3(PlayGameArgs.w3().h3(state).j3(playType).e3(j4).f3(i4).d3(i5).l3(z4).build()).build()).build());
    }

    public void h(PlayGameArgs.State state, PlayType playType, long j4, int i4, int i5, boolean z4, List<Long> list) {
        r(s1.w3().l3(ServiceName.BATTLE).g3(ServicePath.BTL_GAME_PLAY).n3(System.currentTimeMillis()).f3(t1.f4().D3(PlayGameArgs.w3().h3(state).j3(playType).e3(j4).f3(i4).d3(i5).l3(z4).X0(list).build()).build()).build());
    }

    public void i() {
        r(s1.w3().l3(ServiceName.FRIEND).g3(ServicePath.FRD_GET_ALL_FRIENDS).n3(System.currentTimeMillis()).build());
    }

    public void j(int i4, long j4) {
        r(s1.w3().l3(ServiceName.RECOMMEND).g3(ServicePath.RCM_GET_LOCAL_BATTLE_GAME).n3(System.currentTimeMillis()).f3(t1.f4().z3(i0.c3().X2(j4).W2(i4).build()).build()).build());
    }

    public void k(long j4, String str, List<Long> list, int i4) {
        RecommendPlayerArgs.b p32 = RecommendPlayerArgs.p3();
        if (list != null && list.size() > 0) {
            p32.X0(list);
        }
        r(s1.w3().l3(ServiceName.RECOMMEND).g3(ServicePath.RCM_GET_PLAYER).f3(t1.f4().F3(p32.a3(j4).b3(str).f3(i4).build()).build()).n3(System.currentTimeMillis()).build());
    }

    public void l(long j4, String str, List<Long> list, int i4) {
        RecommendPlayerArgs.b p32 = RecommendPlayerArgs.p3();
        if (list != null && list.size() > 0) {
            p32.X0(list);
        }
        r(s1.w3().l3(ServiceName.RECOMMEND).g3(ServicePath.RCM_GET_PLAYER_V2).f3(t1.f4().F3(p32.a3(j4).b3(str).f3(i4).build()).build()).n3(System.currentTimeMillis()).build());
    }

    public void m() {
        r(s1.w3().l3(ServiceName.SYSTEM).g3(ServicePath.SYS_HEART).f3(t1.f4().x3(HeartArgs.a3().V2(HeartArgs.State.APP).build()).build()).k3(System.currentTimeMillis()).n3(System.currentTimeMillis()).build());
    }

    public boolean n() {
        Channel channel = this.f65330e;
        return channel != null && channel.isActive();
    }

    public boolean o(String str, int i4) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return (this.f65329d == i4 && !TextUtils.isEmpty(this.f65328c) && this.f65328c.equals(str)) ? false : true;
    }

    public void q(String str, String str2) {
        r(s1.w3().l3(ServiceName.SYSTEM).g3(ServicePath.SYS_LOGIN).n3(System.currentTimeMillis()).k3(System.currentTimeMillis()).f3(t1.f4().B3(t0.g3().X2(Integer.parseInt(str)).a3(str2).build()).build()).build());
    }

    public void s(OnlineState onlineState) {
        r(s1.w3().l3(ServiceName.SYSTEM).g3(ServicePath.SYS_ONLINE_STATE).n3(System.currentTimeMillis()).f3(t1.f4().H3(a1.a3().W2(onlineState.getNumber()).build()).build()).build());
    }
}
