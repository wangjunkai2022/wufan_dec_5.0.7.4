.class public Lcom/join/mgps/customview/popwindow/view/PopWindowView;
.super Landroid/widget/RelativeLayout;
.source "PopWindowView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;,
        Lcom/join/mgps/customview/popwindow/view/PopWindowView$b;
    }
.end annotation


# static fields
.field public static t:I = 0x70000000

.field public static u:I = 0xa

.field public static v:I

.field public static w:I


# instance fields
.field b:Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;

.field private c:I

.field private d:Z

.field private e:Lcom/join/mgps/customview/popwindow/shape/a;

.field private f:Ly1/a;

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Bitmap;

.field private i:Landroid/graphics/Canvas;

.field private j:I

.field private k:I

.field private l:I

.field private m:Landroid/view/View;

.field private n:I

.field private o:I

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->s:Z

    .line 3
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->q(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->s:Z

    .line 6
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->q(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 8
    iput-boolean p2, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->s:Z

    .line 9
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->q(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Lcom/join/mgps/customview/popwindow/shape/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->e:Lcom/join/mgps/customview/popwindow/shape/a;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->q:Z

    return p0
.end method

.method static synthetic c(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->j:I

    return p0
.end method

.method static synthetic d(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->k:I

    return p0
.end method

.method static synthetic e(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->l:I

    return p0
.end method

.method static synthetic f(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->t(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic g(Lcom/join/mgps/customview/popwindow/view/PopWindowView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setMaskColor(I)V

    return-void
.end method

.method static synthetic h(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Ly1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setTarget(Ly1/a;)V

    return-void
.end method

.method static synthetic i(Lcom/join/mgps/customview/popwindow/view/PopWindowView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setPadding(I)V

    return-void
.end method

.method static synthetic j(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setDismissOnTouch(Z)V

    return-void
.end method

.method static synthetic k(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->s:Z

    return p0
.end method

.method static synthetic l(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->s:Z

    return p1
.end method

.method static synthetic m(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Lcom/join/mgps/customview/popwindow/shape/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setShape(Lcom/join/mgps/customview/popwindow/shape/a;)V

    return-void
.end method

.method static synthetic n(Lcom/join/mgps/customview/popwindow/view/PopWindowView;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setPerformClick(Z)V

    return-void
.end method

.method static synthetic o(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)Ly1/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    return-object p0
.end method

.method private q(Landroid/content/Context;)V
    .locals 2

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->setWillNotDraw(Z)V

    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    sget v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->t:I

    iput v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->c:I

    .line 4
    sget v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->u:I

    iput v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->j:I

    .line 5
    sget v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->v:I

    iput v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->k:I

    .line 6
    sget v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->w:I

    iput v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->l:I

    .line 7
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->d:Z

    .line 8
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p:Z

    .line 9
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->q:Z

    .line 10
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->r:Z

    .line 11
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->g:Landroid/graphics/Paint;

    const/4 v0, -0x1

    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->g:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 14
    iget-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->g:Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V

    .line 15
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$a;-><init>(Lcom/join/mgps/customview/popwindow/view/PopWindowView;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private r()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static s(Landroid/view/View;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_0
    return-void
.end method

.method private setDismissOnTouch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p:Z

    return-void
.end method

.method private setMaskColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->c:I

    return-void
.end method

.method private setPadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->j:I

    return-void
.end method

.method private setPerformClick(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->r:Z

    return-void
.end method

.method private setReady(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->d:Z

    return-void
.end method

.method private setShape(Lcom/join/mgps/customview/popwindow/shape/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->e:Lcom/join/mgps/customview/popwindow/shape/a;

    return-void
.end method

.method private setTarget(Ly1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    return-void
.end method

.method private t(Landroid/app/Activity;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->m:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {v0}, Ly1/a;->b()Landroid/graphics/Rect;

    move-result-object v0

    .line 3
    new-instance v2, Landroidx/cardview/widget/CardView;

    invoke-direct {v2, p1}, Landroidx/cardview/widget/CardView;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v2, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    const/4 v3, 0x0

    .line 5
    invoke-virtual {v2, v3}, Landroidx/cardview/widget/CardView;->setCardElevation(F)V

    .line 6
    iget v3, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->k:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    .line 7
    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v4

    iget-object v5, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {v5}, Ly1/a;->getHeight()I

    move-result v5

    iget v6, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->l:I

    add-int/2addr v5, v6

    invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 8
    iget v4, v0, Landroid/graphics/Rect;->left:I

    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 9
    iget v5, v0, Landroid/graphics/Rect;->top:I

    iput v5, v3, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 10
    iput v4, v3, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 11
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    iget-object v5, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {v5}, Ly1/a;->getHeight()I

    move-result v5

    iget v6, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->l:I

    add-int/2addr v5, v6

    invoke-direct {v4, v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {v0}, Ly1/a;->getHeight()I

    move-result v0

    iput v0, v4, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 13
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->m:Landroid/view/View;

    invoke-virtual {v2, v0, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    invoke-virtual {p0, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->setReady(Z)V

    .line 17
    invoke-virtual {p0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->d:Z

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    if-nez p1, :cond_2

    .line 4
    :cond_1
    iget v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->n:I

    iget v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->o:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->h:Landroid/graphics/Bitmap;

    .line 5
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->h:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i:Landroid/graphics/Canvas;

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i:Landroid/graphics/Canvas;

    iget v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->e:Lcom/join/mgps/customview/popwindow/shape/a;

    iget-object v1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i:Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->g:Landroid/graphics/Paint;

    iget v3, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->j:I

    iget v4, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->k:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/join/mgps/customview/popwindow/shape/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->h:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->n:I

    .line 3
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result p1

    iput p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->o:I

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->e:Lcom/join/mgps/customview/popwindow/shape/a;

    float-to-double v3, v0

    float-to-double v0, v1

    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/join/mgps/customview/popwindow/shape/a;->d(DD)Z

    move-result v0

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_0

    .line 5
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    if-nez v0, :cond_1

    .line 6
    iget-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p:Z

    if-eqz p1, :cond_2

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->p()V

    :cond_2
    if-eqz v0, :cond_3

    .line 8
    iget-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->r:Z

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {p1}, Ly1/a;->getView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setPressed(Z)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {p1}, Ly1/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_3
    return v2

    :cond_4
    if-eqz v0, :cond_5

    .line 11
    iget-boolean p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->r:Z

    if-eqz p1, :cond_5

    .line 12
    iget-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {p1}, Ly1/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->f:Ly1/a;

    invoke-interface {p1}, Ly1/a;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return v2
.end method

.method public p()V
    .locals 1

    const/16 v0, 0x8

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->r()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i:Landroid/graphics/Canvas;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->i:Landroid/graphics/Canvas;

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;

    if-eqz v0, :cond_2

    .line 7
    invoke-interface {v0}, Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;->onDismiss()V

    :cond_2
    return-void
.end method

.method public setDropDownHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->l:I

    return-void
.end method

.method public setDropDownView(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->m:Landroid/view/View;

    return-void
.end method

.method public setOnDismissListener(Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->b:Lcom/join/mgps/customview/popwindow/view/PopWindowView$c;

    return-void
.end method

.method public setRadius(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/popwindow/view/PopWindowView;->k:I

    return-void
.end method
