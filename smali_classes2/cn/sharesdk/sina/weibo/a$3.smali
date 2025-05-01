.class Lcn/sharesdk/sina/weibo/a$3;
.super Ljava/lang/Object;
.source "Weibo.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/sina/weibo/a;->b(Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic b:Lcn/sharesdk/framework/PlatformActionListener;

.field final synthetic c:Lcn/sharesdk/sina/weibo/a;


# direct methods
.method constructor <init>(Lcn/sharesdk/sina/weibo/a;Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/PlatformActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/sina/weibo/a$3;->c:Lcn/sharesdk/sina/weibo/a;

    iput-object p2, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    iput-object p3, p0, Lcn/sharesdk/sina/weibo/a$3;->b:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "dk"

    .line 2
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getDeviceKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "nt"

    .line 3
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getNetworkType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "dnwktfs"

    .line 4
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getDetailNetworkTypeForStatic()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "srs"

    .line 5
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getScreenSize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "car"

    .line 6
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getCarrier()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    .line 8
    invoke-virtual {p1}, Lcn/sharesdk/framework/InnerShareParams;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v1}, Lcn/sharesdk/framework/InnerShareParams;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v2}, Lcn/sharesdk/framework/InnerShareParams;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v2}, Lcn/sharesdk/framework/InnerShareParams;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 9
    :goto_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 10
    iget-object v2, p0, Lcn/sharesdk/sina/weibo/a$3;->c:Lcn/sharesdk/sina/weibo/a;

    invoke-static {v2}, Lcn/sharesdk/sina/weibo/a;->d(Lcn/sharesdk/sina/weibo/a;)Lcn/sharesdk/framework/Platform;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Lcn/sharesdk/framework/Platform;->getShortLintk(Ljava/lang/String;ZLjava/util/HashMap;)Ljava/lang/String;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/InnerShareParams;->setText(Ljava/lang/String;)V

    goto :goto_1

    .line 12
    :cond_1
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_weibo_upload_content"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/ResHelper;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 13
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/InnerShareParams;->setText(Ljava/lang/String;)V

    .line 14
    :cond_2
    :goto_1
    new-instance v0, Lcn/sharesdk/sina/weibo/a$3$1;

    invoke-direct {v0, p0, p1}, Lcn/sharesdk/sina/weibo/a$3$1;-><init>(Lcn/sharesdk/sina/weibo/a$3;Lcn/sharesdk/framework/Platform$ShareParams;)V

    .line 15
    new-instance p1, Lcn/sharesdk/sina/weibo/utils/WebSharePage;

    invoke-direct {p1}, Lcn/sharesdk/sina/weibo/utils/WebSharePage;-><init>()V

    .line 16
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/a$3;->c:Lcn/sharesdk/sina/weibo/a;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/a;->l(Lcn/sharesdk/sina/weibo/a;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/sina/weibo/a$3;->c:Lcn/sharesdk/sina/weibo/a;

    invoke-static {v2}, Lcn/sharesdk/sina/weibo/a;->g(Lcn/sharesdk/sina/weibo/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lcn/sharesdk/sina/weibo/utils/WebSharePage;->setAppKey(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/a$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {p1, v1}, Lcn/sharesdk/sina/weibo/utils/WebSharePage;->setShareParams(Lcn/sharesdk/framework/Platform$ShareParams;)V

    .line 18
    invoke-virtual {p1, v0}, Lcn/sharesdk/sina/weibo/utils/WebSharePage;->setListener(Lcn/sharesdk/framework/authorize/AuthorizeListener;)V

    .line 19
    invoke-static {}, Lcom/mob/MobSDK;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/mob/tools/FakeActivity;->show(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 20
    iget-object v0, p0, Lcn/sharesdk/sina/weibo/a$3;->b:Lcn/sharesdk/framework/PlatformActionListener;

    if-eqz v0, :cond_3

    .line 21
    iget-object v1, p0, Lcn/sharesdk/sina/weibo/a$3;->c:Lcn/sharesdk/sina/weibo/a;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/a;->m(Lcn/sharesdk/sina/weibo/a;)Lcn/sharesdk/framework/Platform;

    move-result-object v1

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_3
    :goto_2
    return-void
.end method
