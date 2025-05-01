.class public final Lcom/kwad/components/core/webview/jshandler/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/h$b;,
        Lcom/kwad/components/core/webview/jshandler/h$a;
    }
.end annotation


# instance fields
.field private WI:Lcom/kwad/sdk/core/webview/c/c;

.field private WK:Lcom/kwad/components/core/webview/jshandler/n;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/webview/jshandler/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/h;->WK:Lcom/kwad/components/core/webview/jshandler/n;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/a/a;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/h;->WI:Lcom/kwad/sdk/core/webview/c/c;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {v0, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/h;->WI:Lcom/kwad/sdk/core/webview/c/c;

    .line 2
    :try_start_0
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/h$a;

    invoke-direct {p2}, Lcom/kwad/components/core/webview/jshandler/h$a;-><init>()V

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 4
    invoke-virtual {p2}, Lcom/kwad/components/core/webview/jshandler/h$a;->getTarget()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/kwad/components/core/webview/jshandler/h;->WK:Lcom/kwad/components/core/webview/jshandler/n;

    if-eqz p2, :cond_0

    .line 6
    invoke-interface {p2, p0, p1}, Lcom/kwad/components/core/webview/jshandler/n;->a(Lcom/kwad/components/core/webview/jshandler/h;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final aO(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/h$b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/h$b;-><init>()V

    .line 2
    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/h$b;->MF:I

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/jshandler/h;->a(Lcom/kwad/sdk/core/response/a/a;)V

    return-void
.end method

.method public final aT(Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/h$b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/h$b;-><init>()V

    .line 2
    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/h$b;->WN:I

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/jshandler/h;->a(Lcom/kwad/sdk/core/response/a/a;)V

    return-void
.end method

.method public final f(Lcom/kwad/components/core/playable/PlayableSource;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/h$b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/h$b;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/kwad/components/core/playable/PlayableSource;->getCode()I

    move-result p1

    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/h$b;->WM:I

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/jshandler/h;->a(Lcom/kwad/sdk/core/response/a/a;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "getNativeData"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/h;->WI:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method
