.class public final Lcom/kwad/sdk/commercial/h/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/e/a/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/commercial/h/a$a;
    }
.end annotation


# instance fields
.field private final Kc:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/sdk/commercial/h/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/h/a;-><init>()V

    return-void
.end method

.method public static Bz()Lcom/kwad/sdk/commercial/h/a;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/h/a$a;->BA()Lcom/kwad/sdk/commercial/h/a;

    move-result-object v0

    return-object v0
.end method

.method public static register()V
    .locals 1
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/core/e/c;
        methodId = "registerLogger"
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/commercial/h/a;->Bz()Lcom/kwad/sdk/commercial/h/a;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->a(Lcom/kwad/sdk/core/e/a/a;)V

    return-void
.end method


# virtual methods
.method public final cM(Ljava/lang/String;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/sdk/commercial/h/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    .line 3
    const-class v1, Lcom/kwad/sdk/service/a/f;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/f;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v2

    invoke-static {}, Lcom/kwad/sdk/h/g;->JI()Lcom/kwad/sdk/h/g;

    move-result-object v3

    .line 5
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v4

    iget-object v4, v4, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/kwad/sdk/h/g;->ga(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v3

    .line 6
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getSdkVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kwad/sdk/h/g;->gb(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v3

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getOaid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kwad/sdk/h/g;->gc(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v3

    .line 8
    invoke-static {v0}, Lcom/kwad/sdk/utils/aw;->cI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kwad/sdk/h/g;->gf(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v3

    .line 9
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/kwad/sdk/h/g;->gd(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v3

    .line 10
    invoke-static {v0}, Lcom/kwad/sdk/utils/aw;->cJ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/kwad/sdk/h/g;->ge(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 11
    invoke-interface {v1}, Lcom/kwad/sdk/service/a/f;->zd()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/h/g;->m(Lorg/json/JSONObject;)Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 12
    invoke-static {}, Lcom/kwad/sdk/components/f;->encryptDisable()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/h/g;->bE(Z)Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 13
    invoke-interface {v1}, Lcom/kwad/sdk/service/a/f;->zc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/h/g;->gg(Ljava/lang/String;)Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 14
    invoke-interface {v1}, Lcom/kwad/sdk/service/a/f;->zf()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/h/g;->h(Ljava/util/Map;)Lcom/kwad/sdk/h/g;

    move-result-object v0

    .line 15
    invoke-interface {v1}, Lcom/kwad/sdk/service/a/f;->ze()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/kwad/sdk/h/g;->n(Lorg/json/JSONObject;)Lcom/kwad/sdk/h/g;

    move-result-object v0

    new-instance v3, Lcom/kwad/sdk/commercial/h/a$1;

    invoke-direct {v3, p0, v1}, Lcom/kwad/sdk/commercial/h/a$1;-><init>(Lcom/kwad/sdk/commercial/h/a;Lcom/kwad/sdk/service/a/f;)V

    .line 16
    invoke-virtual {v2, p1, v0, v3}, Lcom/kwad/sdk/h/h;->a(Ljava/lang/String;Lcom/kwad/sdk/h/g;Lcom/kwad/sdk/h/f;)V

    .line 17
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    new-instance p1, Lcom/kwad/sdk/commercial/h/a$2;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/commercial/h/a$2;-><init>(Lcom/kwad/sdk/commercial/h/a;)V

    invoke-static {p1}, Lcom/kwad/sdk/core/c/b;->a(Lcom/kwad/sdk/core/c/c;)V

    .line 18
    iget-object p1, p0, Lcom/kwad/sdk/commercial/h/a;->Kc:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    const-string v1, "d"

    invoke-virtual {v0, v1, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    const-string v1, "e"

    invoke-virtual {v0, v1, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    const-string v1, "i"

    invoke-virtual {v0, v1, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final printStackTraceOnly(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    const-string v1, "v"

    invoke-virtual {v0, v1, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object p3

    const-string v0, "v"

    invoke-virtual {p3, v0, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object v0

    const-string v1, "w"

    invoke-virtual {v0, v1, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/h/h;->JN()Lcom/kwad/sdk/h/h;

    move-result-object p3

    const-string v0, "w"

    invoke-virtual {p3, v0, p1, p2}, Lcom/kwad/sdk/h/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
