.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;
.source "SourceFile"


# instance fields
.field private l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

.field private m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private n:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$a;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->n:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->r()V

    return-void
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    return p0
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->u()V

    return-void
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->w()V

    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->s()V

    return-void
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->v()V

    return-void
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->t()V

    return-void
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show #2 activity = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMITAGBD"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "show #2 "

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "show #3 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;->show(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "AMITAGBD"

    const-string v1, "show()"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->a(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b()V

    :goto_0
    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    const-string p2, "203"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "win "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    :cond_0
    return-void
.end method

.method protected j()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->g:Lcom/aggmoread/sdk/z/c/a/a/e/q/f;

    invoke-static {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/e/q/f;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    move-result-object v1

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->n:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;

    invoke-virtual {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$j;)Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;->setLoadListener(Lcom/baidu/mobads/sdk/api/ExpressInterstitialListener;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-virtual {v1, v0}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;->setAppSid(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    :try_start_0
    new-instance v0, Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;

    invoke-direct {v0}, Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;-><init>()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;->build()Lcom/baidu/mobads/sdk/api/RequestParameters;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;Lcom/baidu/mobads/sdk/api/RequestParameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/g/a;->l:Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/ExpressInterstitialAd;->load()V

    const-string v0, "AMITAGBD"

    const-string v1, "load enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
