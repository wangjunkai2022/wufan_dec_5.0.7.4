.class Lcom/beizi/ad/internal/view/AdViewImpl$b$1;
.super Ljava/lang/Object;
.source "AdViewImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl$b;->a(Lcom/beizi/ad/internal/network/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/network/b;

.field final synthetic b:Lcom/beizi/ad/internal/view/AdViewImpl$b;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl$b;Lcom/beizi/ad/internal/network/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->c()Lcom/beizi/ad/internal/view/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/beizi/ad/internal/view/c;->getCreativeWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setCreativeWidth(I)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->c()Lcom/beizi/ad/internal/view/c;

    move-result-object v1

    invoke-interface {v1}, Lcom/beizi/ad/internal/view/c;->getCreativeHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setCreativeHeight(I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdExtInfo(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setPrice(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdId(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v0}, Lcom/beizi/ad/internal/network/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->c()Lcom/beizi/ad/internal/view/c;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/internal/a/e;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Lcom/beizi/ad/internal/a/e;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 8
    :catch_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "The SDK shouldn\'t fail downcasts to MediatedDisplayable in AdView"

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->c()Lcom/beizi/ad/internal/view/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Lcom/beizi/ad/internal/view/c;)V

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-boolean v1, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    if-nez v1, :cond_2

    .line 11
    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v0}, Lcom/beizi/ad/internal/network/b;->a()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v0}, Lcom/beizi/ad/internal/network/b;->a()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->h(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    goto :goto_1

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/AdListener;->onAdLoaded()V

    .line 15
    :goto_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v0}, Lcom/beizi/ad/internal/network/b;->d()Lcom/beizi/ad/NativeAdResponse;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 16
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->a:Lcom/beizi/ad/internal/network/b;

    invoke-interface {v1}, Lcom/beizi/ad/internal/network/b;->d()Lcom/beizi/ad/NativeAdResponse;

    move-result-object v1

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getLandingPageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->setLandingPageUrl(Ljava/lang/String;)V

    goto :goto_2

    .line 17
    :cond_2
    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->i(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/RewardedVideoAdListener;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/AdViewImpl$b;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl$b;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->i(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/RewardedVideoAdListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/RewardedVideoAdListener;->onRewardedVideoAdLoaded()V

    :cond_3
    :goto_2
    return-void
.end method
