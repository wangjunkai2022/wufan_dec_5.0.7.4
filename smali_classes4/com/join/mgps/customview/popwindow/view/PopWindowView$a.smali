.class Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;
.super Ljava/lang/Object;
.source "PopWindowView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/popwindow/view/PopWindowView;->q(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->a(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Lcom/join/mgps/customview/popwindow/shape/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/customview/popwindow/shape/a;->e()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->a(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Lcom/join/mgps/customview/popwindow/shape/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->a(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Lcom/join/mgps/customview/popwindow/shape/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/customview/popwindow/shape/a;->c()Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->y:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->b(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView;

    invoke-static {v0, p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->s(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method
