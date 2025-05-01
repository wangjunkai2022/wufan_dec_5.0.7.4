.class public final Lcom/kwad/components/ad/splashscreen/presenter/l;
.super Lcom/kwad/components/ad/splashscreen/presenter/i;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/kwad/components/ad/splashscreen/g;
.implements Lcom/kwad/sdk/core/g/a;


# instance fields
.field private DB:Landroid/view/View;

.field private DC:Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;

.field private DD:Landroid/widget/TextView;

.field private DE:Landroid/widget/TextView;

.field private DF:Lcom/kwad/sdk/core/g/c;

.field private DG:Lcom/kwad/components/ad/splashscreen/d;

.field private mStartTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/l;)Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DC:Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/presenter/l;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->mStartTime:J

    return-wide v0
.end method


# virtual methods
.method public final V(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Ct:Lcom/kwad/sdk/core/h/a;

    invoke-interface {v0}, Lcom/kwad/sdk/core/h/a;->ud()Z

    move-result v0

    .line 2
    invoke-static {}, Lcom/kwad/components/core/e/c/b;->nQ()Z

    move-result v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DC:Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;

    invoke-virtual {v0}, Lcom/kwad/components/ad/splashscreen/widget/c;->mu()V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    .line 5
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v3

    const/16 v4, 0xa1

    const/4 v5, 0x2

    new-instance v6, Lcom/kwad/components/ad/splashscreen/presenter/l$3;

    invoke-direct {v6, p0, p1}, Lcom/kwad/components/ad/splashscreen/presenter/l$3;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/l;Ljava/lang/String;)V

    invoke-virtual/range {v1 .. v6}, Lcom/kwad/components/ad/splashscreen/h;->a(ILandroid/content/Context;IILcom/kwad/components/ad/splashscreen/h$a;)V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/kwad/components/ad/splashscreen/presenter/i;->lr()V

    .line 7
    invoke-virtual {p0}, Lcom/kwad/components/ad/splashscreen/presenter/l;->lo()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final W(I)V
    .locals 0

    return-void
.end method

.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/i;->aj()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getRootView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/l$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/splashscreen/presenter/l$2;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/l;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/splashscreen/h;->a(Lcom/kwad/components/ad/splashscreen/g;)V

    :cond_0
    return-void
.end method

.method protected final initView()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->mStartTime:J

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_rotate_layout:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DB:Landroid/view/View;

    goto :goto_0

    .line 4
    :cond_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_rotate_root:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DB:Landroid/view/View;

    .line 5
    :goto_0
    sget v0, Lcom/kwad/sdk/R$id;->ksad_rotate_text:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DD:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_rotate_action:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DE:Landroid/widget/TextView;

    .line 7
    sget v0, Lcom/kwad/sdk/R$id;->ksad_rotate_view:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DC:Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;

    .line 8
    invoke-virtual {v0, p0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected final j(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DE:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    .line 2
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "\u6216\u70b9\u51fb"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final kB()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DF:Lcom/kwad/sdk/core/g/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/c;->bw(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method protected final lk()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v2, v2, Lcom/kwad/components/ad/splashscreen/h;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    const/4 v3, 0x1

    .line 4
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/splashscreen/d;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/components/core/e/d/c;I)Lcom/kwad/components/ad/splashscreen/d;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DG:Lcom/kwad/components/ad/splashscreen/d;

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DD:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->dr(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DE:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u6216\u70b9\u51fb"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DG:Lcom/kwad/components/ad/splashscreen/d;

    .line 9
    invoke-virtual {v2}, Lcom/kwad/components/ad/splashscreen/d;->kv()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method protected final ll()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DB:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    const/16 v2, 0xb8

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/a;->tC()Lcom/kwad/components/core/webview/tachikoma/d/a;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/webview/tachikoma/d/a;->aW(I)V

    :cond_0
    return-void
.end method

.method protected final lm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cW(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DF:Lcom/kwad/sdk/core/g/c;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/sdk/core/g/c;

    invoke-direct {v1, v0}, Lcom/kwad/sdk/core/g/c;-><init>(Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;)V

    iput-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DF:Lcom/kwad/sdk/core/g/c;

    .line 5
    invoke-virtual {v1, p0}, Lcom/kwad/sdk/core/g/c;->a(Lcom/kwad/sdk/core/g/a;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/g/c;->a(Lcom/kwad/sdk/core/response/model/AdMatrixInfo$RotateInfo;)V

    return-void
.end method

.method protected final ln()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DF:Lcom/kwad/sdk/core/g/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/c;->bv(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method protected final lo()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DF:Lcom/kwad/sdk/core/g/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/c;->bw(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method protected final lp()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/l;->DC:Lcom/kwad/components/ad/splashscreen/widget/KsRotateView;

    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/l$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/splashscreen/presenter/l$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ls()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bP(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v2, 0xa2

    invoke-virtual {p1, v1, v0, v2, v1}, Lcom/kwad/components/ad/splashscreen/h;->c(ILandroid/content/Context;II)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/i;->onUnbind()V

    const-string v0, "SplashRotatePresenter"

    const-string v1, "onUnbind"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/splashscreen/h;->b(Lcom/kwad/components/ad/splashscreen/g;)V

    :cond_0
    return-void
.end method
