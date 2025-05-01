.class Lcom/join/mgps/ad/s$a;
.super Ljava/lang/Object;
.source "RERewardVideo.java"

# interfaces
.implements Lcom/aggmoread/sdk/client/reward/AMRewardAdListener;
.implements Lcom/aggmoread/sdk/client/reward/AMRewardInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/ad/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/join/mgps/ad/s;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/s$a;->a:Z

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/ad/s$a;->a:Z

    return-void
.end method

.method public onAdClicked()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "rewardVideoAd bar click"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onAdClosed()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onADClose()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/ad/d;->c(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    iget v2, v0, Lcom/join/mgps/ad/d;->g:I

    iget v3, v0, Lcom/join/mgps/ad/d;->h:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/ad/d;->a(Ljava/lang/String;II)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    iget v2, v0, Lcom/join/mgps/ad/d;->g:I

    iget v3, v0, Lcom/join/mgps/ad/d;->h:I

    iget-object v4, v0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/join/mgps/ad/d;->d(Ljava/lang/String;IILjava/util/Map;)V

    return-void
.end method

.method public onAdError(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/ad/s;->v(Lcom/join/mgps/ad/s;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iput-boolean v1, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 3
    iget-object v1, v0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    const/4 v2, 0x5

    if-eqz v1, :cond_0

    .line 4
    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {v0, v2, v1}, Lcom/join/mgps/ad/d;->j(Landroid/content/Context;ILjava/util/Map;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    :goto_0
    if-eqz p1, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget v1, p1, Lcom/aggmoread/sdk/client/AMError;->code:I

    iget-object p1, p1, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    goto :goto_1

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    const/4 v0, -0x1

    const-string v1, "\u672a\u77e5\u9519\u8bef"

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public onAdExposed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/ad/s;->v(Lcom/join/mgps/ad/s;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onADShow()V

    return-void
.end method

.method public onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    const/4 v2, 0x5

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {v0, v2, v1}, Lcom/join/mgps/ad/d;->j(Landroid/content/Context;ILjava/util/Map;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    :goto_0
    if-eqz p1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget v1, p1, Lcom/aggmoread/sdk/client/AMError;->code:I

    iget-object p1, p1, Lcom/aggmoread/sdk/client/AMError;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    goto :goto_1

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    const/4 v0, -0x1

    const-string v1, "\u672a\u77e5\u9519\u8bef"

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/reward/AMRewardAd;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "rewardVideoAd loaded"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    invoke-static {v0, v1}, Lcom/join/mgps/ad/s;->v(Lcom/join/mgps/ad/s;Z)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iput-boolean v4, v0, Lcom/join/mgps/ad/d;->j:Z

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    invoke-static {v0, p1}, Lcom/join/mgps/ad/s;->w(Lcom/join/mgps/ad/s;Lcom/aggmoread/sdk/client/reward/AMRewardAd;)Lcom/aggmoread/sdk/client/reward/AMRewardAd;

    :cond_0
    return-void
.end method

.method public onAdVideoCached()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "rewardVideoAd video cached"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    invoke-static {v0, v1}, Lcom/join/mgps/ad/s;->v(Lcom/join/mgps/ad/s;Z)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iput-boolean v4, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onVideoCached()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-boolean v1, p0, Lcom/join/mgps/ad/s$a;->a:Z

    invoke-virtual {v0, v1}, Lcom/join/mgps/ad/d;->b(Z)V

    return-void
.end method

.method public onReward(Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object p1, p1, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v0, 0x6

    invoke-static {p1, v0}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    return-void
.end method

.method public onVideoComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/s$a;->b:Lcom/join/mgps/ad/s;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onVideoComplete()V

    return-void
.end method
