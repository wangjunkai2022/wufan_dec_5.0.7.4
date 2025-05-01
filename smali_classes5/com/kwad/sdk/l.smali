.class public final Lcom/kwad/sdk/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/l$a;
    }
.end annotation


# instance fields
.field private ZL:J

.field private volatile alN:Z

.field private volatile alO:Z

.field private volatile alP:Z

.field private volatile alQ:Ljava/lang/Boolean;

.field private alR:Ljava/lang/String;

.field private alS:I

.field private alT:Z

.field private alU:Lcom/kwad/sdk/api/KsLoadManager;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private alV:J

.field private alW:J

.field private alX:Lcom/kwad/sdk/f;

.field private alY:Lcom/kwad/sdk/f;

.field private alZ:Lcom/kwad/sdk/f;

.field private ama:Lcom/kwad/sdk/f;

.field private volatile amb:Z

.field private amc:Z

.field private amd:Z

.field private ame:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/l;->alN:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/l;->alO:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/sdk/l;->alP:Z

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/kwad/sdk/l;->alQ:Ljava/lang/Boolean;

    const-string v1, ""

    .line 7
    iput-object v1, p0, Lcom/kwad/sdk/l;->alR:Ljava/lang/String;

    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/kwad/sdk/l;->amb:Z

    .line 9
    iput-boolean v1, p0, Lcom/kwad/sdk/l;->amc:Z

    .line 10
    iput-boolean v0, p0, Lcom/kwad/sdk/l;->amd:Z

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/l;-><init>()V

    return-void
.end method

