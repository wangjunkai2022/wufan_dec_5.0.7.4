.class Lcom/beizi/fusion/work/b/a$3;
.super Ljava/lang/Object;
.source "CsjDrawAdWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd$ExpressVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/b/a;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/b/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/b/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/b/a$3;->a:Lcom/beizi/fusion/work/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClickRetry()V
    .locals 0

    return-void
.end method

.method public onProgressUpdate(JJ)V
    .locals 0

    return-void
.end method

.method public onVideoAdComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/b/a$3;->a:Lcom/beizi/fusion/work/b/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/a;->b(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/b/a$3;->a:Lcom/beizi/fusion/work/b/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/b/a;->c(Lcom/beizi/fusion/work/b/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->l()V

    :cond_0
    return-void
.end method

.method public onVideoAdContinuePlay()V
    .locals 0

    return-void
.end method

.method public onVideoAdPaused()V
    .locals 0

    return-void
.end method

.method public onVideoAdStartPlay()V
    .locals 0

    return-void
.end method

.method public onVideoError(II)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjDrawAd Callback --> onVideoError() errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", extraCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/b/a$3;->a:Lcom/beizi/fusion/work/b/a;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/b/a;->b(Lcom/beizi/fusion/work/b/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onVideoLoad()V
    .locals 0

    return-void
.end method
