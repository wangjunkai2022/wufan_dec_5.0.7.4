.class public final Lcom/kwad/components/ad/reward/m/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private qp:Lcom/kwad/components/ad/reward/g;

.field private xT:I

.field private xU:Lcom/kwad/components/ad/reward/f/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private xV:Lcom/kwad/components/ad/reward/m/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private xW:Lcom/kwad/components/ad/reward/m/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private xX:Lcom/kwad/components/ad/k/a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private xY:I

.field private xZ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/video/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kwad/components/ad/reward/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/reward/m/e;->xT:I

    .line 3
    iput v0, p0, Lcom/kwad/components/ad/reward/m/e;->xY:I

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xZ:Ljava/util/List;

    .line 5
    iput-object p1, p0, Lcom/kwad/components/ad/reward/m/e;->qp:Lcom/kwad/components/ad/reward/g;

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/m/a;

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, p1}, Lcom/kwad/components/ad/reward/m/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xX:Lcom/kwad/components/ad/k/a;

    return-void
.end method

.method private jM()Lcom/kwad/components/ad/k/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xX:Lcom/kwad/components/ad/k/a;

    return-object v0
.end method


# virtual methods
.method public final a(ILcom/kwad/components/ad/k/a;)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/reward/m/e;->xT:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 2
    move-object p1, p2

    check-cast p1, Lcom/kwad/components/ad/reward/m/d;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/m/e;->xV:Lcom/kwad/components/ad/reward/m/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 3
    move-object p1, p2

    check-cast p1, Lcom/kwad/components/ad/reward/f/a;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/m/e;->xU:Lcom/kwad/components/ad/reward/f/a;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 4
    move-object p1, p2

    check-cast p1, Lcom/kwad/components/ad/reward/m/b;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/m/e;->xW:Lcom/kwad/components/ad/reward/m/b;

    .line 5
    :cond_2
    :goto_0
    iput-object p2, p0, Lcom/kwad/components/ad/reward/m/e;->xX:Lcom/kwad/components/ad/k/a;

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m/e;->xZ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/kwad/components/core/video/l;

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xX:Lcom/kwad/components/ad/k/a;

    invoke-virtual {v0, p2}, Lcom/kwad/components/ad/k/a;->b(Lcom/kwad/components/core/video/h;)V

    goto :goto_1

    .line 8
    :cond_3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m/e;->xZ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/video/l;)V
    .locals 1
    .param p1    # Lcom/kwad/components/core/video/l;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/a;->jI()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xZ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 11
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/k/a;->b(Lcom/kwad/components/core/video/h;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/utils/h$a;)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xV:Lcom/kwad/components/ad/reward/m/d;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/m/d;->a(Lcom/kwad/sdk/utils/h$a;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/kwad/components/core/video/l;)V
    .locals 1
    .param p1    # Lcom/kwad/components/core/video/l;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/k/a;->a(Lcom/kwad/components/core/video/h;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xZ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b(Lcom/kwad/sdk/utils/h$a;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xV:Lcom/kwad/components/ad/reward/m/d;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/m/d;->b(Lcom/kwad/sdk/utils/h$a;)V

    :cond_0
    return-void
.end method

.method public final getPlayDuration()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/a;->getPlayDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public final jJ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xV:Lcom/kwad/components/ad/reward/m/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/d;->jJ()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xW:Lcom/kwad/components/ad/reward/m/b;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/b;->jJ()V

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fz()V

    return-void
.end method

.method public final jK()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xV:Lcom/kwad/components/ad/reward/m/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/d;->jK()V

    :cond_0
    return-void
.end method

.method public final jN()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xU:Lcom/kwad/components/ad/reward/f/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final jO()Lcom/kwad/components/ad/reward/f/a;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xU:Lcom/kwad/components/ad/reward/f/a;

    return-object v0
.end method

.method public final jP()Lcom/kwad/components/ad/reward/m/b;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xW:Lcom/kwad/components/ad/reward/m/b;

    return-object v0
.end method

.method public final pause()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/a;->pause()V

    return-void
.end method

.method public final release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/a;->release()V

    return-void
.end method

.method public final resume()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/a;->resume()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/e;->xU:Lcom/kwad/components/ad/reward/f/a;

    if-eqz v0, :cond_1

    .line 3
    iget v1, p0, Lcom/kwad/components/ad/reward/m/e;->xY:I

    if-lez v1, :cond_1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-virtual {v0, v1, v3}, Lcom/kwad/components/ad/reward/f/a;->setAudioEnabled(ZZ)V

    :cond_1
    return-void
.end method

.method public final setAudioEnabled(ZZ)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1
    :goto_0
    iput v0, p0, Lcom/kwad/components/ad/reward/m/e;->xY:I

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/kwad/components/ad/k/a;->setAudioEnabled(ZZ)V

    return-void
.end method

.method public final skipToEnd()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m/e;->jM()Lcom/kwad/components/ad/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/k/a;->skipToEnd()V

    return-void
.end method
