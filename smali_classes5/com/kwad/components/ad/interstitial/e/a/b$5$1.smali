.class final Lcom/kwad/components/ad/interstitial/e/a/b$5$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b$5;->a(Lcom/kwad/components/core/webview/jshandler/ai$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lm:Lcom/kwad/components/core/webview/jshandler/ai$a;

.field final synthetic ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/a/b$5;Lcom/kwad/components/core/webview/jshandler/ai$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->lm:Lcom/kwad/components/core/webview/jshandler/ai$a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->lm:Lcom/kwad/components/core/webview/jshandler/ai$a;

    iget v0, v0, Lcom/kwad/components/core/webview/jshandler/ai$a;->type:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->N(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jM:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->O(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jN:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    .line 4
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->P(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/f/a;->d(Lcom/kwad/components/ad/interstitial/e/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->Q(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iput-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jN:Z

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->R(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/c/b;->H(Landroid/content/Context;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->S(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->T(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->lm:Lcom/kwad/components/core/webview/jshandler/ai$a;

    iget v3, v2, Lcom/kwad/components/core/webview/jshandler/ai$a;->type:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget v2, v2, Lcom/kwad/components/core/webview/jshandler/ai$a;->XY:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;->ln:Lcom/kwad/components/ad/interstitial/e/a/b$5;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->q(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-void
.end method
