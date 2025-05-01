.class public Lcom/beizi/fusion/g/ap;
.super Ljava/lang/Object;
.source "ScrollClickUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/g/ap$a;
    }
.end annotation


# static fields
.field private static j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;


# instance fields
.field a:Lcom/beizi/fusion/widget/ScrollClickView;

.field b:I

.field c:I

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:Lcom/beizi/fusion/g/ap$a;

.field private h:Z

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/beizi/fusion/g/ap;->g:Lcom/beizi/fusion/g/ap$a;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/g/ap;->h:Z

    const/16 v0, 0xc8

    .line 4
    iput v0, p0, Lcom/beizi/fusion/g/ap;->i:I

    .line 5
    iput-object p1, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/ap;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    return-object p0
.end method

.method public static c(I)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 6
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v0, v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-int v0, v0

    if-gt v0, p0, :cond_0

    .line 7
    new-instance p0, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance p0, Landroid/util/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method private c()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/beizi/fusion/g/ap;->f:I

    invoke-static {v0}, Lcom/beizi/fusion/g/ap;->c(I)Landroid/util/Pair;

    move-result-object v0

    .line 2
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Lcom/beizi/fusion/g/ap$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/g/ap$1;-><init>(Lcom/beizi/fusion/g/ap;)V

    iget v2, p0, Lcom/beizi/fusion/g/ap;->e:I

    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    .line 4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr v2, v0

    int-to-long v2, v2

    .line 5
    invoke-static {v1, v2, v3}, Lcom/beizi/fusion/g/aa;->a(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(IILcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;)Landroid/view/View;
    .locals 7

    const-string v0, "ScrollClickUtil"

    const-string v1, "enter getScrollClick"

    .line 14
    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    if-eqz v1, :cond_a

    if-nez p3, :cond_0

    goto/16 :goto_5

    .line 16
    :cond_0
    new-instance v1, Lcom/beizi/fusion/widget/ScrollClickView;

    iget-object v2, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/beizi/fusion/widget/ScrollClickView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    .line 17
    :try_start_0
    sget-object v2, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    const-string v4, "%"

    if-eqz v2, :cond_3

    .line 18
    :try_start_1
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getScrollDirection()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/ScrollClickView;->setScrollDirection(Ljava/lang/String;)V

    .line 19
    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    sget-object v2, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/ScrollClickView;->setTitleText(Ljava/lang/String;)V

    .line 20
    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    sget-object v2, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getTitleFont()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/ScrollClickView;->setTitleFont(I)V

    .line 21
    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    sget-object v2, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getDetails()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/ScrollClickView;->setDetailText(Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    sget-object v2, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getDetailsFont()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/beizi/fusion/widget/ScrollClickView;->setDetailsFont(I)V

    .line 23
    sget-object v1, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getPosition()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;

    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;->getWidth()Ljava/lang/String;

    move-result-object v2

    .line 25
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;->getHeight()Ljava/lang/String;

    move-result-object v1

    .line 26
    invoke-virtual {v2, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    mul-int v2, v2, p1

    div-int/lit8 v2, v2, 0x64

    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 29
    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 30
    invoke-virtual {v1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    mul-int v1, v1, v2

    div-int/lit8 v1, v1, 0x64

    goto :goto_1

    .line 31
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 32
    :goto_1
    iget-object v5, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    invoke-virtual {v5, v2}, Lcom/beizi/fusion/widget/ScrollClickView;->setHandWidth(I)V

    .line 33
    iget-object v2, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    invoke-virtual {v2, v1}, Lcom/beizi/fusion/widget/ScrollClickView;->setScrollbarHeight(I)V

    .line 34
    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    invoke-virtual {v1}, Lcom/beizi/fusion/widget/ScrollClickView;->buildRealView()V

    .line 35
    :cond_3
    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;->getTop()Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {p3}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickPositionBean;->getCenterX()Ljava/lang/String;

    move-result-object p3

    .line 37
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    const-string v5, "0"

    const-string v6, "50%"

    if-nez v2, :cond_4

    :try_start_2
    invoke-virtual {v5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    move-object p3, v6

    .line 38
    :cond_5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    move-object v1, v6

    .line 39
    :cond_7
    iget-object v2, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/g/av;->j(Landroid/content/Context;)F

    .line 40
    invoke-virtual {p3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 41
    invoke-virtual {p3, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p3, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    mul-int p3, p3, p1

    div-int/lit8 p3, p3, 0x64

    iput p3, p0, Lcom/beizi/fusion/g/ap;->b:I

    goto :goto_2

    .line 42
    :cond_8
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/beizi/fusion/g/ap;->b:I

    .line 43
    :goto_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 44
    invoke-virtual {v1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {v1, v3, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    mul-int p3, p3, p2

    div-int/lit8 p3, p3, 0x64

    iput p3, p0, Lcom/beizi/fusion/g/ap;->c:I

    goto :goto_3

    .line 45
    :cond_9
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/beizi/fusion/g/ap;->c:I

    .line 46
    :goto_3
    iget-object p3, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    iget v1, p0, Lcom/beizi/fusion/g/ap;->b:I

    int-to-float v1, v1

    invoke-static {p3, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/beizi/fusion/g/ap;->b:I

    .line 47
    iget-object p3, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    iget v1, p0, Lcom/beizi/fusion/g/ap;->c:I

    int-to-float v1, v1

    invoke-static {p3, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result p3

    iput p3, p0, Lcom/beizi/fusion/g/ap;->c:I

    .line 48
    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p3, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "topInt = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/g/ap;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",centerXInt = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/beizi/fusion/g/ap;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",adWidthDp = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",adHeightDp = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/g/ap$2;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/beizi/fusion/g/ap$2;-><init>(Lcom/beizi/fusion/g/ap;IILandroid/widget/FrameLayout$LayoutParams;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 51
    iget-object p1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    iget-object p1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    new-instance p2, Lcom/beizi/fusion/g/ap$3;

    invoke-direct {p2, p0}, Lcom/beizi/fusion/g/ap$3;-><init>(Lcom/beizi/fusion/g/ap;)V

    const-wide/16 v0, 0xa

    invoke-virtual {p1, p2, v0, v1}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->printStackTrace()V

    .line 54
    :goto_4
    iget-object p1, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    return-object p1

    :cond_a
    :goto_5
    const/4 p1, 0x0

    return-object p1
.end method

.method protected a()V
    .locals 12

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "enter callBackShakeHappened and mShakeStateListener != null ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/g/ap;->g:Lcom/beizi/fusion/g/ap$a;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",!isCallBack = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/beizi/fusion/g/ap;->h:Z

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ScrollClickUtil"

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/g/ap;->g:Lcom/beizi/fusion/g/ap$a;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/beizi/fusion/g/ap;->h:Z

    if-nez v0, :cond_1

    const-string v0, "callback onShakeHappened()"

    .line 9
    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v3, p0, Lcom/beizi/fusion/g/ap;->g:Lcom/beizi/fusion/g/ap$a;

    const-string v4, "100"

    const-string v5, "200"

    const-string v6, "105"

    const-string v7, "206"

    const-string v8, "100"

    const-string v9, "200"

    const-string v10, "105"

    const-string v11, "206"

    invoke-interface/range {v3 .. v11}, Lcom/beizi/fusion/g/ap$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iput-boolean v2, p0, Lcom/beizi/fusion/g/ap;->h:Z

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/ScrollClickView;->stopAnim()V

    :cond_1
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/beizi/fusion/g/ap;->e:I

    return-void
.end method

.method public a(Lcom/beizi/fusion/g/ap$a;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/beizi/fusion/g/ap;->g:Lcom/beizi/fusion/g/ap$a;

    return-void
.end method

.method public a(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    sput-object p1, Lcom/beizi/fusion/g/ap;->j:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;

    .line 3
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getRandomClickTime()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/g/ap;->a(I)V

    .line 4
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$ScrollClickBean;->getRandomClickNum()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/beizi/fusion/g/ap;->b(I)V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/g/ap;->h:Z

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/ScrollClickView;->stopAnim()V

    :cond_0
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/beizi/fusion/g/ap;->g:Lcom/beizi/fusion/g/ap$a;

    .line 7
    iput-object v0, p0, Lcom/beizi/fusion/g/ap;->d:Landroid/content/Context;

    .line 8
    iput-object v0, p0, Lcom/beizi/fusion/g/ap;->a:Lcom/beizi/fusion/widget/ScrollClickView;

    const/16 v0, 0xc8

    .line 9
    iput v0, p0, Lcom/beizi/fusion/g/ap;->i:I

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/g/ap;->f:I

    .line 2
    invoke-direct {p0}, Lcom/beizi/fusion/g/ap;->c()V

    return-void
.end method
