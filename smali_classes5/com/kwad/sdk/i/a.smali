.class public Lcom/kwad/sdk/i/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/i/a$b;,
        Lcom/kwad/sdk/i/a$a;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Kb()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/i/a$1;

    invoke-direct {v0}, Lcom/kwad/sdk/i/a$1;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static Kc()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CK()Lcom/kwad/sdk/core/response/model/SdkConfigData;

    move-result-object v0

    new-instance v1, Lcom/kwad/sdk/i/a$2;

    invoke-direct {v1}, Lcom/kwad/sdk/i/a$2;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/kwad/sdk/core/response/model/SdkConfigData;->getAppConfigData(Ljava/lang/Object;Lcom/kwad/sdk/f/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v1, Lcom/kwad/sdk/i/a$b;

    invoke-direct {v1}, Lcom/kwad/sdk/i/a$b;-><init>()V

    .line 3
    :try_start_0
    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    iget v0, v1, Lcom/kwad/sdk/i/a$b;->aKN:I

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/kwad/sdk/i/a;->a(Ljava/lang/ClassLoader;Lcom/kwad/sdk/i/a$b;)Lcom/kwad/sdk/i/a$a;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-static {}, Lcom/kwad/sdk/commercial/c;->Br()Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    const-string v2, "ad_client_apm_log"

    .line 7
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/commercial/c;->cz(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    const-wide v2, 0x3f847ae147ae147bL    # 0.01

    .line 8
    invoke-virtual {v1, v2, v3}, Lcom/kwad/sdk/commercial/c;->i(D)Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    const-string v2, "ad_sdk_tt_sdk_info"

    const-string v3, "sv"

    .line 9
    invoke-virtual {v1, v2, v3}, Lcom/kwad/sdk/commercial/c;->N(Ljava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/commercial/c;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Lcom/kwad/sdk/commercial/c;->t(Lcom/kwad/sdk/commercial/c/a;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    sget-object v1, Lcom/kwai/adclient/kscommerciallogger/model/a;->aUS:Lcom/kwai/adclient/kscommerciallogger/model/d;

    .line 11
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/commercial/c;->a(Lcom/kwai/adclient/kscommerciallogger/model/d;)Lcom/kwad/sdk/commercial/c;

    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/kwad/sdk/commercial/b;->d(Lcom/kwad/sdk/commercial/c;)V

    :catchall_0
    :cond_2
    return-void
.end method

.method private static a(Ljava/lang/ClassLoader;Lcom/kwad/sdk/i/a$b;)Lcom/kwad/sdk/i/a$a;
    .locals 4
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/kwad/sdk/i/a$b;->aKO:Ljava/lang/String;

    invoke-static {v0, p0}, Lcom/kwad/sdk/utils/s;->a(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    new-instance v0, Lcom/kwad/sdk/i/a$a;

    invoke-direct {v0}, Lcom/kwad/sdk/i/a$a;-><init>()V

    .line 3
    iget-object v1, p1, Lcom/kwad/sdk/i/a$b;->aKP:Ljava/lang/String;

    invoke-static {v1}, Lcom/kwad/sdk/utils/s;->classExists(Ljava/lang/String;)Z

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/i/a$a;->aKM:I

    .line 4
    iget-object v1, p1, Lcom/kwad/sdk/i/a$b;->aKQ:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v3}, Lcom/kwad/sdk/utils/s;->callStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 5
    iget-object v1, p1, Lcom/kwad/sdk/i/a$b;->aKR:Ljava/lang/String;

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p0, v1, v3}, Lcom/kwad/sdk/utils/s;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/sdk/i/a$a;->sdkVersion:Ljava/lang/String;

    .line 6
    iget-object p1, p1, Lcom/kwad/sdk/i/a$b;->aKS:Ljava/lang/String;

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/kwad/sdk/utils/s;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    iput-object p0, v0, Lcom/kwad/sdk/i/a$a;->aGE:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic qT()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/kwad/sdk/i/a;->Kc()V

    return-void
.end method
