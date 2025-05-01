.class final Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->notifyRewardStep(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ot:Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;

.field final synthetic ov:I

.field final synthetic ow:I


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ot:Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;

    iput p2, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ov:I

    iput p3, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ow:I

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ot:Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->access$1200(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/ad/reward/e/i;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ov:I

    iget v2, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ow:I

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/reward/e/i;->h(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ot:Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;->access$000(Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy;)Lcom/kwad/components/ad/reward/model/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ov:I

    iget v2, p0, Lcom/kwad/components/ad/reward/KSRewardVideoActivityProxy$6;->ow:I

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IIZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method
