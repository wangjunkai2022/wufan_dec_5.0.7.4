.class final Lcn/sharesdk/framework/ShareSDK$23;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDK.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/ShareSDK;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/ShareSDKCallback;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/ShareSDK$23;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->b()V

    .line 2
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->c()Lcn/sharesdk/framework/i;

    move-result-object v0

    iget-object v1, p0, Lcn/sharesdk/framework/ShareSDK$23;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/ShareSDKCallback;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/ShareSDK$23;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    if-eqz v0, :cond_1

    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcn/sharesdk/framework/ShareSDKCallback;->onCallback(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
