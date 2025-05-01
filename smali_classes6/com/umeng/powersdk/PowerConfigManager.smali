.class public Lcom/umeng/powersdk/PowerConfigManager;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Lcom/efs/sdk/base/EfsReporter;

.field private d:I

.field private final e:I

.field private f:I

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/efs/sdk/base/EfsReporter;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "PageConfigManager"

    iput-object v1, v0, Lcom/umeng/powersdk/PowerConfigManager;->a:Ljava/lang/String;

    const/16 v1, 0x64

    iput v1, v0, Lcom/umeng/powersdk/PowerConfigManager;->d:I

    const/4 v2, 0x0

    iput v2, v0, Lcom/umeng/powersdk/PowerConfigManager;->e:I

    iput-boolean v2, v0, Lcom/umeng/powersdk/PowerConfigManager;->g:Z

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v0, Lcom/umeng/powersdk/PowerConfigManager;->b:Landroid/content/Context;

    move-object/from16 v4, p2

    iput-object v4, v0, Lcom/umeng/powersdk/PowerConfigManager;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string v4, "efs_power"

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v5, "apm_powerperf_sampling_rate_last"

    if-eqz v3, :cond_0

    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, v0, Lcom/umeng/powersdk/PowerConfigManager;->f:I

    :cond_0
    iget-object v3, v0, Lcom/umeng/powersdk/PowerConfigManager;->b:Landroid/content/Context;

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v6, "apm_powerperf_sampling_rate"

    const/4 v7, -0x1

    if-eqz v3, :cond_1

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :goto_0
    iget-object v8, v0, Lcom/umeng/powersdk/PowerConfigManager;->c:Lcom/efs/sdk/base/EfsReporter;

    const-string v9, "apm_powerperf_collect_interval"

    const-string v10, "apm_powerperf_collect_max_period_sec"

    filled-new-array {v6, v9, v10}, [Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lcom/umeng/powersdk/PowerConfigManager$1;

    invoke-direct {v9, v0}, Lcom/umeng/powersdk/PowerConfigManager$1;-><init>(Lcom/umeng/powersdk/PowerConfigManager;)V

    invoke-virtual {v8, v6, v9}, Lcom/efs/sdk/base/EfsReporter;->getAllSdkConfig([Ljava/lang/String;Lcom/efs/sdk/base/observer/IConfigCallback;)V

    if-eq v3, v7, :cond_2

    iput v3, v0, Lcom/umeng/powersdk/PowerConfigManager;->d:I

    :cond_2
    invoke-static {}, Lcom/efs/sdk/base/samplingwhitelist/SamplingWhiteListUtil;->isHitWL()Z

    move-result v3

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    goto/16 :goto_9

    :cond_3
    iget-object v3, v0, Lcom/umeng/powersdk/PowerConfigManager;->b:Landroid/content/Context;

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v7, "03f870871950c148387b251894ed3e88"

    const-wide/16 v8, 0x0

    if-eqz v3, :cond_4

    invoke-interface {v3, v7, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    goto :goto_1

    :cond_4
    move-wide v10, v8

    :goto_1
    const-string v12, "8f2f54c08600aa25915617fa1371441b"

    if-eqz v3, :cond_5

    invoke-interface {v3, v12, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    goto :goto_2

    :cond_5
    const/4 v13, 0x0

    :goto_2
    iget v14, v0, Lcom/umeng/powersdk/PowerConfigManager;->d:I

    if-nez v14, :cond_8

    if-eqz v13, :cond_6

    if-eqz v3, :cond_6

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v1, v12, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_6
    cmp-long v1, v10, v8

    if-eqz v1, :cond_7

    if-eqz v3, :cond_7

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {v1, v7, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_7
    :goto_3
    const/4 v6, 0x0

    goto/16 :goto_9

    :cond_8
    iget v3, v0, Lcom/umeng/powersdk/PowerConfigManager;->f:I

    if-eq v14, v3, :cond_9

    const/4 v3, 0x1

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :goto_4
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    iget v9, v0, Lcom/umeng/powersdk/PowerConfigManager;->d:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    sub-long v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-wide/32 v14, 0x5265c00

    if-eqz v13, :cond_a

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    cmp-long v11, v16, v14

    if-gez v11, :cond_a

    if-nez v3, :cond_a

    sget-boolean v1, Lcom/umeng/powersdk/PowerManager;->isDebug:Z

    goto :goto_9

    :cond_a
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    cmp-long v8, v16, v14

    if-gez v8, :cond_c

    if-eqz v3, :cond_b

    goto :goto_5

    :cond_b
    sget-boolean v1, Lcom/umeng/powersdk/PowerManager;->isDebug:Z

    goto :goto_3

    :cond_c
    :goto_5
    if-eqz v9, :cond_e

    if-ne v9, v1, :cond_d

    :goto_6
    const/4 v1, 0x1

    goto :goto_7

    :cond_d
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    invoke-virtual {v3, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    if-gt v1, v9, :cond_e

    goto :goto_6

    :cond_e
    const/4 v1, 0x0

    :goto_7
    if-eqz v1, :cond_f

    sget-boolean v1, Lcom/umeng/powersdk/PowerManager;->isDebug:Z

    goto :goto_8

    :cond_f
    sget-boolean v1, Lcom/umeng/powersdk/PowerManager;->isDebug:Z

    const/4 v6, 0x0

    :goto_8
    iget-object v1, v0, Lcom/umeng/powersdk/PowerConfigManager;->b:Landroid/content/Context;

    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-interface {v3, v12, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_10
    if-eqz v1, :cond_11

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-interface {v1, v7, v8, v9}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_11
    :goto_9
    iput-boolean v6, v0, Lcom/umeng/powersdk/PowerConfigManager;->g:Z

    iget-object v1, v0, Lcom/umeng/powersdk/PowerConfigManager;->b:Landroid/content/Context;

    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_12

    iget v2, v0, Lcom/umeng/powersdk/PowerConfigManager;->d:I

    invoke-interface {v1, v5, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_12
    return-void
.end method

.method static synthetic a(Lcom/umeng/powersdk/PowerConfigManager;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/umeng/powersdk/PowerConfigManager;->b:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public enableTracer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/umeng/powersdk/PowerConfigManager;->g:Z

    return v0
.end method
