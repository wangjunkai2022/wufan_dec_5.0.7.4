.class final Lcom/kwad/components/ad/fullscreen/f$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/fullscreen/f;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/fullscreen/e;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cg:Ljava/util/List;

.field final synthetic gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field final synthetic gx:Lcom/kwad/components/ad/fullscreen/e;


# direct methods
.method constructor <init>(Ljava/util/List;Lcom/kwad/components/ad/fullscreen/e;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/fullscreen/f$3;->cg:Ljava/util/List;

    iput-object p2, p0, Lcom/kwad/components/ad/fullscreen/f$3;->gx:Lcom/kwad/components/ad/fullscreen/e;

    iput-object p3, p0, Lcom/kwad/components/ad/fullscreen/f$3;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    const-string v0, "fullAd_"

    const-string v1, "onFullScreenVideoAdCacheFailed"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/i;->ao(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/KsAdLoadManager;->M()Lcom/kwad/components/ad/KsAdLoadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/f$3;->cg:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/KsAdLoadManager;->b(Ljava/util/List;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/f$3;->gx:Lcom/kwad/components/ad/fullscreen/e;

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/f$3;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/fullscreen/f$3;->cg:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/fullscreen/e;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/util/List;)V

    return-void
.end method
