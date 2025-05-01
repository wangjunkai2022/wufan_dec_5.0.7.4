.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/IFeedPortraitListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->onViewAttachedToWindow(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public pauseBtnClick()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "pauseBtnClick "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public playCompletion()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "playCompletion "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->c(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->d(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoComplete()V

    :cond_0
    return-void
.end method

.method public playError()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "playError "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->e(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->f(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const/16 v2, -0x3e8

    const-string v3, "bd:\u89c6\u9891\u7d20\u6750\u64ad\u653e\u5931\u8d25\uff01"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    return-void
.end method

.method public playPause()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "playPause "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->l(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->m(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoPause()V

    :cond_0
    return-void
.end method

.method public playRenderingStart()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "playRenderingStart "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->j(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->k(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoStart()V

    :cond_0
    return-void
.end method

.method public playResume()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "playResume "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->n(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;->o(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/d/a;)Lcom/aggmoread/sdk/z/c/a/a/c/n/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/n/d;->onVideoStart()V

    :cond_0
    return-void
.end method
