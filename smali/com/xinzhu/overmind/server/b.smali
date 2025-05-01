.class public Lcom/xinzhu/overmind/server/b;
.super Ljava/lang/Object;
.source "ClientServiceManager.java"


# static fields
.field public static final c:Ljava/lang/String; = "ClientServiceManager"

.field private static d:Lcom/xinzhu/overmind/server/b;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/content/Intent$FilterComparison;",
            "Lcom/xinzhu/overmind/client/service/a;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/app/Service;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/xinzhu/overmind/server/b;

    invoke-direct {v0}, Lcom/xinzhu/overmind/server/b;-><init>()V

    sput-object v0, Lcom/xinzhu/overmind/server/b;->d:Lcom/xinzhu/overmind/server/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    return-void
.end method

.method private a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    new-instance v1, Landroid/content/Intent$FilterComparison;

    invoke-direct {v1, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/xinzhu/overmind/client/service/a;

    return-object p1
.end method

.method public static b()Lcom/xinzhu/overmind/server/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/xinzhu/overmind/server/b;->d:Lcom/xinzhu/overmind/server/b;

    return-object v0
.end method

.method private c(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Z)Landroid/app/Service;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/b;->a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p3, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getClient()Lcom/xinzhu/overmind/client/e;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/xinzhu/overmind/client/e;->createService(Landroid/content/pm/ServiceInfo;)Landroid/app/Service;

    move-result-object p2

    .line 5
    new-instance p3, Lcom/xinzhu/overmind/client/service/a;

    invoke-direct {p3}, Lcom/xinzhu/overmind/client/service/a;-><init>()V

    .line 6
    invoke-virtual {p3, p2}, Lcom/xinzhu/overmind/client/service/a;->n(Landroid/app/Service;)V

    .line 7
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    new-instance v1, Landroid/content/Intent$FilterComparison;

    invoke-direct {v1, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method private l(Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    new-instance v1, Landroid/content/Intent$FilterComparison;

    invoke-direct {v1, p1}, Landroid/content/Intent$FilterComparison;-><init>(Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public d(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->create(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;

    move-result-object p1

    .line 2
    iget-object v0, p1, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    .line 3
    iget-object v1, p1, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    .line 4
    iget p1, p1, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mFlags:I

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 5
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getClientConfig()Lcom/xinzhu/overmind/entity/ClientConfig;

    move-result-object v3

    const-string v4, "ClientServiceManager"

    if-nez v3, :cond_1

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "restarting service "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    .line 7
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onBind: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/content/pm/ServiceInfo;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v3, 0x1

    and-int/2addr p1, v3

    const/4 v5, 0x0

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 8
    :goto_0
    invoke-direct {p0, v0, v1, v3}, Lcom/xinzhu/overmind/server/b;->c(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Z)Landroid/app/Service;

    move-result-object p1

    if-nez p1, :cond_3

    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bind without bind_auto_create flag, ignore: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    .line 10
    :cond_3
    invoke-virtual {p1}, Landroid/app/Service;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 11
    invoke-direct {p0, v0}, Lcom/xinzhu/overmind/server/b;->a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;

    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Lcom/xinzhu/overmind/client/service/a;->k(Landroid/content/Intent;)I

    .line 13
    invoke-virtual {v1, v0}, Lcom/xinzhu/overmind/client/service/a;->j(Landroid/content/Intent;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 14
    invoke-virtual {v1}, Lcom/xinzhu/overmind/client/service/a;->l()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 15
    invoke-virtual {p1, v0}, Landroid/app/Service;->onRebind(Landroid/content/Intent;)V

    .line 16
    invoke-virtual {v1, v5}, Lcom/xinzhu/overmind/client/service/a;->m(Z)V

    .line 17
    :cond_4
    invoke-virtual {v1, v0}, Lcom/xinzhu/overmind/client/service/a;->e(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1

    .line 18
    :cond_5
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/app/Service;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    .line 19
    invoke-virtual {v1, v0, p1}, Lcom/xinzhu/overmind/client/service/a;->b(Landroid/content/Intent;Landroid/os/IBinder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_1
    return-object v2
.end method

.method public e(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/client/service/a;

    .line 3
    :try_start_0
    invoke-virtual {v1}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/client/service/a;

    .line 3
    :try_start_0
    invoke-virtual {v1}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Service;->onDestroy()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/client/service/a;

    .line 3
    :try_start_0
    invoke-virtual {v1}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Service;->onLowMemory()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Landroid/content/Intent;II)I
    .locals 6

    .line 1
    invoke-static {p1}, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->create(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;

    move-result-object p3

    .line 2
    iget-object v0, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    const/4 v1, 0x2

    if-eqz v0, :cond_5

    iget-object v0, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getClientConfig()Lcom/xinzhu/overmind/entity/ClientConfig;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 3
    :cond_0
    iget-object v0, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    iget-object v2, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    const/4 v3, 0x1

    invoke-direct {p0, v0, v2, v3}, Lcom/xinzhu/overmind/server/b;->c(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Z)Landroid/app/Service;

    move-result-object v0

    const-string v2, "ClientServiceManager"

    if-nez v0, :cond_1

    const-string p1, "onStartCommand unexpected behavior"

    .line 4
    invoke-static {v2, p1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 5
    :cond_1
    iget-object v3, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/app/Service;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 6
    iget-object v3, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-direct {p0, v3}, Lcom/xinzhu/overmind/server/b;->a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;

    move-result-object v3

    const-string v4, "operation"

    .line 7
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v5, "start_service"

    .line 8
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    const-string p2, "stop_service"

    .line 9
    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 10
    iget-object p2, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-virtual {p0, p2}, Lcom/xinzhu/overmind/server/b;->stopService(Landroid/content/Intent;)V

    .line 11
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindActivityManager()Lcom/xinzhu/overmind/client/frameworks/a;

    move-result-object p2

    iget p3, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mUserId:I

    invoke-virtual {p2, p1, p3}, Lcom/xinzhu/overmind/client/frameworks/a;->q(Landroid/content/Intent;I)V

    return v1

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "get unexpected <operation> "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/xinzhu/overmind/b;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 13
    :cond_4
    :goto_0
    iget v2, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mStartId:I

    invoke-virtual {v3, v2}, Lcom/xinzhu/overmind/client/service/a;->o(I)V

    .line 14
    :try_start_0
    iget-object v2, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    iget v3, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mStartId:I

    invoke-virtual {v0, v2, p2, v3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p2

    .line 15
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindActivityManager()Lcom/xinzhu/overmind/client/frameworks/a;

    move-result-object v0

    iget p3, p3, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mUserId:I

    invoke-virtual {v0, p1, p3}, Lcom/xinzhu/overmind/client/frameworks/a;->s(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p2

    :catchall_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_1
    return v1
.end method

.method public i(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/xinzhu/overmind/client/service/a;

    .line 3
    :try_start_0
    invoke-virtual {v1}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/Service;->onTrimMemory(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 4
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    const-string p1, "ClientServiceManager"

    const-string v0, "onTrimMemory"

    .line 5
    invoke-static {p1, v0}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public j(Landroid/content/Intent;)Z
    .locals 7

    .line 1
    invoke-static {p1}, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->create(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;

    move-result-object v0

    .line 2
    iget-object v1, v0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iget-object v1, v0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v1, :cond_6

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getClientConfig()Lcom/xinzhu/overmind/entity/ClientConfig;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    iget-object v1, v0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    .line 4
    :try_start_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindActivityManager()Lcom/xinzhu/overmind/client/frameworks/a;

    move-result-object v3

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v4

    invoke-virtual {v3, p1, v4}, Lcom/xinzhu/overmind/client/frameworks/a;->r(Landroid/content/Intent;I)Lcom/xinzhu/overmind/entity/UnbindRecord;

    move-result-object v3

    if-nez v3, :cond_1

    return v2

    .line 5
    :cond_1
    iget-object v4, v0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    iget-object v5, v0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceInfo:Landroid/content/pm/ServiceInfo;

    invoke-direct {p0, v4, v5, v2}, Lcom/xinzhu/overmind/server/b;->c(Landroid/content/Intent;Landroid/content/pm/ServiceInfo;Z)Landroid/app/Service;

    move-result-object v4

    if-nez v4, :cond_2

    return v2

    .line 6
    :cond_2
    iget-object v0, v0, Lcom/xinzhu/overmind/client/stub/record/StubServiceRecord;->mServiceIntent:Landroid/content/Intent;

    invoke-virtual {v4}, Landroid/app/Service;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 7
    invoke-direct {p0, v1}, Lcom/xinzhu/overmind/server/b;->a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;

    move-result-object v0

    .line 8
    invoke-virtual {v3}, Lcom/xinzhu/overmind/entity/UnbindRecord;->d()I

    move-result v3

    const/4 v5, 0x1

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_4

    .line 9
    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/client/service/a;->c(Landroid/content/Intent;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 10
    :cond_4
    invoke-virtual {v4, v1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    if-eqz v3, :cond_5

    .line 11
    invoke-virtual {v4}, Landroid/app/Service;->onDestroy()V

    .line 12
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindActivityManager()Lcom/xinzhu/overmind/client/frameworks/a;

    move-result-object v0

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getUserId()I

    move-result v3

    invoke-virtual {v0, p1, v3}, Lcom/xinzhu/overmind/client/frameworks/a;->q(Landroid/content/Intent;I)V

    .line 13
    invoke-direct {p0, v1}, Lcom/xinzhu/overmind/server/b;->l(Landroid/content/Intent;)V

    .line 14
    iget-object p1, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 15
    iget-object p1, p0, Lcom/xinzhu/overmind/server/b;->b:Landroid/app/Service;

    invoke-virtual {p1}, Landroid/app/Service;->stopSelf()V

    goto :goto_1

    .line 16
    :cond_5
    invoke-virtual {v0, v5}, Lcom/xinzhu/overmind/client/service/a;->m(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_1
    return v2
.end method

.method public k(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/b;->a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/service/a;->e(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public stopService(Landroid/content/Intent;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopService\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ClientServiceManager"

    invoke-static {v1, v0}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/b;->a(Landroid/content/Intent;)Lcom/xinzhu/overmind/client/service/a;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {v0}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/xinzhu/overmind/client/service/a;->i()I

    move-result v2

    if-gtz v2, :cond_3

    .line 4
    invoke-virtual {v0}, Lcom/xinzhu/overmind/client/service/a;->h()I

    move-result v2

    if-lez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_3

    .line 5
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stopService real destroy\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Intent;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-virtual {v0}, Lcom/xinzhu/overmind/client/service/a;->g()Landroid/app/Service;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Service;->onDestroy()V

    .line 7
    invoke-direct {p0, p1}, Lcom/xinzhu/overmind/server/b;->l(Landroid/content/Intent;)V

    .line 8
    iget-object p1, p0, Lcom/xinzhu/overmind/server/b;->a:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "stopService stubservice"

    .line 9
    invoke-static {v1, p1}, Lcom/xinzhu/overmind/b;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iget-object p1, p0, Lcom/xinzhu/overmind/server/b;->b:Landroid/app/Service;

    invoke-virtual {p1}, Landroid/app/Service;->stopSelf()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method
