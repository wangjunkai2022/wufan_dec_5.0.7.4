.class final Lcom/kwad/components/core/c/l$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/c/l;->c(Lcom/kwad/components/core/request/model/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic JR:Lcom/kwad/components/core/c/l;

.field final synthetic bB:Lcom/kwad/components/core/request/model/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/c/l;Lcom/kwad/components/core/request/model/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/c/l$1;->JR:Lcom/kwad/components/core/c/l;

    iput-object p2, p0, Lcom/kwad/components/core/c/l$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/c/l$1;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-static {v0}, Lcom/kwad/components/core/c/l;->d(Lcom/kwad/components/core/request/model/a;)Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/AdResultData;->isAdResultDataEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/c/l$1;->bB:Lcom/kwad/components/core/request/model/a;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;Z)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/c/l$1;->bB:Lcom/kwad/components/core/request/model/a;

    new-instance v1, Lcom/kwad/components/core/c/j;

    invoke-direct {v1, v0}, Lcom/kwad/components/core/c/j;-><init>(Lcom/kwad/components/core/request/model/a;)V

    invoke-static {v0, v1}, Lcom/kwad/components/core/c/n;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/j;)V

    return-void
.end method
