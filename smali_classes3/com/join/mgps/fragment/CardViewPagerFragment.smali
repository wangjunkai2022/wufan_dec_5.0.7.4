.class public Lcom/join/mgps/fragment/CardViewPagerFragment;
.super Lcom/join/mgps/fragment/AbsBaseFragment;
.source "CardViewPagerFragment.java"

# interfaces
.implements Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/fragment/AbsBaseFragment;",
        "Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$h<",
        "Landroidx/viewpager/widget/ViewPager;",
        ">;"
    }
.end annotation


# static fields
.field private static w:Lcom/join/mgps/fragment/CardViewPagerFragment;


# instance fields
.field private c:Landroid/view/View;

.field private d:Landroid/widget/ImageButton;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Lcom/join/mgps/control/RhythmLayout;

.field private h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

.field private i:Landroidx/viewpager/widget/ViewPager;

.field private j:Lcom/join/mgps/adapter/CardPagerAdapter;

.field private k:I

.field private l:Z

.field private m:Z

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameDiscoverBean;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameDiscoverBean;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/join/mgps/pref/c;

.field private q:I

.field private r:Z

.field private s:Lcom/join/mgps/control/b;

.field private t:Lcom/join/mgps/control/a;

.field private u:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

.field private v:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/AbsBaseFragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->p:Lcom/join/mgps/pref/c;

    .line 4
    iput v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->q:I

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->r:Z

    .line 6
    new-instance v0, Lcom/join/mgps/fragment/CardViewPagerFragment$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CardViewPagerFragment$a;-><init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->t:Lcom/join/mgps/control/a;

    .line 7
    new-instance v0, Lcom/join/mgps/fragment/CardViewPagerFragment$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CardViewPagerFragment$b;-><init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->u:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic X(Lcom/join/mgps/fragment/CardViewPagerFragment;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->i:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/CardViewPagerFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->k0(I)V

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/CardViewPagerFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    return p0
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/CardViewPagerFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic c0(Lcom/join/mgps/fragment/CardViewPagerFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    return p0
.end method

.method static synthetic d0(Lcom/join/mgps/fragment/CardViewPagerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/CardViewPagerFragment;->g0()V

    return-void
.end method

.method static synthetic e0(Lcom/join/mgps/fragment/CardViewPagerFragment;)Landroid/widget/ImageButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    return-object p0
.end method

.method private f0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameDiscoverBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->s:Lcom/join/mgps/control/b;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->l0(Ljava/util/List;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lcom/join/mgps/control/b;->a(Ljava/util/List;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->s:Lcom/join/mgps/control/b;

    invoke-virtual {p1}, Lcom/join/mgps/control/b;->notifyDataSetChanged()V

    return-void
.end method

.method private g0()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    .line 3
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 4
    iget v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->q:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->q:I

    const-string v0, "CurrentPn"

    .line 5
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->p:Lcom/join/mgps/pref/c;

    invoke-interface {v0, v1}, Lcom/join/mgps/pref/c;->B(Landroid/os/Bundle;)V

    return-void
.end method

.method public static h0()Lcom/join/mgps/fragment/CardViewPagerFragment;
    .locals 1

    .line 1
    sget-object v0, Lcom/join/mgps/fragment/CardViewPagerFragment;->w:Lcom/join/mgps/fragment/CardViewPagerFragment;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-direct {v0}, Lcom/join/mgps/fragment/CardViewPagerFragment;-><init>()V

    sput-object v0, Lcom/join/mgps/fragment/CardViewPagerFragment;->w:Lcom/join/mgps/fragment/CardViewPagerFragment;

    .line 3
    :cond_0
    sget-object v0, Lcom/join/mgps/fragment/CardViewPagerFragment;->w:Lcom/join/mgps/fragment/CardViewPagerFragment;

    return-object v0
.end method

.method public static i0(Landroid/app/Activity;)I
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 3
    iget v0, v0, Landroid/graphics/Rect;->top:I

    if-nez v0, :cond_0

    :try_start_0
    const-string v1, "com.android.internal.R$dimen"

    .line 4
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "status_bar_height"

    .line 6
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/SecurityException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0

    :catch_3
    move-exception p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    goto :goto_0

    :catch_4
    move-exception p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_0

    :catch_5
    move-exception p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    :catch_6
    move-exception p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    :cond_0
    :goto_0
    return v0
.end method

.method private j0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->o:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameDiscoverBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameDiscoverBean;->getDiscover()Lcom/join/mgps/dto/DiscoverBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/DiscoverBean;->getBg_color()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/h;->d(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->k:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->o:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/join/mgps/fragment/CardViewPagerFragment;->p0(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private k0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    invoke-virtual {v0, p1}, Lcom/join/mgps/control/RhythmLayout;->w(I)V

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->o0(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameDiscoverBean;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GameDiscoverBean;->getDiscover()Lcom/join/mgps/dto/DiscoverBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoverBean;->getBg_color()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/h;->d(Ljava/lang/String;)I

    move-result p1

    .line 5
    iget-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->r:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/GameDiscoverActivity;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/activity/GameDiscoverActivity;->i0()Lcom/join/android/app/common/manager/b;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/activity/GameDiscoverActivity;->i0()Lcom/join/android/app/common/manager/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/android/app/common/manager/b;->p(I)V

    .line 9
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->r:Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/GameDiscoverActivity;

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/activity/GameDiscoverActivity;->i0()Lcom/join/android/app/common/manager/b;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/activity/GameDiscoverActivity;->i0()Lcom/join/android/app/common/manager/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/join/android/app/common/manager/b;->k(I)V

    .line 13
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->c:Landroid/view/View;

    iget v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->k:I

    const/16 v2, 0x2bc

    invoke-static {v0, v1, p1, v2}, Lcom/join/mgps/Util/c;->k(Landroid/view/View;III)V

    .line 14
    iput p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->k:I

    return-void
.end method

.method private l0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameDiscoverBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 2
    :cond_1
    new-instance v0, Lcom/join/mgps/control/b;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    invoke-direct {v0, v1, v2, p1}, Lcom/join/mgps/control/b;-><init>(Landroid/content/Context;Lcom/join/mgps/control/RhythmLayout;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->s:Lcom/join/mgps/control/b;

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    invoke-virtual {p1, v0}, Lcom/join/mgps/control/RhythmLayout;->setAdapter(Lcom/join/mgps/control/b;)V

    return-void
.end method

.method private n0(Landroidx/viewpager/widget/ViewPager;I)V
    .locals 5

    .line 1
    :try_start_0
    const-class v0, Landroidx/viewpager/widget/ViewPager;

    const-string v1, "mScroller"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 3
    new-instance v1, Lcom/join/mgps/control/c;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Landroid/view/animation/OvershootInterpolator;

    const v4, 0x3f19999a    # 0.6f

    invoke-direct {v3, v4}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-direct {v1, v2, v3}, Lcom/join/mgps/control/c;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 4
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {v1, p2}, Lcom/join/mgps/control/c;->a(I)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private o0(I)V
    .locals 7

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    invoke-static {v0}, Lcom/join/mgps/Util/c;->a(Landroid/view/View;)Landroid/animation/Animator;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    invoke-static {v0}, Lcom/join/mgps/Util/c;->c(Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/fragment/CardViewPagerFragment$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/CardViewPagerFragment$e;-><init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    :cond_1
    :goto_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameDiscoverBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameDiscoverBean;->getDiscover()Lcom/join/mgps/dto/DiscoverBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DiscoverBean;->getAddtimes()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long v1, v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 8
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "MM EEEE"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/GameDiscoverBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameDiscoverBean;->getDiscover()Lcom/join/mgps/dto/DiscoverBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoverBean;->getAddtimes()J

    move-result-wide v5

    mul-long v5, v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 10
    iget-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->f:Landroid/widget/TextView;

    const-string v2, " "

    const-string/jumbo v3, "\u6708\n"

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private p0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameDiscoverBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->c:Landroid/view/View;

    iget v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->k:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-lt v2, v3, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->j:Lcom/join/mgps/adapter/CardPagerAdapter;

    if-nez v1, :cond_3

    .line 8
    new-instance v1, Lcom/join/mgps/adapter/CardPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/join/mgps/adapter/CardPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->j:Lcom/join/mgps/adapter/CardPagerAdapter;

    .line 9
    iget-object v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->i:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {v1, p1}, Lcom/join/mgps/adapter/CardPagerAdapter;->b(Ljava/util/List;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->j:Lcom/join/mgps/adapter/CardPagerAdapter;

    invoke-virtual {v1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 12
    :goto_0
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->f0(Ljava/util/List;)V

    .line 13
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->j:Lcom/join/mgps/adapter/CardPagerAdapter;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/CardPagerAdapter;->c()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    .line 14
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->i:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p1

    sub-int/2addr v0, v4

    if-ne p1, v0, :cond_5

    .line 15
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->i:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    add-int/2addr v0, v4

    invoke-virtual {p1, v0, v4}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_4
    :goto_1
    return-void

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public O(Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase<",
            "Landroidx/viewpager/widget/ViewPager;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->getCurrentMode()Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_END:Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    .line 3
    iget-boolean p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/join/mgps/fragment/CardViewPagerFragment$d;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CardViewPagerFragment$d;-><init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    invoke-virtual {p1}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->f()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    sget-object v0, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;->DISABLED:Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;

    invoke-virtual {p1, v0}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->setMode(Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;)V

    .line 7
    iput-boolean v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    return-void

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->getCurrentMode()Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;

    move-result-object p1

    sget-object v0, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;->PULL_FROM_START:Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$Mode;

    if-ne p1, v0, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    invoke-virtual {p1}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->f()V

    .line 10
    iput-boolean v2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    :cond_3
    :goto_0
    return-void
.end method

.method protected V(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->t:Lcom/join/mgps/control/a;

    invoke-virtual {p1, v0}, Lcom/join/mgps/control/RhythmLayout;->setRhythmListener(Lcom/join/mgps/control/a;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    invoke-virtual {p1, p0}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->setOnRefreshListener(Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase$h;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->setPullToRefreshEnabled(Z)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->i:Landroidx/viewpager/widget/ViewPager;

    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->u:Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    new-instance v0, Lcom/join/mgps/fragment/CardViewPagerFragment$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/CardViewPagerFragment$c;-><init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected W(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 6

    const v0, 0x7f0c025e

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/fragment/CardViewPagerFragment;->i0(Landroid/app/Activity;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->v:I

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v1, v0, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    const v0, 0x7f09142e

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->e:Landroid/widget/TextView;

    const v0, 0x7f09142f

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->f:Landroid/widget/TextView;

    const v0, 0x7f090dc9

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->c:Landroid/view/View;

    const v0, 0x7f090263

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->d:Landroid/widget/ImageButton;

    const v0, 0x7f0901f0

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/control/RhythmLayout;

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    const v0, 0x7f090f94

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->getRefreshableView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->i:Landroidx/viewpager/widget/ViewPager;

    const/16 v1, 0x2bc

    .line 12
    invoke-direct {p0, v0, v1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->n0(Landroidx/viewpager/widget/ViewPager;I)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/join/mgps/control/RhythmLayout;->setScrollRhythmStartDelayTime(I)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    invoke-virtual {v0}, Lcom/join/mgps/control/RhythmLayout;->getRhythmItemWidth()F

    move-result v0

    float-to-int v0, v0

    const/4 v1, 0x1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-static {v1, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 15
    iget-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->g:Lcom/join/mgps/control/RhythmLayout;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 16
    iget-object v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    int-to-double v2, v0

    const-wide v4, 0x3ff4cccccccccccdL    # 1.3

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    double-to-int v0, v2

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    return-object p1
.end method

.method protected initData()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->n:Ljava/util/List;

    return-void
.end method

.method public m0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameDiscoverBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->o:Ljava/util/List;

    .line 2
    iget v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->q:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameDiscoverBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameDiscoverBean;->getDiscover()Lcom/join/mgps/dto/DiscoverBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DiscoverBean;->getBg_color()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/h;->d(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->k:I

    .line 4
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->p0(Ljava/util/List;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->h:Lcom/join/mgps/pulltorefresh/extras/viewpager/PullToRefreshViewPager;

    invoke-virtual {p1}, Lcom/join/mgps/pulltorefresh/library/PullToRefreshBase;->f()V

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->m:Z

    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->q:I

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->l:Z

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->s:Lcom/join/mgps/control/b;

    .line 5
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->j:Lcom/join/mgps/adapter/CardPagerAdapter;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->p:Lcom/join/mgps/pref/c;

    invoke-interface {v0, p1}, Lcom/join/mgps/pref/c;->y(Landroid/os/Bundle;)V

    .line 7
    :try_start_0
    invoke-direct {p0}, Lcom/join/mgps/fragment/CardViewPagerFragment;->j0()V

    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->k0(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameDiscoverActivity;

    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->p:Lcom/join/mgps/pref/c;

    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment;->p:Lcom/join/mgps/pref/c;

    .line 2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method
