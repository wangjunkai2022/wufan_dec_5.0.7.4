.class Lcom/beizi/ad/internal/nativead/a$1;
.super Ljava/lang/Object;
.source "BeiZiNativeAdResponse.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/nativead/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/nativead/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/nativead/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Z)Z

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Landroid/view/View;)Landroid/view/View;

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Ljava/util/List;)Ljava/util/List;

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;)Lcom/beizi/ad/internal/q;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;)Lcom/beizi/ad/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/q;->a()V

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Lcom/beizi/ad/internal/q;)Lcom/beizi/ad/internal/q;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Lcom/beizi/ad/internal/nativead/NativeAdEventListener;)Lcom/beizi/ad/internal/nativead/NativeAdEventListener;

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->b(Lcom/beizi/ad/internal/nativead/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->b(Lcom/beizi/ad/internal/nativead/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->a(Lcom/beizi/ad/internal/nativead/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->c(Lcom/beizi/ad/internal/nativead/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0}, Lcom/beizi/ad/internal/nativead/a;->c(Lcom/beizi/ad/internal/nativead/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 14
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/a$1;->a:Lcom/beizi/ad/internal/nativead/a;

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/nativead/a;->b(Lcom/beizi/ad/internal/nativead/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    :cond_2
    return-void
.end method
