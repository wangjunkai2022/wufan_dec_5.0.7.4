.class public final Lcom/kwad/components/ad/reward/presenter/platdetail/a;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 3
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 4
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/d;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/d;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/c;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method
