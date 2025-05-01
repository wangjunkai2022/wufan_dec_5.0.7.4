.class Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;
.super Ljava/lang/Object;
.source "PlatformPage.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->onCallback(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Lcn/sharesdk/framework/Platform$ShareParams;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;


# direct methods
.method constructor <init>(Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallback(Lcn/sharesdk/framework/Platform$ShareParams;)V
    .locals 3

    if-eqz p1, :cond_1

    const/4 v0, 0x3

    .line 2
    iget-object v1, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-static {v0, v1}, Lcn/sharesdk/framework/ShareSDK;->logDemoEvent(ILcn/sharesdk/framework/Platform;)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Lcn/sharesdk/framework/InnerShareParams;->setOpenCustomEven(Z)V

    .line 4
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->this$0:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;

    invoke-static {v0}, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;->access$200(Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;)Lcn/sharesdk/onekeyshare/ShareContentCustomizeCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->this$0:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;

    invoke-static {v0}, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;->access$300(Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;)Lcn/sharesdk/onekeyshare/ShareContentCustomizeCallback;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-interface {v0, v1, p1}, Lcn/sharesdk/onekeyshare/ShareContentCustomizeCallback;->onShare(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v0, v0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->this$0:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;

    invoke-static {v0}, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;->access$500(Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;)Lcn/sharesdk/onekeyshare/themes/classic/ClassicTheme;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v1, v1, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->this$0:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;

    invoke-static {v1}, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;->access$400(Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage;)Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->this$2:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;

    iget-object v2, v2, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1;->this$1:Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;

    iget-object v2, v2, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2;->val$platform:Lcn/sharesdk/framework/Platform;

    invoke-virtual {v0, v1, v2, p1}, Lcn/sharesdk/onekeyshare/themes/classic/ClassicTheme;->showEditPage(Landroid/content/Context;Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {p0, p1}, Lcn/sharesdk/onekeyshare/themes/classic/PlatformPage$2$1$1;->onCallback(Lcn/sharesdk/framework/Platform$ShareParams;)V

    return-void
.end method
