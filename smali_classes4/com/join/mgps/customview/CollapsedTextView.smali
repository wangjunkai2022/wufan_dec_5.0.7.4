.class public Lcom/join/mgps/customview/CollapsedTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "CollapsedTextView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/CollapsedTextView$b;,
        Lcom/join/mgps/customview/CollapsedTextView$TipsGravityMode;
    }
.end annotation


# static fields
.field private static final q:Ljava/lang/String; = "..."

.field public static final r:I = 0x4

.field private static final s:Ljava/lang/String; = "\u5c55\u5f00\u5168\u6587"

.field private static final t:Ljava/lang/String; = "\u6536\u8d77\u5168\u6587"

.field public static final u:I = 0x0

.field public static final v:I = 0x1


# instance fields
.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Ljava/lang/CharSequence;

.field private h:I

.field private i:Z

.field private j:I

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Lcom/join/mgps/customview/CollapsedTextView$b;

.field private o:Landroid/view/View$OnClickListener;

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/customview/CollapsedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/join/mgps/customview/CollapsedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Lcom/join/mgps/customview/CollapsedTextView$b;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lcom/join/mgps/customview/CollapsedTextView$b;-><init>(Lcom/join/mgps/customview/CollapsedTextView;Lcom/join/mgps/customview/CollapsedTextView$a;)V

    iput-object p3, p0, Lcom/join/mgps/customview/CollapsedTextView;->n:Lcom/join/mgps/customview/CollapsedTextView$b;

    const/4 p3, 0x1

    .line 5
    iput-boolean p3, p0, Lcom/join/mgps/customview/CollapsedTextView;->p:Z

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/CollapsedTextView;->l(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/customview/CollapsedTextView;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->h:I

    return p1
.end method

.method static synthetic b(Lcom/join/mgps/customview/CollapsedTextView;Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/CollapsedTextView;->j(Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V

    return-void
.end method

.method static synthetic c(Lcom/join/mgps/customview/CollapsedTextView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/CollapsedTextView;->m:Z

    return p0
.end method

.method static synthetic d(Lcom/join/mgps/customview/CollapsedTextView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->p:Z

    return p1
.end method

.method static synthetic e(Lcom/join/mgps/customview/CollapsedTextView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/CollapsedTextView;->i:Z

    return p0
.end method

.method static synthetic f(Lcom/join/mgps/customview/CollapsedTextView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->i:Z

    return p1
.end method

.method static synthetic g(Lcom/join/mgps/customview/CollapsedTextView;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/customview/CollapsedTextView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/CollapsedTextView;->k:I

    return p0
.end method

.method static synthetic i(Lcom/join/mgps/customview/CollapsedTextView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/CollapsedTextView;->l:Z

    return p0
.end method

.method private j(Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V
    .locals 9

    .line 1
    invoke-static {p2}, Lcom/join/mgps/Util/n;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    iput-object p2, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    invoke-super {p0, p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p2

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    .line 7
    invoke-virtual {p2}, Landroid/text/Layout;->getLineCount()I

    move-result v1

    .line 8
    iget v2, p0, Lcom/join/mgps/customview/CollapsedTextView;->b:I

    if-gt v1, v2, :cond_2

    .line 9
    iget-object p2, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    invoke-super {p0, p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    goto :goto_2

    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 10
    invoke-virtual {p2, v2}, Landroid/text/Layout;->getLineStart(I)I

    move-result v2

    .line 11
    iget v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->b:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineVisibleEnd(I)I

    move-result v7

    .line 12
    iget-object v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->e:Landroid/graphics/drawable/Drawable;

    const/4 v8, 0x0

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v3, p0, Lcom/join/mgps/customview/CollapsedTextView;->j:I

    const-string v4, "... "

    if-nez v3, :cond_4

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/join/mgps/customview/CollapsedTextView;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v3, v1

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {v0, v4}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v1

    float-to-int v3, v1

    .line 17
    :goto_1
    iget v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->b:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineWidth(I)F

    move-result p2

    int-to-float v5, v3

    add-float/2addr p2, v5

    .line 18
    iget v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->h:I

    int-to-float v1, v1

    cmpl-float p2, p2, v1

    if-lez p2, :cond_5

    .line 19
    iget-object v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move v3, v7

    invoke-virtual/range {v0 .. v6}, Landroid/text/TextPaint;->breakText(Ljava/lang/CharSequence;IIZF[F)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    sub-int/2addr v7, p2

    .line 20
    :cond_5
    new-instance p2, Landroid/text/SpannableStringBuilder;

    invoke-direct {p2}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    invoke-interface {v0, v8, v7}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    .line 22
    invoke-virtual {p2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    const-string v0, "..."

    .line 23
    invoke-virtual {p2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 24
    invoke-direct {p0, p2}, Lcom/join/mgps/customview/CollapsedTextView;->setSpan(Landroid/text/SpannableStringBuilder;)V

    .line 25
    invoke-super {p0, p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    :goto_2
    return-void
.end method

.method private k(Landroid/widget/TextView$BufferType;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    iget-object v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 2
    invoke-direct {p0, v0}, Lcom/join/mgps/customview/CollapsedTextView;->setSpan(Landroid/text/SpannableStringBuilder;)V

    .line 3
    invoke-super {p0, v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    return-void
.end method

.method private l(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 1
    sget-object v0, Lcom/join/android/app/mgsim/wufun/R$styleable;->CollapsedTextView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->b:I

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/CollapsedTextView;->setExpandedText(Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/CollapsedTextView;->setCollapsedText(Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/customview/CollapsedTextView;->setExpandedDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/join/mgps/customview/CollapsedTextView;->setCollapsedDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x7

    .line 7
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->j:I

    const/4 v1, 0x6

    .line 8
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->k:I

    const/16 v1, 0x8

    .line 9
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->l:Z

    const/4 v0, 0x5

    .line 10
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/join/mgps/customview/CollapsedTextView;->m:Z

    .line 11
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void
.end method

.method private setSpan(Landroid/text/SpannableStringBuilder;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->j:I

    const-string v1, " "

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "\n"

    .line 3
    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 4
    :goto_0
    iget-boolean v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->i:Z

    if-eqz v0, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 6
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071220

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-static {v2}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    iget-object v4, p0, Lcom/join/mgps/customview/CollapsedTextView;->c:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v2, v4

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const/16 v5, 0x11

    invoke-virtual {p1, v0, v2, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->e:Landroid/graphics/drawable/Drawable;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/customview/CollapsedTextView;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    .line 9
    iget-object v4, p0, Lcom/join/mgps/customview/CollapsedTextView;->n:Lcom/join/mgps/customview/CollapsedTextView$b;

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    sub-int/2addr v6, v2

    add-int/lit8 v6, v6, 0x2

    .line 10
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    .line 11
    invoke-virtual {p1, v4, v6, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p1, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 13
    new-instance v2, Landroid/text/style/ImageSpan;

    invoke-direct {v2, v0, v3}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;I)V

    .line 14
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    .line 15
    invoke-virtual {p1, v2, v0, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 16
    invoke-virtual {p1, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->p:Z

    if-nez v0, :cond_0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->p:Z

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->o:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setCollapsedDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/CollapsedTextView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setCollapsedDrawableRes(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/CollapsedTextView;->setCollapsedDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCollapsedLines(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->b:I

    return-void
.end method

.method public setCollapsedText(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "\u6536\u8d77\u5168\u6587"

    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->d:Ljava/lang/String;

    return-void
.end method

.method public setExpandedDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->e:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    const/4 v2, 0x5

    add-int/2addr v1, v2

    iget-object v3, p0, Lcom/join/mgps/customview/CollapsedTextView;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setExpandedDrawableRes(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/CollapsedTextView;->setExpandedDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setExpandedText(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "\u5c55\u5f00\u5168\u6587"

    :cond_0
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->c:Ljava/lang/String;

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->o:Landroid/view/View$OnClickListener;

    .line 2
    invoke-super {p0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->b:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->i:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-static {p1}, Lcom/join/mgps/Util/n;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->g:Ljava/lang/CharSequence;

    .line 4
    invoke-direct {p0, p2}, Lcom/join/mgps/customview/CollapsedTextView;->k(Landroid/widget/TextView$BufferType;)V

    goto :goto_1

    .line 5
    :cond_1
    iget v0, p0, Lcom/join/mgps/customview/CollapsedTextView;->h:I

    if-nez v0, :cond_2

    .line 6
    invoke-virtual {p0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/customview/CollapsedTextView$a;

    invoke-direct {v1, p0, p2, p1}, Lcom/join/mgps/customview/CollapsedTextView$a;-><init>(Lcom/join/mgps/customview/CollapsedTextView;Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 7
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-direct {p0, p2, p1}, Lcom/join/mgps/customview/CollapsedTextView;->j(Landroid/widget/TextView$BufferType;Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 9
    :cond_3
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    :goto_1
    return-void
.end method

.method public setTipsClickable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->m:Z

    return-void
.end method

.method public setTipsColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->k:I

    return-void
.end method

.method public setTipsGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->j:I

    return-void
.end method

.method public setTipsUnderline(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/CollapsedTextView;->l:Z

    return-void
.end method
