.class public Lcom/aggmoread/sdk/z/a/r/a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/r/a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Lcom/aggmoread/sdk/z/a/g/c;

.field private c:Lcom/aggmoread/sdk/z/a/r/a$a;

.field private d:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/a/r/a$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->c:Lcom/aggmoread/sdk/z/a/r/a$a;

    return-void
.end method

.method public static a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/a$a;)Lcom/aggmoread/sdk/z/a/r/a;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/a/r/a;

    invoke-direct {v0, p1}, Lcom/aggmoread/sdk/z/a/r/a;-><init>(Lcom/aggmoread/sdk/z/a/r/a$a;)V

    iput-object p0, v0, Lcom/aggmoread/sdk/z/a/r/a;->a:Landroid/view/View;

    new-instance p1, Lcom/aggmoread/sdk/z/a/g/c;

    invoke-direct {p1}, Lcom/aggmoread/sdk/z/a/g/c;-><init>()V

    iput-object p1, v0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    new-instance p1, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, v0, Lcom/aggmoread/sdk/z/a/r/a;->d:Landroid/view/GestureDetector;

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    return-object v0
.end method

.method private b()Z
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/a;->c:Lcom/aggmoread/sdk/z/a/r/a$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-interface {v0, v1, v2}, Lcom/aggmoread/sdk/z/a/r/a$a;->a(Landroid/view/View;Lcom/aggmoread/sdk/z/a/g/c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/r/a;->c:Lcom/aggmoread/sdk/z/a/r/a$a;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()Lcom/aggmoread/sdk/z/a/g/c;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/a;->b()Z

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string p1, "AdTouchCollector"

    const-string v0, "onSingleTapUp enter"

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/a;->b()Z

    move-result p1

    return p1
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const-string v0, "AdTouchCollector"

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "touch mx = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " , my = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    iput v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->c:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    iput v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->d:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->h:J

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->e:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iput v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->f:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "touch ux = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    iget v1, v1, Lcom/aggmoread/sdk/z/a/g/c;->c:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , uy = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    iget v1, v1, Lcom/aggmoread/sdk/z/a/g/c;->d:I

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    float-to-int v1, v1

    iput v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->a:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    iput v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->b:I

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p1, Lcom/aggmoread/sdk/z/a/g/c;->g:J

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "touch dx = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    iget v1, v1, Lcom/aggmoread/sdk/z/a/g/c;->a:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , dy = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/r/a;->b:Lcom/aggmoread/sdk/z/a/g/c;

    iget v1, v1, Lcom/aggmoread/sdk/z/a/g/c;->b:I

    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-static {v0, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/a;->d:Landroid/view/GestureDetector;

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x0

    return p1
.end method
