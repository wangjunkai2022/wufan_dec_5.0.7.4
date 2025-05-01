.class Lcom/beizi/fusion/widget/EulerAngleView$1;
.super Ljava/lang/Object;
.source "EulerAngleView.java"

# interfaces
.implements Lcom/beizi/fusion/g/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/EulerAngleView;->buildEulerAngleView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/EulerAngleView;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/EulerAngleView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/EulerAngleView$1;->a:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView$1;->a:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Lcom/beizi/fusion/widget/EulerAngleView;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/widget/EulerAngleView$1;->a:Lcom/beizi/fusion/widget/EulerAngleView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/EulerAngleView;->a(Lcom/beizi/fusion/widget/EulerAngleView;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
