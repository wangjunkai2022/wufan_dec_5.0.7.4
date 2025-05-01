.class Lcom/beizi/fusion/work/c/b$2;
.super Ljava/lang/Object;
.source "CsjFullScreenVideoWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$FullScreenVideoAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/c/b;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/c/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/c/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/c/b;->t(Lcom/beizi/fusion/work/c/b;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/work/c/b$2$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/c/b$2$1;-><init>(Lcom/beizi/fusion/work/c/b$2;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->setFullScreenVideoAdInteractionListener(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd$FullScreenVideoAdInteractionListener;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/c/b;->t(Lcom/beizi/fusion/work/c/b;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/work/c/b$2$2;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/c/b$2$2;-><init>(Lcom/beizi/fusion/work/c/b$2;)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;->setDownloadListener(Lcom/bytedance/sdk/openadsdk/TTAppDownloadListener;)V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjFullScreenVideo Callback --> onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/c/b;->a(Lcom/beizi/fusion/work/c/b;Ljava/lang/String;I)V

    return-void
.end method

.method public onFullScreenVideoAdLoad(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/c/b;->a(Lcom/beizi/fusion/work/c/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/c/b;->a(Lcom/beizi/fusion/work/c/b;)V

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/c/b;->b(Lcom/beizi/fusion/work/c/b;I)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/c/b;->a(Lcom/beizi/fusion/work/c/b;Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;

    .line 5
    invoke-direct {p0}, Lcom/beizi/fusion/work/c/b$2;->a()V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/c/b;->b(Lcom/beizi/fusion/work/c/b;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/c/b;->c(Lcom/beizi/fusion/work/c/b;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/c/b$2;->a:Lcom/beizi/fusion/work/c/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/c/b;->d(Lcom/beizi/fusion/work/c/b;)V

    :goto_0
    return-void
.end method

.method public onFullScreenVideoCached()V
    .locals 0

    return-void
.end method

.method public onFullScreenVideoCached(Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd;)V
    .locals 0

    return-void
.end method
