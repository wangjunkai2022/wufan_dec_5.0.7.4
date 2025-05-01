.class public final Lcom/kwad/components/core/e/a/g;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation


# instance fields
.field private final Kk:Lcom/kwad/components/core/e/a/d;

.field private Kt:Lcom/kwad/components/core/e/a/a;

.field private final Kv:Lcom/kwad/components/core/e/a/d;

.field private final bQ:Lcom/kwad/components/core/widget/a/b;

.field private final mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mPresenter:Lcom/kwad/sdk/mvp/Presenter;

.field private oa:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/a/d;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Lcom/kwad/components/core/e/a/g$1;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/e/a/g$1;-><init>(Lcom/kwad/components/core/e/a/g;)V

    iput-object p1, p0, Lcom/kwad/components/core/e/a/g;->Kv:Lcom/kwad/components/core/e/a/d;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/e/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iput-object p3, p0, Lcom/kwad/components/core/e/a/g;->Kk:Lcom/kwad/components/core/e/a/d;

    .line 5
    new-instance p1, Lcom/kwad/components/core/widget/a/b;

    const/16 p2, 0x46

    invoke-direct {p1, p0, p2}, Lcom/kwad/components/core/widget/a/b;-><init>(Landroid/view/View;I)V

    iput-object p1, p0, Lcom/kwad/components/core/e/a/g;->bQ:Lcom/kwad/components/core/widget/a/b;

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/core/e/a/g;->initMVP()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/e/a/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/a/g;->dK()V

    return-void
.end method

.method private dK()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/a/g;->oa:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/e/a/g;->oa:Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/g;->Kk:Lcom/kwad/components/core/e/a/d;

    invoke-interface {v0}, Lcom/kwad/components/core/e/a/d;->nD()V

    return-void
.end method

.method private initMVP()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/e/a/g;->nK()Lcom/kwad/components/core/e/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/e/a/g;->Kt:Lcom/kwad/components/core/e/a/a;

    .line 2
    invoke-static {}, Lcom/kwad/components/core/e/a/g;->onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/e/a/g;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 3
    invoke-virtual {v0, p0}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/a/g;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v1, p0, Lcom/kwad/components/core/e/a/g;->Kt:Lcom/kwad/components/core/e/a/a;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method

.method private nK()Lcom/kwad/components/core/e/a/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/a/a;

    invoke-direct {v0}, Lcom/kwad/components/core/e/a/a;-><init>()V

    .line 2
    iput-object p0, v0, Lcom/kwad/components/core/e/a/a;->Ki:Lcom/kwad/components/core/e/a/g;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/e/a/g;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/e/a/g;->bQ:Lcom/kwad/components/core/widget/a/b;

    iput-object v1, v0, Lcom/kwad/components/core/e/a/a;->Kj:Lcom/kwad/components/core/widget/a/b;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/e/a/g;->Kv:Lcom/kwad/components/core/e/a/d;

    iput-object v1, v0, Lcom/kwad/components/core/e/a/a;->Kk:Lcom/kwad/components/core/e/a/d;

    return-object v0
.end method

.method private static onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    .line 2
    new-instance v1, Lcom/kwad/components/core/e/a/f;

    invoke-direct {v1}, Lcom/kwad/components/core/e/a/f;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-object v0
.end method


# virtual methods
.method public final ac()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    const-string v0, "InstalledActivateView"

    const-string v1, "onViewAttached"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/g;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ua()V

    return-void
.end method

.method public final ad()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ad()V

    const-string v0, "InstalledActivateView"

    const-string v1, "onViewDetached"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/e/a/g;->bQ:Lcom/kwad/components/core/widget/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->release()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/e/a/g;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/e/a/g;->Kt:Lcom/kwad/components/core/e/a/a;

    invoke-virtual {v0}, Lcom/kwad/components/core/e/a/a;->release()V

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/core/e/a/g;->dK()V

    return-void
.end method
