.class Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;
.super Ljava/lang/Object;
.source "KsNativeInterstitialCustomLayout.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;->a(Landroid/view/View;Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;->a:Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout;

    new-instance v0, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1$1;-><init>(Lcom/beizi/fusion/work/interstitial/KsNativeInterstitialCustomLayout$1;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/FrameLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
