.class Lcn/sharesdk/tencent/qzone/QZone$3;
.super Ljava/lang/Object;
.source "QZone.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qzone/QZone;->b(Lcn/sharesdk/framework/Platform$ShareParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcn/sharesdk/tencent/qzone/QZone;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qzone/QZone;Lcn/sharesdk/framework/Platform$ShareParams;ZLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    iput-object p2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    iput-boolean p3, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->b:Z

    iput-object p4, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 5

    const/16 v0, 0x9

    .line 1
    :try_start_0
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v1, p1}, Lcn/sharesdk/framework/InnerShareParams;->setText(Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/utils/b;->a(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/tencent/qzone/utils/b;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->b:Z

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, p1}, Lcn/sharesdk/tencent/qzone/utils/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, p1}, Lcn/sharesdk/tencent/qzone/utils/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    .line 6
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/QZone;->l(Lcn/sharesdk/tencent/qzone/QZone;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/QZone;->m(Lcn/sharesdk/tencent/qzone/QZone;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    new-instance v3, Ljava/lang/Throwable;

    const-string v4, "response is empty"

    invoke-direct {v3, v4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2, v0, v3}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_1
    const-string v1, "ShareParams"

    .line 8
    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/QZone;->n(Lcn/sharesdk/tencent/qzone/QZone;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 10
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/QZone;->o(Lcn/sharesdk/tencent/qzone/QZone;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-interface {v1, v2, v0, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onComplete(Lcn/sharesdk/framework/Platform;ILjava/util/HashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 11
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/QZone;->p(Lcn/sharesdk/tencent/qzone/QZone;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 12
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/QZone;->q(Lcn/sharesdk/tencent/qzone/QZone;)Lcn/sharesdk/framework/PlatformActionListener;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/tencent/qzone/QZone$3;->d:Lcn/sharesdk/tencent/qzone/QZone;

    invoke-interface {v1, v2, v0, p1}, Lcn/sharesdk/framework/PlatformActionListener;->onError(Lcn/sharesdk/framework/Platform;ILjava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/sharesdk/tencent/qzone/QZone$3;->a(Ljava/lang/String;)V

    return-void
.end method
