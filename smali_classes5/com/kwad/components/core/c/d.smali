.class public Lcom/kwad/components/core/c/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile Jv:Lcom/kwad/components/core/c/d; = null

.field private static Jw:Z = true


# instance fields
.field private final Ju:Landroid/util/SparseArray;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/kwad/components/core/c/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/c/d;->Ju:Landroid/util/SparseArray;

    .line 3
    new-instance v1, Lcom/kwad/components/core/c/n;

    invoke-direct {v1}, Lcom/kwad/components/core/c/n;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 4
    new-instance v1, Lcom/kwad/components/core/c/m;

    invoke-direct {v1}, Lcom/kwad/components/core/c/m;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 5
    new-instance v1, Lcom/kwad/components/core/c/l;

    invoke-direct {v1}, Lcom/kwad/components/core/c/l;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/c/d;Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/c;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lcom/kwad/components/core/c/d;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/c;)V

    return-void
.end method

.method private static a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/components/core/c/c;)V
    .locals 1

    .line 3
    invoke-interface {p1}, Lcom/kwad/components/core/c/c;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const-string v0, "StrategyNetworkFirst"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "StrategyLocalCacheFirst"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "network_only"

    .line 4
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/request/model/a;->ay(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "cache_first"

    .line 5
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/request/model/a;->ay(Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p1, "network_first"

    .line 6
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/request/model/a;->ay(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/c/d;)Z
    .locals 0

    .line 2
    invoke-static {}, Lcom/kwad/components/core/c/d;->mY()Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/core/c/d;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/c/d;->Ju:Landroid/util/SparseArray;

    return-object p0
.end method

.method public static mX()Lcom/kwad/components/core/c/d;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/c/d;->Jv:Lcom/kwad/components/core/c/d;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/core/c/d;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/core/c/d;->Jv:Lcom/kwad/components/core/c/d;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/core/c/d;

    invoke-direct {v1}, Lcom/kwad/components/core/c/d;-><init>()V

    sput-object v1, Lcom/kwad/components/core/c/d;->Jv:Lcom/kwad/components/core/c/d;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/kwad/components/core/c/d;->Jv:Lcom/kwad/components/core/c/d;

    return-object v0
.end method

.method private static mY()Z
    .locals 2

    .line 1
    sget-boolean v0, Lcom/kwad/components/core/c/d;->Jw:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    const-string v0, "KEY_ENABLE_FORCE_ENABLE_AD_CACHE"

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/components/f;->cZ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const-string v0, "com.kwad.devTools.PosConfigFetcher"

    .line 3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    const/4 v0, 0x1

    .line 4
    sput-boolean v0, Lcom/kwad/components/core/c/d;->Jw:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 5
    :catch_0
    sput-boolean v1, Lcom/kwad/components/core/c/d;->Jw:Z

    .line 6
    :goto_0
    sget-boolean v0, Lcom/kwad/components/core/c/d;->Jw:Z

    return v0
.end method


# virtual methods
.method public final c(Lcom/kwad/components/core/request/model/a;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->Gr()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/c/d$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/core/c/d$1;-><init>(Lcom/kwad/components/core/c/d;Lcom/kwad/components/core/request/model/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
