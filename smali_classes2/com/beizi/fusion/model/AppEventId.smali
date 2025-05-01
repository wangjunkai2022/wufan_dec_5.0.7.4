.class public Lcom/beizi/fusion/model/AppEventId;
.super Ljava/lang/Object;
.source "AppEventId.java"


# static fields
.field private static volatile eventIdInstance:Lcom/beizi/fusion/model/AppEventId;


# instance fields
.field SP_KEY_APP_BANNER_REQUEST_PREFIX:Ljava/lang/String;

.field SP_KEY_APP_FULL_SCREEN_VIDEO_REQUEST_PREFIX:Ljava/lang/String;

.field SP_KEY_APP_NATIVE_REQUEST_PREFIX:Ljava/lang/String;

.field SP_KEY_APP_REWARDED_VIDEO_REQUEST_PREFIX:Ljava/lang/String;

.field SP_KEY_APP_SDK_INIT:Ljava/lang/String;

.field SP_KEY_APP_SPLASH_REQUEST_PREFIX:Ljava/lang/String;

.field SP_KEY_APP_START:Ljava/lang/String;

.field private appBannerRequest:Ljava/lang/String;

.field private appFullScreenVideoRequest:Ljava/lang/String;

.field private appNativeRequest:Ljava/lang/String;

.field private appRewardedVideoRequest:Ljava/lang/String;

.field private appSdkInit:Ljava/lang/String;

.field private appSplashRequest:Ljava/lang/String;

.field private appStart:Ljava/lang/String;

.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "AppStart"

    .line 2
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_START:Ljava/lang/String;

    const-string v0, "AppSdkInit"

    .line 3
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_SDK_INIT:Ljava/lang/String;

    const-string v0, "AppSplashRequest"

    .line 4
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_SPLASH_REQUEST_PREFIX:Ljava/lang/String;

    const-string v0, "AppNativeRequest"

    .line 5
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_NATIVE_REQUEST_PREFIX:Ljava/lang/String;

    const-string v0, "AppRewardedVideoRequest"

    .line 6
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_REWARDED_VIDEO_REQUEST_PREFIX:Ljava/lang/String;

    const-string v0, "AppFullScreenVideoRequest"

    .line 7
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_FULL_SCREEN_VIDEO_REQUEST_PREFIX:Ljava/lang/String;

    const-string v0, "AppBannerRequest"

    .line 8
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_BANNER_REQUEST_PREFIX:Ljava/lang/String;

    .line 9
    iput-object p1, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    return-void
.end method

.method private static getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    const-string v1, "fusion_report"

    .line 1
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, ""

    .line 2
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/AppEventId;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/fusion/model/AppEventId;->eventIdInstance:Lcom/beizi/fusion/model/AppEventId;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/fusion/a/b;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/model/AppEventId;->eventIdInstance:Lcom/beizi/fusion/model/AppEventId;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/fusion/model/AppEventId;

    invoke-direct {v1, p0}, Lcom/beizi/fusion/model/AppEventId;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/beizi/fusion/model/AppEventId;->eventIdInstance:Lcom/beizi/fusion/model/AppEventId;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 6
    :cond_1
    :goto_0
    sget-object p0, Lcom/beizi/fusion/model/AppEventId;->eventIdInstance:Lcom/beizi/fusion/model/AppEventId;

    return-object p0
.end method


# virtual methods
.method public getAppBannerRequest()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appBannerRequest:Ljava/lang/String;

    return-object v0
.end method

.method public getAppFullScreenVideoRequest()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appFullScreenVideoRequest:Ljava/lang/String;

    return-object v0
.end method

.method public getAppNativeRequest()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appNativeRequest:Ljava/lang/String;

    return-object v0
.end method

.method public getAppRewardedVideoRequest()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appRewardedVideoRequest:Ljava/lang/String;

    return-object v0
.end method

.method public getAppSdkInit()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appSdkInit:Ljava/lang/String;

    return-object v0
.end method

.method public getAppSplashRequest()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appSplashRequest:Ljava/lang/String;

    return-object v0
.end method

.method public getAppStart()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appStart:Ljava/lang/String;

    return-object v0
.end method

.method public setAppBannerRequest(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_BANNER_REQUEST_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/model/AppEventId;->appBannerRequest:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setAppFullScreenVideoRequest(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_FULL_SCREEN_VIDEO_REQUEST_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/model/AppEventId;->appFullScreenVideoRequest:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setAppNativeRequest(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_NATIVE_REQUEST_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/model/AppEventId;->appNativeRequest:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setAppRewardedVideoRequest(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_REWARDED_VIDEO_REQUEST_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/model/AppEventId;->appRewardedVideoRequest:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setAppSdkInit()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_SDK_INIT:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appSdkInit:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setAppSplashRequest(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_SPLASH_REQUEST_PREFIX:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/model/AppEventId;->appSplashRequest:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public setAppStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/model/AppEventId;->SP_KEY_APP_START:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/fusion/model/AppEventId;->getCacheEventId(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iput-object v0, p0, Lcom/beizi/fusion/model/AppEventId;->appStart:Ljava/lang/String;

    :cond_0
    return-void
.end method
