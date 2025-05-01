.class final Lcom/kwad/components/ad/fullscreen/c/a/a$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/fullscreen/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic hk:Lcom/kwad/components/ad/fullscreen/c/a/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/fullscreen/c/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLivePlayEnd()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onLivePlayEnd()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/a;->a(Lcom/kwad/components/ad/fullscreen/c/a/a;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/a;->b(Lcom/kwad/components/ad/fullscreen/c/a/a;)Lcom/kwad/sdk/utils/bs;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final onMediaPlayProgress(JJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/a;->c(Lcom/kwad/components/ad/fullscreen/c/a/a;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jN()Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x320

    cmp-long v2, p3, v0

    if-lez v2, :cond_2

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0, p3, p4}, Lcom/kwad/components/ad/fullscreen/c/a/a;->a(Lcom/kwad/components/ad/fullscreen/c/a/a;J)J

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/a;->d(Lcom/kwad/components/ad/fullscreen/c/a/a;)J

    move-result-wide v0

    cmp-long v2, v0, p1

    if-lez v2, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/a;->e(Lcom/kwad/components/ad/fullscreen/c/a/a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    .line 6
    invoke-static {v0}, Lcom/kwad/components/ad/fullscreen/c/a/a;->f(Lcom/kwad/components/ad/fullscreen/c/a/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v1}, Lcom/kwad/components/ad/fullscreen/c/a/a;->g(Lcom/kwad/components/ad/fullscreen/c/a/a;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v1}, Lcom/kwad/components/ad/fullscreen/c/a/a;->f(Lcom/kwad/components/ad/fullscreen/c/a/a;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/kwad/components/ad/fullscreen/c/a/a;->a(Lcom/kwad/components/ad/fullscreen/c/a/a;JJ)V

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/kwad/components/ad/fullscreen/c/a/a;->a(Lcom/kwad/components/ad/fullscreen/c/a/a;Z)Z

    return-void

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/kwad/components/ad/fullscreen/c/a/a;->a(Lcom/kwad/components/ad/fullscreen/c/a/a;JJ)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/fullscreen/c/a/a$1;->hk:Lcom/kwad/components/ad/fullscreen/c/a/a;

    invoke-static {p1, p3, p4}, Lcom/kwad/components/ad/fullscreen/c/a/a;->a(Lcom/kwad/components/ad/fullscreen/c/a/a;J)J

    :cond_2
    return-void
.end method
