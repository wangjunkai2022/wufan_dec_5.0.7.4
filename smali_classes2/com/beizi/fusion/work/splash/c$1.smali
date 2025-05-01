.class Lcom/beizi/fusion/work/splash/c$1;
.super Ljava/lang/Object;
.source "CsjClickEyeManager.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/c;->a(Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lcom/beizi/fusion/work/splash/c$a;)Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/c$a;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/ViewGroup;

.field final synthetic d:F

.field final synthetic e:[I

.field final synthetic f:F

.field final synthetic g:Landroid/widget/FrameLayout;

.field final synthetic h:Lcom/beizi/fusion/work/splash/c;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/c;Lcom/beizi/fusion/work/splash/c$a;Landroid/view/View;Landroid/view/ViewGroup;F[IFLandroid/widget/FrameLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->h:Lcom/beizi/fusion/work/splash/c;

    iput-object p2, p0, Lcom/beizi/fusion/work/splash/c$1;->a:Lcom/beizi/fusion/work/splash/c$a;

    iput-object p3, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    iput-object p4, p0, Lcom/beizi/fusion/work/splash/c$1;->c:Landroid/view/ViewGroup;

    iput p5, p0, Lcom/beizi/fusion/work/splash/c$1;->d:F

    iput-object p6, p0, Lcom/beizi/fusion/work/splash/c$1;->e:[I

    iput p7, p0, Lcom/beizi/fusion/work/splash/c$1;->f:F

    iput-object p8, p0, Lcom/beizi/fusion/work/splash/c$1;->g:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    invoke-static {p1}, Lcom/beizi/fusion/g/av;->a(Landroid/view/View;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setX(F)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setY(F)V

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/c$1;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    .line 7
    iget v0, p0, Lcom/beizi/fusion/work/splash/c$1;->d:F

    const/4 v1, 0x0

    aget v2, p1, v1

    int-to-float v2, v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/c$1;->e:[I

    aget v1, v2, v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    .line 8
    iget v1, p0, Lcom/beizi/fusion/work/splash/c$1;->f:F

    const/4 v3, 0x1

    aget p1, p1, v3

    int-to-float p1, p1

    sub-float/2addr v1, p1

    aget p1, v2, v3

    int-to-float p1, p1

    add-float/2addr v1, p1

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->g:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/c$1;->b:Landroid/view/View;

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 10
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/c$1;->h:Lcom/beizi/fusion/work/splash/c;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/c;->b(Lcom/beizi/fusion/work/splash/c;)I

    move-result v2

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/c$1;->h:Lcom/beizi/fusion/work/splash/c;

    .line 11
    invoke-static {v3}, Lcom/beizi/fusion/work/splash/c;->c(Lcom/beizi/fusion/work/splash/c;)I

    move-result v3

    invoke-direct {p1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 12
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/c$1;->c:Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/c$1;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->g:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationX(F)V

    .line 14
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->g:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 15
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->a:Lcom/beizi/fusion/work/splash/c$a;

    if-eqz p1, :cond_0

    .line 16
    invoke-interface {p1}, Lcom/beizi/fusion/work/splash/c$a;->a()V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/c$1;->a:Lcom/beizi/fusion/work/splash/c$a;

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/c$1;->h:Lcom/beizi/fusion/work/splash/c;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/c;->a(Lcom/beizi/fusion/work/splash/c;)I

    move-result v0

    invoke-interface {p1, v0}, Lcom/beizi/fusion/work/splash/c$a;->a(I)V

    :cond_0
    return-void
.end method
