.class Lcom/beizi/fusion/work/f/d$3;
.super Ljava/lang/Object;
.source "GdtNativeUnifiedWorker.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/f/d;->aU()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/f/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/f/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClicked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->b()V

    return-void
.end method

.method public onADError(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowGdtNativeUnifiedAd onADError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/f/d;->c(Lcom/beizi/fusion/work/f/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onADExposed()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/f/a;->ab()V

    .line 2
    new-instance v0, Lcom/qq/e/ads/cfg/VideoOption$Builder;

    invoke-direct {v0}, Lcom/qq/e/ads/cfg/VideoOption$Builder;-><init>()V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setAutoPlayPolicy(I)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    .line 4
    invoke-virtual {v0}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->build()Lcom/qq/e/ads/cfg/VideoOption;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/f/d;->aP()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/f/d;->b(Lcom/beizi/fusion/work/f/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/f/d;->d(Lcom/beizi/fusion/work/f/d;)Lcom/qq/e/ads/nativ/MediaView;

    move-result-object v2

    iget-object v3, p0, Lcom/beizi/fusion/work/f/d$3;->a:Lcom/beizi/fusion/work/f/d;

    invoke-static {v3}, Lcom/beizi/fusion/work/f/d;->e(Lcom/beizi/fusion/work/f/d;)Lcom/qq/e/ads/nativ/NativeADMediaListener;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->bindMediaView(Lcom/qq/e/ads/nativ/MediaView;Lcom/qq/e/ads/cfg/VideoOption;Lcom/qq/e/ads/nativ/NativeADMediaListener;)V

    :cond_0
    return-void
.end method

.method public onADStatusChanged()V
    .locals 0

    return-void
.end method
