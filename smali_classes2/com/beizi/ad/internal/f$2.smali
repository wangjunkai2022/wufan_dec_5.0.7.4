.class Lcom/beizi/ad/internal/f$2;
.super Ljava/lang/Object;
.source "AdViewRequestManagerImpl.java"

# interfaces
.implements Lcom/beizi/ad/internal/network/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/network/ServerResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdViewImpl;

.field final synthetic b:Lcom/beizi/ad/internal/view/AdWebView;

.field final synthetic c:Lcom/beizi/ad/internal/network/ServerResponse;

.field final synthetic d:Lcom/beizi/ad/internal/f;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/AdWebView;Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/f$2;->d:Lcom/beizi/ad/internal/f;

    iput-object p2, p0, Lcom/beizi/ad/internal/f$2;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iput-object p3, p0, Lcom/beizi/ad/internal/f$2;->b:Lcom/beizi/ad/internal/view/AdWebView;

    iput-object p4, p0, Lcom/beizi/ad/internal/f$2;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/beizi/ad/internal/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Lcom/beizi/ad/internal/view/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-interface {v0}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/j;->d:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->getRealDisplayable()Lcom/beizi/ad/internal/view/c;

    move-result-object v0

    return-object v0

    .line 3
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->b:Lcom/beizi/ad/internal/view/AdWebView;

    return-object v0
.end method

.method public d()Lcom/beizi/ad/NativeAdResponse;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdExtInfo()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getPrice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->c:Lcom/beizi/ad/internal/network/ServerResponse;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f$2;->b:Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdWebView;->destroy()V

    return-void
.end method
