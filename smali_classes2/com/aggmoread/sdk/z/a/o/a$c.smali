.class Lcom/aggmoread/sdk/z/a/o/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/o/a;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/o/a;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/o/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
    .locals 6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    if-nez p3, :cond_1

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/o/a;->c(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/c/a/a/e/l;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/o/a$c;->a:Lcom/aggmoread/sdk/z/a/o/a;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/o/a;->c(Lcom/aggmoread/sdk/z/a/o/a;)Lcom/aggmoread/sdk/z/c/a/a/e/l;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    invoke-static {}, Lcom/aggmoread/sdk/z/a/n/a;->a()Lcom/aggmoread/sdk/z/a/n/a;

    move-result-object v0

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/aggmoread/sdk/z/a/n/a;->a(IILandroid/graphics/Bitmap$Config;Landroid/widget/ImageView$ScaleType;[B)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object p2

    new-instance p3, Lcom/aggmoread/sdk/z/a/o/a$c$a;

    invoke-direct {p3, p0, p1}, Lcom/aggmoread/sdk/z/a/o/a$c$a;-><init>(Lcom/aggmoread/sdk/z/a/o/a$c;Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/o/a;->f(Lcom/aggmoread/sdk/z/a/o/a;)V

    :goto_0
    return-void

    :cond_1
    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/o/a;->f(Lcom/aggmoread/sdk/z/a/o/a;)V

    return-void
.end method
