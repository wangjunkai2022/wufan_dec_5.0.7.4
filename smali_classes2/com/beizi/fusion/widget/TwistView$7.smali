.class Lcom/beizi/fusion/widget/TwistView$7;
.super Landroid/animation/AnimatorListenerAdapter;
.source "TwistView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/TwistView;->showTargetView(Landroid/view/View;JI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/beizi/fusion/widget/TwistView;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/TwistView;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/TwistView$7;->b:Lcom/beizi/fusion/widget/TwistView;

    iput p2, p0, Lcom/beizi/fusion/widget/TwistView$7;->a:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/TwistView$7;->b:Lcom/beizi/fusion/widget/TwistView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/TwistView;->g(Lcom/beizi/fusion/widget/TwistView;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/widget/TwistView$7;->b:Lcom/beizi/fusion/widget/TwistView;

    invoke-static {p1}, Lcom/beizi/fusion/widget/TwistView;->e(Lcom/beizi/fusion/widget/TwistView;)I

    :cond_0
    return-void
.end method
