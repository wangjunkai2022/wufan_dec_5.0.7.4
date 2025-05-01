.class Lcn/sharesdk/tencent/qq/b$1;
.super Ljava/lang/Object;
.source "QQSSOProcessor.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qq/b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcn/sharesdk/tencent/qq/b;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qq/b;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    iput-object p2, p0, Lcn/sharesdk/tencent/qq/b$1;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 1
    invoke-virtual {p1, v0}, Lcom/mob/tools/utils/DH$DHResponse;->resolveActivity([I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-nez p1, :cond_1

    .line 2
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/b;->a(Lcn/sharesdk/tencent/qq/b;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 3
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/b;->b(Lcn/sharesdk/tencent/qq/b;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/b;->c(Lcn/sharesdk/tencent/qq/b;)V

    :cond_0
    return-void

    .line 5
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 6
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/b;->d(Lcn/sharesdk/tencent/qq/b;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "scope"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/b;->e(Lcn/sharesdk/tencent/qq/b;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_id"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pf"

    const-string v1, "openmobile_android"

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "need_pay"

    const-string v1, "1"

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->a:Landroid/content/Intent;

    const-string v1, "key_params"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 11
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->a:Landroid/content/Intent;

    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/b;->f(Lcn/sharesdk/tencent/qq/b;)I

    move-result v0

    const-string v1, "key_request_code"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 12
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->a:Landroid/content/Intent;

    const-string v0, "key_action"

    const-string v1, "action_login"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    :try_start_0
    iget-object p1, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {p1}, Lcn/sharesdk/tencent/qq/b;->h(Lcn/sharesdk/tencent/qq/b;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v1}, Lcn/sharesdk/tencent/qq/b;->g(Lcn/sharesdk/tencent/qq/b;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/mob/tools/FakeActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 14
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/b;->i(Lcn/sharesdk/tencent/qq/b;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 15
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/b;->j(Lcn/sharesdk/tencent/qq/b;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 16
    iget-object v0, p0, Lcn/sharesdk/tencent/qq/b$1;->b:Lcn/sharesdk/tencent/qq/b;

    invoke-static {v0}, Lcn/sharesdk/tencent/qq/b;->k(Lcn/sharesdk/tencent/qq/b;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcn/sharesdk/framework/authorize/SSOListener;->onFailed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    return-void
.end method
