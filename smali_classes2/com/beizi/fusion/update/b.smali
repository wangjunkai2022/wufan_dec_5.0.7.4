.class public Lcom/beizi/fusion/update/b;
.super Ljava/lang/Object;
.source "HeartScheduler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/update/b$b;,
        Lcom/beizi/fusion/update/b$a;
    }
.end annotation


# static fields
.field private static f:Landroid/content/Context;

.field private static g:Lcom/beizi/fusion/model/ResponseInfo;

.field private static i:Lcom/beizi/fusion/model/TaskBean;

.field private static k:Z

.field private static l:Z

.field private static m:Lcom/beizi/fusion/update/b;


# instance fields
.field private a:Ljava/util/concurrent/ScheduledExecutorService;

.field private b:J

.field private c:J

.field private d:J

.field private final e:Lcom/beizi/fusion/update/b$b;

.field private h:Ljava/util/concurrent/ScheduledExecutorService;

.field private j:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xea60

    .line 2
    iput-wide v0, p0, Lcom/beizi/fusion/update/b;->b:J

    .line 3
    iput-wide v0, p0, Lcom/beizi/fusion/update/b;->c:J

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/beizi/fusion/update/b;->d:J

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sput-object p1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    .line 6
    new-instance p1, Lcom/beizi/fusion/update/b$b;

    invoke-direct {p1, p0}, Lcom/beizi/fusion/update/b$b;-><init>(Lcom/beizi/fusion/update/b;)V

    iput-object p1, p0, Lcom/beizi/fusion/update/b;->e:Lcom/beizi/fusion/update/b$b;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/update/b;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/update/b;->d:J

    return-wide p1
.end method

.method static synthetic a()Landroid/content/Context;
    .locals 1

    .line 2
    sget-object v0, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/beizi/fusion/model/TaskBean;)Lcom/beizi/fusion/model/TaskBean;
    .locals 0

    .line 3
    sput-object p0, Lcom/beizi/fusion/update/b;->i:Lcom/beizi/fusion/model/TaskBean;

    return-object p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/beizi/fusion/update/b;
    .locals 2

    const-class v0, Lcom/beizi/fusion/update/b;

    monitor-enter v0

    .line 43
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/update/b;->m:Lcom/beizi/fusion/update/b;

    if-nez v1, :cond_0

    .line 44
    new-instance v1, Lcom/beizi/fusion/update/b;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/update/b;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/beizi/fusion/update/b;->m:Lcom/beizi/fusion/update/b;

    .line 45
    :cond_0
    sget-object p0, Lcom/beizi/fusion/update/b;->m:Lcom/beizi/fusion/update/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic a(Lcom/beizi/fusion/update/b;)Ljava/lang/Boolean;
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/beizi/fusion/update/b;->d()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/beizi/fusion/update/b;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/beizi/fusion/update/b;->d(I)V

    return-void
.end method

.method static synthetic a(Z)Z
    .locals 0

    .line 6
    sput-boolean p0, Lcom/beizi/fusion/update/b;->k:Z

    return p0
.end method

.method static synthetic b()Lcom/beizi/fusion/model/ResponseInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    return-object v0
.end method

.method static synthetic b(Lcom/beizi/fusion/update/b;)Lcom/beizi/fusion/update/b$b;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/beizi/fusion/update/b;->e:Lcom/beizi/fusion/update/b$b;

    return-object p0
.end method

.method static synthetic b(Z)Z
    .locals 0

    .line 3
    sput-boolean p0, Lcom/beizi/fusion/update/b;->l:Z

    return p0
.end method

