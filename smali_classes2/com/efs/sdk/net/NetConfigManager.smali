.class public Lcom/efs/sdk/net/NetConfigManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/efs/sdk/base/EfsReporter;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z

.field private k:Landroid/content/Context;

.field private l:I

.field private m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 19

    move-object/from16 v0, p0

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "NetConfigManager"

    .line 2
    iput-object v1, v0, Lcom/efs/sdk/net/NetConfigManager;->a:Ljava/lang/String;

    const/4 v2, 0x0

    .line 3
    iput v2, v0, Lcom/efs/sdk/net/NetConfigManager;->b:I

    .line 4
    iput v2, v0, Lcom/efs/sdk/net/NetConfigManager;->d:I

    .line 5
    iput v2, v0, Lcom/efs/sdk/net/NetConfigManager;->e:I

    const/16 v3, 0x64

    .line 6
    iput v3, v0, Lcom/efs/sdk/net/NetConfigManager;->h:I

    const/16 v4, 0xa

    .line 7
    iput v4, v0, Lcom/efs/sdk/net/NetConfigManager;->i:I

    .line 8
    iput-boolean v2, v0, Lcom/efs/sdk/net/NetConfigManager;->j:Z

    const/4 v4, -0x1

    .line 9
    iput v4, v0, Lcom/efs/sdk/net/NetConfigManager;->l:I

    .line 10
    iput-boolean v2, v0, Lcom/efs/sdk/net/NetConfigManager;->m:Z

    .line 11
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    iput-object v5, v0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    move-object/from16 v6, p2

    .line 12
    iput-object v6, v0, Lcom/efs/sdk/net/NetConfigManager;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string v6, "net_launch"

    .line 13
    invoke-virtual {v5, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v7, "apm_netperf_extra_last"

    const-string v8, "apm_netperf_sampling_rate_last"

    if-eqz v5, :cond_0

    .line 14
    invoke-interface {v5, v8, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v9

    iput v9, v0, Lcom/efs/sdk/net/NetConfigManager;->f:I

    .line 15
    invoke-interface {v5, v7, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    iput v5, v0, Lcom/efs/sdk/net/NetConfigManager;->g:I

    .line 16
    :cond_0
    iget-object v5, v0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    invoke-virtual {v5, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    const-string v9, "apm_netperf_extra"

    const-string v10, "apm_netperf_sampling_rate"

    if-eqz v5, :cond_1

    .line 17
    invoke-interface {v5, v10, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11

    .line 18
    invoke-interface {v5, v9, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    iput v5, v0, Lcom/efs/sdk/net/NetConfigManager;->e:I

    goto :goto_0

    :cond_1
    const/4 v11, -0x1

    .line 19
    :goto_0
    iget-object v5, v0, Lcom/efs/sdk/net/NetConfigManager;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string v12, "apm_netperf_day_limit"

    const-string v13, "apm_netperf_data_rate"

    filled-new-array {v10, v12, v13, v9}, [Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/efs/sdk/net/NetConfigManager$1;

    invoke-direct {v10, v0}, Lcom/efs/sdk/net/NetConfigManager$1;-><init>(Lcom/efs/sdk/net/NetConfigManager;)V

    invoke-virtual {v5, v9, v10}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    if-eq v11, v4, :cond_2

    .line 20
    iput v11, v0, Lcom/efs/sdk/net/NetConfigManager;->d:I

    .line 21
    :cond_2
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_1
    const/4 v1, 0x1

    goto/16 :goto_8

    .line 22
    :cond_3
    iget-object v4, v0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    invoke-virtual {v4, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v9, "03f870871950c148387b251894ed3e88"

    const-wide/16 v10, 0x0

    if-eqz v4, :cond_4

    .line 23
    invoke-interface {v4, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    goto :goto_2

    :cond_4
    move-wide v14, v10

    :goto_2
    const-string v5, "8f2f54c08600aa25915617fa1371441b"

    if-eqz v4, :cond_5

    .line 24
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v16

    goto :goto_3

    :cond_5
    const/16 v16, 0x0

    .line 25
    :goto_3
    iget v3, v0, Lcom/efs/sdk/net/NetConfigManager;->d:I

    if-nez v3, :cond_8

    if-eqz v16, :cond_6

    if-eqz v4, :cond_6

    .line 26
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 27
    invoke-interface {v1, v5, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 28
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_6
    cmp-long v1, v14, v10

    if-eqz v1, :cond_7

    if-eqz v4, :cond_7

    .line 29
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 30
    invoke-interface {v1, v9, v10, v11}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 31
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_7
    :goto_4
    const/4 v1, 0x0

    goto/16 :goto_8

    .line 32
    :cond_8
    iget v4, v0, Lcom/efs/sdk/net/NetConfigManager;->e:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, v0, Lcom/efs/sdk/net/NetConfigManager;->f:I

    iget v10, v0, Lcom/efs/sdk/net/NetConfigManager;->g:I

    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-eq v3, v4, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    .line 33
    :goto_5
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget v10, v0, Lcom/efs/sdk/net/NetConfigManager;->d:I

    iget v11, v0, Lcom/efs/sdk/net/NetConfigManager;->e:I

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    .line 35
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    sub-long v14, v14, v17

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-wide/32 v14, 0x5265c00

    if-eqz v16, :cond_a

    .line 36
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v16, v17, v14

    if-gez v16, :cond_a

    if-nez v3, :cond_a

    const-string v3, " check in allready"

    .line 37
    invoke-static {v1, v3}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 38
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v4, v17, v14

    if-gez v4, :cond_c

    if-eqz v3, :cond_b

    goto :goto_6

    :cond_b
    const-string v3, "un repeat check in 24 hour!"

    .line 39
    invoke-static {v1, v3}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 40
    :cond_c
    :goto_6
    invoke-static {v10}, Lcom/efs/sdk/net/NetConfigManager;->a(I)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v3, "random check in"

    .line 41
    invoke-static {v1, v3}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    goto :goto_7

    :cond_d
    const-string v3, "random not check in!"

    .line 42
    invoke-static {v1, v3}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 43
    :goto_7
    iget-object v3, v0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    invoke-virtual {v3, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 44
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    if-eqz v4, :cond_e

    .line 45
    invoke-interface {v4, v5, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 46
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_e
    if-eqz v3, :cond_f

    .line 47
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 48
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-interface {v3, v9, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 49
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 50
    :cond_f
    :goto_8
    iput-boolean v1, v0, Lcom/efs/sdk/net/NetConfigManager;->j:Z

    .line 51
    iget-object v1, v0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    invoke-virtual {v1, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 52
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 53
    iget v3, v0, Lcom/efs/sdk/net/NetConfigManager;->d:I

    invoke-interface {v1, v8, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 54
    iget v3, v0, Lcom/efs/sdk/net/NetConfigManager;->e:I

    invoke-interface {v1, v7, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 55
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 56
    :cond_10
    iget-object v1, v0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    invoke-virtual {v1, v6, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_11

    .line 57
    invoke-interface {v1, v12, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, v0, Lcom/efs/sdk/net/NetConfigManager;->h:I

    .line 58
    invoke-interface {v1, v13, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, v0, Lcom/efs/sdk/net/NetConfigManager;->i:I

    .line 59
    :cond_11
    iget v1, v0, Lcom/efs/sdk/net/NetConfigManager;->d:I

    iget v3, v0, Lcom/efs/sdk/net/NetConfigManager;->e:I

    if-lt v1, v3, :cond_12

    .line 60
    iput v2, v0, Lcom/efs/sdk/net/NetConfigManager;->l:I

    return-void

    :cond_12
    if-nez v3, :cond_13

    .line 61
    iput v2, v0, Lcom/efs/sdk/net/NetConfigManager;->l:I

    return-void

    :cond_13
    const/16 v4, 0x64

    mul-int/lit8 v1, v1, 0x64

    .line 62
    div-int/2addr v1, v3

    invoke-static {v1}, Lcom/efs/sdk/net/NetConfigManager;->a(I)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 63
    iput v2, v0, Lcom/efs/sdk/net/NetConfigManager;->l:I

    return-void

    :cond_14
    const/4 v1, 0x1

    .line 64
    iput v1, v0, Lcom/efs/sdk/net/NetConfigManager;->l:I

    return-void
.end method

.method static synthetic a(Lcom/efs/sdk/net/NetConfigManager;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/efs/sdk/net/NetConfigManager;->h:I

    return p1
.end method

.method static synthetic a(Lcom/efs/sdk/net/NetConfigManager;)Landroid/content/Context;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/efs/sdk/net/NetConfigManager;->k:Landroid/content/Context;

    return-object p0
.end method

.method private static a(I)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    const/16 v2, 0x64

    if-ne p0, v2, :cond_1

    return v1

    .line 3
    :cond_1
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    .line 4
    invoke-virtual {v3, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    if-gt v2, p0, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method static synthetic b(Lcom/efs/sdk/net/NetConfigManager;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/efs/sdk/net/NetConfigManager;->i:I

    return p1
.end method


# virtual methods
.method public enableTracer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/net/NetConfigManager;->j:Z

    return v0
.end method

.method public getDataRate()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/efs/sdk/net/NetConfigManager;->i:I

    return v0
.end method

.method public getDayLimit()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/efs/sdk/net/NetConfigManager;->h:I

    return v0
.end method

.method public getExtraRateFlag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/efs/sdk/net/NetConfigManager;->l:I

    return v0
.end method

.method public getNetRequestBodyCollectState()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/efs/sdk/net/NetConfigManager;->m:Z

    return v0
.end method

.method public setNetRequestBodyCollectState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/efs/sdk/net/NetConfigManager;->m:Z

    return-void
.end method
