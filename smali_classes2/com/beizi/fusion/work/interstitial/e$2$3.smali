.class Lcom/beizi/fusion/work/interstitial/e$2$3;
.super Ljava/lang/Object;
.source "KsNativeInterstitialWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/interstitial/e$2;->onNativeAdLoad(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/interstitial/e$2;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/interstitial/e$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/e$2$3;->a:Lcom/beizi/fusion/work/interstitial/e$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/e$2$3;->a:Lcom/beizi/fusion/work/interstitial/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/interstitial/e$2;->a:Lcom/beizi/fusion/work/interstitial/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/e;->m(Lcom/beizi/fusion/work/interstitial/e;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/e$2$3;->a:Lcom/beizi/fusion/work/interstitial/e$2;

    iget-object p1, p1, Lcom/beizi/fusion/work/interstitial/e$2;->a:Lcom/beizi/fusion/work/interstitial/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/e;->n(Lcom/beizi/fusion/work/interstitial/e;)V

    return-void
.end method
