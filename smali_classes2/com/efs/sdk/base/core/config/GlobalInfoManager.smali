.class public Lcom/efs/sdk/base/core/config/GlobalInfoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/core/config/GlobalInfoManager$a;
    }
.end annotation


# instance fields
.field private a:Lcom/efs/sdk/base/core/config/GlobalInfo;

.field private b:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v0

    iget-object v0, v0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    iput-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/core/config/GlobalInfoManager;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    const-string v1, "com.umeng.commonsdk.statistics.common.DeviceConfig"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_1
    const-string v4, "getSid"

    new-array v5, v3, [Ljava/lang/Class;

    .line 2
    const-class v6, Landroid/content/Context;

    aput-object v6, v5, v2

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    :try_start_2
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v2

    .line 3
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, p0

    :catch_2
    :cond_1
    return-object v0
.end method

.method public static getInstance()Lcom/efs/sdk/base/core/config/GlobalInfoManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/config/GlobalInfoManager$a;->a()Lcom/efs/sdk/base/core/config/GlobalInfoManager;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getGlobalInfo()Lcom/efs/sdk/base/core/config/GlobalInfo;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v2, "um_session_id"

    invoke-virtual {v1, v2, v0}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "refreshSessionId caused error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "efs.info.manager"

    invoke-static {v1, v0}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    return-object v0
.end method

.method public getNetStatus()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v1, "net"

    const-string v2, "disconnected"

    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public initGlobalInfo()V
    .locals 6

    const-string v0, "2G/3G"

    const-string v1, "ballack"

    const-string v2, "initGlobalInfo called once."

    .line 1
    invoke-static {v1, v2}, Lcom/efs/sdk/base/core/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-direct {v1}, Lcom/efs/sdk/base/core/config/GlobalInfo;-><init>()V

    iput-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 3
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v2

    invoke-virtual {v2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getAppid()Ljava/lang/String;

    move-result-object v2

    const-string v3, "appid"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-static {}, Lcom/efs/sdk/base/core/util/ProcessUtil;->myPid()I

    move-result v1

    .line 5
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "pid"

    invoke-virtual {v2, v4, v3}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-static {v1}, Lcom/efs/sdk/base/core/util/ProcessUtil;->getProcessName(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "ps"

    invoke-virtual {v2, v3, v1}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/efs/sdk/base/core/util/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v3, "wid"

    invoke-virtual {v2, v3, v1}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v2

    invoke-virtual {v2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "uid"

    if-eqz v2, :cond_0

    .line 10
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-virtual {v2, v3, v1}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v2

    invoke-virtual {v2}, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    :goto_0
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->a()Lcom/efs/sdk/base/core/a/a;

    invoke-static {}, Lcom/efs/sdk/base/core/a/a;->b()J

    move-result-wide v2

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "stime"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/efs/sdk/base/core/util/PackageUtil;->getPackageName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pkg"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/efs/sdk/base/core/util/PackageUtil;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ver"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/efs/sdk/base/core/util/PackageUtil;->getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "vcode"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v2, "sdk_ver"

    const-string v3, "1.3.18.umeng"

    invoke-virtual {v1, v2, v3}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 18
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, "brand"

    .line 19
    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 21
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v2, :cond_1

    const-string v3, "unknown"

    goto :goto_1

    :cond_1
    const-string v3, " "

    const-string v4, "-"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "_"

    .line 22
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    :goto_1
    const-string v4, "model"

    .line 23
    invoke-virtual {v1, v4, v3}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v3, "build_model"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    iget v3, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "dsp_w"

    invoke-virtual {v2, v4, v3}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "dsp_h"

    invoke-virtual {v2, v3, v1}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v2, "fr"

    const-string v3, "android"

    invoke-virtual {v1, v2, v3}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 31
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v3, "rom"

    .line 32
    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 34
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "sdk"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 37
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "lang"

    .line 38
    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    .line 40
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v2

    const-string v3, "tzone"

    .line 41
    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkType(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "net"

    invoke-virtual {v1, v3, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    :try_start_0
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkAccessMode(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    const-string v2, "Wi-Fi"

    const/4 v3, 0x0

    .line 44
    aget-object v4, v1, v3

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "um_access"

    if-eqz v2, :cond_2

    .line 45
    :try_start_1
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v2, "wifi"

    invoke-virtual {v0, v4, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 46
    :cond_2
    aget-object v2, v1, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 47
    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    invoke-virtual {v2, v4, v0}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    .line 48
    :cond_3
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v2, "unknow"

    invoke-virtual {v0, v4, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    const-string v0, ""

    const/4 v2, 0x1

    .line 49
    aget-object v3, v1, v2

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 50
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v3, "um_access_subtype"

    aget-object v1, v1, v2

    invoke-virtual {v0, v3, v1}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    :cond_4
    iget-object v0, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v1, "um_network_type"

    iget-object v2, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkTypeUmeng(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public refreshNetStatus()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/core/controller/ControllerCenter;->getGlobalEnvStruct()Lcom/efs/sdk/base/core/config/GlobalEnvStruct;

    move-result-object v0

    iget-object v0, v0, Lcom/efs/sdk/base/core/config/GlobalEnvStruct;->mAppContext:Landroid/content/Context;

    .line 2
    invoke-static {v0}, Lcom/efs/sdk/base/core/util/NetworkUtil;->getNetworkType(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "network change: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "efs.info.manager"

    invoke-static {v2, v1}, Lcom/efs/sdk/base/core/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/efs/sdk/base/core/config/GlobalInfoManager;->a:Lcom/efs/sdk/base/core/config/GlobalInfo;

    const-string v2, "net"

    invoke-virtual {v1, v2, v0}, Lcom/efs/sdk/base/core/config/GlobalInfo;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
