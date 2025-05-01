.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;
.source "SourceFile"


# instance fields
.field private l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

.field private m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

.field private o:Z

.field p:I

.field final q:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

.field private r:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

.field private s:Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;

.field t:I


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->o:Z

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-direct {p2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p2

    invoke-virtual {p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a()Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    move-result-object p2

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->q:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->s:Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->t:I

    return-void
.end method

.method private A()V
    .locals 3

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->o:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->t:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "AMFTAGKS"

    const-string v1, "find cc "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->t:I

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$c;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V

    const-wide/16 v1, 0x1f4

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)Lcom/kwad/sdk/api/KsFullScreenVideoAd;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Lcom/kwad/sdk/api/KsFullScreenVideoAd;)Lcom/kwad/sdk/api/KsFullScreenVideoAd;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;II)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->o:Z

    return p1
.end method

.method private b(Landroid/app/Activity;)V
    .locals 3

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->b()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->y()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    invoke-interface {v0, p1, v1}, Lcom/kwad/sdk/api/KsFullScreenVideoAd;->showFullScreenVideoAd(Landroid/app/Activity;Lcom/kwad/sdk/api/KsVideoPlayConfig;)V

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->c(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->s()V

    return-void
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->A()V

    return-void
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->z()V

    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->j:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->s:Lcom/kwad/sdk/api/KsFullScreenVideoAd$FullScreenVideoAdInteractionListener;

    return-object p0
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->u()V

    return-void
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->r()V

    return-void
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->v()V

    return-void
.end method

.method static synthetic m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->t()V

    return-void
.end method

.method private y()V
    .locals 0

    return-void
.end method

.method private z()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    instance-of v1, v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/l;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/l;->onVideoComplete()V

    :cond_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->x()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->b(Landroid/app/Activity;)V

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

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->b(Landroid/app/Activity;)V

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->b()V

    :goto_0
    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public c(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->b(Ljava/lang/Object;I)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    :cond_0
    return-void
.end method

.method protected j()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->l:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Lcom/kwad/sdk/api/KsFullScreenVideoAd;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/b;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const v1, 0x3baa1418

    if-nez v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const-string v2, "\u5e7f\u544a\u52a0\u8f7d\u5931\u8d25\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "L"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "slotId = "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",slotIdStr = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",_slotId = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMFTAGKS"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/kwad/sdk/api/KsScene$Builder;

    invoke-direct {v0, v3, v4}, Lcom/kwad/sdk/api/KsScene$Builder;-><init>(J)V

    invoke-virtual {v0}, Lcom/kwad/sdk/api/KsScene$Builder;->build()Lcom/kwad/sdk/api/KsScene;

    move-result-object v0

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->s:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->q:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    :cond_1
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    if-eqz v2, :cond_2

    new-instance v3, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;

    invoke-direct {v3}, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;-><init>()V

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v3, v2}, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;->videoSoundEnable(Z)Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;

    invoke-virtual {v3}, Lcom/kwad/sdk/api/KsVideoPlayConfig$Builder;->build()Lcom/kwad/sdk/api/KsVideoPlayConfig;

    move-result-object v2

    iput-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->n:Lcom/kwad/sdk/api/KsVideoPlayConfig;

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->i:Z

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v3, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    const-string v2, "load ad"

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;

    invoke-direct {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b$a;)V

    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->getLoadManager()Lcom/kwad/sdk/api/KsLoadManager;

    move-result-object v2

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/u/g/b;->a()Lcom/kwad/sdk/api/KsLoadManager$FullScreenVideoAdListener;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Lcom/kwad/sdk/api/KsLoadManager;->loadFullScreenVideoAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$FullScreenVideoAdListener;)V

    return-void

    :catch_0
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const-string v2, "\u5e7f\u544aID\u914d\u7f6e\u9519\u8bef\uff0c\u5e7f\u544a\u52a0\u8f7d\u5931\u8d25\uff01"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/f;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method
