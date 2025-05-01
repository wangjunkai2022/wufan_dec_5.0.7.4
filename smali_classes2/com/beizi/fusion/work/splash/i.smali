.class public Lcom/beizi/fusion/work/splash/i;
.super Lcom/beizi/fusion/work/a;
.source "InmobiSplashWorker.java"


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:J

.field private F:J

.field private G:J

.field private H:Z

.field private I:Lcom/beizi/fusion/widget/CircleProgressView;

.field private J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

.field private K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

.field private L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private M:F

.field private N:F

.field private O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

.field private P:I

.field private Q:I

.field private R:Ljava/lang/String;

.field private S:Ljava/lang/String;

.field private T:Ljava/lang/String;

.field private U:Lcom/inmobi/ads/InMobiNative;

.field private V:Ljava/lang/Long;

.field private W:Landroid/os/CountDownTimer;

.field private X:Z

.field private Y:Z

.field private Z:Lcom/inmobi/ads/listeners/NativeAdEventListener;

.field n:I

.field o:J

.field p:Landroid/view/View;

.field private q:Landroid/content/Context;

.field private r:Ljava/lang/String;

.field private s:J

.field private t:Landroid/view/View;

.field private u:Landroid/view/ViewGroup;

.field private v:Landroid/view/ViewGroup;

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

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;",
            ">;"
        }
    .end annotation
.end field

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLandroid/view/View;Landroid/view/ViewGroup;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Ljava/util/List;Lcom/beizi/fusion/d/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "J",
            "Landroid/view/View;",
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

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->x:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->y:Ljava/util/List;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->z:Z

    .line 5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->A:Z

    .line 6
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->B:Z

    .line 7
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->C:Z

    .line 8
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->D:Z

    const-wide/16 v1, 0x1388

    .line 9
    iput-wide v1, p0, Lcom/beizi/fusion/work/splash/i;->E:J

    .line 10
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->X:Z

    .line 11
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->Y:Z

    .line 12
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    .line 13
    iput-object p2, p0, Lcom/beizi/fusion/work/splash/i;->r:Ljava/lang/String;

    .line 14
    iput-wide p3, p0, Lcom/beizi/fusion/work/splash/i;->s:J

    .line 15
    iget-object p2, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-nez p2, :cond_0

    .line 16
    new-instance p2, Lcom/beizi/fusion/widget/SkipView;

    invoke-direct {p2, p1}, Lcom/beizi/fusion/widget/SkipView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p0, Lcom/beizi/fusion/work/splash/i;->Y:Z

    goto :goto_0

    .line 18
    :cond_0
    iput-object p5, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    .line 19
    :goto_0
    iput-object p6, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    .line 20
    iput-object p7, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    .line 21
    iput-object p10, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    .line 22
    iput-object p8, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    .line 23
    new-instance p2, Lcom/beizi/fusion/work/splash/SplashContainer;

    invoke-direct {p2, p1}, Lcom/beizi/fusion/work/splash/SplashContainer;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    .line 24
    iput-object p9, p0, Lcom/beizi/fusion/work/splash/i;->w:Ljava/util/List;

    .line 25
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->r()V

    return-void
.end method

