.class public interface abstract Lcom/aggmoread/sdk/client/draw/AMDrawAd$DrawVideoListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/draw/AMDrawAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DrawVideoListener"
.end annotation


# virtual methods
.method public abstract onVideoComplete()V
.end method

.method public abstract onVideoError(Lcom/aggmoread/sdk/client/AMError;)V
.end method

.method public abstract onVideoPause()V
.end method

.method public abstract onVideoStart()V
.end method
