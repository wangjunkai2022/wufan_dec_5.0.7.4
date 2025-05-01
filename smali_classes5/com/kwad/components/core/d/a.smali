.class public final Lcom/kwad/components/core/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/d/a$a;,
        Lcom/kwad/components/core/d/a$c;,
        Lcom/kwad/components/core/d/a$b;
    }
.end annotation


# static fields
.field private static Kb:Z

.field private static final Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static Kd:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private static Ke:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final Kf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/d/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private static final Kg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/d/a$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/kwad/components/core/d/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/components/core/d/a;->Kf:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/components/core/d/a;->Kg:Ljava/util/List;

    return-void
.end method

.method public static a(Lcom/kwad/components/core/d/a$b;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kf:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Lcom/kwad/components/core/d/a$c;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/kwad/components/core/d/a;->Kg:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static ab(Ljava/lang/String;)Lcom/kwad/sdk/crash/model/b;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance p0, Lcom/kwad/sdk/crash/model/b;

    invoke-direct {p0}, Lcom/kwad/sdk/crash/model/b;-><init>()V

    return-object p0

    .line 3
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    new-instance p0, Lcom/kwad/sdk/crash/model/b;

    invoke-direct {p0}, Lcom/kwad/sdk/crash/model/b;-><init>()V

    .line 5
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "KsAdExceptionCollectorHelper"

    .line 6
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    new-instance p0, Lcom/kwad/sdk/crash/model/b;

    invoke-direct {p0}, Lcom/kwad/sdk/crash/model/b;-><init>()V

    return-object p0
.end method

.method private static ac(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x2e

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static b(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    .line 3
    :cond_0
    sget-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static declared-synchronized initAsync(Landroid/content/Context;)V
    .locals 1

    const-class v0, Lcom/kwad/components/core/d/a;

    monitor-enter v0

    if-eqz p0, :cond_1

    .line 1
    :try_start_0
    sget-object p0, Lcom/kwad/components/core/d/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-nez p0, :cond_1

    sget-boolean p0, Lcom/kwad/components/core/d/a;->Kb:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    .line 2
    sput-boolean p0, Lcom/kwad/components/core/d/a;->Kb:Z

    .line 3
    new-instance p0, Lcom/kwad/components/core/d/a$1;

    invoke-direct {p0}, Lcom/kwad/components/core/d/a$1;-><init>()V

    invoke-static {p0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    .line 5
    :cond_1
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/kwad/components/core/d/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-static {p0, p1}, Lcom/kwad/sdk/crash/report/h;->ah(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Ke:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/kwad/components/core/d/a;->Ke:Ljava/util/Map;

    .line 3
    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    sget-object v0, Lcom/kwad/components/core/d/a;->Ke:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method static synthetic nA()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kf:Ljava/util/List;

    return-object v0
.end method

.method private static np()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->arD:Lcom/kwad/sdk/core/config/item/k;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->b(Lcom/kwad/sdk/core/config/item/k;)Z

    move-result v0

    return v0
.end method

.method private static nq()V
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/kwad/components/core/d/a;->np()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    sget-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/crash/b;->n(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 4
    :cond_1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 5
    sput-object v0, Lcom/kwad/components/core/d/a;->Kd:Ljava/util/List;

    .line 6
    new-instance v0, Lcom/kwad/components/core/d/a$2;

    invoke-direct {v0}, Lcom/kwad/components/core/d/a$2;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->f(Lcom/kwad/sdk/f/a;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private static nr()V
    .locals 3

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Ke:Ljava/util/Map;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/kwad/sdk/crash/report/h;->ah(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_2
    sget-object v0, Lcom/kwad/components/core/d/a;->Ke:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private static ns()Lcom/kwad/sdk/crash/c;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->asV:Lcom/kwad/sdk/core/config/item/q;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/q;)Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "configStr:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "KsAdExceptionCollectorHelper"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {v0}, Lcom/kwad/components/core/d/a;->ab(Ljava/lang/String;)Lcom/kwad/sdk/crash/model/b;

    move-result-object v0

    .line 4
    iget-object v1, v0, Lcom/kwad/sdk/crash/model/b;->aHy:Ljava/lang/String;

    .line 5
    iget-object v2, v0, Lcom/kwad/sdk/crash/model/b;->aHz:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/crash/utils/g;->a(Lcom/kwad/sdk/crash/model/b;)Z

    move-result v3

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/crash/utils/g;->b(Lcom/kwad/sdk/crash/model/b;)Z

    move-result v4

    .line 8
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 9
    invoke-static {v5}, Lcom/kwad/components/core/d/a$a;->ah(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 10
    new-instance v7, Lcom/kwad/sdk/crash/c$a;

    invoke-direct {v7}, Lcom/kwad/sdk/crash/c$a;-><init>()V

    .line 11
    invoke-virtual {v7, v5}, Lcom/kwad/sdk/crash/c$a;->bI(Landroid/content/Context;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v7

    .line 12
    invoke-virtual {v7, v3}, Lcom/kwad/sdk/crash/c$a;->bx(Z)Lcom/kwad/sdk/crash/c$a;

    move-result-object v3

    .line 13
    invoke-virtual {v3, v4}, Lcom/kwad/sdk/crash/c$a;->by(Z)Lcom/kwad/sdk/crash/c$a;

    move-result-object v3

    .line 14
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kwad/sdk/l;->yV()Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/kwad/sdk/crash/c$a;->bz(Z)Lcom/kwad/sdk/crash/c$a;

    move-result-object v3

    .line 15
    invoke-virtual {v3, v1}, Lcom/kwad/sdk/crash/c$a;->fk(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 16
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fj(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 17
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    invoke-static {}, Lcom/kwad/sdk/l;->getSDKVersion()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;->getSdkCrashVersionName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fr(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 18
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    const v2, 0x2e548c

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->dy(I)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 19
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/sdk/l;->getApiVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;->getSdkCrashVersionName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fs(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 20
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/sdk/l;->getApiVersionCode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->dz(I)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 21
    invoke-virtual {v1, v3}, Lcom/kwad/sdk/crash/c$a;->dA(I)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    const-string v2, "com.kwad.sdk"

    .line 22
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fq(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 23
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->ft(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 24
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fu(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 25
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/sdk/api/SdkConfig;->appName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fv(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 26
    invoke-static {v5}, Lcom/kwad/sdk/utils/k;->cd(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fw(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    iget-object v2, v0, Lcom/kwad/sdk/crash/model/b;->aHv:Ljava/lang/String;

    .line 27
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fx(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 28
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fn(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    .line 29
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v2

    iget-object v2, v2, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fo(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    iget-object v2, v0, Lcom/kwad/sdk/crash/model/b;->version:Ljava/lang/String;

    .line 30
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fm(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    iget-object v2, v0, Lcom/kwad/sdk/crash/model/b;->aHx:Ljava/lang/String;

    .line 31
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/crash/c$a;->fy(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v1

    iget-object v0, v0, Lcom/kwad/sdk/crash/model/b;->aHw:Ljava/lang/String;

    .line 32
    invoke-virtual {v1, v0}, Lcom/kwad/sdk/crash/c$a;->fz(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    const-string v1, "Android"

    .line 33
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/c$a;->fl(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    .line 34
    invoke-virtual {v0, v6}, Lcom/kwad/sdk/crash/c$a;->fp(Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/d/a$4;

    invoke-direct {v1, v5}, Lcom/kwad/components/core/d/a$4;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/c$a;->a(Lcom/kwad/sdk/crash/h;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/d/a$3;

    invoke-direct {v1, v5}, Lcom/kwad/components/core/d/a$3;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/c$a;->a(Lcom/kwad/sdk/crash/f;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    .line 37
    invoke-static {}, Lcom/kwad/components/core/d/a;->nt()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/c$a;->d([Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    .line 38
    invoke-static {}, Lcom/kwad/components/core/d/a;->nu()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/c$a;->e([Ljava/lang/String;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    .line 39
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cm()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/c$a;->E(Ljava/util/List;)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    sget-object v1, Lcom/kwad/sdk/core/config/c;->atV:Lcom/kwad/sdk/core/config/item/f;

    .line 40
    invoke-static {v1}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/f;)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/crash/c$a;->m(D)Lcom/kwad/sdk/crash/c$a;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lcom/kwad/sdk/crash/c$a;->Ie()Lcom/kwad/sdk/crash/c;

    move-result-object v0

    return-object v0
.end method

.method private static nt()[Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    :try_start_0
    const-class v1, Lcom/kwad/sdk/KsAdSDKImpl;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/core/d/a;->ac(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    const-class v1, Lcom/kwad/sdk/DownloadTask;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/core/d/a;->ac(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 4
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 5
    :goto_0
    :try_start_1
    const-class v1, Lcom/kwai/CpuMemoryProfiler;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/core/d/a;->ac(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    const-class v1, Lcom/kuaishou/aegon/Aegon;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/core/d/a;->ac(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7
    :catchall_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private static nu()[Ljava/lang/String;
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    .line 1
    :try_start_0
    const-class v1, Lcom/kwad/sdk/crash/d;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method static synthetic nv()Lcom/kwad/sdk/crash/c;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/d/a;->ns()Lcom/kwad/sdk/crash/c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic nw()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic nx()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/components/core/d/a;->nq()V

    return-void
.end method

.method static synthetic ny()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/components/core/d/a;->nr()V

    return-void
.end method

.method static synthetic nz()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/d/a;->Kg:Ljava/util/List;

    return-object v0
.end method

.method public static reportSdkCaughtException(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 2
    sget-object v0, Lcom/kwad/components/core/d/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/kwad/components/core/d/a;->b(Ljava/lang/Throwable;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/d/a;->np()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/crash/b;->n(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
