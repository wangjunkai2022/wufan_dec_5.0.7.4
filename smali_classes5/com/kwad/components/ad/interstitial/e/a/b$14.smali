.class final Lcom/kwad/components/ad/interstitial/e/a/b$14;
.super Lcom/kwad/components/core/webview/tachikoma/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->dC()Lcom/kwad/components/core/webview/tachikoma/c;
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
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$14;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/c;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V

    .line 2
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/c;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/c;-><init>()V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/interstitial/d/a;->cO()I

    move-result v0

    iput v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/c;->aaS:I

    .line 4
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method