.method private Aa()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/diskcache/a;->bh(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static Ab()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/components/core/s/m;->rI()Lcom/kwad/components/core/s/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/s/m;->init()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static Ac()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/p/b;->rc()Lcom/kwad/components/core/p/b;

    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cs()Z

    move-result v0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Ct()I

    move-result v1

    .line 3
    invoke-static {v0, v1}, Lcom/kwad/components/core/p/b;->f(ZI)V

    return-void
.end method

.method private Ad()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/aw;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static Ae()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/app/b;->AW()Lcom/kwad/sdk/app/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/app/b;->checkInit()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private Af()V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/l$2;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/l$2;-><init>(Lcom/kwad/sdk/l;)V

    invoke-static {v0}, Lcom/kwad/library/solder/lib/i;->a(Lcom/kwad/library/solder/lib/i$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/l;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/l;->alW:J

    return-wide v0
.end method

.method private static a(Lcom/kwad/sdk/api/SdkConfig;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 5
    :try_start_0
    iget-object p0, p0, Lcom/kwad/sdk/api/SdkConfig;->ksInitCallback:Lcom/kwad/sdk/api/KsInitCallback;

    if-eqz p0, :cond_0

    .line 6
    new-instance v0, Lcom/kwad/sdk/l$5;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/l$5;-><init>(Lcom/kwad/sdk/api/KsInitCallback;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->b(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    nop

    :catchall_0
    :cond_0
    return-void
.end method

.method private static a(Lcom/kwad/sdk/api/SdkConfig;Lcom/kwad/sdk/e;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 3
    :try_start_0
    iget-object p0, p0, Lcom/kwad/sdk/api/SdkConfig;->ksInitCallback:Lcom/kwad/sdk/api/KsInitCallback;

    if-eqz p0, :cond_0

    .line 4
    new-instance v0, Lcom/kwad/sdk/l$4;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/l$4;-><init>(Lcom/kwad/sdk/api/KsInitCallback;Lcom/kwad/sdk/e;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    nop

    :catchall_0
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/l;Lcom/kwad/sdk/core/response/model/SdkConfigData;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/sdk/l;->e(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V

    return-void
.end method

.method private static aE(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/utils/ar;->getProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "kssdk_remote"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static b(Lcom/kwad/sdk/api/SdkConfig;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 5
    :try_start_0
    iget-object p0, p0, Lcom/kwad/sdk/api/SdkConfig;->ksStartCallback:Lcom/kwad/sdk/api/KsInitCallback;

    if-eqz p0, :cond_0

    .line 6
    new-instance v0, Lcom/kwad/sdk/l$7;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/l$7;-><init>(Lcom/kwad/sdk/api/KsInitCallback;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->b(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    nop

    :catchall_0
    :cond_0
    return-void
.end method

.method private static b(Lcom/kwad/sdk/api/SdkConfig;Lcom/kwad/sdk/e;)V
    .locals 2

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KSAdSDK notifyStartFail error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/kwad/sdk/e;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_0

    .line 3
    iget-object p0, p0, Lcom/kwad/sdk/api/SdkConfig;->ksStartCallback:Lcom/kwad/sdk/api/KsInitCallback;

    if-eqz p0, :cond_0

    .line 4
    new-instance v0, Lcom/kwad/sdk/l$6;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/l$6;-><init>(Lcom/kwad/sdk/api/KsInitCallback;Lcom/kwad/sdk/e;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/kwad/sdk/l;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/l;->zT()V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/core/a/d;->a(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "autoRT"

    .line 1
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, -0x1

    .line 2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v1, "getAutoRevertTime"

    .line 3
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p0, 0x2710

    .line 4
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v1, "TRANSFORM_API_HOST"

    .line 5
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/network/idc/a;->EE()Lcom/kwad/sdk/core/network/idc/a;

    move-result-object p0

    aget-object p1, p1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "api"

    invoke-virtual {p0, p1, v1}, Lcom/kwad/sdk/core/network/idc/a;->Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string v1, "reportDynamicUpdate"

    .line 7
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 8
    aget-object p0, p1, v2

    check-cast p0, Lorg/json/JSONObject;

    invoke-static {p0}, Lcom/kwad/sdk/commercial/b;->g(Lorg/json/JSONObject;)V

    .line 9
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_3
    const-string p1, "enableDynamic"

    .line 10
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    .line 11
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 12
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/utils/ar;->isInMainProcess(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Lcom/kwad/framework/a/a;->aev:Ljava/lang/Boolean;

    .line 13
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v2, 0x1

    .line 14
    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_5
    return-object v0

    :catchall_0
    move-exception p0

    .line 15
    :try_start_1
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-object v0
.end method

.method public static cd(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/a/d;->am(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ce(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/a/d;->getResponseData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static deleteCache()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/diskcache/b/a;->delete()V

    return-void
.end method

.method private e(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V
    .locals 4

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zN()V

    .line 4
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zX()V

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->yT()Z

    .line 6
    sget-object v0, Lcom/kwad/sdk/core/config/c;->arZ:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/ar;->isInMainProcess(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/api/loader/DynamicInstallReceiver;->registerToApp(Landroid/content/Context;)V

    .line 10
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Db()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-static {}, Lcom/kwad/sdk/n/l;->ON()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/b/a;->init(Landroid/content/Context;)V

    .line 12
    :cond_3
    invoke-static {}, Lcom/kwad/sdk/l;->Ac()V

    .line 13
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/ba;->init(Landroid/content/Context;)V

    .line 14
    invoke-static {}, Lcom/kwad/components/core/a/a;->mR()Lcom/kwad/components/core/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/a/a;->eG()V

    .line 15
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide/16 v1, 0x7530

    new-instance v3, Lcom/kwad/sdk/l$9;

    invoke-direct {v3, p0}, Lcom/kwad/sdk/l$9;-><init>(Lcom/kwad/sdk/l;)V

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/f;->a(Landroid/content/Context;JLcom/kwad/sdk/collector/h;)V

    .line 16
    invoke-static {}, Lcom/kwad/sdk/core/network/idc/a;->EE()Lcom/kwad/sdk/core/network/idc/a;

    move-result-object v0

    .line 17
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dc()Lcom/kwad/sdk/core/network/idc/a/b;

    move-result-object v1

    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dd()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/network/idc/a;->a(Lcom/kwad/sdk/core/network/idc/a/b;I)V

    .line 18
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/SdkConfigData;->httpDnsInfo:Lcom/kwad/sdk/core/response/model/HttpDnsInfo;

    invoke-static {v0}, Lcom/kwad/sdk/ip/direct/a;->a(Lcom/kwad/sdk/core/response/model/HttpDnsInfo;)V

    .line 19
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->De()J

    move-result-wide v0

    .line 20
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Df()I

    move-result v2

    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 21
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/bl;->a(JILandroid/content/Context;)V

    .line 22
    invoke-static {}, Lcom/kwad/sdk/l;->Ae()V

    .line 23
    invoke-direct {p0}, Lcom/kwad/sdk/l;->Aa()V

    .line 24
    invoke-static {}, Lcom/kwad/components/core/h/a;->pd()Lcom/kwad/components/core/h/a;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/h/a;->aj(Landroid/content/Context;)V

    .line 25
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atK:Lcom/kwad/sdk/core/config/item/q;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/q;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/crash/online/monitor/a;->cM(Ljava/lang/String;)V

    .line 26
    invoke-static {}, Lcom/kwad/sdk/core/imageloader/ImageLoaderPerfUtil;->report()V

    .line 27
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atR:Lcom/kwad/sdk/core/config/item/q;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/q;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/m/e;->cM(Ljava/lang/String;)V

    .line 28
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atT:Lcom/kwad/sdk/core/config/item/q;

    .line 29
    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/q;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/threads/c;->cM(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/kwad/sdk/i/a;->Kb()V

    .line 31
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    new-instance v2, Lcom/kwad/sdk/l$10;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/l$10;-><init>(Lcom/kwad/sdk/l;)V

    invoke-virtual {p1, v1, v2}, Lcom/kwad/sdk/core/response/model/SdkConfigData;->getAppConfigData(Ljava/lang/Object;Lcom/kwad/sdk/f/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 33
    invoke-static {v0, p1}, Lcom/kwad/sdk/n/l;->x(Landroid/content/Context;Z)V

    .line 34
    sget-object p1, Lcom/kwad/sdk/core/config/c;->auk:Lcom/kwad/sdk/core/config/item/k;

    invoke-static {p1}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/k;)I

    move-result p1

    invoke-static {p1}, Lcom/kwad/sdk/kgeo/a;->dC(I)V

    .line 35
    :try_start_0
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/g;->tc()Lcom/kwad/components/core/webview/tachikoma/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/components/core/webview/tachikoma/g;->init()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 36
    invoke-static {p1}, Lcom/kwad/components/core/d/a;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private e(Lcom/kwad/sdk/f/a;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/l$8;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/l$8;-><init>(Lcom/kwad/sdk/l;Lcom/kwad/sdk/f/a;)V

    invoke-static {v0}, Lcom/kwad/components/core/request/g;->a(Lcom/kwad/components/core/request/g$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Ljava/util/Map;)V
    .locals 0
    .param p0    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 37
    invoke-static {p0}, Lcom/kwad/sdk/core/a/d;->g(Ljava/util/Map;)V

    return-void
.end method

.method public static getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public static getAppInfo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/request/model/a;->FI()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static getAppName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/api/SdkConfig;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static getDeviceInfo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/request/model/b;->FK()Lcom/kwad/sdk/core/request/model/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static getDid()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getNetworkInfo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/request/model/d;->FN()Lcom/kwad/sdk/core/request/model/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static getSDKVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "3.3.63"

    return-object v0
.end method

.method public static getSdkConfig()Lcom/kwad/sdk/api/SdkConfig;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    return-object v0
.end method

.method public static isDebugLogEnable()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/api/SdkConfig;->enableDebug:Z

    return v0
.end method

.method public static k(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static newInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/service/b;->h(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 3
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static pauseCurrentPlayer()V
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    return-void
.end method

.method public static resumeCurrentPlayer()V
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/components/a/a/a;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    return-void
.end method

.method public static setLoadingLottieAnimation(ZI)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param

    .line 1
    const-class p0, Lcom/kwad/components/a/a/a;

    invoke-static {p0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    return-void
.end method

.method public static setLoadingLottieAnimationColor(ZI)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    const-class p0, Lcom/kwad/components/a/a/a;

    invoke-static {p0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    return-void
.end method

.method public static setThemeMode(I)V
    .locals 0

    .line 1
    const-class p0, Lcom/kwad/components/a/a/a;

    invoke-static {p0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    return-void
.end method

.method public static zJ()Lcom/kwad/sdk/l;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/l$a;->Am()Lcom/kwad/sdk/l;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized zL()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/n;->aI(Landroid/content/Context;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private zM()V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/l;->ZL:J

    .line 3
    invoke-static {}, Lcom/kwad/sdk/service/b;->init()V

    .line 4
    invoke-static {}, Lcom/kwad/sdk/j;->yP()V

    .line 5
    invoke-static {}, Lcom/kwad/sdk/l;->zU()V

    .line 6
    invoke-static {}, Lcom/kwad/sdk/l;->zV()V

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/l;->zK()Z

    move-result v2

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "initSDKModule enableInitStartMode: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 9
    iget-object v3, p0, Lcom/kwad/sdk/l;->alX:Lcom/kwad/sdk/f;

    if-nez v3, :cond_0

    .line 10
    iget-wide v3, p0, Lcom/kwad/sdk/l;->alV:J

    invoke-static {v3, v4}, Lcom/kwad/sdk/f;->W(J)Lcom/kwad/sdk/f;

    move-result-object v3

    iput-object v3, p0, Lcom/kwad/sdk/l;->alX:Lcom/kwad/sdk/f;

    :cond_0
    if-nez v2, :cond_1

    .line 11
    iget-object v3, p0, Lcom/kwad/sdk/l;->alX:Lcom/kwad/sdk/f;

    invoke-virtual {v3}, Lcom/kwad/sdk/f;->report()V

    .line 12
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/l;->zO()V

    .line 13
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zY()V

    .line 14
    invoke-static {}, Lcom/kwad/sdk/l;->zZ()V

    .line 15
    invoke-direct {p0}, Lcom/kwad/sdk/l;->Af()V

    .line 16
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zS()V

    if-nez v2, :cond_2

    const/4 v3, 0x0

    .line 17
    invoke-direct {p0, v3}, Lcom/kwad/sdk/l;->e(Lcom/kwad/sdk/f/a;)V

    .line 18
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/l;->zP()V

    .line 19
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zQ()V

    .line 20
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zR()V

    .line 21
    invoke-static {}, Lcom/kwad/sdk/l;->zW()V

    .line 22
    invoke-direct {p0}, Lcom/kwad/sdk/l;->Ad()V

    .line 23
    invoke-static {}, Lcom/kwad/sdk/l;->Ab()V

    .line 24
    invoke-static {}, Lcom/kwad/sdk/n/k;->OL()V

    if-nez v2, :cond_3

    .line 25
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kwad/sdk/a/a/c;->Aw()V

    .line 26
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kwad/components/core/o/a;->qJ()V

    .line 27
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v0

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "KSAdSDK init time:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "KSAdSDK"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SDK_VERSION_NAME: 3.3.63 TK_VERSION_CODE: 6.0.7 BRIDGE_VERSION: 1.3"

    .line 29
    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/kwad/sdk/l;->alY:Lcom/kwad/sdk/f;

    if-nez v0, :cond_4

    .line 31
    invoke-static {v3, v4}, Lcom/kwad/sdk/f;->X(J)Lcom/kwad/sdk/f;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/l;->alY:Lcom/kwad/sdk/f;

    :cond_4
    if-nez v2, :cond_5

    .line 32
    iget-object v0, p0, Lcom/kwad/sdk/l;->alY:Lcom/kwad/sdk/f;

    invoke-virtual {v0}, Lcom/kwad/sdk/f;->report()V

    .line 33
    :cond_5
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/l;->a(Lcom/kwad/sdk/api/SdkConfig;)V

    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/kwad/sdk/l;->alN:Z

    return-void
.end method

.method private zN()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/l$3;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/l$3;-><init>(Lcom/kwad/sdk/l;)V

    iget-boolean v1, p0, Lcom/kwad/sdk/l;->alT:Z

    invoke-static {v0, v1}, Lcom/kwad/sdk/commercial/b;->a(Lcom/kwad/sdk/commercial/b$a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zO()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/components/b;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zP()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/core/d/a;->initAsync(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private zQ()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private zR()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/core/n/b/b;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private zS()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/l;->ame:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/y;->ah(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/sdk/l;->ame:Ljava/lang/String;

    return-void
.end method

.method private static zT()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atU:Lcom/kwad/sdk/core/config/item/q;

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/config/item/q;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/u;->parseJSON2MapString(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 4
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 5
    invoke-static {v2, v3}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->q(Ljava/lang/String;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/core/threads/GlobalThreadPools;->Gk()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zU()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/api/SdkConfig;->enableDebug:Z

    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->init(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zV()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/n/e;->OH()Lcom/kwad/sdk/n/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/n/e;->init()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zW()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/c/b;->En()Lcom/kwad/sdk/core/c/b;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/c/b;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private zX()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/webview/b/a;->HG()Lcom/kwad/sdk/core/webview/b/a;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/b/a;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private zY()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/network/idc/a;->EE()Lcom/kwad/sdk/core/network/idc/a;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/network/idc/a;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zZ()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/download/a;->bi(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final Ag()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/l;->zK()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alN:Z

    return v0

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alN:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alO:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final Ah()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/l;->ZL:J

    return-wide v0
.end method

.method public final getAdManager()Lcom/kwad/sdk/api/KsLoadManager;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/l;->alU:Lcom/kwad/sdk/api/KsLoadManager;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/b;

    invoke-direct {v0}, Lcom/kwad/components/core/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/l;->alU:Lcom/kwad/sdk/api/KsLoadManager;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/l;->alU:Lcom/kwad/sdk/api/KsLoadManager;

    return-object v0
.end method

.method public final getApiVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/l;->alR:Ljava/lang/String;

    return-object v0
.end method

.method public final getApiVersionCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/sdk/l;->alS:I

    return v0
.end method

.method public final declared-synchronized init(Landroid/content/Context;Lcom/kwad/sdk/api/SdkConfig;)V
    .locals 3

    monitor-enter p0

    const/16 v0, 0x2712

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 1
    :try_start_0
    iget-object v1, p2, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "init appId:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p2, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "--mIsSdkInit:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/kwad/sdk/l;->alN:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 3
    iget-boolean v1, p0, Lcom/kwad/sdk/l;->alN:Z

    if-eqz v1, :cond_1

    .line 4
    invoke-static {p2}, Lcom/kwad/sdk/service/ServiceProvider;->c(Lcom/kwad/sdk/api/SdkConfig;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    monitor-exit p0

    return-void

    .line 6
    :cond_1
    :try_start_1
    invoke-static {p2}, Lcom/kwad/sdk/service/ServiceProvider;->c(Lcom/kwad/sdk/api/SdkConfig;)V

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->bP(Landroid/content/Context;)V

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/l;->aE(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "intKSRemoteProcess appId="

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p2, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lv()V

    .line 11
    invoke-static {}, Lcom/kwad/sdk/j;->yP()V

    .line 12
    invoke-static {}, Lcom/kwad/sdk/l;->zU()V

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lcom/kwad/sdk/l;->alN:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    .line 14
    :cond_2
    :try_start_2
    invoke-static {}, Lcom/kwad/sdk/n;->Ao()V

    .line 15
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zM()V

    .line 16
    invoke-static {p1}, Lcom/kwad/sdk/n;->aH(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 17
    :try_start_3
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-static {p1, v1}, Lcom/kwad/sdk/n;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 19
    new-instance p1, Lcom/kwad/sdk/e;

    invoke-direct {p1, v0, v1}, Lcom/kwad/sdk/e;-><init>(ILjava/lang/String;)V

    invoke-static {p2, p1}, Lcom/kwad/sdk/l;->a(Lcom/kwad/sdk/api/SdkConfig;Lcom/kwad/sdk/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 20
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 21
    :cond_3
    :goto_0
    :try_start_4
    sget-object p1, Lcom/kwad/sdk/e;->alt:Lcom/kwad/sdk/e;

    invoke-static {p2, p1}, Lcom/kwad/sdk/l;->a(Lcom/kwad/sdk/api/SdkConfig;Lcom/kwad/sdk/e;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 22
    monitor-exit p0

    return-void

    .line 23
    :goto_1
    :try_start_5
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    .line 24
    invoke-static {p1, v1}, Lcom/kwad/sdk/n;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 25
    new-instance p1, Lcom/kwad/sdk/e;

    invoke-direct {p1, v0, v1}, Lcom/kwad/sdk/e;-><init>(ILjava/lang/String;)V

    invoke-static {p2, p1}, Lcom/kwad/sdk/l;->a(Lcom/kwad/sdk/api/SdkConfig;Lcom/kwad/sdk/e;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 26
    :goto_2
    monitor-exit p0

    return-void

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final newComponentProxy(Ljava/lang/Class;Ljava/lang/Object;)Lcom/kwad/sdk/api/proxy/IComponentProxy;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/kwad/sdk/api/proxy/IComponentProxy;",
            ">(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/service/b;->g(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_2

    .line 2
    instance-of v1, p2, Lcom/kwad/sdk/api/proxy/BaseProxyActivity;

    if-eqz v1, :cond_0

    .line 3
    const-class v0, Lcom/kwad/components/core/proxy/a;

    goto :goto_0

    .line 4
    :cond_0
    instance-of p2, p2, Lcom/kwad/sdk/api/proxy/BaseProxyFragmentActivity;

    if-eqz p2, :cond_1

    .line 5
    const-class v0, Lcom/kwad/components/core/proxy/b;

    .line 6
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "--getIsExternal:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/l;->yV()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "--mIsSdkInit:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p0}, Lcom/kwad/sdk/l;->yY()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "--componentClass"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-static {p2}, Lcom/kwad/components/core/d/a;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    .line 10
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/api/proxy/IComponentProxy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 11
    invoke-static {p1}, Lcom/kwad/components/core/d/a;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final setAdxEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/l;->amd:Z

    return-void
.end method

.method public final setApiVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/l;->alR:Ljava/lang/String;

    return-void
.end method

.method public final setApiVersionCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/l;->alS:I

    return-void
.end method

.method public final setAppTag(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alN:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/sdk/l;->ame:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/y;->ah(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/kwad/sdk/l;->ame:Ljava/lang/String;

    return-void
.end method

.method public final setInitStartTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/l;->alW:J

    return-void
.end method

.method public final setIsExternal(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/l;->alT:Z

    return-void
.end method

.method public final setLaunchTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/l;->alV:J

    return-void
.end method

.method public final setPersonalRecommend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/l;->amb:Z

    return-void
.end method

.method public final setProgrammaticRecommend(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/l;->amc:Z

    return-void
.end method

.method public final declared-synchronized start()V
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/kwad/sdk/l;->alZ:Lcom/kwad/sdk/f;

    if-nez v2, :cond_0

    .line 3
    iget-wide v2, p0, Lcom/kwad/sdk/l;->alV:J

    invoke-static {v2, v3}, Lcom/kwad/sdk/f;->Y(J)Lcom/kwad/sdk/f;

    move-result-object v2

    iput-object v2, p0, Lcom/kwad/sdk/l;->alZ:Lcom/kwad/sdk/f;

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/kwad/sdk/l;->alZ:Lcom/kwad/sdk/f;

    invoke-virtual {v2}, Lcom/kwad/sdk/f;->report()V

    const/4 v2, 0x0

    .line 5
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v3

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/l;->zK()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_1

    .line 7
    invoke-static {v3}, Lcom/kwad/sdk/l;->b(Lcom/kwad/sdk/api/SdkConfig;)V

    const/4 v2, 0x1

    .line 8
    :cond_1
    iget-boolean v4, p0, Lcom/kwad/sdk/l;->alN:Z

    if-nez v4, :cond_2

    .line 9
    sget-object v2, Lcom/kwad/sdk/e;->alu:Lcom/kwad/sdk/e;

    invoke-static {v3, v2}, Lcom/kwad/sdk/l;->b(Lcom/kwad/sdk/api/SdkConfig;Lcom/kwad/sdk/e;)V

    const/4 v2, 0x1

    .line 10
    :cond_2
    iget-boolean v4, p0, Lcom/kwad/sdk/l;->alO:Z

    if-eqz v4, :cond_3

    .line 11
    invoke-static {v3}, Lcom/kwad/sdk/l;->b(Lcom/kwad/sdk/api/SdkConfig;)V

    const/4 v2, 0x1

    :cond_3
    if-nez v2, :cond_6

    .line 12
    new-instance v2, Lcom/kwad/sdk/l$1;

    invoke-direct {v2, p0}, Lcom/kwad/sdk/l$1;-><init>(Lcom/kwad/sdk/l;)V

    invoke-direct {p0, v2}, Lcom/kwad/sdk/l;->e(Lcom/kwad/sdk/f/a;)V

    .line 13
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/sdk/a/a/c;->Aw()V

    .line 14
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kwad/components/core/o/a;->qJ()V

    .line 15
    iget-object v2, p0, Lcom/kwad/sdk/l;->alX:Lcom/kwad/sdk/f;

    if-eqz v2, :cond_4

    .line 16
    invoke-virtual {v2}, Lcom/kwad/sdk/f;->report()V

    .line 17
    :cond_4
    iget-object v2, p0, Lcom/kwad/sdk/l;->alY:Lcom/kwad/sdk/f;

    if-eqz v2, :cond_5

    .line 18
    invoke-virtual {v2}, Lcom/kwad/sdk/f;->report()V

    .line 19
    :cond_5
    iput-boolean v5, p0, Lcom/kwad/sdk/l;->alO:Z

    .line 20
    invoke-static {v3}, Lcom/kwad/sdk/l;->b(Lcom/kwad/sdk/api/SdkConfig;)V

    .line 21
    :cond_6
    iget-object v2, p0, Lcom/kwad/sdk/l;->ama:Lcom/kwad/sdk/f;

    if-nez v2, :cond_7

    .line 22
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 23
    invoke-static {v2, v3}, Lcom/kwad/sdk/f;->Z(J)Lcom/kwad/sdk/f;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/l;->ama:Lcom/kwad/sdk/f;

    .line 24
    :cond_7
    iget-object v0, p0, Lcom/kwad/sdk/l;->alZ:Lcom/kwad/sdk/f;

    invoke-virtual {v0}, Lcom/kwad/sdk/f;->report()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 26
    :try_start_1
    invoke-static {v0}, Lcom/kwad/sdk/n;->l(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final unInit()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/download/b;->DO()Lcom/kwad/sdk/core/download/b;

    move-result-object v0

    invoke-static {}, Lcom/kwad/sdk/l;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/download/b;->bk(Landroid/content/Context;)V

    return-void
.end method

.method public final yV()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alT:Z

    return v0
.end method

.method public final yW()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->amb:Z

    return v0
.end method

.method public final yX()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->amc:Z

    return v0
.end method

.method public final yY()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alN:Z

    return v0
.end method

.method public final declared-synchronized zK()Z
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/kwad/sdk/l;->zL()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    monitor-exit p0

    return v1

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/kwad/sdk/l;->alQ:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zK()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/l;->alQ:Ljava/lang/Boolean;

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/sdk/l;->alQ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_2

    .line 6
    monitor-exit p0

    return v1

    .line 7
    :cond_2
    :try_start_2
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alP:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 8
    monitor-exit p0

    return v2

    .line 9
    :cond_3
    :try_start_3
    const-class v0, Lcom/kwad/sdk/api/core/IKsAdSDK;

    const-string v3, "start"

    new-array v4, v1, [Ljava/lang/Class;

    .line 10
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    .line 11
    :cond_4
    iput-boolean v1, p0, Lcom/kwad/sdk/l;->alP:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 12
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "enableInitStartMode return mApiHadStartMethod: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/kwad/sdk/l;->alP:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    iget-boolean v0, p0, Lcom/kwad/sdk/l;->alP:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return v0

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method
