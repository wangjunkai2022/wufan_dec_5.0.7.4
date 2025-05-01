.class Lcom/aggmoread/sdk/z/a/f/b$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/f/b$g;->a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/f/b$g;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/f/b$g;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/f/b$g$a;->c:Lcom/aggmoread/sdk/z/a/f/b$g;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/f/b$g$a;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/f/b$g$a;->c:Lcom/aggmoread/sdk/z/a/f/b$g;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/f/b$g;->a:Lcom/aggmoread/sdk/z/a/f/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/f/b;->d(Lcom/aggmoread/sdk/z/a/f/b;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/f/b$g$a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/f/b$g$a;->c:Lcom/aggmoread/sdk/z/a/f/b$g;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/a/f/b$g;->a:Lcom/aggmoread/sdk/z/a/f/b;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/f/b;->e(Lcom/aggmoread/sdk/z/a/f/b;)V

    return-void
.end method
