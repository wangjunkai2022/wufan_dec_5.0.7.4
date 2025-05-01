.class Lcom/beizi/fusion/widget/EulerAngleView$2;
.super Ljava/lang/Object;
.source "EulerAngleView.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/EulerAngleView;->startContinuousRotations()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/EulerAngleView;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/EulerAngleView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView$2;->a:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView$2;->a:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/EulerAngleView;->b(Lcom/beizi/fusion/widget/EulerAngleView;)Landroid/animation/AnimatorSet;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView$2;->a:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/EulerAngleView;->b(Lcom/beizi/fusion/widget/EulerAngleView;)Landroid/animation/AnimatorSet;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
