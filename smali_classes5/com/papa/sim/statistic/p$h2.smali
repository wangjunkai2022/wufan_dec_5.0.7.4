.class Lcom/papa/sim/statistic/p$h2;
.super Ljava/lang/Object;
.source "StatFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa/sim/statistic/p;->D0(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;JIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:J

.field final synthetic h:I

.field final synthetic i:J

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:I

.field final synthetic l:I

.field final synthetic m:I

.field final synthetic n:Lcom/papa/sim/statistic/p;


# direct methods
.method constructor <init>(Lcom/papa/sim/statistic/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/String;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa/sim/statistic/p$h2;->n:Lcom/papa/sim/statistic/p;

    iput-object p2, p0, Lcom/papa/sim/statistic/p$h2;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/papa/sim/statistic/p$h2;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/papa/sim/statistic/p$h2;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/papa/sim/statistic/p$h2;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/papa/sim/statistic/p$h2;->f:Ljava/lang/String;

    iput-wide p7, p0, Lcom/papa/sim/statistic/p$h2;->g:J

    iput p9, p0, Lcom/papa/sim/statistic/p$h2;->h:I

    iput-wide p10, p0, Lcom/papa/sim/statistic/p$h2;->i:J

    iput-object p12, p0, Lcom/papa/sim/statistic/p$h2;->j:Ljava/lang/String;

    iput p13, p0, Lcom/papa/sim/statistic/p$h2;->k:I

    iput p14, p0, Lcom/papa/sim/statistic/p$h2;->l:I

    iput p15, p0, Lcom/papa/sim/statistic/p$h2;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 17

    move-object/from16 v1, p0

    const-string v0, "nodeId"

    const-string v2, "reMarks"

    const-string v3, "recPosition"

    const-string v4, "where"

    const-string v5, "dataFlag"

    const-string v6, "_from_type"

    const-string v7, "location"

    const-string v8, "position"

    const-string v9, "from"

    .line 1
    new-instance v10, Lcom/papa/sim/statistic/StatRequest;

    invoke-direct {v10}, Lcom/papa/sim/statistic/StatRequest;-><init>()V

    .line 2
    iget-object v11, v1, Lcom/papa/sim/statistic/p$h2;->b:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_0

    .line 3
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget-object v12, v1, Lcom/papa/sim/statistic/p$h2;->b:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget-object v12, v1, Lcom/papa/sim/statistic/p$h2;->c:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    iget-object v11, v1, Lcom/papa/sim/statistic/p$h2;->d:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    const-string v12, "103"

    const-string v14, ""

    if-nez v11, :cond_a

    .line 6
    sget-object v11, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/papa/sim/statistic/StatRequest;->setEvent(Ljava/lang/String;)V

    move-object v15, v14

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-virtual {v10, v13, v14}, Lcom/papa/sim/statistic/StatRequest;->setTime(J)V

    .line 8
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v13

    iget-object v14, v1, Lcom/papa/sim/statistic/p$h2;->e:Ljava/lang/String;

    move-object/from16 v16, v12

    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    invoke-virtual {v13, v11, v12}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 9
    iget-object v11, v1, Lcom/papa/sim/statistic/p$h2;->f:Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v10, v11}, Lcom/papa/sim/statistic/StatRequest;->setUid(I)V

    .line 10
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getUid()I

    move-result v12

    invoke-virtual {v11, v12}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 11
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget-wide v12, v1, Lcom/papa/sim/statistic/p$h2;->g:J

    invoke-virtual {v11, v12, v13}, Lcom/papa/sim/statistic/Ext;->setDuration(J)V

    .line 12
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget v12, v1, Lcom/papa/sim/statistic/p$h2;->h:I

    invoke-virtual {v11, v12}, Lcom/papa/sim/statistic/Ext;->setInterrupt(I)V

    .line 13
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget-wide v12, v1, Lcom/papa/sim/statistic/p$h2;->i:J

    invoke-virtual {v11, v12, v13}, Lcom/papa/sim/statistic/Ext;->setZipCost(J)V

    .line 14
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget-object v12, v1, Lcom/papa/sim/statistic/p$h2;->j:Ljava/lang/String;

    invoke-virtual {v11, v12}, Lcom/papa/sim/statistic/Ext;->setKeyWord(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    iget v12, v1, Lcom/papa/sim/statistic/p$h2;->k:I

    invoke-virtual {v11, v12}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    .line 16
    iget v11, v1, Lcom/papa/sim/statistic/p$h2;->l:I

    const/4 v12, 0x1

    if-ne v11, v12, :cond_1

    .line 17
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Where;->search:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 18
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v0

    move-object/from16 v2, v16

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    goto/16 :goto_3

    .line 19
    :cond_1
    :try_start_0
    iget-object v11, v1, Lcom/papa/sim/statistic/p$h2;->d:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_9

    .line 20
    new-instance v11, Lorg/json/JSONObject;

    iget-object v12, v1, Lcom/papa/sim/statistic/p$h2;->d:Ljava/lang/String;

    invoke-direct {v11, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_2

    const-string v12, "0"

    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_2

    .line 22
    invoke-virtual {v11, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object v12, v15

    goto :goto_0

    .line 23
    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget v12, v1, Lcom/papa/sim/statistic/p$h2;->l:I

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object v12, v15

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 24
    :goto_0
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v13

    invoke-virtual {v13, v9}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 25
    invoke-virtual {v11, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-virtual {v11, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_3
    move-object v8, v12

    .line 26
    :goto_1
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v13

    invoke-virtual {v13, v8}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 27
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto :goto_2

    :cond_4
    move-object v14, v12

    .line 28
    :goto_2
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v7

    invoke-virtual {v7, v14}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 29
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 30
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_7

    .line 31
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v7

    invoke-virtual {v7, v9}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 32
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 33
    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 34
    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/papa/sim/statistic/Ext;->setRecPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 36
    :cond_5
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 37
    invoke-virtual {v11, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 38
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 39
    :cond_6
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 40
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 42
    :cond_7
    invoke-virtual {v11, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 43
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v0

    invoke-virtual {v11, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setDataFlag(Ljava/lang/String;)V

    .line 44
    :cond_8
    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 45
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v0

    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 47
    :cond_9
    :goto_3
    iget-object v0, v1, Lcom/papa/sim/statistic/p$h2;->n:Lcom/papa/sim/statistic/p;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0, v2, v10}, Lcom/papa/sim/statistic/o;->B(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/StatRequest;)V

    goto/16 :goto_5

    :cond_a
    move-object v2, v12

    move-object v12, v14

    .line 48
    iget v0, v1, Lcom/papa/sim/statistic/p$h2;->l:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_b

    .line 49
    sget-object v0, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Lcom/papa/sim/statistic/StatRequest;->setEvent(Ljava/lang/String;)V

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v10, v3, v4}, Lcom/papa/sim/statistic/StatRequest;->setTime(J)V

    .line 51
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v3

    iget-object v4, v1, Lcom/papa/sim/statistic/p$h2;->e:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 52
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Where;->search:Lcom/papa/sim/statistic/Where;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 53
    iget-object v3, v1, Lcom/papa/sim/statistic/p$h2;->f:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v10, v3}, Lcom/papa/sim/statistic/StatRequest;->setUid(I)V

    .line 54
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getUid()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 55
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    iget-object v4, v1, Lcom/papa/sim/statistic/p$h2;->j:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setKeyWord(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    iget-wide v4, v1, Lcom/papa/sim/statistic/p$h2;->g:J

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/Ext;->setDuration(J)V

    .line 57
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    iget v4, v1, Lcom/papa/sim/statistic/p$h2;->h:I

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setInterrupt(I)V

    .line 58
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    iget-wide v4, v1, Lcom/papa/sim/statistic/p$h2;->i:J

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/Ext;->setZipCost(J)V

    .line 59
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 60
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, v1, Lcom/papa/sim/statistic/p$h2;->m:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 61
    invoke-virtual {v10}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget v3, v1, Lcom/papa/sim/statistic/p$h2;->k:I

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    .line 62
    iget-object v2, v1, Lcom/papa/sim/statistic/p$h2;->n:Lcom/papa/sim/statistic/p;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v2

    invoke-virtual {v2, v0, v10}, Lcom/papa/sim/statistic/o;->B(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/StatRequest;)V

    goto :goto_5

    .line 63
    :cond_b
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 64
    new-instance v2, Lcom/papa/sim/statistic/Data;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 65
    :try_start_1
    iget-object v3, v1, Lcom/papa/sim/statistic/p$h2;->e:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 66
    iget-object v3, v1, Lcom/papa/sim/statistic/p$h2;->f:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    nop

    .line 67
    :goto_4
    iget-object v3, v1, Lcom/papa/sim/statistic/p$h2;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;

    .line 68
    iget-wide v2, v1, Lcom/papa/sim/statistic/p$h2;->i:J

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/Ext;->setZipCost(J)V

    .line 69
    iget-wide v2, v1, Lcom/papa/sim/statistic/p$h2;->g:J

    invoke-virtual {v0, v2, v3}, Lcom/papa/sim/statistic/Ext;->setDuration(J)V

    .line 70
    iget v2, v1, Lcom/papa/sim/statistic/p$h2;->h:I

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setInterrupt(I)V

    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v1, Lcom/papa/sim/statistic/p$h2;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 72
    iget v2, v1, Lcom/papa/sim/statistic/p$h2;->l:I

    const/16 v3, 0x65

    if-ne v2, v3, :cond_c

    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v1, Lcom/papa/sim/statistic/p$h2;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 74
    :cond_c
    iget v2, v1, Lcom/papa/sim/statistic/p$h2;->k:I

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    .line 75
    iget-object v2, v1, Lcom/papa/sim/statistic/p$h2;->n:Lcom/papa/sim/statistic/p;

    invoke-static {v2}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    iget-object v4, v1, Lcom/papa/sim/statistic/p$h2;->e:Ljava/lang/String;

    iget-object v5, v1, Lcom/papa/sim/statistic/p$h2;->f:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/papa/sim/statistic/o;->O(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;Lcom/papa/sim/statistic/Ext;)V

    :goto_5
    return-void
.end method
