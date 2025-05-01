.class public final Lcom/kwad/components/core/webview/jshandler/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/e$a;
    }
.end annotation


# instance fields
.field private WI:Lcom/kwad/sdk/core/webview/c/c;

.field private mt:I

.field private mu:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/kwad/components/core/webview/jshandler/e;->mt:I

    .line 3
    iput p2, p0, Lcom/kwad/components/core/webview/jshandler/e;->mu:I

    return-void
.end method

.method private q(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/e;->WI:Lcom/kwad/sdk/core/webview/c/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/e$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/e$a;-><init>()V

    .line 3
    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/e$a;->showLiveStatus:I

    .line 4
    iput p2, v0, Lcom/kwad/components/core/webview/jshandler/e$a;->showLiveStyle:I

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/e;->WI:Lcom/kwad/sdk/core/webview/c/c;

    invoke-interface {p1, v0}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/e;->WI:Lcom/kwad/sdk/core/webview/c/c;

    .line 2
    iget p1, p0, Lcom/kwad/components/core/webview/jshandler/e;->mt:I

    iget p2, p0, Lcom/kwad/components/core/webview/jshandler/e;->mu:I

    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/jshandler/e;->q(II)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "getLiveInfo"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/e;->WI:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method
