.class public final Lcom/kwad/components/ad/reward/presenter/m;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"


# instance fields
.field private final gO:Lcom/kwad/components/core/video/l;

.field private hj:J

.field private oJ:Lcom/kwad/components/ad/reward/e/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private sv:Lcom/kwad/components/core/video/l;

.field private sw:Lcom/kwad/components/core/video/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/m$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/m$1;-><init>(Lcom/kwad/components/ad/reward/presenter/m;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->sw:Lcom/kwad/components/core/video/l;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/m$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/m$2;-><init>(Lcom/kwad/components/ad/reward/presenter/m;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->gO:Lcom/kwad/components/core/video/l;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/m;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/presenter/m;->hj:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/m;)Lcom/kwad/components/ad/reward/e/b;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/m;->oJ:Lcom/kwad/components/ad/reward/e/b;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/m;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->hj:J

    return-wide v0
.end method


# virtual methods
.method public final aj()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/kwad/components/ad/reward/g;->pw:J

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, v0, Lcom/kwad/components/ad/reward/g;->px:Z

    .line 4
    iget-object v1, v0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    iput-object v1, p0, Lcom/kwad/components/ad/reward/presenter/m;->oJ:Lcom/kwad/components/ad/reward/e/b;

    .line 5
    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jN()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->sw:Lcom/kwad/components/core/video/l;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->sv:Lcom/kwad/components/core/video/l;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->gO:Lcom/kwad/components/core/video/l;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/m;->sv:Lcom/kwad/components/core/video/l;

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/m;->sv:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/m;->sv:Lcom/kwad/components/core/video/l;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    return-void
.end method
