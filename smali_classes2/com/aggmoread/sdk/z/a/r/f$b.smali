.class Lcom/aggmoread/sdk/z/a/r/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/f;->a(Landroid/widget/ImageView;Landroid/view/ViewGroup;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Landroid/view/View;

.field final synthetic e:Lcom/aggmoread/sdk/z/a/r/f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/f;Landroid/view/ViewGroup;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->b:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->c:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->b:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->i(Lcom/aggmoread/sdk/z/a/r/f;)Lcom/aggmoread/sdk/z/a/r/d;

    move-result-object v0

    sget-object v1, Lcom/aggmoread/sdk/z/a/g/e;->d:Lcom/aggmoread/sdk/z/a/g/e;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/r/b;->a(Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "adcontainer w = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , h = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ApiSplashHandler_api"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/a/n/a;->a()Lcom/aggmoread/sdk/z/a/n/a;

    move-result-object v2

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/f$b;->e:Lcom/aggmoread/sdk/z/a/r/f;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/r/f;->a(Lcom/aggmoread/sdk/z/a/r/f;)[B

    move-result-object v7

    invoke-virtual/range {v2 .. v7}, Lcom/aggmoread/sdk/z/a/n/a;->a(IILandroid/graphics/Bitmap$Config;Landroid/widget/ImageView$ScaleType;[B)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/m;->a()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/aggmoread/sdk/z/a/r/f$b$a;

    invoke-direct {v2, p0, v0}, Lcom/aggmoread/sdk/z/a/r/f$b$a;-><init>(Lcom/aggmoread/sdk/z/a/r/f$b;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
