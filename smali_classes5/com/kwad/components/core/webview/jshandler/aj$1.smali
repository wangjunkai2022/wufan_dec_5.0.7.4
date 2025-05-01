.class final Lcom/kwad/components/core/webview/jshandler/aj$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/aj;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ya:Lcom/kwad/components/core/webview/jshandler/aj$a;

.field final synthetic Yb:Lcom/kwad/components/core/webview/jshandler/aj;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/aj;Lcom/kwad/components/core/webview/jshandler/aj$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Ya:Lcom/kwad/components/core/webview/jshandler/aj$a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aj;->a(Lcom/kwad/components/core/webview/jshandler/aj;)Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aj;->b(Lcom/kwad/components/core/webview/jshandler/aj;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aj;->a(Lcom/kwad/components/core/webview/jshandler/aj;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x1

    .line 4
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Ya:Lcom/kwad/components/core/webview/jshandler/aj$a;

    iget v2, v1, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 6
    iget v2, v1, Lcom/kwad/components/core/webview/jshandler/aj$a;->leftMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 7
    iget v2, v1, Lcom/kwad/components/core/webview/jshandler/aj$a;->rightMargin:I

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 8
    iget v1, v1, Lcom/kwad/components/core/webview/jshandler/aj$a;->bottomMargin:I

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 9
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/aj;->a(Lcom/kwad/components/core/webview/jshandler/aj;)Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aj;->c(Lcom/kwad/components/core/webview/jshandler/aj;)Lcom/kwad/components/core/webview/jshandler/aj$b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Yb:Lcom/kwad/components/core/webview/jshandler/aj;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/aj;->c(Lcom/kwad/components/core/webview/jshandler/aj;)Lcom/kwad/components/core/webview/jshandler/aj$b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/aj$1;->Ya:Lcom/kwad/components/core/webview/jshandler/aj$a;

    invoke-interface {v0, v1}, Lcom/kwad/components/core/webview/jshandler/aj$b;->a(Lcom/kwad/components/core/webview/jshandler/aj$a;)V

    :cond_1
    return-void
.end method
