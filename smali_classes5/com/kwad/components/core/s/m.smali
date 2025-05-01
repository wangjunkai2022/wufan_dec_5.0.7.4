.class public Lcom/kwad/components/core/s/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "m"

.field private static final TW:Ljava/lang/String; = "com.kwad.components.core.s.m"

.field private static volatile TX:Lcom/kwad/components/core/s/m;


# instance fields
.field private TY:Z

.field private TZ:Lcom/kwad/sdk/core/config/item/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/s/m;->TY:Z

    return-void
.end method

.method private static I(J)V
    .locals 4

    .line 1
    sget-object v0, Lcom/kwad/components/core/s/m;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "checkBySuper end:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, p0

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Ljava/util/List;Ljava/lang/Class;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Class;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    if-eqz p1, :cond_3

    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "java.lang.Object"

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 29
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v4

    .line 31
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    add-int/2addr v1, v4

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    :cond_3
    return v0
.end method

.method private a(Ljava/util/List;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 6
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_3

    aget-object v3, v1, v0

    .line 7
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 9
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 10
    :cond_3
    invoke-direct {p0, p2, v1}, Lcom/kwad/components/core/s/m;->a(Ljava/util/List;[Ljava/lang/StackTraceElement;)Z

    move-result p1

    return p1

    :cond_4
    :goto_1
    return v0
.end method

.method private a(Ljava/util/List;[Ljava/lang/StackTraceElement;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/StackTraceElement;",
            ")Z"
        }
    .end annotation

    const-string v0, "$"

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 11
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 13
    sget-object v4, Lcom/kwad/components/core/s/m;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "checkBySuper begin:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    array-length v4, p2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, p2, v5

    .line 15
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 16
    invoke-static {v6}, Lcom/kwad/components/core/s/m;->aC(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v6}, Lcom/kwad/components/core/s/m;->aD(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    .line 17
    :try_start_0
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    .line 18
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v8

    .line 19
    invoke-static {p1, v8}, Lcom/kwad/components/core/s/m;->a(Ljava/util/List;Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 20
    invoke-static {v2, v3}, Lcom/kwad/components/core/s/m;->I(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v7

    .line 21
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 22
    invoke-virtual {v6, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v6, v1, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 23
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 24
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    .line 25
    invoke-static {p1, v6}, Lcom/kwad/components/core/s/m;->a(Ljava/util/List;Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 26
    invoke-static {v2, v3}, Lcom/kwad/components/core/s/m;->I(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return v7

    :catchall_1
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 27
    :cond_3
    invoke-static {v2, v3}, Lcom/kwad/components/core/s/m;->I(J)V

    :cond_4
    :goto_1
    return v1
.end method

.method private static aC(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "android"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "java"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "dalvik"

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.android"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/kwad/components/core/s/m;->TW:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "androidx"

    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static aD(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "com.kwad"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static aE(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v1
.end method

.method public static rI()Lcom/kwad/components/core/s/m;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/s/m;->TX:Lcom/kwad/components/core/s/m;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/core/s/m;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/core/s/m;->TX:Lcom/kwad/components/core/s/m;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/core/s/m;

    invoke-direct {v1}, Lcom/kwad/components/core/s/m;-><init>()V

    sput-object v1, Lcom/kwad/components/core/s/m;->TX:Lcom/kwad/components/core/s/m;

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
    sget-object v0, Lcom/kwad/components/core/s/m;->TX:Lcom/kwad/components/core/s/m;

    return-object v0
.end method

.method private rK()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v1, p0, Lcom/kwad/components/core/s/m;->TY:Z

    if-nez v1, :cond_1

    iget-object v0, v0, Lcom/kwad/sdk/core/config/item/p$a;->auI:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    iget-object v0, v0, Lcom/kwad/sdk/core/config/item/p$a;->auI:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-static {v1}, Lcom/kwad/components/core/s/m;->aE(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/kwad/components/core/s/m;->TY:Z

    if-nez v1, :cond_1

    goto :goto_0

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/kwad/components/core/s/m;->TY:Z

    if-nez v0, :cond_2

    return-void

    .line 6
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    iget-object v1, v1, Lcom/kwad/sdk/core/config/item/p$a;->auF:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_4

    .line 8
    iget-object v1, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    iget-object v1, v1, Lcom/kwad/sdk/core/config/item/p$a;->auF:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 9
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 11
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 12
    invoke-static {v3}, Lcom/kwad/components/core/s/m;->aE(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 13
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 14
    :cond_4
    iget-object v1, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    iget-object v2, v1, Lcom/kwad/sdk/core/config/item/p$a;->auG:Ljava/util/List;

    iget-object v1, v1, Lcom/kwad/sdk/core/config/item/p$a;->auH:Ljava/util/List;

    .line 15
    invoke-direct {p0, v2, v1}, Lcom/kwad/components/core/s/m;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v1

    .line 16
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Lcom/kwad/components/core/o/a;->a(ZLjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/s/m;->TY:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    iget-object v1, v0, Lcom/kwad/sdk/core/config/item/p$a;->auG:Ljava/util/List;

    iget-object v0, v0, Lcom/kwad/sdk/core/config/item/p$a;->auH:Ljava/util/List;

    invoke-direct {p0, v1, v0}, Lcom/kwad/components/core/s/m;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    :goto_0
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Lcom/kwad/components/core/o/a;->a(Lcom/kwad/sdk/internal/api/SceneImpl;ZLjava/lang/String;)V

    return v0
.end method

.method public final init()V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->aso:Lcom/kwad/sdk/core/config/item/p;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->b(Lcom/kwad/sdk/core/config/item/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/config/item/p$a;

    iput-object v0, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/s/m;->rK()V

    :cond_0
    return-void
.end method

.method public final rJ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/s/m;->TZ:Lcom/kwad/sdk/core/config/item/p$a;

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Lcom/kwad/sdk/core/config/item/p$a;->auJ:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
