.class public Lcom/umeng/analytics/pro/ay;
.super Ljava/lang/Object;
.source "OpenDeviceId.java"


# static fields
.field private static a:Lcom/umeng/analytics/pro/ax;

.field private static b:Z

.field private static c:Ljava/lang/String;

.field private static d:Lcom/umeng/analytics/pro/ax;

.field private static e:Z

.field private static f:Ljava/lang/String;


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

.method public static declared-synchronized a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-class v0, Lcom/umeng/analytics/pro/ay;

    monitor-enter v0

    :try_start_0
    const-string v1, "MobclickRT"

    const-string v2, "--->>>*** real call OpenDeviceId.getOaid()"

    .line 1
    invoke-static {v1, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 2
    monitor-exit v0

    return-object v1

    .line 3
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v3, :cond_1

    .line 4
    monitor-exit v0

    return-object v1

    .line 5
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/umeng/analytics/pro/ay;->a()V

    .line 6
    sget-object v2, Lcom/umeng/analytics/pro/ay;->a:Lcom/umeng/analytics/pro/ax;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v2, :cond_2

    .line 7
    :try_start_3
    invoke-interface {v2, p0}, Lcom/umeng/analytics/pro/ax;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/ay;->c:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 8
    monitor-exit v0

    return-object p0

    .line 9
    :catchall_0
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static a()V
    .locals 2

    .line 10
    sget-object v0, Lcom/umeng/analytics/pro/ay;->a:Lcom/umeng/analytics/pro/ax;

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/umeng/analytics/pro/ay;->b:Z

    if-nez v0, :cond_1

    .line 11
    const-class v0, Lcom/umeng/analytics/pro/ay;

    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/ay;->a:Lcom/umeng/analytics/pro/ax;

    if-nez v1, :cond_0

    sget-boolean v1, Lcom/umeng/analytics/pro/ay;->b:Z

    if-nez v1, :cond_0

    .line 13
    invoke-static {}, Lcom/umeng/analytics/pro/ba;->a()Lcom/umeng/analytics/pro/ax;

    move-result-object v1

    sput-object v1, Lcom/umeng/analytics/pro/ay;->a:Lcom/umeng/analytics/pro/ax;

    const/4 v1, 0x1

    .line 14
    sput-boolean v1, Lcom/umeng/analytics/pro/ay;->b:Z

    .line 15
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/umeng/analytics/pro/ay;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/ay;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object p0, Lcom/umeng/analytics/pro/ay;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    .line 3
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {p0}, Lcom/umeng/analytics/pro/ay;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static b()V
    .locals 2

    .line 4
    sget-object v0, Lcom/umeng/analytics/pro/ay;->d:Lcom/umeng/analytics/pro/ax;

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/umeng/analytics/pro/ay;->e:Z

    if-nez v0, :cond_1

    .line 5
    const-class v0, Lcom/umeng/analytics/pro/ay;

    monitor-enter v0

    .line 6
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/ay;->d:Lcom/umeng/analytics/pro/ax;

    if-nez v1, :cond_0

    sget-boolean v1, Lcom/umeng/analytics/pro/ay;->e:Z

    if-nez v1, :cond_0

    .line 7
    invoke-static {}, Lcom/umeng/analytics/pro/ba;->b()Lcom/umeng/analytics/pro/ax;

    move-result-object v1

    sput-object v1, Lcom/umeng/analytics/pro/ay;->d:Lcom/umeng/analytics/pro/ax;

    const/4 v1, 0x1

    .line 8
    sput-boolean v1, Lcom/umeng/analytics/pro/ay;->e:Z

    .line 9
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-class v0, Lcom/umeng/analytics/pro/ay;

    monitor-enter v0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 1
    monitor-exit v0

    return-object v1

    .line 2
    :cond_0
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v2, v3, :cond_1

    .line 3
    monitor-exit v0

    return-object v1

    .line 4
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/umeng/analytics/pro/bk;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    invoke-static {}, Lcom/umeng/analytics/pro/ay;->b()V

    .line 6
    sget-object v2, Lcom/umeng/analytics/pro/ay;->d:Lcom/umeng/analytics/pro/ax;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_2

    .line 7
    :try_start_2
    invoke-interface {v2, p0}, Lcom/umeng/analytics/pro/ax;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/ay;->f:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 8
    monitor-exit v0

    return-object p0

    .line 9
    :catchall_0
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-class v0, Lcom/umeng/analytics/pro/ay;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/ay;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object p0, Lcom/umeng/analytics/pro/ay;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    .line 3
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {p0}, Lcom/umeng/analytics/pro/ay;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
