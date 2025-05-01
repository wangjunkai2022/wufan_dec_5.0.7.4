.class Lcn/sharesdk/sina/weibo/utils/b$2;
.super Ljava/lang/Object;
.source "SinaWeiboSSOProcessor.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/sina/weibo/utils/b;->a(Ljava/lang/String;Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic c:Lcn/sharesdk/sina/weibo/utils/b;


# direct methods
.method constructor <init>(Lcn/sharesdk/sina/weibo/utils/b;Landroid/content/Intent;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->c:Lcn/sharesdk/sina/weibo/utils/b;

    iput-object p2, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->a:Landroid/content/Intent;

    iput-object p3, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    :try_start_0
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->c:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-static {p1}, Lcn/sharesdk/sina/weibo/utils/b;->e(Lcn/sharesdk/sina/weibo/utils/b;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->c:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-static {v1}, Lcn/sharesdk/sina/weibo/utils/b;->d(Lcn/sharesdk/sina/weibo/utils/b;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/mob/tools/FakeActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->c:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-static {p1}, Lcn/sharesdk/sina/weibo/utils/b;->f(Lcn/sharesdk/sina/weibo/utils/b;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/FakeActivity;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->c:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 4
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_2

    .line 5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    nop

    .line 6
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_0

    .line 7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$2;->b:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_2

    .line 9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/sina/weibo/utils/b$2;->a(Ljava/lang/Boolean;)V

    return-void
.end method
