.class public Lcom/efs/sdk/fluttersdk/FlutterConfigManager;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/efs/sdk/base/EfsReporter;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Z

.field private i:Landroid/content/Context;

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "FlutterConfigManager"

    iput-object v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->b:I

    iput v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->d:I

    iput v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->e:I

    iput v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->f:I

    iput v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->g:I

    iput-boolean v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->h:Z

    iput-boolean v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->j:Z

    iput-object p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->i:Landroid/content/Context;

    iput-object p2, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string p1, "flutter_pv_sampling_rate"

    const-string v0, "flutter_pv_max_count"

    const-string v1, "flutter_dart_exception_state"

    const-string v2, "flutter_dart_exception_max_count"

    filled-new-array {p1, v0, v1, v2}, [Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;

    invoke-direct {v0, p0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;-><init>(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;)V

    invoke-virtual {p2, p1, v0}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    return-void
.end method

.method static synthetic a(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;)I
    .locals 0

    iget p0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->d:I

    return p0
.end method

.method static synthetic a(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    .locals 0

    iput p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->d:I

    return p1
.end method

.method static synthetic a(I)Z
    .locals 3

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

    :cond_1
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-gt v0, p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    .locals 0

    iput p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->e:I

    return p1
.end method

.method static synthetic b(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->j:Z

    return v0
.end method

.method static synthetic c(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    .locals 0

    iput p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->f:I

    return p1
.end method

.method static synthetic d(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    .locals 0

    iput p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->g:I

    return p1
.end method


# virtual methods
.method public getCloudConfig()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "flutter_pv_max_count"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "flutter_dart_exception_state"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "flutter_dart_exception_max_count"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "flutter_pv_sampling_hit"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getNativeParams()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "temperature"

    iget-boolean v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->j:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->i:Landroid/content/Context;

    invoke-virtual {v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "battery"

    const-string v4, "level"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v0, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "disk_ratio"

    new-instance v2, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x12

    if-lt v3, v4, :cond_1

    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v3

    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v6

    mul-long v6, v6, v3

    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v8

    :goto_0
    mul-long v8, v8, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCount()I

    move-result v6

    int-to-long v6, v6

    mul-long v6, v6, v3

    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v2

    int-to-long v8, v2

    goto :goto_0

    :goto_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "%.2f"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    long-to-double v8, v8

    long-to-double v6, v6

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v6

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    mul-double v8, v8, v6

    :try_start_2
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->getInstance()Lcom/efs/sdk/base/core/config/GlobalInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->getGlobalInfo()Lcom/efs/sdk/base/core/config/GlobalInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalInfo;->getGlobalInfoMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v0

    invoke-virtual {v0}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getPublicParamMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-object v2, v1

    :catchall_1
    move-object v1, v2

    :goto_2
    return-object v1
.end method

.method public isFlutterEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->h:Z

    return v0
.end method
