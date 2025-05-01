.class Lcom/beizi/fusion/work/splash/g$2;
.super Ljava/lang/Object;
.source "GmSplashWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/g;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/g;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->a(Lcom/beizi/fusion/work/splash/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/g;->a(Lcom/beizi/fusion/work/splash/g;Z)Z

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GmSplashWorker.onSplashAdLoadFail : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",spaceId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/g;->b(Lcom/beizi/fusion/work/splash/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/splash/g;->a(Lcom/beizi/fusion/work/splash/g;Ljava/lang/String;I)V

    return-void
.end method

.method public onSplashAdLoad(Lcom/bytedance/sdk/openadsdk/TTSplashAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/g;->a(Lcom/beizi/fusion/work/splash/g;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/g;->a(Lcom/beizi/fusion/work/splash/g;Lcom/bytedance/sdk/openadsdk/TTSplashAd;)Lcom/bytedance/sdk/openadsdk/TTSplashAd;

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->c(Lcom/beizi/fusion/work/splash/g;)Lcom/bytedance/sdk/openadsdk/TTSplashAd;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->d(Lcom/beizi/fusion/work/splash/g;)Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/TTSplashAd;->setSplashInteractionListener(Lcom/bytedance/sdk/openadsdk/TTSplashAd$AdInteractionListener;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->e(Lcom/beizi/fusion/work/splash/g;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->f(Lcom/beizi/fusion/work/splash/g;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->g(Lcom/beizi/fusion/work/splash/g;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/g;->h(Lcom/beizi/fusion/work/splash/g;)V

    :goto_0
    return-void
.end method

.method public onTimeout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/g$2;->a:Lcom/beizi/fusion/work/splash/g;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/g;->c(Lcom/beizi/fusion/work/splash/g;)Lcom/bytedance/sdk/openadsdk/TTSplashAd;

    return-void
.end method
