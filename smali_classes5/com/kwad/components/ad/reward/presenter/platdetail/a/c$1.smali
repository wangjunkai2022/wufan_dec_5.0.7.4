.class final Lcom/kwad/components/ad/reward/presenter/platdetail/a/c$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vr:Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c$1;->vr:Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayProgress(JJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c$1;->vr:Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;->a(Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c$1;->vr:Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;->b(Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->af(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c$1;->vr:Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;

    invoke-static {v2}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;->a(Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;)J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    cmp-long v0, p3, p1

    if-lez v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c$1;->vr:Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;

    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;->c(Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;)V

    :cond_0
    return-void
.end method
