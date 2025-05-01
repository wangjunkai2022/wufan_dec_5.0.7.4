.class public Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:J

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->u()I

    move-result p1

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->e:Z

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->e:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "xxxx"

    const-string v2, "onInterceptTouchEvent return false "

    invoke-static {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_3

    if-eq v2, v1, :cond_1

    const/4 v1, 0x2

    if-eq v2, v1, :cond_2

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->c:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2

    cmp-long v5, v1, v3

    if-gez v5, :cond_2

    return v0

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->a:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->b:F

    sub-float/2addr v2, v3

    float-to-int v2, v2

    mul-int v1, v1, v1

    mul-int v2, v2, v2

    add-int/2addr v1, v2

    iget v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->d:I

    if-lt v1, v2, :cond_4

    return v0

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->a:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->b:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->c:J

    :cond_4
    :goto_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