.method static synthetic c(Lcom/beizi/fusion/update/b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/update/b;->d:J

    return-wide v0
.end method

.method static synthetic c()Lcom/beizi/fusion/model/TaskBean;
    .locals 1

    .line 2
    sget-object v0, Lcom/beizi/fusion/update/b;->i:Lcom/beizi/fusion/model/TaskBean;

    return-object v0
.end method

.method private c(I)V
    .locals 3

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, v0}, Lcom/beizi/fusion/update/b;->d(I)V

    .line 4
    sget-object v0, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/ae;->a(Landroid/content/Context;)Lcom/beizi/fusion/g/ae;

    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.ad.action.UPDATE_CONFIG_SUCCESS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "updateResult"

    .line 6
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 7
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/g/ae;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method private d()Ljava/lang/Boolean;
    .locals 10

    .line 20
    invoke-direct {p0}, Lcom/beizi/fusion/update/b;->e()V

    .line 21
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 22
    invoke-virtual {v0}, Lcom/beizi/fusion/model/Manager;->getAdSpaces()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 23
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 25
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 26
    :cond_1
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 27
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/fusion/model/AdSpacesBean;

    .line 28
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean;->getAppId()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 30
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 31
    :cond_2
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean;->getComponent()Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;

    move-result-object v0

    if-nez v0, :cond_3

    .line 32
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 33
    :cond_3
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 34
    new-instance v1, Ljava/util/Date;

    const-wide/16 v3, 0x0

    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 35
    sget-object v5, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v6, "lastUpdateTime"

    invoke-static {v5, v6, v1}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 36
    sget-object v1, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v1}, Lcom/beizi/fusion/model/ResponseInfo;->getExpireTime()J

    move-result-wide v7

    .line 37
    invoke-virtual {v0}, Lcom/beizi/fusion/model/Configurator;->getCheckInterval()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/beizi/fusion/update/b;->b:J

    .line 38
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getMaxValidTime()J

    move-result-wide v0

    cmp-long v9, v0, v3

    if-nez v9, :cond_4

    const-wide v0, 0x9a7ec800L

    .line 39
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v5

    cmp-long v5, v3, v7

    if-gtz v5, :cond_5

    cmp-long v5, v3, v0

    if-lez v5, :cond_6

    :cond_5
    const/4 v2, 0x1

    .line 40
    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 41
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    .line 42
    :cond_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method private d(I)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "=============stop===================:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    const-wide/32 v1, 0xea60

    const/4 v3, 0x0

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_3

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez p1, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 4
    :try_start_0
    iget-object p1, p0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 5
    iput-object v3, p0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    throw p1

    .line 7
    :catch_0
    :goto_0
    iput-object v3, p0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_3

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez p1, :cond_3

    return-void

    .line 9
    :cond_3
    invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 10
    :try_start_1
    iget-object p1, p0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    .line 11
    iput-object v3, p0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    throw p1

    .line 13
    :catch_1
    :goto_1
    iput-object v3, p0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_3

    .line 14
    :cond_4
    iget-object p1, p0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez p1, :cond_5

    return-void

    .line 15
    :cond_5
    invoke-interface {p1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 16
    :try_start_2
    iget-object p1, p0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    .line 17
    iput-object v3, p0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    throw p1

    .line 19
    :catch_2
    :goto_2
    iput-object v3, p0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    :goto_3
    return-void
.end method

.method private e()V
    .locals 6

    .line 1
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_3

    .line 2
    sget-object v0, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v0

    sput-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    .line 3
    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->isInit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->init()Lcom/beizi/fusion/model/ResponseInfo;

    .line 5
    :cond_0
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/Configurator;->getCheckInterval()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    .line 7
    iput-wide v3, p0, Lcom/beizi/fusion/update/b;->b:J

    .line 8
    :cond_1
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getMessenger()Lcom/beizi/fusion/model/Messenger;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getMessenger()Lcom/beizi/fusion/model/Messenger;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/Messenger;->getCheckInterval()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_2

    .line 10
    iput-wide v3, p0, Lcom/beizi/fusion/update/b;->c:J

    .line 11
    :cond_2
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 12
    sget-object v0, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskConfig;->getCheckInterval()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_3

    .line 13
    iput-wide v3, p0, Lcom/beizi/fusion/update/b;->d:J

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v3, 0x2

    if-nez v0, :cond_4

    .line 15
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_5

    .line 17
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_6

    iget-wide v4, p0, Lcom/beizi/fusion/update/b;->d:J

    cmp-long v0, v4, v1

    if-eqz v0, :cond_6

    .line 19
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_6
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 11

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "heartbeat fail:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    sget-boolean p1, Lcom/beizi/fusion/update/b;->k:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 40
    invoke-direct {p0, p1}, Lcom/beizi/fusion/update/b;->c(I)V

    .line 41
    sput-boolean p1, Lcom/beizi/fusion/update/b;->k:Z

    .line 42
    :cond_0
    sget-object p1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {p1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object p1

    new-instance v10, Lcom/beizi/fusion/b/b;

    sget-object v1, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const-string v2, ""

    const-string v3, "320.500"

    const-string v4, ""

    const-string v6, ""

    const-string v7, ""

    const-string v9, ""

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 11

    .line 7
    invoke-direct {p0}, Lcom/beizi/fusion/update/b;->e()V

    .line 8
    check-cast p1, Lcom/beizi/fusion/update/a;

    if-eqz p1, :cond_5

    .line 9
    sget-boolean p1, Lcom/beizi/fusion/update/b;->k:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 10
    invoke-direct {p0, v1}, Lcom/beizi/fusion/update/b;->c(I)V

    .line 11
    sput-boolean v0, Lcom/beizi/fusion/update/b;->k:Z

    .line 12
    :cond_0
    sget-boolean p1, Lcom/beizi/fusion/update/b;->l:Z

    if-eqz p1, :cond_1

    .line 13
    sget-object p1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {p1}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object p1

    sput-object p1, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    .line 14
    invoke-virtual {p1}, Lcom/beizi/fusion/model/ResponseInfo;->init()Lcom/beizi/fusion/model/ResponseInfo;

    .line 15
    sput-boolean v0, Lcom/beizi/fusion/update/b;->l:Z

    .line 16
    :cond_1
    sget-object p1, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/ResponseInfo;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object p1

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_2

    .line 17
    sget-object p1, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/ResponseInfo;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/model/Configurator;->getCheckInterval()J

    move-result-wide v4

    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "===============heartbeat============="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lcom/beizi/fusion/update/b;->b:J

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    iget-wide v6, p0, Lcom/beizi/fusion/update/b;->b:J

    cmp-long p1, v4, v6

    if-eqz p1, :cond_2

    cmp-long p1, v4, v2

    if-eqz p1, :cond_2

    .line 20
    iput-wide v4, p0, Lcom/beizi/fusion/update/b;->b:J

    .line 21
    invoke-direct {p0, v1}, Lcom/beizi/fusion/update/b;->d(I)V

    .line 22
    invoke-virtual {p0, v1}, Lcom/beizi/fusion/update/b;->b(I)V

    .line 23
    :cond_2
    sget-object p1, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/ResponseInfo;->getMessenger()Lcom/beizi/fusion/model/Messenger;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 24
    invoke-virtual {p1}, Lcom/beizi/fusion/model/Messenger;->getCheckInterval()J

    move-result-wide v0

    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "===============logBeat============="

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/beizi/fusion/update/b;->c:J

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    iget-wide v4, p0, Lcom/beizi/fusion/update/b;->c:J

    cmp-long p1, v0, v4

    if-eqz p1, :cond_3

    cmp-long p1, v0, v2

    if-eqz p1, :cond_3

    .line 27
    iput-wide v0, p0, Lcom/beizi/fusion/update/b;->c:J

    const/4 p1, 0x2

    .line 28
    invoke-direct {p0, p1}, Lcom/beizi/fusion/update/b;->d(I)V

    .line 29
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/update/b;->b(I)V

    .line 30
    :cond_3
    sget-object p1, Lcom/beizi/fusion/update/b;->g:Lcom/beizi/fusion/model/ResponseInfo;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/ResponseInfo;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 31
    invoke-virtual {p1}, Lcom/beizi/fusion/model/TaskConfig;->getCheckInterval()J

    move-result-wide v0

    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "===============backBeat============="

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/beizi/fusion/update/b;->d:J

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v4, "BeiZis"

    invoke-static {v4, p1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    iget-wide v4, p0, Lcom/beizi/fusion/update/b;->d:J

    cmp-long p1, v0, v4

    if-eqz p1, :cond_4

    cmp-long p1, v0, v2

    if-eqz p1, :cond_4

    .line 34
    iput-wide v0, p0, Lcom/beizi/fusion/update/b;->d:J

    const/4 p1, 0x3

    .line 35
    invoke-direct {p0, p1}, Lcom/beizi/fusion/update/b;->d(I)V

    .line 36
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/update/b;->b(I)V

    .line 37
    :cond_4
    sget-object p1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {p1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object p1

    new-instance v10, Lcom/beizi/fusion/b/b;

    sget-object v1, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const-string v2, ""

    const-string v3, "320.200"

    const-string v4, ""

    const-string v6, ""

    const-string v7, ""

    const-string v9, ""

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_5
    return-void
.end method

.method public b(I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    .line 4
    invoke-direct/range {p0 .. p0}, Lcom/beizi/fusion/update/b;->e()V

    const/4 v2, 0x4

    const-wide/16 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-eqz v1, :cond_4

    const/4 v7, 0x1

    const-string v8, "heartbeatTime:"

    if-eq v1, v7, :cond_3

    if-eq v1, v6, :cond_2

    if-eq v1, v5, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    goto/16 :goto_0

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v0, Lcom/beizi/fusion/update/b;->b:J

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 6
    iget-object v5, v0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v6, v0, v2}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v7, 0x0

    iget-wide v9, v0, Lcom/beizi/fusion/update/b;->b:J

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v5 .. v11}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 7
    sget-object v1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v1

    new-instance v12, Lcom/beizi/fusion/b/b;

    sget-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v4, ""

    const-string v5, "330.210"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    goto/16 :goto_0

    .line 8
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "backTaskTime:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v0, Lcom/beizi/fusion/update/b;->d:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "BeiZis"

    invoke-static {v5, v1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object v6, v0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v6, :cond_6

    iget-wide v7, v0, Lcom/beizi/fusion/update/b;->d:J

    cmp-long v1, v7, v3

    if-eqz v1, :cond_6

    .line 10
    new-instance v7, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v7, v0, v2}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v8, 0x0

    iget-wide v10, v0, Lcom/beizi/fusion/update/b;->d:J

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v6 .. v12}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 11
    sget-object v1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v1

    new-instance v12, Lcom/beizi/fusion/b/b;

    sget-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v4, ""

    const-string v5, "500.000"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    goto/16 :goto_0

    .line 12
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "logCheckTime:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v0, Lcom/beizi/fusion/update/b;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 13
    iget-object v6, v0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v7, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v7, v0, v5}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v8, 0x0

    iget-wide v10, v0, Lcom/beizi/fusion/update/b;->c:J

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v6 .. v12}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 14
    sget-object v1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v1

    new-instance v12, Lcom/beizi/fusion/b/b;

    sget-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v4, ""

    const-string v5, "410.300"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    goto/16 :goto_0

    .line 15
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v0, Lcom/beizi/fusion/update/b;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 16
    iget-object v7, v0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v8, v0, v6}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v9, 0x0

    iget-wide v11, v0, Lcom/beizi/fusion/update/b;->b:J

    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v7 .. v13}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 17
    sget-object v1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v1

    new-instance v12, Lcom/beizi/fusion/b/b;

    sget-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v4, ""

    const-string v5, "330.210"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    goto/16 :goto_0

    .line 18
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v7, v0, Lcom/beizi/fusion/update/b;->b:J

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v7, ":heartbeatTime=============start===================:logCheckTime:"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v7, v0, Lcom/beizi/fusion/update/b;->c:J

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    iget-object v9, v0, Lcom/beizi/fusion/update/b;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v10, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v10, v0, v6}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v11, 0x0

    iget-wide v13, v0, Lcom/beizi/fusion/update/b;->b:J

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v15, v1

    invoke-interface/range {v9 .. v15}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 20
    iget-object v15, v0, Lcom/beizi/fusion/update/b;->h:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v6, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v6, v0, v5}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v17, 0x0

    iget-wide v7, v0, Lcom/beizi/fusion/update/b;->c:J

    move-object/from16 v16, v6

    move-wide/from16 v19, v7

    move-object/from16 v21, v1

    invoke-interface/range {v15 .. v21}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 21
    iget-object v15, v0, Lcom/beizi/fusion/update/b;->j:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v15, :cond_5

    iget-wide v5, v0, Lcom/beizi/fusion/update/b;->d:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_5

    .line 22
    new-instance v3, Lcom/beizi/fusion/update/b$a;

    invoke-direct {v3, v0, v2}, Lcom/beizi/fusion/update/b$a;-><init>(Lcom/beizi/fusion/update/b;I)V

    const-wide/16 v17, 0x0

    iget-wide v4, v0, Lcom/beizi/fusion/update/b;->d:J

    move-object/from16 v16, v3

    move-wide/from16 v19, v4

    move-object/from16 v21, v1

    invoke-interface/range {v15 .. v21}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 23
    sget-object v1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v1

    new-instance v12, Lcom/beizi/fusion/b/b;

    sget-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v4, ""

    const-string v5, "500.000"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    .line 24
    :cond_5
    sget-object v1, Lcom/beizi/fusion/update/b;->f:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v1

    new-instance v12, Lcom/beizi/fusion/b/b;

    sget-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v4, ""

    const-string v5, "300.000"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v12}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_6
    :goto_0
    return-void
.end method
