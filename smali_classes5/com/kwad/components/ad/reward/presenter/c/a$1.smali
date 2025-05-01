.class final Lcom/kwad/components/ad/reward/presenter/c/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tZ:Lcom/kwad/components/ad/reward/presenter/c/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/c/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/c/a;->a(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/components/core/video/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sx()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/presenter/c/a;->a(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/components/core/video/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/components/core/video/i;->sz()J

    move-result-wide v2

    sub-long v5, v0, v2

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/c/a;->a(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/components/core/video/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sy()Lcom/kwad/components/core/video/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i$a;->sA()I

    move-result v9

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/c/a;->a(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/components/core/video/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sy()Lcom/kwad/components/core/video/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i$a;->sB()J

    move-result-wide v7

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/c/a;->b(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/components/ad/reward/g;

    move-result-object v4

    invoke-virtual/range {v4 .. v9}, Lcom/kwad/components/ad/reward/g;->a(JJI)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/c/a;->c(Lcom/kwad/components/ad/reward/presenter/c/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/c/a;->d(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/components/ad/reward/g;

    move-result-object v1

    const-wide/16 v2, 0x1388

    const-wide/16 v4, 0x1388

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, Lcom/kwad/components/ad/reward/g;->a(JJI)V

    .line 8
    :cond_1
    :goto_0
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/c/a$1;->tZ:Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/c/a;->e(Lcom/kwad/components/ad/reward/presenter/c/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/o/a;->ax(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method
