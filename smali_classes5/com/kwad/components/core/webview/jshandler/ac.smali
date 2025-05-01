.class public final Lcom/kwad/components/core/webview/jshandler/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/ac$a;,
        Lcom/kwad/components/core/webview/jshandler/ac$b;
    }
.end annotation


# instance fields
.field protected final WQ:Lcom/kwad/sdk/core/webview/b;

.field protected Xv:Lcom/kwad/components/core/webview/jshandler/ac$b;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ac;->WQ:Lcom/kwad/sdk/core/webview/b;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/ac$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ac;->Xv:Lcom/kwad/components/core/webview/jshandler/ac$b;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    new-instance p1, Lcom/kwad/components/core/webview/jshandler/ac$a;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/jshandler/ac$a;-><init>()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ac;->Xv:Lcom/kwad/components/core/webview/jshandler/ac$b;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1}, Lcom/kwad/components/core/webview/jshandler/ac$b;->c(Lcom/kwad/components/core/webview/jshandler/ac$a;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ac;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v0, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ac;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v0, v0, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    .line 7
    :goto_0
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "getContainerLimit"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
