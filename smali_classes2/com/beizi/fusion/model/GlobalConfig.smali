.class public Lcom/beizi/fusion/model/GlobalConfig;
.super Ljava/lang/Object;
.source "GlobalConfig.java"


# instance fields
.field private adPlusConfig:Lcom/beizi/fusion/model/AdPlusConfig;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "adPlusConfig"
    .end annotation
.end field

.field private bannerExcutorForLieYing:Ljava/lang/Object;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bannerExcutorForLieYing"
    .end annotation
.end field

.field private configVersion:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "configVersion"
    .end annotation
.end field

.field private configurator:Lcom/beizi/fusion/model/Configurator;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "configurator"
    .end annotation
.end field

.field private crashUrl:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "crashUrl"
    .end annotation
.end field

.field private expireTime:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "expireTime"
    .end annotation
.end field

.field private hr:Ljava/lang/Object;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "hr"
    .end annotation
.end field

.field private incentiveConfig:Lcom/beizi/fusion/model/IncentiveConfig;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "incentiveConfig"
    .end annotation
.end field

.field private lastUpdateTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "lastUpdateTime"
    .end annotation
.end field

.field private manager:Lcom/beizi/fusion/model/Manager;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "manager"
    .end annotation
.end field

.field private maxValidTime:J
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "maxValidTime"
    .end annotation
.end field

.field private messenger:Lcom/beizi/fusion/model/Messenger;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "messenger"
    .end annotation
.end field

.field private smFlag:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "smFlag"
    .end annotation
.end field

.field private taskConfig:Lcom/beizi/fusion/model/TaskConfig;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "taskConfig"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static objectFromData(Ljava/lang/String;)Lcom/beizi/fusion/model/GlobalConfig;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/beizi/fusion/model/GlobalConfig;

    invoke-static {p0, v0}, Lcom/beizi/fusion/model/JsonResolver;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/model/GlobalConfig;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static objectFromData(Ljava/lang/String;Ljava/lang/String;)Lcom/beizi/fusion/model/GlobalConfig;
    .locals 0

    .line 3
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-class p1, Lcom/beizi/fusion/model/GlobalConfig;

    invoke-static {p0, p1}, Lcom/beizi/fusion/model/JsonResolver;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/model/GlobalConfig;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    .line 6
    invoke-virtual {p0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static objectToJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/beizi/fusion/model/GlobalConfig;

    invoke-static {p0, v0}, Lcom/beizi/fusion/model/JsonResolver;->toJson(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getAdPlusConfig()Lcom/beizi/fusion/model/AdPlusConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->adPlusConfig:Lcom/beizi/fusion/model/AdPlusConfig;

    return-object v0
.end method

.method public getBannerExcutorForLieYing()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->bannerExcutorForLieYing:Ljava/lang/Object;

    return-object v0
.end method

.method public getConfigVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->configVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getConfigurator()Lcom/beizi/fusion/model/Configurator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->configurator:Lcom/beizi/fusion/model/Configurator;

    return-object v0
.end method

.method public getCrashUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->crashUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireTime()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->expireTime:I

    return v0
.end method

.method public getHr()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->hr:Ljava/lang/Object;

    return-object v0
.end method

.method public getIncentiveConfig()Lcom/beizi/fusion/model/IncentiveConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->incentiveConfig:Lcom/beizi/fusion/model/IncentiveConfig;

    return-object v0
.end method

.method public getLastUpdateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->lastUpdateTime:J

    return-wide v0
.end method

.method public getManager()Lcom/beizi/fusion/model/Manager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->manager:Lcom/beizi/fusion/model/Manager;

    return-object v0
.end method

.method public getMaxValidTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->maxValidTime:J

    return-wide v0
.end method

.method public getMessenger()Lcom/beizi/fusion/model/Messenger;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->messenger:Lcom/beizi/fusion/model/Messenger;

    return-object v0
.end method

.method public getSmFlag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->smFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getTaskConfig()Lcom/beizi/fusion/model/TaskConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/GlobalConfig;->taskConfig:Lcom/beizi/fusion/model/TaskConfig;

    return-object v0
.end method

.method public setAdPlusConfig(Lcom/beizi/fusion/model/AdPlusConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->adPlusConfig:Lcom/beizi/fusion/model/AdPlusConfig;

    return-void
.end method

.method public setBannerExcutorForLieYing(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->bannerExcutorForLieYing:Ljava/lang/Object;

    return-void
.end method

.method public setConfigVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->configVersion:Ljava/lang/String;

    return-void
.end method

.method public setConfigurator(Lcom/beizi/fusion/model/Configurator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->configurator:Lcom/beizi/fusion/model/Configurator;

    return-void
.end method

.method public setCrashUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->crashUrl:Ljava/lang/String;

    return-void
.end method

.method public setExpireTime(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->expireTime:I

    return-void
.end method

.method public setHr(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->hr:Ljava/lang/Object;

    return-void
.end method

.method public setIncentiveConfig(Lcom/beizi/fusion/model/IncentiveConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->incentiveConfig:Lcom/beizi/fusion/model/IncentiveConfig;

    return-void
.end method

.method public setLastUpdateTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->lastUpdateTime:J

    return-void
.end method

.method public setManager(Lcom/beizi/fusion/model/Manager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->manager:Lcom/beizi/fusion/model/Manager;

    return-void
.end method

.method public setMaxValidTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->maxValidTime:J

    return-void
.end method

.method public setMessenger(Lcom/beizi/fusion/model/Messenger;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->messenger:Lcom/beizi/fusion/model/Messenger;

    return-void
.end method

.method public setSmFlag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->smFlag:Ljava/lang/String;

    return-void
.end method

.method public setTaskConfig(Lcom/beizi/fusion/model/TaskConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/GlobalConfig;->taskConfig:Lcom/beizi/fusion/model/TaskConfig;

    return-void
.end method
