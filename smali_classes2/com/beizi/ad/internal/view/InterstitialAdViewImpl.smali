.class public Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;
.super Lcom/beizi/ad/internal/view/AdViewImpl;
.source "InterstitialAdViewImpl.java"


# static fields
.field public static final INTENT_KEY_CLOSE_BUTTON_DELAY:Ljava/lang/String; = "CLOSE_BUTTON_DELAY"

.field public static final INTENT_KEY_TIME:Ljava/lang/String; = "TIME"

.field public static INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl; = null

.field public static final MAX_AGE:J = 0x41eb0L


# instance fields
.field protected m:Z

.field protected n:Z

.field private o:I

.field private p:I

.field private q:Z

.field private r:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/beizi/ad/internal/view/e;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lcom/beizi/ad/AdActivity$a;

.field private t:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    const/16 p2, 0x2710

    .line 15
    iput p2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->p:I

    .line 16
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    const/4 p2, 0x0

    .line 17
    iput-object p2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    .line 18
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    .line 19
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 21
    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    const/16 p2, 0x2710

    .line 22
    iput p2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->p:I

    .line 23
    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    const/4 p2, 0x0

    .line 24
    iput-object p2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    .line 25
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    .line 26
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    const/16 v0, 0x2710

    .line 3
    iput v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->p:I

    .line 4
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    .line 6
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    .line 7
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    .line 8
    iput-boolean p2, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->j:Z

    .line 9
    iput-boolean p3, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->k:Z

    if-eqz p2, :cond_0

    const/high16 p1, -0x1000000

    .line 10
    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    .line 11
    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    goto :goto_0

    :cond_1
    const/16 p2, 0x33

    .line 12
    invoke-static {p2, p1, p1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    :goto_0
    return-void
.end method

.method private a(J)Z
    .locals 8

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    iget-object v1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/ad/internal/view/e;

    if-eqz v2, :cond_1

    .line 29
    invoke-interface {v2}, Lcom/beizi/ad/internal/view/e;->a()J

    move-result-wide v3

    sub-long v3, p1, v3

    const-wide/32 v5, 0x41eb0

    cmp-long v7, v3, v5

    if-gtz v7, :cond_1

    invoke-interface {v2}, Lcom/beizi/ad/internal/view/e;->a()J

    move-result-wide v3

    sub-long v3, p1, v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_1

    invoke-interface {v2}, Lcom/beizi/ad/internal/view/e;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/beizi/ad/internal/view/e;->c()Lcom/beizi/ad/internal/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/ad/internal/a/b;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_2

    .line 30
    :cond_1
    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 31
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/e;

    .line 32
    iget-object v1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    return p1
.end method

.method private b(Lcom/beizi/ad/internal/view/c;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 30
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->failed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 31
    :cond_1
    :goto_0
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    const-string v0, "Loaded an ad with an invalid displayable"

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/c;->a(I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    sget-object p2, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/d;->a(Lcom/beizi/ad/internal/j;)V

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    .line 7
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    int-to-float p2, p2

    .line 8
    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->i()F

    move-result v1

    div-float/2addr p2, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr p2, v1

    float-to-int p2, p2

    int-to-float p1, p1

    .line 9
    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->h()F

    move-result v0

    div-float/2addr p1, v0

    add-float/2addr p1, v1

    float-to-int p1, p1

    .line 10
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {v0, p1}, Lcom/beizi/ad/internal/d;->d(I)V

    .line 11
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->h:Lcom/beizi/ad/internal/d;

    invoke-virtual {p1, p2}, Lcom/beizi/ad/internal/d;->e(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method protected a(Lcom/beizi/ad/internal/a/e;)V
    .locals 5

    .line 20
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->b(Lcom/beizi/ad/internal/view/c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_1

    .line 22
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->destroy()V

    .line 23
    :cond_1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    if-nez v0, :cond_2

    .line 24
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    .line 25
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    new-instance v1, Lcom/beizi/ad/internal/view/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/e;->a()Lcom/beizi/ad/internal/a/b;

    move-result-object v4

    invoke-direct {v1, p1, v2, v3, v4}, Lcom/beizi/ad/internal/view/d;-><init>(Lcom/beizi/ad/internal/view/c;Ljava/lang/Long;ZLcom/beizi/ad/internal/a/b;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    .line 26
    invoke-virtual {p1}, Lcom/beizi/ad/internal/a/e;->destroy()V

    :cond_3
    :goto_0
    return-void
.end method

.method protected a(Lcom/beizi/ad/internal/view/c;)V
    .locals 5

    .line 13
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->b(Lcom/beizi/ad/internal/view/c;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    if-eqz v0, :cond_1

    .line 15
    invoke-interface {v0}, Lcom/beizi/ad/internal/view/c;->destroy()V

    .line 16
    :cond_1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    if-nez v0, :cond_2

    .line 17
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->c:Lcom/beizi/ad/internal/view/c;

    .line 18
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    new-instance v1, Lcom/beizi/ad/internal/view/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, p1, v2, v3, v4}, Lcom/beizi/ad/internal/view/d;-><init>(Lcom/beizi/ad/internal/view/c;Ljava/lang/Long;ZLcom/beizi/ad/internal/a/b;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    .line 19
    invoke-interface {p1}, Lcom/beizi/ad/internal/view/c;->destroy()V

    :cond_3
    :goto_0
    return-void
.end method

.method public activityOnDestroy()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    return-void
.end method

.method public activityOnPause()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    return-void
.end method

.method public activityOnResume()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->n:Z

    return-void
.end method

.method protected b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/beizi/ad/R$styleable;->AdView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    .line 3
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->found_n_in_xml:I

    int-to-long v2, p2

    invoke-static {v1, v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IJ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_5

    .line 4
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    .line 5
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_beizi_adUnitId:I

    if-ne v2, v3, :cond_0

    .line 6
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/beizi/ad/internal/view/AdViewImpl;->setAdUnitId(Ljava/lang/String;)V

    .line 7
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->placement_id:I

    .line 8
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-static {v4, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 10
    :cond_0
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_test:I

    if-ne v2, v3, :cond_1

    .line 11
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v3

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v3, Lcom/beizi/ad/internal/g;->c:Z

    .line 12
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_set_test:I

    .line 13
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v4

    iget-boolean v4, v4, Lcom/beizi/ad/internal/g;->c:Z

    .line 14
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 16
    :cond_1
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_opens_native_browser:I

    if-ne v2, v3, :cond_2

    .line 17
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v4, Lcom/beizi/ad/R$string;->xml_set_opens_native_browser:I

    .line 18
    invoke-static {v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 19
    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->setOpensNativeBrowser(Z)V

    goto :goto_1

    .line 21
    :cond_2
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_show_loading_indicator:I

    const/4 v4, 0x1

    if-ne v2, v3, :cond_3

    .line 22
    sget-object v3, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v5, Lcom/beizi/ad/R$string;->show_loading_indicator_xml:I

    .line 23
    invoke-static {v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-static {v3, v5}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->setShowLoadingIndicator(Z)V

    goto :goto_1

    .line 26
    :cond_3
    sget v3, Lcom/beizi/ad/R$styleable;->AdView_load_landing_page_in_background:I

    if-ne v2, v3, :cond_4

    .line 27
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/beizi/ad/internal/view/AdViewImpl;->setLoadsInBackground(Z)V

    .line 28
    sget-object v2, Lcom/beizi/ad/internal/utilities/HaoboLog;->xmlLogTag:Ljava/lang/String;

    sget v3, Lcom/beizi/ad/R$string;->xml_load_landing_page_in_background:I

    iget-boolean v4, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->g:Z

    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(IZ)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 29
    :cond_5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    sput-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    return-void
.end method

.method d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public destroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->destroy()V

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->destroy_int:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    const/4 v0, 0x0

    .line 6
    sput-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    return-void
.end method

.method e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/AdActivity$a;->d()V

    :cond_0
    return-void
.end method

.method g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/AdActivity$a;->e()V

    :cond_0
    return-void
.end method

.method public getAdBuyerBean()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->t:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    return-object v0
.end method

.method public getAdImplementation()Lcom/beizi/ad/AdActivity$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    return-object v0
.end method

.method public getAdQueue()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue<",
            "Lcom/beizi/ad/internal/view/e;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    return-object v0
.end method

.method public getBackgroundColor()I
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->get_bg:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    return v0
.end method

.method public getCloseButtonDelay()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->p:I

    return v0
.end method

.method public getCreativeHeight()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getCreativeWidth()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getMediaType()Lcom/beizi/ad/internal/j;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    return-object v0
.end method

.method public loadAd(Lcom/beizi/ad/internal/network/a$a;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdParameters()Lcom/beizi/ad/internal/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/d;->a(Z)V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->i:Lcom/beizi/ad/internal/network/a$a;

    .line 3
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->load_ad_int:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lcom/beizi/ad/internal/view/AdViewImpl;->isReadyToStart()Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->a()V

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/c;->b()V

    const/4 p1, 0x1

    .line 8
    iput p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->loadCount:I

    .line 9
    iput v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->clickCount:I

    return p1

    :cond_1
    return v1
.end method

.method public onCreateLifeCycle()V
    .locals 0

    return-void
.end method

.method public onDestoryLifeCycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl;->mAdFetcher:Lcom/beizi/ad/internal/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/ad/internal/c;->a()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public onPauseLifeCycle()V
    .locals 0

    return-void
.end method

.method public onRestartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onResumeLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStartLifeCycle()V
    .locals 0

    return-void
.end method

.method public onStopLifeCycle()V
    .locals 0

    return-void
.end method

.method public setAdBuyerBean(Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->t:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    return-void
.end method

.method public setAdImplementation(Lcom/beizi/ad/AdActivity$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->s:Lcom/beizi/ad/AdActivity$a;

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->set_bg:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->o:I

    return-void
.end method

.method public setCloseButtonDelay(I)V
    .locals 1

    const/16 v0, 0x2710

    .line 1
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->p:I

    return-void
.end method

.method public setDismissOnClick(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->q:Z

    return-void
.end method

.method public shouldDismissOnClick()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->q:Z

    return v0
.end method

.method public show()I
    .locals 6

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->publicFunctionsLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->show_int:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->a(J)Z

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v3}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/internal/view/e;

    if-eqz v3, :cond_0

    .line 5
    invoke-interface {v3}, Lcom/beizi/ad/internal/view/e;->b()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 6
    invoke-interface {v3}, Lcom/beizi/ad/internal/view/e;->c()Lcom/beizi/ad/internal/a/b;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 7
    invoke-interface {v3}, Lcom/beizi/ad/internal/view/e;->c()Lcom/beizi/ad/internal/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/a/b;->c()V

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    return v0

    :cond_0
    if-eqz v2, :cond_1

    .line 10
    iget-boolean v2, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->m:Z

    if-nez v2, :cond_1

    .line 11
    invoke-static {}, Lcom/beizi/ad/AdActivity;->a()Ljava/lang/Class;

    move-result-object v2

    .line 12
    new-instance v3, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "ACTIVITY_TYPE"

    const-string v5, "INTERSTITIAL"

    .line 13
    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "TIME"

    .line 14
    invoke-virtual {v3, v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 15
    iget v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->p:I

    const-string v1, "CLOSE_BUTTON_DELAY"

    invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 16
    sput-object p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    .line 17
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 18
    sput-object v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    .line 19
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->adactivity_missing:I

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    :goto_0
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0

    .line 21
    :cond_1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->empty_queue:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object v0, p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    return v0
.end method

.method public showInterstitial(Landroid/content/Context;)V
    .locals 2

    const-string v0, "BeiZisAd"

    const-string v1, "showInterstitial"

    .line 1
    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sput-object p0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->INTERSTITIALADVIEW_TO_USE:Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    .line 3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
