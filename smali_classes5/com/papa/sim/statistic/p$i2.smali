.class Lcom/papa/sim/statistic/p$i2;
.super Ljava/lang/Object;
.source "StatFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa/sim/statistic/p;->F0(Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;JIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
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

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:J

.field final synthetic i:I

.field final synthetic j:J

.field final synthetic k:Ljava/lang/String;

.field final synthetic l:I

.field final synthetic m:I

.field final synthetic n:I

.field final synthetic o:Lcom/papa/sim/statistic/p;


# direct methods
.method constructor <init>(Lcom/papa/sim/statistic/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/String;III)V
    .locals 3

    move-object v0, p0

    move-object v1, p1

    .line 1
    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->o:Lcom/papa/sim/statistic/p;

    move-object v1, p2

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->d:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->e:Ljava/lang/String;

    move-object v1, p6

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->f:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->g:Ljava/lang/String;

    move-wide v1, p8

    iput-wide v1, v0, Lcom/papa/sim/statistic/p$i2;->h:J

    move v1, p10

    iput v1, v0, Lcom/papa/sim/statistic/p$i2;->i:I

    move-wide v1, p11

    iput-wide v1, v0, Lcom/papa/sim/statistic/p$i2;->j:J

    move-object/from16 v1, p13

    iput-object v1, v0, Lcom/papa/sim/statistic/p$i2;->k:Ljava/lang/String;

    move/from16 v1, p14

    iput v1, v0, Lcom/papa/sim/statistic/p$i2;->l:I

    move/from16 v1, p15

    iput v1, v0, Lcom/papa/sim/statistic/p$i2;->m:I

    move/from16 v1, p16

    iput v1, v0, Lcom/papa/sim/statistic/p$i2;->n:I

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

    .line 1
    new-instance v7, Lcom/papa/sim/statistic/StatRequest;

    invoke-direct {v7}, Lcom/papa/sim/statistic/StatRequest;-><init>()V

    .line 2
    iget-object v8, v1, Lcom/papa/sim/statistic/p$i2;->b:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 3
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->b:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setPage(Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->c:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 5
    iget-object v8, v1, Lcom/papa/sim/statistic/p$i2;->d:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_6

    .line 6
    sget-object v8, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/papa/sim/statistic/StatRequest;->setEvent(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Lcom/papa/sim/statistic/StatRequest;->setTime(J)V

    .line 8
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v8

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->e:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 9
    iget-object v8, v1, Lcom/papa/sim/statistic/p$i2;->f:Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/papa/sim/statistic/StatRequest;->setUid(I)V

    .line 10
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getUid()I

    move-result v9

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setUid(I)Lcom/papa/sim/statistic/Ext;

    .line 11
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->g:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setKeyWord(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-wide v9, v1, Lcom/papa/sim/statistic/p$i2;->h:J

    invoke-virtual {v8, v9, v10}, Lcom/papa/sim/statistic/Ext;->setDuration(J)V

    .line 13
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget v9, v1, Lcom/papa/sim/statistic/p$i2;->i:I

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setInterrupt(I)V

    .line 14
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-wide v9, v1, Lcom/papa/sim/statistic/p$i2;->j:J

    invoke-virtual {v8, v9, v10}, Lcom/papa/sim/statistic/Ext;->setZipCost(J)V

    .line 15
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->k:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setArticleId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 16
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v8

    iget v9, v1, Lcom/papa/sim/statistic/p$i2;->l:I

    invoke-virtual {v8, v9}, Lcom/papa/sim/statistic/Ext;->setGameFlag(I)Lcom/papa/sim/statistic/Ext;

    .line 17
    :try_start_0
    iget-object v8, v1, Lcom/papa/sim/statistic/p$i2;->d:Ljava/lang/String;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 18
    new-instance v8, Lorg/json/JSONObject;

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->d:Ljava/lang/String;

    invoke-direct {v8, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v9, "from"

    .line 19
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "position"

    .line 20
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "location"

    .line 21
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    invoke-virtual {v11, v9}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 23
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v11

    invoke-virtual {v11, v10}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 24
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 25
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 26
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 27
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v9

    invoke-virtual {v9, v6}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 28
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 29
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/papa/sim/statistic/Ext;->setRecPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 31
    :cond_1
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 32
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 33
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 34
    :cond_2
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 35
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 37
    :cond_3
    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 38
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getExt()Lcom/papa/sim/statistic/Ext;

    move-result-object v0

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Ext;->setDataFlag(Ljava/lang/String;)V

    .line 39
    :cond_4
    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 40
    invoke-virtual {v7}, Lcom/papa/sim/statistic/StatRequest;->getData()Lcom/papa/sim/statistic/Data;

    move-result-object v0

    invoke-virtual {v8, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/papa/sim/statistic/Data;->setWhere(Ljava/lang/String;)Lcom/papa/sim/statistic/Data;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 42
    :cond_5
    :goto_0
    iget-object v0, v1, Lcom/papa/sim/statistic/p$i2;->o:Lcom/papa/sim/statistic/p;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0, v2, v7}, Lcom/papa/sim/statistic/o;->B(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/StatRequest;)V

    goto :goto_1

    .line 43
    :cond_6
    iget-object v0, v1, Lcom/papa/sim/statistic/p$i2;->o:Lcom/papa/sim/statistic/p;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->a(Lcom/papa/sim/statistic/p;)Lcom/papa/sim/statistic/o;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->gameDownload:Lcom/papa/sim/statistic/Event;

    iget-object v4, v1, Lcom/papa/sim/statistic/p$i2;->e:Ljava/lang/String;

    iget-object v5, v1, Lcom/papa/sim/statistic/p$i2;->g:Ljava/lang/String;

    iget-wide v6, v1, Lcom/papa/sim/statistic/p$i2;->h:J

    iget v8, v1, Lcom/papa/sim/statistic/p$i2;->i:I

    iget-object v9, v1, Lcom/papa/sim/statistic/p$i2;->f:Ljava/lang/String;

    iget-object v10, v1, Lcom/papa/sim/statistic/p$i2;->k:Ljava/lang/String;

    iget-wide v11, v1, Lcom/papa/sim/statistic/p$i2;->j:J

    iget v13, v1, Lcom/papa/sim/statistic/p$i2;->m:I

    iget v14, v1, Lcom/papa/sim/statistic/p$i2;->n:I

    iget v15, v1, Lcom/papa/sim/statistic/p$i2;->l:I

    const-string v16, ""

    invoke-virtual/range {v2 .. v16}, Lcom/papa/sim/statistic/o;->N(Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;JIIILjava/lang/String;)V

    :goto_1
    return-void
.end method
