.class public final Lcom/kwad/components/ad/draw/b/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/draw/b/b/a$a;,
        Lcom/kwad/components/ad/draw/b/b/a$b;
    }
.end annotation


# instance fields
.field private cF:Lcom/kwad/components/ad/draw/b/b/a$a;

.field private cG:Lcom/kwad/components/ad/draw/b/b/a$b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private cH:Z

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/b/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/draw/b/b/a;->cH:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/draw/b/b/a$a;)V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/b/a;->cF:Lcom/kwad/components/ad/draw/b/b/a$a;

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/draw/b/b/a$b;)V
    .locals 0
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/b/a;->cG:Lcom/kwad/components/ad/draw/b/b/a$b;

    return-void
.end method

.method public final ap()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/draw/b/b/a;->cH:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/draw/b/b/a;->cH:Z

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/b/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->status:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/a;->cG:Lcom/kwad/components/ad/draw/b/b/a$b;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/kwad/components/ad/draw/b/b/a$b;->ar()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/a;->cF:Lcom/kwad/components/ad/draw/b/b/a$a;

    if-eqz v0, :cond_3

    .line 8
    invoke-interface {v0}, Lcom/kwad/components/ad/draw/b/b/a$a;->aq()V

    :cond_3
    :goto_0
    return-void
.end method
