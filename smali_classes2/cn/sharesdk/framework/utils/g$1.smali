.class Lcn/sharesdk/framework/utils/g$1;
.super Ljava/lang/Object;
.source "ShareBypassApproval.java"

# interfaces
.implements Lcn/sharesdk/framework/ShareSDKCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/framework/utils/g;->a(Lcn/sharesdk/framework/Platform$ShareParams;Lcn/sharesdk/framework/Platform;)V
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
.field final synthetic a:Lcn/sharesdk/framework/Platform$ShareParams;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Intent;

.field final synthetic d:Lcn/sharesdk/framework/utils/g;


# direct methods
.method constructor <init>(Lcn/sharesdk/framework/utils/g;Lcn/sharesdk/framework/Platform$ShareParams;Ljava/lang/String;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/framework/utils/g$1;->d:Lcn/sharesdk/framework/utils/g;

    iput-object p2, p0, Lcn/sharesdk/framework/utils/g$1;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    iput-object p3, p0, Lcn/sharesdk/framework/utils/g$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcn/sharesdk/framework/utils/g$1;->c:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcn/sharesdk/framework/utils/g$1;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    iget-object v1, p0, Lcn/sharesdk/framework/utils/g$1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcn/sharesdk/framework/InnerShareParams;->setText(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcn/sharesdk/framework/utils/g$1;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0, p1}, Lcn/sharesdk/framework/InnerShareParams;->setText(Ljava/lang/String;)V

    .line 4
    :goto_0
    iget-object v0, p0, Lcn/sharesdk/framework/utils/g$1;->c:Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    iget-object v0, p0, Lcn/sharesdk/framework/utils/g$1;->c:Landroid/content/Intent;

    const-string v1, "Kdescription"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object p1, p0, Lcn/sharesdk/framework/utils/g$1;->d:Lcn/sharesdk/framework/utils/g;

    iget-object v0, p0, Lcn/sharesdk/framework/utils/g$1;->a:Lcn/sharesdk/framework/Platform$ShareParams;

    iget-object v1, p0, Lcn/sharesdk/framework/utils/g$1;->c:Landroid/content/Intent;

    invoke-static {p1, v0, v1}, Lcn/sharesdk/framework/utils/g;->a(Lcn/sharesdk/framework/utils/g;Lcn/sharesdk/framework/Platform$ShareParams;Landroid/content/Intent;)V

    return-void
.end method

.method public synthetic onCallback(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcn/sharesdk/framework/utils/g$1;->a(Ljava/lang/String;)V

    return-void
.end method
