.class public final Lcom/kwad/components/core/webview/jshandler/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/aq$a;,
        Lcom/kwad/components/core/webview/jshandler/aq$b;
    }
.end annotation


# instance fields
.field private Xl:Landroid/os/Handler;

.field private Xm:Lcom/kwad/sdk/core/webview/c/c;

.field private cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

.field private mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/webview/jshandler/aq$b;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aq;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    .line 3
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xl:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lcom/kwad/components/core/webview/jshandler/aq$b;Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aq;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    .line 6
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xl:Landroid/os/Handler;

    .line 7
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/aq;->mUrl:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/aq;)Lcom/kwad/sdk/core/webview/c/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xm:Lcom/kwad/sdk/core/webview/c/c;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/aq;Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/aq;->b(Lcom/kwad/components/core/webview/jshandler/aq$a;)V

    return-void
.end method

.method private b(Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/kwad/components/core/webview/jshandler/aq$b;->a(Lcom/kwad/components/core/webview/jshandler/aq$a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 2
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xm:Lcom/kwad/sdk/core/webview/c/c;

    .line 4
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aq$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/aq$a;-><init>()V

    .line 5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xl:Landroid/os/Handler;

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/aq$1;

    invoke-direct {v1, p0, v0}, Lcom/kwad/components/core/webview/jshandler/aq$1;-><init>(Lcom/kwad/components/core/webview/jshandler/aq;Lcom/kwad/components/core/webview/jshandler/aq$a;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handleJsCall error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebCardPageStatusHandler"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq;->mUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/webview/b/c/b;->ag(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    .line 9
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/kwad/sdk/core/webview/c/c;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "pageStatus"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq;->cU:Lcom/kwad/components/core/webview/jshandler/aq$b;

    .line 2
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xm:Lcom/kwad/sdk/core/webview/c/c;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/aq;->Xl:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
