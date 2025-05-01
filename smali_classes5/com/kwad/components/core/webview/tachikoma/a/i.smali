.class public final Lcom/kwad/components/core/webview/tachikoma/a/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/tachikoma/a/i$a;
    }
.end annotation


# instance fields
.field private aaw:Lcom/kwad/components/core/webview/tachikoma/a/i$a;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/webview/tachikoma/a/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/a/i;->aaw:Lcom/kwad/components/core/webview/tachikoma/a/i$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance p2, Lcom/kwad/sdk/core/webview/d/b/a;

    invoke-direct {p2}, Lcom/kwad/sdk/core/webview/d/b/a;-><init>()V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/kwad/sdk/core/webview/d/b/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/a/i;->aaw:Lcom/kwad/components/core/webview/tachikoma/a/i$a;

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {p1, p2}, Lcom/kwad/components/core/webview/tachikoma/a/i$a;->a(Lcom/kwad/sdk/core/webview/d/b/a;)V

    :cond_0
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "notifyClickAd"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
