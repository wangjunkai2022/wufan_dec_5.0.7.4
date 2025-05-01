.class Lcom/beizi/ad/internal/view/AdViewImpl$20$1;
.super Ljava/lang/Object;
.source "AdViewImpl.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl$20;->onFinish()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdViewImpl$20;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl$20;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$20$1;->a:Lcom/beizi/ad/internal/view/AdViewImpl$20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$20$1;->a:Lcom/beizi/ad/internal/view/AdViewImpl$20;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->c:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$20$1;->a:Lcom/beizi/ad/internal/view/AdViewImpl$20;

    iget-boolean v0, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->a:Z

    if-eqz v0, :cond_1

    .line 3
    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->b:Landroid/view/View;

    instance-of v0, p1, Lcom/beizi/ad/internal/view/AdWebView;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {p1, v1}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdBy(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$20$1;->a:Lcom/beizi/ad/internal/view/AdViewImpl$20;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->c:Lcom/beizi/ad/internal/view/AdViewImpl;

    check-cast p1, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdImplementation()Lcom/beizi/ad/AdActivity$a;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/activity/b;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/activity/b;->g()V

    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v0, :cond_2

    .line 7
    check-cast p1, Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/video/AdVideoView;->getAdWebView()Lcom/beizi/ad/internal/view/AdWebView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdBy(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$20$1;->a:Lcom/beizi/ad/internal/view/AdViewImpl$20;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->c:Lcom/beizi/ad/internal/view/AdViewImpl;

    check-cast p1, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdImplementation()Lcom/beizi/ad/AdActivity$a;

    move-result-object p1

    check-cast p1, Lcom/beizi/ad/internal/activity/b;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/activity/b;->g()V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->c:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object p1

    invoke-interface {p1}, Lcom/beizi/ad/internal/b;->b()V

    .line 10
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$20$1;->a:Lcom/beizi/ad/internal/view/AdViewImpl$20;

    iget-object v0, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->c:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl$20;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/view/View;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_2

    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 12
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_2
    :goto_0
    return-void
.end method
