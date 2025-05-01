.class public interface abstract Lc4/b;
.super Ljava/lang/Object;
.source "ChannelGroupFuture.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lorg/jboss/netty/channel/j;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract E(Lc4/c;)V
.end method

.method public abstract P()Z
.end method

.method public abstract a0(Lc4/c;)V
.end method

.method public abstract await()Lc4/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method

.method public abstract await(J)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method

.method public abstract await(JLjava/util/concurrent/TimeUnit;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation
.end method

.method public abstract awaitUninterruptibly()Lc4/b;
.end method

.method public abstract awaitUninterruptibly(J)Z
.end method

.method public abstract awaitUninterruptibly(JLjava/util/concurrent/TimeUnit;)Z
.end method

.method public abstract d(Lorg/jboss/netty/channel/e;)Lorg/jboss/netty/channel/j;
.end method

.method public abstract e0()Z
.end method

.method public abstract getGroup()Lc4/a;
.end method

.method public abstract isDone()Z
.end method

.method public abstract isPartialFailure()Z
.end method

.method public abstract isPartialSuccess()Z
.end method

.method public abstract iterator()Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/jboss/netty/channel/j;",
            ">;"
        }
    .end annotation
.end method

.method public abstract l(Ljava/lang/Integer;)Lorg/jboss/netty/channel/j;
.end method
