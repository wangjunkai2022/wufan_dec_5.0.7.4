.class final Lcom/kwad/components/ad/fullscreen/c/a/f$6;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/fullscreen/c/a/f;->cg()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic hH:Lcom/kwad/components/ad/fullscreen/c/a/f;

.field final synthetic hM:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

.field final synthetic hN:I

.field final synthetic hO:I


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/fullscreen/c/a/f;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hH:Lcom/kwad/components/ad/fullscreen/c/a/f;

    iput-object p2, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hM:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput p3, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hN:I

    iput p4, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hO:I

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hM:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hH:Lcom/kwad/components/ad/fullscreen/c/a/f;

    iget v2, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hN:I

    int-to-float v2, v2

    iget v3, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hO:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    invoke-static {v1, v2, v0}, Lcom/kwad/components/ad/fullscreen/c/a/f;->a(Lcom/kwad/components/ad/fullscreen/c/a/f;FF)Landroid/animation/Animator;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/components/ad/fullscreen/c/a/f;->a(Lcom/kwad/components/ad/fullscreen/c/a/f;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hH:Lcom/kwad/components/ad/fullscreen/c/a/f;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/f;->e(Lcom/kwad/components/ad/fullscreen/c/a/f;)Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/f$6;->hH:Lcom/kwad/components/ad/fullscreen/c/a/f;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/f;->e(Lcom/kwad/components/ad/fullscreen/c/a/f;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_0
    return-void
.end method
