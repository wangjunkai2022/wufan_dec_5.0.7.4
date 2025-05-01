.class Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "ViewPagerWithADs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/ViewPagerWithADs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyViewPager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$MyScaleInTransformer;,
        Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$d;,
        Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;,
        Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$c;,
        Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I

.field private f:I

.field private g:Landroidx/viewpager/widget/PagerAdapter;

.field private h:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;

.field private i:Landroid/os/Handler;

.field final synthetic j:Lcom/join/mgps/customview/ViewPagerWithADs;


# direct methods
.method public constructor <init>(Lcom/join/mgps/customview/ViewPagerWithADs;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j:Lcom/join/mgps/customview/ViewPagerWithADs;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x64

    .line 3
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    const/16 p1, 0xf

    .line 4
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->e:I

    const/16 p1, 0xfa0

    .line 5
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->f:I

    .line 6
    new-instance p1, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;

    invoke-direct {p1, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->h:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;

    .line 7
    new-instance p1, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;

    invoke-direct {p1, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->i:Landroid/os/Handler;

    .line 8
    iput-object p2, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->b:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/customview/ViewPagerWithADs;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j:Lcom/join/mgps/customview/ViewPagerWithADs;

    .line 10
    invoke-direct {p0, p2, p3}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x64

    .line 11
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    const/16 p1, 0xf

    .line 12
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->e:I

    const/16 p1, 0xfa0

    .line 13
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->f:I

    .line 14
    new-instance p1, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;

    invoke-direct {p1, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->h:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;

    .line 15
    new-instance p1, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;

    invoke-direct {p1, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->i:Landroid/os/Handler;

    .line 16
    iput-object p2, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->b:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    return p0
.end method

.method static synthetic b(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    return p1
.end method

.method static synthetic c(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    return v0
.end method

.method static synthetic d(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->i:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->b:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->c:Ljava/util/List;

    return-object p0
.end method

.method private g()V
    .locals 2

    const/16 v0, 0x2710

    .line 1
    iput v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    .line 2
    iget v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->e:I

    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->setPageMargin(I)V

    const/4 v0, 0x3

    .line 3
    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j()V

    .line 5
    new-instance v0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$MyScaleInTransformer;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$MyScaleInTransformer;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroidx/viewpager/widget/ViewPager;->setPageTransformer(ZLandroidx/viewpager/widget/ViewPager$PageTransformer;)V

    .line 6
    new-instance v0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$d;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 7
    new-instance v0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public h(Landroid/view/View;I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$b;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$b;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public i(Landroid/content/Context;Ljava/util/List;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->b:Landroid/content/Context;

    .line 2
    iput p3, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->e:I

    .line 3
    iput-object p2, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->c:Ljava/util/List;

    .line 4
    iput p4, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->f:I

    .line 5
    invoke-direct {p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->g()V

    return-void
.end method

.method public j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->g:Landroidx/viewpager/widget/PagerAdapter;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j:Lcom/join/mgps/customview/ViewPagerWithADs;

    invoke-static {v0}, Lcom/join/mgps/customview/ViewPagerWithADs;->a(Lcom/join/mgps/customview/ViewPagerWithADs;)Landroidx/viewpager/widget/PagerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j:Lcom/join/mgps/customview/ViewPagerWithADs;

    invoke-static {v0}, Lcom/join/mgps/customview/ViewPagerWithADs;->a(Lcom/join/mgps/customview/ViewPagerWithADs;)Landroidx/viewpager/widget/PagerAdapter;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->g:Landroidx/viewpager/widget/PagerAdapter;

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$c;-><init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V

    iput-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->g:Landroidx/viewpager/widget/PagerAdapter;

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->g:Landroidx/viewpager/widget/PagerAdapter;

    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 6
    iget v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d:I

    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->h:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$e;

    iget v2, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->f:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method
