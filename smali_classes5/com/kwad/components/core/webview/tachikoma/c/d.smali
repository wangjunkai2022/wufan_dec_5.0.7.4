.class public final Lcom/kwad/components/core/webview/tachikoma/c/d;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"


# instance fields
.field private Tr:Landroid/widget/FrameLayout;

.field private Tx:Lcom/kwad/sdk/components/m;

.field private Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

.field protected abk:Lcom/kwad/components/core/webview/tachikoma/c/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/webview/tachikoma/c/b;

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    .line 3
    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz v0, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/c/d$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/c/d$1;-><init>(Lcom/kwad/components/core/webview/tachikoma/c/d;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/e;->a(Lcom/kwad/components/core/webview/tachikoma/e/d;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abn:Lcom/kwad/components/core/webview/tachikoma/k;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/tachikoma/k;->a([Ljava/lang/Object;)Lcom/kwad/sdk/components/m;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Tx:Lcom/kwad/sdk/components/m;

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    invoke-interface {v0, v3, v4}, Lcom/kwad/sdk/components/k;->callbackPageStatus(ZLjava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void

    .line 8
    :cond_1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 9
    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Tx:Lcom/kwad/sdk/components/m;

    invoke-interface {v2}, Lcom/kwad/sdk/components/m;->getView()Landroid/view/View;

    move-result-object v2

    .line 10
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Tr:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Tx:Lcom/kwad/sdk/components/m;

    invoke-interface {v0}, Lcom/kwad/sdk/components/m;->render()V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    invoke-interface {v0, v1, v4}, Lcom/kwad/sdk/components/k;->callbackPageStatus(ZLjava/lang/String;)V

    return-void
.end method

.method public final onBackPressed()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Tx:Lcom/kwad/sdk/components/m;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/kwad/sdk/components/m;->onBackPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_tk_dialog_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/d;->Tr:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final onUnbind()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    return-void
.end method
