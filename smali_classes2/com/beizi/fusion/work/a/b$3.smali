.class Lcom/beizi/fusion/work/a/b$3;
.super Ljava/lang/Object;
.source "BeiZiBannerAdWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/a/b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/AdRequest;

.field final synthetic b:Lcom/beizi/fusion/work/a/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/a/b;Lcom/beizi/ad/AdRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a/b$3;->b:Lcom/beizi/fusion/work/a/b;

    iput-object p2, p0, Lcom/beizi/fusion/work/a/b$3;->a:Lcom/beizi/ad/AdRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a/b$3;->b:Lcom/beizi/fusion/work/a/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/a/b;->a(Lcom/beizi/fusion/work/a/b;)Lcom/beizi/ad/BannerAdView;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a/b$3;->a:Lcom/beizi/ad/AdRequest;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/BannerAdView;->loadAd(Lcom/beizi/ad/AdRequest;)V

    return-void
.end method
