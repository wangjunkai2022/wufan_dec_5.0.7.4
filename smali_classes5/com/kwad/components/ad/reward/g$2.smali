.class final Lcom/kwad/components/ad/reward/g$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/g;->d(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic pH:Lcom/kwad/components/ad/reward/g;

.field final synthetic pI:Z

.field final synthetic pJ:Z


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/g;ZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g$2;->pH:Lcom/kwad/components/ad/reward/g;

    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/g$2;->pI:Z

    iput-boolean p3, p0, Lcom/kwad/components/ad/reward/g$2;->pJ:Z

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g$2;->pH:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jO()Lcom/kwad/components/ad/reward/f/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/g$2;->pI:Z

    iget-boolean v2, p0, Lcom/kwad/components/ad/reward/g$2;->pJ:Z

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/reward/f/a;->setAudioEnabled(ZZ)V

    :cond_0
    return-void
.end method
