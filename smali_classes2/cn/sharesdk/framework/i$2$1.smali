.class Lcn/sharesdk/framework/i$2$1;
.super Lcn/sharesdk/framework/utils/k$a;
.source "ShareSDKCoreThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/i$2;->onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/a/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcn/sharesdk/framework/i$2;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/i$2;Lcn/sharesdk/framework/a/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/i$2$1;->c:Lcn/sharesdk/framework/i$2;

    iput-object p2, p0, Lcn/sharesdk/framework/i$2$1;->a:Lcn/sharesdk/framework/a/a;

    iput-object p3, p0, Lcn/sharesdk/framework/i$2$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcn/sharesdk/framework/i$2$1;->c:Lcn/sharesdk/framework/i$2;

    iget-object v1, v0, Lcn/sharesdk/framework/i$2;->b:Lcn/sharesdk/framework/i;

    iget-object v2, p0, Lcn/sharesdk/framework/i$2$1;->a:Lcn/sharesdk/framework/a/a;

    iget-object v0, v0, Lcn/sharesdk/framework/i$2;->a:Lcn/sharesdk/framework/ShareSDKCallback;

    iget-object v3, p0, Lcn/sharesdk/framework/i$2$1;->b:Ljava/lang/String;

    invoke-static {v1, v2, v0, v3}, Lcn/sharesdk/framework/i;->a(Lcn/sharesdk/framework/i;Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/ShareSDKCallback;Ljava/lang/String;)V

    return-void
.end method
