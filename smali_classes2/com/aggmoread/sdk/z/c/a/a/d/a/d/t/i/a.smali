.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;
.source "SourceFile"


# instance fields
.field private l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

.field private m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private n:Z

.field private o:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

.field private p:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

.field final q:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->n:Z

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->o:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$b;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->p:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-direct {p2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;-><init>()V

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a()Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->q:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->o()Z

    move-result p0

    return p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->n:Z

    return p1
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    return-object p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->r()V

    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->q()V

    return-void
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->s()V

    return-void
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->o()Z

    move-result p0

    return p0
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->u()V

    return-void
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->n:Z

    return p0
.end method

.method static synthetic m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->u()V

    return-void
.end method

.method static synthetic n(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->w()V

    return-void
.end method

.method static synthetic o(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->v()V

    return-void
.end method

.method static synthetic p(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->t()V

    return-void
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

    const-string v1, "AMITAGGDT"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->k()Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V

    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$c;

    invoke-direct {v2, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;Landroid/app/Activity;)V

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

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->show(Landroid/app/Activity;)V

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
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->k()Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/a;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V

    const-string v0, "AMITAGGDT"

    const-string v1, "show #1 "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {v0}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->show()V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-static {v0, p2, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;IILjava/lang/String;)V

    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public destroy()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->setMediaListener(Lcom/qq/e/ads/interstitial2/UnifiedInterstitialMediaListener;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {v0}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->destroy()V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    :cond_0
    return-void
.end method

.method protected j()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 10

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {v0, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->o:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b$a;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    iget-object v7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->f:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/b;->a()Lcom/qq/e/ads/interstitial2/UnifiedInterstitialADListener;

    move-result-object v8

    const/4 v0, 0x0

    new-array v9, v0, [Ljava/lang/Object;

    invoke-static/range {v3 .. v9}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->p:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;

    invoke-direct {v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c$a;)V

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/c;->a()Lcom/qq/e/ads/interstitial2/UnifiedInterstitialMediaListener;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->setMediaListener(Lcom/qq/e/ads/interstitial2/UnifiedInterstitialMediaListener;)V

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->s:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->q:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    :cond_1
    new-instance v2, Lcom/qq/e/ads/cfg/VideoOption$Builder;

    invoke-direct {v2}, Lcom/qq/e/ads/cfg/VideoOption$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setDetailPageMuted(Z)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d()Z

    move-result v3

    invoke-virtual {v2, v3}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setAutoPlayMuted(Z)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->setAutoPlayPolicy(I)Lcom/qq/e/ads/cfg/VideoOption$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {v2}, Lcom/qq/e/ads/cfg/VideoOption$Builder;->build()Lcom/qq/e/ads/cfg/VideoOption;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->setVideoOption(Lcom/qq/e/ads/cfg/VideoOption;)V

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c()I

    move-result v2

    const/16 v3, 0x3d

    const/4 v4, 0x5

    if-lt v2, v4, :cond_2

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c()I

    move-result v2

    if-gt v2, v3, :cond_2

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->setMinVideoDuration(I)V

    :cond_2
    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b()I

    move-result v2

    if-lt v2, v4, :cond_3

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b()I

    move-result v2

    if-gt v2, v3, :cond_3

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b()I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->setMaxVideoDuration(I)V

    :cond_3
    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    const-string v1, "4.371"

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->n:Z

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/i/a;->l:Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;

    invoke-virtual {v0}, Lcom/qq/e/ads/interstitial2/UnifiedInterstitialAD;->loadAD()V

    const-string v0, "AMITAGGDT"

    const-string v1, "load enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
