.class public Lcom/kwad/sdk/core/request/model/b;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# static fields
.field private static aAr:Z

.field private static aAs:Lorg/json/JSONArray;


# instance fields
.field public Su:Ljava/lang/String;

.field public XF:Ljava/lang/String;

.field public XG:I

.field public XI:I

.field public XJ:Ljava/lang/String;

.field public XL:I

.field public XM:I

.field public aAA:I

.field public aAB:Ljava/lang/String;

.field public aAC:Ljava/lang/String;

.field public aAD:Ljava/lang/String;

.field public aAE:I

.field public aAF:Ljava/lang/String;

.field public aAG:Ljava/lang/String;

.field public aAH:Ljava/lang/String;

.field public aAI:Lorg/json/JSONArray;

.field public aAJ:Ljava/lang/String;

.field public aAK:I

.field public aAL:Ljava/lang/String;

.field public aAM:Ljava/lang/String;

.field public aAN:Ljava/lang/String;

.field public aAO:J

.field public aAP:Ljava/lang/String;

.field public aAQ:Ljava/lang/String;

.field public aAt:Ljava/lang/String;

.field public aAu:Ljava/lang/String;

.field public aAv:Ljava/lang/String;

.field public aAw:Ljava/lang/String;

.field public aAx:Ljava/lang/String;

.field public aAy:Ljava/lang/String;

.field public aAz:I

.field public aux:Ljava/lang/String;

.field public auy:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/request/model/b;->aAK:I

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/request/model/b;->aAO:J

    return-void
.end method

