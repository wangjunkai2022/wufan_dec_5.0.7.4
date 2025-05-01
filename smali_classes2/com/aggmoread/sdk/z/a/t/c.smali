.class public Lcom/aggmoread/sdk/z/a/t/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/t/c$c;
    }
.end annotation


# instance fields
.field private a:Landroid/view/GestureDetector;

.field private b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field public c:Lcom/aggmoread/sdk/z/a/g/c;

.field private d:Lcom/aggmoread/sdk/z/a/t/c$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/aggmoread/sdk/z/a/t/c$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/t/c$a;-><init>(Lcom/aggmoread/sdk/z/a/t/c;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    new-instance v0, Lcom/aggmoread/sdk/z/a/g/c;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/g/c;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/t/c;->b(Landroid/content/Context;)V

    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/view/GestureDetector;
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->a:Landroid/view/GestureDetector;

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/aggmoread/sdk/z/a/t/c$b;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/a/t/c$b;-><init>(Lcom/aggmoread/sdk/z/a/t/c;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->a:Landroid/view/GestureDetector;

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/c;->a:Landroid/view/GestureDetector;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/t/c;)Lcom/aggmoread/sdk/z/a/t/c$c;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/t/c;->d:Lcom/aggmoread/sdk/z/a/t/c$c;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/t/c;Lcom/aggmoread/sdk/z/a/t/c$c;)Lcom/aggmoread/sdk/z/a/t/c$c;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/c;->d:Lcom/aggmoread/sdk/z/a/t/c$c;

    return-object p1
.end method

.method private b(Landroid/content/Context;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/t/c;->b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/a/t/c$c;)V
    .locals 1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/c;->d:Lcom/aggmoread/sdk/z/a/t/c$c;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->b:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->d:Lcom/aggmoread/sdk/z/a/t/c$c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/c$c;->c()V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const-string v1, "ApiViewStatusLayout"

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Lcom/aggmoread/sdk/z/a/g/c;->c:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Lcom/aggmoread/sdk/z/a/g/c;->d:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/aggmoread/sdk/z/a/g/c;->h:J

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    iput v2, v0, Lcom/aggmoread/sdk/z/a/g/c;->e:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v2

    iput v2, v0, Lcom/aggmoread/sdk/z/a/g/c;->f:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "touch ux = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    iget v2, v2, Lcom/aggmoread/sdk/z/a/g/c;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " , uy = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    iget v2, v2, Lcom/aggmoread/sdk/z/a/g/c;->d:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    iput v0, v3, Lcom/aggmoread/sdk/z/a/g/c;->a:I

    iput v2, v3, Lcom/aggmoread/sdk/z/a/g/c;->b:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, v3, Lcom/aggmoread/sdk/z/a/g/c;->g:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "touch dx = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    iget v2, v2, Lcom/aggmoread/sdk/z/a/g/c;->a:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " , dy = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/t/c;->c:Lcom/aggmoread/sdk/z/a/g/c;

    iget v2, v2, Lcom/aggmoread/sdk/z/a/g/c;->b:I

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/t/c;->a(Landroid/content/Context;)Landroid/view/GestureDetector;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/c;->d:Lcom/aggmoread/sdk/z/a/t/c$c;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/a/t/c$c;->a(I)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    return-void
.end method
