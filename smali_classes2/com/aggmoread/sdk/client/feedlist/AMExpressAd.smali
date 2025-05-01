.class public interface abstract Lcom/aggmoread/sdk/client/feedlist/AMExpressAd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/client/AMAdInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;
    }
.end annotation


# virtual methods
.method public abstract getView()Landroid/view/View;
.end method

.method public abstract recycle()V
.end method

.method public abstract render()V
.end method

.method public abstract renderActivity(Landroid/app/Activity;)V
.end method

.method public abstract setInteractionListener(Lcom/aggmoread/sdk/client/feedlist/AMExpressInteractionListener;)V
.end method

.method public abstract setMediaListener(Lcom/aggmoread/sdk/client/feedlist/AMExpressAd$ExpressMediaListener;)V
.end method
