.class Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2$1;
.super Ljava/lang/Object;
.source "WebAuthorizeActivity.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2$1;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getDetailNetworkTypeForStatic()Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x2

    .line 3
    iput v1, v0, Landroid/os/Message;->what:I

    const-string v1, "none"

    .line 4
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 5
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 6
    iget-object p1, p0, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2$1;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;

    iget-object p1, p1, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity;

    invoke-static {v0, p1}, Lcom/mob/tools/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z

    return-void

    .line 7
    :cond_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isRemoveCookieOnAuthorize()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2$1;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;

    iget-object p1, p1, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity;

    invoke-static {p1}, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity;->access$100(Lcn/sharesdk/framework/authorize/WebAuthorizeActivity;)Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 9
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Landroid/webkit/CookieManager;->removeAllCookie()V

    .line 11
    :cond_1
    iget-object p1, p0, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2$1;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;

    iget-object p1, p1, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity;

    iget-object p1, p1, Lcn/sharesdk/framework/authorize/AbstractAuthorizeActivity;->helper:Lcn/sharesdk/framework/authorize/AuthorizeHelper;

    invoke-interface {p1}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeUrl()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 12
    iget-object p1, p0, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2$1;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;

    iget-object p1, p1, Lcn/sharesdk/framework/authorize/WebAuthorizeActivity$2;->a:Lcn/sharesdk/framework/authorize/WebAuthorizeActivity;

    invoke-static {v0, p1}, Lcom/mob/tools/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z

    return-void
.end method
