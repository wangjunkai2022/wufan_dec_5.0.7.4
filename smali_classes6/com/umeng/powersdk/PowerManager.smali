.class public Lcom/umeng/powersdk/PowerManager;
.super Ljava/lang/Object;


# static fields
.field public static final TAG:Ljava/lang/String; = "PowerManager"

.field private static a:Landroid/content/Context; = null

.field private static b:Z = false

.field private static c:Lcom/efs/sdk/base/EfsReporter; = null

.field private static d:Lcom/umeng/powersdk/PowerConfigManager; = null

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

.method public static getApplicationContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/umeng/powersdk/PowerManager;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;
    .locals 1

    sget-object v0, Lcom/umeng/powersdk/PowerManager;->d:Lcom/umeng/powersdk/PowerConfigManager;

    return-object v0
.end method

.method public static getReporter()Lcom/efs/sdk/base/EfsReporter;
    .locals 1

    sget-object v0, Lcom/umeng/powersdk/PowerManager;->c:Lcom/efs/sdk/base/EfsReporter;

    return-object v0
.end method

.method public static init(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 2

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :try_start_0
    sget-boolean v0, Lcom/umeng/powersdk/PowerManager;->isDebug:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->isInit()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/umeng/powersdk/PowerManager;->a:Landroid/content/Context;

    sput-object p1, Lcom/umeng/powersdk/PowerManager;->c:Lcom/efs/sdk/base/EfsReporter;

    new-instance v0, Lcom/umeng/powersdk/PowerConfigManager;

    invoke-direct {v0, p0, p1}, Lcom/umeng/powersdk/PowerConfigManager;-><init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V

    sput-object v0, Lcom/umeng/powersdk/PowerManager;->d:Lcom/umeng/powersdk/PowerConfigManager;

    const/4 p0, 0x1

    sput-boolean p0, Lcom/umeng/powersdk/PowerManager;->b:Z

    invoke-static {}, Lcom/umeng/powersdk/c$a;->a()Lcom/umeng/powersdk/c;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/powersdk/PowerConfigManager;->enableTracer()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "efs_power"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "apm_powerperf_collect_interval"

    const/4 v1, 0x5

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/umeng/powersdk/c;->b:I

    const-string v0, "apm_powerperf_collect_max_period_sec"

    const/16 v1, 0x64

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/umeng/powersdk/c;->c:I

    :cond_3
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "power-info"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Lcom/umeng/powersdk/c$1;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/umeng/powersdk/c$1;-><init>(Lcom/umeng/powersdk/c;Landroid/os/Looper;Landroid/os/HandlerThread;)V

    new-instance p1, Lcom/umeng/powersdk/c$2;

    invoke-direct {p1, p0, v0}, Lcom/umeng/powersdk/c$2;-><init>(Lcom/umeng/powersdk/c;Landroid/os/Handler;)V

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_4
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public static isInit()Z
    .locals 1

    sget-boolean v0, Lcom/umeng/powersdk/PowerManager;->b:Z

    return v0
.end method

.method public static onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/umeng/powersdk/c$a;->a()Lcom/umeng/powersdk/c;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/umeng/powersdk/PowerConfigManager;->enableTracer()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lcom/umeng/powersdk/c;->d:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/umeng/powersdk/c$a;->a()Lcom/umeng/powersdk/c;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/umeng/powersdk/PowerConfigManager;->enableTracer()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    return-void

    :cond_1
    iget-boolean p0, v0, Lcom/umeng/powersdk/c;->g:Z

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    iput-boolean p0, v0, Lcom/umeng/powersdk/c;->g:Z

    return-void

    :cond_2
    iget p0, v0, Lcom/umeng/powersdk/c;->f:I

    const/4 v1, 0x1

    add-int/2addr p0, v1

    iput p0, v0, Lcom/umeng/powersdk/c;->f:I

    if-ne p0, v1, :cond_3

    iput-boolean v1, v0, Lcom/umeng/powersdk/c;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method

.method public static onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/umeng/powersdk/c$a;->a()Lcom/umeng/powersdk/c;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getPowerConfigManager()Lcom/umeng/powersdk/PowerConfigManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/umeng/powersdk/PowerConfigManager;->enableTracer()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p0

    const/4 v1, 0x1

    if-eqz p0, :cond_2

    iput-boolean v1, v0, Lcom/umeng/powersdk/c;->g:Z

    return-void

    :cond_2
    iget p0, v0, Lcom/umeng/powersdk/c;->f:I

    sub-int/2addr p0, v1

    iput p0, v0, Lcom/umeng/powersdk/c;->f:I

    if-nez p0, :cond_3

    const/4 p0, 0x0

    iput-boolean p0, v0, Lcom/umeng/powersdk/c;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    :goto_0
    return-void
.end method
