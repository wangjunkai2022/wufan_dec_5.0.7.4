.class final Lcom/kwad/components/ad/interstitial/e/d$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/d;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kw:Lcom/kwad/components/ad/interstitial/e/d;

.field final synthetic kx:Z

.field final synthetic ky:Z

.field final synthetic kz:Landroid/view/ViewGroup;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/d;ZZLandroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    iput-boolean p2, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kx:Z

    iput-boolean p3, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->ky:Z

    iput-object p4, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kz:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kx:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-boolean v1, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->ky:Z

    invoke-static {v0, v1}, Lcom/kwad/components/ad/interstitial/e/d;->b(IZ)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->C(I)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/d;->a(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 5
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    .line 6
    check-cast v1, Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v2}, Lcom/kwad/components/ad/interstitial/e/d;->a(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kz:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v2}, Lcom/kwad/components/ad/interstitial/e/d;->a(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/d;->a(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v1, v2, v0}, Lcom/kwad/components/ad/interstitial/g/d;->f(II)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$3;->kz:Landroid/view/ViewGroup;

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/d$3$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/d$3$1;-><init>(Lcom/kwad/components/ad/interstitial/e/d$3;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
