.class public Lcom/join/mgps/fragment/ForumIndexFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "ForumIndexFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/ForumIndexHeaderView$c;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c05b5
.end annotation


# instance fields
.field A:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field B:Landroid/widget/TextView;

.field C:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field D:Landroid/widget/TextView;

.field E:Landroid/widget/LinearLayout;

.field F:Landroid/widget/TextView;

.field G:Lcom/join/mgps/customview/ScrollTextViewLayout;

.field H:Landroid/widget/ImageView;

.field I:Landroid/widget/ImageView;

.field J:Landroid/widget/ImageView;

.field K:Lcom/facebook/drawee/view/SimpleDraweeView;

.field L:Lcom/facebook/drawee/view/SimpleDraweeView;

.field M:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private S:I

.field private T:I

.field public U:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
            ">;"
        }
    .end annotation
.end field

.field private V:I

.field private W:Landroid/view/animation/Animation;

.field private final b:Ljava/lang/String;

.field c:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Lcom/join/mgps/customview/ForumLoadingView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Lru/noties/scrollable/ScrollableLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/join/mgps/customview/ForumIndexHeaderView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/mgps/customview/SlidingTabLayout4;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/content/Context;

.field o:Lcom/join/mgps/rpc/i;

.field p:Lcom/join/mgps/rpc/e;

.field q:Lcom/join/mgps/rpc/b;

.field r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommenGroupClassify;",
            ">;"
        }
    .end annotation
.end field

.field s:Lcom/join/mgps/fragment/e;

.field t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

.field u:I

.field private v:I

.field w:Landroidx/fragment/app/FragmentManager;

.field x:Z

.field private y:Landroid/widget/AbsListView;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->b:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->u:I

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->x:Z

    .line 5
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->N:I

    .line 6
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->O:I

    .line 7
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->P:I

    .line 8
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->Q:I

    const/4 v1, 0x2

    .line 9
    iput v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->R:I

    .line 10
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->S:I

    const/4 v0, 0x1

    .line 11
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->T:I

    .line 12
    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->V:I

    return-void
.end method

