.class Lcom/aggmoread/sdk/z/b/d/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/b/d/a;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/b/d/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/b/d/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->o(Lcom/aggmoread/sdk/z/b/d/a;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    if-le p1, v1, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->p(Lcom/aggmoread/sdk/z/b/d/a;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object p1

    instance-of p1, p1, Lcom/aggmoread/sdk/z/a/r/e;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/a/r/e;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/r/e;->d()V

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->e(Lcom/aggmoread/sdk/z/b/d/a;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/b/d/a$g;->a:Lcom/aggmoread/sdk/z/b/d/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/b/d/a;->m(Lcom/aggmoread/sdk/z/b/d/a;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object p1

    sget-object v0, Lcom/aggmoread/sdk/z/a/g/e;->f:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/a/i/b;->a(Lcom/aggmoread/sdk/z/a/g/e;)V

    :goto_0
    return-void
.end method
