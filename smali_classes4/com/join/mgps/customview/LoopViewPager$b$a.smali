.class Lcom/join/mgps/customview/LoopViewPager$b$a;
.super Ljava/lang/Object;
.source "LoopViewPager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/LoopViewPager$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/LoopViewPager$b;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/LoopViewPager$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v0, v0, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LoopViewPager;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v1, v1, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LoopViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v0, v0, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/customview/LoopViewPager;->setCurrentItem(IZ)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v0, v0, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LoopViewPager;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v1, v1, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LoopViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->getCount()I

    move-result v1

    sub-int/2addr v1, v4

    if-lt v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v0, v0, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/customview/LoopViewPager;->setCurrentItem(IZ)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/customview/LoopViewPager$b$a;->b:Lcom/join/mgps/customview/LoopViewPager$b;

    iget-object v0, v0, Lcom/join/mgps/customview/LoopViewPager$b;->b:Lcom/join/mgps/customview/LoopViewPager;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LoopViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LoopViewPager;->setCurrentItem(I)V

    :goto_0
    return-void
.end method
