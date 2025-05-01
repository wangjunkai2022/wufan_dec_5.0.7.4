.class final Lcom/kwad/components/core/page/c/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/aq$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/page/c/f;->pR()Lcom/kwad/components/core/webview/jshandler/aq$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Pj:Lcom/kwad/components/core/page/c/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/page/c/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/f$1;->Pj:Lcom/kwad/components/core/page/c/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f$1;->Pj:Lcom/kwad/components/core/page/c/f;

    iget v1, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->status:I

    invoke-static {v0, v1}, Lcom/kwad/components/core/page/c/f;->a(Lcom/kwad/components/core/page/c/f;I)I

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f$1;->Pj:Lcom/kwad/components/core/page/c/f;

    invoke-static {v0}, Lcom/kwad/components/core/page/c/f;->a(Lcom/kwad/components/core/page/c/f;)Lcom/kwad/components/core/page/c/f$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/c/f$1;->Pj:Lcom/kwad/components/core/page/c/f;

    invoke-static {v0}, Lcom/kwad/components/core/page/c/f;->a(Lcom/kwad/components/core/page/c/f;)Lcom/kwad/components/core/page/c/f$a;

    move-result-object v0

    iget v1, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->status:I

    invoke-interface {v0, v1}, Lcom/kwad/components/core/page/c/f$a;->aA(I)V

    .line 4
    :cond_0
    iget p1, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->status:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/page/c/f$1;->Pj:Lcom/kwad/components/core/page/c/f;

    invoke-static {p1}, Lcom/kwad/components/core/page/c/f;->b(Lcom/kwad/components/core/page/c/f;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/page/c/f$1;->Pj:Lcom/kwad/components/core/page/c/f;

    invoke-static {p1}, Lcom/kwad/components/core/page/c/f;->c(Lcom/kwad/components/core/page/c/f;)Landroid/webkit/WebView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    return-void
.end method
