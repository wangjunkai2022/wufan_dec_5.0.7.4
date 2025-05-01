.class final Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->km()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic BM:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View$1;->BM:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View$1;->BM:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->dM:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setScaleY(F)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View$1;->BM:Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/widget/tailframe/TailFrameBarH5View;->dM:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setScaleX(F)V

    return-void
.end method
