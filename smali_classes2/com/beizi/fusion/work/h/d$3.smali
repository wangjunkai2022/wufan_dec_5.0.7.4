.class Lcom/beizi/fusion/work/h/d$3;
.super Ljava/lang/Object;
.source "GdtUnifiedCustomWorker.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/d;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qq/e/ads/nativ/NativeADMediaListener;

.field final synthetic b:Lcom/beizi/fusion/work/h/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/d;Lcom/qq/e/ads/nativ/NativeADMediaListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    iput-object p2, p0, Lcom/beizi/fusion/work/h/d$3;->a:Lcom/qq/e/ads/nativ/NativeADMediaListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClicked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/h/a;->aK()V

    return-void
.end method

.method public onADError(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowGdtUnifiedCustomAd onADError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/h/d;->c(Lcom/beizi/fusion/work/h/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onADExposed()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/h/a;->aL()V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/d;->b(Lcom/beizi/fusion/work/h/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v0

    invoke-interface {v0}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->getAdPatternType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 3
    new-instance v0, Lcom/qq/e/ads/cfg/VideoOption$Builder;

    invoke-direct {v0}, Lcom/qq/e/ads/cfg/VideoOption$Builder;-><init>()V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setAutoPlayPolicy(I)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setEnableDetailPage(Z)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    .line 6
    invoke-virtual {v0, v1}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setEnableUserControl(Z)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    .line 7
    invoke-virtual {v0}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->build()Lcom/qq/e/ads/cfg/VideoOption;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/h/d;->b(Lcom/beizi/fusion/work/h/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/h/d$3;->b:Lcom/beizi/fusion/work/h/d;

    iget-object v2, v2, Lcom/beizi/fusion/work/h/a;->t:Landroid/view/ViewGroup;

    check-cast v2, Lcom/qq/e/ads/nativ/MediaView;

    iget-object v3, p0, Lcom/beizi/fusion/work/h/d$3;->a:Lcom/qq/e/ads/nativ/NativeADMediaListener;

    invoke-interface {v1, v2, v0, v3}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->bindMediaView(Lcom/qq/e/ads/nativ/MediaView;Lcom/qq/e/ads/cfg/VideoOption;Lcom/qq/e/ads/nativ/NativeADMediaListener;)V

    :cond_0
    return-void
.end method

.method public onADStatusChanged()V
    .locals 0

    return-void
.end method
