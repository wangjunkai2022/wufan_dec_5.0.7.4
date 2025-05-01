.class public Lcom/beizi/fusion/d/b;
.super Ljava/lang/Object;
.source "AdManager.java"


# static fields
.field public static a:Ljava/lang/String; = null

.field public static b:Ljava/lang/String; = ""

.field private static c:Ljava/lang/String; = "AdManager"

.field private static d:Lcom/beizi/fusion/d/b;

.field private static e:Ljava/lang/String;

.field private static j:Ljava/lang/String;

.field private static k:Ljava/lang/String;


# instance fields
.field private f:Landroid/content/Context;

.field private g:Z

.field private h:Lcom/beizi/fusion/update/b;

.field private i:Lcom/beizi/fusion/b/d;

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/d/b;->g:Z

    .line 3
    iput-boolean v0, p0, Lcom/beizi/fusion/d/b;->l:Z

    return-void
.end method

.method public static a()Lcom/beizi/fusion/d/b;
    .locals 2

    .line 2
    sget-object v0, Lcom/beizi/fusion/d/b;->d:Lcom/beizi/fusion/d/b;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/beizi/fusion/d/b;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/d/b;->d:Lcom/beizi/fusion/d/b;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/beizi/fusion/d/b;

    invoke-direct {v1}, Lcom/beizi/fusion/d/b;-><init>()V

    sput-object v1, Lcom/beizi/fusion/d/b;->d:Lcom/beizi/fusion/d/b;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/fusion/d/b;->d:Lcom/beizi/fusion/d/b;

    return-object v0
.end method

