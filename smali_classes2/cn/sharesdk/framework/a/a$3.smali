.class Lcn/sharesdk/framework/a/a$3;
.super Ljava/lang/Object;
.source "EventManager.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/b/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcn/sharesdk/framework/ShareSDKCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcn/sharesdk/framework/a/b/f$a;

.field final synthetic b:Lcn/sharesdk/framework/a/b/f;

.field final synthetic c:Lcn/sharesdk/framework/a/a;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/a/b/f$a;Lcn/sharesdk/framework/a/b/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/a/a$3;->c:Lcn/sharesdk/framework/a/a;

    iput-object p2, p0, Lcn/sharesdk/framework/a/a$3;->a:Lcn/sharesdk/framework/a/b/f$a;

    iput-object p3, p0, Lcn/sharesdk/framework/a/a$3;->b:Lcn/sharesdk/framework/a/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcn/sharesdk/framework/a/a$3;->a:Lcn/sharesdk/framework/a/b/f$a;

    iget-object v0, v0, Lcn/sharesdk/framework/a/b/f$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lcn/sharesdk/framework/a/a$3;->c:Lcn/sharesdk/framework/a/a;

    iget-object v0, p0, Lcn/sharesdk/framework/a/a$3;->b:Lcn/sharesdk/framework/a/b/f;

    invoke-static {p1, v0}, Lcn/sharesdk/framework/a/a;->a(Lcn/sharesdk/framework/a/a;Lcn/sharesdk/framework/a/b/c;)V

    :cond_0
    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/sharesdk/framework/a/a$3;->a(Ljava/lang/String;)V

    return-void
.end method
