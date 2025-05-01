.class public abstract Lcom/kwad/components/core/webview/tachikoma/c/a;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/j;


# instance fields
.field protected abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

.field protected gj:Lcom/kwad/components/core/webview/tachikoma/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/tachikoma/a/o;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/a/p;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/m;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V
    .locals 0

    return-void
.end method

.method protected a(Lcom/kwad/components/core/webview/tachikoma/c/b;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object p1, p1, Lcom/kwad/components/core/webview/tachikoma/c/b;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    :cond_0
    return-void
.end method

.method public a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public aj()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/webview/tachikoma/c/b;

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/tachikoma/c/a;->a(Lcom/kwad/components/core/webview/tachikoma/c/b;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    if-nez v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/a;->hO()Lcom/kwad/components/core/webview/tachikoma/i;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    if-eqz v0, :cond_1

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v2, v1, Lcom/kwad/components/core/webview/tachikoma/c/b;->mActivity:Landroid/app/Activity;

    iget-object v1, v1, Lcom/kwad/components/core/webview/tachikoma/c/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v2, v1, p0}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/core/webview/tachikoma/j;)V

    return-void
.end method

.method public bG()V
    .locals 0

    return-void
.end method

.method public getTouchCoordsView()Lcom/kwad/sdk/widget/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abl:Lcom/kwad/sdk/widget/e;

    return-object v0
.end method

.method protected hO()Lcom/kwad/components/core/webview/tachikoma/i;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/i;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-wide v1, v1, Lcom/kwad/components/core/webview/tachikoma/c/b;->xt:J

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/webview/tachikoma/i;-><init>(JLandroid/content/Context;)V

    return-object v0
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/i;->jq()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    return-void
.end method
