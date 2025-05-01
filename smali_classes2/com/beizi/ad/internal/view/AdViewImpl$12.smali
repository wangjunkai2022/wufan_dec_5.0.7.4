.class Lcom/beizi/ad/internal/view/AdViewImpl$12;
.super Ljava/lang/Object;
.source "AdViewImpl.java"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/AdViewImpl;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$12;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$12;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Lcom/beizi/ad/internal/view/AdViewImpl;F)F

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$12;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->b(Lcom/beizi/ad/internal/view/AdViewImpl;F)F

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$12;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->c(Lcom/beizi/ad/internal/view/AdViewImpl;F)F

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$12;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-static {v0, p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->d(Lcom/beizi/ad/internal/view/AdViewImpl;F)F

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$12;->a:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget v0, p1, Lcom/beizi/ad/internal/view/AdViewImpl;->clickCount:I

    iget p1, p1, Lcom/beizi/ad/internal/view/AdViewImpl;->loadCount:I

    const/4 p1, 0x1

    return p1
.end method
