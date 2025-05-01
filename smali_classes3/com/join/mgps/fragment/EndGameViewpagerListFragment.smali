.class public Lcom/join/mgps/fragment/EndGameViewpagerListFragment;
.super Landroidx/fragment/app/Fragment;
.source "EndGameViewpagerListFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0266
.end annotation


# instance fields
.field b:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/flyco/tablayout/SlidingTabLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field f:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private g:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string/jumbo v0, "\u63a8\u8350"

    const-string/jumbo v1, "\u70ed\u95e8\u6311\u6218"

    const-string/jumbo v2, "\u96be\u5ea6\u6311\u6218"

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->g:[Ljava/lang/String;

    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/fragment/EndGameViewpagerListFragment;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->Z(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method static synthetic W(Lcom/join/mgps/fragment/EndGameViewpagerListFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->a0(I)V

    return-void
.end method

.method private synthetic Z(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method private a0(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->c:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v0}, Lcom/flyco/tablayout/SlidingTabLayout;->getTabCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 2
    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->c:Lcom/flyco/tablayout/SlidingTabLayout;

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

    const/4 v4, 0x0

    if-ne v2, p1, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    .line 4
    :goto_2
    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method X()V
    .locals 9
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->g:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-static {}, Lcom/join/mgps/fragment/EndGameListFragment_;->A0()Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->c(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->e(I)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    const-string v6, ""

    invoke-virtual {v4, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->d(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    iget-object v7, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->f:Ljava/lang/String;

    invoke-virtual {v4, v7}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->b(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->a()Lcom/join/mgps/fragment/EndGameListFragment;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->g:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-static {}, Lcom/join/mgps/fragment/EndGameListFragment_;->A0()Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->c(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    const/4 v5, 0x3

    invoke-virtual {v4, v5}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->e(I)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->d(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    iget-object v7, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->f:Ljava/lang/String;

    invoke-virtual {v4, v7}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->b(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->a()Lcom/join/mgps/fragment/EndGameListFragment;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v1, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->g:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v2, v2, v4

    invoke-static {}, Lcom/join/mgps/fragment/EndGameListFragment_;->A0()Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v7

    iget-object v8, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->e:Ljava/lang/String;

    invoke-virtual {v7, v8}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->c(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v7

    invoke-virtual {v7, v4}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->e(I)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    invoke-virtual {v4, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->d(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    iget-object v6, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->f:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->b(Ljava/lang/String;)Lcom/join/mgps/fragment/EndGameListFragment_$m;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/fragment/EndGameListFragment_$m;->a()Lcom/join/mgps/fragment/EndGameListFragment;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->b:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v5}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->b:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->c:Lcom/flyco/tablayout/SlidingTabLayout;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->b:Landroidx/viewpager/widget/ViewPager;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->g:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/flyco/tablayout/SlidingTabLayout;->setViewPager(Landroidx/viewpager/widget/ViewPager;[Ljava/lang/String;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->b:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/fragment/EndGameViewpagerListFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment$a;-><init>(Lcom/join/mgps/fragment/EndGameViewpagerListFragment;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 9
    invoke-direct {p0, v3}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->a0(I)V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->b0()V

    return-void
.end method

.method public b0()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/activity/EndGameActivity_;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/EndGameActivity_;

    invoke-virtual {v0}, Lcom/join/mgps/activity/EndGameActivity;->v0()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v2, Lcom/join/mgps/fragment/t;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/fragment/t;-><init>(Lcom/join/mgps/fragment/EndGameViewpagerListFragment;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
