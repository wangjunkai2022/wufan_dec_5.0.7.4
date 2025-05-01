.class public Lcom/kwad/sdk/e/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/e/a;


# static fields
.field private static volatile aJi:Lcom/kwad/sdk/e/b;

.field private static aJj:Lcom/kwad/sdk/e/c;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized Jd()Lcom/kwad/sdk/e/b;
    .locals 2

    const-class v0, Lcom/kwad/sdk/e/b;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/kwad/sdk/e/b;->aJi:Lcom/kwad/sdk/e/b;

    if-nez v1, :cond_1

    .line 2
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    sget-object v1, Lcom/kwad/sdk/e/b;->aJi:Lcom/kwad/sdk/e/b;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/sdk/e/b;

    invoke-direct {v1}, Lcom/kwad/sdk/e/b;-><init>()V

    sput-object v1, Lcom/kwad/sdk/e/b;->aJi:Lcom/kwad/sdk/e/b;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v1, Lcom/kwad/sdk/e/b;->aJi:Lcom/kwad/sdk/e/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static Je()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, ""

    const/4 v2, 0x2

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/e/b;->a(ZLjava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(ZLjava/lang/Object;I)Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p0

    const-string v1, "userSet"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "value"

    .line 4
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "errorCode"

    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 7
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/kwad/sdk/e/c;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    return-void
.end method


# virtual methods
.method public final IR()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IR()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IS()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IS()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IT()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IT()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IU()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IU()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IV()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IV()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IW()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IW()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IX()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IX()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IY()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IY()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IZ()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->IZ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Ja()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->Ja()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Jb()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->Jb()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Jc()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->Jc()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getAppId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDeviceId()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getIccId()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getIccId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getIp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getIp()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLocation()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getLocation()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getOaid()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getOaid()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/e/b;->aJj:Lcom/kwad/sdk/e/c;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/e/a;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/e/b;->Je()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
