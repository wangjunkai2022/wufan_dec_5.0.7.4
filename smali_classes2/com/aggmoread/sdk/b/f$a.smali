.class Lcom/aggmoread/sdk/b/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/m/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/f;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/m/a;Lcom/aggmoread/sdk/b/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/b/f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/f;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;->onAdClosed()V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 0

    return-void
.end method

.method public onADCloseOverlay()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;->onADCloseOverlay()V

    :cond_0
    return-void
.end method

.method public onADLeftApplication()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;->onADLeftApplication()V

    :cond_0
    return-void
.end method

.method public onADOpenOverlay()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;->onADOpenOverlay()V

    :cond_0
    return-void
.end method

.method public onAdClicked()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public onAdExposed()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/f$a;->a:Lcom/aggmoread/sdk/b/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/f;->a(Lcom/aggmoread/sdk/b/f;)Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/client/banner/AMBannerAdInteractionListener;->onAdExposed()V

    :cond_0
    return-void
.end method

.method public onAdShow()V
    .locals 0

    return-void
.end method
