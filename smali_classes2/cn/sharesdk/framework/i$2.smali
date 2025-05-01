.class Lcn/sharesdk/framework/i$2;
.super Ljava/lang/Object;
.source "ShareSDKCoreThread.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic b:Lcn/sharesdk/framework/i;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/i;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/i$2;->b:Lcn/sharesdk/framework/i;

    iput-object p2, p0, Lcn/sharesdk/framework/i$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getDeviceKey()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    const-string v0, "dk null"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 4
    iget-object p1, p0, Lcn/sharesdk/framework/i$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_0

    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 6
    :cond_1
    invoke-static {}, Lcn/sharesdk/framework/a/a;->a()Lcn/sharesdk/framework/a/a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcn/sharesdk/framework/a/a;->c()Ljava/util/HashMap;

    move-result-object v2

    .line 8
    iget-object v3, p0, Lcn/sharesdk/framework/i$2;->b:Lcn/sharesdk/framework/i;

    invoke-static {v3, v0, v2, p1}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/i;Lcn/sharesdk/framework/a/a;Ljava/util/HashMap;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 9
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 10
    iget-object v1, p0, Lcn/sharesdk/framework/i$2;->b:Lcn/sharesdk/framework/i;

    invoke-static {v1, v2}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/i;Ljava/util/HashMap;)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    .line 11
    new-instance v1, Lcn/sharesdk/framework/i$2$1;

    invoke-direct {v1, p0, v0, p1}, Lcn/sharesdk/framework/i$2$1;-><init>(Lcn/sharesdk/framework/i$2;Lcn/sharesdk/framework/a/a;Ljava/lang/String;)V

    invoke-static {v1}, Lcn/sharesdk/framework/utils/k;->a(Lcn/sharesdk/framework/utils/k$a;)V

    goto :goto_0

    .line 12
    :cond_3
    iget-object v1, p0, Lcn/sharesdk/framework/i$2;->b:Lcn/sharesdk/framework/i;

    iget-object v2, p0, Lcn/sharesdk/framework/i$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-static {v1, v0, v2, p1}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/i;Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 13
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    .line 14
    iget-object p1, p0, Lcn/sharesdk/framework/i$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_4

    .line 15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method
