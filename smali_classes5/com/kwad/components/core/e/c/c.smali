.class public Lcom/kwad/components/core/e/c/c;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"


# instance fields
.field protected KH:Lcom/kwad/components/core/e/c/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method


# virtual methods
.method public aj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/e/c/d;

    iput-object v0, p0, Lcom/kwad/components/core/e/c/c;->KH:Lcom/kwad/components/core/e/c/d;

    return-void
.end method
