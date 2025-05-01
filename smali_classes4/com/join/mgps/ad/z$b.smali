.class Lcom/join/mgps/ad/z$b;
.super Ljava/lang/Object;
.source "TTRewardVideo.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;
.implements Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/ad/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/join/mgps/ad/z;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/z$b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/ad/z$b;->a:Z

    return-void
.end method

.method public fail(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

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

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/ad/z;->v(Lcom/join/mgps/ad/z;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

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

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onRewardVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "rewardVideoAd loaded"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-static {v0, v1}, Lcom/join/mgps/ad/z;->v(Lcom/join/mgps/ad/z;Z)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    iput-boolean v4, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 4
    invoke-static {v0, p1}, Lcom/join/mgps/ad/z;->w(Lcom/join/mgps/ad/z;Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    return-void
.end method

.method public onRewardVideoCached()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "rewardVideoAd video cached"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-static {v0, v1}, Lcom/join/mgps/ad/z;->v(Lcom/join/mgps/ad/z;Z)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    iput-boolean v4, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onVideoCached()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    iget-boolean v1, p0, Lcom/join/mgps/ad/z$b;->a:Z

    invoke-virtual {v0, v1}, Lcom/join/mgps/ad/d;->b(Z)V

    return-void
.end method

.method public onRewardVideoCached(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 2

    .line 6
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/ad/z;->v(Lcom/join/mgps/ad/z;Z)Z

    .line 7
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 8
    invoke-static {v0, p1}, Lcom/join/mgps/ad/z;->w(Lcom/join/mgps/ad/z;Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-virtual {p1}, Lcom/join/mgps/ad/d;->onVideoCached()V

    return-void
.end method

.method public success()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/z$b;->b:Lcom/join/mgps/ad/z;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    return-void
.end method
