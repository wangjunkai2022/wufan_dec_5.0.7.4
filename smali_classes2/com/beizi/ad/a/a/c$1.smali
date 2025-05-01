.class Lcom/beizi/ad/a/a/c$1;
.super Ljava/lang/Object;
.source "RegionClickUtil.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/a/a/c;->a(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:F

.field b:F

.field c:F

.field d:F

.field e:F

.field f:F

.field final synthetic g:Lcom/beizi/ad/a/a/c;


# direct methods
.method constructor <init>(Lcom/beizi/ad/a/a/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/a/a/c$1;->g:Lcom/beizi/ad/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->e:F

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->f:F

    goto/16 :goto_0

    .line 4
    :cond_1
    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->e:F

    iget p2, p0, Lcom/beizi/ad/a/a/c$1;->a:F

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x41700000    # 15.0f

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_3

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->f:F

    iget v1, p0, Lcom/beizi/ad/a/a/c$1;->b:F

    sub-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_3

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/a/a/c$1;->g:Lcom/beizi/ad/a/a/c;

    invoke-static {p1}, Lcom/beizi/ad/a/a/c;->a(Lcom/beizi/ad/a/a/c;)Lcom/beizi/ad/a/a/c$a;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 6
    iget-object p1, p0, Lcom/beizi/ad/a/a/c$1;->g:Lcom/beizi/ad/a/a/c;

    invoke-static {p1}, Lcom/beizi/ad/a/a/c;->a(Lcom/beizi/ad/a/a/c;)Lcom/beizi/ad/a/a/c$a;

    move-result-object v1

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->a:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->b:F

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->c:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->d:F

    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v5

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->a:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v6

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->b:F

    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v7

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->c:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v8

    iget p1, p0, Lcom/beizi/ad/a/a/c$1;->d:F

    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v9

    .line 11
    invoke-interface/range {v1 .. v9}, Lcom/beizi/ad/a/a/c$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->a:F

    .line 13
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->b:F

    .line 14
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->c:F

    .line 15
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->d:F

    .line 16
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->e:F

    .line 17
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/beizi/ad/a/a/c$1;->f:F

    :cond_3
    :goto_0
    return v0
.end method
