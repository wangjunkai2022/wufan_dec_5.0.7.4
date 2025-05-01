.class Lcom/beizi/fusion/work/g/d$2;
.super Ljava/lang/Object;
.source "HwRewardVideoWorker.java"

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/listeners/RewardAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/g/d;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/g/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/g/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdFailed(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showHwRewardedVideo Callback --> onAdFailed: errorCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/g/d;->a(Lcom/beizi/fusion/work/g/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdsLoaded(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/huawei/openalliance/ad/inter/data/IRewardAd;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/d;->a(Lcom/beizi/fusion/work/g/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->a(Lcom/beizi/fusion/work/g/d;)V

    if-nez p1, :cond_0

    .line 3
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/g/d;->b(Lcom/beizi/fusion/work/g/d;I)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/d;->b(Lcom/beizi/fusion/work/g/d;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/g/d;->a(Lcom/beizi/fusion/work/g/d;Ljava/util/List;)Ljava/util/List;

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/d;->c(Lcom/beizi/fusion/work/g/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/d;->d(Lcom/beizi/fusion/work/g/d;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/g/d$2;->a:Lcom/beizi/fusion/work/g/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/d;->e(Lcom/beizi/fusion/work/g/d;)V

    :goto_0
    return-void
.end method
