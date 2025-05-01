.class public final Lcom/kwad/components/ad/reward/presenter/d/b;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/presenter/d/b$a;
    }
.end annotation


# instance fields
.field private mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    if-eqz p2, :cond_0

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/d/b;->iu()V

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/d/b;->iv()V

    return-void
.end method

.method private iu()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/g;->g(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/s;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/s;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 3
    :cond_0
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;-><init>()V

    .line 4
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cB(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 7
    :cond_1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/b$a;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/reward/presenter/d/b$a;-><init>(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ar(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :cond_2
    return-void
.end method

.method private iv()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/b;-><init>()V

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/d/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cB(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/d/a/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/d/a/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :cond_0
    return-void
.end method
