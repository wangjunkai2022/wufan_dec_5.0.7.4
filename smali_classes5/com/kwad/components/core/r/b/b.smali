.class public final Lcom/kwad/components/core/r/b/b;
.super Lcom/kwad/sdk/mvp/Presenter;
.source "SourceFile"


# instance fields
.field private Tr:Landroid/widget/FrameLayout;

.field private Tu:Lcom/kwad/components/core/r/a/b;

.field private Tx:Lcom/kwad/sdk/components/m;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/r/b/b;)Lcom/kwad/components/core/r/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/r/b/b;->Tu:Lcom/kwad/components/core/r/a/b;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/r/a/b;

    iput-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tu:Lcom/kwad/components/core/r/a/b;

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_js_container:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tr:Landroid/widget/FrameLayout;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/r/a/b;->Tl:Lcom/kwad/components/core/webview/tachikoma/k;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/k;->a([Ljava/lang/Object;)Lcom/kwad/sdk/components/m;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tx:Lcom/kwad/sdk/components/m;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tu:Lcom/kwad/components/core/r/a/b;

    iget-object v0, v0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    new-instance v1, Lcom/kwad/components/core/r/b/b$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/r/b/b$1;-><init>(Lcom/kwad/components/core/r/b/b;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tx:Lcom/kwad/sdk/components/m;

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void

    .line 9
    :cond_1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/r/b/b;->Tx:Lcom/kwad/sdk/components/m;

    invoke-interface {v1}, Lcom/kwad/sdk/components/m;->getView()Landroid/view/View;

    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tr:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tx:Lcom/kwad/sdk/components/m;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/m;->bindActivity(Landroid/app/Activity;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tx:Lcom/kwad/sdk/components/m;

    invoke-interface {v0}, Lcom/kwad/sdk/components/m;->render()V

    return-void
.end method

.method public final onBackPressed()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/r/b/b;->Tx:Lcom/kwad/sdk/components/m;

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

.method public final onUnbind()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    return-void
.end method
