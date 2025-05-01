.class public Lcom/join/mgps/customview/SlidingTabForumLayout;
.super Lcom/join/mgps/customview/SlidingTabLayout1;
.source "SlidingTabForumLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;,
        Lcom/join/mgps/customview/SlidingTabForumLayout$f;,
        Lcom/join/mgps/customview/SlidingTabForumLayout$e;
    }
.end annotation


# instance fields
.field private K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumTabBean;",
            ">;"
        }
    .end annotation
.end field

.field private L:Lcom/join/mgps/customview/SlidingTabForumLayout$e;

.field private M:Landroid/os/Handler;

.field private N:Lcom/join/mgps/customview/SlidingTabForumLayout$f;

.field private O:I

.field private P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

.field private Q:I

.field private R:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/SlidingTabLayout1;-><init>(Landroid/content/Context;)V

    const v0, -0x98967f

    .line 2
    iput v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->O:I

    .line 3
    sget-object v0, Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;->IDLE:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    iput-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    const/16 v0, 0x32

    .line 4
    iput v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->Q:I

    .line 5
    new-instance v0, Lcom/join/mgps/customview/SlidingTabForumLayout$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/SlidingTabForumLayout$d;-><init>(Lcom/join/mgps/customview/SlidingTabForumLayout;)V

    iput-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->R:Ljava/lang/Runnable;

    .line 6
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/SlidingTabForumLayout;->s(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/customview/SlidingTabLayout1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const p2, -0x98967f

    .line 8
    iput p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->O:I

    .line 9
    sget-object p2, Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;->IDLE:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    iput-object p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    const/16 p2, 0x32

    .line 10
    iput p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->Q:I

    .line 11
    new-instance p2, Lcom/join/mgps/customview/SlidingTabForumLayout$d;

    invoke-direct {p2, p0}, Lcom/join/mgps/customview/SlidingTabForumLayout$d;-><init>(Lcom/join/mgps/customview/SlidingTabForumLayout;)V

    iput-object p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->R:Ljava/lang/Runnable;

    .line 12
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/SlidingTabForumLayout;->s(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/customview/SlidingTabLayout1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p2, -0x98967f

    .line 14
    iput p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->O:I

    .line 15
    sget-object p2, Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;->IDLE:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    iput-object p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    const/16 p2, 0x32

    .line 16
    iput p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->Q:I

    .line 17
    new-instance p2, Lcom/join/mgps/customview/SlidingTabForumLayout$d;

    invoke-direct {p2, p0}, Lcom/join/mgps/customview/SlidingTabForumLayout$d;-><init>(Lcom/join/mgps/customview/SlidingTabForumLayout;)V

    iput-object p2, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->R:Ljava/lang/Runnable;

    .line 18
    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/SlidingTabForumLayout;->s(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic j(Lcom/join/mgps/customview/SlidingTabForumLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->t()V

    return-void
.end method

.method static synthetic k(Lcom/join/mgps/customview/SlidingTabForumLayout;)Lcom/join/mgps/customview/SlidingTabForumLayout$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->L:Lcom/join/mgps/customview/SlidingTabForumLayout$e;

    return-object p0
.end method

.method static synthetic l(Lcom/join/mgps/customview/SlidingTabForumLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->O:I

    return p0
.end method

.method static synthetic m(Lcom/join/mgps/customview/SlidingTabForumLayout;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->O:I

    return p1
.end method

.method static synthetic n(Lcom/join/mgps/customview/SlidingTabForumLayout;)Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    return-object p0
.end method

.method static synthetic o(Lcom/join/mgps/customview/SlidingTabForumLayout;Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;)Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    return-object p1
.end method

.method static synthetic p(Lcom/join/mgps/customview/SlidingTabForumLayout;)Lcom/join/mgps/customview/SlidingTabForumLayout$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->N:Lcom/join/mgps/customview/SlidingTabForumLayout$f;

    return-object p0
.end method

.method static synthetic q(Lcom/join/mgps/customview/SlidingTabForumLayout;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->M:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic r(Lcom/join/mgps/customview/SlidingTabForumLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->Q:I

    return p0
.end method

.method private t()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->L:Lcom/join/mgps/customview/SlidingTabForumLayout$e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->getCurrentPosition()I

    move-result v1

    invoke-virtual {p0}, Lcom/join/mgps/customview/SlidingTabLayout1;->getScrollOffset()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v3

    invoke-interface {v0, v1, v2, v3}, Lcom/join/mgps/customview/SlidingTabForumLayout$e;->a(III)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected b(II)V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->c(ILandroid/view/View;)V

    return-void
.end method

.method protected c(ILandroid/view/View;)V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 2
    new-instance v0, Lcom/join/mgps/customview/SlidingTabForumLayout$c;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/customview/SlidingTabForumLayout$c;-><init>(Lcom/join/mgps/customview/SlidingTabForumLayout;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    iget v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->w:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->f:Landroid/widget/LinearLayout;

    iget-boolean v1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->p:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->c:Landroid/widget/LinearLayout$LayoutParams;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->b:Landroid/widget/LinearLayout$LayoutParams;

    :goto_0
    invoke-virtual {v0, p2, p1, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected d(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p2, 0x11

    .line 3
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setGravity(I)V

    .line 4
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->c(ILandroid/view/View;)V

    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->K:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->h:I

    .line 3
    :goto_1
    iget v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->h:I

    if-ge v1, v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->K:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumBean$ForumTabBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumBean$ForumTabBean;->getTab_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->d(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/customview/SlidingTabLayout1;->i()V

    .line 6
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/customview/SlidingTabForumLayout$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/customview/SlidingTabForumLayout$b;-><init>(Lcom/join/mgps/customview/SlidingTabForumLayout;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public getCurrentPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->i:I

    return v0
.end method

.method public h(II)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->i:I

    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->j:F

    .line 3
    iget-object p2, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->f:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget p1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->i:I

    iget p2, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->j:F

    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float p2, p2, v0

    float-to-int p2, p2

    invoke-super {p0, p1, p2}, Lcom/join/mgps/customview/SlidingTabLayout1;->h(II)V

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->t()V

    .line 6
    invoke-virtual {p0}, Landroid/widget/HorizontalScrollView;->invalidate()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;->TOUCH_SCROLL:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    iput-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->P:Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->N:Lcom/join/mgps/customview/SlidingTabForumLayout$f;

    if-eqz v1, :cond_1

    .line 4
    invoke-interface {v1, v0}, Lcom/join/mgps/customview/SlidingTabForumLayout$f;->a(Lcom/join/mgps/customview/SlidingTabForumLayout$ScrollType;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->M:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 6
    iget-object v1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->R:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->M:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 8
    iget-object v1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->R:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    :cond_3
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method s(Landroid/content/Context;)V
    .locals 0

    const p1, -0xb8b00

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->m:I

    .line 2
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/SlidingTabForumLayout;->setHandler(Landroid/os/Handler;)V

    .line 3
    new-instance p1, Lcom/join/mgps/customview/SlidingTabForumLayout$a;

    invoke-direct {p1, p0}, Lcom/join/mgps/customview/SlidingTabForumLayout$a;-><init>(Lcom/join/mgps/customview/SlidingTabForumLayout;)V

    invoke-virtual {p0, p1}, Lcom/join/mgps/customview/SlidingTabForumLayout;->setOnScrollStateChangedListener(Lcom/join/mgps/customview/SlidingTabForumLayout$f;)V

    return-void
.end method

.method public setCurrentPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->i:I

    return-void
.end method

.method public setHandler(Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->M:Landroid/os/Handler;

    return-void
.end method

.method public setItem(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumTabBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->K:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->K:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->K:Ljava/util/List;

    :cond_1
    if-eqz p1, :cond_3

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->K:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/customview/SlidingTabForumLayout;->g()V

    :cond_3
    :goto_0
    return-void
.end method

.method public setOnForumSlidingTabListener(Lcom/join/mgps/customview/SlidingTabForumLayout$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->L:Lcom/join/mgps/customview/SlidingTabForumLayout$e;

    return-void
.end method

.method public setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/SlidingTabLayout1;->e:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    return-void
.end method

.method public setOnScrollStateChangedListener(Lcom/join/mgps/customview/SlidingTabForumLayout$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/SlidingTabForumLayout;->N:Lcom/join/mgps/customview/SlidingTabForumLayout$f;

    return-void
.end method
