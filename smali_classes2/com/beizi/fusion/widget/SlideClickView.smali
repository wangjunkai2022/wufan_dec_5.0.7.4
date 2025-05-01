.class public Lcom/beizi/fusion/widget/SlideClickView;
.super Landroid/widget/LinearLayout;
.source "SlideClickView.java"


# instance fields
.field private a:Z

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:I

.field private h:Landroid/graphics/drawable/AnimationDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 11
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->a:Z

    const/16 v0, 0x2d

    .line 13
    iput v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->f:I

    .line 14
    iput v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->g:I

    .line 15
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/widget/SlideClickView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 7
    iput-boolean p2, p0, Lcom/beizi/fusion/widget/SlideClickView;->a:Z

    const/16 p2, 0x2d

    .line 8
    iput p2, p0, Lcom/beizi/fusion/widget/SlideClickView;->f:I

    .line 9
    iput p2, p0, Lcom/beizi/fusion/widget/SlideClickView;->g:I

    .line 10
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/widget/SlideClickView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Lcom/beizi/fusion/widget/SlideClickView;->a:Z

    const/16 p2, 0x2d

    .line 3
    iput p2, p0, Lcom/beizi/fusion/widget/SlideClickView;->f:I

    .line 4
    iput p2, p0, Lcom/beizi/fusion/widget/SlideClickView;->g:I

    .line 5
    invoke-virtual {p0, p1}, Lcom/beizi/fusion/widget/SlideClickView;->init(Landroid/content/Context;)V

    return-void
.end method

.method private a()V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    iput-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    .line 2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/beizi/fusion/R$drawable;->slide_down_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/16 v2, 0x258

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/beizi/fusion/R$drawable;->slide_down_two:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v3, Lcom/beizi/fusion/R$drawable;->slide_down_three:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->b:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public init(Landroid/content/Context;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->a:Z

    .line 3
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    const/16 v2, 0x11

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 5
    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/widget/SlideClickView;->b:Landroid/widget/ImageView;

    .line 6
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 7
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 9
    invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    invoke-virtual {p0, v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->b:Landroid/widget/ImageView;

    invoke-virtual {p0, p1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    invoke-direct {p0}, Lcom/beizi/fusion/widget/SlideClickView;->a()V

    return-void
.end method

.method public setImageWidthAndHeight(II)V
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->b:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public setTitleFont(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->e:I

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    int-to-float p1, p1

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_0
    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->d:Ljava/lang/String;

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    const-string v0, "#FFFFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/widget/SlideClickView;->c:Landroid/widget/TextView;

    const/high16 v0, 0x40a00000    # 5.0f

    const-string v1, "#80000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    :cond_0
    return-void
.end method

.method public startAnim()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    :cond_0
    return-void
.end method

.method public stopAnim()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/SlideClickView;->h:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    :cond_0
    return-void
.end method
