.class Lcom/beizi/fusion/update/b$a;
.super Ljava/lang/Object;
.source "HeartScheduler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/update/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/update/b;

.field private b:I


# direct methods
.method constructor <init>(Lcom/beizi/fusion/update/b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p2, p0, Lcom/beizi/fusion/update/b$a;->b:I

    return-void
.end method

.method private a()V
    .locals 21

    move-object/from16 v1, p0

    .line 1
    invoke-static {}, Lcom/beizi/fusion/update/b;->c()Lcom/beizi/fusion/model/TaskBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    invoke-static {}, Lcom/beizi/fusion/update/b;->c()Lcom/beizi/fusion/model/TaskBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean;->getExpired()J

    move-result-wide v2

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 4
    invoke-static {}, Lcom/beizi/fusion/update/b;->c()Lcom/beizi/fusion/model/TaskBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean;->getBackTaskArray()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 5
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 6
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v0

    new-instance v15, Lcom/beizi/fusion/b/b;

    sget-object v8, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v7

    invoke-virtual {v7}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v17

    const-string v9, ""

    const-string v10, "500.200"

    const-string v11, ""

    const-string v13, ""

    const-string v14, ""

    const-string v18, ""

    move-object v7, v15

    move-object v1, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v18

    invoke-direct/range {v7 .. v17}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v4

    cmp-long v0, v7, v2

    if-lez v0, :cond_0

    .line 9
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v0

    new-instance v15, Lcom/beizi/fusion/b/b;

    sget-object v8, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v7

    invoke-virtual {v7}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v16

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v1

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v17

    const-string v9, ""

    const-string v10, "530.500"

    const-string v11, ""

    const-string v13, ""

    const-string v14, ""

    const-string v18, ""

    move-object v7, v15

    move-wide/from16 v19, v2

    move-object v2, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v18

    invoke-direct/range {v7 .. v17}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    move-wide/from16 v19, v2

    .line 10
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    .line 11
    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getType()I

    move-result v2

    move-object/from16 v3, p0

    .line 12
    iget-object v7, v3, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v7}, Lcom/beizi/fusion/update/b;->b(Lcom/beizi/fusion/update/b;)Lcom/beizi/fusion/update/b$b;

    move-result-object v7

    new-instance v8, Lcom/beizi/fusion/update/b$a$1;

    invoke-direct {v8, v3, v2, v0}, Lcom/beizi/fusion/update/b$a$1;-><init>(Lcom/beizi/fusion/update/b$a;ILcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    :try_start_0
    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getSleepTime()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    move-wide/from16 v2, v19

    goto :goto_0

    :cond_1
    move-object/from16 v3, p0

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    iget v0, p0, Lcom/beizi/fusion/update/b$a;->b:I

    const/4 v1, 0x2

    const-string v2, "config is expire:"

    const/4 v3, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v4, 0x4

    if-eq v0, v4, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 4
    iput v3, v0, Landroid/os/Message;->what:I

    .line 5
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 6
    iget-object v1, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v1}, Lcom/beizi/fusion/update/b;->b(Lcom/beizi/fusion/update/b;)Lcom/beizi/fusion/update/b$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 7
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

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

    const-string v4, "310.200"

    const-string v5, ""

    const-string v7, ""

    const-string v8, ""

    const-string v10, ""

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    goto/16 :goto_0

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "taskConfig:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    invoke-static {}, Lcom/beizi/fusion/update/b;->b()Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 10
    invoke-static {}, Lcom/beizi/fusion/update/b;->b()Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/ResponseInfo;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 11
    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskConfig;->getUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 12
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskConfig;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v0, v3, v4}, Lcom/beizi/fusion/g/ab;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    .line 14
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "data"

    .line 15
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "null"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 17
    invoke-static {}, Lcom/beizi/fusion/g/ad;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/beizi/fusion/g/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 19
    invoke-static {v0}, Lcom/beizi/fusion/model/TaskBean;->objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/TaskBean;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/update/b;->a(Lcom/beizi/fusion/model/TaskBean;)Lcom/beizi/fusion/model/TaskBean;

    .line 20
    invoke-static {}, Lcom/beizi/fusion/update/b;->c()Lcom/beizi/fusion/model/TaskBean;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 21
    invoke-static {}, Lcom/beizi/fusion/update/b;->c()Lcom/beizi/fusion/model/TaskBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean;->getCheckInterval()J

    move-result-wide v2

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v0}, Lcom/beizi/fusion/update/b;->c(Lcom/beizi/fusion/update/b;)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    .line 23
    iget-object v0, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v0, v2, v3}, Lcom/beizi/fusion/update/b;->a(Lcom/beizi/fusion/update/b;J)J

    .line 24
    iget-object v0, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v0, v1}, Lcom/beizi/fusion/update/b;->a(Lcom/beizi/fusion/update/b;I)V

    .line 25
    iget-object v0, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/update/b;->b(I)V

    .line 26
    :cond_2
    invoke-direct {p0}, Lcom/beizi/fusion/update/b$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    .line 28
    :cond_3
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/b/c;->a()V

    goto/16 :goto_0

    .line 29
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v0}, Lcom/beizi/fusion/update/b;->a(Lcom/beizi/fusion/update/b;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 32
    iput v3, v0, Landroid/os/Message;->what:I

    .line 33
    iput v3, v0, Landroid/os/Message;->arg1:I

    .line 34
    iget-object v1, p0, Lcom/beizi/fusion/update/b$a;->a:Lcom/beizi/fusion/update/b;

    invoke-static {v1}, Lcom/beizi/fusion/update/b;->b(Lcom/beizi/fusion/update/b;)Lcom/beizi/fusion/update/b$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 35
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

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

    const-string v4, "310.200"

    const-string v5, ""

    const-string v7, ""

    const-string v8, ""

    const-string v10, ""

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    goto :goto_0

    .line 36
    :cond_5
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

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

    const-string v4, "310.210"

    const-string v5, ""

    const-string v7, ""

    const-string v8, ""

    const-string v10, ""

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_6
    :goto_0
    return-void
.end method
