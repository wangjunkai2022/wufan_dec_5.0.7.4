.class final Lcn/sharesdk/framework/a$1;
.super Lcn/sharesdk/framework/utils/k$a;
.source "CheckAppKey.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/a;->a()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcn/sharesdk/framework/utils/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-static {}, Lcn/sharesdk/framework/b;->a()Lcn/sharesdk/framework/b;

    move-result-object v0

    invoke-virtual {v0}, Lcn/sharesdk/framework/b;->b()V

    return-void
.end method
