.class public final Lcom/kwad/components/core/video/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private Vn:Z

.field private Vo:Z

.field private Vp:Z

.field private Vq:Z

.field private Vr:Z

.field private Vs:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vn:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vo:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vp:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vq:Z

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vr:Z

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/kwad/components/core/video/d;->Vs:I

    return-void
.end method


# virtual methods
.method public final aN(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/video/d;->Vs:I

    return-void
.end method

.method public final aR(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/d;->Vp:Z

    return-void
.end method

.method public final setAd(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/d;->Vo:Z

    return-void
.end method

.method public final setFillXY(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/d;->Vr:Z

    return-void
.end method

.method public final setForce(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/d;->Vn:Z

    return-void
.end method

.method public final setHorizontalVideo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/video/d;->Vq:Z

    return-void
.end method

.method public final sf()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/video/d;->Vs:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final sg()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/core/video/d;->Vs:I

    return v0
.end method

.method public final sh()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vn:Z

    return v0
.end method

.method public final si()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vo:Z

    return v0
.end method

.method public final sj()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vp:Z

    return v0
.end method

.method public final sk()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vq:Z

    return v0
.end method

.method public final sl()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/d;->Vr:Z

    return v0
.end method
