.class final Lcom/kwad/components/core/s/n$4;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/s/n;->b(Landroid/view/View;II)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ub:I

.field final synthetic fo:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/s/n$4;->fo:Landroid/view/View;

    iput p2, p0, Lcom/kwad/components/core/s/n$4;->Ub:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/s/n$4;->fo:Landroid/view/View;

    iget v0, p0, Lcom/kwad/components/core/s/n$4;->Ub:I

    invoke-static {p1, v0}, Lcom/kwad/components/core/s/n;->l(Landroid/view/View;I)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/s/n$4;->fo:Landroid/view/View;

    iget v0, p0, Lcom/kwad/components/core/s/n$4;->Ub:I

    invoke-static {p1, v0}, Lcom/kwad/components/core/s/n;->l(Landroid/view/View;I)V

    return-void
.end method
