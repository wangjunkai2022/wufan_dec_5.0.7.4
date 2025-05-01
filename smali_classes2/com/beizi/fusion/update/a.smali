.class public Lcom/beizi/fusion/update/a;
.super Ljava/lang/Object;
.source "HeartResponse.java"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    .line 3
    invoke-direct {p0, p2}, Lcom/beizi/fusion/update/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 7

    const-string v0, ""

    const-string v1, "globalConfig"

    .line 1
    invoke-static {}, Lcom/beizi/fusion/g/ad;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/beizi/fusion/g/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_15

    .line 3
    :try_start_0
    invoke-static {p1}, Lcom/beizi/fusion/g/z;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2, v1, v0}, Lcom/beizi/fusion/g/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 5
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {}, Lcom/beizi/fusion/g/ad;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lcom/beizi/fusion/g/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/g/ad;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/beizi/fusion/g/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {p1}, Lcom/beizi/fusion/model/GlobalConfig;->objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/GlobalConfig;

    move-result-object p1

    .line 9
    invoke-static {v0}, Lcom/beizi/fusion/model/GlobalConfig;->objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/GlobalConfig;

    move-result-object v0

    if-eqz p1, :cond_15

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/beizi/fusion/model/ResponseInfo;->setGlobalConfig(Lcom/beizi/fusion/model/GlobalConfig;)V

    .line 11
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getConfigVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getConfigVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setConfigVersion(Ljava/lang/String;)V

    .line 13
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v2

    if-nez v2, :cond_2

    .line 14
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getConfigVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/model/ResponseInfo;->setConfigVersion(Ljava/lang/String;)V

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getExpireTime()I

    move-result v2

    if-lez v2, :cond_4

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getExpireTime()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setExpireTime(I)V

    .line 17
    :cond_3
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getExpireTime()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Lcom/beizi/fusion/model/ResponseInfo;->setExpireTime(J)V

    .line 18
    :cond_4
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getMaxValidTime()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_6

    if-eqz v0, :cond_5

    .line 19
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getMaxValidTime()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/beizi/fusion/model/GlobalConfig;->setMaxValidTime(J)V

    .line 20
    :cond_5
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getMaxValidTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/beizi/fusion/model/ResponseInfo;->setMaxValidTime(J)V

    .line 21
    :cond_6
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object v2

    if-eqz v2, :cond_8

    if-eqz v0, :cond_7

    .line 22
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setConfigurator(Lcom/beizi/fusion/model/Configurator;)V

    .line 23
    :cond_7
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v2

    if-nez v2, :cond_8

    .line 24
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getConfigurator()Lcom/beizi/fusion/model/Configurator;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/model/ResponseInfo;->setConfigurator(Lcom/beizi/fusion/model/Configurator;)V

    .line 25
    :cond_8
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getMessenger()Lcom/beizi/fusion/model/Messenger;

    move-result-object v2

    if-eqz v2, :cond_a

    if-eqz v0, :cond_9

    .line 26
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getMessenger()Lcom/beizi/fusion/model/Messenger;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setMessenger(Lcom/beizi/fusion/model/Messenger;)V

    .line 27
    :cond_9
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v2

    if-nez v2, :cond_a

    .line 28
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getMessenger()Lcom/beizi/fusion/model/Messenger;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/model/ResponseInfo;->setMessenger(Lcom/beizi/fusion/model/Messenger;)V

    .line 29
    :cond_a
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v2

    if-eqz v2, :cond_c

    if-eqz v0, :cond_b

    .line 30
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setManager(Lcom/beizi/fusion/model/Manager;)V

    .line 31
    :cond_b
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v2

    if-nez v2, :cond_c

    .line 32
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getManager()Lcom/beizi/fusion/model/Manager;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/model/ResponseInfo;->setManager(Lcom/beizi/fusion/model/Manager;)V

    .line 33
    :cond_c
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v2

    if-eqz v2, :cond_e

    if-eqz v0, :cond_d

    .line 34
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setTaskConfig(Lcom/beizi/fusion/model/TaskConfig;)V

    .line 35
    :cond_d
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/model/ResponseInfo;->setTaskConfig(Lcom/beizi/fusion/model/TaskConfig;)V

    .line 36
    :cond_e
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getAdPlusConfig()Lcom/beizi/fusion/model/AdPlusConfig;

    move-result-object v2

    if-eqz v2, :cond_10

    if-eqz v0, :cond_f

    .line 37
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getAdPlusConfig()Lcom/beizi/fusion/model/AdPlusConfig;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setAdPlusConfig(Lcom/beizi/fusion/model/AdPlusConfig;)V

    .line 38
    :cond_f
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getAdPlusConfig()Lcom/beizi/fusion/model/AdPlusConfig;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/beizi/fusion/model/ResponseInfo;->setAdPlusConfig(Lcom/beizi/fusion/model/AdPlusConfig;)V

    .line 39
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/d/w;->a(Landroid/content/Context;)V

    .line 40
    :cond_10
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getIncentiveConfig()Lcom/beizi/fusion/model/IncentiveConfig;

    move-result-object v2

    if-eqz v2, :cond_12

    if-eqz v0, :cond_11

    .line 41
    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setIncentiveConfig(Lcom/beizi/fusion/model/IncentiveConfig;)V

    .line 42
    :cond_11
    iget-object v3, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/beizi/fusion/model/ResponseInfo;->setIncentiveConfig(Lcom/beizi/fusion/model/IncentiveConfig;)V

    .line 43
    iget-object v3, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v3, v2}, Lcom/beizi/fusion/d/w;->a(Landroid/content/Context;Lcom/beizi/fusion/model/IncentiveConfig;)V

    .line 44
    :cond_12
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getCrashUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_14

    if-eqz v0, :cond_13

    .line 45
    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getCrashUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/beizi/fusion/model/GlobalConfig;->setCrashUrl(Ljava/lang/String;)V

    .line 46
    :cond_13
    iget-object v2, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/beizi/fusion/model/ResponseInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/ResponseInfo;

    move-result-object v2

    invoke-virtual {p1}, Lcom/beizi/fusion/model/GlobalConfig;->getCrashUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/beizi/fusion/model/ResponseInfo;->setCrashUrl(Ljava/lang/String;)V

    .line 47
    :cond_14
    invoke-static {v0}, Lcom/beizi/fusion/model/GlobalConfig;->objectToJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 48
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 49
    iget-object v0, p0, Lcom/beizi/fusion/update/a;->a:Landroid/content/Context;

    invoke-static {}, Lcom/beizi/fusion/g/ad;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/beizi/fusion/g/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_15
    :goto_0
    return-void
.end method
