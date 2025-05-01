.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;
.source "SourceFile"


# instance fields
.field private p:Ljava/lang/String;

.field private q:Lcom/baidu/mobads/sdk/api/NativeResponse;

.field private r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

.field private s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

.field private t:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/baidu/mobads/sdk/api/NativeResponse;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/mobads/sdk/api/NativeResponse;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3, p4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    const-string p4, "AMDRAWTAGBD"

    iput-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;)I

    move-result p1

    iget-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->l:Ljava/util/Map;

    invoke-static {p4, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic g(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->j()V

    return-void
.end method

.method static synthetic h(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    return-object p0
.end method

.method static synthetic i(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    return-object p0
.end method

.method static synthetic j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method private j()V
    .locals 9

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->n:Ljava/lang/Object;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a()Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v5

    iget-wide v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->g:J

    iget-object v8, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-virtual/range {v3 .. v8}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;J[Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;ZZ)V

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->n:Lcom/aggmoread/sdk/z/c/a/a/c/n/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/b;->onAdClicked()V

    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic n(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method

.method static synthetic o(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->m:Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ac "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->a()Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V
    .locals 0

    return-void
.end method

.method protected a(Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    if-eqz p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    new-instance v2, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;

    invoke-direct {v2, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)V

    invoke-interface {v0, v1, p2, p1, v2}, Lcom/baidu/mobads/sdk/api/NativeResponse;->registerViewForInteraction(Landroid/view/View;Ljava/util/List;Ljava/util/List;Lcom/baidu/mobads/sdk/api/NativeResponse$AdInteractionListener;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-virtual {p1, p2}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;->setAdData(Lcom/baidu/mobads/sdk/api/AbstractData;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    invoke-virtual {p1}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;->play()V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->b(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    const-string p2, "203"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    :cond_0
    return-void
.end method

.method protected getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    const-string v1, "getView"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getView "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->r:Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    return-object v0
.end method

.method public render()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    const-string v1, "render"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->q:Lcom/baidu/mobads/sdk/api/NativeResponse;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->p:Ljava/lang/String;

    const-string v1, "render failed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    if-nez v0, :cond_1

    new-instance v0, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->s:Lcom/baidu/mobads/sdk/api/FeedPortraitVideoView;

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/b;->n:Lcom/aggmoread/sdk/z/c/a/a/c/n/b;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/b;->onRenderSuccess()V

    :cond_2
    return-void
.end method

.method public renderActivity(Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->render()V

    return-void
.end method
