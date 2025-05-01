.class Lcom/aggmoread/sdk/z/a/r/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/f$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/r/f$b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/f$b;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->c:Lcom/aggmoread/sdk/z/a/r/f$b;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->c:Lcom/aggmoread/sdk/z/a/r/f$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->j(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/g/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/g/b;->d()Lcom/aggmoread/sdk/z/a/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->c:Lcom/aggmoread/sdk/z/a/r/f$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->i(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    instance-of v0, v0, Lcom/aggmoread/sdk/z/a/r/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->c:Lcom/aggmoread/sdk/z/a/r/f$b;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->i(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/a/r/e;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->c:Lcom/aggmoread/sdk/z/a/r/f$b;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/r/e;->a(Lcom/aggmoread/sdk/z/a/a;)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->c:Lcom/aggmoread/sdk/z/a/r/f$b;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/f$b$a;->b:Landroid/graphics/Bitmap;

    iget-object v3, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->c:Landroid/widget/ImageView;

    iget-object v4, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->b:Landroid/view/ViewGroup;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/r/f$b;->d:Landroid/view/View;

    invoke-static {v1, v2, v3, v4, v0}, Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/r/f;Landroid/graphics/Bitmap;Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method
