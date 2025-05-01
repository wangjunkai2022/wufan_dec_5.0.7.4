.class final Lcom/kwad/components/ad/interstitial/e/a/b$12;
.super Lcom/kwad/components/core/webview/tachikoma/a/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
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
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$12;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/a/q;-><init>()V

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
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/webview/tachikoma/a/q;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$12;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/a/b;->s(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/a/b$12;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {p2}, Lcom/kwad/components/ad/interstitial/e/a/b;->t(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object p2

    iget-object p2, p2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1, p2}, Lcom/kwad/components/core/s/j;->e(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method