.method static synthetic a(Lcom/beizi/fusion/d/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/d/b;->h()V

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic g()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/d/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/beizi/fusion/g/r;->a()Lcom/beizi/fusion/g/r;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/g/r;->a(Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->init()Lcom/beizi/fusion/model/ResponseInfo;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    iget-object v0, v0, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/a$l;->a(I)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/update/b;->a(Landroid/content/Context;)Lcom/beizi/fusion/update/b;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/d/b;->h:Lcom/beizi/fusion/update/b;

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v2}, Lcom/beizi/fusion/update/b;->b(I)V

    .line 6
    invoke-static {}, Lcom/beizi/fusion/g/aj;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Lcom/beizi/fusion/BeiZis;->isLimitPersonalAds()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->getCustomController()Lcom/beizi/fusion/BeiZiCustomController;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->getCustomController()Lcom/beizi/fusion/BeiZiCustomController;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->getCustomController()Lcom/beizi/fusion/BeiZiCustomController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/BeiZiCustomController;->isCanUseOaid()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    const-string v2, "__OAID__"

    const-string v3, ""

    invoke-static {v0, v2, v3}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/RequestInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/RequestInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/RequestInfo;->getDevInfo()Lcom/beizi/fusion/model/DevInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/RequestInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/RequestInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/RequestInfo;->getDevInfo()Lcom/beizi/fusion/model/DevInfo;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/beizi/fusion/model/DevInfo;->setOaid(Ljava/lang/String;)V

    .line 11
    :cond_1
    invoke-direct {p0}, Lcom/beizi/fusion/d/b;->i()V

    .line 12
    invoke-direct {p0}, Lcom/beizi/fusion/d/b;->j()V

    .line 13
    :cond_2
    invoke-static {}, Lcom/beizi/fusion/g/aj;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14
    invoke-static {}, Lcom/beizi/fusion/BeiZis;->isLimitPersonalAds()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->getCustomController()Lcom/beizi/fusion/BeiZiCustomController;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->getCustomController()Lcom/beizi/fusion/BeiZiCustomController;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->getCustomController()Lcom/beizi/fusion/BeiZiCustomController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/BeiZiCustomController;->isCanUseGaid()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 15
    :cond_3
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/h;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v2, Lcom/beizi/fusion/d/b$2;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/d/b$2;-><init>(Lcom/beizi/fusion/d/b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    iget-object v0, v0, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    invoke-virtual {v0}, Lcom/beizi/fusion/b/a$l;->a()I

    move-result v0

    if-ne v0, v1, :cond_5

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    iget-object v0, v0, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/a$l;->a(I)V

    :cond_5
    return-void
.end method

.method private i()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/beizi/fusion/e/a/b;

    sget-object v1, Lcom/beizi/fusion/g/ai;->b:Lcom/beizi/fusion/e/a/b$a;

    invoke-direct {v0, v1}, Lcom/beizi/fusion/e/a/b;-><init>(Lcom/beizi/fusion/e/a/b$a;)V

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/e/a/b;->a(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private j()V
    .locals 10

    const-string v0, "0"

    const-string v1, "SM_STATUS"

    .line 1
    :try_start_0
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getSmFlag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v1, v4}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "SM_STATUS_EXPIRE_TIME"

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-ne v2, v6, :cond_0

    .line 3
    :try_start_1
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v1, v7}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v2, v4, v7}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x3

    :cond_0
    const/4 v7, 0x2

    if-eqz v2, :cond_2

    if-ne v2, v7, :cond_1

    goto :goto_0

    :cond_1
    move v6, v2

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v1, v8}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    if-ne v6, v5, :cond_4

    .line 6
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v2, v4, v5}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 7
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_3

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/32 v7, 0x337f9800

    cmp-long v2, v5, v7

    if-lez v2, :cond_3

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    iget-object v1, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v1, v4, v0}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    return-void

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/beizi/fusion/sm/a/b;->a(Landroid/app/Application;)V

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/sm/a/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 14
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    new-instance v2, Lcom/beizi/fusion/d/b$3;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/d/b$3;-><init>(Lcom/beizi/fusion/d/b;)V

    invoke-static {v0, v2}, Lcom/beizi/fusion/sm/a/a;->a(Landroid/content/Context;Lcom/beizi/fusion/sm/a/c;)V

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/beizi/fusion/d/b;
    .locals 0

    .line 8
    sput-object p1, Lcom/beizi/fusion/d/b;->e:Ljava/lang/String;

    .line 9
    sget-object p1, Lcom/beizi/fusion/d/b;->d:Lcom/beizi/fusion/d/b;

    return-object p1
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    move-object v1, p0

    move-object/from16 v0, p2

    .line 10
    const-class v12, Lcom/beizi/fusion/d/b;

    monitor-enter v12

    .line 11
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "init start applicationCode\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    .line 12
    iget-boolean v2, v1, Lcom/beizi/fusion/d/b;->g:Z

    if-nez v2, :cond_1

    .line 13
    invoke-static {}, Lcom/beizi/fusion/g/au;->a()Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    .line 14
    new-instance v13, Lcom/beizi/fusion/b/b;

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v11, ""

    move-object v2, v13

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    new-instance v2, Lcom/beizi/fusion/b/d;

    invoke-direct {v2, v13}, Lcom/beizi/fusion/b/d;-><init>(Lcom/beizi/fusion/b/b;)V

    iput-object v2, v1, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iput-object v2, v1, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    .line 17
    sput-object v0, Lcom/beizi/fusion/d/b;->a:Ljava/lang/String;

    .line 18
    sput-object p3, Lcom/beizi/fusion/d/b;->j:Ljava/lang/String;

    .line 19
    sput-object p4, Lcom/beizi/fusion/d/b;->k:Ljava/lang/String;

    .line 20
    iget-object v0, v1, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    iget-object v2, v0, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    invoke-virtual {v2, v0}, Ljava/util/Observable;->addObserver(Ljava/util/Observer;)V

    .line 21
    iget-object v0, v1, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    invoke-virtual {v0}, Lcom/beizi/fusion/b/d;->a()Lcom/beizi/fusion/b/a;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/beizi/fusion/b/a;->a(Lcom/beizi/fusion/b/b;)V

    .line 22
    iget-object v0, v1, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/model/AppEventId;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/AppEventId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AppEventId;->setAppStart()V

    .line 23
    iget-object v0, v1, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/model/AppEventId;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/AppEventId;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AppEventId;->setAppSdkInit()V

    .line 24
    iget-object v0, v1, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    iget-object v0, v0, Lcom/beizi/fusion/b/d;->a:Lcom/beizi/fusion/b/a$i;

    invoke-virtual {v0}, Lcom/beizi/fusion/b/a$l;->a()I

    move-result v0

    if-nez v0, :cond_1

    .line 25
    invoke-static {}, Lcom/beizi/fusion/BeiZis;->isIsSyncInit()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    invoke-direct {p0}, Lcom/beizi/fusion/d/b;->h()V

    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/h;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v2, Lcom/beizi/fusion/d/b$1;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/d/b$1;-><init>(Lcom/beizi/fusion/d/b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :goto_0
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, v1, Lcom/beizi/fusion/d/b;->g:Z

    .line 29
    :cond_1
    monitor-exit v12

    return-void

    .line 30
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Context cannot be null."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 31
    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/beizi/fusion/d/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/d/b;->j:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/d/b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public e()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->f:Landroid/content/Context;

    return-object v0
.end method

.method public f()Lcom/beizi/fusion/b/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/b;->i:Lcom/beizi/fusion/b/d;

    return-object v0
.end method
