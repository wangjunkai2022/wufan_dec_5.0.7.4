.class Lcom/aggmoread/sdk/z/b/d/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Lcom/aggmoread/sdk/z/b/d/a$b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a$b;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/d/a$b;->d:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->n(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/b/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/a/a;->d()Lcom/aggmoread/sdk/z/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/b/b/a;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/d/a$b;->d:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    instance-of v0, v0, Lcom/aggmoread/sdk/z/a/r/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/d/a$b;->d:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/a/r/e;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/b/d/a$b;->d:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/r/e;->a(Lcom/aggmoread/sdk/z/a/a;)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/d/a$b;->d:Lcom/aggmoread/sdk/z/b/d/a;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->b:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/b/d/a;->o(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/widget/ImageView;

    move-result-object v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/b/d/a$b$a;->c:Lcom/aggmoread/sdk/z/b/d/a$b;

    iget-object v4, v3, Lcom/aggmoread/sdk/z/b/d/a$b;->b:Landroid/view/ViewGroup;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/b/d/a$b;->c:Landroid/view/View;

    invoke-static {v0, v1, v2, v4, v3}, Lcom/aggmoread/sdk/z/b/d/a;->a(Lcom/aggmoread/sdk/z/b/d/a;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method
