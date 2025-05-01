.class Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;
.super Ljava/lang/Object;
.source "BannerAdViewImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/animation/Animator;

.field final synthetic b:Lcom/beizi/ad/internal/view/c;

.field final synthetic c:Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;Lcom/beizi/ad/internal/animation/Animator;Lcom/beizi/ad/internal/view/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;->c:Lcom/beizi/ad/internal/view/BannerAdViewImpl$b;

    iput-object p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;->a:Lcom/beizi/ad/internal/animation/Animator;

    iput-object p3, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;->a:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/animation/Animator;->clearAnimation()V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;->b:Lcom/beizi/ad/internal/view/c;

    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->destroy()V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$b$1;->a:Lcom/beizi/ad/internal/animation/Animator;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/animation/Animator;->setAnimation()V

    return-void
.end method
