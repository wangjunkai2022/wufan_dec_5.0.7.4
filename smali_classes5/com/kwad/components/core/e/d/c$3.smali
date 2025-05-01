.class final Lcom/kwad/components/core/e/d/c$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/e/d/c;->oz()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Lz:Lcom/kwad/components/core/e/d/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/e/d/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/e/d/c$3;->Lz:Lcom/kwad/components/core/e/d/c;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kwad/components/core/e/d/c$3;->Lz:Lcom/kwad/components/core/e/d/c;

    invoke-static {v1}, Lcom/kwad/components/core/e/d/c;->d(Lcom/kwad/components/core/e/d/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/e/d/c$3;->Lz:Lcom/kwad/components/core/e/d/c;

    invoke-static {v1}, Lcom/kwad/components/core/e/d/c;->d(Lcom/kwad/components/core/e/d/c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/api/KsAppDownloadListener;

    if-eqz v1, :cond_0

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/e/d/c$3;->Lz:Lcom/kwad/components/core/e/d/c;

    invoke-static {v2, v1}, Lcom/kwad/components/core/e/d/c;->a(Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    goto :goto_0

    :cond_1
    return-void
.end method
