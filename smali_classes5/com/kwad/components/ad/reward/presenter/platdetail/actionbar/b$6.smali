.class final Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b$6;
.super Lcom/kwad/components/ad/reward/n/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b;->a(ZLcom/kwad/components/ad/reward/presenter/platdetail/actionbar/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic uH:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b;

.field final synthetic uI:Z


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b$6;->uH:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b;

    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b$6;->uI:Z

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/n/h;-><init>()V

    return-void
.end method


# virtual methods
.method public final hZ()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/b$6;->uI:Z

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_common_app_card_land_stub:I

    return v0

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/kwad/components/ad/reward/n/h;->hZ()I

    move-result v0

    return v0
.end method
