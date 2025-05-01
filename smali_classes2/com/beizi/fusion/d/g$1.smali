.class Lcom/beizi/fusion/d/g$1;
.super Ljava/lang/Object;
.source "ClickEyeManager.java"

# interfaces
.implements Lcom/beizi/fusion/work/splash/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/d/g;->b(Landroid/app/Activity;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/beizi/fusion/work/splash/c;

.field final synthetic d:Lcom/beizi/fusion/d/g;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/g;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;Landroid/app/Activity;Lcom/beizi/fusion/work/splash/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/g$1;->d:Lcom/beizi/fusion/d/g;

    iput-object p2, p0, Lcom/beizi/fusion/d/g$1;->a:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    iput-object p3, p0, Lcom/beizi/fusion/d/g$1;->b:Landroid/app/Activity;

    iput-object p4, p0, Lcom/beizi/fusion/d/g$1;->c:Lcom/beizi/fusion/work/splash/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/g$1;->a:Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/d/g$1;->b:Landroid/app/Activity;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->showSplashClickEyeView(Landroid/view/ViewGroup;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/g$1;->c:Lcom/beizi/fusion/work/splash/c;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/c;->a()V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method
