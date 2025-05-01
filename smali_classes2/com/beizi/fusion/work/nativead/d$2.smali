.class Lcom/beizi/fusion/work/nativead/d$2;
.super Ljava/lang/Object;
.source "BeiZiNativeTPBTWorker.java"

# interfaces
.implements Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/d;->aQ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoadFailed()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    const-string v1, "sdk custom error "

    const-string v2, "onBitmapLoadFailed"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x18697

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/nativead/d;->b(Lcom/beizi/fusion/work/nativead/d;Ljava/lang/String;I)V

    return-void
.end method

.method public onBitmapLoaded(Landroid/graphics/Bitmap;)V
    .locals 6

    if-eqz p1, :cond_6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBeiZiNativeAd onBitmapLoaded width:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";height:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-double v2, v0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 6
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    int-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    double-to-float v0, v2

    .line 7
    :try_start_1
    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    iget-object v2, v1, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget v1, v1, Lcom/beizi/fusion/work/nativead/b;->r:F

    const/high16 v3, 0x41800000    # 16.0f

    sub-float/2addr v1, v3

    invoke-static {v2, v1}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    float-to-int v0, v2

    .line 8
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    iget v4, v2, Lcom/beizi/fusion/work/nativead/b;->s:F

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-lez v4, :cond_2

    .line 9
    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/d;->i(Lcom/beizi/fusion/work/nativead/d;)Landroid/widget/LinearLayout;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/d;->i(Lcom/beizi/fusion/work/nativead/d;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2, v4, v4}, Landroid/widget/LinearLayout;->measure(II)V

    .line 11
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/d;->i(Lcom/beizi/fusion/work/nativead/d;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v4

    .line 12
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    iget-object v5, v2, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    iget v2, v2, Lcom/beizi/fusion/work/nativead/b;->s:F

    sub-float/2addr v2, v3

    invoke-static {v5, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v2

    if-le v2, v4, :cond_2

    sub-int v0, v2, v4

    .line 13
    :cond_2
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 14
    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    .line 15
    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 16
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 17
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    iget-object v1, v1, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/av;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/widget/CustomRoundImageView;->setRectRadius(F)V

    .line 21
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_4

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->n:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, p1, v1}, Lcom/beizi/fusion/g/ac;->a(Landroid/content/Context;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 23
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 24
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 25
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 26
    :cond_5
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/d;->j(Lcom/beizi/fusion/work/nativead/d;)Lcom/beizi/fusion/widget/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/work/nativead/b;->a(Landroid/view/View;)V

    .line 27
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/d;->k(Lcom/beizi/fusion/work/nativead/d;)V

    .line 28
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/d;->l(Lcom/beizi/fusion/work/nativead/d;)V

    .line 29
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/d;->m(Lcom/beizi/fusion/work/nativead/d;)V

    .line 30
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/nativead/b;->aG()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 32
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/d$2;->a:Lcom/beizi/fusion/work/nativead/d;

    const-string v0, "sdk custom error "

    const-string v1, "onBitmapLoadFailed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x18697

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/nativead/d;->a(Lcom/beizi/fusion/work/nativead/d;Ljava/lang/String;I)V

    :cond_6
    :goto_0
    return-void
.end method
