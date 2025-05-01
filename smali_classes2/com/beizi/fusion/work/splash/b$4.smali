.class Lcom/beizi/fusion/work/splash/b$4;
.super Ljava/lang/Object;
.source "BeiZiSplashWorker.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/b;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/splash/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Z)V
    .locals 1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object p1

    new-instance v0, Lcom/beizi/fusion/work/splash/b$4$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/work/splash/b$4$1;-><init>(Lcom/beizi/fusion/work/splash/b$4;)V

    invoke-virtual {p1, v0}, Lcom/beizi/ad/SplashAd;->disableFullClick(Landroid/view/View$OnTouchListener;)V

    :cond_0
    return-void
.end method

.method public onGlobalLayout()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->P(Lcom/beizi/fusion/work/splash/b;)Landroid/view/ViewGroup;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->P(Lcom/beizi/fusion/work/splash/b;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->Q(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/splash/b;->q:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    if-eqz v1, :cond_4

    .line 5
    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->R(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->S(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    iget-object v1, v1, Lcom/beizi/fusion/work/splash/b;->q:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;->getFullScreenClickUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->I(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->T(Lcom/beizi/fusion/work/splash/b;)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/splash/b;->q:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    .line 9
    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;->getOrderData()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/ad/SplashAd;->getAdId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "BeiZis"

    if-eqz v0, :cond_3

    .line 10
    :try_start_1
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean;->getFullScreenClick()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 11
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$OrderDataFullScreenClickBean;->getFullScreenClick()Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;->getRandomClickNum()I

    move-result v0

    invoke-static {v0}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/b$4;->b:Z

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "beizi clickable = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/beizi/fusion/work/splash/b$4;->b:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/b$4;->b:Z

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/work/splash/b$4;->a(Z)V

    goto :goto_0

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    iget-object v0, v0, Lcom/beizi/fusion/work/splash/b;->q:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$FullScreenClickBean;->getRandomClickNum()I

    move-result v0

    invoke-static {v0}, Lcom/beizi/fusion/g/al;->a(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/beizi/fusion/work/splash/b$4;->a:Z

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "beizi clickable Two = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/beizi/fusion/work/splash/b$4;->a:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/b$4;->a:Z

    invoke-virtual {p0, v0}, Lcom/beizi/fusion/work/splash/b$4;->a(Z)V

    .line 17
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->U(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getInteractionRules()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->V(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getInteractionRules()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_b

    const/16 v0, 0x64

    .line 18
    invoke-static {v0}, Lcom/beizi/fusion/g/al;->b(I)I

    move-result v0

    .line 19
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/b;->W(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getInteractionRules()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/beizi/fusion/f/b;->a(Ljava/util/List;I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "shake"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    goto :goto_1

    :sswitch_1
    const-string v2, "roll"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x3

    goto :goto_1

    :sswitch_2
    const-string v2, "regional"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :sswitch_3
    const-string v2, "scroll"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x2

    goto :goto_1

    :sswitch_4
    const-string v2, "eulerAngle"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x4

    :cond_5
    :goto_1
    if-eqz v1, :cond_a

    if-eq v1, v6, :cond_9

    if-eq v1, v5, :cond_8

    if-eq v1, v4, :cond_7

    if-eq v1, v3, :cond_6

    goto :goto_2

    .line 20
    :cond_6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->ab(Lcom/beizi/fusion/work/splash/b;)V

    goto :goto_2

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->aa(Lcom/beizi/fusion/work/splash/b;)V

    goto :goto_2

    .line 22
    :cond_8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->Z(Lcom/beizi/fusion/work/splash/b;)V

    goto :goto_2

    .line 23
    :cond_9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->Y(Lcom/beizi/fusion/work/splash/b;)V

    goto :goto_2

    .line 24
    :cond_a
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->X(Lcom/beizi/fusion/work/splash/b;)V

    goto :goto_2

    .line 25
    :cond_b
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->X(Lcom/beizi/fusion/work/splash/b;)V

    .line 26
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->Y(Lcom/beizi/fusion/work/splash/b;)V

    .line 27
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->Z(Lcom/beizi/fusion/work/splash/b;)V

    .line 28
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->aa(Lcom/beizi/fusion/work/splash/b;)V

    .line 29
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$4;->c:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->ab(Lcom/beizi/fusion/work/splash/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x639b5516 -> :sswitch_4
        -0x361a1933 -> :sswitch_3
        -0x2925b9e1 -> :sswitch_2
        0x35807d -> :sswitch_1
        0x6854f06 -> :sswitch_0
    .end sparse-switch
.end method
