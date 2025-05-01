.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/l/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/a/t/f;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;Lcom/aggmoread/sdk/z/c/a/a/c/t/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaStart"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoStart()V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaLoaded"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoLoaded(I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/g/e;)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onMediaError err "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v2

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaReady "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoReady()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaCompleted "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoCompleted()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaLoading"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoLoading()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaResume"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoResume()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->b:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaPause "

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/o/e/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/c/t/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/a;->onVideoPause()V

    :cond_0
    return-void
.end method
