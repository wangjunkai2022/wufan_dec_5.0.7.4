.class final Lcom/kwad/components/ad/reward/g$9;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/core/i/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic pH:Lcom/kwad/components/ad/reward/g;

.field final synthetic pL:Lcom/kwad/components/core/i/d;

.field final synthetic pM:Lcom/kwad/components/core/i/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/core/i/d;Lcom/kwad/components/core/i/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g$9;->pH:Lcom/kwad/components/ad/reward/g;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/g$9;->pL:Lcom/kwad/components/core/i/d;

    iput-object p3, p0, Lcom/kwad/components/ad/reward/g$9;->pM:Lcom/kwad/components/core/i/c;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g$9;->pL:Lcom/kwad/components/core/i/d;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/g$9;->pM:Lcom/kwad/components/core/i/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/i/d;->c(Lcom/kwad/components/core/i/c;)V

    :cond_0
    return-void
.end method
