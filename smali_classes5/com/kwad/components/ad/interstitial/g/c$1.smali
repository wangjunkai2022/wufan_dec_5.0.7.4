.class final Lcom/kwad/components/ad/interstitial/g/c$1;
.super Lcom/kwad/components/core/webview/tachikoma/e/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/interstitial/g/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lE:Lcom/kwad/components/ad/interstitial/g/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/g/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/e/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;JJJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/kwad/components/ad/interstitial/e/c;->jY:Z

    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 1

    const-string v0, "tk_interstitial"

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/kwad/components/ad/interstitial/g/c;->a(Lcom/kwad/components/ad/interstitial/g/c;Z)Z

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/kwad/sdk/mvp/Presenter;->mw()V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/g/c;->dZ()Lcom/kwad/components/ad/interstitial/e/b;

    move-result-object v0

    iput-object v0, p1, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    .line 6
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    iget-object v0, p1, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/g/c;->lD:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/c$1;->lE:Lcom/kwad/components/ad/interstitial/g/c;

    iget-object v0, p1, Lcom/kwad/components/ad/interstitial/g/c;->lB:Lcom/kwad/components/ad/interstitial/e/b;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/g/c;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