.method static synthetic X(Lcom/join/mgps/fragment/ForumIndexFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->v:I

    return p0
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/ForumIndexFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->v:I

    return p1
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/ForumIndexFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->g0()V

    return-void
.end method

.method private g0()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMyGameManagerActivity(Landroid/content/Context;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->G:Lcom/join/mgps/customview/ScrollTextViewLayout;

    invoke-virtual {v0}, Lcom/join/mgps/customview/ScrollTextViewLayout;->p()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->J:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->M:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isNewFinishedGame()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private r0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0627

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090fbf

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->B:Landroid/widget/TextView;

    const v1, 0x7f0901c6

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const v1, 0x7f09047e

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->E:Landroid/widget/LinearLayout;

    const v1, 0x7f0911fd

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->F:Landroid/widget/TextView;

    const v1, 0x7f0911fe

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/customview/ScrollTextViewLayout;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->G:Lcom/join/mgps/customview/ScrollTextViewLayout;

    const v1, 0x7f09073d

    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->H:Landroid/widget/ImageView;

    const v1, 0x7f09047f

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->I:Landroid/widget/ImageView;

    const v1, 0x7f0907ab

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->J:Landroid/widget/ImageView;

    const v1, 0x7f09033d

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->K:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f090fbd

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->L:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->A:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->E:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/join/mgps/fragment/ForumIndexFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$a;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->E:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->f0()V

    return-void
.end method

.method private t0(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/join/mgps/adapter/FragmentPagerAdapter$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/RecommenGroupClassify;

    .line 6
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecommenGroupClassify;->getGid()I

    .line 7
    invoke-virtual {v1}, Lcom/join/mgps/dto/RecommenGroupClassify;->getGname()Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    .line 9
    invoke-static {v1, p1}, Lcom/join/mgps/fragment/ForumPostsFragment;->f0(Lcom/join/mgps/dto/RecommenGroupClassify;I)Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-direct {v3, v2, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    .line 10
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private v0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->j0()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->l0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->n0()V

    return-void
.end method


# virtual methods
.method public A0()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->z:Z

    return-void
.end method

.method B0(Ljava/lang/String;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v2

    .line 4
    new-instance v3, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v3}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    const-string/jumbo v4, "uid"

    .line 5
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string/jumbo v0, "token"

    .line 6
    invoke-virtual {v3, v0, v2}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "ids"

    .line 7
    invoke-virtual {v3, v0, p1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->o:Lcom/join/mgps/rpc/i;

    invoke-interface {p1, v3}, Lcom/join/mgps/rpc/i;->z(Ljava/util/Map;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v0

    if-nez v0, :cond_5

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->isResult()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->I0()V

    .line 13
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const-string/jumbo p1, "\u670d\u52a1\u5668\u5f02\u5e38"

    .line 16
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    goto :goto_0

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f100299

    .line 18
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 19
    :cond_3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 20
    invoke-virtual {p0, v1}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    :cond_4
    const/16 p1, 0x9

    .line 21
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    :cond_5
    :goto_0
    return-void
.end method

.method C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    if-nez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    .line 4
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    if-eqz v0, :cond_2

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 9
    :cond_2
    new-instance v0, Lcom/join/mgps/fragment/f;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/fragment/f;-><init>(Landroidx/viewpager/widget/ViewPager;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->s:Lcom/join/mgps/fragment/e;

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->b()V

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-direct {p0, v1}, Lcom/join/mgps/fragment/ForumIndexFragment;->t0(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->e(Ljava/util/List;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    if-eqz v0, :cond_6

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getCount()I

    move-result v0

    const/4 v1, 0x4

    if-gt v0, v1, :cond_5

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setShouldExpand(Z)V

    goto :goto_0

    .line 16
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setShouldExpand(Z)V

    .line 17
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    new-instance v1, Lcom/join/mgps/fragment/ForumIndexFragment$e;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$e;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/SlidingTabLayout4;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 18
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v0}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    if-eqz v0, :cond_7

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/customview/SlidingTabLayout4;->g()V

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_8

    .line 22
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    :cond_8
    return-void
.end method

.method D0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;->getBanner()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setBannerData(Ljava/util/List;)V

    :cond_0
    const/4 p1, 0x2

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    return-void
.end method

.method E0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->m(Landroid/content/Context;)V

    return-void
.end method

.method F0(Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;->getTuijianguanzhu()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;->getWodeguanzhu()Ljava/util/List;

    move-result-object p1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1, p1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setHomepageRecommendGroupMy(Ljava/util/List;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setHomepageRecommendGroup(Ljava/util/List;)V

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    :cond_1
    return-void
.end method

.method G0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setLabelsVisibility(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    return-void
.end method

.method H0(ZLjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommendLabelTag;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setLabelsVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setLabelsVisibility(I)V

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setLabelsTipVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {p1, p2}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setHomepageRecommendLabel(Ljava/util/List;)V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    return-void
.end method

.method I0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->n0()V

    return-void
.end method

.method J0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->I:Landroid/widget/ImageView;

    const v1, 0x7f08092e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    const v1, 0x7f010056

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->W:Landroid/view/animation/Animation;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->J:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->J:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->W:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->W:Landroid/view/animation/Animation;

    new-instance v1, Lcom/join/mgps/fragment/ForumIndexFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$b;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method K0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->J:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->J:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->R:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->I:Landroid/widget/ImageView;

    const v1, 0x7f080936

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->I:Landroid/widget/ImageView;

    const v1, 0x7f080931

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method

.method L0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->C()V

    :cond_0
    return-void
.end method

.method M0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/ForumIndexHeaderView;->i()V

    :cond_0
    return-void
.end method

.method public N0()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/papa/gsyvideoplayer/d;->j0()V

    return-void
.end method

.method O0()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/ForumLoadingView;->getLoadingState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-static {}, Lb2/t;->p()Lb2/t;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/dto/ForumBean$ForumEvent;->HomepageRecommendGroup:Lcom/join/mgps/dto/ForumBean$ForumEvent;

    invoke-virtual {v0, v1}, Lb2/t;->o(Lcom/join/mgps/dto/ForumBean$ForumEvent;)Lcom/join/mgps/db/tables/ForumTable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/join/mgps/db/tables/ForumTable;->getTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long v3, v3, v5

    sub-long/2addr v1, v3

    sget v0, Lcom/join/mgps/Util/j0;->c:I

    int-to-long v3, v0

    cmp-long v0, v1, v3

    if-gez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    .line 5
    invoke-static {v0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/h;->A()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/pref/h;->o0(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->R()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method

.method P0(I)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const/16 v0, 0x64

    const v2, 0x7f070ec1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ge p1, v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    iget-object v5, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz v5, :cond_1

    .line 5
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v5

    iput v5, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 6
    iget-object v5, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 7
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const v2, 0x7f080a5d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v1, v1, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    goto :goto_0

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 12
    iget-object v5, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz v5, :cond_3

    .line 13
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070991

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v5

    iput v5, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 14
    iget-object v5, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    :cond_3
    const/high16 v2, 0x40e00000    # 7.0f

    .line 15
    iget-object v5, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v3, v2, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    const/4 v5, 0x4

    .line 16
    invoke-virtual {v0, v1, v2, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const/16 v5, 0x11

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 18
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v4, v4, v4, v4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const v2, 0x7f08099f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {v0, v3, v1, v2, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 22
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method Q0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->K0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method R()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->u0()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->v0()V

    return-void
.end method

.method R0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 2
    iget v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->R:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->G:Lcom/join/mgps/customview/ScrollTextViewLayout;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f080b80

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/ScrollTextViewLayout;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->G:Lcom/join/mgps/customview/ScrollTextViewLayout;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f080b86

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/ScrollTextViewLayout;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->K0()V

    goto :goto_1

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->I:Landroid/widget/ImageView;

    const v0, 0x7f08092e

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->J0()V

    :goto_1
    return-void
.end method

.method S0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->K0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->D:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080a5e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, v2, v2}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->C:Landroid/widget/TextView;

    const v1, 0x7f0603ec

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    :cond_1
    return-void
.end method

.method T(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method V()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.account_status_uidchange"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/j0;->g1()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->x0()V

    return-void
.end method

.method W()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goMGSettingActivity(Landroid/content/Context;)V

    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/g;->A0()Lcom/join/mgps/rpc/impl/g;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->o:Lcom/join/mgps/rpc/i;

    .line 4
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->p:Lcom/join/mgps/rpc/e;

    .line 5
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->q:Lcom/join/mgps/rpc/b;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->f:Landroid/widget/TextView;

    const-string/jumbo v2, "\u793e\u533a"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->m:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/join/mgps/fragment/ForumIndexFragment$c;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$c;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    new-instance v2, Lcom/join/mgps/fragment/ForumIndexFragment$d;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$d;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v2}, Lcom/join/mgps/ptr/PtrFrameLayout;->setPtrHandler(Lcom/join/mgps/ptr/b;)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/join/mgps/ptr/PtrFrameLayout;->j(Z)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->setAutoMaxScroll(Z)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setmOnMeasureHeight(Lcom/join/mgps/customview/ForumIndexHeaderView$c;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setHeaderClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    invoke-direct {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->r0()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->q0()V

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->R()V

    return-void
.end method

.method public b0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->f()V

    :cond_0
    return-void
.end method

.method c0(Landroid/content/Intent;)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.backup_game_finish"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->f0()V

    return-void
.end method

.method d0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method e0(I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    if-eq p1, v1, :cond_6

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v1, 0x4

    if-eq p1, v1, :cond_4

    const/16 v1, 0x10

    if-eq p1, v1, :cond_3

    const/16 v1, 0x9

    if-eq p1, v1, :cond_2

    const/16 v1, 0xa

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string/jumbo p1, "\u6ca1\u6709\u66f4\u591a\u5185\u5bb9\u54e6~"

    .line 2
    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedMsg(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment$j;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;Lcom/join/mgps/customview/ForumLoadingView;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->setListener(Lcom/join/mgps/customview/ForumLoadingView$e;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->setReloadingVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    .line 6
    :cond_2
    new-instance p1, Lcom/join/mgps/fragment/ForumIndexFragment$i;

    invoke-direct {p1, p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment$i;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;Lcom/join/mgps/customview/ForumLoadingView;)V

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/ForumLoadingView;->setListener(Lcom/join/mgps/customview/ForumLoadingView$e;)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    :cond_3
    const-string/jumbo p1, "\u52a0\u8f7d\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 8
    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/ForumLoadingView;->setFailedMsg(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    new-instance v0, Lcom/join/mgps/fragment/ForumIndexFragment$k;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment$k;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;Lcom/join/mgps/customview/ForumLoadingView;)V

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/ForumLoadingView;->setListener(Lcom/join/mgps/customview/ForumLoadingView$e;)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {p1, v1}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    .line 12
    :cond_5
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    goto :goto_0

    .line 13
    :cond_6
    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/ForumLoadingView;->j(I)V

    :goto_0
    return-void
.end method

.method f0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->S()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->N:I

    .line 2
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->W(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->P:I

    .line 3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->a0()I

    move-result v0

    .line 4
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->R0(I)V

    .line 5
    iget v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->N:I

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->P0(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->P:I

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->S0()V

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->Q0()V

    :goto_0
    return-void
.end method

.method public h(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    if-eqz v0, :cond_2

    .line 2
    iget v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->u:I

    const/4 v2, -0x1

    if-nez v1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    invoke-virtual {v0, p1}, Lru/noties/scrollable/ScrollableLayout;->setMaxScrollY(I)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 9
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lru/noties/scrollable/ScrollableLayout;->setMaxScrollY(I)V

    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {v0, p1}, Lru/noties/scrollable/ScrollableLayout;->setMaxScrollY(I)V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_2

    .line 15
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 16
    iput v2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 17
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->g:Lcom/join/mgps/customview/ForumLoadingView;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    :goto_0
    return-void
.end method

.method h0()Lcom/join/mgps/fragment/FragmentPagerFragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->s:Lcom/join/mgps/fragment/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/join/mgps/fragment/e;->a()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public i0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method j0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/j0;->V(Landroid/content/Context;I)Lcom/join/mgps/dto/ForumBannerBean$ForumBannerRequestBean;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->p:Lcom/join/mgps/rpc/e;

    invoke-interface {v2, v0}, Lcom/join/mgps/rpc/e;->x0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerRequestBean;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v2

    if-ne v2, v1, :cond_5

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;

    .line 8
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->l1(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V

    .line 9
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->D0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->p0()V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    goto :goto_2

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, 0x7f100299

    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const-string v0, ""

    .line 15
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 16
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    :cond_4
    const/16 v0, 0x9

    .line 17
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    :cond_5
    :goto_2
    return-void
.end method

.method k0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/j0;->a0()Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->D0(Lcom/join/mgps/dto/ForumBannerBean$ForumBannerDataBannerBean;)V

    return-void
.end method

.method l0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->o:Lcom/join/mgps/rpc/i;

    invoke-interface {v2, v0, v1}, Lcom/join/mgps/rpc/i;->P(Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v1

    if-nez v1, :cond_4

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    return-void

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;

    .line 9
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->q1(Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V

    .line 10
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->F0(Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    goto :goto_1

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f100299

    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const-string v0, ""

    .line 15
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 16
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    :cond_3
    const/16 v0, 0x9

    .line 17
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    :cond_4
    :goto_1
    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method m0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/j0;->g0()Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->F0(Lcom/join/mgps/dto/ForumData$HomepageRecommendGroup;)V

    return-void
.end method

.method n0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->o:Lcom/join/mgps/rpc/i;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4, v0, v1}, Lcom/join/mgps/rpc/i;->O(IILjava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/ForumResponse;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getError()I

    move-result v1

    if-nez v1, :cond_4

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->M0()V

    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    .line 10
    invoke-static {v0}, Lcom/join/mgps/Util/j0;->r1(Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;)V

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFlag()I

    move-result v1

    iput v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->u:I

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFlag()I

    move-result v1

    if-nez v1, :cond_2

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getTag_list()Ljava/util/List;

    move-result-object v1

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getLabel_switcher()I

    move-result v2

    if-ne v2, v4, :cond_1

    const/4 v3, 0x1

    :cond_1
    invoke-virtual {p0, v3, v1}, Lcom/join/mgps/fragment/ForumIndexFragment;->H0(ZLjava/util/List;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFlag()I

    move-result v1

    if-ne v1, v4, :cond_3

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->G0()V

    .line 17
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFenzu()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->y0(Ljava/util/List;)V

    .line 18
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->M0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->L0()V

    goto :goto_2

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f100299

    .line 22
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_6
    const-string v0, ""

    .line 23
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 24
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    :cond_7
    const/16 v0, 0x9

    .line 25
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ForumIndexFragment;->e0(I)V

    .line 26
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->M0()V

    :goto_2
    return-void
.end method

.method o0()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/j0;->h0()Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFlag()I

    move-result v1

    iput v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->u:I

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getTag_list()Ljava/util/List;

    move-result-object v1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getLabel_switcher()I

    move-result v0

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, v2, v1}, Lcom/join/mgps/fragment/ForumIndexFragment;->H0(ZLjava/util/List;)V

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFlag()I

    move-result v1

    if-ne v1, v2, :cond_5

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-nez v1, :cond_3

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    .line 9
    :cond_3
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFenzu()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-eqz v1, :cond_4

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFenzu()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->z0()V

    return-void

    .line 12
    :cond_4
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ForumData$HomepageRecommendLabel;->getFenzu()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->G0()V

    :cond_5
    :goto_1
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0910f8

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {p1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->h()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->n0()V

    goto :goto_1

    :cond_0
    const v0, 0x7f0905de

    if-ne p1, v0, :cond_4

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->E0()V

    return-void

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {p1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->getSelectedLabel()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x3

    if-lt p1, v0, :cond_2

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {p1}, Lcom/join/mgps/customview/ForumIndexHeaderView;->getSelectedIds()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->B0(Ljava/lang/String;)V

    goto :goto_1

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->n:Landroid/content/Context;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f10013b

    .line 9
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const-string p1, ""

    .line 10
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 11
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/ForumIndexFragment;->T(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->t:Lcom/join/mgps/adapter/FragmentPagerAdapter;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/adapter/FragmentPagerAdapter;->b()V

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->w:Landroidx/fragment/app/FragmentManager;

    :cond_1
    return-void
.end method

.method public onHiddenChanged(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->h0()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->h0()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/BaseFragment;->setUserVisibleHint(Z)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->O0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->f0()V

    return-void
.end method

.method p0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/ForumIndexHeaderView;->setNoForumBanner()V

    return-void
.end method

.method q0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->setIsIndex(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->i:Lcom/join/mgps/customview/ForumIndexHeaderView;

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->setDraggableView(Landroid/view/View;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    new-instance v1, Lcom/join/mgps/fragment/ForumIndexFragment$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$f;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->setCanScrollVerticallyDelegate(Lru/noties/scrollable/b;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    new-instance v1, Lcom/join/mgps/fragment/ForumIndexFragment$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$g;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->setOnFlingOverListener(Lru/noties/scrollable/j;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->h:Lru/noties/scrollable/ScrollableLayout;

    new-instance v1, Lcom/join/mgps/fragment/ForumIndexFragment$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ForumIndexFragment$h;-><init>(Lcom/join/mgps/fragment/ForumIndexFragment;)V

    invoke-virtual {v0, v1}, Lru/noties/scrollable/ScrollableLayout;->w(Lru/noties/scrollable/k;)V

    return-void
.end method

.method public s0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->l:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->q()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method u0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->k0()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->m0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->o0()V

    return-void
.end method

.method public w0()V
    .locals 0

    return-void
.end method

.method x0()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->v0()V

    return-void
.end method

.method y0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/RecommenGroupClassify;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->z0()V

    return-void

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 10
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->r:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_4

    .line 11
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 12
    invoke-virtual {p1, v0}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 13
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_3

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ForumIndexFragment;->C0()V

    goto :goto_0

    .line 16
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->j:Lcom/join/mgps/customview/SlidingTabLayout4;

    const/16 v0, 0x8

    if-eqz p1, :cond_5

    .line 17
    invoke-virtual {p1, v0}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 18
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->k:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_6

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_6
    :goto_0
    return-void
.end method

.method z0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->s:Lcom/join/mgps/fragment/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/join/mgps/fragment/e;->a()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/fragment/ForumPostsFragment;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ForumIndexFragment;->s:Lcom/join/mgps/fragment/e;

    invoke-interface {v0}, Lcom/join/mgps/fragment/e;->a()Lcom/join/mgps/fragment/FragmentPagerFragment;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/fragment/ForumPostsFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/ForumPostsFragment;->v0()V

    :cond_0
    return-void
.end method
