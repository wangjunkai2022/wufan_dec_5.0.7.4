.class Lcom/beizi/fusion/work/g/e$2;
.super Ljava/lang/Object;
.source "KsRewardVideoWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsLoadManager$RewardVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/g/e;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/g/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/g/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKsRewardedVideo Callback --> onError: code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \uff0cmessage= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/g/e;->a(Lcom/beizi/fusion/work/g/e;Ljava/lang/String;I)V

    return-void
.end method

.method public onRewardVideoAdLoad(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsRewardVideoAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/e;->a(Lcom/beizi/fusion/work/g/e;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/e;->a(Lcom/beizi/fusion/work/g/e;)V

    if-eqz p1, :cond_3

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/KsRewardVideoAd;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/g/e;->a(Lcom/beizi/fusion/work/g/e;Lcom/kwad/sdk/api/KsRewardVideoAd;)Lcom/kwad/sdk/api/KsRewardVideoAd;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/e;->b(Lcom/beizi/fusion/work/g/e;)Lcom/kwad/sdk/api/KsRewardVideoAd;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/e;->b(Lcom/beizi/fusion/work/g/e;)Lcom/kwad/sdk/api/KsRewardVideoAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsRewardVideoAd;->getECPM()I

    move-result v0

    int-to-double v0, v0

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/g/e;->a(Lcom/beizi/fusion/work/g/e;D)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/e;->c(Lcom/beizi/fusion/work/g/e;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/e;->d(Lcom/beizi/fusion/work/g/e;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/e;->e(Lcom/beizi/fusion/work/g/e;)V

    :goto_0
    return-void

    .line 10
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/beizi/fusion/work/g/e$2;->a:Lcom/beizi/fusion/work/g/e;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/g/e;->b(Lcom/beizi/fusion/work/g/e;I)V

    return-void
.end method

.method public onRewardVideoResult(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/api/KsRewardVideoAd;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
