.class Lcn/sharesdk/tencent/qzone/utils/c$1;
.super Ljava/lang/Object;
.source "QZoneSSOProcessor.java"

# interfaces
.implements Lcom/mob/tools/utils/DH$DHResponder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcn/sharesdk/tencent/qzone/utils/c;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcn/sharesdk/tencent/qzone/utils/c;


# direct methods
.method constructor <init>(Lcn/sharesdk/tencent/qzone/utils/c;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    iput-object p2, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(Lcom/mob/tools/utils/DH$DHResponse;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    new-array v1, v0, [I

    .line 1
    invoke-virtual {p1, v1}, Lcom/mob/tools/utils/DH$DHResponse;->getPInfoForce([I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-nez v1, :cond_1

    .line 2
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->a(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 3
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->b(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->c(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    new-instance v0, Lcn/sharesdk/tencent/qzone/utils/TencentSSOClientNotInstalledException;

    invoke-direct {v0}, Lcn/sharesdk/tencent/qzone/utils/TencentSSOClientNotInstalledException;-><init>()V

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/authorize/SSOListener;->onFailed(Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    new-array v0, v0, [I

    .line 5
    invoke-virtual {p1, v0}, Lcom/mob/tools/utils/DH$DHResponse;->resolveActivity([I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-nez p1, :cond_3

    .line 6
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->d(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 7
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->e(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 8
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->f(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object p1

    new-instance v0, Lcn/sharesdk/tencent/qzone/utils/TencentSSOClientNotInstalledException;

    invoke-direct {v0}, Lcn/sharesdk/tencent/qzone/utils/TencentSSOClientNotInstalledException;-><init>()V

    invoke-interface {p1, v0}, Lcn/sharesdk/framework/authorize/SSOListener;->onFailed(Ljava/lang/Throwable;)V

    :cond_2
    return-void

    .line 9
    :cond_3
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "scope"

    .line 10
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/utils/c;->g(Lcn/sharesdk/tencent/qzone/utils/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "client_id"

    .line 11
    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/utils/c;->h(Lcn/sharesdk/tencent/qzone/utils/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pf"

    const-string v1, "openmobile_android"

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "need_pay"

    const-string v1, "1"

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->a:Landroid/content/Intent;

    const-string v1, "key_params"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 15
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->a:Landroid/content/Intent;

    const-string v0, "key_request_code"

    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/utils/c;->i(Lcn/sharesdk/tencent/qzone/utils/c;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 16
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->a:Landroid/content/Intent;

    const-string v0, "key_action"

    const-string v1, "action_login"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    :try_start_1
    iget-object p1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {p1}, Lcn/sharesdk/tencent/qzone/utils/c;->k(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object p1

    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->a:Landroid/content/Intent;

    iget-object v1, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v1}, Lcn/sharesdk/tencent/qzone/utils/c;->j(Lcn/sharesdk/tencent/qzone/utils/c;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/mob/tools/FakeActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 18
    :try_start_2
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/c;->l(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 19
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/c;->m(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 20
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/c;->n(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcn/sharesdk/framework/authorize/SSOListener;->onFailed(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 21
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/c;->o(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOAuthorizeActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mob/tools/FakeActivity;->finish()V

    .line 22
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/c;->p(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 23
    iget-object v0, p0, Lcn/sharesdk/tencent/qzone/utils/c$1;->b:Lcn/sharesdk/tencent/qzone/utils/c;

    invoke-static {v0}, Lcn/sharesdk/tencent/qzone/utils/c;->q(Lcn/sharesdk/tencent/qzone/utils/c;)Lcn/sharesdk/framework/authorize/SSOListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcn/sharesdk/framework/authorize/SSOListener;->onFailed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    return-void
.end method
