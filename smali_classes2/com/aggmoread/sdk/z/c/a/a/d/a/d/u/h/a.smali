.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;
.source "SourceFile"


# instance fields
.field private l:Lcom/kwad/sdk/api/KsInterstitialAd;

.field private m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

.field o:I

.field final p:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

.field private q:Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;

.field private r:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-direct {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;-><init>()V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a()Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->p:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->q:Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->r:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)Lcom/kwad/sdk/api/KsInterstitialAd;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;Lcom/kwad/sdk/api/KsInterstitialAd;)Lcom/kwad/sdk/api/KsInterstitialAd;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->s()V

    return-void
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->q()V

    return-void
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)Lcom/kwad/sdk/api/KsVideoPlayConfig;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    return-object p0
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->r:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    return-object p0
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->u()V

    return-void
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->r()V

    return-void
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->v()V

    return-void
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->t()V

    return-void
.end method

.method static synthetic m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method private x()V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 3

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->x()V

    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$c;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show #3 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMITAGKS"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    invoke-interface {v0, p1, v1}, Lcom/kwad/sdk/api/KsInterstitialAd;->showInterstitialAd(Landroid/app/Activity;Lcom/kwad/sdk/api/KsVideoPlayConfig;)V

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

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->a(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b()V

    :goto_0
    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public c(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->b(Ljava/lang/Object;I)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    :cond_0
    return-void
.end method

.method protected j()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->l:Lcom/kwad/sdk/api/KsInterstitialAd;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Lcom/kwad/sdk/api/KsInterstitialAd;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 7

    const-string v0, "AMITAGKS"

    const-string v1, "handle enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    const v2, 0x3baa1418

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const-string v3, "\u5e7f\u544a\u52a0\u8f7d\u5931\u8d25\uff01"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    const-string v1, "returen #1"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "L"

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "handle #3"

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "slotId = "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",slotIdStr = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",_slotId = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/kwad/sdk/api/KsScene$Builder;

    invoke-direct {v1, v4, v5}, Lcom/kwad/sdk/api/KsScene$Builder;-><init>(J)V

    invoke-virtual {v1}, Lcom/kwad/sdk/api/KsScene$Builder;->build()Lcom/kwad/sdk/api/KsScene;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->s:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->p:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    :cond_1
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    if-eqz v2, :cond_2

    new-instance v3, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;

    invoke-direct {v3}, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;-><init>()V

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v3, v2}, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;->videoSoundEnable(Z)Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;

    invoke-virtual {v3}, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;->build()Lcom/kwad/sdk/api/KsVideoPlayConfig;

    move-result-object v2

    iput-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->i:Z

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v3, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    const-string v2, "load ad"

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->getLoadManager()Lcom/kwad/sdk/api/KsLoadManager;

    move-result-object v0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/h/a;->q:Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;

    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/api/KsLoadManager;->loadInterstitialAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$InterstitialAdListener;)V

    return-void

    :catch_0
    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const-string v3, "\u5e7f\u544aID\u914d\u7f6e\u9519\u8bef\uff0c\u5e7f\u544a\u52a0\u8f7d\u5931\u8d25\uff01"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/g;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    const-string v1, "returen #2"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
