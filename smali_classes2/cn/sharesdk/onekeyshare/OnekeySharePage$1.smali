.class Lcn/sharesdk/onekeyshare/OnekeySharePage$1;
.super Ljava/lang/Object;
.source "OnekeySharePage.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/onekeyshare/OnekeySharePage;->formateShareData(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/ShareSDKCallback;)V
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
.field final synthetic this$0:Lcn/sharesdk/onekeyshare/OnekeySharePage;

.field final synthetic val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic val$platform:Lcn/sharesdk/framework/Platform;


# direct methods
.method constructor <init>(Lcn/sharesdk/onekeyshare/OnekeySharePage;Lcn/sharesdk/framework/ShareSDKCallback;Lcn/sharesdk/framework/Platform;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->this$0:Lcn/sharesdk/onekeyshare/OnekeySharePage;

    iput-object p2, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

    iput-object p3, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallback(Ljava/lang/Boolean;)V
    .locals 2

    .line 2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_1

    .line 4
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->this$0:Lcn/sharesdk/onekeyshare/OnekeySharePage;

    invoke-static {v0}, Lcn/sharesdk/onekeyshare/OnekeySharePage;->access$000(Lcn/sharesdk/onekeyshare/OnekeySharePage;)Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0, v1}, Lcn/sharesdk/onekeyshare/OnekeyShareThemeImpl;->shareDataToShareParams(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->val$callback:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 6
    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/onekeyshare/OnekeySharePage$1;->onCallback(Ljava/lang/Boolean;)V

    return-void
.end method