.method public static FK()Lcom/kwad/sdk/core/request/model/b;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/request/model/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/request/model/b;-><init>()V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getOaid()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->auy:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->aAC:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NI()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->aAF:Ljava/lang/String;

    const/4 v1, 0x1

    .line 5
    iput v1, v0, Lcom/kwad/sdk/core/request/model/b;->XG:I

    .line 6
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NU()I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/request/model/b;->XI:I

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getOsVersion()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->aAy:Ljava/lang/String;

    .line 8
    invoke-static {}, Lcom/kwad/sdk/utils/y;->Mt()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->aAH:Ljava/lang/String;

    .line 9
    const-class v1, Lcom/kwad/sdk/components/g;

    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/components/g;

    if-eqz v1, :cond_0

    .line 10
    invoke-interface {v1}, Lcom/kwad/sdk/components/g;->oV()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->aAG:Ljava/lang/String;

    .line 11
    :cond_0
    const-class v1, Lcom/kwad/sdk/service/a/f;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/f;

    if-eqz v1, :cond_1

    .line 12
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/sdk/core/request/model/b;->aux:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 13
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static declared-synchronized bu(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 5

    const-class v0, Lcom/kwad/sdk/core/request/model/b;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-boolean v1, Lcom/kwad/sdk/core/request/model/b;->aAr:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 2
    sput-boolean v1, Lcom/kwad/sdk/core/request/model/b;->aAr:Z

    .line 3
    const-class v1, Lcom/kwad/sdk/components/n;

    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/components/n;

    const-string v2, "DeviceInfo"

    .line 4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "getAppList: OptDataFetchComponent: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/o;->LU()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    new-instance v2, Lcom/kwad/sdk/core/request/model/b$1;

    invoke-direct {v2}, Lcom/kwad/sdk/core/request/model/b$1;-><init>()V

    invoke-interface {v1, p0, v2}, Lcom/kwad/sdk/components/n;->a(Landroid/content/Context;Lcom/kwad/sdk/f/a;)V

    .line 7
    :cond_0
    sget-object p0, Lcom/kwad/sdk/core/request/model/b;->aAs:Lorg/json/JSONArray;

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    .line 8
    sput-object v1, Lcom/kwad/sdk/core/request/model/b;->aAs:Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit v0

    return-object p0

    .line 10
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic f(Lorg/json/JSONArray;)Lorg/json/JSONArray;
    .locals 0

    .line 1
    sput-object p0, Lcom/kwad/sdk/core/request/model/b;->aAs:Lorg/json/JSONArray;

    return-object p0
.end method

.method public static h(ZI)Lcom/kwad/sdk/core/request/model/b;
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/request/model/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/request/model/b;-><init>()V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aux:Ljava/lang/String;

    .line 4
    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cL(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAt:Ljava/lang/String;

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cM(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAu:Ljava/lang/String;

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->dn(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAv:Ljava/lang/String;

    .line 7
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getOaid()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->auy:Ljava/lang/String;

    .line 8
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NI()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAF:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NK()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->XF:Ljava/lang/String;

    const/4 v2, 0x1

    .line 10
    iput v2, v0, Lcom/kwad/sdk/core/request/model/b;->XG:I

    .line 11
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NU()I

    move-result v2

    iput v2, v0, Lcom/kwad/sdk/core/request/model/b;->XI:I

    .line 12
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getOsVersion()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAy:Ljava/lang/String;

    .line 13
    invoke-static {}, Lcom/kwad/sdk/utils/k;->getLanguage()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->XJ:Ljava/lang/String;

    .line 14
    invoke-static {v1}, Lcom/kwad/sdk/utils/k;->getScreenHeight(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/kwad/sdk/core/request/model/b;->XM:I

    .line 15
    invoke-static {v1}, Lcom/kwad/sdk/utils/k;->getScreenWidth(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/kwad/sdk/core/request/model/b;->XL:I

    .line 16
    invoke-static {v1}, Lcom/kwad/sdk/utils/k;->cg(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAz:I

    .line 17
    invoke-static {v1}, Lcom/kwad/sdk/utils/k;->ch(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAA:I

    .line 18
    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cJ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAB:Ljava/lang/String;

    if-eqz p0, :cond_0

    .line 19
    invoke-static {v1}, Lcom/kwad/sdk/core/request/model/b;->bu(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAI:Lorg/json/JSONArray;

    .line 20
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAC:Ljava/lang/String;

    .line 21
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NJ()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/kwad/sdk/core/request/model/b;->aAO:J

    .line 22
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NR()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAD:Ljava/lang/String;

    .line 23
    invoke-static {}, Lcom/kwad/sdk/utils/y;->Mt()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAH:Ljava/lang/String;

    .line 24
    const-class p0, Lcom/kwad/sdk/components/g;

    invoke-static {p0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/components/g;

    if-eqz p0, :cond_1

    .line 25
    invoke-interface {p0}, Lcom/kwad/sdk/components/g;->oV()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAG:Ljava/lang/String;

    .line 26
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NS()I

    move-result p0

    iput p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAE:I

    .line 27
    const-class p0, Lcom/kwad/sdk/service/a/f;

    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/kwad/sdk/service/a/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    const-string v2, "DeviceInfo"

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "i="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/kwad/sdk/service/a/f;->getAppId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",n="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    invoke-interface {p0}, Lcom/kwad/sdk/service/a/f;->getAppName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",external:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-interface {p0}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ",v1:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    invoke-interface {p0}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",v2:3.3.63"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",d:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAC:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",dh:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    iget-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAC:Ljava/lang/String;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-string p0, ""

    :goto_0
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ",o:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->auy:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",b:665"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",p:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-static {v1}, Lcom/kwad/sdk/utils/ar;->isInMainProcess(Landroid/content/Context;)Z

    move-result p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ",dy:"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Lcom/kwad/framework/a/a;->aew:Ljava/lang/Boolean;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 34
    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->T(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    :catch_0
    :try_start_2
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NT()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAJ:Ljava/lang/String;

    .line 36
    iput p1, v0, Lcom/kwad/sdk/core/request/model/b;->aAK:I

    .line 37
    invoke-static {}, Lcom/kwad/sdk/core/request/model/b;->zn()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 38
    invoke-static {}, Lcom/kwad/sdk/app/b;->AW()Lcom/kwad/sdk/app/b;

    move-result-object p0

    const-string p1, "com.smile.gifmaker"

    .line 39
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/app/b;->getVersion(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAL:Ljava/lang/String;

    .line 40
    invoke-static {}, Lcom/kwad/sdk/app/b;->AW()Lcom/kwad/sdk/app/b;

    move-result-object p0

    const-string p1, "com.kuaishou.nebula"

    .line 41
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/app/b;->getVersion(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAM:Ljava/lang/String;

    .line 42
    invoke-static {}, Lcom/kwad/sdk/app/b;->AW()Lcom/kwad/sdk/app/b;

    move-result-object p0

    const-string p1, "com.tencent.mm"

    .line 43
    invoke-virtual {p0, v1, p1}, Lcom/kwad/sdk/app/b;->getVersion(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAN:Ljava/lang/String;

    .line 44
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NP()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->Su:Ljava/lang/String;

    .line 45
    invoke-static {v1}, Lcom/kwad/sdk/utils/af;->cu(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAx:Ljava/lang/String;

    .line 46
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NY()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAP:Ljava/lang/String;

    const-string p0, "/data/data"

    .line 47
    invoke-static {p0}, Lcom/kwad/sdk/utils/bj;->hj(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/sdk/core/request/model/b;->aAQ:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 48
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :goto_1
    return-object v0
.end method

.method private static zn()Z
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zn()Z

    move-result v0

    return v0
.end method
