.class public final Lcom/kwad/components/core/page/c;
.super Lcom/kwad/components/core/l/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/l/c<",
        "Lcom/kwad/components/core/page/c/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field private OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private mAutoShow:Z

.field private mContext:Landroid/content/Context;

.field private mLandPageViewListener:Lcom/kwad/components/core/page/a/a;

.field private mPageTitle:Ljava/lang/String;

.field private mPageUrl:Ljava/lang/String;

.field private mShowPermission:Z

.field private mWebCardCloseListener:Lcom/kwad/sdk/core/webview/d/a/b;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/l/c;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;)Lcom/kwad/components/core/page/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/c;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/c;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/page/c;->b(Landroid/content/Context;Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;)V

    return-object v0
.end method

.method private b(Landroid/content/Context;Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/kwad/components/core/page/c;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/page/c;->mContext:Landroid/content/Context;

    .line 3
    invoke-virtual {p2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/page/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-virtual {p2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->pF()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/page/c;->mPageUrl:Ljava/lang/String;

    .line 5
    invoke-virtual {p2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->pE()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/page/c;->mPageTitle:Ljava/lang/String;

    .line 6
    invoke-virtual {p2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->pH()Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/core/page/c;->mShowPermission:Z

    .line 7
    invoke-virtual {p2}, Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;->pJ()Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/core/page/c;->mAutoShow:Z

    return-void
.end method

.method private pL()Lcom/kwad/components/core/page/c/a/b;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/c/a/b;

    invoke-direct {v0}, Lcom/kwad/components/core/page/c/a/b;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->mContext:Landroid/content/Context;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->mContext:Landroid/content/Context;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->mPageTitle:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->mPageTitle:Ljava/lang/String;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->mPageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->mPageUrl:Ljava/lang/String;

    .line 7
    iget-boolean v1, p0, Lcom/kwad/components/core/page/c;->mAutoShow:Z

    iput-boolean v1, v0, Lcom/kwad/components/core/page/c/a/b;->mAutoShow:Z

    .line 8
    iget-boolean v1, p0, Lcom/kwad/components/core/page/c;->mShowPermission:Z

    iput-boolean v1, v0, Lcom/kwad/components/core/page/c/a/b;->mShowPermission:Z

    .line 9
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->mLandPageViewListener:Lcom/kwad/components/core/page/a/a;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->Pl:Lcom/kwad/components/core/page/a/a;

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/page/c;->mWebCardCloseListener:Lcom/kwad/sdk/core/webview/d/a/b;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/c/a/b;->setWebCardCloseListener(Lcom/kwad/sdk/core/webview/d/a/b;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/l/c;->lD:Landroid/view/ViewGroup;

    iput-object v1, v0, Lcom/kwad/components/core/page/c/a/b;->gS:Landroid/view/ViewGroup;

    return-object v0
.end method


# virtual methods
.method public final ad()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/l/c;->ad()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/c;->release()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/kwad/components/core/page/c;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    :cond_0
    return-void
.end method

.method public final getCanInterceptBackClick()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/page/c/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/page/c/a/b;->pS()Z

    move-result v0

    return v0
.end method

.method public final getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_activity_ad_webview:I

    return v0
.end method

.method public final initData()V
    .locals 0

    return-void
.end method

.method public final ks()V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_webview:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/core/page/c;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    return-void
.end method

.method public final synthetic ku()Lcom/kwad/sdk/mvp/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/c;->pL()Lcom/kwad/components/core/page/c/a/b;

    move-result-object v0

    return-object v0
.end method

.method public final onCreatePresenter()Lcom/kwad/sdk/mvp/Presenter;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    .line 2
    new-instance v1, Lcom/kwad/components/core/page/c/a/f;

    invoke-direct {v1}, Lcom/kwad/components/core/page/c/a/f;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 3
    new-instance v1, Lcom/kwad/components/core/page/c/a/e;

    invoke-direct {v1}, Lcom/kwad/components/core/page/c/a/e;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/l/c;->MW:Lcom/kwad/sdk/mvp/a;

    check-cast v1, Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Lcom/kwad/components/core/page/c/a/c;

    invoke-direct {v1}, Lcom/kwad/components/core/page/c/a/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/l/c;->MW:Lcom/kwad/sdk/mvp/a;

    check-cast v1, Lcom/kwad/components/core/page/c/a/b;

    iget-object v1, v1, Lcom/kwad/components/core/page/c/a/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aN(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->rp()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-static {}, Lcom/kwad/components/core/q/a;->rj()Lcom/kwad/components/core/q/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/q/a;->rk()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 9
    new-instance v1, Lcom/kwad/components/core/page/c/a/d;

    invoke-direct {v1}, Lcom/kwad/components/core/page/c/a/d;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 10
    :cond_1
    new-instance v1, Lcom/kwad/components/core/page/c/a/g;

    invoke-direct {v1}, Lcom/kwad/components/core/page/c/a/g;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-object v0
.end method

.method public final pM()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/l/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/page/c/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/page/c/a/b;->pM()V

    return-void
.end method

.method public final setLandPageViewListener(Lcom/kwad/components/core/page/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c;->mLandPageViewListener:Lcom/kwad/components/core/page/a/a;

    return-void
.end method

.method public final setWebCardCloseListener(Lcom/kwad/sdk/core/webview/d/a/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c;->mWebCardCloseListener:Lcom/kwad/sdk/core/webview/d/a/b;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c;->mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-interface {p1, v0}, Lcom/kwad/sdk/core/webview/d/a/b;->b(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V

    :cond_0
    return-void
.end method
