.class public Lcom/efs/sdk/fluttersdk/FlutterManager;
.super Ljava/lang/Object;


# static fields
.field public static final TAG:Ljava/lang/String; = "FlutterManager"

.field private static a:Lcom/efs/sdk/base/EfsReporter; = null

.field private static b:Lcom/efs/sdk/fluttersdk/FlutterConfigManager; = null

.field private static c:Landroid/content/Context; = null

.field public static isDebug:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCloudConfig()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->b:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->getCloudConfig()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getFlutterConfigManager()Lcom/efs/sdk/fluttersdk/FlutterConfigManager;
    .locals 1

    sget-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->b:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    return-object v0
.end method

.method public static getLongValue(Ljava/lang/String;)J
    .locals 5

    sget-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->c:Landroid/content/Context;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    const-string p0, "FlutterManager"

    const-string v0, "Flutter Manager not init!"

    invoke-static {p0, v0}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-wide v1

    :cond_0
    :try_start_0
    const-string v3, "efs_flutter_bridge"

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-wide v0

    :catchall_0
    return-wide v1
.end method

.method public static getNativeParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->b:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->getNativeParams()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getReporter()Lcom/efs/sdk/base/EfsReporter;
    .locals 1

    sget-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->a:Lcom/efs/sdk/base/EfsReporter;

    return-object v0
.end method

.method public static init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 1

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sput-object p0, Lcom/efs/sdk/fluttersdk/FlutterManager;->c:Landroid/content/Context;

    sput-object p1, Lcom/efs/sdk/fluttersdk/FlutterManager;->a:Lcom/efs/sdk/base/EfsReporter;

    new-instance v0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-direct {v0, p0, p1}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    sput-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->b:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    return-void

    :cond_1
    :goto_0
    const-string p0, "FlutterManager"

    const-string p1, "init Flutter manager error! parameter is null!"

    invoke-static {p0, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static putLongValue(Ljava/lang/String;J)Z
    .locals 3

    sget-object v0, Lcom/efs/sdk/fluttersdk/FlutterManager;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string p0, "FlutterManager"

    const-string p1, "Flutter Manager not init!"

    invoke-static {p0, p1}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    :try_start_0
    const-string v2, "efs_flutter_bridge"

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    return v1
.end method
