.class public Lcom/join/mgps/activity/UpdateFeatureActivity;
.super Lcom/BaseActivity;
.source "UpdateFeatureActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/UpdateFeatureActivity$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0791
.end annotation


# instance fields
.field b:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/join/mgps/dto/CommonAdBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/join/mgps/activity/UpdateFeatureActivity$c;

.field private i:Landroid/content/Context;

.field private j:Landroid/os/Handler;

.field k:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->e:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->f:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->g:Ljava/util/List;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/h3;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/h3;-><init>(Lcom/join/mgps/activity/UpdateFeatureActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->k:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic g0(Lcom/join/mgps/activity/UpdateFeatureActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->o0()V

    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->f:Ljava/util/List;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->e:Ljava/util/List;

    return-object p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->g:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Lcom/join/mgps/activity/UpdateFeatureActivity$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->h:Lcom/join/mgps/activity/UpdateFeatureActivity$c;

    return-object p0
.end method

.method static synthetic l0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->j:Landroid/os/Handler;

    return-object p0
.end method

.method private m0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->c:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->i:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 2
    new-instance v0, Lcom/join/mgps/activity/UpdateFeatureActivity$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UpdateFeatureActivity$c;-><init>(Lcom/join/mgps/activity/UpdateFeatureActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->h:Lcom/join/mgps/activity/UpdateFeatureActivity$c;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private n0()V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const v3, 0x7f0c0506

    const/4 v4, 0x0

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->f:Ljava/util/List;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    invoke-virtual {v5, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->g:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->f:Ljava/util/List;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v0, Lcom/join/mgps/activity/UpdateFeatureActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/UpdateFeatureActivity$a;-><init>(Lcom/join/mgps/activity/UpdateFeatureActivity;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->b:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->b:Landroidx/viewpager/widget/ViewPager;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->b:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/activity/UpdateFeatureActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/UpdateFeatureActivity$b;-><init>(Lcom/join/mgps/activity/UpdateFeatureActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->j:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->k:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

.method private synthetic o0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->b:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->b:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->b:Landroidx/viewpager/widget/ViewPager;

    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    rem-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method afterviews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->i:Landroid/content/Context;

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->j:Landroid/os/Handler;

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/16 v2, 0x15

    if-lt v0, v2, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x500

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x13

    if-lt v0, v2, :cond_1

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 10
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->d:Lcom/join/mgps/dto/CommonAdBean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonAdBean;->getAd_info_list()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->d:Lcom/join/mgps/dto/CommonAdBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonAdBean;->getAd_info_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->finish()V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->d:Lcom/join/mgps/dto/CommonAdBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonAdBean;->getAd_info_list()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/UpdateFeatureActivity;->e:Ljava/util/List;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 14
    :cond_4
    invoke-direct {p0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->n0()V

    .line 15
    invoke-direct {p0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->m0()V

    return-void
.end method

.method public finish()V
    .locals 1

    const/16 v0, 0x2715

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 2
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    return-void
.end method
