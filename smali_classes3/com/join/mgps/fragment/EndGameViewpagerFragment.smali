.class public Lcom/join/mgps/fragment/EndGameViewpagerFragment;
.super Landroidx/fragment/app/Fragment;
.source "EndGameViewpagerFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0265
.end annotation


# instance fields
.field b:Lcom/flyco/tablayout/SlidingTabLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field e:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private f:[Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string/jumbo v0, "\u96be\u5ea6"

    const-string/jumbo v1, "\u70ed\u5ea6"

    .line 2
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->f:[Ljava/lang/String;

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/EndGameViewpagerFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->X(I)V

    return-void
.end method

.method private X(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->b:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v0}, Lcom/flyco/tablayout/SlidingTabLayout;->getTabCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 2
    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->b:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v3, v2}, Lcom/flyco/tablayout/SlidingTabLayout;->j(I)Landroid/widget/TextView;

    move-result-object v3

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    if-ne v2, p1, :cond_0

    const v5, 0x7f071279

    goto :goto_1

    :cond_0
    const v5, 0x7f07124c

    :goto_1
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v1, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    if-ne v2, p1, :cond_1

    const-string v4, "sans-serif-medium"

    goto :goto_2

    :cond_1
    const-string v4, "sans-serif"

    .line 4
    :goto_2
    invoke-static {v4, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method W()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->e:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getEndgame_challenge_level()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->e:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getEndgame_challenge_level()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->g:Ljava/lang/String;

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 5
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->f:[Ljava/lang/String;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    .line 6
    new-instance v4, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    aget-object v3, v3, v2

    invoke-static {}, Lcom/join/mgps/fragment/EndGameListFragment_;->A0()Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v5

    iget-object v6, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->d:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->c(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v5

    add-int/lit8 v6, v2, 0x2

    invoke-virtual {v5, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->e(I)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v5

    iget-object v6, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->g:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->d(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->a()Lcom/join/mgps/fragment/EndGameListFragment;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->c:Landroidx/viewpager/widget/ViewPager;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 8
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->c:Landroidx/viewpager/widget/ViewPager;

    new-instance v3, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    invoke-virtual {v2, v3}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->b:Lcom/flyco/tablayout/SlidingTabLayout;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->c:Landroidx/viewpager/widget/ViewPager;

    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->f:[Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lcom/flyco/tablayout/SlidingTabLayout;->setViewPager(Landroidx/viewpager/widget/ViewPager;[Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->c:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/join/mgps/fragment/EndGameViewpagerFragment$a;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/EndGameViewpagerFragment$a;-><init>(Lcom/join/mgps/fragment/EndGameViewpagerFragment;)V

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 11
    invoke-direct {p0, v1}, Lcom/join/mgps/fragment/EndGameViewpagerFragment;->X(I)V

    return-void
.end method
