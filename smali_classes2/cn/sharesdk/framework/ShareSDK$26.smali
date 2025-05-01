.class final Lcn/sharesdk/framework/ShareSDK$26;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDK.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/ShareSDK;->getServiceAsync(Ljava/lang/Class;Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic b:Ljava/lang/Class;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/ShareSDK$26;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    iput-object p2, p0, Lcn/sharesdk/framework/ShareSDK$26;->b:Ljava/lang/Class;

    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->b()V

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$26;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/framework/ShareSDK$26;->b:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Lcn/sharesdk/framework/i;->c(Ljava/lang/Class;)Lcn/sharesdk/framework/Service;

    move-result-object v1

    invoke-interface {v0, v1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$26;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 7
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ShareSDK getServiceAsync"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_1
    :goto_0
    return-void
.end method
