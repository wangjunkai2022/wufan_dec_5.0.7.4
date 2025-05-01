.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroid/os/CountDownTimer;

.field final synthetic d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

.field final synthetic e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

.field final synthetic f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;

.field final synthetic g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

.field final synthetic h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

.field final synthetic i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

.field final synthetic j:Ljava/lang/Runnable;

.field final synthetic k:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;Ljava/util/List;Landroid/os/CountDownTimer;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Lcom/aggmoread/sdk/z/c/a/a/c/f;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->k:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->b:Ljava/util/List;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->c:Landroid/os/CountDownTimer;

    iput-object p4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iput-object p5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iput-object p6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;

    iput-object p7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    iput-object p8, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    iput-object p9, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    iput-object p10, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->j:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "err c "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",total "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ACBHTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->c:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->k:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    iget-object v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    const/4 v7, 0x0

    const-string v8, "err end"

    invoke-static/range {v1 .. v8}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Lcom/aggmoread/sdk/z/c/a/a/c/f;ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->j:Ljava/lang/Runnable;

    const-string v4, "err"

    invoke-static {v0, v1, v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Ljava/lang/Runnable;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Ljava/lang/Object;)I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e$a;)V

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "load c "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",total "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ACBHTAG"

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->k:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->f:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->g:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    iget-object v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->h:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    const/4 v7, 0x0

    const-string v8, "loaded end "

    invoke-static/range {v1 .. v8}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Lcom/aggmoread/sdk/z/c/a/a/c/f;ZLjava/lang/String;)V

    iget p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->a:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->c:Landroid/os/CountDownTimer;

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->e:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->i:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$d;->j:Ljava/lang/Runnable;

    const-string v3, "load"

    invoke-static {p1, v0, v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$f;Ljava/lang/Runnable;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
