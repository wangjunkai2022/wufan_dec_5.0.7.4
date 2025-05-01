.class public abstract Lcom/join/mgps/customview/popup/b;
.super Lcom/join/mgps/customview/popup/a;
.source "ConfirmPopup.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Lcom/join/mgps/customview/popup/a<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field protected A:I

.field protected B:I

.field protected C:I

.field protected D:Landroid/widget/TextView;

.field protected E:Landroid/widget/TextView;

.field protected F:Landroid/view/View;

.field protected G:Landroid/view/View;

.field protected H:Landroid/view/View;

.field protected I:Landroid/view/View;

.field protected j:Z

.field protected k:I

.field protected l:I

.field protected m:I

.field protected n:I

.field protected o:I

.field protected p:I

.field protected q:I

.field protected r:Z

.field protected s:Ljava/lang/CharSequence;

.field protected t:Ljava/lang/CharSequence;

.field protected u:Ljava/lang/CharSequence;

.field protected v:I

.field protected w:I

.field protected x:I

.field protected y:I

.field protected z:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popup/a;-><init>(Landroid/app/Activity;)V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/customview/popup/b;->j:Z

    const v1, -0xcc4a1b

    .line 3
    iput v1, p0, Lcom/join/mgps/customview/popup/b;->k:I

    .line 4
    iput v0, p0, Lcom/join/mgps/customview/popup/b;->l:I

    const/4 v2, -0x1

    .line 5
    iput v2, p0, Lcom/join/mgps/customview/popup/b;->m:I

    const/16 v3, 0x28

    .line 6
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->n:I

    const/16 v3, 0xf

    .line 7
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->o:I

    const/4 v3, 0x0

    .line 8
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->p:I

    .line 9
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->q:I

    .line 10
    iput-boolean v0, p0, Lcom/join/mgps/customview/popup/b;->r:Z

    const-string v0, ""

    .line 11
    iput-object v0, p0, Lcom/join/mgps/customview/popup/b;->s:Ljava/lang/CharSequence;

    .line 12
    iput-object v0, p0, Lcom/join/mgps/customview/popup/b;->t:Ljava/lang/CharSequence;

    .line 13
    iput-object v0, p0, Lcom/join/mgps/customview/popup/b;->u:Ljava/lang/CharSequence;

    .line 14
    iput v1, p0, Lcom/join/mgps/customview/popup/b;->v:I

    .line 15
    iput v1, p0, Lcom/join/mgps/customview/popup/b;->w:I

    const/high16 v0, -0x1000000

    .line 16
    iput v0, p0, Lcom/join/mgps/customview/popup/b;->x:I

    const v0, -0xfd7732

    .line 17
    iput v0, p0, Lcom/join/mgps/customview/popup/b;->y:I

    .line 18
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->z:I

    .line 19
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->A:I

    .line 20
    iput v3, p0, Lcom/join/mgps/customview/popup/b;->B:I

    .line 21
    iput v2, p0, Lcom/join/mgps/customview/popup/b;->C:I

    const/high16 v0, 0x1040000

    .line 22
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/popup/b;->s:Ljava/lang/CharSequence;

    const v0, 0x104000a

    .line 23
    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->t:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public D()Landroid/widget/TextView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    const-string v1, "please call show at first"

    .line 2
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public E()Landroid/widget/TextView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    const-string v1, "please call show at first"

    .line 2
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public F()Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    const-string v1, "please call show at first"

    .line 2
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract G()Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation
.end method

