.class final Lcom/kwad/components/ad/reward/g/b$1$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/g/b$1;->a(Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cg:Ljava/util/List;

.field final synthetic gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field final synthetic rK:Lcom/kwad/components/ad/reward/g/b$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/g/b$1;Ljava/util/List;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->rK:Lcom/kwad/components/ad/reward/g/b$1;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->cg:Ljava/util/List;

    iput-object p3, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/components/ad/KsAdLoadManager;->M()Lcom/kwad/components/ad/KsAdLoadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->cg:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/KsAdLoadManager;->b(Ljava/util/List;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->rK:Lcom/kwad/components/ad/reward/g/b$1;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g/b$1;->rJ:Lcom/kwad/components/ad/reward/g/c;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->cg:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/reward/g/c;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :catchall_0
    :try_start_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->rK:Lcom/kwad/components/ad/reward/g/b$1;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g/b$1;->rJ:Lcom/kwad/components/ad/reward/g/c;

    const-string v1, "onRequestResult"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/kwad/components/ad/reward/g/b$1$2;->cg:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/s;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-void
.end method
