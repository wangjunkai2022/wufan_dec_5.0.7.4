.class Lcom/beizi/fusion/work/splash/e$9;
.super Ljava/lang/Object;
.source "CsjSplashWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/e;->a(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;Landroid/view/View;)V
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
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/e$9;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSplashClickEyeClick()V
    .locals 0

    return-void
.end method

.method public onSplashClickEyeClose()V
    .locals 0

    return-void
.end method

.method public onSplashClickEyeReadyToShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/beizi/fusion/d/g;->a()Lcom/beizi/fusion/d/g;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$9;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/e;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v1}, Lcom/beizi/fusion/d/g;->a(Ljava/lang/String;ZZ)V

    .line 2
    invoke-static {}, Lcom/beizi/fusion/d/g;->a()Lcom/beizi/fusion/d/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/g;->b()Z

    move-result p1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$9;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->O(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$9;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->P(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    if-eqz p1, :cond_0

    const-string p1, "2"

    goto :goto_0

    :cond_0
    const-string p1, "0"

    :goto_0
    invoke-virtual {v0, p1}, Lcom/beizi/fusion/b/b;->K(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$9;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->Q(Lcom/beizi/fusion/work/splash/e;)V

    :cond_1
    return-void
.end method
