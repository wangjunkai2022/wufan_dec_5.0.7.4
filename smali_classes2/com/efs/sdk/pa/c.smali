.class public final Lcom/efs/sdk/pa/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    const-string v1, "com.umeng.commonsdk.statistics.common.DeviceConfig"

    .line 26
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_1
    const-string v4, "getSid"

    new-array v5, v3, [Ljava/lang/Class;

    .line 27
    const-class v6, Landroid/content/Context;

    aput-object v6, v5, v2

    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    :try_start_2
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v2

    .line 28
    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, p0

    :catch_2
    :cond_1
    return-object v0
.end method

.method public static declared-synchronized a(Lcom/efs/sdk/pa/PAFactory;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    const-class v0, Lcom/efs/sdk/pa/c;

    monitor-enter v0

    .line 1
    :try_start_0
    new-instance v1, Lcom/efs/sdk/base/protocol/file/EfsTextFile;

    invoke-direct {v1, p1}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;-><init>(Ljava/lang/String;)V

    const-string p1, "custom_info"

    .line 2
    invoke-virtual {v1, p1}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->createAndAddKVSection(Ljava/lang/String;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    move-result-object p1

    const-string v2, "bserial"

    .line 3
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getSerial()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    const-string v2, "bsver"

    .line 4
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getSver()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 5
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getExtend()Ljava/util/HashMap;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 7
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 8
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 9
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 10
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v4, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    goto :goto_0

    :cond_0
    const-string v2, "crver"

    const-string v3, "2.1.158.umeng"

    .line 11
    invoke-virtual {p1, v2, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 12
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/efs/sdk/pa/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "um_session_id"

    .line 14
    invoke-virtual {p1, v3, v2}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 15
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 16
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getPaClient()Lcom/efs/sdk/pa/IPaClient;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getPaClient()Lcom/efs/sdk/pa/IPaClient;

    move-result-object v2

    invoke-interface {v2}, Lcom/efs/sdk/pa/IPaClient;->onGetCallbackInfo()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "um_user_string"

    .line 17
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getPaClient()Lcom/efs/sdk/pa/IPaClient;

    move-result-object v3

    invoke-interface {v3}, Lcom/efs/sdk/pa/IPaClient;->onGetCallbackInfo()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    :cond_2
    const-string p1, "stack"

    .line 18
    invoke-virtual {v1, p1}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->createAndAddTextSection(Ljava/lang/String;)Lcom/efs/sdk/base/protocol/file/section/TextSection;

    move-result-object p1

    .line 19
    invoke-virtual {p1, p2}, Lcom/efs/sdk/base/protocol/file/section/TextSection;->setBody(Ljava/lang/String;)V

    const-string v2, "linebreak"

    .line 20
    invoke-virtual {p1, v2}, Lcom/efs/sdk/base/protocol/file/section/AbsSection;->setSep(Ljava/lang/String;)V

    .line 21
    :cond_3
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getReporter()Lcom/efs/sdk/base/EfsReporter;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 22
    invoke-virtual {p1, v1}, Lcom/efs/sdk/base/EfsReporter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 23
    :cond_4
    invoke-virtual {p0}, Lcom/efs/sdk/pa/PAFactory;->getConfigManager()Lcom/efs/sdk/pa/config/ConfigManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/efs/sdk/pa/config/ConfigManager;->increaseUploadSmoothLogCnt()V

    const-string p0, "reportPaWpkStats: stack: "

    .line 24
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method
