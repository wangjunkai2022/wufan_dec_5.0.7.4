.class Lcn/sharesdk/framework/a/d$2;
.super Ljava/lang/Object;
.source "StatisticsLogger.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/a/d;->a(Landroid/os/Message;)V
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
.field final synthetic a:Lcn/sharesdk/framework/a/d;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/a/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/a/d$2;->a:Lcn/sharesdk/framework/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcn/sharesdk/framework/a/d$2;->a:Lcn/sharesdk/framework/a/d;

    invoke-static {p1}, Lcn/sharesdk/framework/a/d;->a(Lcn/sharesdk/framework/a/d;)Lcn/sharesdk/framework/a/a;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/framework/a/d$2;->a:Lcn/sharesdk/framework/a/d;

    invoke-static {v0}, Lcn/sharesdk/framework/a/d;->b(Lcn/sharesdk/framework/a/d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcn/sharesdk/framework/a/a;->a(Landroid/os/Handler;)V

    :cond_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/framework/a/d$2;->a(Ljava/lang/Boolean;)V

    return-void
.end method
