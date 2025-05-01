.class public interface abstract Lcom/aggmoread/sdk/client/AMAdLoader$IAdLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/AMAdLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60c
    name = "IAdLoader"
.end annotation


# virtual methods
.method public abstract loadAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V
.end method

.method public abstract loadAndShowAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V
.end method
