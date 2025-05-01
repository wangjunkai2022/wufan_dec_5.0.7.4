.class final Lcom/kwad/components/ad/f/b/c$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b/c;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mW:Lcom/kwad/components/ad/f/b/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayCompleted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/c;->h(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bN(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final onMediaPlayProgress(JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {p1, p3, p4}, Lcom/kwad/components/ad/f/b/c;->a(Lcom/kwad/components/ad/f/b/c;J)V

    return-void
.end method

.method public final onMediaPlayStart()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/f/b/c;->a(Lcom/kwad/components/ad/f/b/c;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/c;->a(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/c;->b(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/f/a/b;->mw:Lcom/kwad/components/ad/f/d$a;

    invoke-interface {v0}, Lcom/kwad/components/ad/f/d$a;->es()V

    .line 4
    :cond_0
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v1}, Lcom/kwad/components/ad/f/b/c;->c(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/components/ad/f/a/b;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/kwad/sdk/core/adlog/c/b;->v(II)Lcom/kwad/sdk/core/adlog/c/b;

    .line 7
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/s/b;->rC()Lcom/kwad/components/core/s/b;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v2}, Lcom/kwad/components/ad/f/b/c;->d(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/kwad/components/core/s/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/c;->e(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bM(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final onMediaPlaying()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/c;->f(Lcom/kwad/components/ad/f/b/c;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/f/b/c;->a(Lcom/kwad/components/ad/f/b/c;Z)Z

    .line 3
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/f/b/c$1;->mW:Lcom/kwad/components/ad/f/b/c;

    invoke-static {v2}, Lcom/kwad/components/ad/f/b/c;->g(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/kwad/components/core/o/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;JI)V

    :cond_0
    return-void
.end method
