.class final Lcn/sharesdk/framework/ShareSDK$24;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDK.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/ShareSDK;->a(Ljava/lang/String;ZILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcn/sharesdk/framework/ShareSDKCallback;


# direct methods
.method constructor <init>(Ljava/lang/String;ZILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/ShareSDK$24;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lcn/sharesdk/framework/ShareSDK$24;->b:Z

    iput p3, p0, Lcn/sharesdk/framework/ShareSDK$24;->c:I

    iput-object p4, p0, Lcn/sharesdk/framework/ShareSDK$24;->d:Ljava/lang/String;

    iput-object p5, p0, Lcn/sharesdk/framework/ShareSDK$24;->e:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/utils/SSDKLog;->b()Lcn/sharesdk/framework/utils/SSDKLog;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ShareSDK getShortLink catch "

    invoke-virtual {v1, v0, v3, v2}, Lcn/sharesdk/framework/utils/SSDKLog;->a(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 3
    :goto_0
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v1

    iget-object v2, p0, Lcn/sharesdk/framework/ShareSDK$24;->a:Ljava/lang/String;

    iget-boolean v3, p0, Lcn/sharesdk/framework/ShareSDK$24;->b:Z

    iget v4, p0, Lcn/sharesdk/framework/ShareSDK$24;->c:I

    iget-object v5, p0, Lcn/sharesdk/framework/ShareSDK$24;->d:Ljava/lang/String;

    iget-object v6, p0, Lcn/sharesdk/framework/ShareSDK$24;->e:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-virtual/range {v1 .. v6}, Lcn/sharesdk/framework/i;->a(Ljava/lang/String;ZILjava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V

    goto :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$24;->e:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v0, :cond_1

    .line 6
    iget-object v1, p0, Lcn/sharesdk/framework/ShareSDK$24;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_1
    :goto_1
    return-void
.end method
