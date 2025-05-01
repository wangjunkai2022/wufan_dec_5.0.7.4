.class Lcom/beizi/fusion/work/e/a$2;
.super Ljava/lang/Object;
.source "FinalLinkNativeNotificationWorker.java"

# interfaces
.implements Lcom/xyz/newad/hudong/widgets/FakeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/e/a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/e/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/e/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->i(Lcom/beizi/fusion/work/e/a;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->j(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->k(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->l(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/e/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->m(Lcom/beizi/fusion/work/e/a;)V

    :cond_1
    return-void
.end method

.method public onClose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->n(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->o(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->p(Lcom/beizi/fusion/work/e/a;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->q(Lcom/beizi/fusion/work/e/a;)V

    return-void
.end method

.method public onDismiss()V
    .locals 0

    return-void
.end method

.method public onFail()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    const-string v1, "\u83b7\u53d6\u5e7f\u544a\u5931\u8d25"

    const/16 v2, 0x279c

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/e/a;->a(Lcom/beizi/fusion/work/e/a;Ljava/lang/String;I)V

    return-void
.end method

.method public onShow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->ad()V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->a(Lcom/beizi/fusion/work/e/a;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->b(Lcom/beizi/fusion/work/e/a;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/e/a;->a(Lcom/beizi/fusion/work/e/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->c(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->d(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->e(Lcom/beizi/fusion/work/e/a;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/e/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->f(Lcom/beizi/fusion/work/e/a;)V

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->g(Lcom/beizi/fusion/work/e/a;)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/e/a$2;->a:Lcom/beizi/fusion/work/e/a;

    invoke-static {v0}, Lcom/beizi/fusion/work/e/a;->h(Lcom/beizi/fusion/work/e/a;)V

    return-void
.end method
