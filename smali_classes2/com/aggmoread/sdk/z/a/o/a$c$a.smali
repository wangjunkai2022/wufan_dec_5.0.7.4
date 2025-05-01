.class Lcom/aggmoread/sdk/z/a/o/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/o/a$c;->a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/o/a$c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/o/a$c;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->c:Lcom/aggmoread/sdk/z/a/o/a$c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->c:Lcom/aggmoread/sdk/z/a/o/a$c;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/o/a;->b(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/a/o/a$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->c:Lcom/aggmoread/sdk/z/a/o/a$c;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/o/a;->b(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/a/o/a$d;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->c:Lcom/aggmoread/sdk/z/a/o/a$c;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/a/o/a;->d(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/a/r/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/a/o/a$d;->a(Lcom/aggmoread/sdk/z/a/r/a;)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->c:Lcom/aggmoread/sdk/z/a/o/a$c;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/o/a;->c(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/c/a/a/e/l;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/o/a$c$a;->c:Lcom/aggmoread/sdk/z/a/o/a$c;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/o/a;->e(Lcom/aggmoread/sdk/z/a/o/a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method
