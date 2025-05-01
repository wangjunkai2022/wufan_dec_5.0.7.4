.class final Lcom/kwad/components/core/video/DetailVideoView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/video/DetailVideoView;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILandroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/animation/ValueAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Vi:Lcom/kwad/components/core/video/DetailVideoView;

.field final synthetic Vj:Z

.field final synthetic Vk:F

.field final synthetic Vl:Landroid/view/ViewGroup$LayoutParams;

.field final synthetic Vm:Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/video/DetailVideoView;ZFLandroid/view/ViewGroup$LayoutParams;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vi:Lcom/kwad/components/core/video/DetailVideoView;

    iput-boolean p2, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vj:Z

    iput p3, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vk:F

    iput-object p4, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vl:Landroid/view/ViewGroup$LayoutParams;

    iput-object p5, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vm:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vj:Z

    if-eqz v1, :cond_1

    int-to-float v1, v0

    .line 3
    iget v2, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vk:F

    div-float/2addr v1, v2

    float-to-int v1, v1

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vl:Landroid/view/ViewGroup$LayoutParams;

    if-eqz v2, :cond_0

    .line 5
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 6
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7
    iget-object v3, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vi:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v3, v2}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    :cond_0
    iget-object v2, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vi:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v2, v1, v0}, Lcom/kwad/components/core/video/DetailVideoView;->adaptVideoSize(II)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vl:Landroid/view/ViewGroup$LayoutParams;

    if-eqz v1, :cond_2

    .line 10
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v0, -0x1

    .line 11
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vi:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/video/DetailVideoView$2;->Vm:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    if-eqz v0, :cond_3

    .line 14
    invoke-interface {v0, p1}, Landroid/animation/ValueAnimator$AnimatorUpdateListener;->onAnimationUpdate(Landroid/animation/ValueAnimator;)V

    :cond_3
    return-void
.end method
