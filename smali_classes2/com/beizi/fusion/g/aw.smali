.class public Lcom/beizi/fusion/g/aw;
.super Ljava/lang/Object;
.source "TaskRunnable.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static a:Ljava/lang/String; = "TaskRunnable"


# instance fields
.field private b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    if-eqz v0, :cond_4

    const/4 v3, 0x0

    .line 2
    :goto_0
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getRepeatCount()I

    move-result v0

    if-ge v3, v0, :cond_3

    .line 3
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-string v4, "GET"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getContentUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 4
    :try_start_0
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    iget-object v4, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getContentUrl()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v0, v4, v5}, Lcom/beizi/fusion/g/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/b/b;)Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v4, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v4}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getUserAgent()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/beizi/fusion/g/ab;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getSleepTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V

    .line 7
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getReport()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_2

    const/4 v4, 0x0

    .line 9
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_2

    .line 10
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 11
    iget-object v6, v1, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v6, v7, v5}, Lcom/beizi/fusion/g/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/b/b;)Ljava/lang/String;

    move-result-object v6

    .line 12
    iget-object v7, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v7}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getUserAgent()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/beizi/fusion/g/ab;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 13
    iget-object v6, v1, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    invoke-static {v6}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v6

    new-instance v15, Lcom/beizi/fusion/b/b;

    sget-object v8, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    const-string v9, ""

    const-string v10, "520.200"

    const-string v11, ""

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v7

    invoke-virtual {v7}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v12

    const-string v13, ""

    const-string v14, ""

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    const-string v17, ""

    move-object v7, v15

    move-object v2, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v7 .. v16}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    goto :goto_2

    .line 14
    :cond_0
    iget-object v2, v1, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v2

    new-instance v15, Lcom/beizi/fusion/b/b;

    sget-object v7, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    const-string v8, ""

    const-string v9, "520.500"

    const-string v10, ""

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v11

    const-string v12, ""

    const-string v13, ""

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v14

    const-string v16, ""

    move-object v6, v15

    move-object v5, v15

    move-object/from16 v15, v16

    invoke-direct/range {v6 .. v15}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    .line 15
    :goto_2
    iget-object v2, v1, Lcom/beizi/fusion/g/aw;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v2}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getSleepTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    add-int/lit8 v4, v4, 0x1

    const/4 v5, 0x0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v0

    new-instance v2, Lcom/beizi/fusion/b/b;

    sget-object v5, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    const-string v6, ""

    const-string v7, "510.500"

    const-string v8, ""

    const-string v10, ""

    const-string v11, ""

    const-string v13, ""

    move-object v4, v2

    invoke-direct/range {v4 .. v13}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 18
    :cond_3
    iget-object v0, v1, Lcom/beizi/fusion/g/aw;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v0

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

    const-string v5, "510.200"

    const-string v6, ""

    const-string v8, ""

    const-string v9, ""

    const-string v11, ""

    move-object v2, v12

    invoke-direct/range {v2 .. v11}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    :cond_4
    return-void
.end method
