.class public abstract Lcom/join/mgps/customview/wheel/picker/c;
.super Lcom/join/mgps/customview/popup/b;
.source "WheelPicker.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/customview/popup/b<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field protected J:F

.field protected K:I

.field protected L:I

.field protected M:Landroid/graphics/Typeface;

.field protected N:I

.field protected O:I

.field protected P:I

.field protected Q:I

.field protected R:Z

.field protected S:Z

.field protected T:Z

.field protected U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popup/b;-><init>(Landroid/app/Activity;)V

    const/high16 p1, 0x40000000    # 2.0f

    .line 2
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->J:F

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->K:I

    const/16 p1, 0x10

    .line 4
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->L:I

    .line 5
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->M:Landroid/graphics/Typeface;

    const p1, -0x444445

    .line 6
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->N:I

    const p1, -0xfd7732

    .line 7
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->O:I

    .line 8
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->P:I

    const/4 p1, 0x3

    .line 9
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->Q:I

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->R:Z

    .line 11
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->S:Z

    .line 12
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->T:Z

    .line 13
    new-instance p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void
.end method


# virtual methods
.method public A0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void
.end method

.method public B0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->O:I

    return-void
.end method

.method public C0(II)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->O:I

    .line 2
    iput p2, p0, Lcom/join/mgps/customview/wheel/picker/c;->N:I

    return-void
.end method

.method public D0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->K:I

    return-void
.end method

.method public E0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->L:I

    return-void
.end method

.method public F0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->T:Z

    return-void
.end method

.method public G0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->S:Z

    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/b;->G()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    return-object v0
.end method

.method protected k0()Landroid/widget/TextView;
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->P:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->L:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    return-object v0
.end method

.method protected l0()Lcom/join/mgps/customview/wheel/picker/WheelView;
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView;

    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;-><init>(Landroid/content/Context;)V

    .line 2
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->J:F

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setLineSpaceMultiplier(F)V

    .line 3
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->K:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setTextPadding(I)V

    .line 4
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->L:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setTextSize(F)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->M:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 6
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->N:I

    iget v2, p0, Lcom/join/mgps/customview/wheel/picker/c;->O:I

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setTextColor(II)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setDividerConfig(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V

    .line 8
    iget v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->Q:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setOffset(I)V

    .line 9
    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->R:Z

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setCycleDisable(Z)V

    .line 10
    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->S:Z

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setUseWeight(Z)V

    .line 11
    iget-boolean v1, p0, Lcom/join/mgps/customview/wheel/picker/c;->T:Z

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView;->setTextSizeAutoFit(Z)V

    return-object v0
.end method

.method public m0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->R:Z

    return-void
.end method

.method public n0(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->b(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void
.end method

.method public o0(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V
    .locals 1
    .param p1    # Lcom/join/mgps/customview/wheel/picker/WheelView$c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->f(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    goto :goto_0

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    :goto_0
    return-void
.end method

.method public p0(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->c(F)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void
.end method

.method public q0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->h(Z)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void
.end method

.method public r0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->P:I

    return-void
.end method

.method public s0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/c;->n0(I)V

    return-void
.end method

.method public t0(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/c;->o0(Lcom/join/mgps/customview/wheel/picker/WheelView$c;)V

    return-void
.end method

.method public final u0(F)V
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 2.0
            to = 4.0
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->J:F

    return-void
.end method

.method public v0(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/wheel/picker/c;->q0(Z)V

    return-void
.end method

.method public w0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x5L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->Q:I

    return-void
.end method

.method public x0(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->K:I

    return-void
.end method

.method public y0(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    const/16 v0, 0x64

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/wheel/picker/c;->z0(II)V

    return-void
.end method

.method public z0(II)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0xffL
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-direct {v0}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->e(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    .line 4
    iget-object p1, p0, Lcom/join/mgps/customview/wheel/picker/c;->U:Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    invoke-virtual {p1, p2}, Lcom/join/mgps/customview/wheel/picker/WheelView$c;->d(I)Lcom/join/mgps/customview/wheel/picker/WheelView$c;

    return-void
.end method
