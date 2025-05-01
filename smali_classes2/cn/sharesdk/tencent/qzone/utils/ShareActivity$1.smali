.class Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;
.super Ljava/lang/Object;
.source "ShareActivity.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->webShare()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qzone/utils/ShareActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;->a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getNetworkTypeForStatic()Ljava/lang/String;

    move-result-object p1

    const-string v0, "none"

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;->a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->access$002(Lcn/sharesdk/tencent/qzone/utils/ShareActivity;Z)Z

    .line 4
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;->a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    invoke-virtual {p1}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 5
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;->a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->access$100(Lcn/sharesdk/tencent/qzone/utils/ShareActivity;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    new-instance v2, Ljava/lang/Throwable;

    const-string v3, "failed to load webpage, network disconnected."

    invoke-direct {v2, v3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0, v1, v2}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;->a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->access$300(Lcn/sharesdk/tencent/qzone/utils/ShareActivity;)Lcn/sharesdk/framework/authorize/RegisterView;

    move-result-object p1

    invoke-virtual {p1}, Lcn/sharesdk/framework/authorize/RegisterView;->b()Landroid/webkit/WebView;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/ShareActivity$1;->a:Lcn/sharesdk/tencent/qzone/utils/ShareActivity;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/ShareActivity;->access$200(Lcn/sharesdk/tencent/qzone/utils/ShareActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
