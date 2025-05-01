.class Lcn/sharesdk/framework/Platform$5;
.super Ljava/lang/Object;
.source "Platform.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/Platform;->subscribeAuth(Lcn/sharesdk/framework/Platform$ShareParams;)V
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
.field final synthetic a:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic b:Lcn/sharesdk/framework/Platform;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/Platform;Lcn/sharesdk/framework/Platform$ShareParams;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/Platform$5;->b:Lcn/sharesdk/framework/Platform;

    iput-object p2, p0, Lcn/sharesdk/framework/Platform$5;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcn/sharesdk/framework/Platform$5;->b:Lcn/sharesdk/framework/Platform;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lcn/sharesdk/framework/Platform;->isClientValid:Z

    .line 2
    iget-object p1, p0, Lcn/sharesdk/framework/Platform$5;->b:Lcn/sharesdk/framework/Platform;

    invoke-static {p1}, Lcn/sharesdk/framework/Platform;->b(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/f;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/framework/Platform$5;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {p1, v0}, Lcn/sharesdk/framework/f;->a(Lcn/sharesdk/framework/Platform$ShareParams;)V

    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcn/sharesdk/framework/Platform$5;->a(Ljava/lang/Boolean;)V

    return-void
.end method
