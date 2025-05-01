.class Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;
.super Lcn/sharesdk/framework/utils/k$a;
.source "SinaWeiboShareOfficial.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;


# direct methods
.method constructor <init>(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lcom/sina/weibo/sdk/auth/AuthInfo;

    iget-object v1, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$000(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v2}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$100(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v3}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$200(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v4}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$300(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/sina/weibo/sdk/auth/AuthInfo;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$500(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/sina/weibo/sdk/openapi/WBAPIFactory;->createWBAPI(Landroid/content/Context;)Lcom/sina/weibo/sdk/openapi/IWBAPI;

    move-result-object v2

    invoke-static {v1, v2}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$402(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;Lcom/sina/weibo/sdk/openapi/IWBAPI;)Lcom/sina/weibo/sdk/openapi/IWBAPI;

    .line 3
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$400(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Lcom/sina/weibo/sdk/openapi/IWBAPI;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v2}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$600(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Landroid/app/Activity;

    move-result-object v2

    new-instance v3, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1$1;

    invoke-direct {v3, p0}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1$1;-><init>(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;)V

    invoke-interface {v1, v2, v0, v3}, Lcom/sina/weibo/sdk/openapi/IWBAPI;->registerApp(Landroid/content/Context;Lcom/sina/weibo/sdk/auth/AuthInfo;Lcom/sina/weibo/sdk/openapi/SdkListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 4
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$800(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Lcn/sharesdk/framework/authorize/AuthorizeListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Ljava/lang/Throwable;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sinaweibo sdk init failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-static {v2}, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;->access$800(Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;)Lcn/sharesdk/framework/authorize/AuthorizeListener;

    move-result-object v2

    invoke-interface {v2, v1}, Lcn/sharesdk/framework/authorize/AuthorizeListener;->onError(Ljava/lang/Throwable;)V

    .line 7
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onCreate AuthInfo "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    const-string v0, "SinaWeiboShareOfficial"

    invoke-virtual {v1, v0, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 8
    iget-object v0, p0, Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial$1;->a:Lcn/sharesdk/sina/weibo/SinaWeiboShareOfficial;

    invoke-virtual {v0}, Lcom/mob/tools/FakeActivity;->finish()V

    return-void
.end method
