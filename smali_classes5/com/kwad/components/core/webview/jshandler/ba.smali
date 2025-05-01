.class public final Lcom/kwad/components/core/webview/jshandler/ba;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/ba$a;
    }
.end annotation


# instance fields
.field private WI:Lcom/kwad/sdk/core/webview/c/c;

.field private YM:Lcom/kwad/components/core/webview/jshandler/ba$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ba$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/ba$a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ba;->YM:Lcom/kwad/components/core/webview/jshandler/ba$a;

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
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/ba;->WI:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method

.method public final aQ(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ba;->WI:Lcom/kwad/sdk/core/webview/c/c;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ba;->YM:Lcom/kwad/components/core/webview/jshandler/ba$a;

    iput p1, v1, Lcom/kwad/components/core/webview/jshandler/ba$a;->status:I

    .line 3
    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_0
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerVideoListener"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ba;->WI:Lcom/kwad/sdk/core/webview/c/c;

    return-void
.end method
