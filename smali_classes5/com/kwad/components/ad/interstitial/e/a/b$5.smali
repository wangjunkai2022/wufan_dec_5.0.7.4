.class final Lcom/kwad/components/ad/interstitial/e/a/b$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/ai$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->dI()Lcom/kwad/components/core/webview/jshandler/ai;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic li:Lcom/kwad/components/ad/interstitial/e/a/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/ai$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->M(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$5;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->U(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jS:Lcom/kwad/sdk/widget/KSFrameLayout;

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/ad/interstitial/e/a/b$5$1;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b$5;Lcom/kwad/components/core/webview/jshandler/ai$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
