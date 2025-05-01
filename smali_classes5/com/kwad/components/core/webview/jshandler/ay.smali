.class public final Lcom/kwad/components/core/webview/jshandler/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/ay$a;
    }
.end annotation


# instance fields
.field private final YH:Lcom/kwad/components/core/webview/jshandler/ay$a;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/webview/jshandler/ay$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ay;->YH:Lcom/kwad/components/core/webview/jshandler/ay$a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/ay;)Lcom/kwad/components/core/webview/jshandler/ay$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/ay;->YH:Lcom/kwad/components/core/webview/jshandler/ay$a;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    new-instance p1, Lcom/kwad/components/core/webview/jshandler/ay$1;

    invoke-direct {p1, p0, p2}, Lcom/kwad/components/core/webview/jshandler/ay$1;-><init>(Lcom/kwad/components/core/webview/jshandler/ay;Lcom/kwad/sdk/core/webview/c/c;)V

    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerMotionListener"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
