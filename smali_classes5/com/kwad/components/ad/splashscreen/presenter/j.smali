.class public final Lcom/kwad/components/ad/splashscreen/presenter/j;
.super Lcom/kwad/components/ad/splashscreen/presenter/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/j;->bQ()V

    return-void
.end method

.method private bQ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/b;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/b;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 3
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/c;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/c;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/d;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/d;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 6
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/q;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/q;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/h;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/h;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-boolean v1, v1, Lcom/kwad/components/ad/splashscreen/h;->Cz:Z

    if-eqz v1, :cond_1

    .line 9
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/p;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/p;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dB(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dF(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v3

    .line 12
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dK(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v4

    .line 13
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dH(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 14
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/n;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/n;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    .line 15
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/m;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/m;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    .line 16
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/l;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/l;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    goto :goto_1

    :cond_4
    if-eqz v4, :cond_5

    .line 17
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/p;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/p;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    goto :goto_1

    .line 18
    :cond_5
    new-instance v1, Lcom/kwad/components/ad/splashscreen/presenter/p;

    invoke-direct {v1}, Lcom/kwad/components/ad/splashscreen/presenter/p;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 19
    :goto_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aO(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 20
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/f;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/f;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-boolean v0, v0, Lcom/kwad/components/ad/splashscreen/h;->CA:Z

    if-nez v0, :cond_7

    .line 22
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/b;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 23
    :cond_7
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/a;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 24
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/g;

    invoke-direct {v0}, Lcom/kwad/components/ad/splashscreen/presenter/g;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;->aj()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/j$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/j$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/j;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->splash_play_card_view:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
