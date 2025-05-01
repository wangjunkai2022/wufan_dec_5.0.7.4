.class Lcom/join/mgps/customview/wheel/picker/WheelView$d;
.super Ljava/util/TimerTask;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/wheel/picker/WheelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field b:F

.field final c:F

.field final d:Lcom/join/mgps/customview/wheel/picker/WheelView;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/WheelView;F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const/high16 v0, 0x4f000000

    .line 2
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    .line 3
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    .line 4
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->c:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    const/4 v1, 0x0

    const/high16 v2, 0x4f000000

    cmpl-float v0, v0, v2

    if-nez v0, :cond_2

    .line 2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->c:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v2, 0x44fa0000    # 2000.0f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    .line 3
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->c:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 4
    iput v2, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    goto :goto_0

    :cond_0
    const/high16 v0, -0x3b060000    # -2000.0f

    .line 5
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    goto :goto_0

    .line 6
    :cond_1
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->c:F

    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    .line 7
    :cond_2
    :goto_0
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v2, 0x41a00000    # 20.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_3

    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->m(Lcom/join/mgps/customview/wheel/picker/WheelView;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->n(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    move-result-object v0

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    .line 10
    :cond_3
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    const/high16 v3, 0x41200000    # 10.0f

    mul-float v0, v0, v3

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v0, v3

    float-to-int v0, v0

    .line 11
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v4

    int-to-float v0, v0

    sub-float/2addr v4, v0

    invoke-static {v3, v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->c(Lcom/join/mgps/customview/wheel/picker/WheelView;F)F

    .line 12
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->d(Lcom/join/mgps/customview/wheel/picker/WheelView;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 13
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->e(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v3

    .line 14
    iget-object v4, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v4}, Lcom/join/mgps/customview/wheel/picker/WheelView;->f(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v4

    neg-int v4, v4

    int-to-float v4, v4

    mul-float v4, v4, v3

    .line 15
    iget-object v5, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-virtual {v5}, Lcom/join/mgps/customview/wheel/picker/WheelView;->getItemCount()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    iget-object v6, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v6}, Lcom/join/mgps/customview/wheel/picker/WheelView;->f(Lcom/join/mgps/customview/wheel/picker/WheelView;)I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    mul-float v5, v5, v3

    .line 16
    iget-object v6, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v6}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v6

    float-to-double v6, v6

    float-to-double v8, v3

    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v6, v8

    float-to-double v10, v4

    cmpg-double v3, v6, v10

    if-gez v3, :cond_4

    .line 17
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v3

    add-float v4, v3, v0

    goto :goto_1

    .line 18
    :cond_4
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v3

    float-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v6, v8

    float-to-double v8, v5

    cmpl-double v3, v6, v8

    if-lez v3, :cond_5

    .line 19
    iget-object v3, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v3

    add-float v5, v3, v0

    .line 20
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v0

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_6

    const/high16 v0, 0x42200000    # 40.0f

    .line 21
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    .line 22
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    float-to-int v3, v4

    int-to-float v3, v3

    invoke-static {v0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->c(Lcom/join/mgps/customview/wheel/picker/WheelView;F)F

    goto :goto_2

    .line 23
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->b(Lcom/join/mgps/customview/wheel/picker/WheelView;)F

    move-result v0

    cmpl-float v0, v0, v5

    if-ltz v0, :cond_7

    .line 24
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    float-to-int v3, v5

    int-to-float v3, v3

    invoke-static {v0, v3}, Lcom/join/mgps/customview/wheel/picker/WheelView;->c(Lcom/join/mgps/customview/wheel/picker/WheelView;F)F

    const/high16 v0, -0x3de00000    # -40.0f

    .line 25
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    .line 26
    :cond_7
    :goto_2
    iget v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    cmpg-float v1, v0, v1

    if-gez v1, :cond_8

    add-float/2addr v0, v2

    .line 27
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    goto :goto_3

    :cond_8
    sub-float/2addr v0, v2

    .line 28
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->b:F

    .line 29
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$d;->d:Lcom/join/mgps/customview/wheel/picker/WheelView;

    invoke-static {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView;->n(Lcom/join/mgps/customview/wheel/picker/WheelView;)Lcom/join/mgps/customview/wheel/picker/WheelView$f;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method
