.class Lcom/beizi/fusion/work/interstitial/d$a;
.super Ljava/lang/Object;
.source "GdtNativeInterstitialWorker.java"

# interfaces
.implements Lcom/qq/e/ads/nativ/NativeADUnifiedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/interstitial/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/interstitial/d;


# direct methods
.method private constructor <init>(Lcom/beizi/fusion/work/interstitial/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/work/interstitial/d;Lcom/beizi/fusion/work/interstitial/d$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/fusion/work/interstitial/d$a;-><init>(Lcom/beizi/fusion/work/interstitial/d;)V

    return-void
.end method


# virtual methods
.method public onADLoaded(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qq/e/ads/nativ/NativeUnifiedADData;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;)V

    const/16 v0, -0x3df

    if-eqz p1, :cond_6

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    invoke-static {v1, p1}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;Lcom/qq/e/ads/nativ/NativeUnifiedADData;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object p1

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/interstitial/d;->c(Lcom/beizi/fusion/work/interstitial/d;I)V

    return-void

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object p1

    invoke-interface {p1}, Lcom/qq/e/comm/pi/LADI;->getECPM()I

    move-result p1

    if-lez p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v0

    invoke-interface {v0}, Lcom/qq/e/comm/pi/LADI;->getECPM()I

    move-result v0

    int-to-double v0, v0

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;D)V

    .line 9
    :cond_2
    sget-boolean p1, Lcom/beizi/fusion/g/v;->a:Z

    if-eqz p1, :cond_3

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object p1

    sget-object v0, Lcom/beizi/fusion/g/v;->b:Lcom/qq/e/comm/compliance/DownloadConfirmListener;

    invoke-interface {p1, v0}, Lcom/qq/e/comm/compliance/ApkDownloadComplianceInterface;->setDownloadConfirmListener(Lcom/qq/e/comm/compliance/DownloadConfirmListener;)V

    .line 11
    :cond_3
    new-instance v6, Lcom/beizi/fusion/work/interstitial/d$a$1;

    invoke-direct {v6, p0}, Lcom/beizi/fusion/work/interstitial/d$a$1;-><init>(Lcom/beizi/fusion/work/interstitial/d$a;)V

    .line 12
    new-instance v7, Lcom/beizi/fusion/work/interstitial/d$a$2;

    invoke-direct {v7, p0}, Lcom/beizi/fusion/work/interstitial/d$a$2;-><init>(Lcom/beizi/fusion/work/interstitial/d$a;)V

    .line 13
    new-instance v8, Lcom/beizi/fusion/work/interstitial/d$a$3;

    invoke-direct {v8, p0}, Lcom/beizi/fusion/work/interstitial/d$a$3;-><init>(Lcom/beizi/fusion/work/interstitial/d$a;)V

    .line 14
    new-instance p1, Lcom/beizi/fusion/work/interstitial/GdtNativeInterstitialCustomLayout;

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->u(Lcom/beizi/fusion/work/interstitial/d;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/beizi/fusion/work/interstitial/GdtNativeInterstitialCustomLayout;-><init>(Landroid/content/Context;)V

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/work/interstitial/GdtNativeInterstitialCustomLayout;->setViewInteractionListener(Lcom/beizi/fusion/work/interstitial/GdtNativeInterstitialCustomLayout$a;)V

    .line 16
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v2

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->v(Lcom/beizi/fusion/work/interstitial/d;)F

    move-result v3

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->w(Lcom/beizi/fusion/work/interstitial/d;)F

    move-result v4

    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/interstitial/d;->x(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v5

    move-object v1, p1

    invoke-virtual/range {v1 .. v8}, Lcom/beizi/fusion/work/interstitial/GdtNativeInterstitialCustomLayout;->onBindData(Lcom/qq/e/ads/nativ/NativeUnifiedADData;FFLcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;Lcom/qq/e/ads/nativ/NativeADEventListener;Lcom/qq/e/ads/nativ/NativeADMediaListener;Landroid/view/View$OnClickListener;)Z

    move-result v0

    .line 17
    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;)Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    move-result-object v1

    invoke-interface {v1}, Lcom/qq/e/ads/nativ/NativeUnifiedADData;->getAdPatternType()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_4

    .line 18
    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/interstitial/d;->x(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/interstitial/d;->x(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getVideoSkipTime()I

    move-result v1

    if-lez v1, :cond_4

    .line 19
    iget-object v1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v1}, Lcom/beizi/fusion/work/interstitial/d;->x(Lcom/beizi/fusion/work/interstitial/d;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getVideoSkipTime()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;J)J

    :cond_4
    if-eqz v0, :cond_5

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;Landroid/widget/FrameLayout;)Landroid/widget/FrameLayout;

    .line 21
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/interstitial/d;->y(Lcom/beizi/fusion/work/interstitial/d;)V

    goto :goto_0

    .line 22
    :cond_5
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/interstitial/d;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sdk custom error "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "create view error"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x279c

    .line 24
    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/interstitial/d;->d(Lcom/beizi/fusion/work/interstitial/d;Ljava/lang/String;I)V

    :goto_0
    return-void

    .line 25
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/interstitial/d;->b(Lcom/beizi/fusion/work/interstitial/d;I)V

    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowGdtInterstitialCustom onNoAD: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/interstitial/d$a;->a:Lcom/beizi/fusion/work/interstitial/d;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/interstitial/d;->a(Lcom/beizi/fusion/work/interstitial/d;Ljava/lang/String;I)V

    return-void
.end method
