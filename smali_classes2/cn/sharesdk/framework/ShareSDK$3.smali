.class final Lcn/sharesdk/framework/ShareSDK$3;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDK.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/ShareSDK;->getPlatformAsync(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcn/sharesdk/framework/ShareSDKCallback;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/ShareSDK$3;->a:Ljava/lang/String;

    iput-object p2, p0, Lcn/sharesdk/framework/ShareSDK$3;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    const-string v4, "ShareSDK ensureInit getPlatform catch"

    invoke-virtual {v2, v1, v4, v3}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    invoke-static {}, Lcn/sharesdk/framework/Platform;->getDefaultPlatform()Lcn/sharesdk/framework/Platform;

    move-result-object v1

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/framework/ShareSDK$3;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;

    move-result-object v1

    goto :goto_1

    .line 6
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    const-string v3, "ShareSDK use defaultPlatform"

    invoke-virtual {v2, v3, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 7
    :goto_1
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$3;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0, v1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
