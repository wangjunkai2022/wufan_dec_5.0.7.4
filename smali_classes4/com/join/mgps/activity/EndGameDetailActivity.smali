.class public Lcom/join/mgps/activity/EndGameDetailActivity;
.super Lcom/BaseAppCompatActivity;
.source "EndGameDetailActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c003f
.end annotation


# instance fields
.field A:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field B:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field C:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field D:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field E:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private F:Lcom/join/mgps/rpc/k;

.field G:Ljava/lang/String;

.field private H:Lcom/join/mgps/dto/EndGameDetailBean;

.field private I:Lcom/join/mgps/dialog/m0;

.field private J:Z

.field private K:Z

.field private L:Z

.field b:Lcom/google/android/material/appbar/AppBarLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/google/android/material/appbar/CollapsingToolbarLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/join/android/app/component/video/StandardVideoView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Lcom/flyco/tablayout/SlidingTabLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field q:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field r:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field s:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field t:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field u:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field v:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field w:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field x:Landroidx/coordinatorlayout/widget/CoordinatorLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field y:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field z:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const-string v0, "EndGameDetailActivity"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->G:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->K:Z

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->L:Z

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/activity/EndGameDetailActivity;ILcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/EndGameDetailActivity;->q0(ILcom/google/android/material/appbar/AppBarLayout;I)V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/EndGameDetailActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->r0(I)V

    return-void
.end method

