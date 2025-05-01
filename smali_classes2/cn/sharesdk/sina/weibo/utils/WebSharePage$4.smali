.class Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;
.super Lcom/mob/tools/RxMob$Subscriber;
.source "WebSharePage.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/sina/weibo/utils/WebSharePage;->loadWebView()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mob/tools/RxMob$Subscriber<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcn/sharesdk/sina/weibo/utils/WebSharePage;


# direct methods
.method constructor <init>(Lcn/sharesdk/sina/weibo/utils/WebSharePage;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;->this$0:Lcn/sharesdk/sina/weibo/utils/WebSharePage;

    invoke-direct {p0}, Lcom/mob/tools/RxMob$Subscriber;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/mob/tools/RxMob$Subscriber;->onCompleted()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->b(Ljava/lang/Throwable;)I

    .line 2
    iget-object p1, p0, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;->this$0:Lcn/sharesdk/sina/weibo/utils/WebSharePage;

    new-instance v0, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4$2;

    invoke-direct {v0, p0}, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4$2;-><init>(Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;)V

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcn/sharesdk/sina/weibo/utils/WebSharePage;->access$1000(Lcn/sharesdk/sina/weibo/utils/WebSharePage;Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;->onNext(Ljava/lang/String;)V

    return-void
.end method

.method public onNext(Ljava/lang/String;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;->this$0:Lcn/sharesdk/sina/weibo/utils/WebSharePage;

    new-instance v1, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4$1;

    invoke-direct {v1, p0}, Lcn/sharesdk/sina/weibo/utils/WebSharePage$4$1;-><init>(Lcn/sharesdk/sina/weibo/utils/WebSharePage$4;)V

    invoke-static {v0, p1, v1}, Lcn/sharesdk/sina/weibo/utils/WebSharePage;->access$1000(Lcn/sharesdk/sina/weibo/utils/WebSharePage;Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void
.end method

.method public onStart()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/mob/tools/RxMob$Subscriber;->onStart()V

    return-void
.end method
