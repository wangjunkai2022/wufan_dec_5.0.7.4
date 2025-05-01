.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;
.super Ljava/lang/Object;
.source "BeiZiInterstitialActivity.java"

# interfaces
.implements Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoadFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onBitmapLoaded(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->e(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Lcom/beizi/ad/internal/view/CustomRoundImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->f(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->f(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/widget/RelativeLayout;->measure(II)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    .line 5
    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->e(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Lcom/beizi/ad/internal/view/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    .line 7
    invoke-static {v1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->f(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 8
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    .line 9
    invoke-static {v1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->f(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 10
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->e(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Lcom/beizi/ad/internal/view/CustomRoundImageView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->e(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Lcom/beizi/ad/internal/view/CustomRoundImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v1, v2}, Lcom/beizi/ad/internal/utilities/ViewUtil;->dip2px(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/CustomRoundImageView;->setRectRadius(F)V

    .line 12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    const/high16 v1, 0x41a00000    # 20.0f

    .line 14
    invoke-static {v0, p1, v1}, Lcom/beizi/ad/internal/utilities/ImageUtil;->blurBitmap(Landroid/content/Context;Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 15
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 16
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->e(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Lcom/beizi/ad/internal/view/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->e(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Lcom/beizi/ad/internal/view/CustomRoundImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 18
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->g(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V

    .line 19
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->h(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V

    .line 20
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->i(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V

    .line 21
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->b(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->c(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)I

    move-result p1

    if-lez p1, :cond_2

    .line 22
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$12;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->j(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method
