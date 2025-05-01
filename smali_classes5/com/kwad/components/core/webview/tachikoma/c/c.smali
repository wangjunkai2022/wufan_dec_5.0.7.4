.class public Lcom/kwad/components/core/webview/tachikoma/c/c;
.super Lcom/kwad/components/core/webview/tachikoma/c/a;
.source "SourceFile"


# instance fields
.field private Tr:Landroid/widget/FrameLayout;

.field private Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

.field private abq:Lcom/kwad/components/core/webview/tachikoma/a/p;

.field private abr:Lcom/kwad/components/core/webview/jshandler/aw;

.field private abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

.field private xo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/a;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/c$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/c/c$2;-><init>(Lcom/kwad/components/core/webview/tachikoma/c/c;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/c/c;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->abr:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/core/webview/tachikoma/c/c;)Lcom/kwad/components/core/webview/tachikoma/c/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/core/webview/tachikoma/c/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/c;->tz()V

    return-void
.end method

.method private tz()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abp:Lcom/kwad/components/core/webview/tachikoma/c/e$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/c/e$a;->fU()Z

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/c;->getTkTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/c;->getTKReaderScene()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/core/webview/tachikoma/d/b;->s(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const-string v2, "render failed"

    .line 5
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/components/k;->callbackPageStatus(ZLjava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/a$a;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->abr:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    .line 19
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz p1, :cond_1

    .line 20
    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/g;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 21
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/c$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/c/c$3;-><init>(Lcom/kwad/components/core/webview/tachikoma/c/c;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->d(Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/c;->tz()V

    .line 23
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    return-void

    .line 24
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/c;->tz()V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/a/p;)V
    .locals 4

    .line 5
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->abq:Lcom/kwad/components/core/webview/tachikoma/a/p;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-wide v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->xt:J

    if-eqz p1, :cond_0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    .line 7
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/y;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/y;-><init>()V

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 8
    iput v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/y;->nF:I

    .line 9
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->abq:Lcom/kwad/components/core/webview/tachikoma/a/p;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/a/p;->a(Lcom/kwad/components/core/webview/tachikoma/b/y;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V
    .locals 1

    .line 11
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/c/a;->a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V

    .line 12
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object p1, p1, Lcom/kwad/components/core/webview/tachikoma/c/b;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    .line 15
    invoke-interface {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/e/c;->F(Z)V

    :cond_1
    return-void
.end method

.method protected final a(Lcom/kwad/components/core/webview/tachikoma/c/b;)V
    .locals 1

    .line 2
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/c/a;->a(Lcom/kwad/components/core/webview/tachikoma/c/b;)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, p1, Lcom/kwad/components/core/webview/tachikoma/c/b;->xo:Ljava/lang/String;

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->xo:Ljava/lang/String;

    .line 4
    iget-object p1, p1, Lcom/kwad/components/core/webview/tachikoma/c/b;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    return-void
.end method

.method public a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 0

    .line 16
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/c/a;->a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V

    .line 17
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object p1, p1, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    if-eqz p1, :cond_0

    .line 18
    invoke-interface {p1}, Lcom/kwad/sdk/components/k;->callbackDialogDismiss()V

    :cond_0
    return-void
.end method

.method public final aj()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/webview/tachikoma/c/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/e;->a(Lcom/kwad/components/core/webview/tachikoma/e/d;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/c/c$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/tachikoma/c/c$1;-><init>(Lcom/kwad/components/core/webview/tachikoma/c/c;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Lcom/kwad/sdk/core/webview/c/g;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    invoke-interface {v0, v1}, Lcom/kwad/sdk/components/k;->a(Lcom/kwad/sdk/components/o;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->gj:Lcom/kwad/components/core/webview/tachikoma/i;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "hasTKBridge"

    invoke-virtual {v0, v2, v1}, Lcom/kwad/components/core/webview/tachikoma/i;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->aW(Landroid/content/Context;)F

    move-result v0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->getScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    add-float/2addr v1, v2

    float-to-int v0, v1

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    return-void
.end method

.method public final bF()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/components/k;->callbackPageStatus(ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final bG()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/webview/tachikoma/c/a;->bG()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abo:Z

    if-eqz v1, :cond_0

    .line 3
    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    .line 4
    invoke-interface {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/e/c;->F(Z)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/core/proxy/g;->dismiss()V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/e/c;->gb()V

    :cond_2
    return-void
.end method

.method public getTKContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Tr:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_dialog"

    return-object v0
.end method

.method public getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->xo:Ljava/lang/String;

    return-object v0
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

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c;->Tr:Landroid/widget/FrameLayout;

    return-void
.end method
