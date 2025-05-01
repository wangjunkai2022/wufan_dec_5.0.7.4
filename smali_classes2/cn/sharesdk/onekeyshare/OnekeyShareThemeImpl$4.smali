.class Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;
.super Ljava/lang/Object;
.source "OnekeyShareThemeImpl.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->shareSilently(Lcn/sharesdk/framework/Platform;)V
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

.field final synthetic val$platform:Lcn/sharesdk/framework/Platform;


# direct methods
.method constructor <init>(Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;Lcn/sharesdk/framework/Platform;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iput-object p2, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallback(Ljava/lang/Boolean;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 3
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-virtual {p1, v0}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->shareDataToShareParams(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 4
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->shareParamsMap:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    const-string v1, "disappearsharetoast"

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->shareParamsMap:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    const-string v1, "ssdk_oks_sharing"

    invoke-static {v0, v1}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->access$100(Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;Ljava/lang/String;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->customizeCallback:Lcn/sharesdk/onekeyshare/ShareContentCustomizeCallback;

    if-eqz v0, :cond_2

    .line 9
    iget-object v1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-interface {v0, v1, p1}, Lcn/sharesdk/onekeyshare/ShareContentCustomizeCallback;->onShare(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    .line 10
    :cond_2
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-boolean v0, v0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->disableSSO:Z

    if-eqz v0, :cond_3

    .line 11
    iget-object v1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v1, v0}, Lcn/sharesdk/framework/Platform;->SSOSetting(Z)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->val$platform:Lcn/sharesdk/framework/Platform;

    iget-object v1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->callback:Lcn/sharesdk/framework/PlatformActionListener;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->setPlatformActionListener(Lcn/sharesdk/framework/PlatformActionListener;)V

    .line 13
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/Platform;->share(Lcn/sharesdk/framework/Platform$ShareParams;)V

    .line 14
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->this$0:Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    const/4 v0, 0x0

    iput-object v0, p1, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->callback:Lcn/sharesdk/framework/PlatformActionListener;

    .line 15
    iput-object v0, p1, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->customizeCallback:Lcn/sharesdk/onekeyshare/ShareContentCustomizeCallback;

    :cond_4
    return-void
.end method

.method public bridge synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl$4;->onCallback(Ljava/lang/Boolean;)V

    return-void
.end method
