.class Lcom/aggmoread/sdk/z/a/t/h$b;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/t/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/t/h;


# direct methods
.method private constructor <init>(Lcom/aggmoread/sdk/z/a/t/h;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/h$b;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/z/a/t/h;Lcom/aggmoread/sdk/z/a/t/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/t/h$b;-><init>(Lcom/aggmoread/sdk/z/a/t/h;)V

    return-void
.end method


# virtual methods
.method public getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 2

    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    const/16 v0, 0x5f

    if-lt p2, v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h$b;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/h;->b(Lcom/aggmoread/sdk/z/a/t/h;)Lcom/aggmoread/sdk/z/a/t/g;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h$b;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/h;->c(Lcom/aggmoread/sdk/z/a/t/h;)Lcom/aggmoread/sdk/z/a/t/h$d;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/h$d;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/h$b;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/h;->b(Lcom/aggmoread/sdk/z/a/t/h;)Lcom/aggmoread/sdk/z/a/t/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/aggmoread/sdk/z/a/t/g;->b(I)V

    :goto_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/h$b;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/h;->a(Lcom/aggmoread/sdk/z/a/t/h;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/h$b;->a:Lcom/aggmoread/sdk/z/a/t/h;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/h;->a(Lcom/aggmoread/sdk/z/a/t/h;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
