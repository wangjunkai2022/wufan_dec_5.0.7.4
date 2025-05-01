.class Lcn/sharesdk/framework/Platform$2$1;
.super Ljava/lang/Object;
.source "Platform.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/Platform$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/Platform$2;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/Platform$2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/Platform$2$1;->a:Lcn/sharesdk/framework/Platform$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcn/sharesdk/framework/Platform$2$1;->a:Lcn/sharesdk/framework/Platform$2;

    iget-object v0, v0, Lcn/sharesdk/framework/Platform$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-static {v0}, Lcn/sharesdk/framework/Platform;->a(Lcn/sharesdk/framework/Platform;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcn/sharesdk/framework/Platform$2$1;->a:Lcn/sharesdk/framework/Platform$2;

    iget-object v1, v1, Lcn/sharesdk/framework/Platform$2;->a:Lcn/sharesdk/framework/Platform;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v1, Lcn/sharesdk/framework/Platform;->isClientValid:Z

    .line 3
    iget-object p1, p0, Lcn/sharesdk/framework/Platform$2$1;->a:Lcn/sharesdk/framework/Platform$2;

    iget-object p1, p1, Lcn/sharesdk/framework/Platform$2;->a:Lcn/sharesdk/framework/Platform;

    invoke-static {p1}, Lcn/sharesdk/framework/Platform;->a(Lcn/sharesdk/framework/Platform;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/framework/Platform$2$1;->a(Ljava/lang/Boolean;)V

    return-void
.end method
