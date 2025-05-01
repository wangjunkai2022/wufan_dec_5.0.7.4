.class final Lcom/kwad/components/ad/feed/b/c$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/feed/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic fc:Lcom/kwad/components/ad/feed/b/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bl()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->j(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/c;->h(Lcom/kwad/components/ad/feed/b/c;)Z

    move-result v2

    invoke-static {v1, v2}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/components/ad/feed/b/c;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    return-void
.end method

.method public final bm()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/feed/a/b;->aW()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    new-instance v1, Lcom/kwad/components/ad/feed/b/d;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/components/ad/feed/b/d;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/components/ad/feed/b/c;Lcom/kwad/components/ad/feed/b/d;)Lcom/kwad/components/ad/feed/b/d;

    .line 3
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/feed/b/d;->bn()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->o(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bN(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0, p1, p2}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/components/ad/feed/b/c;J)V

    return-void
.end method

.method public final onVideoPlayError(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->p(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->q(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    iget-wide v2, v0, Lcom/kwad/components/ad/feed/b/a;->ey:J

    sub-long v6, p1, v2

    const/4 v2, 0x2

    const/4 v3, 0x1

    .line 4
    invoke-static/range {v1 .. v7}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 10

    .line 1
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/c;->g(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->k(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/feed/b/d;->bo()V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/c;->a(Lcom/kwad/components/ad/feed/b/c;Lcom/kwad/components/ad/feed/b/d;)Lcom/kwad/components/ad/feed/b/d;

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->l(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    .line 9
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->m(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    iget-wide v8, v0, Lcom/kwad/components/ad/feed/b/a;->ey:J

    sub-long/2addr v6, v8

    .line 11
    invoke-static/range {v1 .. v7}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/c$10;->fc:Lcom/kwad/components/ad/feed/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/c;->n(Lcom/kwad/components/ad/feed/b/c;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bM(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method
