.class Lcom/beizi/fusion/work/h/a$4;
.super Ljava/lang/Object;
.source "BaseUnifiedCustomWorker.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/a;->a(Landroid/view/View;Ljava/lang/String;ILcom/beizi/fusion/g/ap$a;)V
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

.field final synthetic e:Z

.field final synthetic f:I

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/beizi/fusion/g/ap$a;

.field final synthetic i:Lcom/beizi/fusion/work/h/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/a;ZILjava/lang/String;Lcom/beizi/fusion/g/ap$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iput-boolean p2, p0, Lcom/beizi/fusion/work/h/a$4;->e:Z

    iput p3, p0, Lcom/beizi/fusion/work/h/a$4;->f:I

    iput-object p4, p0, Lcom/beizi/fusion/work/h/a$4;->g:Ljava/lang/String;

    iput-object p5, p0, Lcom/beizi/fusion/work/h/a$4;->h:Lcom/beizi/fusion/g/ap$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_8

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto/16 :goto_0

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/work/h/a$4;->c:F

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/work/h/a$4;->d:F

    goto/16 :goto_0

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mCurPosX = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/fusion/work/h/a$4;->c:F

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mCurPosY = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/fusion/work/h/a$4;->d:F

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mPosX = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/fusion/work/h/a$4;->a:F

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mPosY = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/beizi/fusion/work/h/a$4;->b:F

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "SlideClickUtil"

    invoke-static {v1, p1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget p1, p0, Lcom/beizi/fusion/work/h/a$4;->d:F

    iget v1, p0, Lcom/beizi/fusion/work/h/a$4;->b:F

    sub-float v2, p1, v1

    iget v3, p0, Lcom/beizi/fusion/work/h/a$4;->f:I

    int-to-float v4, v3

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->T:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;

    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;->getScrollCoordinate()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->T:Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;

    .line 7
    invoke-virtual {p1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean$RenderAds;->getScrollCoordinate()Ljava/lang/String;

    move-result-object p1

    const-string p2, "-1:-1:-1:-1:-1:-1:-1:-1:-1"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-boolean p2, p0, Lcom/beizi/fusion/work/h/a$4;->e:Z

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/work/h/a;->b(Z)V

    goto/16 :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->g:Ljava/lang/String;

    const-string p2, "down"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->h:Lcom/beizi/fusion/g/ap$a;

    if-eqz p1, :cond_a

    .line 11
    invoke-interface {p1}, Lcom/beizi/fusion/g/ap$a;->c_()V

    goto/16 :goto_0

    :cond_3
    sub-float/2addr v1, p1

    int-to-float p1, v3

    cmpl-float p1, v1, p1

    if-lez p1, :cond_4

    .line 12
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->g:Ljava/lang/String;

    const-string p2, "up"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 13
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->h:Lcom/beizi/fusion/g/ap$a;

    if-eqz p1, :cond_a

    .line 14
    invoke-interface {p1}, Lcom/beizi/fusion/g/ap$a;->c_()V

    goto/16 :goto_0

    .line 15
    :cond_4
    iget p1, p0, Lcom/beizi/fusion/work/h/a$4;->a:F

    iget v1, p0, Lcom/beizi/fusion/work/h/a$4;->c:F

    sub-float v2, p1, v1

    int-to-float v4, v3

    cmpl-float v2, v2, v4

    if-lez v2, :cond_5

    .line 16
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->g:Ljava/lang/String;

    const-string p2, "left"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 17
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->h:Lcom/beizi/fusion/g/ap$a;

    if-eqz p1, :cond_a

    .line 18
    invoke-interface {p1}, Lcom/beizi/fusion/g/ap$a;->c_()V

    goto :goto_0

    :cond_5
    sub-float/2addr v1, p1

    int-to-float p1, v3

    cmpl-float p1, v1, p1

    if-lez p1, :cond_6

    .line 19
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->g:Ljava/lang/String;

    const-string p2, "right"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 20
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->h:Lcom/beizi/fusion/g/ap$a;

    if-eqz p1, :cond_a

    .line 21
    invoke-interface {p1}, Lcom/beizi/fusion/g/ap$a;->c_()V

    goto :goto_0

    .line 22
    :cond_6
    iget-boolean p1, p0, Lcom/beizi/fusion/work/h/a$4;->e:Z

    if-eqz p1, :cond_7

    .line 23
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->q:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 24
    :cond_7
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->s:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 25
    :cond_8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/work/h/a$4;->a:F

    .line 26
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/work/h/a$4;->b:F

    .line 27
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/work/h/a$4;->c:F

    .line 28
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/beizi/fusion/work/h/a$4;->d:F

    .line 29
    iget-boolean p1, p0, Lcom/beizi/fusion/work/h/a$4;->e:Z

    if-eqz p1, :cond_9

    .line 30
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->q:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0

    .line 31
    :cond_9
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$4;->i:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->s:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_a
    :goto_0
    return v0
.end method
