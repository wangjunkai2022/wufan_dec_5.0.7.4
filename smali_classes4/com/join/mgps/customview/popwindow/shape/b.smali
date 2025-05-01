.class public Lcom/join/mgps/customview/popwindow/shape/b;
.super Lcom/join/mgps/customview/popwindow/shape/a;
.source "ShapeRect.java"


# instance fields
.field e:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Ly1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/shape/a;-><init>(Ly1/a;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/popwindow/shape/b;->f()V

    return-void
.end method

.method public constructor <init>(Ly1/a;III)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/customview/popwindow/shape/a;-><init>(Ly1/a;III)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/customview/popwindow/shape/b;->f()V

    return-void
.end method

.method private f()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/customview/popwindow/shape/a;->a:Ly1/a;

    invoke-interface {v1}, Ly1/a;->b()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/join/mgps/customview/popwindow/shape/a;->b:I

    int-to-float v3, v2

    sub-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    iget v1, v0, Landroid/graphics/RectF;->top:F

    int-to-float v3, v2

    sub-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 5
    iget v1, v0, Landroid/graphics/RectF;->right:F

    int-to-float v3, v2

    add-float/2addr v1, v3

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 6
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    iget v3, p0, Lcom/join/mgps/customview/popwindow/shape/a;->d:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 7
    iput-object v0, p0, Lcom/join/mgps/customview/popwindow/shape/b;->e:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/join/mgps/customview/popwindow/shape/b;->e:Landroid/graphics/RectF;

    int-to-float p4, p4

    invoke-virtual {p1, p3, p4, p4, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/shape/b;->e:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public c()Landroid/graphics/Point;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/shape/a;->a:Ly1/a;

    invoke-interface {v0}, Ly1/a;->a()Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public d(DD)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/shape/b;->e:Landroid/graphics/RectF;

    double-to-float p1, p1

    double-to-float p2, p3

    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    return p1
.end method

.method public e()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/popwindow/shape/b;->f()V

    return-void
.end method
