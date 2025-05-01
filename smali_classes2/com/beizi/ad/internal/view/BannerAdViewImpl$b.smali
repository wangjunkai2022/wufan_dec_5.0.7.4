.class Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;
.super Ljava/lang/Object;
.source "BannerAdViewImpl.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/BannerAdViewImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

.field private final b:Lcom/beizi/ad/internal/view/c;

.field private final c:Lcom/beizi/ad/internal/animation/Animator;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/BannerAdViewImpl;Lcom/beizi/ad/internal/view/c;Lcom/beizi/ad/internal/animation/Animator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;->b:Lcom/beizi/ad/internal/view/c;

    .line 3
    iput-object p3, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;->c:Lcom/beizi/ad/internal/animation/Animator;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;->b:Lcom/beizi/ad/internal/view/c;

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;->c:Lcom/beizi/ad/internal/animation/Animator;

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;-><init>(Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;Lcom/beizi/ad/internal/animation/Animator;Lcom/beizi/ad/internal/view/c;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
