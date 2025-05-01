.class public Lcom/beizi/fusion/work/f/b;
.super Lcom/beizi/fusion/work/f/a;
.source "BeiZiNativeUnifiedWorker.java"


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:I

.field private F:I

.field private G:I

.field private H:Landroid/view/View;

.field private I:Ljava/lang/String;

.field private v:Lcom/beizi/ad/UnifiedCustomAd;

.field private w:Lcom/beizi/ad/NativeAdResponse;

.field private x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

.field private y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

.field private z:Lcom/beizi/fusion/g/ag;


# direct methods
.method public constructor <init>(Landroid/content/Context;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/beizi/fusion/work/f/a;-><init>(Landroid/content/Context;JLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;I)V

    const/4 p2, 0x0

    .line 2
    iput-object p2, p0, Lcom/beizi/fusion/work/f/b;->A:Ljava/lang/String;

    const/4 p3, 0x0

    .line 3
    iput-boolean p3, p0, Lcom/beizi/fusion/work/f/b;->B:Z

    .line 4
    iput-boolean p3, p0, Lcom/beizi/fusion/work/f/b;->C:Z

    .line 5
    iput-boolean p3, p0, Lcom/beizi/fusion/work/f/b;->D:Z

    .line 6
    iput p3, p0, Lcom/beizi/fusion/work/f/b;->G:I

    .line 7
    iput-object p2, p0, Lcom/beizi/fusion/work/f/b;->I:Ljava/lang/String;

    .line 8
    :try_start_0
    iget-object p2, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getCallBackStrategy()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 9
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p4

    if-lez p4, :cond_1

    const/4 p4, 0x1

    .line 10
    iput-boolean p4, p0, Lcom/beizi/fusion/work/f/b;->C:Z

    .line 11
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p4

    if-ge p3, p4, :cond_1

    .line 12
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;

    const-string p5, "290.300"

    .line 13
    invoke-virtual {p4}, Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;->getEventCode()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5, p6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_0

    .line 14
    invoke-virtual {p4}, Lcom/beizi/fusion/model/AdSpacesBean$CallBackStrategyBean;->getRate()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-static {p2}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result p2

    iput-boolean p2, p0, Lcom/beizi/fusion/work/f/b;->D:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :catch_0
    move-exception p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    :cond_1
    :goto_1
    iget-object p2, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    if-eqz p2, :cond_2

    .line 17
    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getCoolShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    .line 18
    iget-object p2, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getClkremove()I

    move-result p2

    iput p2, p0, Lcom/beizi/fusion/work/f/b;->G:I

    .line 19
    iget-object p2, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    invoke-virtual {p2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getTitle()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/beizi/fusion/work/f/b;->I:Ljava/lang/String;

    .line 20
    :cond_2
    new-instance p2, Lcom/beizi/fusion/g/ag;

    invoke-direct {p2, p1}, Lcom/beizi/fusion/g/ag;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    .line 21
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "cool_"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/fusion/work/f/b;->A:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;Lcom/beizi/ad/NativeAdResponse;)Lcom/beizi/ad/NativeAdResponse;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/ad/UnifiedCustomAd;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    return-object p1
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;

    .line 18
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;->getOrderList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 19
    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method private a(III)V
    .locals 5

    .line 20
    :try_start_0
    invoke-direct {p0}, Lcom/beizi/fusion/work/f/b;->aX()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getPosition()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    if-eqz v0, :cond_1

    .line 23
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getShakeViewUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->G(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    .line 25
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    .line 26
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getOrderData()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    .line 27
    invoke-virtual {v1}, Lcom/beizi/ad/UnifiedCustomAd;->getAdId()Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-direct {p0, v0, v1}, Lcom/beizi/fusion/work/f/b;->a(Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;->getShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 30
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataShakeViewBean;->getShakeView()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    move-result-object v1

    :cond_2
    if-gtz p2, :cond_3

    move p2, p3

    .line 31
    :cond_3
    iget-object p3, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    int-to-float v2, p1

    .line 32
    invoke-static {v0, v2}, Lcom/beizi/fusion/g/av;->b(Landroid/content/Context;F)I

    move-result v0

    iget-object v2, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    int-to-float v3, p2

    .line 33
    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->b(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    .line 34
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getPosition()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;

    move-result-object v3

    iget-object v4, p0, Lcom/beizi/fusion/work/f/b;->I:Ljava/lang/String;

    .line 35
    invoke-virtual {p3, v0, v2, v3, v4}, Lcom/beizi/fusion/g/ag;->a(IILcom/beizi/fusion/model/AdSpacesBean$BuyerBean$PercentPositionBean;Ljava/lang/String;)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/beizi/fusion/work/f/b;->H:Landroid/view/View;

    if-eqz p3, :cond_4

    .line 36
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    .line 37
    instance-of v0, p3, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_4

    .line 38
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 39
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-direct {v0, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 40
    iget v2, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 41
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 42
    iget-object p3, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getIsHideAnim()I

    move-result p3

    if-nez p3, :cond_4

    .line 43
    iget-object p3, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    iget-object v2, p0, Lcom/beizi/fusion/work/f/b;->H:Landroid/view/View;

    invoke-virtual {p3, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    :cond_4
    invoke-direct {p0, v1}, Lcom/beizi/fusion/work/f/b;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V

    .line 45
    iget-object p3, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    new-instance v0, Lcom/beizi/fusion/work/f/b$7;

    invoke-direct {v0, p0, p1, p2}, Lcom/beizi/fusion/work/f/b$7;-><init>(Lcom/beizi/fusion/work/f/b;II)V

    invoke-virtual {p3, v0}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/g/ag$a;)V

    .line 46
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    if-eqz p1, :cond_5

    .line 47
    iget-object p2, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    iget-object p3, p0, Lcom/beizi/fusion/work/f/b;->A:Ljava/lang/String;

    invoke-virtual {p2, p1, p3}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;Ljava/lang/String;)V

    .line 48
    :cond_5
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    iget-object p2, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/g/ag;->a(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_6
    :goto_0
    return-void
.end method

.method private a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    .line 51
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 52
    iput-boolean v1, p0, Lcom/beizi/fusion/work/f/b;->B:Z

    .line 53
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V

    return-void

    .line 54
    :cond_1
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/f/b;->b(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V

    return-void

    .line 56
    :cond_2
    invoke-direct {p0}, Lcom/beizi/fusion/work/f/b;->aW()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 57
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;)V

    return-void

    .line 58
    :cond_3
    iput-boolean v1, p0, Lcom/beizi/fusion/work/f/b;->B:Z

    .line 59
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/g/ag;->a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;D)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(D)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/work/a;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;III)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/fusion/work/f/b;->a(III)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;Ljava/lang/String;I)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/f/b;Z)Z
    .locals 0

    .line 8
    iput-boolean p1, p0, Lcom/beizi/fusion/work/f/b;->B:Z

    return p1
.end method

.method private aU()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->l(Landroid/content/Context;)F

    move-result v0

    .line 2
    iget v1, p0, Lcom/beizi/fusion/work/f/b;->E:I

    int-to-float v1, v1

    const/high16 v2, 0x40800000    # 4.0f

    div-float v2, v0, v2

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_2

    iget v1, p0, Lcom/beizi/fusion/work/f/b;->F:I

    int-to-float v1, v1

    const/high16 v2, 0x40e00000    # 7.0f

    div-float/2addr v0, v2

    cmpg-float v0, v1, v0

    if-gez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    iput-object v0, p0, Lcom/beizi/fusion/work/a;->j:Lcom/beizi/fusion/f/a;

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {p0}, Lcom/beizi/fusion/work/f/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/f/a;->t:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/beizi/fusion/work/f/a;->t:Z

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->az()V

    .line 9
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->C()V

    .line 10
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->D()V

    .line 11
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ah()V

    :cond_2
    :goto_0
    return-void
.end method

.method private aV()V
    .locals 2

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/beizi/fusion/work/f/b;->C:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/a;->e:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getCallBackStrategyUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/beizi/fusion/b/b;->P(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->F()V

    .line 5
    iget-boolean v0, p0, Lcom/beizi/fusion/work/f/b;->C:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/fusion/work/f/b;->D:Z

    if-nez v0, :cond_1

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {p0}, Lcom/beizi/fusion/work/f/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->E()V

    .line 9
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->ai()V

    .line 10
    iget v0, p0, Lcom/beizi/fusion/work/f/b;->G:I

    if-nez v0, :cond_3

    return-void

    .line 11
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->H:Landroid/view/View;

    if-nez v1, :cond_4

    goto :goto_0

    .line 12
    :cond_4
    invoke-virtual {v0}, Lcom/beizi/fusion/g/ag;->c()V

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->H:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private aW()Z
    .locals 6

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    .line 2
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-wide v1, v1, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getUserProtectTime()J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v5, v3, v1

    if-gez v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return v0
.end method

.method private aX()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->x:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;->getRenderRate()I

    move-result v0

    invoke-static {v0}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v0

    return v0
.end method

.method private aY()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getApkInfo()Lcom/beizi/ad/lance/ApkBean;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->getDownloadTextView(Landroid/content/Context;Lcom/beizi/ad/NativeAdResponse;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    .line 4
    :cond_2
    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    mul-int/lit8 v1, v1, 0x2

    div-int/lit8 v1, v1, 0x3

    .line 5
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 6
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v4, 0x33

    invoke-direct {v2, v3, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/f/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->y()V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/f/b;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/work/a;->c(I)V

    return-void
.end method

.method private b(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)Z
    .locals 7

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->A:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v4}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getCoolTime()J

    move-result-wide v0

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    const/4 v0, 0x1

    .line 6
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v4, Lcom/beizi/fusion/work/f/b$8;

    invoke-direct {v4, p0, p1}, Lcom/beizi/fusion/work/f/b$8;-><init>(Lcom/beizi/fusion/work/f/b;Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ShakeViewBean;)V

    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    .line 7
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;->getCoolTime()J

    move-result-wide v5

    sub-long/2addr v5, v2

    .line 8
    invoke-virtual {v1, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/g/aq;->a()Lcom/beizi/fusion/g/aq;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->A:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/g/aq;->a(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic c(Lcom/beizi/fusion/work/f/b;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/work/f/b;->E:I

    return p1
.end method

.method static synthetic c(Lcom/beizi/fusion/work/f/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/beizi/fusion/work/f/b;->aY()V

    return-void
.end method

.method static synthetic d(Lcom/beizi/fusion/work/f/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/work/f/b;->E:I

    return p0
.end method

.method static synthetic d(Lcom/beizi/fusion/work/f/b;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/work/f/b;->F:I

    return p1
.end method

.method static synthetic e(Lcom/beizi/fusion/work/f/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/beizi/fusion/work/f/b;->F:I

    return p0
.end method

.method static synthetic f(Lcom/beizi/fusion/work/f/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/f/b;->aV()V

    return-void
.end method

.method static synthetic g(Lcom/beizi/fusion/work/f/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/f/b;->aU()V

    return-void
.end method

.method static synthetic h(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/ad/NativeAdResponse;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    return-object p0
.end method

.method static synthetic i(Lcom/beizi/fusion/work/f/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/beizi/fusion/work/f/b;->B:Z

    return p0
.end method

.method static synthetic j(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/f/b;->y:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$CoolShakeViewBean;

    return-object p0
.end method

.method static synthetic k(Lcom/beizi/fusion/work/f/b;)Lcom/beizi/fusion/g/ag;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    return-object p0
.end method

.method static synthetic l(Lcom/beizi/fusion/work/f/b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/f/b;->A:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method protected A()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->al()V

    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/beizi/fusion/work/f/b;->aS()V

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/work/f/b$3;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/f/b$3;-><init>(Lcom/beizi/fusion/work/f/b;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    if-eqz p1, :cond_0

    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    new-instance v2, Lcom/beizi/fusion/work/f/b$4;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/work/f/b$4;-><init>(Lcom/beizi/fusion/work/f/b;)V

    invoke-static {v0, v1, p1, v2}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->registerTracking(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Ljava/util/List;Lcom/beizi/ad/internal/nativead/NativeAdEventListener;)V

    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/beizi/fusion/work/f/b$5;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/f/b$5;-><init>(Lcom/beizi/fusion/work/f/b;)V

    invoke-static {p1, v0, v1}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->registerTracking(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdEventListener;)V

    .line 15
    :goto_0
    iget-object p1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/beizi/fusion/work/f/b$6;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/f/b$6;-><init>(Lcom/beizi/fusion/work/f/b;)V

    invoke-static {p1, v0, v1}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->registerShow(Lcom/beizi/ad/NativeAdResponse;Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method

.method public aG()V
    .locals 6

    const-string v0, "com.beizi.ad.BeiZi"

    .line 1
    invoke-static {v0}, Lcom/beizi/fusion/g/av;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->t()V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    new-instance v1, Lcom/beizi/fusion/work/f/b$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/f/b$1;-><init>(Lcom/beizi/fusion/work/f/b;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->u()V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/fusion/d/w;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->v()V

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    invoke-virtual {p0}, Lcom/beizi/fusion/work/f/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":requestAd:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "===="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "==="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/beizi/fusion/work/f/a;->o:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    iget-wide v0, p0, Lcom/beizi/fusion/work/f/a;->o:J

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    cmp-long v5, v0, v2

    if-lez v5, :cond_1

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/work/a;->m:Landroid/os/Handler;

    invoke-virtual {v2, v4, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->s()I

    move-result v0

    if-ge v0, v4, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 12
    invoke-virtual {p0}, Lcom/beizi/fusion/work/f/a;->l()V

    :cond_2
    :goto_0
    return-void
.end method

.method public aH()V
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    .line 2
    new-instance v0, Lcom/beizi/ad/UnifiedCustomAd;

    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/work/a;->i:Ljava/lang/String;

    new-instance v3, Lcom/beizi/fusion/work/f/b$2;

    invoke-direct {v3, p0}, Lcom/beizi/fusion/work/f/b$2;-><init>(Lcom/beizi/fusion/work/f/b;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/beizi/ad/UnifiedCustomAd;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/ad/NativeAdListener;)V

    iput-object v0, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/beizi/ad/UnifiedCustomAd;->openAdInNativeBrowser(Z)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    invoke-virtual {v0}, Lcom/beizi/ad/UnifiedCustomAd;->loadAd()V

    return-void
.end method

.method public aI()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getHeadline()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getTexts()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_0

    const/4 v0, 0x0

    .line 6
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public aJ()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getBody()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getTexts()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    const/4 v0, 0x1

    .line 6
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public aK()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public aL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public aM()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getImageUrls()Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v3}, Lcom/beizi/ad/NativeAdResponse;->getImageUrls()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getImageUrls()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public aN()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public aO()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getCallToAction()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getTexts()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_1

    const/4 v0, 0x2

    .line 6
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 7
    :cond_1
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "\u67e5\u770b\u8be6\u60c5"

    :cond_2
    return-object v0
.end method

.method public aP()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public aQ()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public aS()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    const/4 v3, -0x2

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getlogoUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v1

    .line 5
    iget-object v4, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-static {v4, v1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createLogoImageView(Landroid/content/Context;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)Landroid/widget/FrameLayout;

    move-result-object v1

    const/4 v4, 0x0

    .line 6
    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 7
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v6, 0x41880000    # 17.0f

    invoke-direct {v5, v3, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/work/f/b;->w:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getAdUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v1

    .line 9
    iget-object v5, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    invoke-static {v5, v1}, Lcom/beizi/ad/internal/utilities/ViewUtil;->createAdImageView(Landroid/content/Context;Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;)Landroid/widget/FrameLayout;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 11
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v3, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x5

    .line 13
    invoke-virtual {v5, v6, v4, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 14
    iput v2, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 15
    invoke-virtual {v1, v5}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    iget-object v1, p0, Lcom/beizi/fusion/work/f/a;->s:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v5, 0x55

    invoke-direct {v2, v3, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 18
    iget-object v2, p0, Lcom/beizi/fusion/work/f/a;->n:Landroid/content/Context;

    const/high16 v3, 0x40c00000    # 6.0f

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    .line 19
    invoke-virtual {v1, v4, v4, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "BEIZI"

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/beizi/ad/UnifiedCustomAd;->getPrice()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->v:Lcom/beizi/ad/UnifiedCustomAd;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/UnifiedCustomAd;->cancel()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/f/b;->z:Lcom/beizi/fusion/g/ag;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/beizi/fusion/g/ag;->c()V

    :cond_1
    return-void
.end method
