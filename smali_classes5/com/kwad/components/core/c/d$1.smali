.class final Lcom/kwad/components/core/c/d$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/c/d;->c(Lcom/kwad/components/core/request/model/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Jx:Lcom/kwad/components/core/c/d;

.field final synthetic bB:Lcom/kwad/components/core/request/model/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/c/d;Lcom/kwad/components/core/request/model/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/c/d$1;->Jx:Lcom/kwad/components/core/c/d;

    iput-object p2, p0, Lcom/kwad/components/core/c/d$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/c/d$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-virtual {v0}, Lcom/kwad/components/core/request/model/a;->getPosId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/kwad/components/core/c/e;->s(J)Lcom/kwad/components/core/c/e;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/core/c/d$1$1;

    invoke-direct {v1, p0, v0}, Lcom/kwad/components/core/c/d$1$1;-><init>(Lcom/kwad/components/core/c/d$1;Lcom/kwad/components/core/c/e;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/c/d$1;->Jx:Lcom/kwad/components/core/c/d;

    invoke-static {v1}, Lcom/kwad/components/core/c/d;->a(Lcom/kwad/components/core/c/d;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/kwad/components/core/c/e;->isDefault()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/kwad/components/core/c/e;->isEnable()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/c/d$1;->Jx:Lcom/kwad/components/core/c/d;

    invoke-static {v1}, Lcom/kwad/components/core/c/d;->b(Lcom/kwad/components/core/c/d;)Landroid/util/SparseArray;

    move-result-object v1

    invoke-virtual {v0}, Lcom/kwad/components/core/c/e;->na()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/c/c;

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/c/d$1;->Jx:Lcom/kwad/components/core/c/d;

    invoke-static {v0}, Lcom/kwad/components/core/c/d;->b(Lcom/kwad/components/core/c/d;)Landroid/util/SparseArray;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/c/c;

    :goto_1
    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/c/d$1;->Jx:Lcom/kwad/components/core/c/d;

    invoke-static {v0}, Lcom/kwad/components/core/c/d;->b(Lcom/kwad/components/core/c/d;)Landroid/util/SparseArray;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/c/c;

    .line 7
    :cond_2
    iget-object v1, p0, Lcom/kwad/components/core/c/d$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-virtual {v1}, Lcom/kwad/components/core/request/model/a;->qY()Lcom/kwad/components/core/request/i;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 8
    invoke-interface {v0}, Lcom/kwad/components/core/c/c;->getName()Ljava/lang/String;

    invoke-interface {v1}, Lcom/kwad/components/core/request/i;->bK()V

    .line 9
    :cond_3
    iget-object v1, p0, Lcom/kwad/components/core/c/d$1;->Jx:Lcom/kwad/components/core/c/d;

    iget-object v2, p0, Lcom/kwad/components/core/c/d$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-static {v1, v2, v0}, Lcom/kwad/components/core/c/d;->a(Lcom/kwad/components/core/c/d;Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/c;)V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/c/d$1;->bB:Lcom/kwad/components/core/request/model/a;

    iget-object v2, v1, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v2, v2, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 11
    invoke-virtual {v1}, Lcom/kwad/components/core/request/model/a;->qZ()Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {v2, v1}, Lcom/kwad/sdk/commercial/d/d;->b(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/kwad/components/core/c/d$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-interface {v0, v1}, Lcom/kwad/components/core/c/c;->c(Lcom/kwad/components/core/request/model/a;)V

    return-void
.end method
