.class public Lcom/beizi/ad/internal/g;
.super Ljava/lang/Object;
.source "BeiZiImpl.java"


# static fields
.field private static G:Z = false

.field private static H:Z = false

.field public static f:Ljava/lang/String; = null

.field public static g:Ljava/lang/String; = ""

.field public static h:Ljava/lang/String; = ""

.field private static l:Ljava/lang/String; = "USED_AD_UNIT_IDS_KEY"

.field private static m:Lcom/beizi/ad/internal/g; = null

.field private static n:Ljava/lang/String; = "BeiZiImpl"

.field private static p:Ljava/lang/String;


# instance fields
.field private A:Z

.field private B:Lcom/beizi/ad/RewardedVideoAd;

.field private C:Landroid/util/DisplayMetrics;

.field private D:Z

.field private E:Z

.field private F:Lcom/beizi/ad/internal/b/f;

.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public i:Landroid/content/Context;

.field public j:F

.field public k:F

.field private o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

.field private q:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private r:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private t:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private w:Landroid/os/Handler;

.field private x:Landroid/os/Handler;

.field private y:Landroid/os/HandlerThread;

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/ad/internal/g;->a:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/beizi/ad/internal/g;->b:Ljava/lang/String;

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/g;->c:Z

    const-string v2, ""

    .line 5
    iput-object v2, p0, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    .line 6
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->e:Ljava/util/HashMap;

    .line 7
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->q:Ljava/util/HashSet;

    .line 8
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->r:Ljava/util/HashSet;

    .line 9
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->s:Ljava/util/HashSet;

    .line 10
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->t:Ljava/util/HashSet;

    .line 11
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->u:Ljava/util/HashSet;

    .line 12
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->v:Ljava/util/HashSet;

    .line 13
    new-instance v2, Lcom/beizi/ad/internal/g$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/beizi/ad/internal/g$1;-><init>(Lcom/beizi/ad/internal/g;Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/beizi/ad/internal/g;->w:Landroid/os/Handler;

    .line 14
    iput-object v1, p0, Lcom/beizi/ad/internal/g;->x:Landroid/os/Handler;

    .line 15
    iput-object v1, p0, Lcom/beizi/ad/internal/g;->y:Landroid/os/HandlerThread;

    .line 16
    iput-boolean v0, p0, Lcom/beizi/ad/internal/g;->D:Z

    .line 17
    iput-boolean v0, p0, Lcom/beizi/ad/internal/g;->E:Z

    return-void
.end method

.method public static a()Lcom/beizi/ad/internal/g;
    .locals 2

    .line 3
    const-class v0, Lcom/beizi/ad/internal/g;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/beizi/ad/internal/g;->m:Lcom/beizi/ad/internal/g;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/beizi/ad/internal/g;

    invoke-direct {v1}, Lcom/beizi/ad/internal/g;-><init>()V

    sput-object v1, Lcom/beizi/ad/internal/g;->m:Lcom/beizi/ad/internal/g;

    .line 6
    :cond_0
    sget-object v1, Lcom/beizi/ad/internal/g;->m:Lcom/beizi/ad/internal/g;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private o()Lcom/beizi/ad/internal/b/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Lcom/beizi/ad/internal/b/f$a;

    invoke-direct {v1, v0}, Lcom/beizi/ad/internal/b/f$a;-><init>(Landroid/content/Context;)V

    const-wide/32 v2, 0x3200000

    invoke-virtual {v1, v2, v3}, Lcom/beizi/ad/internal/b/f$a;->a(J)Lcom/beizi/ad/internal/b/f$a;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/internal/b/f$a;->a()Lcom/beizi/ad/internal/b/f;

    move-result-object v0

    return-object v0
.end method

.method private p()V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    :try_start_0
    const-class v2, Landroid/content/pm/PackageParser$Package;

    new-array v3, v1, [Ljava/lang/Class;

    .line 2
    const-class v4, Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    .line 3
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 4
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :catch_0
    move-exception v2

    .line 5
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    :try_start_1
    const-string v2, "android.app.ActivityThread"

    .line 6
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "currentActivityThread"

    new-array v4, v0, [Ljava/lang/Class;

    .line 7
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 8
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    const/4 v4, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    invoke-virtual {v3, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "mHiddenApiWarningShown"

    .line 10
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 12
    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lcom/beizi/ad/RewardedVideoAd;
    .locals 2

    .line 43
    const-class v0, Lcom/beizi/ad/internal/g;

    monitor-enter v0

    .line 44
    :try_start_0
    new-instance v1, Lcom/beizi/ad/internal/n;

    invoke-direct {v1, p1}, Lcom/beizi/ad/internal/n;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/ad/internal/g;->B:Lcom/beizi/ad/RewardedVideoAd;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 45
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;)Lcom/beizi/ad/internal/g;
    .locals 0

    .line 1
    sput-object p1, Lcom/beizi/ad/internal/g;->p:Ljava/lang/String;

    .line 2
    sget-object p1, Lcom/beizi/ad/internal/g;->m:Lcom/beizi/ad/internal/g;

    return-object p1
.end method

.method public a(F)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The app volume must be a value between 0 and 1 inclusive."

    .line 46
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/p;->a(ZLjava/lang/Object;)V

    .line 47
    sget-object v0, Lcom/beizi/ad/internal/g;->f:Ljava/lang/String;

    const-string v1, "BeiZi.initialize() must be called prior to setting the app volume."

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/p;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    iput p1, p0, Lcom/beizi/ad/internal/g;->z:F

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 8
    const-class v0, Lcom/beizi/ad/internal/g;

    monitor-enter v0

    if-eqz p1, :cond_7

    .line 9
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->setErrorContext(Landroid/content/Context;)V

    .line 11
    sput-object p2, Lcom/beizi/ad/internal/g;->f:Ljava/lang/String;

    .line 12
    iget-object p2, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    const-string v1, "userAgent"

    invoke-static {p2, v1}, Lcom/beizi/ad/internal/utilities/SPUtils;->getString(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 13
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 14
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    iput-object p2, v1, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    goto :goto_0

    .line 15
    :cond_0
    new-instance p2, Landroid/webkit/WebView;

    invoke-direct {p2, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    const/16 v3, 0x13

    if-lt v1, v2, :cond_1

    if-ge v1, v3, :cond_1

    const-string v2, "searchBoxJavaBridge_"

    .line 17
    invoke-virtual {p2, v2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v2, "accessibility"

    .line 18
    invoke-virtual {p2, v2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v2, "accessibilityTraversal"

    .line 19
    invoke-virtual {p2, v2}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    :cond_1
    const/4 v2, 0x0

    if-lt v1, v3, :cond_2

    .line 20
    invoke-static {v2}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 21
    :cond_2
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 22
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    invoke-virtual {p2}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, v1, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    .line 23
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    iget-object p2, p2, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 24
    iget-object p2, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    const-string v1, "userAgent"

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v2

    iget-object v2, v2, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    invoke-static {p2, v1, v2}, Lcom/beizi/ad/internal/utilities/SPUtils;->put(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 25
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    const-string v1, ""

    iput-object v1, p2, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p2

    .line 27
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    const-string v1, ""

    iput-object v1, p2, Lcom/beizi/ad/internal/g;->d:Ljava/lang/String;

    .line 29
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/g;->C:Landroid/util/DisplayMetrics;

    .line 30
    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    const/high16 v1, 0x44a00000    # 1280.0f

    const/high16 v2, 0x44340000    # 720.0f

    if-ge p2, p1, :cond_4

    int-to-float p2, p2

    div-float/2addr p2, v2

    .line 31
    iput p2, p0, Lcom/beizi/ad/internal/g;->j:F

    int-to-float p1, p1

    div-float/2addr p1, v1

    .line 32
    iput p1, p0, Lcom/beizi/ad/internal/g;->k:F

    goto :goto_1

    :cond_4
    int-to-float p1, p1

    div-float/2addr p1, v2

    .line 33
    iput p1, p0, Lcom/beizi/ad/internal/g;->j:F

    int-to-float p1, p2

    div-float/2addr p1, v1

    .line 34
    iput p1, p0, Lcom/beizi/ad/internal/g;->k:F

    .line 35
    :goto_1
    iget-boolean p1, p0, Lcom/beizi/ad/internal/g;->E:Z

    if-nez p1, :cond_5

    .line 36
    iget-object p1, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {p1}, Lcom/beizi/ad/lance/b;->a(Landroid/content/Context;)Lcom/beizi/ad/lance/b;

    move-result-object p1

    new-instance p2, Lcom/beizi/ad/internal/g$2;

    invoke-direct {p2, p0}, Lcom/beizi/ad/internal/g$2;-><init>(Lcom/beizi/ad/internal/g;)V

    invoke-virtual {p1, p2}, Lcom/beizi/ad/lance/b;->a(Lcom/beizi/ad/lance/a;)V

    :cond_5
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lcom/beizi/ad/internal/g;->E:Z

    .line 38
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-lt p1, p2, :cond_6

    .line 39
    invoke-direct {p0}, Lcom/beizi/ad/internal/g;->p()V

    .line 40
    :cond_6
    monitor-exit v0

    return-void

    .line 41
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 42
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public a(Lcom/beizi/ad/internal/j;Ljava/lang/String;)V
    .locals 1

    .line 51
    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 52
    sget-object v0, Lcom/beizi/ad/internal/g$3;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/g;->u:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 54
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/g;->t:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 55
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/g;->s:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 56
    :cond_3
    iget-object p1, p0, Lcom/beizi/ad/internal/g;->r:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 57
    :cond_4
    iget-object p1, p0, Lcom/beizi/ad/internal/g;->q:Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 58
    new-instance v0, Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-direct {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    if-eqz p1, :cond_7

    .line 59
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 60
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 61
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "configVersion"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 62
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setConfigVersion(Ljava/lang/String;)V

    .line 63
    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "macro"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 64
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setMacro(Ljava/lang/String;)V

    .line 65
    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "rtaUrl"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 66
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setRtaUrl(Ljava/lang/String;)V

    .line 67
    :cond_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "userInfoUrl"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 68
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setUserInfoUrl(Ljava/lang/String;)V

    .line 69
    :cond_4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "authUrl"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 70
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setAuthUrl(Ljava/lang/String;)V

    .line 71
    :cond_5
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "transferUrl"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 72
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setTransferUrl(Ljava/lang/String;)V

    .line 73
    :cond_6
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "appId"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 74
    iget-object v1, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->setAppId(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 49
    sget-object v0, Lcom/beizi/ad/internal/g;->f:Ljava/lang/String;

    const-string v1, "BeiZi.initialize() must be called prior to setting the app volume."

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/p;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    iput-boolean p1, p0, Lcom/beizi/ad/internal/g;->A:Z

    return-void
.end method

.method public b()Lcom/beizi/ad/internal/b/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->F:Lcom/beizi/ad/internal/b/f;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/beizi/ad/internal/g;->o()Lcom/beizi/ad/internal/b/f;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/ad/internal/g;->F:Lcom/beizi/ad/internal/b/f;

    :cond_1
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/internal/g;->b:Ljava/lang/String;

    return-void
.end method

.method public c()Landroid/os/Handler;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->x:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->y:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BackgroundHandler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/g;->y:Landroid/os/HandlerThread;

    .line 4
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 5
    :cond_0
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/beizi/ad/internal/g;->y:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/g;->x:Landroid/os/Handler;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->x:Landroid/os/Handler;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public e()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 3

    const-string v0, "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAw"

    .line 1
    invoke-static {v0}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, ""

    return-object v0

    .line 3
    :cond_0
    iget-boolean v1, p0, Lcom/beizi/ad/internal/g;->a:Z

    if-eqz v1, :cond_1

    const-string v1, "http:"

    const-string v2, "https:"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/g;->p:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/g;->p:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "aHR0cDovL2FwaS5odHAuYWQtc2NvcGUuY29tLmNuOjQ1NjAw"

    .line 3
    invoke-static {v0}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, ""

    return-object v0

    .line 5
    :cond_1
    iget-boolean v1, p0, Lcom/beizi/ad/internal/g;->a:Z

    if-eqz v1, :cond_2

    const-string v1, "http:"

    const-string v2, "https:"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public h()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/g;->j:F

    return v0
.end method

.method public i()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/g;->k:F

    return v0
.end method

.method public j()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/g;->j:F

    iget v1, p0, Lcom/beizi/ad/internal/g;->k:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public k()Landroid/util/DisplayMetrics;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->C:Landroid/util/DisplayMetrics;

    return-object v0
.end method

.method public l()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->v:Ljava/util/HashSet;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/beizi/ad/internal/g;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/mb/sdk0/json"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lcom/beizi/ad/alipay/model/IncentiveConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/g;->o:Lcom/beizi/ad/alipay/model/IncentiveConfig;

    return-object v0
.end method
