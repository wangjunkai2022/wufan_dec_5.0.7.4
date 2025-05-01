.class public Lcom/beizi/fusion/g/o;
.super Ljava/lang/Object;
.source "ClipUtil.java"


# static fields
.field private static b:Lcom/beizi/fusion/g/o;


# instance fields
.field private a:Ljava/lang/String;

.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ClipUtil"

    .line 2
    iput-object v0, p0, Lcom/beizi/fusion/g/o;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/fusion/g/o;->c:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/o;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/o;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Lcom/beizi/fusion/g/o;
    .locals 2

    .line 2
    sget-object v0, Lcom/beizi/fusion/g/o;->b:Lcom/beizi/fusion/g/o;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/beizi/fusion/g/o;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/g/o;->b:Lcom/beizi/fusion/g/o;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/beizi/fusion/g/o;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/g/o;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/beizi/fusion/g/o;->b:Lcom/beizi/fusion/g/o;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 7
    :cond_1
    :goto_0
    sget-object p0, Lcom/beizi/fusion/g/o;->b:Lcom/beizi/fusion/g/o;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V
    .locals 12

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/g/o;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v0

    new-instance v11, Lcom/beizi/fusion/b/b;

    sget-object v2, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    const-string v3, ""

    const-string v4, "510.200"

    const-string v5, ""

    const-string v7, ""

    const-string v8, ""

    const-string v10, ""

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    .line 10
    invoke-virtual {p1}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getReport()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 12
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/g/h;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/beizi/fusion/g/o$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/beizi/fusion/g/o$1;-><init>(Lcom/beizi/fusion/g/o;Ljava/util/List;Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/g/o;->c:Landroid/content/Context;

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

    const-string v3, "510.500"

    const-string v4, ""

    const-string v6, ""

    const-string v7, ""

    const-string v9, ""

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_1
    :goto_0
    return-void
.end method
