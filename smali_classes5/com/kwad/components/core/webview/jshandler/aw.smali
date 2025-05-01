.class public final Lcom/kwad/components/core/webview/jshandler/aw;
.super Lcom/kwad/components/core/webview/tachikoma/a/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/aw$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/a/w;-><init>()V

    return-void
.end method

.method private aP(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/aw$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/aw$a;-><init>()V

    .line 2
    invoke-static {v0, p1}, Lcom/kwad/components/core/webview/jshandler/aw$a;->a(Lcom/kwad/components/core/webview/jshandler/aw$a;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/webview/tachikoma/a/w;->b(Lcom/kwad/sdk/core/b;)V

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerLifecycleListener"

    return-object v0
.end method

.method public final sV()V
    .locals 1

    const-string v0, "showStart"

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/jshandler/aw;->aP(Ljava/lang/String;)V

    return-void
.end method

.method public final sW()V
    .locals 1

    const-string v0, "showEnd"

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/jshandler/aw;->aP(Ljava/lang/String;)V

    return-void
.end method

.method public final sX()V
    .locals 1

    const-string v0, "hideStart"

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/jshandler/aw;->aP(Ljava/lang/String;)V

    return-void
.end method

.method public final sY()V
    .locals 1

    const-string v0, "hideEnd"

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/jshandler/aw;->aP(Ljava/lang/String;)V

    return-void
.end method

.method public final sZ()V
    .locals 1

    const-string v0, "pageVisiable"

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/jshandler/aw;->aP(Ljava/lang/String;)V

    return-void
.end method

.method public final ta()V
    .locals 1

    const-string v0, "pageInvisiable"

    .line 1
    invoke-direct {p0, v0}, Lcom/kwad/components/core/webview/jshandler/aw;->aP(Ljava/lang/String;)V

    return-void
.end method
