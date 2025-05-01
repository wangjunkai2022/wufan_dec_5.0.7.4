.class Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;
.super Ljava/lang/Object;
.source "OnekeyShareThemeImpl.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->realCallback(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/ShareSDKCallback;ZLjava/lang/String;)V
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
.field final synthetic this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

.field final synthetic val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic val$isWechat:Z

.field final synthetic val$toastMsg:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;ZLcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iput-boolean p2, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$isWechat:Z

    iput-object p3, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

    iput-object p4, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$toastMsg:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallback(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-boolean v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$isWechat:Z

    invoke-static {p1, v0}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->access$200(Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;Z)V

    .line 4
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_1

    .line 5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$toastMsg:Ljava/lang/String;

    invoke-static {p1, v0}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->access$100(Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_1

    .line 8
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$6;->onCallback(Ljava/lang/Boolean;)V

    return-void
.end method
