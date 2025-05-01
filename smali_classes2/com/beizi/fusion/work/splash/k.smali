.class public Lcom/beizi/fusion/work/splash/k;
.super Lcom/beizi/fusion/work/a;
.source "KsSplashWorker.java"


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:J

.field private E:J

.field private F:Z

.field private G:Lcom/beizi/fusion/widget/CircleProgressView;

.field private H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

.field private I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

.field private J:J

.field private K:F

.field private L:F

.field private M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

.field private N:I

.field private O:I

.field private P:Ljava/lang/String;

.field private Q:Ljava/lang/String;

.field private R:Ljava/lang/String;

.field private S:Landroid/view/View;

.field private T:Landroid/view/ViewGroup;

.field n:J

.field private o:Landroid/content/Context;

.field private p:Ljava/lang/String;

.field private q:J

.field private r:Landroid/view/ViewGroup;

.field private s:Lcom/kwad/sdk/api/KsSplashScreenAd;

.field private t:Landroid/os/CountDownTimer;

.field private u:Landroid/view/View;

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;"
        }
    .end annotation
.end field

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "J",
            "Landroid/view/ViewGroup;",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;",
            "Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;",
            "Lcom/beizi/fusion/d/e;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/a;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/k;->w:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/k;->x:Ljava/util/List;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->y:Z

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->z:Z

    .line 6
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->A:Z

    .line 7
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->B:Z

    .line 8
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->C:Z

    const-wide/16 v0, 0x1388

    .line 9
    iput-wide v0, p0, Lcom/beizi/fusion/work/splash/k;->D:J

    .line 10
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    .line 11
    iput-object p2, p0, Lcom/beizi/fusion/work/splash/k;->p:Ljava/lang/String;

    .line 12
    iput-wide p3, p0, Lcom/beizi/fusion/work/splash/k;->q:J

    .line 13
    iput-object p5, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    .line 15
    iput-object p6, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    .line 16
    iput-object p9, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    .line 17
    iput-object p7, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    .line 18
    new-instance p2, Lcom/beizi/fusion/work/splash/SplashContainer;

    invoke-direct {p2, p1}, Lcom/beizi/fusion/work/splash/SplashContainer;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    .line 19
    iput-object p8, p0, Lcom/beizi/fusion/work/splash/k;->v:Ljava/util/List;

    .line 20
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->r()V

    return-void
.end method