.method private getStatusBarHeight(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    const-string v2, "dimen"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private k0(I)Ljava/lang/String;
    .locals 5

    int-to-float p1, p1

    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr p1, v0

    const-string v0, "\u79d2"

    const/high16 v1, 0x42700000    # 60.0f

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "0.00"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    float-to-double v3, p1

    invoke-virtual {v2, v3, v4}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    float-to-int p1, p1

    .line 2
    div-int/lit8 v1, p1, 0x3c

    .line 3
    rem-int/lit8 p1, p1, 0x3c

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u5206"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f071292

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-direct {p0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->getStatusBarHeight(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->b:Lcom/google/android/material/appbar/AppBarLayout;

    new-instance v2, Lcom/join/mgps/activity/k;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/activity/k;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity;I)V

    invoke-virtual {v1, v2}, Lcom/google/android/material/appbar/AppBarLayout;->addOnOffsetChangedListener(Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;)V

    return-void
.end method

.method private m0(Lcom/join/mgps/dto/EndGameBean;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getVideo()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->d:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->e:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getVideo()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v2, v1}, Lcom/join/android/app/component/video/StandardVideoView;->setMuteWhenPlay(Z)V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/component/video/StandardVideoView;->setCover(Ljava/lang/String;)V

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->G:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v2, v1}, Lcom/join/android/app/component/video/StandardVideoView;->setShowCoverWhenPause(Z)V

    .line 12
    iget-boolean v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->D:Z

    if-eqz v2, :cond_2

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    const-string v2, ""

    invoke-static {p1, v0, v1, v2}, Lcom/join/android/app/component/video/i;->c(Lcom/join/android/app/component/video/StandardVideoView;Ljava/lang/String;ZLjava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-static {p1}, Lcom/join/android/app/component/video/i;->a(Lcom/join/android/app/component/video/StandardVideoView;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->setSurfaceToPlay()V

    goto :goto_1

    .line 16
    :cond_2
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    sget v3, Lcom/join/android/app/component/video/StandardVideoView;->D:I

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v1

    .line 18
    invoke-virtual {v2, v0, v3, v4}, Lcom/join/android/app/component/video/StandardVideoView;->setUp(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->startPlayLogic()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method

.method private n0(Lcom/join/mgps/dto/EndGameDetailBean;)V
    .locals 6

    const-string v0, "\u6392\u884c\u699c"

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-static {}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->o0()Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;->b(Lcom/join/mgps/dto/EndGameDetailBean;)Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;->a()Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    .line 4
    new-instance v2, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    const/4 v3, 0x0

    aget-object v4, v0, v3

    invoke-static {}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_;->o0()Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;->b(Lcom/join/mgps/dto/EndGameDetailBean;)Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment_$f;->a()Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    move-result-object p1

    invoke-direct {v2, v4, p1}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v4

    invoke-direct {v2, v4, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    invoke-virtual {p1, v2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->m:Lcom/flyco/tablayout/SlidingTabLayout;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v1, v0}, Lcom/flyco/tablayout/SlidingTabLayout;->setViewPager(Landroidx/viewpager/widget/ViewPager;[Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    new-instance v0, Lcom/join/mgps/activity/EndGameDetailActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity$a;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 8
    invoke-direct {p0, v3}, Lcom/join/mgps/activity/EndGameDetailActivity;->r0(I)V

    return-void
.end method

.method private synthetic q0(ILcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 1

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "initAppbarListener: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "   "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/2addr p1, p3

    const/4 p2, 0x0

    if-gez p1, :cond_1

    .line 2
    iget-boolean p3, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->K:Z

    if-nez p3, :cond_1

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->t:Landroid/widget/LinearLayout;

    const p3, 0x7f060412

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->q:Landroid/widget/ImageView;

    const p3, 0x7f080150

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->r:Landroid/widget/ImageView;

    const p3, 0x7f080623

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 p1, 0x1

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->s0(Z)V

    .line 8
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz p2, :cond_0

    .line 9
    invoke-virtual {p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result p2

    const/4 p3, 0x2

    if-ne p2, p3, :cond_0

    .line 10
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    .line 11
    :cond_0
    iput-boolean p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->K:Z

    goto :goto_0

    :cond_1
    if-lez p1, :cond_3

    .line 12
    iget-boolean p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->K:Z

    if-eqz p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->t:Landroid/widget/LinearLayout;

    const p3, 0x7f0603ec

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->q:Landroid/widget/ImageView;

    const p3, 0x7f0805e0

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->r:Landroid/widget/ImageView;

    const p3, 0x7f0806aa

    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->s:Landroid/widget/TextView;

    const/4 p3, 0x4

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    invoke-direct {p0, p2}, Lcom/join/mgps/activity/EndGameDetailActivity;->s0(Z)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz p1, :cond_2

    .line 19
    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result p1

    const/4 p3, 0x5

    if-ne p1, p3, :cond_2

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    .line 21
    :cond_2
    iput-boolean p2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->K:Z

    :cond_3
    :goto_0
    return-void
.end method

.method private r0(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->m:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v0}, Lcom/flyco/tablayout/SlidingTabLayout;->getTabCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 2
    iget-object v3, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->m:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v3, v2}, Lcom/flyco/tablayout/SlidingTabLayout;->j(I)Landroid/widget/TextView;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v2, p1, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 3
    :goto_1
    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private s0(Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setStatusBarLight: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    if-eqz p1, :cond_0

    or-int/lit16 p1, v1, 0x2000

    goto :goto_0

    :cond_0
    and-int/lit16 p1, v1, -0x2001

    .line 4
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_1
    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    const/4 v3, 0x0

    if-lt v0, v2, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 3
    invoke-virtual {v4, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 4
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v5, 0x500

    invoke-virtual {v1, v5}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 5
    invoke-virtual {v4, v1}, Landroid/view/Window;->addFlags(I)V

    .line 6
    invoke-virtual {v4, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v4, 0x13

    if-lt v0, v4, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    :goto_0
    if-lt v0, v2, :cond_2

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->t:Landroid/widget/LinearLayout;

    invoke-direct {p0, p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->getStatusBarHeight(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 9
    :cond_2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->F:Lcom/join/mgps/rpc/k;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->E:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->getEndGameConfig()V

    .line 12
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->showLoding()V

    return-void
.end method

.method getData(Z)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameDetailArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setGameId(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setEndgameId(Ljava/lang/String;)V

    .line 5
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setUid(Ljava/lang/String;)V

    .line 6
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->F:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->R(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->u0(Lcom/join/mgps/dto/EndGameDetailBean;Z)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->showLodingFailed()V

    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->showLodingFailed()V

    .line 14
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100299

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->showTost(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method getEndGameConfig()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameListArgs;-><init>()V

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameListArgs;->setUid(Ljava/lang/String;)V

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/rpc/impl/i;->x(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->E:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method h0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {p0}, Lcom/join/mgps/activity/EndGameLaunchActivity_;->G0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->a(Lcom/join/mgps/dto/EndGameBean;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 5
    :try_start_0
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "2"

    .line 6
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setEndId(Ljava/lang/String;)V

    .line 8
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->A:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 10
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v2

    sget-object v3, Lcom/papa/sim/statistic/Event;->gameStartVS:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v2, v3, v0, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_0
    return-void
.end method

.method i0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {v0, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->isEndgame_asset_switch()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getPublisher()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getAssetUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method j0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getShareUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dto/ShareBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ShareBean;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getShareUrl()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setqZoneShareUrl(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setQqUrl(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatFriendUrl(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWechatShareUrl(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setWeiboShareUrl(Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameIcon()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setImageUrl(Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setTitle(Ljava/lang/String;)V

    const-string v1, "\u6b8b\u5c40\u6311\u6218"

    .line 11
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setText(Ljava/lang/String;)V

    const/4 v1, 0x7

    .line 12
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setFrom(I)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ShareBean;->setGameId(Ljava/lang/String;)V

    .line 14
    invoke-static {p0, v0}, Lcom/join/mgps/Util/s;->r(Landroid/content/Context;Lcom/join/mgps/dto/ShareBean;)V

    :cond_0
    return-void
.end method

.method o0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onBackPressed()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->G:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/join/android/app/component/video/a;->c0(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    new-instance v1, Lcom/join/mgps/activity/EndGameDetailActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameDetailActivity$b;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/video/StandardGSYVideoPlayer;->taskShotPic(Ls2/e;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/StandardVideoView;->getTimeHas()J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->onAutoCompletion()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-static {v0}, Lcom/join/android/app/component/video/h;->f(Lcom/join/android/app/component/video/StandardVideoView;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/StandardVideoView;->getGSYVideoManager()Lcom/papa/gsyvideoplayer/video/base/a;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-interface {v0, v1}, Lcom/papa/gsyvideoplayer/video/base/a;->A(Ls2/a;)V

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->J:Z

    .line 8
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onBackPressed()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onDestroy()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->D:Z

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->release()V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->G:Ljava/lang/String;

    invoke-static {v0}, Lcom/join/android/app/component/video/a;->n0(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onPause()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->D:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v0, :cond_1

    .line 5
    iget-boolean v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->J:Z

    if-nez v1, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->L:Z

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameDetailActivity;->getData(Z)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->L:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->f:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/android/app/component/video/StandardVideoView;->onVideoResume()V

    :cond_0
    return-void
.end method

.method p0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->I:Lcom/join/mgps/dialog/m0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dialog/m0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/m0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->I:Lcom/join/mgps/dialog/m0;

    .line 3
    new-instance v1, Lcom/join/mgps/activity/EndGameDetailActivity$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameDetailActivity$c;-><init>(Lcom/join/mgps/activity/EndGameDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/m0;->c(Lcom/join/mgps/dialog/m0$a;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->I:Lcom/join/mgps/dialog/m0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->I:Lcom/join/mgps/dialog/m0;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->r:Landroid/widget/ImageView;

    .line 6
    invoke-virtual {v1}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0711ad

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v2, v4

    double-to-int v2, v2

    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07106c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    neg-float v3, v3

    float-to-int v3, v3

    .line 8
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->showLoding()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameDetailActivity;->getData(Z)V

    return-void
.end method

.method setNetwork()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u52a0\u8f7d\u4e2d"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->v:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->x:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->u:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->w:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->v:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->x:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->u:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u4e3b\u754c\u9762main"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->v:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->x:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->u:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method u0(Lcom/join/mgps/dto/EndGameDetailBean;Z)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameDetailActivity;->t0()V

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->H:Lcom/join/mgps/dto/EndGameDetailBean;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getSubTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getAvatar()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->z:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getGameIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getChallengeSucRate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->y:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getWin()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getBestTimes()I

    move-result v2

    if-gtz v2, :cond_2

    const-string v2, "\u6682\u65e0\u6210\u7ee9"

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getBestTimes()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/join/mgps/activity/EndGameDetailActivity;->k0(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_3

    .line 14
    invoke-direct {p0, v0}, Lcom/join/mgps/activity/EndGameDetailActivity;->m0(Lcom/join/mgps/dto/EndGameBean;)V

    .line 15
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->n0(Lcom/join/mgps/dto/EndGameDetailBean;)V

    goto :goto_2

    .line 16
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 17
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p2}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Landroidx/viewpager/widget/PagerAdapter;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity;->n:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroidx/viewpager/widget/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 18
    instance-of v0, p2, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    if-eqz v0, :cond_4

    .line 19
    check-cast p2, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-virtual {p2, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h0(Lcom/join/mgps/dto/EndGameDetailBean;)V

    :cond_4
    :goto_2
    return-void
.end method
