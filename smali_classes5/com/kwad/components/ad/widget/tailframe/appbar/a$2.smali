.class final Lcom/kwad/components/ad/widget/tailframe/appbar/a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/widget/tailframe/appbar/a;->mQ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IU:Lcom/kwad/components/ad/widget/tailframe/appbar/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/widget/tailframe/appbar/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/widget/tailframe/appbar/a$2;->IU:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

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
    iget-object v0, p0, Lcom/kwad/components/ad/widget/tailframe/appbar/a$2;->IU:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    iget-object v0, v0, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setScaleY(F)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/widget/tailframe/appbar/a$2;->IU:Lcom/kwad/components/ad/widget/tailframe/appbar/a;

    iget-object v0, v0, Lcom/kwad/components/ad/widget/tailframe/appbar/a;->BI:Lcom/kwad/components/core/page/widget/TextProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setScaleX(F)V

    return-void
.end method
