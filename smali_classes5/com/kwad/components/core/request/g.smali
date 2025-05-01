.class public final Lcom/kwad/components/core/request/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/request/g$b;,
        Lcom/kwad/components/core/request/g$a;
    }
.end annotation


# static fields
.field private static volatile RZ:Z

.field private static final Sa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/request/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final sHasInit:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, Lcom/kwad/components/core/request/g;->sHasInit:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lcom/kwad/components/core/request/g;->RZ:Z

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/kwad/components/core/request/g;->Sa:Ljava/util/List;

    return-void
.end method

.method public static declared-synchronized a(Lcom/kwad/components/core/request/g$a;)V
    .locals 3

    const-class v0, Lcom/kwad/components/core/request/g;

    monitor-enter v0

    :try_start_0
    const-string v1, "ConfigRequestManager"

    const-string v2, "init config"

    .line 1
    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/kwad/components/core/request/g;->sHasInit:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "ConfigRequestManager"

    const-string v1, "config request manager has init"

    .line 3
    invoke-static {p0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    :try_start_1
    sget-object v1, Lcom/kwad/components/core/request/g;->Sa:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance p0, Lcom/kwad/components/core/request/g$1;

    invoke-direct {p0}, Lcom/kwad/components/core/request/g$1;-><init>()V

    invoke-static {p0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V
    .locals 2
    .param p0    # Lcom/kwad/sdk/core/response/model/SdkConfigData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 8
    sget-object v0, Lcom/kwad/components/core/request/g;->Sa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/request/g$a;

    .line 9
    :try_start_0
    invoke-interface {v1, p0}, Lcom/kwad/components/core/request/g$a;->d(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 10
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic access$102(Z)Z
    .locals 0

    const/4 p0, 0x1

    .line 1
    sput-boolean p0, Lcom/kwad/components/core/request/g;->RZ:Z

    return p0
.end method

.method public static b(Lcom/kwad/components/core/request/g$a;)V
    .locals 1

    .line 2
    :try_start_0
    sget-object v0, Lcom/kwad/components/core/request/g;->Sa:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->isLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {p0}, Lcom/kwad/components/core/request/g$a;->qW()V

    .line 5
    :cond_0
    sget-boolean v0, Lcom/kwad/components/core/request/g;->RZ:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CK()Lcom/kwad/sdk/core/response/model/SdkConfigData;

    move-result-object v0

    invoke-interface {p0, v0}, Lcom/kwad/components/core/request/g$a;->d(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    .line 7
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/core/request/g;->a(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V

    return-void
.end method

.method private static m(ILjava/lang/String;)V
    .locals 1

    .line 1
    sget-object p0, Lcom/kwad/components/core/request/g;->Sa:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/core/request/g$a;

    .line 2
    :try_start_0
    instance-of v0, p1, Lcom/kwad/components/core/request/g$b;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/kwad/components/core/request/g$b;

    .line 4
    invoke-interface {p1}, Lcom/kwad/components/core/request/g$b;->qX()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic n(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/kwad/components/core/request/g;->m(ILjava/lang/String;)V

    return-void
.end method

.method public static qR()V
    .locals 2

    const-string v0, "ConfigRequestManager"

    const-string v1, "requestConfig"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/kwad/components/core/request/g$2;

    invoke-direct {v0}, Lcom/kwad/components/core/request/g$2;-><init>()V

    .line 3
    new-instance v1, Lcom/kwad/components/core/request/g$3;

    invoke-direct {v1}, Lcom/kwad/components/core/request/g$3;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    return-void
.end method

.method private static qS()V
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/request/g;->Sa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/request/g$a;

    .line 2
    :try_start_0
    invoke-interface {v1}, Lcom/kwad/components/core/request/g$a;->qW()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic qT()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/components/core/request/g;->qS()V

    return-void
.end method

.method static synthetic qU()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/request/g;->sHasInit:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method
