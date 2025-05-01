.class Lcn/sharesdk/framework/a/d$5;
.super Ljava/lang/Object;
.source "StatisticsLogger.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/a/d;->a(Lcn/sharesdk/framework/a/b/c;Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/a/b/c;

.field final synthetic b:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic c:Lcn/sharesdk/framework/a/d;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/a/d;Lcn/sharesdk/framework/a/b/c;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/a/d$5;->c:Lcn/sharesdk/framework/a/d;

    iput-object p2, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    iput-object p3, p0, Lcn/sharesdk/framework/a/d$5;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    new-instance v1, Lcom/mob/commons/SHARESDK;

    invoke-direct {v1}, Lcom/mob/commons/SHARESDK;-><init>()V

    invoke-static {v1}, Lcom/mob/commons/authorize/DeviceAuthorizer;->authorize(Lcom/mob/commons/MobProduct;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcn/sharesdk/framework/a/b/c;->f:Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcn/sharesdk/framework/a/b/c;->g:Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getAppVersion()I

    move-result v1

    iput v1, v0, Lcn/sharesdk/framework/a/b/c;->h:I

    .line 4
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    sget v1, Lcn/sharesdk/framework/ShareSDK;->SDK_VERSION_CODE:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcn/sharesdk/framework/a/b/c;->i:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    invoke-static {}, Lcom/mob/tools/utils/DH$SyncMtd;->getPlatformCode()I

    move-result v1

    iput v1, v0, Lcn/sharesdk/framework/a/b/c;->j:I

    .line 6
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getDetailNetworkTypeForStatic()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcn/sharesdk/framework/a/b/c;->k:Ljava/lang/String;

    .line 7
    invoke-static {}, Lcom/mob/MobSDK;->getAppkey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "ShareSDKCore"

    if-eqz v0, :cond_0

    :try_start_1
    const-string v0, "Your appKey of ShareSDK is null , this will cause its data won\'t be count!"

    .line 8
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-virtual {v4, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->b(Ljava/lang/Object;[Ljava/lang/Object;)I

    goto :goto_0

    :cond_0
    const-string v0, "cn.sharesdk.demo"

    .line 9
    iget-object v4, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    iget-object v4, v4, Lcn/sharesdk/framework/a/b/c;->g:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "api20"

    .line 10
    invoke-static {}, Lcom/mob/MobSDK;->getAppkey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "androidv1101"

    invoke-static {}, Lcom/mob/MobSDK;->getAppkey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const-string v0, "Your app is using the appkey of ShareSDK Demo, this will cause its data won\'t be count!"

    .line 11
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    invoke-virtual {v4, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->b(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 12
    :cond_2
    :goto_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getDeviceData()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcn/sharesdk/framework/a/b/c;->l:Ljava/lang/String;

    .line 13
    iget-object p1, p0, Lcn/sharesdk/framework/a/d$5;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    iget-object v0, p0, Lcn/sharesdk/framework/a/d$5;->a:Lcn/sharesdk/framework/a/b/c;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 14
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method
