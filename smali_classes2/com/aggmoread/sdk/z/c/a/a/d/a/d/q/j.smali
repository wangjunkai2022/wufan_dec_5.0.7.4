.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/c;
.source "SourceFile"


# instance fields
.field private l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/e/f;I)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/c;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a(Z)V

    return-void
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v0

    return v0
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/j;->l:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j()V

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l()Z
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "con tryNextSDK , rid "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", listener0 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ACWFRTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const/16 v2, -0x4e20

    const-string v3, "\u672a\u5339\u914d\u5230\u5408\u9002\u7684\u5e7f\u544a"

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/f;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