.method static synthetic A(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic B(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method

.method static synthetic C(Lcom/beizi/fusion/work/splash/i;)Landroid/os/CountDownTimer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/i;->W:Landroid/os/CountDownTimer;

    return-object p0
.end method

.method static synthetic D(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/i;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/i;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/i;->L:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->y()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/i;I)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/work/a;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/i;Ljava/lang/String;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/splash/i;Z)Z
    .locals 0

    .line 6
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/i;->D:Z

    return p1
.end method

.method private aG()V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finalShowAd mParent != null ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",!mIsLoadAdView = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/beizi/fusion/work/splash/i;->X:Z

    xor-int/2addr v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZis"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    if-eqz v0, :cond_4

    .line 3
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->X:Z

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aH()V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mAdContainer.getWidth() = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getWidth()I

    move-result v5

    invoke-virtual {v0, v1, v4, v4, v5}, Lcom/inmobi/ads/InMobiNative;->getPrimaryViewOfWidth(Landroid/content/Context;Landroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 10
    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    .line 11
    check-cast v0, Landroid/view/ViewGroup;

    .line 12
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v4, Lcom/beizi/fusion/work/splash/i$3;

    invoke-direct {v4, p0, v0}, Lcom/beizi/fusion/work/splash/i$3;-><init>(Lcom/beizi/fusion/work/splash/i;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    iput-boolean v3, p0, Lcom/beizi/fusion/work/splash/i;->X:Z

    .line 16
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    if-eqz v0, :cond_3

    .line 18
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 19
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    :cond_3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aM()V

    .line 21
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->H:Z

    if-eqz v0, :cond_5

    .line 22
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aK()V

    goto :goto_1

    .line 23
    :cond_4
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->aw()V

    :cond_5
    :goto_1
    return-void
.end method

.method private aH()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aI()V

    .line 2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->Y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    instance-of v0, v0, Lcom/beizi/fusion/widget/CircleProgressView;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x35

    .line 4
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 6
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method private aI()V
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "addCloseButton mSkipView != null ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZis"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->W:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 5
    :cond_1
    new-instance v0, Lcom/beizi/fusion/work/splash/i$4;

    iget-wide v3, p0, Lcom/beizi/fusion/work/splash/i;->E:J

    const-wide/16 v5, 0x32

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/beizi/fusion/work/splash/i$4;-><init>(Lcom/beizi/fusion/work/splash/i;JJ)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->W:Landroid/os/CountDownTimer;

    .line 6
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    new-instance v1, Lcom/beizi/fusion/work/splash/i$5;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/i$5;-><init>(Lcom/beizi/fusion/work/splash/i;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method private aJ()V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    :goto_0
    iget-object v3, v0, Lcom/beizi/fusion/work/splash/i;->w:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 2
    iget-object v3, v0, Lcom/beizi/fusion/work/splash/i;->w:Ljava/util/List;

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
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/i;->y:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const-string v5, "MATERIALVIEW"

    .line 6
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 7
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/i;->x:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_2
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->y:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_10

    .line 9
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->y:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    if-eqz v2, :cond_10

    .line 10
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getTapPosition()Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    .line 11
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getLayerPosition()Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    .line 12
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getSkipUnavailableTime()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_3

    .line 13
    iput-wide v2, v0, Lcom/beizi/fusion/work/splash/i;->G:J

    .line 14
    :cond_3
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getShowCountDown()I

    move-result v2

    iput v2, v0, Lcom/beizi/fusion/work/splash/i;->P:I

    .line 15
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getShowBorder()I

    move-result v2

    iput v2, v0, Lcom/beizi/fusion/work/splash/i;->Q:I

    .line 16
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getSkipText()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->R:Ljava/lang/String;

    .line 17
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "\u8df3\u8fc7"

    .line 18
    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->R:Ljava/lang/String;

    .line 19
    :cond_4
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getTextColor()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->S:Ljava/lang/String;

    .line 20
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "#FFFFFF"

    if-eqz v2, :cond_5

    .line 21
    iput-object v3, v0, Lcom/beizi/fusion/work/splash/i;->S:Ljava/lang/String;

    .line 22
    :cond_5
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getCountDownColor()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/beizi/fusion/work/splash/i;->T:Ljava/lang/String;

    .line 23
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 24
    iput-object v3, v0, Lcom/beizi/fusion/work/splash/i;->T:Ljava/lang/String;

    .line 25
    :cond_6
    iget-object v2, v0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getPassPolicy()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_10

    .line 26
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_10

    .line 27
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;

    .line 28
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;->getPassType()Ljava/lang/String;

    move-result-object v4

    .line 29
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$PassPolicyBean;->getPassPercent()I

    move-result v3

    .line 30
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

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    const/4 v5, 0x2

    goto :goto_3

    :sswitch_1
    const-string v6, "WAITPASS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_3

    :cond_9
    const/4 v5, 0x1

    goto :goto_3

    :sswitch_2
    const-string v6, "RANDOMPASS"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_3

    :cond_a
    const/4 v5, 0x0

    :goto_3
    packed-switch v5, :pswitch_data_0

    goto :goto_2

    .line 31
    :pswitch_0
    iget-object v4, v0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v4, :cond_7

    iget-object v5, v0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v5, :cond_7

    .line 32
    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v4

    .line 33
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v8

    .line 34
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v10

    .line 35
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v12

    .line 36
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v14

    .line 37
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v16

    .line 38
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v18

    .line 39
    iget-object v6, v0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v20

    const-wide/16 v22, 0x0

    cmpl-double v6, v4, v22

    if-lez v6, :cond_b

    cmpl-double v6, v14, v22

    if-lez v6, :cond_b

    cmpl-double v6, v4, v14

    if-nez v6, :cond_e

    :cond_b
    cmpl-double v4, v8, v22

    if-lez v4, :cond_c

    cmpl-double v4, v16, v22

    if-lez v4, :cond_c

    cmpl-double v4, v8, v16

    if-nez v4, :cond_e

    :cond_c
    cmpl-double v4, v10, v22

    if-lez v4, :cond_d

    cmpl-double v4, v18, v22

    if-lez v4, :cond_d

    cmpl-double v4, v10, v18

    if-nez v4, :cond_e

    :cond_d
    cmpl-double v4, v12, v22

    if-lez v4, :cond_f

    cmpl-double v4, v20, v22

    if-lez v4, :cond_f

    cmpl-double v4, v12, v20

    if-eqz v4, :cond_f

    .line 40
    :cond_e
    invoke-static {v3}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v3

    iput-boolean v3, v0, Lcom/beizi/fusion/work/splash/i;->B:Z

    :cond_f
    mul-double v18, v18, v20

    mul-double v10, v10, v12

    cmpg-double v3, v18, v10

    if-gez v3, :cond_7

    .line 41
    iput-boolean v7, v0, Lcom/beizi/fusion/work/splash/i;->C:Z

    goto/16 :goto_2

    .line 42
    :pswitch_1
    invoke-static {v3}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v3

    iput-boolean v3, v0, Lcom/beizi/fusion/work/splash/i;->z:Z

    goto/16 :goto_2

    .line 43
    :pswitch_2
    invoke-static {v3}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v3

    iput-boolean v3, v0, Lcom/beizi/fusion/work/splash/i;->A:Z

    goto/16 :goto_2

    .line 44
    :cond_10
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/i;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_11

    .line 45
    iget-object v1, v0, Lcom/beizi/fusion/work/splash/i;->x:Ljava/util/List;

    new-instance v2, Lcom/beizi/fusion/work/splash/i$6;

    invoke-direct {v2, v0}, Lcom/beizi/fusion/work/splash/i$6;-><init>(Lcom/beizi/fusion/work/splash/i;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_11
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
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->z:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Q()V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->A:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->R()V

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->B:Z

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->S()V

    .line 7
    :cond_2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->C:Z

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->T()V

    .line 9
    :cond_3
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/i;->E:J

    iget-wide v2, p0, Lcom/beizi/fusion/work/splash/i;->G:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/beizi/fusion/work/splash/i;->F:J

    return-void
.end method

.method private aL()Landroid/view/View;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->H:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 v2, 0x8

    .line 3
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 5
    :cond_0
    new-instance v0, Lcom/beizi/fusion/widget/SkipView;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/beizi/fusion/widget/SkipView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    .line 6
    new-instance v0, Lcom/beizi/fusion/widget/CircleProgressView;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/beizi/fusion/widget/CircleProgressView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    const-string v1, "beizi"

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 10
    new-instance v0, Lcom/beizi/fusion/widget/CircleProgressView;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/beizi/fusion/widget/CircleProgressView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    const-string v1, "app"

    goto :goto_0

    :cond_2
    const-string v1, "buyer"

    .line 13
    :goto_0
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v2, :cond_3

    .line 14
    invoke-virtual {v2, v1}, Lcom/beizi/fusion/b/b;->r(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    :cond_3
    return-object v0
.end method

.method private aM()V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter checkDisplaySkipView mNeedRender = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/beizi/fusion/work/splash/i;->H:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZis"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->H:Z

    if-eqz v0, :cond_4

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    if-eqz v0, :cond_3

    .line 4
    iget v0, p0, Lcom/beizi/fusion/work/splash/i;->M:F

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-nez v2, :cond_0

    .line 6
    iget v1, p0, Lcom/beizi/fusion/work/splash/i;->N:F

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    :cond_0
    float-to-double v2, v0

    .line 7
    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v4

    const-wide v6, 0x3f847ae147ae147bL    # 0.01

    mul-double v4, v4, v6

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    double-to-int v2, v2

    .line 8
    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v3

    const-wide/high16 v8, 0x4028000000000000L    # 12.0

    cmpl-double v5, v3, v8

    if-ltz v5, :cond_2

    int-to-double v3, v2

    .line 9
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v8

    mul-double v8, v8, v6

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v8

    double-to-int v3, v3

    int-to-double v4, v3

    .line 10
    iget-object v8, p0, Lcom/beizi/fusion/work/splash/i;->O:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v8}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getPaddingHeight()D

    move-result-wide v8

    mul-double v8, v8, v6

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v8

    double-to-int v4, v4

    const/4 v5, 0x0

    if-gez v4, :cond_1

    const/4 v4, 0x0

    .line 11
    :cond_1
    iget-object v8, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    check-cast v8, Lcom/beizi/fusion/widget/SkipView;

    iget v9, p0, Lcom/beizi/fusion/work/splash/i;->Q:I

    invoke-virtual {v8, v9, v4}, Lcom/beizi/fusion/widget/SkipView;->setData(II)V

    const/4 v4, 0x5

    .line 12
    invoke-direct {p0, v4}, Lcom/beizi/fusion/work/splash/i;->e(I)V

    .line 13
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 14
    iget-object v8, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    iget-object v9, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v8, v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v8

    mul-double v8, v8, v6

    double-to-float v4, v8

    .line 16
    iget-object v8, p0, Lcom/beizi/fusion/work/splash/i;->J:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v8}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v8

    mul-double v8, v8, v6

    double-to-float v6, v8

    mul-float v0, v0, v4

    .line 17
    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    mul-float v1, v1, v6

    .line 18
    div-int/lit8 v3, v3, 0x2

    int-to-float v2, v3

    sub-float/2addr v1, v2

    .line 19
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setX(F)V

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setY(F)V

    .line 21
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 22
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 23
    :cond_2
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aN()V

    goto :goto_0

    .line 24
    :cond_3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aN()V

    goto :goto_0

    .line 25
    :cond_4
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aN()V

    :cond_5
    :goto_0
    return-void
.end method

.method private aN()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/beizi/fusion/work/splash/i;->M:F

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
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 10
    iput v1, p0, Lcom/beizi/fusion/work/splash/i;->P:I

    .line 11
    iput v1, p0, Lcom/beizi/fusion/work/splash/i;->Q:I

    .line 12
    check-cast v0, Lcom/beizi/fusion/widget/SkipView;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/widget/SkipView;->setData(II)V

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

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
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private aO()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 2
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    if-eqz v0, :cond_2

    .line 4
    iget v0, p0, Lcom/beizi/fusion/work/splash/i;->M:F

    .line 5
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->u:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-nez v3, :cond_1

    .line 6
    iget v2, p0, Lcom/beizi/fusion/work/splash/i;->N:F

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    :cond_1
    float-to-double v3, v0

    .line 7
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getWidth()D

    move-result-wide v5

    const-wide v7, 0x3f847ae147ae147bL    # 0.01

    mul-double v5, v5, v7

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v5

    double-to-int v3, v3

    int-to-double v4, v3

    .line 8
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getHeight()D

    move-result-wide v9

    mul-double v9, v9, v7

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v9

    double-to-int v4, v4

    .line 9
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    .line 10
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 11
    iput v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 12
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v6, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object v5, p0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v5}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterX()D

    move-result-wide v5

    mul-double v5, v5, v7

    double-to-float v5, v5

    .line 14
    iget-object v6, p0, Lcom/beizi/fusion/work/splash/i;->K:Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;

    invoke-virtual {v6}, Lcom/beizi/fusion/model/AdSpacesBean$PositionBean;->getCenterY()D

    move-result-wide v9

    mul-double v9, v9, v7

    double-to-float v6, v9

    mul-float v0, v0, v5

    .line 15
    div-int/2addr v3, v1

    int-to-float v3, v3

    sub-float/2addr v0, v3

    mul-float v2, v2, v6

    .line 16
    div-int/2addr v4, v1

    int-to-float v1, v4

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 17
    aget v0, v2, v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getPivotX()F

    move-result v3

    add-float/2addr v0, v3

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    div-int/2addr v3, v1

    int-to-float v3, v3

    sub-float/2addr v0, v3

    const/4 v3, 0x1

    .line 18
    aget v2, v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getPivotY()F

    move-result v3

    add-float/2addr v2, v3

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    div-int/2addr v3, v1

    int-to-float v1, v3

    :goto_0
    sub-float/2addr v2, v1

    .line 19
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setX(F)V

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->I:Lcom/beizi/fusion/widget/CircleProgressView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setY(F)V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/i;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    return-object p0
.end method

.method private b()V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->q()Ljava/util/Map;

    move-result-object v0

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " splashWorkers:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Z()V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->g:Lcom/beizi/fusion/d/h;

    sget-object v1, Lcom/beizi/fusion/d/h;->a:Lcom/beizi/fusion/d/h;

    if-ne v0, v1, :cond_1

    .line 9
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ad()V

    goto :goto_0

    .line 10
    :cond_1
    sget-object v1, Lcom/beizi/fusion/d/h;->b:Lcom/beizi/fusion/d/h;

    if-ne v0, v1, :cond_2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "other worker shown,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " remove"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/splash/i;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/splash/i;->e(I)V

    return-void
.end method

.method static synthetic c(Lcom/beizi/fusion/work/splash/i;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->Y()Z

    move-result p0

    return p0
.end method

.method static synthetic d(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->b()V

    return-void
.end method

.method private e(I)V
    .locals 7

    .line 2
    iget v0, p0, Lcom/beizi/fusion/work/splash/i;->P:I

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

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->R:Ljava/lang/String;

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

    iget-object v6, p0, Lcom/beizi/fusion/work/splash/i;->S:Ljava/lang/String;

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {v4, v5, v1, v0, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 8
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->T:Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v3, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    invoke-interface {v4, v0, p1, v1, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    check-cast p1, Lcom/beizi/fusion/widget/SkipView;

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Landroid/text/SpannableString;

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->R:Ljava/lang/String;

    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->S:Ljava/lang/String;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i;->R:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-interface {p1, v0, v1, v3, v2}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    check-cast v0, Lcom/beizi/fusion/widget/SkipView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->O()V

    return-void
.end method

.method static synthetic f(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ab()V

    return-void
.end method

.method static synthetic g(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->D()V

    return-void
.end method

.method static synthetic h(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ah()V

    return-void
.end method

.method static synthetic i(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic j(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic k(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic l(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->E()V

    return-void
.end method

.method static synthetic m(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ai()V

    return-void
.end method

.method static synthetic n(Lcom/beizi/fusion/work/splash/i;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/i;->v:Landroid/view/ViewGroup;

    return-object p0
.end method

.method static synthetic o(Lcom/beizi/fusion/work/splash/i;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/fusion/work/splash/i;->H:Z

    return p0
.end method

.method static synthetic p(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aO()V

    return-void
.end method

.method static synthetic q(Lcom/beizi/fusion/work/splash/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/i;->G:J

    return-wide v0
.end method

.method static synthetic r(Lcom/beizi/fusion/work/splash/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/i;->E:J

    return-wide v0
.end method

.method static synthetic s(Lcom/beizi/fusion/work/splash/i;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/fusion/work/splash/i;->z:Z

    return p0
.end method

.method static synthetic t(Lcom/beizi/fusion/work/splash/i;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/work/splash/i;->F:J

    return-wide v0
.end method

.method static synthetic u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/splash/i;->t:Landroid/view/View;

    return-object p0
.end method

.method static synthetic v(Lcom/beizi/fusion/work/splash/i;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/fusion/work/splash/i;->X:Z

    return p0
.end method

.method static synthetic w(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic x(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic y(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic z(Lcom/beizi/fusion/work/splash/i;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method


# virtual methods
.method protected A()V
    .locals 3

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->al()V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    invoke-virtual {v1}, Lcom/inmobi/ads/InMobiNative;->getAdBid()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->setAvgPrice(D)V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "inmobi splash price = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    invoke-virtual {v1}, Lcom/inmobi/ads/InMobiNative;->getAdBid()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BeiZisBid"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAvgPrice()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->M(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    :cond_0
    return-void
.end method

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

    iput-wide v0, p0, Lcom/beizi/fusion/work/splash/i;->o:J

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getAppId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    .line 6
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

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getSpaceId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, p0, Lcom/beizi/fusion/work/splash/i;->V:Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x0

    goto :goto_0

    .line 8
    :catch_0
    sget-object v2, Lcom/beizi/fusion/f/a;->d:Lcom/beizi/fusion/f/a;

    iput-object v2, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    .line 9
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    const/4 v3, 0x3

    const-string v4, "Inmobi spaceId pattern problem!"

    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    .line 10
    iget-object v3, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_1

    return-void

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->a:Lcom/beizi/fusion/b/d;

    if-eqz v2, :cond_3

    .line 12
    invoke-virtual {v2}, Lcom/beizi/fusion/b/d;->a()Lcom/beizi/fusion/b/a;

    move-result-object v2

    iget-object v3, p0, Lcom/beizi/fusion/work/a;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/b/a;->a(Ljava/lang/String;)Lcom/beizi/fusion/b/b;

    move-result-object v2

    iput-object v2, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v2, :cond_3

    .line 13
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->s()V

    const-string v2, "com.inmobi.sdk.InMobiSdk"

    .line 14
    invoke-static {v2}, Lcom/beizi/fusion/g/av;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 15
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->t()V

    .line 16
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/fusion/work/splash/i$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/splash/i$1;-><init>(Lcom/beizi/fusion/work/splash/i;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 17
    :cond_2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->u()V

    .line 18
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    iget-object v3, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/inmobi/sdk/InMobiSdk;->init(Landroid/content/Context;Ljava/lang/String;)V

    .line 19
    sget-object v2, Lcom/inmobi/sdk/InMobiSdk$LogLevel;->DEBUG:Lcom/inmobi/sdk/InMobiSdk$LogLevel;

    invoke-static {v2}, Lcom/inmobi/sdk/InMobiSdk;->setLogLevel(Lcom/inmobi/sdk/InMobiSdk$LogLevel;)V

    .line 20
    invoke-static {}, Lcom/inmobi/sdk/InMobiSdk;->getVersion()Ljava/lang/String;

    move-result-object v2

    .line 21
    iget-object v3, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    invoke-virtual {v3, v2}, Lcom/beizi/fusion/b/b;->w(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    .line 23
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->v()V

    .line 24
    :cond_3
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getReqTimeOutType()I

    move-result v2

    iput v2, p0, Lcom/beizi/fusion/work/splash/i;->n:I

    .line 25
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getSleepTime()J

    move-result-wide v2

    .line 26
    iget-object v4, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {v4}, Lcom/beizi/fusion/d/e;->u()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 27
    iget-object v4, p0, Lcom/beizi/fusion/work/a;->f:Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getHotRequestDelay()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 28
    :cond_4
    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->w:Ljava/util/List;

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_5

    const/4 v0, 0x1

    :cond_5
    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/i;->H:Z

    if-eqz v0, :cond_6

    .line 29
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aJ()V

    .line 30
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":requestAd:"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "===="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->V:Ljava/lang/Long;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "==="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_7

    .line 31
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 32
    :cond_7
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->s()I

    move-result v0

    if-ge v0, v1, :cond_8

    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_8

    .line 33
    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/i;->l()V

    .line 34
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->l(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/beizi/fusion/work/splash/i;->M:F

    .line 35
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->m(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Lcom/beizi/fusion/work/splash/i;->N:F

    return-void
.end method

.method public f()V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " out make show ad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aG()V

    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "INMOBI"

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
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    invoke-virtual {v1}, Lcom/inmobi/ads/InMobiNative;->getAdBid()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method protected l()V
    .locals 5

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->w()V

    .line 3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ag()V

    .line 4
    invoke-direct {p0}, Lcom/beizi/fusion/work/splash/i;->aL()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->p:Landroid/view/View;

    .line 5
    new-instance v0, Lcom/beizi/fusion/work/splash/i$2;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/work/splash/i$2;-><init>(Lcom/beizi/fusion/work/splash/i;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->Z:Lcom/inmobi/ads/listeners/NativeAdEventListener;

    .line 6
    new-instance v0, Lcom/inmobi/ads/InMobiNative;

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i;->q:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/i;->V:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/i;->Z:Lcom/inmobi/ads/listeners/NativeAdEventListener;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/inmobi/ads/InMobiNative;-><init>(Landroid/content/Context;JLcom/inmobi/ads/listeners/NativeAdEventListener;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lcom/inmobi/ads/InMobiNative;->setDownloaderEnabled(Z)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i;->U:Lcom/inmobi/ads/InMobiNative;

    invoke-virtual {v0}, Lcom/inmobi/ads/InMobiNative;->load()V

    const-string v0, "BeiZis"

    const-string v1, "inmobi start load"

    .line 9
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
