.class public final Lcom/kwad/components/core/webview/jshandler/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/be$b;,
        Lcom/kwad/components/core/webview/jshandler/be$a;
    }
.end annotation


# static fields
.field private static YX:Landroid/os/Handler;


# instance fields
.field private La:Lcom/kwad/components/core/e/d/c;

.field private YW:Lcom/kwad/sdk/core/webview/b;

.field private YY:Lcom/kwad/components/core/webview/jshandler/be$b;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/components/core/webview/jshandler/be$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/be;->YW:Lcom/kwad/sdk/core/webview/b;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/be;->La:Lcom/kwad/components/core/e/d/c;

    .line 4
    iput-object p3, p0, Lcom/kwad/components/core/webview/jshandler/be;->YY:Lcom/kwad/components/core/webview/jshandler/be$b;

    .line 5
    sget-object p1, Lcom/kwad/components/core/webview/jshandler/be;->YX:Landroid/os/Handler;

    if-nez p1, :cond_0

    .line 6
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object p1, Lcom/kwad/components/core/webview/jshandler/be;->YX:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/be;)Lcom/kwad/components/core/webview/jshandler/be$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/be;->YY:Lcom/kwad/components/core/webview/jshandler/be$b;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/be$a;

    invoke-direct {p2}, Lcom/kwad/components/core/webview/jshandler/be$a;-><init>()V

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 5
    iget p1, p2, Lcom/kwad/components/core/webview/jshandler/be$a;->kl:I

    .line 6
    sget-object p2, Lcom/kwad/components/core/webview/jshandler/be;->YX:Landroid/os/Handler;

    new-instance v0, Lcom/kwad/components/core/webview/jshandler/be$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/webview/jshandler/be$1;-><init>(Lcom/kwad/components/core/webview/jshandler/be;I)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "playableConvert"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
