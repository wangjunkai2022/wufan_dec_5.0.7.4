.class public Lcom/beizi/fusion/work/splash/l;
.super Lcom/beizi/fusion/work/a;
.source "MtgSplashWorker.java"


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

.field private o:J

.field private p:Landroid/content/Context;

.field private q:Ljava/lang/String;

.field private r:J

.field private s:Landroid/view/ViewGroup;

.field private t:J

.field private u:Lcom/mbridge/msdk/out/MBSplashHandler;

.field private v:Lcom/mbridge/msdk/mbbid/out/BidManager;

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->B:Z

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->C:Z

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->D:Z

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->E:Z

    .line 6
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Lcom/beizi/fusion/work/splash/l;->q:Ljava/lang/String;

    .line 8
    iput-wide p3, p0, Lcom/beizi/fusion/work/splash/l;->r:J

    .line 9
    iput-object p5, p0, Lcom/beizi/fusion/work/splash/l;->s:Landroid/view/ViewGroup;

    .line 10
    iput-object p6, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    .line 11
    iput-object p8, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    .line 12
    iput-object p7, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    .line 13
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->r()V

    return-void
.end method

.method static synthetic A(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic B(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic C(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method static synthetic D(Lcom/beizi/fusion/work/splash/l;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic E(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method

.method static synthetic F(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->L()V

    return-void
.end method

.method static synthetic G(Lcom/beizi/fusion/work/splash/l;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic H(Lcom/beizi/fusion/work/splash/l;)Lcom/mbridge/msdk/out/MBSplashHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    return-object p0
.end method

.method static synthetic I(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/l;->aM()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/l;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/l;Lcom/mbridge/msdk/mbbid/out/BidResponsed;)Lcom/mbridge/msdk/mbbid/out/BidResponsed;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/l;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 4
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->L()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/l;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/work/a;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/l;Ljava/lang/String;I)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private aH()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->D:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/beizi/fusion/work/splash/l;->t:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->u()V

    .line 4
    invoke-static {}, Lcom/beizi/fusion/b;->a()Lcom/beizi/fusion/b;

    move-result-object v4

    iget-object v5, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    iget-object v6, p0, Lcom/beizi/fusion/work/splash/l;->A:Ljava/lang/String;

    iget-object v7, p0, Lcom/beizi/fusion/work/splash/l;->z:Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lcom/beizi/fusion/work/splash/l$2;

    invoke-direct {v10, p0}, Lcom/beizi/fusion/work/splash/l$2;-><init>(Lcom/beizi/fusion/work/splash/l;)V

    invoke-virtual/range {v4 .. v10}, Lcom/beizi/fusion/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lcom/beizi/fusion/b$c;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    const-string v2, "MAL_16.2.57"

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/b/b;->z(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    .line 7
    iput-boolean v1, p0, Lcom/beizi/fusion/work/splash/l;->D:Z

    return-void
.end method

.method private aI()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->v:Lcom/mbridge/msdk/mbbid/out/BidManager;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/beizi/fusion/work/splash/l$5;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/l$5;-><init>(Lcom/beizi/fusion/work/splash/l;)V

    invoke-virtual {v0, v1}, Lcom/mbridge/msdk/mbbid/out/BidManager;->setBidListener(Lcom/mbridge/msdk/mbbid/out/BidListennning;)V

    :cond_0
    return-void
.end method

.method private aJ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->q()Ljava/util/Map;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " splashWorkers:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Z()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->g:Lcom/beizi/fusion/d/h;

    sget-object v1, Lcom/beizi/fusion/d/h;->a:Lcom/beizi/fusion/d/h;

    if-ne v0, v1, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ad()V

    goto :goto_0

    .line 7
    :cond_1
    sget-object v1, Lcom/beizi/fusion/d/h;->b:Lcom/beizi/fusion/d/h;

    if-ne v0, v1, :cond_2

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "other worker shown,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " remove"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    return-void
.end method

.method private aK()V
    .locals 4

    const-string v0, "BeiZis"

    const-string v1, "enter finalShowAd"

    .line 1
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finalShowAd isAdReady = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/mbridge/msdk/out/MBSplashHandler;->isReady(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/l;->aL()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->s:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 7
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->am()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->s:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mbridge/msdk/out/MBSplashHandler;->show(Landroid/view/ViewGroup;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->s:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lcom/mbridge/msdk/out/MBSplashHandler;->show(Landroid/view/ViewGroup;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aw()V

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aw()V

    :goto_0
    return-void
.end method

.method private aL()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->am()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    invoke-virtual {v1, v0}, Lcom/mbridge/msdk/out/MBSplashHandler;->isReady(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    invoke-virtual {v0}, Lcom/mbridge/msdk/out/MBSplashHandler;->isReady()Z

    move-result v0

    return v0
.end method

.method private aM()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->z()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    if-eqz v0, :cond_3

    .line 2
    sget-object v0, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p0, v0}, Lcom/beizi/fusion/work/a;->a(I)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    const-string v0, "0"

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v1}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    const-string v0, "USD"

    .line 6
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v1}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getCur()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    const-wide v5, 0x40199999a0000000L    # 6.400000095367432

    mul-double v3, v3, v5

    :goto_0
    mul-double v3, v3, v1

    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    goto :goto_0

    :goto_1
    const-string v0, "BeiZisBid"

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mtg splash price = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ",currency = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v2}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getCur()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, v3, v4}, Lcom/beizi/fusion/work/a;->a(D)V

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aB()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    .line 13
    :cond_2
    :goto_2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->K()V

    .line 14
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->l()V

    :cond_3
    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/l;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->v()V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/l;Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic c(Lcom/beizi/fusion/work/splash/l;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic d(Lcom/beizi/fusion/work/splash/l;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/l;->x:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/beizi/fusion/work/splash/l;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/l;->y:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/beizi/fusion/work/splash/l;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/l;->t:J

    return-wide v0
.end method

.method static synthetic g(Lcom/beizi/fusion/work/splash/l;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic h(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic i(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic j(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic k(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->L()V

    return-void
.end method

.method static synthetic l(Lcom/beizi/fusion/work/splash/l;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/l;->o:J

    return-wide v0
.end method

.method static synthetic m(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->al()V

    return-void
.end method

.method static synthetic n(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->y()V

    return-void
.end method

.method static synthetic o(Lcom/beizi/fusion/work/splash/l;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Y()Z

    move-result p0

    return p0
.end method

.method static synthetic p(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/l;->aJ()V

    return-void
.end method

.method static synthetic q(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->O()V

    return-void
.end method

.method static synthetic r(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ab()V

    return-void
.end method

.method static synthetic s(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->C()V

    return-void
.end method

.method static synthetic t(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->D()V

    return-void
.end method

.method static synthetic u(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ah()V

    return-void
.end method

.method static synthetic v(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->E()V

    return-void
.end method

.method static synthetic w(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic x(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic y(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic z(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ai()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 7
    new-instance v0, Lcom/mbridge/msdk/mbbid/out/BidManager;

    new-instance v8, Lcom/mbridge/msdk/mbbid/out/SplashBidRequestParams;

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/16 v6, 0x1e

    const/16 v7, 0x1e

    move-object v1, v8

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/mbridge/msdk/mbbid/out/SplashBidRequestParams;-><init>(Ljava/lang/String;Ljava/lang/String;ZIII)V

    invoke-direct {v0, v8}, Lcom/mbridge/msdk/mbbid/out/BidManager;-><init>(Lcom/mbridge/msdk/mbbid/out/CommonBidRequestParams;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/l;->v:Lcom/mbridge/msdk/mbbid/out/BidManager;

    return-void
.end method

.method public aG()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/beizi/fusion/work/splash/l;->E:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v1, Lcom/beizi/fusion/work/splash/l$3;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/l$3;-><init>(Lcom/beizi/fusion/work/splash/l;)V

    invoke-virtual {v0, v1}, Lcom/mbridge/msdk/out/MBSplashHandler;->setSplashLoadListener(Lcom/mbridge/msdk/out/MBSplashLoadListener;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    new-instance v1, Lcom/beizi/fusion/work/splash/l$4;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/l$4;-><init>(Lcom/beizi/fusion/work/splash/l;)V

    invoke-virtual {v0, v1}, Lcom/mbridge/msdk/out/MBSplashHandler;->setSplashShowListener(Lcom/mbridge/msdk/out/MBSplashShowListener;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->E:Z

    :cond_1
    :goto_0
    return-void
.end method

.method protected aa()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public az()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->C:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "BeiZis"

    const-string v1, "enter sendWinNotice"

    .line 2
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    if-eqz v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->sendWinNotice(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->C:Z

    .line 6
    :cond_1
    invoke-super {p0}, Lcom/beizi/fusion/work/a;->az()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->v:Lcom/mbridge/msdk/mbbid/out/BidManager;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidManager;->bid()V

    :cond_0
    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 3

    .line 4
    :try_start_0
    new-instance v0, Lcom/mbridge/msdk/out/MBSplashHandler;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->x:Ljava/lang/String;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->y:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Lcom/mbridge/msdk/out/MBSplashHandler;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    .line 5
    iget-wide v1, p0, Lcom/beizi/fusion/work/splash/l;->r:J

    invoke-virtual {v0, v1, v2}, Lcom/mbridge/msdk/out/MBSplashHandler;->setLoadTimeOut(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 4

    const-string v0, "_"

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getSpaceId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/beizi/fusion/work/splash/l;->o:J

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 7
    :try_start_0
    iget-object v3, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v2

    iput-object v3, p0, Lcom/beizi/fusion/work/splash/l;->x:Ljava/lang/String;

    .line 8
    iget-object v3, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v1

    iput-object v3, p0, Lcom/beizi/fusion/work/splash/l;->y:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 9
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    :goto_0
    :try_start_1
    iget-object v3, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v2, v3, v2

    iput-object v2, p0, Lcom/beizi/fusion/work/splash/l;->z:Ljava/lang/String;

    .line 11
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/l;->A:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 13
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdWorker chanel = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZis"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mtg placementId = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",adUnitId = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",mtgAppId = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",mtgAppKey = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->A:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->a:Lcom/beizi/fusion/b/d;

    if-eqz v0, :cond_2

    .line 16
    invoke-virtual {v0}, Lcom/beizi/fusion/b/d;->a()Lcom/beizi/fusion/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/a;->a(Ljava/lang/String;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->s()V

    const-string v0, "com.mbridge.msdk.MBridgeSDK"

    .line 18
    invoke-static {v0}, Lcom/beizi/fusion/g/av;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 19
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->t()V

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/fusion/work/splash/l$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/l$1;-><init>(Lcom/beizi/fusion/work/splash/l;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 21
    :cond_1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/l;->aH()V

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/fusion/work/splash/l;->t:J

    .line 23
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 24
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/l;->t:J

    iget-object v2, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getHotRequestDelay()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/fusion/work/splash/l;->t:J

    :cond_3
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 25
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->B:Z

    if-eqz v0, :cond_0

    return-void

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter sendLoseNotice state = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZis"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    if-eqz v1, :cond_4

    .line 28
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    invoke-static {}, Lcom/mbridge/msdk/mbbid/out/BidLossCode;->bidWinButNotShow()Lcom/mbridge/msdk/mbbid/out/BidLossCode;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->sendLossNotice(Landroid/content/Context;Lcom/mbridge/msdk/mbbid/out/BidLossCode;)V

    .line 29
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->B:Z

    goto :goto_0

    .line 30
    :cond_2
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    if-eqz v1, :cond_4

    .line 31
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    invoke-static {}, Lcom/mbridge/msdk/mbbid/out/BidLossCode;->bidTimeOut()Lcom/mbridge/msdk/mbbid/out/BidLossCode;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->sendLossNotice(Landroid/content/Context;Lcom/mbridge/msdk/mbbid/out/BidLossCode;)V

    .line 32
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->B:Z

    goto :goto_0

    .line 33
    :cond_3
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    if-eqz v1, :cond_4

    .line 34
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->p:Landroid/content/Context;

    invoke-static {}, Lcom/mbridge/msdk/mbbid/out/BidLossCode;->bidPriceNotHighest()Lcom/mbridge/msdk/mbbid/out/BidLossCode;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->sendLossNotice(Landroid/content/Context;Lcom/mbridge/msdk/mbbid/out/BidLossCode;)V

    .line 35
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/l;->B:Z

    .line 36
    :cond_4
    :goto_0
    invoke-super {p0, p1}, Lcom/beizi/fusion/work/a;->d(I)V

    return-void
.end method

.method public f()V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " out make show ad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/l;->aK()V

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "MTG"

    return-object v0
.end method

.method public i()Lcom/beizi/fusion/f/a;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getCur()Ljava/lang/String;

    move-result-object v0

    const-string v1, "USD"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    const-wide v5, 0x40199999a0000000L    # 6.400000095367432

    mul-double v3, v3, v5

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    invoke-virtual {v0}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getPrice()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3

    :goto_0
    mul-double v3, v3, v1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public k()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    return-object v0
.end method

.method protected l()V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->am()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->n:Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    const-string v1, "BeiZis"

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->aG()V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mtg bid second step mbSplashHandler = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ",token = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->az()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->w()V

    .line 9
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ag()V

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/l;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mbridge/msdk/out/MBSplashHandler;->preLoadByToken(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "mtg bid first step"

    .line 11
    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/l;->aI()V

    .line 13
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->b()V

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->w()V

    .line 15
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ag()V

    .line 16
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/l;->aG()V

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l;->u:Lcom/mbridge/msdk/out/MBSplashHandler;

    invoke-virtual {v0}, Lcom/mbridge/msdk/out/MBSplashHandler;->preLoad()V

    :cond_2
    :goto_0
    return-void
.end method
