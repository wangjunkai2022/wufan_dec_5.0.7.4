.class public Lcom/kwad/components/ad/splashscreen/presenter/e;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"


# instance fields
.field public Di:Lcom/kwad/components/ad/splashscreen/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method


# virtual methods
.method public aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    .line 3
    instance-of v1, v0, Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v1, :cond_0

    .line 4
    check-cast v0, Lcom/kwad/components/ad/splashscreen/h;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    :cond_0
    return-void
.end method
