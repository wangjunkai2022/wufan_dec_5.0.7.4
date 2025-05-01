.class Lcn/sharesdk/framework/a/a$4;
.super Ljava/lang/Object;
.source "EventManager.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/a/a;->a(Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcn/sharesdk/framework/a/a;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/a/a$4;->c:Lcn/sharesdk/framework/a/a;

    iput-object p2, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    iput-object p3, p0, Lcn/sharesdk/framework/a/a$4;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 4

    const-string v0, "url"

    const-string v1, "status"

    const/4 v2, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getNetworkType()Ljava/lang/String;

    move-result-object p1

    const-string v3, "none"

    .line 2
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$4;->c:Lcn/sharesdk/framework/a/a;

    invoke-static {p1}, Lcn/sharesdk/framework/a/a;->b(Lcn/sharesdk/framework/a/a;)Lcn/sharesdk/framework/a/c;

    move-result-object p1

    iget-object v3, p0, Lcn/sharesdk/framework/a/a$4;->b:Ljava/lang/String;

    invoke-virtual {p1, v3}, Lcn/sharesdk/framework/a/c;->c(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 4
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v3

    if-gtz v3, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 6
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_2

    .line 7
    invoke-interface {p1, v2}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_2
    return-void

    .line 8
    :cond_3
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mob/tools/utils/ResHelper;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0xc8

    if-eq v1, v3, :cond_5

    .line 9
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_4

    .line 10
    invoke-interface {p1, v2}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_4
    return-void

    .line 11
    :cond_5
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_6
    move-object p1, v2

    .line 12
    :goto_0
    iget-object v0, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v0, :cond_b

    .line 13
    invoke-interface {v0, p1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    goto :goto_3

    .line 14
    :cond_7
    :goto_1
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_8

    .line 15
    invoke-interface {p1, v2}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_8
    return-void

    .line 16
    :cond_9
    :goto_2
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_a

    .line 17
    invoke-interface {p1, v2}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    return-void

    :catchall_0
    nop

    .line 18
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "up fi"

    invoke-virtual {p1, v1, v0}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 19
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$4;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz p1, :cond_b

    .line 20
    invoke-interface {p1, v2}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_b
    :goto_3
    return-void
.end method
