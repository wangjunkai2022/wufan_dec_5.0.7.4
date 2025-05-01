.class public Lcom/kwad/components/core/webview/jshandler/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/bf$a;
    }
.end annotation


# instance fields
.field private Za:Lcom/kwad/components/core/webview/jshandler/bf$a;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field protected mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/n/l;->wrapContextIfNeed(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/bf;->mContext:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/bf;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/bf$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/bf;->Za:Lcom/kwad/components/core/webview/jshandler/bf$a;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/bf;->Za:Lcom/kwad/components/core/webview/jshandler/bf$a;

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lcom/kwad/components/core/webview/jshandler/bf$a;->dL()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 4
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "handleJsCall launch AdPlayableActivityProxy : "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "WebShowPlayableHandler"

    invoke-static {v0, p2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/bf;->mContext:Landroid/content/Context;

    iget-object p2, p0, Lcom/kwad/components/core/webview/jshandler/bf;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, p2}, Lcom/kwad/components/core/page/a;->launch(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    :cond_1
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "showPlayable"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