.method static synthetic A(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic B(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic C(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method static synthetic D(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method

.method static synthetic E(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aQ()V

    return-void
.end method

.method static synthetic F(Lcom/beizi/fusion/work/splash/k;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/k;->E:J

    return-wide v0
.end method

.method static synthetic G(Lcom/beizi/fusion/work/splash/k;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/k;->D:J

    return-wide v0
.end method

.method static synthetic H(Lcom/beizi/fusion/work/splash/k;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/fusion/work/splash/k;->y:Z

    return p0
.end method

.method static synthetic I(Lcom/beizi/fusion/work/splash/k;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    return-object p0
.end method

.method static synthetic J(Lcom/beizi/fusion/work/splash/k;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/fusion/work/splash/k;->F:Z

    return p0
.end method

.method static synthetic K(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic L(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic M(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic N(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method static synthetic O(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method

.method static synthetic P(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->H()V

    return-void
.end method

.method static synthetic Q(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method private a(Lcom/kwad/sdk/api/KsSplashScreenAd;)Landroid/view/View;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    new-instance v1, Lcom/beizi/fusion/work/splash/k$3;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/k$3;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/api/KsSplashScreenAd;->getView(Landroid/content/Context;Lcom/kwad/sdk/api/KsSplashScreenAd$SplashScreenAdInteractionListener;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;Lcom/kwad/sdk/api/KsSplashScreenAd;)Lcom/kwad/sdk/api/KsSplashScreenAd;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k;->s:Lcom/kwad/sdk/api/KsSplashScreenAd;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->y()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;D)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(D)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/work/a;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;Ljava/lang/String;I)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/k;Z)Z
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/k;->C:Z

    return p1
.end method

.method private aG()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->s:Lcom/kwad/sdk/api/KsSplashScreenAd;

    invoke-direct {p0, v0}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/kwad/sdk/api/KsSplashScreenAd;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/k;->u:Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->u:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 6
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aH()V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->u:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->u:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 10
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aN()V

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aw()V

    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aw()V

    :goto_1
    return-void
.end method

.method private aH()V
    .locals 4

    .line 1
    new-instance v0, Lcom/beizi/fusion/work/splash/k$4;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/work/splash/k$4;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-boolean v1, p0, Lcom/beizi/fusion/work/splash/k;->F:Z

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    if-eqz v1, :cond_0

    const/16 v2, 0x8

    .line 4
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 6
    :cond_0
    new-instance v1, Lcom/beizi/fusion/widget/SkipView;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/beizi/fusion/widget/SkipView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    .line 7
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/fusion/work/splash/k$5;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/k$5;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    iget-wide v2, p0, Lcom/beizi/fusion/work/splash/k;->J:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const-string v0, "beizi"

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aI()V

    const-string v0, "app"

    goto :goto_0

    :cond_2
    const-string v0, "buyer"

    .line 12
    :goto_0
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {v1, v0}, Lcom/beizi/fusion/b/b;->r(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    :cond_3
    return-void
.end method

.method private aI()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->t:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 3
    :cond_0
    new-instance v0, Lcom/beizi/fusion/work/splash/k$6;

    iget-wide v1, p0, Lcom/beizi/fusion/work/splash/k;->D:J

    const-wide/16 v3, 0x64

    add-long/2addr v3, v1

    const-wide/16 v5, 0x32

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/beizi/fusion/work/splash/k$6;-><init>(Lcom/beizi/fusion/work/splash/k;JJ)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/k;->t:Landroid/os/CountDownTimer;

    .line 4
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    return-void
.end method

.method private aJ()V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    :goto_0
    iget-object v3, v0, Lcom/beizi/fusion/work/splash/k;->v:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 2
    iget-object v3, v0, Lcom/beizi/fusion/work/splash/k;->v:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    .line 3
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "SKIPVIEW"

    .line 4
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 5
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->x:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const-string v5, "MATERIALVIEW"

    .line 6
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 7
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->w:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const-wide/16 v2, 0x0

    .line 8
    iput-wide v2, v0, Lcom/beizi/fusion/work/splash/k;->E:J

    .line 9
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->x:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_12

    .line 10
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->x:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    iput-object v4, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    if-eqz v4, :cond_12

    .line 11
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getTapPosition()Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    move-result-object v4

    iput-object v4, v0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    .line 12
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getLayerPosition()Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    move-result-object v4

    iput-object v4, v0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    .line 13
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getDelayDisplaySkipButton()J

    move-result-wide v4

    iput-wide v4, v0, Lcom/beizi/fusion/work/splash/k;->J:J

    cmp-long v6, v4, v2

    if-gez v6, :cond_3

    .line 14
    iput-wide v2, v0, Lcom/beizi/fusion/work/splash/k;->J:J

    .line 15
    :cond_3
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getSkipViewTotalTime()J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-lez v6, :cond_4

    .line 16
    iput-wide v4, v0, Lcom/beizi/fusion/work/splash/k;->D:J

    .line 17
    :cond_4
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getSkipUnavailableTime()J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-lez v6, :cond_5

    .line 18
    iput-wide v4, v0, Lcom/beizi/fusion/work/splash/k;->E:J

    .line 19
    :cond_5
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getShowCountDown()I

    move-result v2

    iput v2, v0, Lcom/beizi/fusion/work/splash/k;->N:I

    .line 20
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getShowBorder()I

    move-result v2

    iput v2, v0, Lcom/beizi/fusion/work/splash/k;->O:I

    .line 21
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getSkipText()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/k;->P:Ljava/lang/String;

    .line 22
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "\u8df3\u8fc7"

    .line 23
    iput-object v2, v0, Lcom/beizi/fusion/work/splash/k;->P:Ljava/lang/String;

    .line 24
    :cond_6
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getTextColor()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/k;->Q:Ljava/lang/String;

    .line 25
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "#FFFFFF"

    if-eqz v2, :cond_7

    .line 26
    iput-object v3, v0, Lcom/beizi/fusion/work/splash/k;->Q:Ljava/lang/String;

    .line 27
    :cond_7
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getCountDownColor()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/k;->R:Ljava/lang/String;

    .line 28
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 29
    iput-object v3, v0, Lcom/beizi/fusion/work/splash/k;->R:Ljava/lang/String;

    .line 30
    :cond_8
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getPassPolicy()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_12

    .line 31
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_12

    .line 32
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;

    .line 33
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;->getPassType()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;->getPassPercent()I

    move-result v3

    .line 35
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v6, "LAYERPASS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    const/4 v5, 0x2

    goto :goto_3

    :sswitch_1
    const-string v6, "WAITPASS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_3

    :cond_b
    const/4 v5, 0x1

    goto :goto_3

    :sswitch_2
    const-string v6, "RANDOMPASS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_3

    :cond_c
    const/4 v5, 0x0

    :goto_3
    packed-switch v5, :pswitch_data_0

    goto :goto_2

    .line 36
    :pswitch_0
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v4, :cond_9

    iget-object v5, v0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v5, :cond_9

    .line 37
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v4

    .line 38
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v8

    .line 39
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v10

    .line 40
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v12

    .line 41
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v14

    .line 42
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v16

    .line 43
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v18

    .line 44
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v20

    const-wide/16 v22, 0x0

    cmpl-double v6, v4, v22

    if-lez v6, :cond_d

    cmpl-double v6, v14, v22

    if-lez v6, :cond_d

    cmpl-double v6, v4, v14

    if-nez v6, :cond_10

    :cond_d
    cmpl-double v4, v8, v22

    if-lez v4, :cond_e

    cmpl-double v4, v16, v22

    if-lez v4, :cond_e

    cmpl-double v4, v8, v16

    if-nez v4, :cond_10

    :cond_e
    cmpl-double v4, v10, v22

    if-lez v4, :cond_f

    cmpl-double v4, v18, v22

    if-lez v4, :cond_f

    cmpl-double v4, v10, v18

    if-nez v4, :cond_10

    :cond_f
    cmpl-double v4, v12, v22

    if-lez v4, :cond_11

    cmpl-double v4, v20, v22

    if-lez v4, :cond_11

    cmpl-double v4, v12, v20

    if-eqz v4, :cond_11

    .line 45
    :cond_10
    invoke-static {v3}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v3

    iput-boolean v3, v0, Lcom/beizi/fusion/work/splash/k;->A:Z

    :cond_11
    mul-double v18, v18, v20

    mul-double v10, v10, v12

    cmpg-double v3, v18, v10

    if-gez v3, :cond_9

    .line 46
    iput-boolean v7, v0, Lcom/beizi/fusion/work/splash/k;->B:Z

    goto/16 :goto_2

    .line 47
    :pswitch_1
    invoke-static {v3}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v3

    iput-boolean v3, v0, Lcom/beizi/fusion/work/splash/k;->y:Z

    goto/16 :goto_2

    .line 48
    :pswitch_2
    invoke-static {v3}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v3

    iput-boolean v3, v0, Lcom/beizi/fusion/work/splash/k;->z:Z

    goto/16 :goto_2

    .line 49
    :cond_12
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/k;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_13

    .line 50
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/k;->w:Ljava/util/List;

    new-instance v2, Lcom/beizi/fusion/work/splash/k$7;

    invoke-direct {v2, v0}, Lcom/beizi/fusion/work/splash/k$7;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_13
    return-void

    :sswitch_data_0
    .sparse-switch
        0x23db1b54 -> :sswitch_2
        0x3d522306 -> :sswitch_1
        0x42ef38c2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private aK()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->y:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Q()V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->z:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->R()V

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->A:Z

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->S()V

    .line 7
    :cond_2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->B:Z

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->T()V

    .line 9
    :cond_3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aL()V

    return-void
.end method

.method private aL()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->t:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/k;->D:J

    iget-wide v2, p0, Lcom/beizi/fusion/work/splash/k;->E:J

    sub-long v10, v0, v2

    .line 4
    new-instance v0, Lcom/beizi/fusion/work/splash/k$8;

    iget-wide v1, p0, Lcom/beizi/fusion/work/splash/k;->D:J

    const-wide/16 v3, 0x64

    add-long v6, v1, v3

    const-wide/16 v8, 0x32

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v11}, Lcom/beizi/fusion/work/splash/k$8;-><init>(Lcom/beizi/fusion/work/splash/k;JJJ)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/k;->t:Landroid/os/CountDownTimer;

    .line 5
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 6
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aP()V

    return-void
.end method

.method private aM()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->t:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const-string v0, "BeiZis"

    const-string v1, "enter cancel mCountDownTimer"

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private aN()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/k;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 3
    iget v2, p0, Lcom/beizi/fusion/work/splash/k;->K:F

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v3, 0x0

    cmpl-float v3, v0, v3

    if-nez v3, :cond_0

    .line 5
    iget v0, p0, Lcom/beizi/fusion/work/splash/k;->L:F

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v0, v3

    :cond_0
    float-to-double v3, v2

    .line 6
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v5

    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    mul-double v5, v5, v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    double-to-int v3, v3

    .line 7
    iget-object v4, p0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v4

    const-wide/high16 v9, 0x4028000000000000L    # 12.0

    cmpl-double v6, v4, v9

    if-ltz v6, :cond_2

    int-to-double v4, v3

    .line 8
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v9

    mul-double v9, v9, v7

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v9

    double-to-int v4, v4

    int-to-double v5, v4

    .line 9
    iget-object v9, p0, Lcom/beizi/fusion/work/splash/k;->M:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v9}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getPaddingHeight()D

    move-result-wide v9

    mul-double v9, v9, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v9

    double-to-int v5, v5

    if-gez v5, :cond_1

    const/4 v5, 0x0

    .line 10
    :cond_1
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    check-cast v6, Lcom/beizi/fusion/widget/SkipView;

    iget v9, p0, Lcom/beizi/fusion/work/splash/k;->O:I

    invoke-virtual {v6, v9, v5}, Lcom/beizi/fusion/widget/SkipView;->setData(II)V

    const/4 v5, 0x5

    .line 11
    invoke-direct {p0, v5}, Lcom/beizi/fusion/work/splash/k;->e(I)V

    .line 12
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 13
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    iget-object v9, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v6, v9, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v5

    mul-double v5, v5, v7

    double-to-float v5, v5

    .line 15
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->H:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v9

    mul-double v9, v9, v7

    double-to-float v6, v9

    mul-float v2, v2, v5

    .line 16
    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v2, v3

    mul-float v0, v0, v6

    .line 17
    div-int/lit8 v4, v4, 0x2

    int-to-float v3, v4

    sub-float/2addr v0, v3

    .line 18
    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setX(F)V

    .line 19
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setY(F)V

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 22
    :cond_2
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aO()V

    goto :goto_0

    .line 23
    :cond_3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aO()V

    goto :goto_0

    .line 24
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_5
    :goto_0
    return-void
.end method

.method private aO()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/beizi/fusion/work/splash/k;->K:F

    float-to-double v0, v0

    const-wide v2, 0x3fc3333333333333L    # 0.15

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    double-to-int v0, v0

    int-to-double v1, v0

    const-wide v3, 0x3fdccccccccccccdL    # 0.45

    .line 2
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v1, v1, v3

    double-to-int v1, v1

    .line 3
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0x35

    .line 4
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 10
    iput v1, p0, Lcom/beizi/fusion/work/splash/k;->N:I

    .line 11
    iput v1, p0, Lcom/beizi/fusion/work/splash/k;->O:I

    .line 12
    check-cast v0, Lcom/beizi/fusion/widget/SkipView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/widget/SkipView;->setData(II)V

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    check-cast v0, Lcom/beizi/fusion/widget/SkipView;

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v3, "\u8df3\u8fc7 %d"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private aP()V
    .locals 3

    .line 1
    new-instance v0, Lcom/beizi/fusion/widget/CircleProgressView;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/widget/CircleProgressView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    .line 2
    new-instance v1, Lcom/beizi/fusion/work/splash/k$9;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/k$9;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 4
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->T:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private aQ()V
    .locals 11

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 1
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 2
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v2, :cond_2

    .line 3
    iget v1, p0, Lcom/beizi/fusion/work/splash/k;->K:F

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->r:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    cmpl-float v3, v2, v3

    if-nez v3, :cond_1

    .line 6
    iget v2, p0, Lcom/beizi/fusion/work/splash/k;->L:F

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    :cond_1
    float-to-double v3, v1

    .line 7
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v5

    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    mul-double v5, v5, v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    double-to-int v3, v3

    int-to-double v4, v3

    .line 8
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v9

    mul-double v9, v9, v7

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v9

    double-to-int v4, v4

    .line 9
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 10
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 11
    iput v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 12
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v5

    mul-double v5, v5, v7

    double-to-float v5, v5

    .line 14
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->I:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v9

    mul-double v9, v9, v7

    double-to-float v6, v9

    mul-float v1, v1, v5

    .line 15
    div-int/2addr v3, v0

    int-to-float v3, v3

    sub-float/2addr v1, v3

    mul-float v2, v2, v6

    .line 16
    div-int/2addr v4, v0

    int-to-float v0, v4

    sub-float/2addr v2, v0

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 17
    aget v2, v1, v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getPivotX()F

    move-result v3

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    div-int/2addr v3, v0

    int-to-float v3, v3

    sub-float/2addr v2, v3

    const/4 v3, 0x1

    .line 18
    aget v1, v1, v3

    int-to-float v1, v1

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getPivotY()F

    move-result v3

    add-float/2addr v1, v3

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    div-int/2addr v3, v0

    int-to-float v0, v3

    sub-float v0, v1, v0

    move v1, v2

    move v2, v0

    .line 19
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setX(F)V

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->G:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setY(F)V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/k;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/k;)Lcom/kwad/sdk/api/KsSplashScreenAd;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/k;->s:Lcom/kwad/sdk/api/KsSplashScreenAd;

    return-object p0
.end method

.method private b()V
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->q()Ljava/util/Map;

    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/k;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " splashWorkers:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Z()V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->g:Lcom/beizi/fusion/d/h;

    sget-object v1, Lcom/beizi/fusion/d/h;->a:Lcom/beizi/fusion/d/h;

    if-ne v0, v1, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ad()V

    goto :goto_0

    .line 11
    :cond_1
    sget-object v1, Lcom/beizi/fusion/d/h;->b:Lcom/beizi/fusion/d/h;

    if-ne v0, v1, :cond_2

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "other worker shown,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " remove"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/k;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/splash/k;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/k;Ljava/lang/String;I)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic c(Lcom/beizi/fusion/work/splash/k;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Y()Z

    move-result p0

    return p0
.end method

.method static synthetic d(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->b()V

    return-void
.end method

.method private e(I)V
    .locals 7

    .line 2
    iget v0, p0, Lcom/beizi/fusion/work/splash/k;->N:I

    const/4 v1, 0x0

    const/16 v2, 0x21

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->P:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 6
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 7
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    iget-object v6, p0, Lcom/beizi/fusion/work/splash/k;->Q:Ljava/lang/String;

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {v4, v5, v1, v0, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 8
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->R:Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v3, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    invoke-interface {v4, v0, p1, v1, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    check-cast p1, Lcom/beizi/fusion/widget/SkipView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Landroid/text/SpannableString;

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->P:Ljava/lang/String;

    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->Q:Ljava/lang/String;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/k;->P:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-interface {p1, v0, v1, v3, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->S:Landroid/view/View;

    check-cast v0, Lcom/beizi/fusion/widget/SkipView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->O()V

    return-void
.end method

.method static synthetic f(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic g(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic h(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic i(Lcom/beizi/fusion/work/splash/k;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/a;->l:J

    return-wide v0
.end method

.method static synthetic j(Lcom/beizi/fusion/work/splash/k;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic k(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->E()V

    return-void
.end method

.method static synthetic l(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ai()V

    return-void
.end method

.method static synthetic m(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method static synthetic n(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method

.method static synthetic o(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->C()V

    return-void
.end method

.method static synthetic p(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ab()V

    return-void
.end method

.method static synthetic q(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->D()V

    return-void
.end method

.method static synthetic r(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ah()V

    return-void
.end method

.method static synthetic s(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method static synthetic t(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->H()V

    return-void
.end method

.method static synthetic u(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aM()V

    return-void
.end method

.method static synthetic v(Lcom/beizi/fusion/work/splash/k;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic w(Lcom/beizi/fusion/work/splash/k;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/k;->t:Landroid/os/CountDownTimer;

    return-object p0
.end method

.method static synthetic x(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ac()V

    return-void
.end method

.method static synthetic y(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aK()V

    return-void
.end method

.method static synthetic z(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/fusion/work/splash/k;->n:J

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getSpaceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    .line 7
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

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->a:Lcom/beizi/fusion/b/d;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/beizi/fusion/b/d;->a()Lcom/beizi/fusion/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/a;->a(Ljava/lang/String;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->s()V

    const-string v0, "com.kwad.sdk.api.KsAdSDK"

    .line 11
    invoke-static {v0}, Lcom/beizi/fusion/g/av;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->t()V

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/fusion/work/splash/k$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/k$1;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->u()V

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/fusion/d/n;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->getSDKVersion()Ljava/lang/String;

    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    invoke-virtual {v1, v0}, Lcom/beizi/fusion/b/b;->u(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    .line 19
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->v()V

    .line 20
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v0

    .line 21
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {v2}, Lcom/beizi/fusion/d/e;->u()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 22
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getHotRequestDelay()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 23
    :cond_3
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/k;->v:Ljava/util/List;

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/beizi/fusion/work/splash/k;->F:Z

    if-eqz v2, :cond_5

    .line 24
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aJ()V

    .line 25
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/k;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":requestAd:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "===="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "==="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-lez v2, :cond_6

    .line 26
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 27
    :cond_6
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->s()I

    move-result v0

    if-ge v0, v3, :cond_7

    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    .line 28
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/k;->l()V

    .line 29
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->l(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/beizi/fusion/work/splash/k;->K:F

    .line 30
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->m(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/beizi/fusion/work/splash/k;->L:F

    return-void
.end method

.method public f()V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/k;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " out make show ad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/k;->aG()V

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "KUAISHOU"

    return-object v0
.end method

.method public i()Lcom/beizi/fusion/f/a;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k;->s:Lcom/kwad/sdk/api/KsSplashScreenAd;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/k;->s:Lcom/kwad/sdk/api/KsSplashScreenAd;

    invoke-interface {v1}, Lcom/kwad/sdk/api/KsSplashScreenAd;->getECPM()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public k()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    return-object v0
.end method

.method protected l()V
    .locals 4

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->w()V

    .line 3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ag()V

    .line 4
    new-instance v0, Lcom/kwad/sdk/api/model/SplashAdExtraData;

    invoke-direct {v0}, Lcom/kwad/sdk/api/model/SplashAdExtraData;-><init>()V

    .line 5
    invoke-static {}, Lcom/beizi/fusion/BeiZis;->isCloseShakeAd()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/api/model/SplashAdExtraData;->setDisableShakeStatus(Z)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/api/model/SplashAdExtraData;->setDisableShakeStatus(Z)V

    .line 8
    :goto_0
    new-instance v1, Lcom/kwad/sdk/api/KsScene$Builder;

    iget-object v2, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/kwad/sdk/api/KsScene$Builder;-><init>(J)V

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/api/KsScene$Builder;->setSplashExtraData(Lcom/kwad/sdk/api/model/SplashAdExtraData;)Lcom/kwad/sdk/api/KsScene$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/api/KsScene$Builder;->build()Lcom/kwad/sdk/api/KsScene;

    move-result-object v0

    .line 9
    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->getLoadManager()Lcom/kwad/sdk/api/KsLoadManager;

    move-result-object v1

    if-nez v1, :cond_1

    const/16 v0, 0x27b0

    const-string v1, "\u6e20\u9053\u5e7f\u544a\u8bf7\u6c42\u5f02\u5e38"

    .line 10
    invoke-virtual {p0, v1, v0}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBidType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "S2S"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 12
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aC()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/kwad/sdk/api/KsScene;->setBidResponse(Ljava/lang/String;)V

    .line 13
    :cond_2
    new-instance v2, Lcom/beizi/fusion/work/splash/k$2;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/work/splash/k$2;-><init>(Lcom/beizi/fusion/work/splash/k;)V

    invoke-interface {v1, v0, v2}, Lcom/kwad/sdk/api/KsLoadManager;->loadSplashScreenAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;)V

    return-void
.end method
