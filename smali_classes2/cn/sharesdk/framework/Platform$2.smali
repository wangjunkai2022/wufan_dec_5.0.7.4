.class Lcn/sharesdk/framework/Platform$2;
.super Lcn/sharesdk/framework/utils/k$a;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/Platform;->isClientValid()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/Platform;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/Platform$2;->a:Lcn/sharesdk/framework/Platform;

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
    iget-object v0, p0, Lcn/sharesdk/framework/Platform$2;->a:Lcn/sharesdk/framework/Platform;

    new-instance v1, Lcn/sharesdk/framework/Platform$2$1;

    invoke-direct {v1, p0}, Lcn/sharesdk/framework/Platform$2$1;-><init>(Lcn/sharesdk/framework/Platform$2;)V

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/Platform;->isClientValid(Lcn/sharesdk/framework/ShareSDKCallback;)V

    return-void
.end method
