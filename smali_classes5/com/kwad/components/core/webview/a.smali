.class public final Lcom/kwad/components/core/webview/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private OA:Landroid/webkit/WebView;

.field private final We:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kwad/sdk/core/webview/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private Wf:Lcom/kwad/sdk/core/webview/c/a;

.field private Wg:Z


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    iput-object v0, p0, Lcom/kwad/components/core/webview/a;->We:Ljava/util/Map;

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/webview/c/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/c/d;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/a;->Wf:Lcom/kwad/sdk/core/webview/c/a;

    .line 4
    iput-object p1, p0, Lcom/kwad/components/core/webview/a;->OA:Landroid/webkit/WebView;

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/webview/a;->sE()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/a;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/a;->Wg:Z

    const-string v1, "KSAdJSBridge"

    if-eqz v0, :cond_0

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "callJS after destroy jsInterface, "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "callJS callback is empty"

    .line 4
    invoke-static {v1, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "callJS callback:+ "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "--params: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/a;->OA:Landroid/webkit/WebView;

    if-nez v0, :cond_2

    return-void

    .line 7
    :cond_2
    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/utils/bu;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private sE()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/webview/d/a;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/d/a;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/webview/d/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/d/b;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 3
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/z;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/z;-><init>()V

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/webview/c/a;)V
    .locals 3

    const-string v0, "KSAdJSBridge"

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/c/a;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/webview/a;->We:Ljava/util/Map;

    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/c/a;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cannot register handler again, handler: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/c/a;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/a;->We:Ljava/util/Map;

    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/c/a;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    const-string p1, "handler and handler\'key cannot be null"

    .line 7
    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/webview/c/a;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/c/a;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/a;->We:Ljava/util/Map;

    invoke-interface {p1}, Lcom/kwad/sdk/core/webview/c/a;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p1, "KSAdJSBridge"

    const-string v0, "handler and handler\'key cannot be null"

    .line 3
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final callAdBridge(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "callAdBridge =="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "KSAdJSBridge"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/core/webview/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/webview/c/b;-><init>()V

    .line 3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/webview/c/b;->parseJson(Lorg/json/JSONObject;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/webview/a;->We:Ljava/util/Map;

    iget-object v2, v0, Lcom/kwad/sdk/core/webview/c/b;->aFQ:Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/core/webview/c/a;

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/webview/a;->Wf:Lcom/kwad/sdk/core/webview/c/a;

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/kwad/components/core/webview/a;->OA:Landroid/webkit/WebView;

    if-eqz v2, :cond_1

    instance-of v3, v2, Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v3, :cond_1

    .line 7
    check-cast v2, Lcom/kwad/sdk/core/webview/KsAdWebView;

    .line 8
    invoke-virtual {v2}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getUniqueId()Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual {v2}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getLoadUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v0, Lcom/kwad/sdk/core/webview/c/b;->aFQ:Ljava/lang/String;

    iget-object v5, v0, Lcom/kwad/sdk/core/webview/c/b;->data:Ljava/lang/String;

    invoke-static {v2, v3, v4, v5}, Lcom/kwad/sdk/core/webview/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz p1, :cond_3

    .line 10
    iget-object v2, v0, Lcom/kwad/sdk/core/webview/c/b;->aFR:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 11
    new-instance v2, Lcom/kwad/components/core/webview/a$1;

    invoke-direct {v2, p0, v0}, Lcom/kwad/components/core/webview/a$1;-><init>(Lcom/kwad/components/core/webview/a;Lcom/kwad/sdk/core/webview/c/b;)V

    goto :goto_0

    .line 12
    :cond_2
    new-instance v2, Lcom/kwad/components/core/webview/a$2;

    invoke-direct {v2, p0}, Lcom/kwad/components/core/webview/a$2;-><init>(Lcom/kwad/components/core/webview/a;)V

    .line 13
    :goto_0
    iget-object v0, v0, Lcom/kwad/sdk/core/webview/c/b;->data:Ljava/lang/String;

    invoke-interface {p1, v0, v2}, Lcom/kwad/sdk/core/webview/c/a;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V

    goto :goto_1

    :cond_3
    const-string p1, "bridgeHandler is null"

    .line 14
    invoke-static {v1, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 15
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "callAdBridge JSONException:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final destroy()V
    .locals 2

    const-string v0, "KSAdJSBridge"

    const-string v1, "destroy jsInterface"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/a;->We:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/webview/c/a;

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v1}, Lcom/kwad/sdk/core/webview/c/a;->onDestroy()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/a;->Wg:Z

    return-void
.end method
