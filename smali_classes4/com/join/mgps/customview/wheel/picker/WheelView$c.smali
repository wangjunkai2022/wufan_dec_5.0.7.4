.class public Lcom/join/mgps/customview/wheel/picker/WheelView$c;
.super Ljava/lang/Object;
.source "WheelView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/wheel/picker/WheelView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final i:F = 0.0f

.field public static final j:F = 1.0f


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:I

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:F

.field protected h:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->a:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b:Z

    const v0, -0x7c321a

    .line 4
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    const v0, -0x444445

    .line 5
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    const/16 v0, 0x64

    .line 6
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e:I

    const/16 v0, 0xdc

    .line 7
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    const v0, 0x3dcccccd    # 0.1f

    .line 8
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->g:F

    const/high16 v0, 0x40000000    # 2.0f

    .line 9
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h:F

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->a:Z

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b:Z

    const v0, -0x7c321a

    .line 13
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    const v0, -0x444445

    .line 14
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    const/16 v0, 0x64

    .line 15
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e:I

    const/16 v0, 0xdc

    .line 16
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    const v0, 0x3dcccccd    # 0.1f

    .line 17
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->g:F

    const/high16 v0, 0x40000000    # 2.0f

    .line 18
    iput v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h:F

    .line 19
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->g:F

    return-void
.end method


# virtual methods
.method public a(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0xffL
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    return-object p0
.end method

.method public b(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    return-object p0
.end method

.method public c(F)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->g:F

    return-object p0
.end method

.method public d(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0xffL
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e:I

    return-object p0
.end method

.method public e(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b:Z

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    return-object p0
.end method

.method public f(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b:Z

    if-eqz p1, :cond_0

    .line 2
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    const v0, -0x7c321a

    if-ne p1, v0, :cond_0

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d:I

    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    const/16 p1, 0xff

    .line 4
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    :cond_0
    return-object p0
.end method

.method public g(F)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h:F

    return-object p0
.end method

.method public h(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->a:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "visible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",thick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
