.class final Lcom/kwad/components/ad/draw/b/b/c$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/aj$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/draw/b/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cX:Lcom/kwad/components/ad/draw/b/b/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/draw/b/b/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/b/c$4;->cX:Lcom/kwad/components/ad/draw/b/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/aj$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c$4;->cX:Lcom/kwad/components/ad/draw/b/b/c;

    invoke-static {v0, p1}, Lcom/kwad/components/ad/draw/b/b/c;->a(Lcom/kwad/components/ad/draw/b/b/c;Lcom/kwad/components/core/webview/jshandler/aj$a;)Lcom/kwad/components/core/webview/jshandler/aj$a;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/b/c$4;->cX:Lcom/kwad/components/ad/draw/b/b/c;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/b/c;->e(Lcom/kwad/components/ad/draw/b/b/c;)Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object v0

    iget v1, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    iget p1, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->bottomMargin:I

    add-int/2addr v1, p1

    int-to-float p1, v1

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setTranslationY(F)V

    return-void
.end method
