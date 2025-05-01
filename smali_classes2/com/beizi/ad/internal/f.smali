.class Lcom/beizi/ad/internal/f;
.super Lcom/beizi/ad/internal/l;
.source "AdViewRequestManagerImpl.java"


# instance fields
.field private final a:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference<",
            "Lcom/beizi/ad/internal/view/AdViewImpl;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/beizi/ad/internal/a/b;

.field private c:Lcom/beizi/ad/internal/network/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/l;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/a/b;)Lcom/beizi/ad/internal/a/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/f;->b:Lcom/beizi/ad/internal/a/b;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/network/ServerResponse;)V

    return-void
.end method

.method private a(Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 5

    const/4 v0, 0x0

    .line 18
    :try_start_0
    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/beizi/ad/internal/d;->a(Z)V

    .line 19
    new-instance v1, Lcom/beizi/ad/internal/view/AdWebView;

    invoke-direct {v1, p1}, Lcom/beizi/ad/internal/view/AdWebView;-><init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V

    .line 20
    invoke-interface {p1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v2

    sget-object v3, Lcom/beizi/ad/internal/j;->a:Lcom/beizi/ad/internal/j;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v2

    sget-object v3, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 21
    :cond_0
    invoke-virtual {v1, p2}, Lcom/beizi/ad/internal/view/AdWebView;->loadAd(Lcom/beizi/ad/internal/network/ServerResponse;)V

    .line 22
    :cond_1
    invoke-virtual {p2}, Lcom/beizi/ad/internal/network/ServerResponse;->getAdUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v2

    invoke-virtual {p2}, Lcom/beizi/ad/internal/network/ServerResponse;->getLogoUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/beizi/ad/internal/view/AdViewImpl;->createAdLogo(Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)V

    .line 23
    invoke-interface {p1}, Lcom/beizi/ad/internal/a;->getMediaType()Lcom/beizi/ad/internal/j;

    move-result-object v2

    sget-object v3, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 24
    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->addBannerCloseBtn()V

    .line 25
    move-object v2, p1

    check-cast v2, Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    .line 26
    invoke-virtual {v2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->getExpandsToFitScreenWidth()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 27
    invoke-virtual {p2}, Lcom/beizi/ad/internal/network/ServerResponse;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Lcom/beizi/ad/internal/network/ServerResponse;->getHeight()I

    move-result v4

    invoke-virtual {v2, v3, v4, v1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->expandToFitScreenWidth(IILcom/beizi/ad/internal/view/c;)V

    .line 28
    :cond_2
    iput-object p2, p1, Lcom/beizi/ad/internal/view/AdViewImpl;->serverResponse:Lcom/beizi/ad/internal/network/ServerResponse;

    .line 29
    new-instance v2, Lcom/beizi/ad/internal/f$2;

    invoke-direct {v2, p0, p1, v1, p2}, Lcom/beizi/ad/internal/f$2;-><init>(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/view/AdViewImpl;Lcom/beizi/ad/internal/view/AdWebView;Lcom/beizi/ad/internal/network/ServerResponse;)V

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/f;->a(Lcom/beizi/ad/internal/network/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "========Exception=========:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    sget-object p2, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception initializing the view: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, v0}, Lcom/beizi/ad/internal/f;->a(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 3
    invoke-virtual {p0}, Lcom/beizi/ad/internal/f;->f()Lcom/beizi/ad/internal/network/a$a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v1, "Before execute request manager, you should set ad request!"

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    new-instance v0, Lcom/beizi/ad/internal/network/a;

    invoke-virtual {p0}, Lcom/beizi/ad/internal/f;->f()Lcom/beizi/ad/internal/network/a$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/network/a;-><init>(Lcom/beizi/ad/internal/network/a$a;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/f;->c:Lcom/beizi/ad/internal/network/a;

    .line 6
    invoke-virtual {p0}, Lcom/beizi/ad/internal/l;->g()V

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->c:Lcom/beizi/ad/internal/network/a;

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/network/a;->a(Lcom/beizi/ad/internal/e;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->c:Lcom/beizi/ad/internal/network/a;

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/lance/a/c;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->e()V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignored:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_1
    move-exception v0

    .line 12
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Concurrent Thread Exception while firing new ad request: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/beizi/ad/internal/l;->h()V

    .line 14
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    .line 15
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/b;->a(I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/beizi/ad/internal/network/ServerResponse;)V
    .locals 3

    .line 16
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getMyHandler()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/beizi/ad/internal/f$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/beizi/ad/internal/f$1;-><init>(Lcom/beizi/ad/internal/f;Lcom/beizi/ad/internal/network/ServerResponse;Lcom/beizi/ad/internal/view/AdViewImpl;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public a(Lcom/beizi/ad/internal/network/b;)V
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/beizi/ad/internal/l;->h()V

    .line 34
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->b:Lcom/beizi/ad/internal/a/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/beizi/ad/internal/f;->b:Lcom/beizi/ad/internal/a/b;

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_1

    .line 37
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/b;->a(Lcom/beizi/ad/internal/network/b;)V

    goto :goto_0

    .line 38
    :cond_1
    invoke-interface {p1}, Lcom/beizi/ad/internal/network/b;->h()V

    :goto_0
    return-void
.end method

.method public c()Lcom/beizi/ad/internal/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdViewImpl;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Lcom/beizi/ad/b/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/internal/f;->f()Lcom/beizi/ad/internal/network/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/network/a$a;->e()Lcom/beizi/ad/b/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->c:Lcom/beizi/ad/internal/network/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 3
    iput-object v2, p0, Lcom/beizi/ad/internal/f;->c:Lcom/beizi/ad/internal/network/a;

    .line 4
    :cond_0
    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/l;->a(Ljava/util/LinkedList;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->b:Lcom/beizi/ad/internal/a/b;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/a/b;->a(Z)V

    .line 7
    iput-object v2, p0, Lcom/beizi/ad/internal/f;->b:Lcom/beizi/ad/internal/a/b;

    :cond_1
    return-void
.end method

.method protected f()Lcom/beizi/ad/internal/network/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/f;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdRequest()Lcom/beizi/ad/internal/network/a$a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
