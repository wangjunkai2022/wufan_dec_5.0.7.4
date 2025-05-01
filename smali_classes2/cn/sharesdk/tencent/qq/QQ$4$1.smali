.class Lcn/sharesdk/tencent/qq/QQ$4$1;
.super Ljava/lang/Object;
.source "QQ.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/QQ$4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/tencent/qq/QQ$4;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/QQ$4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/QQ$4$1;->a:Lcn/sharesdk/tencent/qq/QQ$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/QQ$4$1;->a:Lcn/sharesdk/tencent/qq/QQ$4;

    iget-object v0, v0, Lcn/sharesdk/tencent/qq/QQ$4;->a:Lcn/sharesdk/tencent/qq/QQ;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/QQ;->r(Lcn/sharesdk/tencent/qq/QQ;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    iget-object v1, p0, Lcn/sharesdk/tencent/qq/QQ$4$1;->a:Lcn/sharesdk/tencent/qq/QQ$4;

    iget-object v1, v1, Lcn/sharesdk/tencent/qq/QQ$4;->a:Lcn/sharesdk/tencent/qq/QQ;

    invoke-virtual {p1}, Lcom/mob/tools/utils/DH$DHResponse;->getAppName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcn/sharesdk/tencent/qq/QQ;->a(Lcn/sharesdk/tencent/qq/QQ;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/QQ$4$1;->a:Lcn/sharesdk/tencent/qq/QQ$4;

    iget-object p1, p1, Lcn/sharesdk/tencent/qq/QQ$4;->a:Lcn/sharesdk/tencent/qq/QQ;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/QQ;->r(Lcn/sharesdk/tencent/qq/QQ;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    .line 5
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
