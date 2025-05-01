.class final Lcom/kwad/components/ad/reward/n/i$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/n/i;->a(Landroid/view/View;Landroid/view/View;Landroid/view/View;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic yP:Lcom/kwad/components/ad/reward/n/i;

.field final synthetic yT:I

.field final synthetic yU:Landroid/view/ViewGroup$MarginLayoutParams;

.field final synthetic yV:I

.field final synthetic yW:Landroid/view/View;

.field final synthetic yX:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/n/i;ILandroid/view/ViewGroup$MarginLayoutParams;ILandroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/i$3;->yP:Lcom/kwad/components/ad/reward/n/i;

    iput p2, p0, Lcom/kwad/components/ad/reward/n/i$3;->yT:I

    iput-object p3, p0, Lcom/kwad/components/ad/reward/n/i$3;->yU:Landroid/view/ViewGroup$MarginLayoutParams;

    iput p4, p0, Lcom/kwad/components/ad/reward/n/i$3;->yV:I

    iput-object p5, p0, Lcom/kwad/components/ad/reward/n/i$3;->yW:Landroid/view/View;

    iput-object p6, p0, Lcom/kwad/components/ad/reward/n/i$3;->yX:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2
    iget v0, p0, Lcom/kwad/components/ad/reward/n/i$3;->yT:I

    sub-int v0, p1, v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/n/i$3;->yU:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v2, p0, Lcom/kwad/components/ad/reward/n/i$3;->yV:I

    add-int/2addr v2, v0

    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/i$3;->yW:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/i$3;->yX:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/i$3;->yX:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method
