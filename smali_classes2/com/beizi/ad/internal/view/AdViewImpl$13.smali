.class Lcom/beizi/ad/internal/view/AdViewImpl$13;
.super Ljava/lang/Object;
.source "AdViewImpl.java"

# interfaces
.implements Lcom/beizi/ad/internal/utilities/VideoCacheManager$VideoLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdViewImpl;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$13;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoLoadFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$13;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$13;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/beizi/ad/AdListener;->onAdFailedToLoad(I)V

    :cond_0
    return-void
.end method

.method public onVideoLoaded(Ljava/lang/String;)V
    .locals 1

    const-string p1, "BeiZisAd"

    const-string v0, "onVideoLoaded: \u52a0\u8f7d\u6210\u529f"

    .line 1
    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$13;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$13;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Lcom/beizi/ad/internal/view/AdViewImpl;Z)Z

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$13;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;)Lcom/beizi/ad/AdListener;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/ad/AdListener;->onAdLoaded()V

    :cond_0
    return-void
.end method
