.class final Lcom/kwad/components/ad/f/e$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/ax$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/e;->getRegisterLiveListener()Lcom/kwad/components/core/webview/jshandler/ax$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mK:Lcom/kwad/components/ad/f/e;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/e$8;->mK:Lcom/kwad/components/ad/f/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/ax$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$8;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0, p1}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;Lcom/kwad/components/core/webview/jshandler/ax$b;)Lcom/kwad/components/core/webview/jshandler/ax$b;

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/f/e$8;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {p1}, Lcom/kwad/components/ad/f/e;->c(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/ax$a;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/f/e$8;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {p1}, Lcom/kwad/components/ad/f/e;->d(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/ax$b;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/f/e$8;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->c(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/webview/jshandler/ax$a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/jshandler/ax$b;->a(Lcom/kwad/components/core/webview/jshandler/ax$a;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/f/e$8;->mK:Lcom/kwad/components/ad/f/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;Lcom/kwad/components/core/webview/jshandler/ax$a;)Lcom/kwad/components/core/webview/jshandler/ax$a;

    :cond_0
    return-void
.end method
