.class public Lcom/beizi/ad/internal/network/c;
.super Ljava/lang/Object;
.source "SharedNetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/network/c$a;
    }
.end annotation


# static fields
.field private static a:Lcom/beizi/ad/internal/network/c;


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/beizi/ad/internal/network/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Timer;

.field private d:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/beizi/ad/internal/network/c;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    iput-boolean p1, p0, Lcom/beizi/ad/internal/network/c;->d:Z

    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/beizi/ad/internal/network/c;
    .locals 1

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/network/c;->a:Lcom/beizi/ad/internal/network/c;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/beizi/ad/internal/network/c;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/network/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/beizi/ad/internal/network/c;->a:Lcom/beizi/ad/internal/network/c;

    .line 4
    :cond_0
    sget-object p0, Lcom/beizi/ad/internal/network/c;->a:Lcom/beizi/ad/internal/network/c;

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/ad/internal/network/c;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/network/c;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method private a()V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c;->c:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/beizi/ad/internal/network/c;->c:Ljava/util/Timer;

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/beizi/ad/internal/network/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/internal/network/c;->a()V

    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c;->c:Ljava/util/Timer;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 3
    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lcom/beizi/ad/internal/network/c;->c:Ljava/util/Timer;

    .line 4
    new-instance v2, Lcom/beizi/ad/internal/network/c$1;

    invoke-direct {v2, p0, v0}, Lcom/beizi/ad/internal/network/c$1;-><init>(Lcom/beizi/ad/internal/network/c;Ljava/lang/ref/WeakReference;)V

    const-wide/16 v3, 0x2710

    const-wide/16 v5, 0x2710

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Landroid/content/Context;)V
    .locals 2

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c;->b:Ljava/util/ArrayList;

    new-instance v1, Lcom/beizi/ad/internal/network/c$a;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/internal/network/c$a;-><init>(Lcom/beizi/ad/internal/network/c;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-direct {p0, p2}, Lcom/beizi/ad/internal/network/c;->c(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Landroid/content/Context;)Z
    .locals 3

    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcom/beizi/ad/internal/network/c;->d:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "connectivity"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v1

    :cond_3
    return v0

    :catchall_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method
