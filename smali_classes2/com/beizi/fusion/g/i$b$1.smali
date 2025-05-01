.class Lcom/beizi/fusion/g/i$b$1;
.super Ljava/lang/Object;
.source "BeiZiImageUtils.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/i$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/beizi/fusion/g/i$b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/i$b;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/i$b$1;->b:Lcom/beizi/fusion/g/i$b;

    iput-object p2, p0, Lcom/beizi/fusion/g/i$b$1;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/g/i$b$1;->b:Lcom/beizi/fusion/g/i$b;

    iget-object v0, v0, Lcom/beizi/fusion/g/i$b;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/beizi/fusion/g/i$b$1;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method
