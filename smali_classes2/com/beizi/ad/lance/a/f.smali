.class public Lcom/beizi/ad/lance/a/f;
.super Ljava/lang/Object;
.source "CheckViewVisibilityUtil.java"


# instance fields
.field private a:Landroid/view/View;

.field private b:Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

.field private c:Lcom/beizi/ad/internal/nativead/d;

.field private d:Ljava/util/concurrent/ScheduledExecutorService;

.field private e:Ljava/lang/Runnable;

.field private f:Ljava/text/DecimalFormatSymbols;

.field private g:Ljava/text/Format;

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;Lcom/beizi/ad/internal/nativead/d;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/text/DecimalFormatSymbols;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/beizi/ad/lance/a/f;->f:Ljava/text/DecimalFormatSymbols;

    .line 3
    new-instance v0, Ljava/text/DecimalFormat;

    iget-object v1, p0, Lcom/beizi/ad/lance/a/f;->f:Ljava/text/DecimalFormatSymbols;

    const-string v2, "0.00"

    invoke-direct {v0, v2, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    iput-object v0, p0, Lcom/beizi/ad/lance/a/f;->g:Ljava/text/Format;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/lance/a/f;->h:Z

    .line 5
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    .line 6
    iput-object p2, p0, Lcom/beizi/ad/lance/a/f;->b:Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

    .line 7
    iput-object p3, p0, Lcom/beizi/ad/lance/a/f;->c:Lcom/beizi/ad/internal/nativead/d;

    .line 8
    invoke-direct {p0}, Lcom/beizi/ad/lance/a/f;->a()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;)Lcom/beizi/ad/internal/nativead/NativeAdShownListener;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f;->b:Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;Lcom/beizi/ad/internal/nativead/d;)Lcom/beizi/ad/internal/nativead/d;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f;->c:Lcom/beizi/ad/internal/nativead/d;

    return-object p1
.end method

.method public static a(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;Lcom/beizi/ad/internal/nativead/d;)Lcom/beizi/ad/lance/a/f;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lcom/beizi/ad/lance/a/f;

    invoke-direct {v0, p0, p1, p2}, Lcom/beizi/ad/lance/a/f;-><init>(Landroid/view/View;Lcom/beizi/ad/internal/nativead/NativeAdShownListener;Lcom/beizi/ad/internal/nativead/d;)V

    return-object v0
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/beizi/ad/lance/a/f;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p1
.end method

.method private a()V
    .locals 8

    .line 9
    new-instance v0, Lcom/beizi/ad/lance/a/f$1;

    invoke-direct {v0, p0}, Lcom/beizi/ad/lance/a/f$1;-><init>(Lcom/beizi/ad/lance/a/f;)V

    iput-object v0, p0, Lcom/beizi/ad/lance/a/f;->e:Ljava/lang/Runnable;

    .line 10
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/ad/lance/a/f;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    new-instance v2, Lcom/beizi/ad/lance/a/f$2;

    invoke-direct {v2, p0}, Lcom/beizi/ad/lance/a/f$2;-><init>(Lcom/beizi/ad/lance/a/f;)V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0xfa

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method private a(I)Z
    .locals 4

    const/4 v0, 0x0

    .line 12
    :try_start_0
    iget-object v1, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 14
    iget-object v2, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    .line 15
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    mul-int v2, v2, v1

    .line 16
    iget-object v1, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v3, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    mul-int v1, v1, v3

    if-lez v1, :cond_2

    mul-int/lit8 v2, v2, 0x64

    mul-int p1, p1, v1

    if-lt v2, p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;)Z
    .locals 0

    .line 5
    iget-boolean p0, p0, Lcom/beizi/ad/lance/a/f;->h:Z

    return p0
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;I)Z
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/beizi/ad/lance/a/f;->a(I)Z

    move-result p0

    return p0
.end method

.method static synthetic a(Lcom/beizi/ad/lance/a/f;Z)Z
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/beizi/ad/lance/a/f;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/beizi/ad/lance/a/f;)Lcom/beizi/ad/internal/nativead/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/lance/a/f;->c:Lcom/beizi/ad/internal/nativead/d;

    return-object p0
.end method

.method static synthetic c(Lcom/beizi/ad/lance/a/f;)Lcom/beizi/ad/internal/nativead/NativeAdShownListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/lance/a/f;->b:Lcom/beizi/ad/internal/nativead/NativeAdShownListener;

    return-object p0
.end method

.method static synthetic d(Lcom/beizi/ad/lance/a/f;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/lance/a/f;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method static synthetic e(Lcom/beizi/ad/lance/a/f;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/lance/a/f;->a:Landroid/view/View;

    return-object p0
.end method

.method static synthetic f(Lcom/beizi/ad/lance/a/f;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/lance/a/f;->e:Ljava/lang/Runnable;

    return-object p0
.end method
