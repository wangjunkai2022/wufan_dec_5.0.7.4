.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/d;
.source "SourceFile"


# static fields
.field protected static r:Ljava/lang/String; = "AMUTAGBD"

.field private static final s:Ljava/lang/Object;

.field private static final t:Ljava/lang/Object;


# instance fields
.field public n:Lcom/baidu/mobads/sdk/api/NativeResponse;

.field public o:Ljava/lang/ref/WeakReference;

.field public p:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/baidu/mobads/sdk/api/XNativeView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->s:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->t:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/baidu/mobads/sdk/api/NativeResponse;Lcom/baidu/mobads/sdk/api/BaiduNativeManager;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/mobads/sdk/api/NativeResponse;",
            "Lcom/baidu/mobads/sdk/api/BaiduNativeManager;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p3, p4, p5}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/d;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    iget-object p2, p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->t:Lcom/aggmoread/sdk/z/c/a/a/d/a/c;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/d;->l:Ljava/util/Map;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p2, p1, p4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->b(Ljava/util/Map;ILcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;I)I
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->c(I)I

    move-result p0

    return p0
.end method

.method private a(Lcom/baidu/mobads/sdk/api/NativeResponse;)I
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$d;->a:[I

    invoke-interface {p1}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getMaterialType()Lcom/baidu/mobads/sdk/api/NativeResponse$MaterialType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mobads/sdk/api/NativeResponse$MaterialType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getMultiPicUrls()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    return v2

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x5

    return p1

    :cond_3
    const/4 p1, 0x2

    return p1
.end method

.method private a(Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;
    .locals 11

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    instance-of v5, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v5, "A "

    invoke-static {v0, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->s:Ljava/lang/Object;

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    :goto_0
    move-object v7, v5

    move-object v5, v6

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/view/ViewGroup;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "P ="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v7, v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    if-eqz v7, :cond_2

    move-object v0, v5

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    instance-of v5, p1, Landroid/view/ViewGroup;

    if-eqz v5, :cond_1

    move-object v5, p1

    check-cast v5, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_1
    move-object v5, v6

    goto :goto_0

    :cond_2
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    instance-of v7, v7, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    if-eqz v7, :cond_4

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v7, "PA"

    invoke-static {v0, v7}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    goto :goto_0

    :cond_3
    move-object v5, v6

    :cond_4
    move-object v7, v6

    :goto_1
    if-nez v5, :cond_5

    if-eqz v7, :cond_6

    const/4 p1, 0x0

    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    sget-object v8, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "F A "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    goto :goto_2

    :cond_5
    invoke-virtual {v5, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_6
    :goto_2
    invoke-virtual {p3, p1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v7, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->s:Ljava/lang/Object;

    invoke-virtual {p3, v7}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0, p3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->p:Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_9

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;-><init>(Landroid/content/Context;)V

    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p3, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    move-object v6, p3

    check-cast v6, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {v6, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_7
    invoke-virtual {p1, p2, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v6, :cond_8

    invoke-virtual {v6, p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->k:Ljava/lang/ref/WeakReference;

    goto :goto_3

    :cond_9
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->k:Ljava/lang/ref/WeakReference;

    :goto_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Landroid/view/View;[Ljava/lang/Object;)V

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/b;

    invoke-direct {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/b;-><init>()V

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    if-eqz v5, :cond_a

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string p2, "p add "

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    return-object v0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/d;->a(Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    return-void
.end method

.method private a(Lcom/baidu/mobads/sdk/api/XNativeView;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
    .locals 1

    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->q:Ljava/lang/ref/WeakReference;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->s:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->d()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->setVideoMute(Z)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-virtual {p1, v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->setNativeItem(Lcom/baidu/mobads/sdk/api/NativeResponse;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$b;

    invoke-direct {v0, p0, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V

    invoke-virtual {p1, v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->setNativeViewClickListener(Lcom/baidu/mobads/sdk/api/XNativeView$INativeViewClickListener;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;

    invoke-direct {v0, p0, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V

    invoke-virtual {p1, v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->setNativeVideoListener(Lcom/baidu/mobads/sdk/api/INativeVideoListener;)V

    invoke-virtual {p1}, Lcom/baidu/mobads/sdk/api/XNativeView;->render()V

    :cond_1
    return-void
.end method

.method private c(I)I
    .locals 1

    if-lez p1, :cond_0

    const/16 v0, 0x64

    if-gt p1, v0, :cond_0

    const/4 p1, 0x4

    return p1

    :cond_0
    const/16 v0, 0x65

    if-ne p1, v0, :cond_1

    const/16 p1, 0x8

    return p1

    :cond_1
    const/16 v0, 0x66

    if-ne p1, v0, :cond_2

    const/16 p1, 0x20

    return p1

    :cond_2
    const/16 v0, 0x67

    if-ne p1, v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    const/16 v0, 0x68

    if-ne p1, v0, :cond_4

    const/16 p1, 0x10

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private e()Lcom/aggmoread/sdk/z/c/a/a/c/c;
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getBrandName()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getPublisher()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAppSize()J

    move-result-wide v3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAppPermissionLink()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAppPrivacyLink()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAppVersion()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v1 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v1}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAppPackage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->c(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v1}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAppFunctionLink()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/c;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private i()Lcom/baidu/mobads/sdk/api/XNativeView;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->q:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mobads/sdk/api/XNativeView;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "enter"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p4, :cond_0

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    move-object v4, p4

    if-eqz p6, :cond_1

    move-object p4, p6

    goto :goto_0

    :cond_1
    move-object p4, p2

    :goto_0
    invoke-interface {v4, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "ovov + true"

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "ovov + false"

    :goto_1
    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "ovov "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iput-object p7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->c:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    new-instance v2, Lcom/qq/e/ads/nativ/widget/NativeAdContainer;

    invoke-direct {v2, p1}, Lcom/qq/e/ads/nativ/widget/NativeAdContainer;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p2, p6, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;)Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;

    move-result-object p2

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->k:Ljava/lang/ref/WeakReference;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v6, p7

    invoke-virtual/range {v0 .. v6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    const/4 p1, 0x0

    if-eqz p5, :cond_4

    const/4 p3, 0x1

    new-array p3, p3, [Landroid/view/View;

    aput-object p5, p3, p1

    goto :goto_2

    :cond_4
    new-array p3, p1, [Landroid/view/View;

    :goto_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/view/View;[Landroid/view/View;)V

    return-object p2
.end method

.method public a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/View;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            "Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Landroid/view/View;Landroid/view/View;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method protected a(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/widget/FrameLayout$LayoutParams;Ljava/util/List;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;",
            ">;",
            "Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;

    invoke-direct {v0, p0, p5, p6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;Ljava/lang/ref/WeakReference;Lcom/aggmoread/sdk/z/c/a/a/c/o/e$a;)V

    invoke-interface {p3, p2, p4, p1, v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->registerViewForInteraction(Landroid/view/View;Ljava/util/List;Ljava/util/List;Lcom/baidu/mobads/sdk/api/NativeResponse$AdInteractionListener;)V

    :cond_0
    return-void
.end method

.method protected a(Landroid/view/View;[Landroid/view/View;)V
    .locals 8

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/c/i;->g:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    iget-object v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->p:Ljava/lang/ref/WeakReference;

    iget-object v7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->o:Ljava/lang/ref/WeakReference;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/c/i;Landroid/view/View;[Landroid/view/View;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->e()Z

    move-result p2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b()Z

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->b(Ljava/lang/Object;ZZ)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->r:Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b()[B

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-static {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;[B)V

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->j:[Ljava/lang/Object;

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/a;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method

.method public a(Landroid/view/ViewGroup;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->r:Ljava/lang/String;

    const-string v1, "ENTER"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->t:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/baidu/mobads/sdk/api/XNativeView;

    if-nez v1, :cond_0

    new-instance v1, Lcom/baidu/mobads/sdk/api/XNativeView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/baidu/mobads/sdk/api/XNativeView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->setTag(Ljava/lang/Object;)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    invoke-direct {p0, v1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Lcom/baidu/mobads/sdk/api/XNativeView;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V

    :cond_1
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/a/c;)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "win "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public b(IILjava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    const-string p2, "203"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getDuration()I

    move-result v0

    return v0
.end method

.method public g()Lcom/aggmoread/sdk/z/c/a/a/c/c;
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->e()Lcom/aggmoread/sdk/z/c/a/a/c/c;

    move-result-object v0

    return-object v0
.end method

.method public getAdPatternType()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->a(Lcom/baidu/mobads/sdk/api/NativeResponse;)I

    move-result v0

    return v0
.end method

.method public getAppStatus()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getDownloadStatus()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->c(I)I

    move-result v0

    return v0
.end method

.method public getDesc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getDesc()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->getImageUrlList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method public getImageUrlList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getMultiPicUrls()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPictureHeight()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getMainPicHeight()I

    move-result v0

    return v0
.end method

.method public getPictureWidth()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getMainPicWidth()I

    move-result v0

    return v0
.end method

.method public getProgress()I
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getDownloadStatus()I

    move-result v0

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAppAd()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getAdActionType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isVideoAd()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->n:Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-interface {v0}, Lcom/baidu/mobads/sdk/api/NativeResponse;->getMaterialType()Lcom/baidu/mobads/sdk/api/NativeResponse$MaterialType;

    move-result-object v0

    sget-object v1, Lcom/baidu/mobads/sdk/api/NativeResponse$MaterialType;->VIDEO:Lcom/baidu/mobads/sdk/api/NativeResponse$MaterialType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public pauseVideo()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->i()Lcom/baidu/mobads/sdk/api/XNativeView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->pause()V

    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->i()Lcom/baidu/mobads/sdk/api/XNativeView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->resume()V

    :cond_0
    return-void
.end method

.method public resumeVideo()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->i()Lcom/baidu/mobads/sdk/api/XNativeView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->resume()V

    :cond_0
    return-void
.end method

.method public setVideoMute(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->i()Lcom/baidu/mobads/sdk/api/XNativeView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mobads/sdk/api/XNativeView;->setVideoMute(Z)V

    :cond_0
    return-void
.end method

.method public startVideo()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->i()Lcom/baidu/mobads/sdk/api/XNativeView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->render()V

    :cond_0
    return-void
.end method

.method public stopVideo()V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;->i()Lcom/baidu/mobads/sdk/api/XNativeView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/XNativeView;->stop()V

    :cond_0
    return-void
.end method
