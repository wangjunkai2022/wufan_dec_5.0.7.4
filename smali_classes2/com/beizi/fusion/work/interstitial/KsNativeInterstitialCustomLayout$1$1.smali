.class Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1$1;
.super Ljava/lang/Object;
.source "KsNativeInterstitialCustomLayout.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;->a(Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;)Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;

    iget-object v0, v0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;->a(Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;)Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$a;->b()V

    :cond_0
    return-void
.end method
