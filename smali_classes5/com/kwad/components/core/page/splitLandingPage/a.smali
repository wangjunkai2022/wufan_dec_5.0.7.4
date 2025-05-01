.class public final Lcom/kwad/components/core/page/splitLandingPage/a;
.super Lcom/kwad/components/core/proxy/e;
.source "SourceFile"


# instance fields
.field private OB:Lcom/kwad/components/core/widget/FeedVideoView;

.field private OC:Landroid/widget/LinearLayout;

.field private QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

.field private QG:Lcom/kwad/sdk/mvp/Presenter;

.field private QH:Lcom/kwad/components/core/page/splitLandingPage/view/a;

.field private QI:Lcom/kwad/components/core/page/c/a;

.field private QJ:Z

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/e;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/page/splitLandingPage/a;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OC:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/core/page/splitLandingPage/a;Z)Z
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QJ:Z

    return p1
.end method

.method public static au(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/page/splitLandingPage/a;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/splitLandingPage/a;

    invoke-direct {v0}, Lcom/kwad/components/core/page/splitLandingPage/a;-><init>()V

    .line 2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "key_photo"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-boolean p0, p0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    const-string v2, "key_report"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method static synthetic b(Lcom/kwad/components/core/page/splitLandingPage/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/splitLandingPage/a;->qv()V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/widget/FeedVideoView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/core/page/splitLandingPage/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/page/splitLandingPage/a;->qu()Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/page/splitLandingPage/a;)Lcom/kwad/components/core/page/splitLandingPage/view/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QH:Lcom/kwad/components/core/page/splitLandingPage/view/a;

    return-object p0
.end method

.method private initView()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/components/core/page/recycle/e;

    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/page/recycle/e;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QG:Lcom/kwad/sdk/mvp/Presenter;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    .line 3
    new-instance v1, Lcom/kwad/components/core/page/splitLandingPage/view/a;

    iget-object v2, p0, Lcom/kwad/components/core/proxy/e;->mContext:Landroid/content/Context;

    new-instance v3, Lcom/kwad/components/core/page/splitLandingPage/a/a;

    iget-object v4, v0, Lcom/kwad/components/core/page/recycle/e;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/components/core/page/recycle/e;->La:Lcom/kwad/components/core/e/d/c;

    invoke-direct {v3, v4, v0}, Lcom/kwad/components/core/page/splitLandingPage/a/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;)V

    invoke-direct {v1, v2, v3}, Lcom/kwad/components/core/page/splitLandingPage/view/a;-><init>(Landroid/content/Context;Lcom/kwad/components/core/page/splitLandingPage/a/a;)V

    iput-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QH:Lcom/kwad/components/core/page/splitLandingPage/view/a;

    .line 4
    new-instance v0, Lcom/kwad/components/core/page/splitLandingPage/a$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/page/splitLandingPage/a$3;-><init>(Lcom/kwad/components/core/page/splitLandingPage/a;)V

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/page/splitLandingPage/view/a;->a(Lcom/kwad/components/core/page/splitLandingPage/view/a$a;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    new-instance v1, Lcom/kwad/components/core/page/splitLandingPage/a$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/page/splitLandingPage/a$4;-><init>(Lcom/kwad/components/core/page/splitLandingPage/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    new-instance v1, Lcom/kwad/components/core/page/splitLandingPage/a$5;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/page/splitLandingPage/a$5;-><init>(Lcom/kwad/components/core/page/splitLandingPage/a;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;->setSplitScrollWebViewListener(Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView$a;)V

    return-void
.end method

.method private j(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QG:Lcom/kwad/sdk/mvp/Presenter;

    .line 2
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 3
    new-instance p1, Lcom/kwad/components/core/page/c/b;

    invoke-direct {p1}, Lcom/kwad/components/core/page/c/b;-><init>()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 5
    new-instance v0, Lcom/kwad/components/core/page/c/a;

    invoke-direct {v0}, Lcom/kwad/components/core/page/c/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QI:Lcom/kwad/components/core/page/c/a;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QG:Lcom/kwad/sdk/mvp/Presenter;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QG:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QI:Lcom/kwad/components/core/page/c/a;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method

.method private qu()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/webkit/WebView;->getTranslationY()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QJ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;->setDisableAnimation(Z)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QJ:Z

    .line 4
    iget-object v3, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    const/4 v4, 0x0

    .line 5
    invoke-virtual {v3}, Landroid/webkit/WebView;->getTranslationY()F

    move-result v5

    iget-object v6, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    invoke-virtual {v6}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v5, v6

    .line 6
    invoke-static {v3, v4, v2, v5}, Lcom/kwad/components/core/s/n;->a(Landroid/view/View;Landroid/view/animation/Interpolator;FF)Landroid/animation/Animator;

    move-result-object v2

    .line 7
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cd()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_1

    iget-object v4, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QH:Lcom/kwad/components/core/page/splitLandingPage/view/a;

    invoke-virtual {v4}, Lcom/kwad/components/core/page/splitLandingPage/view/a;->isVisible()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 9
    iget-object v4, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QH:Lcom/kwad/components/core/page/splitLandingPage/view/a;

    invoke-virtual {v4}, Lcom/kwad/components/core/page/splitLandingPage/view/a;->qw()V

    .line 10
    iget-object v4, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QH:Lcom/kwad/components/core/page/splitLandingPage/view/a;

    invoke-virtual {v4, v1}, Lcom/kwad/components/core/page/splitLandingPage/view/a;->aH(Z)Landroid/animation/Animator;

    move-result-object v4

    new-array v5, v5, [Landroid/animation/Animator;

    aput-object v4, v5, v1

    aput-object v2, v5, v0

    .line 11
    invoke-virtual {v3, v5}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 13
    :goto_0
    new-instance v1, Lcom/kwad/components/core/page/splitLandingPage/a$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/page/splitLandingPage/a$2;-><init>(Lcom/kwad/components/core/page/splitLandingPage/a;)V

    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 14
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method private qv()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QI:Lcom/kwad/components/core/page/c/a;

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->mw()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QI:Lcom/kwad/components/core/page/c/a;

    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 3
    new-instance v0, Lcom/kwad/components/core/page/recycle/e;

    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/kwad/components/core/page/recycle/e;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QI:Lcom/kwad/components/core/page/c/a;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method

.method private w(Landroid/view/View;)V
    .locals 3

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_tip_bar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OC:Landroid/widget/LinearLayout;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_tip_bar_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 3
    sget v1, Lcom/kwad/sdk/R$id;->ksad_web_tip_close_btn:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 4
    new-instance v1, Lcom/kwad/components/core/page/splitLandingPage/a$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/page/splitLandingPage/a$1;-><init>(Lcom/kwad/components/core/page/splitLandingPage/a;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bx(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bt(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_0

    .line 8
    iget-object v1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OC:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    return-void

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OC:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final onBackPressed()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    return v1

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/core/page/splitLandingPage/a;->qu()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    if-eqz v0, :cond_2

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/FeedVideoView;->tU()Z

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/components/core/proxy/e;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "key_photo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/AdTemplate;-><init>()V

    if-eqz p1, :cond_0

    .line 4
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 6
    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "key_report"

    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    .line 8
    iget-object p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdWebVideoPageShowing:Z

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/proxy/e;->onDestroy()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdWebVideoPageShowing:Z

    :cond_0
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    sget p2, Lcom/kwad/sdk/R$id;->ksad_split_land_ad_feed_video:I

    invoke-virtual {p0, p2}, Lcom/kwad/components/core/proxy/e;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/kwad/components/core/widget/FeedVideoView;

    iput-object p2, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    .line 3
    sget p2, Lcom/kwad/sdk/R$id;->ksad_video_webView:I

    invoke-virtual {p0, p2}, Lcom/kwad/components/core/proxy/e;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    iput-object p2, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->QF:Lcom/kwad/components/core/page/splitLandingPage/view/SplitScrollWebView;

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/components/core/page/splitLandingPage/a;->w(Landroid/view/View;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/proxy/e;->lD:Landroid/view/ViewGroup;

    invoke-direct {p0, p1}, Lcom/kwad/components/core/page/splitLandingPage/a;->j(Landroid/view/ViewGroup;)V

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/core/page/splitLandingPage/a;->initView()V

    return-void
.end method

.method public final pB()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_split_land_page:I

    return v0
.end method

.method public final qw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->OB:Lcom/kwad/components/core/widget/FeedVideoView;

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/FeedVideoView;->qw()V

    return-void
.end method

.method public final setApkDownloadHelper(Lcom/kwad/components/core/e/d/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/splitLandingPage/a;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-void
.end method
