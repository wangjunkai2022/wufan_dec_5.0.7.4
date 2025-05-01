.class final Lcn/sharesdk/framework/ShareSDK$28;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDK.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/ShareSDK;->unregisterPlatform(Ljava/lang/Class;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Class;


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/ShareSDK$28;->a:Ljava/lang/Class;

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

    iget-object v1, p0, Lcn/sharesdk/framework/ShareSDK$28;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/i;->e(Ljava/lang/Class;)V

    :cond_0
    return-void
.end method
