.class Lcom/beizi/fusion/work/g/b$2;
.super Ljava/lang/Object;
.source "CsjRewardVideoWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$RewardVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/g/b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/g/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/g/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->y(Lcom/beizi/fusion/work/g/b;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/work/g/b$2$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/g/b$2$1;-><init>(Lcom/beizi/fusion/work/g/b$2;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;->setRewardAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd$RewardAdInteractionListener;)V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjRewardedVideo Callback --> onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/g/b;->a(Lcom/beizi/fusion/work/g/b;Ljava/lang/String;I)V

    return-void
.end method

.method public onRewardVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/g/b;->a(Lcom/beizi/fusion/work/g/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/g/b;->a(Lcom/beizi/fusion/work/g/b;)V

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/g/b;->b(Lcom/beizi/fusion/work/g/b;I)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/g/b;->a(Lcom/beizi/fusion/work/g/b;Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;

    .line 5
    invoke-direct {p0}, Lcom/beizi/fusion/work/g/b$2;->a()V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/b;->b(Lcom/beizi/fusion/work/g/b;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/b;->c(Lcom/beizi/fusion/work/g/b;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/g/b$2;->a:Lcom/beizi/fusion/work/g/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/g/b;->d(Lcom/beizi/fusion/work/g/b;)V

    :goto_0
    return-void
.end method

.method public onRewardVideoCached()V
    .locals 0

    return-void
.end method

.method public onRewardVideoCached(Lcom/bytedance/sdk/openadsdk/TTRewardVideoAd;)V
    .locals 0

    return-void
.end method
