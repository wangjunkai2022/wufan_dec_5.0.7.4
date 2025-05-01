.class Lcom/aggmoread/sdk/z/a/r/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/r/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/r/d;

.field final synthetic b:Lcom/aggmoread/sdk/z/a/g/b;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/r/f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/f;Lcom/aggmoread/sdk/z/a/r/d;Lcom/aggmoread/sdk/z/a/g/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->a:Lcom/aggmoread/sdk/z/a/r/d;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->b:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
    .locals 1

    if-nez p3, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/r/f;[B)[B

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/r/f;)[B

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/aggmoread/sdk/z/a/r/f$a$a;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/r/f$a$a;-><init>(Lcom/aggmoread/sdk/z/a/r/f$a;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->b:Lcom/aggmoread/sdk/z/a/g/b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/h/c;->n()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/r/f;Z)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/r/f;->f(Lcom/aggmoread/sdk/z/a/r/f;)Landroid/widget/ImageView;

    move-result-object p2

    iget-object p3, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {p3}, Lcom/aggmoread/sdk/z/a/r/f;->g(Lcom/aggmoread/sdk/z/a/r/f;)Landroid/view/ViewGroup;

    move-result-object p3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->c:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->h(Lcom/aggmoread/sdk/z/a/r/f;)Landroid/view/View;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/r/f;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->a:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->e:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$a;->a:Lcom/aggmoread/sdk/z/a/r/d;

    sget-object p2, Lcom/aggmoread/sdk/z/a/g/e;->e:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void
.end method
