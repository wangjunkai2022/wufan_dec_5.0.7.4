.class public Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final a:I

.field private b:Lcom/efs/sdk/base/EfsReporter;

.field private c:I

.field private d:Z

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "H5ConfigMananger"

    .line 2
    iput-object v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->TAG:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->a:I

    .line 4
    iput v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    .line 5
    iput-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    .line 6
    iput-object p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->mContext:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b:Lcom/efs/sdk/base/EfsReporter;

    const-string p1, "apm_native_h5perf_sampling_rate"

    .line 8
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;

    invoke-direct {v0, p0}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$1;-><init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)V

    invoke-virtual {p2, p1, v0}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    return-void
.end method

.method static synthetic a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    return p0
.end method

.method static synthetic a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    return p1
.end method

.method static synthetic a(I)Z
    .locals 3

    .line 4
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-eqz p0, :cond_2

    const/16 v0, 0x64

    if-ne p0, v0, :cond_1

    return v1

    .line 5
    :cond_1
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    .line 6
    invoke-virtual {v2, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-gt v0, p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    return p1
.end method

.method static synthetic b(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;)Lcom/efs/sdk/base/EfsReporter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->b:Lcom/efs/sdk/base/EfsReporter;

    return-object p0
.end method


# virtual methods
.method public generateLaunchOptions()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    if-nez v0, :cond_1

    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    sget-boolean v0, Lcom/efs/sdk/h5pagesdk/H5Manager;->isDebug:Z

    if-eqz v0, :cond_0

    const-string v0, "H5ConfigMananger"

    const-string v1, "\u91c7\u6837\u672a\u547d\u4e2d\uff0c\u5e76\u4e14\u4e0d\u5904\u4e8e\u96c6\u6210\u6d4b\u8bd5\u6a21\u5f0f"

    .line 3
    invoke-static {v0, v1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, ""

    return-object v0

    .line 4
    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "sample"

    .line 5
    iget v2, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->c:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 6
    iget-boolean v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "sampleResult"

    if-eqz v1, :cond_2

    :try_start_1
    const-string v1, "Y"

    .line 7
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_2
    const-string v1, "N"

    .line 8
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->mContext:Landroid/content/Context;

    if-eqz v1, :cond_3

    const-string v2, "appName"

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v1, "bridgeVersion"

    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 12
    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    .line 13
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isH5TracerEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    return v0
.end method

.method public sendData(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;->d:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/efs/sdk/base/integrationtesting/IntegrationTestingUtil;->isIntegrationTestingInPeriod()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;

    invoke-direct {v0, p0, p1}, Lcom/efs/sdk/h5pagesdk/H5ConfigMananger$2;-><init>(Lcom/efs/sdk/h5pagesdk/H5ConfigMananger;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/efs/sdk/h5pagesdk/a;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
