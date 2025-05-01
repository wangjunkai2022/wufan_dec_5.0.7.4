.class public final Lcom/kwad/components/core/webview/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/b$a;
    }
.end annotation


# instance fields
.field private HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

.field private Wj:Landroid/view/ViewGroup;

.field private Wk:Lcom/kwad/components/core/webview/a/a;

.field private Wl:Lcom/kwad/components/core/webview/jshandler/au;

.field private Wm:Lcom/kwad/sdk/core/download/d;

.field private Wn:Z

.field private Wo:Lcom/kwad/components/core/webview/jshandler/aq$b;

.field private cN:Lcom/kwad/components/core/webview/a;

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private fY:Lcom/kwad/components/core/webview/c;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

.field private mPageUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/b$13;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/b$13;-><init>(Lcom/kwad/components/core/webview/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->Wo:Lcom/kwad/components/core/webview/jshandler/aq$b;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/b;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private static a(Lcom/kwad/components/core/webview/c;Landroid/webkit/WebView;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 19
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/c;->qg()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->fY:Lcom/kwad/components/core/webview/c;

    if-nez v0, :cond_0

    return-void

    .line 18
    :cond_0
    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/c;->a(Lcom/kwad/components/core/webview/jshandler/aw;)V

    return-void
.end method

.method private aA()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->cN:Lcom/kwad/components/core/webview/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a;->destroy()V

    .line 3
    iput-object v1, p0, Lcom/kwad/components/core/webview/b;->cN:Lcom/kwad/components/core/webview/a;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->Wk:Lcom/kwad/components/core/webview/a/a;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/a/a;->destroy()V

    .line 6
    iput-object v1, p0, Lcom/kwad/components/core/webview/b;->Wk:Lcom/kwad/components/core/webview/a/a;

    :cond_1
    return-void
.end method

.method private ax()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    const/4 v1, 0x0

    iput v1, v0, Lcom/kwad/sdk/core/webview/b;->mScreenOrientation:I

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->Wj:Landroid/view/ViewGroup;

    iput-object v1, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/webview/b;)Lcom/kwad/sdk/core/webview/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    return-object p0
.end method

.method private b(Lcom/kwad/components/core/webview/a;Lcom/kwad/sdk/core/webview/b;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 8
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/aw;-><init>()V

    .line 9
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 10
    invoke-direct {v0, v3}, Lcom/kwad/components/core/webview/b;->a(Lcom/kwad/components/core/webview/jshandler/aw;)V

    .line 11
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/t;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/t;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 12
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/b;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/b;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 13
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/u;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/u;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 14
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/o;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/o;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 15
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/p;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/p;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 16
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/ak;

    invoke-direct {v3, v2}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    .line 17
    new-instance v4, Lcom/kwad/components/core/webview/jshandler/m;

    invoke-direct {v4, v2}, Lcom/kwad/components/core/webview/jshandler/m;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {v1, v4}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 18
    new-instance v4, Lcom/kwad/components/core/webview/jshandler/l;

    invoke-direct {v4, v2}, Lcom/kwad/components/core/webview/jshandler/l;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {v1, v4}, Lcom/kwad/components/core/webview/a;->b(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 19
    invoke-direct/range {p0 .. p0}, Lcom/kwad/components/core/webview/b;->sH()Lcom/kwad/components/core/webview/jshandler/ak$a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kwad/components/core/webview/jshandler/ak;->a(Lcom/kwad/components/core/webview/jshandler/ak$a;)V

    .line 20
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 21
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/ad;

    invoke-direct {v3, v2}, Lcom/kwad/components/core/webview/jshandler/ad;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 22
    new-instance v3, Lcom/kwad/components/core/webview/tachikoma/a/f;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/tachikoma/a/f;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 23
    iget-object v3, v0, Lcom/kwad/components/core/webview/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-nez v3, :cond_0

    .line 24
    new-instance v3, Lcom/kwad/components/core/e/d/c;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v3, v4}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object v3, v0, Lcom/kwad/components/core/webview/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 25
    :cond_0
    iget-boolean v3, v0, Lcom/kwad/components/core/webview/b;->Wn:Z

    if-nez v3, :cond_1

    .line 26
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/aa;

    iget-object v5, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v6, v0, Lcom/kwad/components/core/webview/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 27
    invoke-direct/range {p0 .. p0}, Lcom/kwad/components/core/webview/b;->getClickListener()Lcom/kwad/sdk/core/webview/d/a/a;

    move-result-object v7

    invoke-direct/range {p0 .. p0}, Lcom/kwad/components/core/webview/b;->sF()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v3

    invoke-direct/range {v4 .. v10}, Lcom/kwad/components/core/webview/jshandler/aa;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;ZZZ)V

    .line 28
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 29
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v12, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v13, v0, Lcom/kwad/components/core/webview/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 30
    invoke-direct/range {p0 .. p0}, Lcom/kwad/components/core/webview/b;->getClickListener()Lcom/kwad/sdk/core/webview/d/a/a;

    move-result-object v14

    invoke-direct/range {p0 .. p0}, Lcom/kwad/components/core/webview/b;->sF()Z

    move-result v15

    const/16 v16, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/kwad/components/core/webview/b;->sG()Z

    move-result v17

    const/16 v18, 0x1

    move-object v11, v3

    invoke-direct/range {v11 .. v18}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;ZIZZ)V

    .line 31
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 32
    :cond_1
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/az;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v5, v0, Lcom/kwad/components/core/webview/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-direct {v3, v4, v5}, Lcom/kwad/components/core/webview/jshandler/az;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 33
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/as;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v3, v4}, Lcom/kwad/components/core/webview/jshandler/as;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 34
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/ap;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v4, v4, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    .line 35
    invoke-virtual {v4}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, v0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v3, v4, v5}, Lcom/kwad/components/core/webview/jshandler/ap;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 36
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 37
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/bd;

    new-instance v4, Lcom/kwad/components/core/webview/b$1;

    invoke-direct {v4, v0}, Lcom/kwad/components/core/webview/b$1;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-direct {v3, v4}, Lcom/kwad/components/core/webview/jshandler/bd;-><init>(Lcom/kwad/components/core/webview/jshandler/bd$a;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 38
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/ah;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v3, v4}, Lcom/kwad/components/core/webview/jshandler/ah;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 39
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/aq;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->Wo:Lcom/kwad/components/core/webview/jshandler/aq$b;

    iget-object v5, v0, Lcom/kwad/components/core/webview/b;->mPageUrl:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lcom/kwad/components/core/webview/jshandler/aq;-><init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V

    .line 40
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 41
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/au;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/jshandler/au;-><init>()V

    iput-object v3, v0, Lcom/kwad/components/core/webview/b;->Wl:Lcom/kwad/components/core/webview/jshandler/au;

    .line 42
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 43
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/y;

    new-instance v4, Lcom/kwad/components/core/webview/b$6;

    invoke-direct {v4, v0}, Lcom/kwad/components/core/webview/b$6;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-direct {v3, v4}, Lcom/kwad/components/core/webview/jshandler/y;-><init>(Lcom/kwad/sdk/core/webview/d/a/b;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 44
    new-instance v3, Lcom/kwad/components/core/webview/tachikoma/a/s;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/tachikoma/a/s;-><init>()V

    .line 45
    new-instance v4, Lcom/kwad/components/core/webview/b$7;

    invoke-direct {v4, v0}, Lcom/kwad/components/core/webview/b$7;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-virtual {v3, v4}, Lcom/kwad/components/core/webview/tachikoma/a/s;->a(Lcom/kwad/components/core/webview/tachikoma/a/s$a;)V

    .line 46
    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 47
    new-instance v3, Lcom/kwad/components/core/webview/tachikoma/a/k;

    invoke-direct {v3}, Lcom/kwad/components/core/webview/tachikoma/a/k;-><init>()V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 48
    new-instance v3, Lcom/kwad/components/core/webview/jshandler/ag;

    invoke-direct {v3, v2}, Lcom/kwad/components/core/webview/jshandler/ag;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    invoke-virtual {v1, v3}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 49
    iget-object v2, v0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->aE(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 50
    new-instance v2, Lcom/kwad/components/core/webview/tachikoma/a/l;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/tachikoma/a/l;-><init>()V

    .line 51
    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 52
    new-instance v3, Lcom/kwad/components/core/webview/b$8;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v3, v0, v4, v2}, Lcom/kwad/components/core/webview/b$8;-><init>(Lcom/kwad/components/core/webview/b;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/webview/tachikoma/a/l;)V

    iput-object v3, v0, Lcom/kwad/components/core/webview/b;->Wm:Lcom/kwad/sdk/core/download/d;

    .line 53
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v2

    iget-object v3, v0, Lcom/kwad/components/core/webview/b;->Wm:Lcom/kwad/sdk/core/download/d;

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v2, v3, v4}, Lcom/kwad/sdk/core/download/b;->a(Lcom/kwad/sdk/core/download/c;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 54
    :cond_2
    new-instance v2, Lcom/kwad/components/core/webview/b$9;

    invoke-direct {v2, v0}, Lcom/kwad/components/core/webview/b$9;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 55
    new-instance v2, Lcom/kwad/components/core/webview/b$10;

    invoke-direct {v2, v0}, Lcom/kwad/components/core/webview/b$10;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 56
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/d;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/d;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 57
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/g;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/g;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 58
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/j;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/j;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 59
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/c;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/c;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 60
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/ac;

    iget-object v3, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v2, v3}, Lcom/kwad/components/core/webview/jshandler/ac;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    .line 61
    new-instance v3, Lcom/kwad/components/core/webview/b$11;

    invoke-direct {v3, v0}, Lcom/kwad/components/core/webview/b$11;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-virtual {v2, v3}, Lcom/kwad/components/core/webview/jshandler/ac;->a(Lcom/kwad/components/core/webview/jshandler/ac$b;)V

    .line 62
    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 63
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/k;

    iget-object v3, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v3, v3, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    .line 64
    invoke-virtual {v3}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, v0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v2, v3, v4}, Lcom/kwad/components/core/webview/jshandler/k;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 65
    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 66
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/aj;

    iget-object v3, v0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    new-instance v4, Lcom/kwad/components/core/webview/b$12;

    invoke-direct {v4, v0}, Lcom/kwad/components/core/webview/b$12;-><init>(Lcom/kwad/components/core/webview/b;)V

    invoke-direct {v2, v3, v4}, Lcom/kwad/components/core/webview/jshandler/aj;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/webview/jshandler/aj$b;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 67
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/i;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/i;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 68
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/s;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/s;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 69
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/r;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/r;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 70
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/q;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/q;-><init>()V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method private b(Lcom/kwad/sdk/core/webview/KsAdWebView;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled",
            "AddJavascriptInterface",
            "JavascriptInterface"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->aA()V

    .line 3
    new-instance v0, Lcom/kwad/components/core/webview/a;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/webview/a;-><init>(Landroid/webkit/WebView;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->cN:Lcom/kwad/components/core/webview/a;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {p0, v0, v1}, Lcom/kwad/components/core/webview/b;->b(Lcom/kwad/components/core/webview/a;Lcom/kwad/sdk/core/webview/b;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->fY:Lcom/kwad/components/core/webview/c;

    if-eqz v0, :cond_0

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->cN:Lcom/kwad/components/core/webview/a;

    iget-object v2, p0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/core/webview/c;->a(Lcom/kwad/components/core/webview/a;Lcom/kwad/sdk/core/webview/b;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->cN:Lcom/kwad/components/core/webview/a;

    const-string v1, "KwaiAd"

    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/webview/b;)Lcom/kwad/components/core/webview/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/b;->fY:Lcom/kwad/components/core/webview/c;

    return-object p0
.end method

.method private c(Lcom/kwad/sdk/core/webview/KsAdWebView;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->aA()V

    .line 3
    new-instance v0, Lcom/kwad/components/core/webview/a/a;

    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-direct {v0, p1, v1}, Lcom/kwad/components/core/webview/a/a;-><init>(Landroid/webkit/WebView;Lcom/kwad/sdk/core/webview/b;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->Wk:Lcom/kwad/components/core/webview/a/a;

    const-string v1, "KwaiAdForThird"

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/kwad/components/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/au;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/b;->Wl:Lcom/kwad/components/core/webview/jshandler/au;

    return-object p0
.end method

.method private et()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->ek(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->sK()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->dx(I)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->sJ()Lcom/kwad/sdk/core/webview/KsAdWebView$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->b(Lcom/kwad/sdk/core/webview/KsAdWebView$e;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->sI()Lcom/kwad/sdk/core/webview/KsAdWebView$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->a(Lcom/kwad/sdk/core/webview/KsAdWebView$b;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->c(Lcom/kwad/sdk/core/webview/KsAdWebView$c;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    return-void
.end method

.method private getClickListener()Lcom/kwad/sdk/core/webview/d/a/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/b$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/b$2;-><init>(Lcom/kwad/components/core/webview/b;)V

    return-object v0
.end method

.method private sF()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->fY:Lcom/kwad/components/core/webview/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/c;->qh()Z

    move-result v0

    return v0
.end method

.method private sG()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private sH()Lcom/kwad/components/core/webview/jshandler/ak$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/b$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/b$3;-><init>(Lcom/kwad/components/core/webview/b;)V

    return-object v0
.end method

.method private sI()Lcom/kwad/sdk/core/webview/KsAdWebView$b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/b$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/b$4;-><init>(Lcom/kwad/components/core/webview/b;)V

    return-object v0
.end method

.method private sJ()Lcom/kwad/sdk/core/webview/KsAdWebView$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/b$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/b$5;-><init>(Lcom/kwad/components/core/webview/b;)V

    return-object v0
.end method

.method private sK()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->S(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/b$a;)V
    .locals 1

    .line 2
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->pF()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->mPageUrl:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->sM()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->Wj:Landroid/view/ViewGroup;

    .line 5
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->sN()Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 6
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->sO()Lcom/kwad/components/core/webview/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->fY:Lcom/kwad/components/core/webview/c;

    .line 7
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->ha()Lcom/kwad/components/core/e/d/c;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 8
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->sP()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kwad/components/core/webview/b;->Wn:Z

    .line 9
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/b$a;->qa()Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/b;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    .line 10
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->et()V

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/webview/b;->fY:Lcom/kwad/components/core/webview/c;

    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-static {p1, v0}, Lcom/kwad/components/core/webview/b;->a(Lcom/kwad/components/core/webview/c;Landroid/webkit/WebView;)V

    .line 12
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->ax()V

    .line 13
    iget-object p1, p0, Lcom/kwad/components/core/webview/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->P(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 14
    iget-object p1, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/b;->c(Lcom/kwad/sdk/core/webview/KsAdWebView;)V

    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/b;->mPageUrl:Ljava/lang/String;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/b;->ez(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 16
    iget-object p1, p0, Lcom/kwad/components/core/webview/b;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/b;->b(Lcom/kwad/sdk/core/webview/KsAdWebView;)V

    :cond_1
    return-void
.end method

.method public final jq()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/b;->aA()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/b;->Wm:Lcom/kwad/sdk/core/download/d;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/b;->Wm:Lcom/kwad/sdk/core/download/d;

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/download/b;->a(Lcom/kwad/sdk/core/download/c;)V

    :cond_0
    return-void
.end method
