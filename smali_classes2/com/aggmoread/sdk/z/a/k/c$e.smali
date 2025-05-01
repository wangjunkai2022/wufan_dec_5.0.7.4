.class Lcom/aggmoread/sdk/z/a/k/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/k/c;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/k/c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/k/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/k/c$e;->a:Lcom/aggmoread/sdk/z/a/k/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
    .locals 6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/k/c$e;->a:Lcom/aggmoread/sdk/z/a/k/c;

    if-nez p3, :cond_1

    if-eqz p2, :cond_0

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/k/c;->d(Lcom/aggmoread/sdk/z/a/k/c;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/k/c$e;->a:Lcom/aggmoread/sdk/z/a/k/c;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/k/c;->d(Lcom/aggmoread/sdk/z/a/k/c;)Landroid/widget/ImageView;

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

    new-instance p3, Lcom/aggmoread/sdk/z/a/k/c$e$a;

    invoke-direct {p3, p0, p1}, Lcom/aggmoread/sdk/z/a/k/c$e$a;-><init>(Lcom/aggmoread/sdk/z/a/k/c$e;Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_0
    const-string p2, "\u5e7f\u544a\u7d20\u6750\u4e3a\u7a7a!"

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u5e7f\u544a\u6e32\u67d3\u5931\u8d25\uff1acode = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/a/g/e;->a()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", msg = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/aggmoread/sdk/z/a/g/e;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/k/c;->a(Lcom/aggmoread/sdk/z/a/k/c;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
