.class public final Lcom/kwad/components/core/webview/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/a/a$a;,
        Lcom/kwad/components/core/webview/a/a$b;
    }
.end annotation


# instance fields
.field private La:Lcom/kwad/components/core/e/d/c;

.field private OA:Landroid/webkit/WebView;

.field private Wg:Z

.field private Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

.field private Ws:I

.field private Wt:I

.field private cO:Lcom/kwad/sdk/core/webview/b;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Lcom/kwad/sdk/core/webview/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, -0x64

    .line 2
    iput v0, p0, Lcom/kwad/components/core/webview/a/a;->Ws:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/kwad/components/core/webview/a/a;->Wt:I

    .line 4
    iput-object p1, p0, Lcom/kwad/components/core/webview/a/a;->OA:Landroid/webkit/WebView;

    .line 5
    invoke-virtual {p2}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/a/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    iput-object p2, p0, Lcom/kwad/components/core/webview/a/a;->cO:Lcom/kwad/sdk/core/webview/b;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/a/a;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/a/a;->p(II)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/a/a;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/a/a;->aI(Ljava/lang/String;)V

    return-void
.end method

.method private aI(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/webview/a/a$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/a/a$a;-><init>()V

    .line 2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 3
    iget-object p1, v0, Lcom/kwad/components/core/webview/a/a$a;->url:Ljava/lang/String;

    iget-object v1, v0, Lcom/kwad/components/core/webview/a/a$a;->packageName:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/kwad/components/core/webview/a/a;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    if-nez p1, :cond_1

    .line 5
    iget-object p1, v0, Lcom/kwad/components/core/webview/a/a$a;->url:Ljava/lang/String;

    iget-object v0, v0, Lcom/kwad/components/core/webview/a/a$a;->packageName:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/webview/a/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_1
    new-instance p1, Lcom/kwad/components/core/e/d/a$a;

    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->cO:Lcom/kwad/sdk/core/webview/b;

    iget-object v0, v0, Lcom/kwad/sdk/core/webview/b;->OA:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->ap(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/a/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 10
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->ar(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/e/d/c;->s(Lcom/kwad/components/core/e/d/a$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    iget-object v1, p0, Lcom/kwad/components/core/webview/a/a;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/c;->d(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 13
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/e/d/c;->r(Lcom/kwad/components/core/e/d/a$a;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method private n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/a/a;->Wg:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->OA:Landroid/webkit/WebView;

    if-nez v0, :cond_2

    return-void

    .line 4
    :cond_2
    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/utils/bu;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private declared-synchronized o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/e/d/c;

    iget-object v1, p0, Lcom/kwad/components/core/webview/a/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/kwad/components/core/e/d/c;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/api/KsAppDownloadListener;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/webview/a/a;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    if-nez p1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/webview/a/a;->sQ()Lcom/kwad/sdk/api/KsAppDownloadListener;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/a/a;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    .line 4
    iget-object p2, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {p2, p1}, Lcom/kwad/components/core/e/d/c;->b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private p(II)V
    .locals 0

    .line 2
    iput p2, p0, Lcom/kwad/components/core/webview/a/a;->Wt:I

    .line 3
    iget p2, p0, Lcom/kwad/components/core/webview/a/a;->Ws:I

    if-eq p2, p1, :cond_0

    .line 4
    iput p1, p0, Lcom/kwad/components/core/webview/a/a;->Ws:I

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "onDownLoadStatusCallback"

    invoke-direct {p0, p2, p1}, Lcom/kwad/components/core/webview/a/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static p(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private sQ()Lcom/kwad/sdk/api/KsAppDownloadListener;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/a/a$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/a/a$2;-><init>(Lcom/kwad/components/core/webview/a/a;)V

    return-object v0
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/a/a;->Wg:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/webview/a/a;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/c;->c(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    :cond_0
    return-void
.end method

.method public final getDownLoadStatus(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/components/core/webview/a/a;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/a/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {p1}, Lcom/kwad/components/core/e/d/c;->ov()I

    move-result p1

    return p1
.end method

.method public final getProgress(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/components/core/webview/a/a;->p(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/a/a;->La:Lcom/kwad/components/core/e/d/c;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/a/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :cond_1
    iget p1, p0, Lcom/kwad/components/core/webview/a/a;->Wt:I

    return p1
.end method

.method public final handleAdClick(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/a/a$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/webview/a/a$1;-><init>(Lcom/kwad/components/core/webview/a/a;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
