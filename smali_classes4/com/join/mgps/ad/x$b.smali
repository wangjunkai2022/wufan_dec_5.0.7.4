.class Lcom/join/mgps/ad/x$b;
.super Ljava/lang/Object;
.source "TTInteractionRewardVideo.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;
.implements Lcom/bytedance/sdk/openadsdk/TTAdSdk$InitCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/ad/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/join/mgps/ad/x;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/ad/x$b;->a:Z

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/ad/x$b;->a:Z

    return-void
.end method

.method public fail(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/ad/x;->v(Lcom/join/mgps/ad/x;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    iput-boolean v1, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public onFullScreenVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "rewardVideoAd loaded"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    invoke-static {v0, v1}, Lcom/join/mgps/ad/x;->v(Lcom/join/mgps/ad/x;Z)Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    iput-boolean v4, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 4
    invoke-static {v0, p1}, Lcom/join/mgps/ad/x;->w(Lcom/join/mgps/ad/x;Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    iget-boolean v0, p0, Lcom/join/mgps/ad/x$b;->a:Z

    invoke-virtual {p1, v0}, Lcom/join/mgps/ad/d;->b(Z)V

    return-void
.end method

.method public onFullScreenVideoCached()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/ad/x;->v(Lcom/join/mgps/ad/x;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/join/mgps/ad/d;->j:Z

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onVideoCached()V

    return-void
.end method

.method public onFullScreenVideoCached(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V
    .locals 1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/join/mgps/ad/x;->v(Lcom/join/mgps/ad/x;Z)Z

    .line 5
    iget-object p1, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/join/mgps/ad/d;->j:Z

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/ad/d;->onVideoCached()V

    return-void
.end method

.method public success()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/x$b;->b:Lcom/join/mgps/ad/x;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    return-void
.end method
