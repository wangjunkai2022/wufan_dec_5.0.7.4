.class public final Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;
.super Lcom/kwad/components/ad/splashscreen/presenter/a/c;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/h/c;


# instance fields
.field private ld:Landroid/widget/FrameLayout;

.field private wA:Lcom/kwad/components/core/webview/jshandler/aw;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/a/c;-><init>()V

    return-void
.end method

.method private Z(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->mTimerHelper:Lcom/kwad/sdk/utils/bn;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/adlog/a$a;->duration:J

    .line 4
    :cond_0
    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/4 v2, 0x6

    .line 5
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cT(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 6
    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/adlog/c/b;->b(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    const/16 p1, 0xe

    .line 7
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/adlog/c/b;->cL(I)Lcom/kwad/sdk/core/adlog/c/b;

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 8
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/adlog/c/b;->cL(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method private a(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/x;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 17
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    new-instance v2, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h$1;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    return-object v0
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method private lU()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->splash_play_card_view:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    .line 13
    invoke-super {p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/a/c;->a(Lcom/kwad/components/core/webview/jshandler/aw;)V

    .line 14
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->lU()V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->ld:Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 1

    .line 7
    invoke-super {p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/a/c;->a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V

    .line 8
    iget v0, p1, Lcom/kwad/sdk/commercial/model/WebCloseStatus;->closeType:I

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->Z(I)V

    .line 9
    iget p1, p1, Lcom/kwad/sdk/commercial/model/WebCloseStatus;->closeType:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 10
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/h;->kT()V

    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/a;->kU()Lcom/kwad/components/ad/splashscreen/monitor/a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v0}, Lcom/kwad/components/ad/splashscreen/monitor/a;->Z(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    invoke-virtual {p1}, Lcom/kwad/components/ad/splashscreen/h;->kP()V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    .line 15
    invoke-super {p0, p1, p2}, Lcom/kwad/components/ad/splashscreen/presenter/a/c;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V

    .line 16
    invoke-direct {p0, p2}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->a(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/x;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method public final aM()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_0
    return-void
.end method

.method public final aj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/a/c;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/h/a;->a(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 2

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->px2dip(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v1, Lcom/kwad/components/ad/splashscreen/h;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/c/a/a;->px2dip(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    return-void
.end method

.method public final bF()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->lU()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->ld:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method public final getTKContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->ld:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_splash_end_card"

    return-object v0
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->du(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->splash_end_card_view:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->ld:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/endcard/h;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 4
    :cond_0
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/a/c;->onUnbind()V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    invoke-interface {v0, p0}, Lcom/kwad/sdk/core/h/a;->b(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method
