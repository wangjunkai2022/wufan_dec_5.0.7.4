.class public Lcom/papa91/arc/view/GlideImageLoader;
.super Lcom/youth/banner/loader/ImageLoader;
.source "GlideImageLoader.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/youth/banner/loader/ImageLoader;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createImageView(Landroid/content/Context;Ljava/lang/Object;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/papa91/arc/view/GlideImageLoader;->createImageView(Landroid/content/Context;Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object p1

    return-object p1
.end method

.method public createImageView(Landroid/content/Context;)Landroid/widget/ImageView;
    .locals 2

    .line 2
    new-instance v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-direct {v0, p1}, Lcom/facebook/drawee/view/SimpleDraweeView;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-virtual {v0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/generic/a;

    sget v1, Lorg/ppsspp/ppsspp/R$drawable;->shape_placeholder:I

    invoke-virtual {p1, v1}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 4
    invoke-virtual {v0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/generic/a;

    sget v1, Lorg/ppsspp/ppsspp/R$drawable;->wifi:I

    invoke-virtual {p1, v1}, Lcom/facebook/drawee/generic/a;->B(I)V

    return-object v0
.end method

.method public createImageView(Landroid/content/Context;Ljava/lang/Object;)Landroid/widget/ImageView;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/papa91/arc/view/GlideImageLoader;->createImageView(Landroid/content/Context;)Landroid/widget/ImageView;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic displayImage(Landroid/content/Context;Ljava/lang/Object;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p3, Landroid/widget/ImageView;

    invoke-virtual {p0, p1, p2, p3}, Lcom/papa91/arc/view/GlideImageLoader;->displayImage(Landroid/content/Context;Ljava/lang/Object;Landroid/widget/ImageView;)V

    return-void
.end method

.method public displayImage(Landroid/content/Context;Ljava/lang/Object;Landroid/widget/ImageView;)V
    .locals 0

    .line 2
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 3
    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 4
    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    goto :goto_0

    .line 5
    :cond_0
    instance-of p1, p2, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    .line 6
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    :goto_0
    return-void
.end method
