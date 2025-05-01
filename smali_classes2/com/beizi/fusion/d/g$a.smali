.class Lcom/beizi/fusion/d/g$a;
.super Ljava/lang/Object;
.source "ClickEyeManager.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Z

.field private b:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/bytedance/sdk/openadsdk/CSJSplashAd;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/d/g$a;->a:Z

    .line 3
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/beizi/fusion/d/g$a;->b:Ljava/lang/ref/SoftReference;

    .line 4
    new-instance p2, Ljava/lang/ref/SoftReference;

    invoke-direct {p2, p3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/beizi/fusion/d/g$a;->c:Ljava/lang/ref/SoftReference;

    .line 5
    iput-object p1, p0, Lcom/beizi/fusion/d/g$a;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public onSplashClickEyeClick()V
    .locals 0

    return-void
.end method

.method public onSplashClickEyeClose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/g$a;->b:Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/g$a;->b:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/g$a;->b:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->a(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/beizi/fusion/d/g$a;->b:Ljava/lang/ref/SoftReference;

    .line 5
    iput-object v0, p0, Lcom/beizi/fusion/d/g$a;->c:Ljava/lang/ref/SoftReference;

    .line 6
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/d/g;->c()Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/fusion/d/g$a;->a:Z

    if-eqz v0, :cond_1

    .line 7
    invoke-static {}, Lcom/beizi/fusion/d/g;->c()Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;->onSplashClickEyeAnimationFinish()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/beizi/fusion/d/g$a;->a:Z

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/d/g$a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/work/splash/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/c;->a()V

    return-void
.end method

.method public onSplashClickEyeReadyToShow(Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V
    .locals 0

    return-void
.end method
