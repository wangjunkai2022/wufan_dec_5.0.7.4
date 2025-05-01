.class public abstract Lcom/kwad/components/core/l/c;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/kwad/sdk/mvp/a;",
        ">",
        "Lcom/kwad/sdk/widget/KSFrameLayout;"
    }
.end annotation


# instance fields
.field public MW:Lcom/kwad/sdk/mvp/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected lD:Landroid/view/ViewGroup;

.field protected mPresenter:Lcom/kwad/sdk/mvp/Presenter;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/l/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kwad/components/core/l/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->kq()Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->pi()V

    :cond_0
    return-void
.end method

.method private initMVP()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->ku()Lcom/kwad/sdk/mvp/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/l/c;->MW:Lcom/kwad/sdk/mvp/a;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/l/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/l/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/l/c;->lD:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/l/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v1, p0, Lcom/kwad/components/core/l/c;->MW:Lcom/kwad/sdk/mvp/a;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public ac()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/l/c;->initMVP()V

    return-void
.end method

.method public ad()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ad()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/l/c;->MW:Lcom/kwad/sdk/mvp/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/a;->release()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/l/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V

    :cond_1
    return-void
.end method

.method protected abstract getLayoutId()I
    .annotation build Landroidx/annotation/LayoutRes;
    .end annotation
.end method

.method protected abstract initData()V
.end method

.method protected kq()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected abstract ks()V
.end method

.method protected abstract ku()Lcom/kwad/sdk/mvp/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method protected final pi()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->initData()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->getLayoutId()I

    move-result v1

    invoke-static {v0, v1, p0}, Lcom/kwad/sdk/n/l;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/core/l/c;->lD:Landroid/view/ViewGroup;

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/l/c;->ks()V

    return-void
.end method
