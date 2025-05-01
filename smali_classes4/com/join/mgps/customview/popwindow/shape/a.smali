.class public abstract Lcom/join/mgps/customview/popwindow/shape/a;
.super Ljava/lang/Object;
.source "Shape.java"


# instance fields
.field protected a:Ly1/a;

.field protected b:I

.field protected c:I

.field protected d:I


# direct methods
.method public constructor <init>(Ly1/a;)V
    .locals 3

    .line 1
    sget v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->u:I

    sget v1, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->v:I

    sget v2, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->w:I

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/join/mgps/customview/popwindow/shape/a;-><init>(Ly1/a;III)V

    return-void
.end method

.method public constructor <init>(Ly1/a;III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/shape/a;->a:Ly1/a;

    .line 4
    iput p2, p0, Lcom/join/mgps/customview/popwindow/shape/a;->b:I

    .line 5
    iput p3, p0, Lcom/join/mgps/customview/popwindow/shape/a;->c:I

    .line 6
    iput p4, p0, Lcom/join/mgps/customview/popwindow/shape/a;->d:I

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
.end method

.method public abstract b()I
.end method

.method public abstract c()Landroid/graphics/Point;
.end method

.method public abstract d(DD)Z
.end method

.method public abstract e()V
.end method
