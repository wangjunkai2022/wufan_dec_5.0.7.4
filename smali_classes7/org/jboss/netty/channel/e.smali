.class public interface abstract Lorg/jboss/netty/channel/e;
.super Ljava/lang/Object;
.source "Channel.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/jboss/netty/channel/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final t1:I = 0x0

.field public static final u1:I = 0x1

.field public static final w1:I = 0x4

.field public static final x1:I = 0x5


# virtual methods
.method public abstract O()I
.end method

.method public abstract b(Ljava/lang/Object;)V
.end method

.method public abstract bind(Ljava/net/SocketAddress;)Lorg/jboss/netty/channel/j;
.end method

.method public abstract close()Lorg/jboss/netty/channel/j;
.end method

.method public abstract connect(Ljava/net/SocketAddress;)Lorg/jboss/netty/channel/j;
.end method

.method public abstract disconnect()Lorg/jboss/netty/channel/j;
.end method

.method public abstract g()Lorg/jboss/netty/channel/j;
.end method

.method public abstract getConfig()Lorg/jboss/netty/channel/f;
.end method

.method public abstract getId()Ljava/lang/Integer;
.end method

.method public abstract getLocalAddress()Ljava/net/SocketAddress;
.end method

.method public abstract getParent()Lorg/jboss/netty/channel/e;
.end method

.method public abstract getPipeline()Lorg/jboss/netty/channel/n;
.end method

.method public abstract getRemoteAddress()Ljava/net/SocketAddress;
.end method

.method public abstract h(I)Lorg/jboss/netty/channel/j;
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public abstract isBound()Z
.end method

.method public abstract isConnected()Z
.end method

.method public abstract isOpen()Z
.end method

.method public abstract isReadable()Z
.end method

.method public abstract isWritable()Z
.end method

.method public abstract j(Z)Lorg/jboss/netty/channel/j;
.end method

.method public abstract k(Ljava/lang/Object;Ljava/net/SocketAddress;)Lorg/jboss/netty/channel/j;
.end method

.method public abstract t0()Lorg/jboss/netty/channel/j;
.end method

.method public abstract v()Lorg/jboss/netty/channel/i;
.end method

.method public abstract write(Ljava/lang/Object;)Lorg/jboss/netty/channel/j;
.end method
