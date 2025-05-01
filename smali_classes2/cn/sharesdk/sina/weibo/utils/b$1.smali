.class Lcn/sharesdk/sina/weibo/utils/b$1;
.super Ljava/lang/Object;
.source "SinaWeiboSSOProcessor.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/sina/weibo/utils/b;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
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
.field final synthetic a:Lcn/sharesdk/sina/weibo/utils/b;


# direct methods
.method constructor <init>(Lcn/sharesdk/sina/weibo/utils/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$1;->a:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$1;->a:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-static {p1}, Lcn/sharesdk/sina/weibo/utils/b;->a(Lcn/sharesdk/sina/weibo/utils/b;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 3
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$1;->a:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-static {p1}, Lcn/sharesdk/sina/weibo/utils/b;->b(Lcn/sharesdk/sina/weibo/utils/b;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/b$1;->a:Lcn/sharesdk/sina/weibo/utils/b;

    invoke-static {p1}, Lcn/sharesdk/sina/weibo/utils/b;->c(Lcn/sharesdk/sina/weibo/utils/b;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/authorize/SSOListener;->onFailed(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/sina/weibo/utils/b$1;->a(Ljava/lang/Boolean;)V

    return-void
.end method
