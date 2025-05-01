.class public abstract Lcom/join/mgps/customview/popup/a;
.super Ljava/lang/Object;
.source "BasicPopup.java"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/content/DialogInterface$OnKeyListener;",
        "Landroid/content/DialogInterface$OnDismissListener;"
    }
.end annotation


# static fields
.field public static final h:I = -0x1

.field public static final i:I = -0x2


# instance fields
.field protected b:Landroid/app/Activity;

.field protected c:I

.field protected d:I

.field private e:Landroid/app/Dialog;

.field private f:Landroid/widget/FrameLayout;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/customview/popup/a;->g:Z

    .line 3
    iput-object p1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    .line 4
    invoke-static {p1}, Lcom/join/mgps/Util/u1;->c(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 5
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/join/mgps/customview/popup/a;->c:I

    .line 6
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput p1, p0, Lcom/join/mgps/customview/popup/a;->d:I

    .line 7
    invoke-direct {p0}, Lcom/join/mgps/customview/popup/a;->h()V

    return-void
.end method

.method private h()V
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    .line 2
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setFocusableInTouchMode(Z)V

    .line 5
    new-instance v0, Landroid/app/Dialog;

    iget-object v3, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v3, 0x50

    .line 11
    invoke-virtual {v0, v3}, Landroid/view/Window;->setGravity(I)V

    .line 12
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 14
    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 15
    :cond_0
    iget v0, p0, Lcom/join/mgps/customview/popup/a;->c:I

    invoke-virtual {p0, v0, v2}, Lcom/join/mgps/customview/popup/a;->z(II)V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/popup/a;->z(II)V

    return-void
.end method

.method public final B()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/customview/popup/a;->g:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->C()V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->q()V

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->j()Landroid/view/View;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/popup/a;->o(Landroid/view/View;)V

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/popup/a;->p(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/join/mgps/customview/popup/a;->g:Z

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->C()V

    return-void
.end method

.method protected C()V
    .locals 0

    return-void
.end method

.method public a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->b()V

    return-void
.end method

.method protected final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public c()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/popup/a;->d:I

    return v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/popup/a;->c:I

    return v0
.end method

.method public g()Landroid/view/Window;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method protected abstract j()Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation
.end method

.method public k()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->a()V

    const/4 v0, 0x0

    return v0
.end method

.method public l(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/Window;->setWindowAnimations(I)V

    :cond_0
    return-void
.end method

.method public m(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    return-void
.end method

.method public n(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method

.method public o(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->a()V

    return-void
.end method

.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/a;->k()Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected p(Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    return-void
.end method

.method protected q()V
    .locals 0

    return-void
.end method

.method public r(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget p1, p0, Lcom/join/mgps/customview/popup/a;->c:I

    iget v0, p0, Lcom/join/mgps/customview/popup/a;->d:I

    int-to-float v0, v0

    const v1, 0x3f59999a    # 0.85f

    mul-float v0, v0, v1

    float-to-int v0, v0

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/popup/a;->z(II)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setFitsSystemWindows(Z)V

    return-void
.end method

.method public t(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/Window;->setGravity(I)V

    :cond_0
    const/16 v0, 0x11

    if-ne p1, v0, :cond_1

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/popup/a;->c:I

    int-to-float p1, p1

    const v0, 0x3f333333    # 0.7f

    mul-float p1, p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/popup/a;->A(I)V

    :cond_1
    return-void
.end method

.method public u(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget p1, p0, Lcom/join/mgps/customview/popup/a;->c:I

    iget v0, p0, Lcom/join/mgps/customview/popup/a;->d:I

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/popup/a;->z(II)V

    :cond_0
    return-void
.end method

.method public v(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/customview/popup/a;->z(II)V

    return-void
.end method

.method public w(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    new-instance v1, Lcom/join/mgps/customview/popup/a$a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/customview/popup/a$a;-><init>(Lcom/join/mgps/customview/popup/a;Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public x(Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->e:Landroid/app/Dialog;

    new-instance v1, Lcom/join/mgps/customview/popup/a$b;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/customview/popup/a$b;-><init>(Lcom/join/mgps/customview/popup/a;Landroid/content/DialogInterface$OnKeyListener;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public y(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popup/a;->g:Z

    return-void
.end method

.method public z(II)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1
    iget p1, p0, Lcom/join/mgps/customview/popup/a;->c:I

    :cond_0
    const/4 v0, -0x2

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    .line 2
    iget p1, p0, Lcom/join/mgps/customview/popup/a;->c:I

    :goto_0
    const/4 p2, -0x2

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 3
    iget p1, p0, Lcom/join/mgps/customview/popup/a;->c:I

    goto :goto_1

    :cond_2
    if-nez p2, :cond_3

    goto :goto_0

    .line 4
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_4

    .line 5
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    goto :goto_2

    .line 6
    :cond_4
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 8
    :goto_2
    iget-object p1, p0, Lcom/join/mgps/customview/popup/a;->f:Landroid/widget/FrameLayout;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
