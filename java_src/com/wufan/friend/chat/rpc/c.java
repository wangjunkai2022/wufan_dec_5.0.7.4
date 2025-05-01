package com.wufan.friend.chat.rpc;

import com.join.mgps.Util.w0;
import com.wufan.friend.chat.protocol.w1;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
/* compiled from: FriendClientHandler.java */
/* loaded from: classes6.dex */
public class c extends SimpleChannelInboundHandler<w1> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.netty.channel.SimpleChannelInboundHandler
    /* renamed from: a */
    public void channelRead0(ChannelHandlerContext channelHandlerContext, w1 w1Var) throws Exception {
        w0.e("channelRead0", w1Var.toString());
        org.greenrobot.eventbus.c.f().o(w1Var);
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        w0.e("channelInactive", "channelActive");
        super.channelActive(channelHandlerContext);
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelInactive(channelHandlerContext);
        w0.e("channelInactive", "连接断开");
        com.wufan.friend.chat.c.u().T(false);
    }

    @Override // io.netty.channel.ChannelInboundHandlerAdapter, io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
        w0.e("channelInactive", "userEventTriggered");
        if (obj instanceof IdleStateEvent) {
            if (((IdleStateEvent) obj).state() == IdleState.WRITER_IDLE) {
                com.wufan.friend.chat.c.u().B();
                return;
            }
            return;
        }
        super.userEventTriggered(channelHandlerContext, obj);
    }
}