.method protected H()Landroid/view/View;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->I:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected I()Landroid/view/View;
    .locals 11
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->G:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    iget v2, p0, Lcom/join/mgps/customview/popup/b;->n:I

    int-to-float v2, v2

    invoke-static {v1, v2}, La2/a;->H(Landroid/content/Context;F)I

    move-result v1

    .line 4
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    iget v1, p0, Lcom/join/mgps/customview/popup/b;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    const/16 v1, 0x10

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 7
    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    .line 8
    iget-boolean v2, p0, Lcom/join/mgps/customview/popup/b;->r:Z

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x9

    .line 10
    invoke-virtual {v1, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v5, 0xf

    .line 11
    invoke-virtual {v1, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 12
    iget-object v6, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    const/16 v6, 0x11

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    iget v7, p0, Lcom/join/mgps/customview/popup/b;->o:I

    int-to-float v7, v7

    invoke-static {v1, v7}, La2/a;->H(Landroid/content/Context;F)I

    move-result v1

    .line 16
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    invoke-virtual {v7, v1, v4, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 17
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->s:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 18
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    iget-object v8, p0, Lcom/join/mgps/customview/popup/b;->s:Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    :cond_2
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    iget v8, p0, Lcom/join/mgps/customview/popup/b;->v:I

    iget v9, p0, Lcom/join/mgps/customview/popup/b;->y:I

    invoke-static {v8, v9}, La2/a;->n(II)Landroid/content/res/ColorStateList;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 20
    iget v7, p0, Lcom/join/mgps/customview/popup/b;->z:I

    if-eqz v7, :cond_3

    .line 21
    iget-object v8, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    int-to-float v7, v7

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 22
    :cond_3
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    new-instance v8, Lcom/join/mgps/customview/popup/b$a;

    invoke-direct {v8, p0}, Lcom/join/mgps/customview/popup/b$a;-><init>(Lcom/join/mgps/customview/popup/b;)V

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 24
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    if-nez v7, :cond_6

    .line 25
    new-instance v7, Landroid/widget/TextView;

    iget-object v8, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 26
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v8, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 27
    iget-object v9, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    iget v10, p0, Lcom/join/mgps/customview/popup/b;->o:I

    int-to-float v10, v10

    invoke-static {v9, v10}, La2/a;->H(Landroid/content/Context;F)I

    move-result v9

    .line 28
    iput v9, v8, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 29
    iput v9, v8, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    const/16 v9, 0xe

    .line 30
    invoke-virtual {v8, v9, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 31
    invoke-virtual {v8, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 32
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 34
    iget-object v8, p0, Lcom/join/mgps/customview/popup/b;->u:Ljava/lang/CharSequence;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 35
    iget-object v8, p0, Lcom/join/mgps/customview/popup/b;->u:Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    :cond_4
    iget v8, p0, Lcom/join/mgps/customview/popup/b;->x:I

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    iget v8, p0, Lcom/join/mgps/customview/popup/b;->B:I

    if-eqz v8, :cond_5

    int-to-float v8, v8

    .line 38
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 39
    :cond_5
    iput-object v7, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    .line 40
    :cond_6
    iget-object v7, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 41
    new-instance v7, Landroid/widget/TextView;

    iget-object v8, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v7, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v7, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    .line 42
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v7, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0xb

    .line 43
    invoke-virtual {v7, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 44
    invoke-virtual {v7, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 45
    iget-object v2, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    iget-object v2, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 47
    iget-object v2, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 48
    iget-object v2, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v4, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 49
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->t:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 50
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/customview/popup/b;->t:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    :cond_7
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    iget v2, p0, Lcom/join/mgps/customview/popup/b;->w:I

    iget v3, p0, Lcom/join/mgps/customview/popup/b;->y:I

    invoke-static {v2, v3}, La2/a;->n(II)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 52
    iget v1, p0, Lcom/join/mgps/customview/popup/b;->A:I

    if-eqz v1, :cond_8

    .line 53
    iget-object v2, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    int-to-float v1, v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 54
    :cond_8
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    new-instance v2, Lcom/join/mgps/customview/popup/b$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/customview/popup/b$b;-><init>(Lcom/join/mgps/customview/popup/b;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    iget-object v1, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method protected J()V
    .locals 0

    return-void
.end method

.method protected K()V
    .locals 0

    return-void
.end method

.method public L(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->C:I

    return-void
.end method

.method public M(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/popup/b;->N(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public N(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->s:Ljava/lang/CharSequence;

    :goto_0
    return-void
.end method

.method public O(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 3
    :cond_0
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->v:I

    :goto_0
    return-void
.end method

.method public P(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0xaL
            to = 0x28L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->z:I

    return-void
.end method

.method public Q(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->D:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 3
    :cond_1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popup/b;->r:Z

    :goto_1
    return-void
.end method

.method public R(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->p:I

    .line 2
    iput p2, p0, Lcom/join/mgps/customview/popup/b;->q:I

    return-void
.end method

.method public S(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->I:Landroid/view/View;

    return-void
.end method

.method public T(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->G:Landroid/view/View;

    return-void
.end method

.method public U(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->y:I

    return-void
.end method

.method public V(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/popup/b;->W(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public W(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->t:Ljava/lang/CharSequence;

    :goto_0
    return-void
.end method

.method public X(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->E:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 3
    :cond_0
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->w:I

    :goto_0
    return-void
.end method

.method public Y(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0xaL
            to = 0x28L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->A:I

    return-void
.end method

.method public Z(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/popup/b;->a0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a0(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->u:Ljava/lang/CharSequence;

    :goto_0
    return-void
.end method

.method public b0(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 2
    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 3
    :cond_0
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->x:I

    :goto_0
    return-void
.end method

.method public c0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0xaL
            to = 0x28L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->B:I

    return-void
.end method

.method public d0(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b;->F:Landroid/view/View;

    return-void
.end method

.method public e0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->m:I

    return-void
.end method

.method public f0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0xaL
            to = 0x50L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->n:I

    return-void
.end method

.method public g0(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->k:I

    return-void
.end method

.method public h0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->l:I

    return-void
.end method

.method public i0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popup/b;->j:Z

    return-void
.end method

.method protected final j()Landroid/view/View;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3
    iget v1, p0, Lcom/join/mgps/customview/popup/b;->C:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x11

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClipToPadding(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/b;->I()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 9
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 10
    :cond_0
    iget-boolean v3, p0, Lcom/join/mgps/customview/popup/b;->j:Z

    if-eqz v3, :cond_1

    .line 11
    new-instance v3, Landroid/view/View;

    iget-object v4, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 12
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    iget v5, p0, Lcom/join/mgps/customview/popup/b;->l:I

    invoke-direct {v4, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget v4, p0, Lcom/join/mgps/customview/popup/b;->k:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 14
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 15
    :cond_1
    iget-object v3, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    if-nez v3, :cond_2

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/b;->G()Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    .line 17
    :cond_2
    iget v3, p0, Lcom/join/mgps/customview/popup/b;->p:I

    if-lez v3, :cond_3

    .line 18
    iget-object v4, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    int-to-float v3, v3

    invoke-static {v4, v3}, La2/a;->H(Landroid/content/Context;F)I

    move-result v3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    .line 19
    :goto_0
    iget v4, p0, Lcom/join/mgps/customview/popup/b;->q:I

    if-lez v4, :cond_4

    .line 20
    iget-object v5, p0, Lcom/join/mgps/customview/popup/a;->b:Landroid/app/Activity;

    int-to-float v4, v4

    invoke-static {v5, v4}, La2/a;->H(Landroid/content/Context;F)I

    move-result v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    .line 21
    :goto_1
    iget-object v5, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    invoke-virtual {v5, v3, v4, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 22
    iget-object v3, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    if-eqz v3, :cond_5

    .line 23
    iget-object v4, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 24
    :cond_5
    iget-object v3, p0, Lcom/join/mgps/customview/popup/b;->H:Landroid/view/View;

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v4, v2, v1, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/customview/popup/b;->H()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_6
    return-object v0
.end method

.method public j0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popup/b;->o:I

    return-void
.end method
