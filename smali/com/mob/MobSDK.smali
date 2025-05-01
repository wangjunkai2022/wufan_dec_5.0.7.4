.class public Lcom/mob/MobSDK;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/tools/proguard/PublicMemberKeeper;


# static fields
.field public static final CHANNEL_APICLOUD:I = 0x5

.field public static final CHANNEL_COCOS:I = 0x1

.field public static final CHANNEL_FLUTTER:I = 0x4

.field public static final CHANNEL_JS:I = 0x3

.field public static final CHANNEL_NATIVE:I = 0x0

.field public static final CHANNEL_QUICKSDK:I = 0x6

.field public static final CHANNEL_REACT_NATIVE:I = 0x8

.field public static final CHANNEL_UNIAPP:I = 0x7

.field public static final CHANNEL_UNITY:I = 0x2

.field public static final SDK_VERSION_CODE:I

.field public static final SDK_VERSION_NAME:Ljava/lang/String;

.field private static volatile a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "-"

    const-string v1, "2024-10-16"

    const-string v2, "1.0.0"

    :try_start_0
    const-string v3, "."

    .line 1
    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    .line 2
    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x1

    .line 3
    :goto_0
    sput v0, Lcom/mob/MobSDK;->SDK_VERSION_CODE:I

    .line 4
    sput-object v2, Lcom/mob/MobSDK;->SDK_VERSION_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static canIContinueBusiness(Lcom/mob/commons/MobProduct;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p2, :cond_0

    .line 1
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lcom/mob/MobSDK$2;

    invoke-direct {v0, p0, p2}, Lcom/mob/MobSDK$2;-><init>(Lcom/mob/commons/MobProduct;Ljava/lang/Object;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "callback can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static checkForceHttps()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/mob/commons/r;->f:Z

    return v0
.end method

.method public static checkRequestUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/mob/commons/v;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static checkV6()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/mob/commons/r;->g:Z

    return v0
.end method

.method public static dynamicModifyUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/mob/commons/v;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getAppSecret()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/mob/commons/r;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/mob/commons/r;->d:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    sget-object v0, Lcom/mob/commons/r;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static getAppkey()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/x;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/mob/commons/u;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/mob/MobSDK;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/mob/commons/v;->a()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0}, Lcom/mob/MobSDK;->init(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :catchall_0
    :cond_0
    sget-object v0, Lcom/mob/MobSDK;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static getContextSafely()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/mob/MobSDK;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static getDefaultPrivacy()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static getDomain()Lcom/mob/commons/InternationalDomain;
    .locals 1

    .line 1
    sget-object v0, Lcom/mob/commons/r;->e:Lcom/mob/commons/InternationalDomain;

    if-nez v0, :cond_0

    sget-object v0, Lcom/mob/commons/InternationalDomain;->DEFAULT:Lcom/mob/commons/InternationalDomain;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/mob/commons/r;->e:Lcom/mob/commons/InternationalDomain;

    :goto_0
    return-object v0
.end method

.method public static getPrivacyGrantedStatus()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/x;->c()I

    move-result v0

    return v0
.end method

.method public static declared-synchronized init(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/mob/MobSDK;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {p0, v1, v1}, Lcom/mob/MobSDK;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized init(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-class v0, Lcom/mob/MobSDK;

    monitor-enter v0

    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-static {p0, p1, v1}, Lcom/mob/MobSDK;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-class v0, Lcom/mob/MobSDK;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 5
    monitor-exit v0

    return-void

    .line 6
    :cond_0
    :try_start_0
    sget-object v1, Lcom/mob/MobSDK;->a:Landroid/content/Context;

    if-nez v1, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/mob/MobSDK;->a:Landroid/content/Context;

    .line 8
    sput-object p1, Lcom/mob/commons/r;->a:Ljava/lang/String;

    .line 9
    sput-object p2, Lcom/mob/commons/r;->b:Ljava/lang/String;

    const/4 p0, 0x0

    .line 10
    invoke-static {p0}, Lcom/mob/commons/u;->a(Z)V

    goto :goto_0

    .line 11
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_2

    sget-object p0, Lcom/mob/commons/r;->a:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 12
    sput-object p1, Lcom/mob/commons/r;->a:Ljava/lang/String;

    .line 13
    sput-object p2, Lcom/mob/commons/r;->b:Ljava/lang/String;

    const/4 p0, 0x1

    .line 14
    invoke-static {p0}, Lcom/mob/commons/u;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final isAuth()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/u;->b()I

    move-result v0

    return v0
.end method

.method public static final isForb()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/u;->d()Z

    move-result v0

    return v0
.end method

.method public static final isGppVer()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/mob/commons/r;->i:Z

    return v0
.end method

.method public static final isMob()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/u;->c()Z

    move-result v0

    return v0
.end method

.method public static setChannel(Lcom/mob/commons/MobProduct;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/MobSDK;->isForb()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/mob/tools/MobLog;->getInstance()Lcom/mob/tools/log/NLog;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "isForb: true"

    invoke-virtual {p0, v0, p1}, Lcom/mob/tools/log/NLog;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/mob/commons/s;->a()Lcom/mob/commons/s;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/mob/commons/s;->a(Lcom/mob/commons/MobProduct;I)V

    return-void
.end method

.method public static submitPolicyGrantResult(Lcom/mob/MobCustomController;Z)V
    .locals 0

    .line 2
    invoke-static {p1}, Lcom/mob/MobSDK;->submitPolicyGrantResult(Z)V

    .line 3
    invoke-static {p0}, Lcom/mob/MobSDK;->updateMobCustomController(Lcom/mob/MobCustomController;)V

    return-void
.end method

.method public static submitPolicyGrantResult(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mob/commons/x;->b(Z)V

    return-void
.end method

.method public static submitPolicyGrantResult(ZLcom/mob/OperationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/mob/OperationCallback<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    invoke-static {p0}, Lcom/mob/commons/x;->b(Z)V

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    .line 5
    new-instance v0, Lcom/mob/MobSDK$1;

    invoke-direct {v0, p1}, Lcom/mob/MobSDK$1;-><init>(Lcom/mob/OperationCallback;)V

    invoke-static {p0, v0}, Lcom/mob/tools/utils/UIHandler;->sendEmptyMessage(ILandroid/os/Handler$Callback;)Z

    :cond_0
    return-void
.end method

.method public static syncGetBSDM(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mob/commons/u;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static updateMobCustomController(Lcom/mob/MobCustomController;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/mob/commons/CSCenter;->getInstance()Lcom/mob/commons/CSCenter;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/mob/commons/CSCenter;->updateCustomController(Lcom/mob/MobCustomController;)V

    return-void
.end method
