.class public final Lcom/kwad/components/core/webview/jshandler/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/ag$a;
    }
.end annotation


# instance fields
.field private final WQ:Lcom/kwad/sdk/core/webview/b;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ag;->WQ:Lcom/kwad/sdk/core/webview/b;

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
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ag;->WQ:Lcom/kwad/sdk/core/webview/b;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/b;->Hx()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "native adTemplate is null"

    .line 2
    invoke-interface {p2, p1, v0}, Lcom/kwad/sdk/core/webview/c/c;->onError(ILjava/lang/String;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Lcom/kwad/components/core/webview/jshandler/ag$a;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/jshandler/ag$a;-><init>()V

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 5
    invoke-static {p1, v0}, Lcom/kwad/components/core/webview/jshandler/ag$a;->a(Lcom/kwad/components/core/webview/jshandler/ag$a;I)I

    .line 6
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "getScreenOrientation"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
