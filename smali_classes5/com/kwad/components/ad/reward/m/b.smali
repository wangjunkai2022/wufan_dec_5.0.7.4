.class public final Lcom/kwad/components/ad/reward/m/b;
.super Lcom/kwad/components/ad/k/a;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/g$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/ad/k/a<",
        "Lcom/kwad/components/core/video/h;",
        ">;",
        "Lcom/kwad/components/ad/reward/g$a;"
    }
.end annotation


# instance fields
.field private xL:Lcom/kwad/components/core/g/c;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/k/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->M(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    .line 4
    new-instance p1, Lcom/kwad/components/core/g/c;

    invoke-direct {p1}, Lcom/kwad/components/core/g/c;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/kwad/components/core/g/c;->z(J)V

    return-void
.end method


# virtual methods
.method public final O(Landroid/content/Context;)Landroid/widget/FrameLayout;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/g/c;->getImagePlayerView(Landroid/content/Context;)Landroid/widget/FrameLayout;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/g/c;->setImageScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-object p1
.end method

.method public final a(Lcom/kwad/components/core/video/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/g/c;->d(Lcom/kwad/components/core/video/h;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/video/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/g/c;->c(Lcom/kwad/components/core/video/h;)V

    return-void
.end method

.method public final fV()V
    .locals 0

    return-void
.end method

.method public final fW()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/m/b;->resume()V

    return-void
.end method

.method public final fX()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/m/b;->pause()V

    return-void
.end method

.method public final fY()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->destroy()V

    return-void
.end method

.method public final getPlayDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->getPlayDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public final jJ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aZ(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/util/List;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/g/c;->setURLs(Ljava/util/List;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->play()V

    return-void
.end method

.method public final pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->pause()V

    return-void
.end method

.method public final release()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/k/a;->release()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->destroy()V

    return-void
.end method

.method public final resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->resume()V

    return-void
.end method

.method public final skipToEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/b;->xL:Lcom/kwad/components/core/g/c;

    invoke-virtual {v0}, Lcom/kwad/components/core/g/c;->skipToEnd()V

    return-void
.end method
