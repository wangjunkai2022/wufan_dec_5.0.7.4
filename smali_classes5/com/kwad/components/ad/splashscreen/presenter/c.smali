.class public final Lcom/kwad/components/ad/splashscreen/presenter/c;
.super Lcom/kwad/components/ad/splashscreen/presenter/e;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/h/c;


# instance fields
.field private Da:Landroid/widget/TextView;

.field private Db:Lcom/kwad/components/ad/splashscreen/widget/b;

.field private Dc:Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

.field private Dd:Z

.field private De:Landroid/view/View;

.field private se:Lcom/kwad/sdk/core/response/model/AdInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Dd:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->kY()V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/presenter/c;)Lcom/kwad/components/ad/splashscreen/widget/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/splashscreen/presenter/c;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->De:Landroid/view/View;

    return-object p0
.end method

.method private kX()Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v2, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->adSplashInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    iget v3, v2, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;->imageDisplaySecond:I

    if-gtz v3, :cond_0

    const/4 v3, 0x5

    .line 3
    :cond_0
    iget v2, v2, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;->videoDisplaySecond:I

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v3, v1

    :cond_1
    iput v3, v0, Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;->skipSecond:I

    return-object v0
.end method

.method private kY()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/a;->kU()Lcom/kwad/components/ad/splashscreen/monitor/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/a;->Z(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/h;->kP()V

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->Cr:Lcom/kwad/components/ad/splashscreen/d/a;

    if-eqz v1, :cond_0

    :try_start_0
    const-string v2, "duration"

    .line 5
    invoke-virtual {v1}, Lcom/kwad/components/ad/splashscreen/d/a;->getCurrentPosition()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 7
    :cond_0
    :goto_0
    new-instance v1, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    .line 8
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {v2}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/kwad/sdk/core/adlog/a$a;->duration:J

    .line 10
    :cond_1
    new-instance v2, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v2}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/4 v3, 0x1

    .line 11
    invoke-virtual {v2, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cL(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v2

    const/16 v3, 0x16

    .line 12
    invoke-virtual {v2, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cT(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v2

    .line 13
    invoke-virtual {v2, v1}, Lcom/kwad/sdk/core/adlog/c/b;->b(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 14
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v2, v1, v0}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    return-void
.end method

.method private declared-synchronized la()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Dd:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cy(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cz(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v1, 0x7c

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Dd:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    .line 6
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    .line 7
    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private t(Lcom/kwad/sdk/core/response/model/AdInfo;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/e/c;->z(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    sget p1, Lcom/kwad/sdk/R$id;->ksad_splash_right_top_root:I

    goto :goto_0

    :cond_0
    sget p1, Lcom/kwad/sdk/R$id;->ksad_splash_left_top_root:I

    .line 3
    :goto_0
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static u(Lcom/kwad/sdk/core/response/model/AdInfo;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->cw(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private v(Lcom/kwad/sdk/core/response/model/AdInfo;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/kwad/components/ad/splashscreen/e/c;->z(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_preload_right_tips:I

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_preload_left_tips:I

    .line 4
    :goto_0
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Da:Landroid/widget/TextView;

    .line 5
    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->adPreloadInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Dc:Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;->preloadTips:Ljava/lang/String;

    invoke-static {p1}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Da:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Da:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Dc:Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdPreloadInfo;->preloadTips:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Da:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private w(Lcom/kwad/sdk/core/response/model/AdInfo;)V
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_skip_view_area:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->De:Landroid/view/View;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cx(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->adSplashInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdSplashInfo;->skipButtonPosition:I

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->De:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->De:Landroid/view/View;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/c$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/c$2;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/c;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->De:Landroid/view/View;

    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/c$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/c$3;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/c;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->De:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final aM()V
    .locals 2

    const-string v0, "SkipAdPresenter"

    const-string v1, "onPageVisible"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/splashscreen/widget/b;->B(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->la()V

    return-void
.end method

.method public final aN()V
    .locals 2

    const-string v0, "SkipAdPresenter"

    const-string v1, "onPageInvisible"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/splashscreen/widget/b;->A(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    return-void
.end method

.method public final aj()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;->aj()V

    const-string v0, "SkipAdPresenter"

    const-string v1, "onBind"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    .line 4
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->t(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->v(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->u(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/e/c;->z(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_skip_right_view:I

    goto :goto_0

    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_skip_left_view:I

    .line 9
    :goto_0
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/splashscreen/widget/b;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    goto :goto_2

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/e/c;->z(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_circle_skip_right_view:I

    goto :goto_1

    :cond_2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_splash_circle_skip_left_view:I

    .line 12
    :goto_1
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/splashscreen/widget/b;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    .line 13
    :goto_2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->kX()Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-interface {v0, v1, v2}, Lcom/kwad/components/ad/splashscreen/widget/b;->a(Lcom/kwad/components/ad/splashscreen/local/SplashSkipViewModel;Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/c$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/splashscreen/presenter/c$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/c;)V

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/splashscreen/widget/b;->setOnViewListener(Lcom/kwad/components/ad/splashscreen/widget/SkipView$a;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->se:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/c;->w(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/h/a;->a(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method

.method public final kZ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/c$4;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/splashscreen/presenter/c$4;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/h/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/c;->Db:Lcom/kwad/components/ad/splashscreen/widget/b;

    invoke-interface {v0}, Lcom/kwad/components/ad/splashscreen/widget/b;->bf()V

    return-void
.end method
