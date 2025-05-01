.class Lcom/join/mgps/customview/wheel/picker/WheelView$j;
.super Ljava/util/TimerTask;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/wheel/picker/WheelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
.end annotation


# instance fields
.field b:I

.field c:I

.field d:I

.field final e:Lcom/join/mgps/customview/wheel/picker/WheelView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/WheelView;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const v0, 0x7fffffff

    .line 2
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->b:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    .line 4
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    .line 5
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->d:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->b:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    .line 2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->d:I

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->b:I

    .line 3
    :cond_0
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->b:I

    int-to-float v1, v0

    const v2, 0x3dcccccd    # 0.1f

    mul-float v1, v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    const/4 v2, 0x1

    if-nez v1, :cond_2

    if-gez v0, :cond_1

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    goto :goto_0

    .line 5
    :cond_1
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    .line 6
    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v1, 0xbb8

    if-gt v0, v2, :cond_3

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->m(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->n(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v3

    iget v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-static {v0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->c(Lcom/join/mgps/customview/wheel/picker/WheelView;F)F

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->d(Lcom/join/mgps/customview/wheel/picker/WheelView;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 11
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->e(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v0

    .line 12
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->f(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    mul-float v3, v3, v0

    .line 13
    iget-object v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-virtual {v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->getItemCount()I

    move-result v4

    sub-int/2addr v4, v2

    iget-object v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->f(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v2

    sub-int/2addr v4, v2

    int-to-float v2, v4

    mul-float v2, v2, v0

    .line 14
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v0

    cmpg-float v0, v0, v3

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v0

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_5

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v2

    iget v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    invoke-static {v0, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->c(Lcom/join/mgps/customview/wheel/picker/WheelView;F)F

    .line 16
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->m(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->n(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 18
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->e:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->n(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 19
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->b:I

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->c:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$j;->b:I

    :goto_1
    return-void
.end method
