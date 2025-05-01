.class final Lcom/kwad/components/ad/reward/presenter/d/a/b$2;
.super Lcom/kwad/components/ad/reward/e/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/d/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/d/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bL()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->d(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->ef(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->e(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    .line 4
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->f(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fI()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->g(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pk:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->h(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pq:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->a(Lcom/kwad/components/ad/reward/presenter/d/a/b;Z)Z

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->i(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/l/b;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->i(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/l/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->ar()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->a(Lcom/kwad/components/ad/reward/presenter/d/a/b;Z)Z

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->j(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->k(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Z

    move-result v2

    xor-int/2addr v1, v2

    iput-boolean v1, v0, Lcom/kwad/components/ad/reward/g;->pB:Z

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->k(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->l(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oO:Lcom/kwad/components/ad/reward/j;

    if-eqz v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->m(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->n(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-boolean v2, v0, Lcom/kwad/components/ad/reward/g;->oZ:Z

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    .line 13
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->o(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cA(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v4

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->p(Lcom/kwad/components/ad/reward/presenter/d/a/b;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oO:Lcom/kwad/components/ad/reward/j;

    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->getLoadTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const/4 v7, 0x1

    const-string v3, "end_card"

    .line 15
    invoke-static/range {v1 .. v7}, Lcom/kwad/components/ad/reward/monitor/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLjava/lang/String;Ljava/lang/String;JI)V

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/b$2;->vK:Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;->q(Lcom/kwad/components/ad/reward/presenter/d/a/b;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final getPriority()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
