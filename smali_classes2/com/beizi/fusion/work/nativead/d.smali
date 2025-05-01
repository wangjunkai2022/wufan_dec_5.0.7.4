.class public Lcom/beizi/fusion/work/nativead/d;
.super Lcom/beizi/fusion/work/nativead/b;
.source "BeiZiNativeTPBTWorker.java"


# instance fields
.field private R:Landroid/widget/LinearLayout;

.field private S:Landroid/widget/LinearLayout;

.field private T:Landroid/widget/FrameLayout;

.field private U:Lcom/beizi/fusion/widget/CustomRoundImageView;

.field private V:Landroid/widget/TextView;

.field private W:Landroid/widget/TextView;

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/beizi/fusion/work/nativead/b;-><init>(Landroid/content/Context;Ljava/lang/String;JJLcom/beizi/fusion/model/AdSpacesBean$BuyerBean;Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;Lcom/beizi/fusion/d/e;FF)V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/b/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->b:Lcom/beizi/fusion/b/b;

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/fusion/work/nativead/d;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method private aN()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->N:Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$ComplainBean;->getOpen()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    return-void

    .line 3
    :cond_1
    new-instance v0, Lcom/beizi/fusion/g/p;

    invoke-direct {v0}, Lcom/beizi/fusion/g/p;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->t:Landroid/view/ViewGroup;

    const-string v3, "2"

    invoke-virtual {v0, v1, v2, v3}, Lcom/beizi/fusion/g/p;->a(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 5
    new-instance v1, Lcom/beizi/fusion/work/nativead/d$1;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/nativead/d$1;-><init>(Lcom/beizi/fusion/work/nativead/d;)V

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/g/p;->a(Lcom/beizi/fusion/g/p$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private aO()V
    .locals 6

    const-string v0, "#000000"

    .line 1
    :try_start_0
    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v2, 0x11

    .line 3
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const-string v3, "#FFFFFF"

    .line 4
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 5
    new-instance v3, Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 6
    sget v4, Lcom/beizi/fusion/R$drawable;->beizi_icon_checkbox:I

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 8
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 9
    new-instance v3, Landroid/widget/TextView;

    iget-object v4, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v4, "\u6295\u8bc9\u6210\u529f\uff0c\u6211\u4eec\u5c06\u91cd\u89c6\u60a8\u7684\u53cd\u9988\u3002"

    .line 10
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v0, 0x2

    const/high16 v4, 0x41500000    # 13.0f

    .line 12
    invoke-virtual {v3, v0, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 13
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 14
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v4, 0x1e

    const/4 v5, 0x0

    .line 15
    invoke-virtual {v0, v5, v4, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 16
    invoke-virtual {v1, v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    invoke-virtual {v0, v5, v5}, Landroid/view/View;->measure(II)V

    .line 18
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    iget-object v4, p0, Lcom/beizi/fusion/work/nativead/b;->u:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-direct {v0, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 19
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 20
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->t:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
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

.method private aP()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

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
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->getDownloadTextView(Landroid/content/Context;Lcom/beizi/ad/NativeAdResponse;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    .line 4
    :cond_2
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->T:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Landroid/widget/FrameLayout;->measure(II)V

    .line 5
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->T:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    div-int/lit8 v1, v1, 0x3

    .line 6
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x53

    .line 7
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 8
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->T:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private aQ()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/ImageManager;->with(Landroid/content/Context;)Lcom/beizi/ad/internal/utilities/ImageManager;

    move-result-object v1

    new-instance v2, Lcom/beizi/fusion/work/nativead/d$2;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/work/nativead/d$2;-><init>(Lcom/beizi/fusion/work/nativead/d;)V

    invoke-virtual {v1, v0, v2}, Lcom/beizi/ad/internal/utilities/ImageManager;->getBitmap(Ljava/lang/String;Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private aR()V
    .locals 7

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x11

    const/4 v3, -0x2

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getlogoUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v1

    .line 5
    iget-object v4, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

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
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v1}, Lcom/beizi/ad/NativeAdResponse;->getAdUrl()Lcom/beizi/ad/internal/network/ServerResponse$AdLogoInfo;

    move-result-object v1

    .line 9
    iget-object v5, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

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
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->t:Landroid/view/ViewGroup;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v5, 0x35

    invoke-direct {v2, v3, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 18
    invoke-virtual {p0}, Lcom/beizi/fusion/work/nativead/b;->aJ()Z

    move-result v2

    const/high16 v3, 0x41800000    # 16.0f

    if-eqz v2, :cond_1

    .line 19
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v5, 0x42200000    # 40.0f

    .line 20
    invoke-static {v3, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    .line 21
    invoke-virtual {v1, v4, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 22
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    iget-object v5, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    .line 23
    invoke-static {v5, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    .line 24
    invoke-virtual {v1, v4, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->au()V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/work/nativead/d;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/beizi/fusion/work/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic c(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->I()V

    return-void
.end method

.method static synthetic d(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/nativead/d;->aO()V

    return-void
.end method

.method static synthetic e(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic f(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic g(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/d/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    return-object p0
.end method

.method static synthetic h(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/beizi/fusion/work/a;->G()V

    return-void
.end method

.method static synthetic i(Lcom/beizi/fusion/work/nativead/d;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/nativead/d;->S:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/work/nativead/d;->U:Lcom/beizi/fusion/widget/CustomRoundImageView;

    return-object p0
.end method

.method static synthetic k(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/nativead/d;->aN()V

    return-void
.end method

.method static synthetic l(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/nativead/d;->aP()V

    return-void
.end method

.method static synthetic m(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/work/nativead/d;->aR()V

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/ad/NativeAdResponse;)V
    .locals 6

    .line 3
    :try_start_0
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v2, 0x41c00000    # 24.0f

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    add-int/lit8 v1, v1, 0x2a

    .line 5
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 6
    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v4, 0x41800000    # 16.0f

    invoke-static {v3, v4}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v3

    .line 7
    iget-object v4, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v5, 0x41000000    # 8.0f

    invoke-static {v4, v5}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v4

    .line 8
    invoke-virtual {v0, v4, v3, v3, v4}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 9
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    sget-object v2, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    sget v2, Lcom/beizi/fusion/R$drawable;->beizi_close_two:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 13
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x5

    .line 14
    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 15
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->t:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    new-instance v1, Lcom/beizi/fusion/work/nativead/d$3;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/work/nativead/d$3;-><init>(Lcom/beizi/fusion/work/nativead/d;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 17
    new-instance v1, Lcom/beizi/fusion/work/nativead/d$4;

    invoke-direct {v1, p0, p1}, Lcom/beizi/fusion/work/nativead/d$4;-><init>(Lcom/beizi/fusion/work/nativead/d;Lcom/beizi/ad/NativeAdResponse;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    if-nez v0, :cond_0

    const/16 v0, -0x3df

    .line 4
    invoke-virtual {p0, v0}, Lcom/beizi/fusion/work/a;->c(I)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    .line 6
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/beizi/fusion/R$layout;->beizi_layout_native_top_picture_bottom_text_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    .line 7
    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_container_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->R:Landroid/widget/LinearLayout;

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_img_container_fl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->T:Landroid/widget/FrameLayout;

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_image_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/beizi/fusion/widget/CustomRoundImageView;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->U:Lcom/beizi/fusion/widget/CustomRoundImageView;

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_content_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->S:Landroid/widget/LinearLayout;

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_title_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->V:Landroid/widget/TextView;

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_subtitle_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->W:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_go_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->X:Landroid/widget/TextView;

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->M:Landroid/view/View;

    sget v1, Lcom/beizi/fusion/R$id;->native_ad_tpbt_go_iv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->Y:Landroid/widget/ImageView;

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget v1, p0, Lcom/beizi/fusion/work/nativead/b;->r:F

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, -0x2

    .line 16
    iget v2, p0, Lcom/beizi/fusion/work/nativead/b;->s:F

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-lez v3, :cond_1

    .line 17
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    .line 18
    :cond_1
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 19
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v0

    .line 20
    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/d;->R:Landroid/widget/LinearLayout;

    if-eqz v3, :cond_2

    .line 21
    invoke-virtual {v3, v0, v0, v0, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->R:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->S:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    .line 24
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    .line 25
    invoke-static {v3, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v3, v2, v3, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 27
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getHeadline()Ljava/lang/String;

    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->V:Landroid/widget/TextView;

    if-eqz v1, :cond_4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 29
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->V:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b;->K:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0}, Lcom/beizi/ad/NativeAdResponse;->getBody()Ljava/lang/String;

    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->W:Landroid/widget/TextView;

    if-eqz v1, :cond_5

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 32
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->W:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_6

    .line 34
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->X:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 35
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    sget v2, Lcom/beizi/fusion/R$drawable;->beizi_bg_operate_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 36
    :cond_6
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->Y:Landroid/widget/ImageView;

    if-eqz v0, :cond_7

    .line 37
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v2, 0x427c0000    # 63.0f

    .line 38
    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v3, 0x41c00000    # 24.0f

    .line 39
    invoke-static {v2, v3}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 40
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->Y:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->Y:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 42
    :cond_7
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d;->X:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d;->Y:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, v1}, Lcom/beizi/fusion/work/nativead/b;->a(Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 43
    invoke-direct {p0}, Lcom/beizi/fusion/work/nativead/d;->aQ()V

    .line 44
    invoke-virtual {p0}, Lcom/beizi/fusion/work/nativead/b;->aH()V

    .line 45
    invoke-virtual {p0}, Lcom/beizi/fusion/work/nativead/b;->aI()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
