.class public final Lcom/beizi/ad/NativeAd;
.super Ljava/lang/Object;
.source "NativeAd.java"

# interfaces
.implements Lcom/beizi/ad/AdLifeControl;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/beizi/ad/internal/nativead/b;

.field private h:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ILcom/beizi/ad/NativeAdListener;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/ad/internal/nativead/b;

    invoke-direct {v0, p1, p2, p3}, Lcom/beizi/ad/internal/nativead/b;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    .line 3
    invoke-virtual {v0, p4}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/NativeAdListener;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/beizi/ad/internal/nativead/b;->a:Lcom/beizi/ad/internal/c;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method public getAdId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/nativead/b;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getAdListener()Lcom/beizi/ad/NativeAdListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/nativead/b;->f()Lcom/beizi/ad/NativeAdListener;

    move-result-object v0

    return-object v0
.end method

.method public getAdOptimizePercent()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/NativeAd;->a:I

    return v0
.end method

.method public getAdOptimizeSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/NativeAd;->b:I

    return v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/nativead/b;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDirection()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderOptimizeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->f:Ljava/util/List;

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/internal/nativead/b;->d()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getScrollDistance()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getScrollDistancePercent()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/NativeAd;->d:I

    return v0
.end method

.method public getValidOptimizePercent()I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beizi/ad/internal/nativead/b;->i()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/nativead/b;->i()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/beizi/ad/NativeAd;->f:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, -0x1

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Pair;

    .line 5
    iget-object v5, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 6
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :cond_2
    if-ne v3, v1, :cond_3

    .line 7
    iget v3, p0, Lcom/beizi/ad/NativeAd;->a:I

    :cond_3
    return v3
.end method

.method public loadAd()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/nativead/b;->a(Lcom/beizi/ad/internal/network/a$a;)Z

    return-void
.end method

.method public onCreateLifeCycle()V
    .locals 0

    return-void
.end method

.method public onDestoryLifeCycle()V
    .locals 0

    return-void
.end method

.method public onPauseLifeCycle()V
    .locals 0

    return-void
.end method

.method public onRestartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onResumeLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStopLifeCycle()V
    .locals 0

    return-void
.end method

.method public openAdInNativeBrowser(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/nativead/b;->a(Z)V

    return-void
.end method

.method public optimizeClickArea(ILandroid/view/View;Landroid/view/View;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/NativeAd;->getValidOptimizePercent()I

    move-result v0

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/lance/a/o;->a(I)Z

    move-result v1

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "percent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",isPass = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "BeiZisAd"

    invoke-static {v2, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p1, p2, p3, p4}, Lcom/beizi/ad/lance/a/g;->a(ILandroid/view/View;Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/NativeAd;->h:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public setAdOptimizePercent(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/NativeAd;->a:I

    return-void
.end method

.method public setAdOptimizeSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/NativeAd;->b:I

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/nativead/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public setCloseMarketDialog(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/nativead/b;->b(Z)V

    :cond_0
    return-void
.end method

.method public setDirection(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/NativeAd;->e:Ljava/lang/String;

    return-void
.end method

.method public setOrderOptimizeList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/NativeAd;->f:Ljava/util/List;

    return-void
.end method

.method public setScrollDistance(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/NativeAd;->c:Ljava/lang/String;

    return-void
.end method

.method public setScrollDistancePercent(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/ad/NativeAd;->d:I

    return-void
.end method

.method public setTouchAreaNormal()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->h:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/ViewUtil;->removeChildFromParent(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public shouldLoadIcon(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/nativead/b;->d(Z)V

    return-void
.end method

.method public shouldLoadImage(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/NativeAd;->g:Lcom/beizi/ad/internal/nativead/b;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/nativead/b;->c(Z)V

    return-void
.end method
