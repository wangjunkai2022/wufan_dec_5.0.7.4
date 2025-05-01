.class public Lcom/kwad/components/ad/k/b;
.super Lcom/kwad/components/ad/k/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/ad/k/a<",
        "Lcom/kwad/components/core/video/k;",
        ">;"
    }
.end annotation


# instance fields
.field public HU:Lcom/kwad/components/core/video/b;

.field private HV:Z

.field private HW:Lcom/kwad/components/core/video/k;

.field protected mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/video/DetailVideoView;)V
    .locals 1
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/k/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/k/b;->HV:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/k/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/k/b$1;-><init>(Lcom/kwad/components/ad/k/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/k/b;->HW:Lcom/kwad/components/core/video/k;

    .line 4
    iput-object p2, p0, Lcom/kwad/components/ad/k/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    .line 5
    new-instance p2, Lcom/kwad/components/core/video/b;

    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->mDetailVideoView:Lcom/kwad/components/core/video/DetailVideoView;

    invoke-direct {p2, v0, p1}, Lcom/kwad/components/core/video/b;-><init>(Lcom/kwad/components/core/video/DetailVideoView;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object p2, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/k/b;->mE()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/k/b;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/kwad/components/ad/k/b;->HV:Z

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/k/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/k/b;->mG()V

    return-void
.end method

.method private mE()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    iget-object v1, p0, Lcom/kwad/components/ad/k/b;->HW:Lcom/kwad/components/core/video/k;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/video/b;->c(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method private mF()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kwad/components/ad/k/b;->HW:Lcom/kwad/components/core/video/k;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/video/b;->d(Lcom/kwad/components/core/video/k;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/ad/k/b;->HW:Lcom/kwad/components/core/video/k;

    :cond_0
    return-void
.end method

.method private mG()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v2, 0x5210

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/core/o/a;->f(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/k/b;->HV:Z

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/kwad/components/core/video/h;)V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    check-cast p1, Lcom/kwad/components/core/video/k;

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/k/b;->b(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/video/k;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/b;->c(Lcom/kwad/components/core/video/k;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic b(Lcom/kwad/components/core/video/h;)V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    check-cast p1, Lcom/kwad/components/core/video/k;

    invoke-virtual {p0, p1}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/video/k;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/video/b;->d(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public getPlayDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->getPlayDuration()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->pause()Z

    return-void
.end method

.method public release()V
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/k/a;->release()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/k/b;->HV:Z

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/k/b;->mF()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->clear()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->release()V

    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b;->HU:Lcom/kwad/components/core/video/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/b;->resume()V

    return-void
.end method
