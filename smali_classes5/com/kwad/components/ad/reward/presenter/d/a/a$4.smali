.class final Lcom/kwad/components/ad/reward/presenter/d/a/a$4;
.super Lcom/kwad/components/ad/reward/e/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/d/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vC:Lcom/kwad/components/ad/reward/presenter/d/a/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/d/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a$4;->vC:Lcom/kwad/components/ad/reward/presenter/d/a/a;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/e/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bL()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a$4;->vC:Lcom/kwad/components/ad/reward/presenter/d/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/a;->b(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pq:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a$4;->vC:Lcom/kwad/components/ad/reward/presenter/d/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/a;->c(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oP:Lcom/kwad/components/ad/l/a;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/a/a$4;->vC:Lcom/kwad/components/ad/reward/presenter/d/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/a;->d(Lcom/kwad/components/ad/reward/presenter/d/a/a;)Lcom/kwad/components/ad/reward/g;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oP:Lcom/kwad/components/ad/l/a;

    invoke-virtual {v0}, Lcom/kwad/components/ad/l/a;->ar()Z

    :cond_1
    return-void
.end method
