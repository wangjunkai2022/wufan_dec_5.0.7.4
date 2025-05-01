.class Lcom/beizi/fusion/work/splash/e$2;
.super Ljava/lang/Object;
.source "CsjSplashWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdNative$CSJSplashAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/e;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashLoadFail(Lcom/bytedance/sdk/openadsdk/CSJAdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showCsjSplash onSplashLoadFail code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/splash/e;->a(Lcom/beizi/fusion/work/splash/e;Ljava/lang/String;I)V

    return-void
.end method

.method public onSplashLoadSuccess(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 0

    return-void
.end method

.method public onSplashRenderFail(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;Lcom/bytedance/sdk/openadsdk/CSJAdError;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showCsjSplash onSplashRenderFail code:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getCode()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/CSJAdError;->getCode()I

    move-result p2

    invoke-static {p1, v0, p2}, Lcom/beizi/fusion/work/splash/e;->b(Lcom/beizi/fusion/work/splash/e;Ljava/lang/String;I)V

    return-void
.end method

.method public onSplashRenderSuccess(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/e;->a(Lcom/beizi/fusion/work/splash/e;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/e;->a(Lcom/beizi/fusion/work/splash/e;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->a(Lcom/beizi/fusion/work/splash/e;)V

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    const/16 v0, -0x3df

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/splash/e;->b(Lcom/beizi/fusion/work/splash/e;I)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->b(Lcom/beizi/fusion/work/splash/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/e;->b(Lcom/beizi/fusion/work/splash/e;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$2;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->c(Lcom/beizi/fusion/work/splash/e;)V

    .line 8
    :goto_0
    new-instance v0, Lcom/beizi/fusion/work/splash/e$2$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/work/splash/e$2$1;-><init>(Lcom/beizi/fusion/work/splash/e$2;)V

    invoke-interface {p1, v0}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->setSplashAdListener(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashAdListener;)V

    return-void
.end method
