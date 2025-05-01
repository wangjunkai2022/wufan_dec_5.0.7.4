.class final Lcn/sharesdk/framework/ShareSDK$6;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDK.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/ShareSDK;->setPlatformDevInfoAsync(Ljava/lang/String;Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/ShareSDK$6;->a:Ljava/lang/String;

    iput-object p2, p0, Lcn/sharesdk/framework/ShareSDK$6;->b:Ljava/util/HashMap;

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
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$6;->a:Ljava/lang/String;

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$6;->b:Ljava/util/HashMap;

    invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->a(Ljava/util/HashMap;)Ljava/util/HashMap;

    .line 3
    invoke-static {}, Lcom/mob/MobSDK;->isForb()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/mob/MobSDK;->isAuth()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->b()V

    .line 5
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/framework/ShareSDK$6;->a:Ljava/lang/String;

    iget-object v2, p0, Lcn/sharesdk/framework/ShareSDK$6;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;Ljava/util/HashMap;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 8
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK setPlatformDevInfo catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    :cond_1
    :goto_0
    return-void
.end method
