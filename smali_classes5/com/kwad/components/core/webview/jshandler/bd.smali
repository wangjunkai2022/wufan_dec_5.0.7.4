.class public final Lcom/kwad/components/core/webview/jshandler/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/bd$a;
    }
.end annotation


# instance fields
.field private YR:Lcom/kwad/components/core/webview/jshandler/bd$a;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/webview/jshandler/bd$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/bd;->YR:Lcom/kwad/components/core/webview/jshandler/bd$a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/bd;)Lcom/kwad/components/core/webview/jshandler/bd$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/bd;->YR:Lcom/kwad/components/core/webview/jshandler/bd$a;

    return-object p0
.end method

.method private tb()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/e/c/b;->nQ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/bd$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/jshandler/bd$1;-><init>(Lcom/kwad/components/core/webview/jshandler/bd;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/webview/jshandler/bd;->tb()V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "showDownloadTips"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
