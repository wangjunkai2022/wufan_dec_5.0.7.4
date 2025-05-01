.class public Lcom/join/mgps/activity/EndGameActivity;
.super Lcom/BaseAppCompatActivity;
.source "EndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/EndGameActivity$h;,
        Lcom/join/mgps/activity/EndGameActivity$k;,
        Lcom/join/mgps/activity/EndGameActivity$j;,
        Lcom/join/mgps/activity/EndGameActivity$i;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c003e
.end annotation


# instance fields
.field private A:Lcom/join/mgps/activity/EndGameActivity$h;

.field private B:Lcom/join/mgps/dto/EndGameNameListBean;

.field private C:Lcom/join/mgps/dto/CommonGameInfoBean;

.field D:Lcom/join/mgps/dialog/e0;

.field b:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field n:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field o:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

.field private q:Z

.field private r:Landroid/app/Activity;

.field private s:Lcom/join/mgps/activity/EndGameActivity$i;

.field private t:Lcom/join/mgps/rpc/k;

.field private u:I

.field private v:I

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameTypeBean;",
            ">;"
        }
    .end annotation
.end field

.field private y:Lcom/join/mgps/activity/EndGameActivity$j;

.field private z:Lcom/join/mgps/activity/EndGameActivity$k;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/EndGameActivity;->u:I

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/activity/EndGameActivity;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/EndGameActivity;->z0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/EndGameActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/EndGameActivity;->u:I

    return p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/EndGameActivity;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/EndGameActivity;->u:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/EndGameActivity;->u:I

    return v0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/EndGameActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    return p0
.end method

.method static synthetic j0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    return-object p0
.end method

.method static synthetic l0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/dto/EndGameNameListBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->B:Lcom/join/mgps/dto/EndGameNameListBean;

    return-object p0
.end method

.method static synthetic m0(Lcom/join/mgps/activity/EndGameActivity;Lcom/join/mgps/dto/EndGameNameListBean;)Lcom/join/mgps/dto/EndGameNameListBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->B:Lcom/join/mgps/dto/EndGameNameListBean;

    return-object p1
.end method

.method static synthetic n0(Lcom/join/mgps/activity/EndGameActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    return p0
.end method

.method static synthetic o0(Lcom/join/mgps/activity/EndGameActivity;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    return v0
.end method

.method static synthetic p0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    return-object p0
.end method

.method static synthetic q0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    return-object p0
.end method

.method static synthetic r0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->z:Lcom/join/mgps/activity/EndGameActivity$k;

    return-object p0
.end method

.method private synthetic z0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameTypeBean;

    if-ne p2, p3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameTypeBean;->setSelected(Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    if-eqz p1, :cond_2

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->j:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, p3}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreEnd(Z)V

    :cond_0
    return-void
.end method

.method B0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreEnd(Z)V

    :cond_0
    return-void
.end method

.method C0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->A:Lcom/join/mgps/activity/EndGameActivity$h;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameActivity$h;->a(Lcom/join/mgps/activity/EndGameActivity$h;I)Lcom/join/mgps/fragment/EndGameViewpagerListFragment_;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/fragment/EndGameViewpagerListFragment;->b0()V

    :cond_0
    return-void
.end method

.method D0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->y0()V

    return-void
.end method

.method E0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method F0(Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    .line 2
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameListBean;->getTypeList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->z:Lcom/join/mgps/activity/EndGameActivity$k;

    if-eqz p1, :cond_2

    .line 8
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/join/mgps/activity/EndGameActivity$k;->a(Lcom/join/mgps/activity/EndGameActivity$k;Ljava/util/List;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->z:Lcom/join/mgps/activity/EndGameActivity$k;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method G0(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;I)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->E0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->m:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/EndGameNameListBean;->setSelected(Z)V

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->A:Lcom/join/mgps/activity/EndGameActivity$h;

    if-eqz v1, :cond_2

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-static {v1, v2}, Lcom/join/mgps/activity/EndGameActivity$h;->b(Lcom/join/mgps/activity/EndGameActivity$h;Ljava/util/List;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->A:Lcom/join/mgps/activity/EndGameActivity$h;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    if-ne p2, v0, :cond_4

    const/4 p2, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_4

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->m:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/EndGameNameListBean;->setSelected(Z)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, p2, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    goto :goto_1

    :cond_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 13
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    if-eqz p1, :cond_5

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    :cond_5
    return-void
.end method

.method afterviews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0x4000000

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-lt v0, v3, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const/16 v3, 0x500

    invoke-virtual {v1, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    const/high16 v1, -0x80000000

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 7
    invoke-virtual {v0, v2}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    :cond_0
    const/16 v3, 0x13

    if-lt v0, v3, :cond_1

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 9
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->o:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 10
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v3, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v1, v0, v3}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->getEndGameConfig()V

    .line 13
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getEndgame_challenge_level()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 14
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 15
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/android/app/common/utils/n;->v(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->c:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->h:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    if-eqz v1, :cond_4

    const v1, 0x7f0806c7

    goto :goto_2

    :cond_4
    const v1, 0x7f0806c8

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 19
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->t:Lcom/join/mgps/rpc/k;

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    const/16 v1, 0x8

    if-eqz v0, :cond_6

    .line 21
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->isEndgame_creation_switch()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 23
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 24
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 25
    :goto_3
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity$i;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/EndGameActivity$i;-><init>(Lcom/join/mgps/activity/EndGameActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    .line 26
    new-instance v1, Lcom/join/mgps/activity/EndGameActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameActivity$a;-><init>(Lcom/join/mgps/activity/EndGameActivity;)V

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnLoadMoreListener(Lcom/join/mgps/base/BaseQuickAdapter$l;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    new-instance v1, Lcom/join/mgps/activity/EndGameActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameActivity$b;-><init>(Lcom/join/mgps/activity/EndGameActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 28
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    new-instance v1, Lcom/join/mgps/base/c;

    invoke-direct {v1}, Lcom/join/mgps/base/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setLoadMoreView(Lcom/join/mgps/base/a;)V

    .line 29
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-direct {v1, v3, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 30
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 31
    new-instance v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    .line 32
    iput v2, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 33
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0711c7

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 34
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/join/mgps/activity/EndGameActivity$c;

    invoke-direct {v3, p0, v0}, Lcom/join/mgps/activity/EndGameActivity$c;-><init>(Lcom/join/mgps/activity/EndGameActivity;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 35
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity$j;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/EndGameActivity$j;-><init>(Lcom/join/mgps/activity/EndGameActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    .line 36
    new-instance v1, Lcom/join/mgps/activity/EndGameActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameActivity$d;-><init>(Lcom/join/mgps/activity/EndGameActivity;)V

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnLoadMoreListener(Lcom/join/mgps/base/BaseQuickAdapter$l;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 37
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    new-instance v1, Lcom/join/mgps/base/c;

    invoke-direct {v1}, Lcom/join/mgps/base/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setLoadMoreView(Lcom/join/mgps/base/a;)V

    .line 38
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-direct {v1, v3, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 40
    new-instance v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    .line 41
    iput v2, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 42
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f07126e

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 43
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/join/mgps/activity/EndGameActivity$e;

    invoke-direct {v3, p0, v0}, Lcom/join/mgps/activity/EndGameActivity$e;-><init>(Lcom/join/mgps/activity/EndGameActivity;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 44
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->y:Lcom/join/mgps/activity/EndGameActivity$j;

    new-instance v1, Lcom/join/mgps/activity/j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/j;-><init>(Lcom/join/mgps/activity/EndGameActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 45
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity$k;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->x:Ljava/util/List;

    invoke-direct {v0, p0, p0, v1}, Lcom/join/mgps/activity/EndGameActivity$k;-><init>(Lcom/join/mgps/activity/EndGameActivity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->z:Lcom/join/mgps/activity/EndGameActivity$k;

    .line 46
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->j:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 47
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->j:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 48
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->j:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/join/mgps/activity/EndGameActivity$f;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameActivity$f;-><init>(Lcom/join/mgps/activity/EndGameActivity;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 49
    new-instance v0, Lcom/join/mgps/activity/EndGameActivity$h;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-direct {v0, p0, p0, v1}, Lcom/join/mgps/activity/EndGameActivity$h;-><init>(Lcom/join/mgps/activity/EndGameActivity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->A:Lcom/join/mgps/activity/EndGameActivity$h;

    .line 50
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 51
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 52
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 53
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->u0()V

    .line 54
    iget v0, p0, Lcom/join/mgps/activity/EndGameActivity;->u:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameActivity;->w0(I)V

    .line 55
    iget v0, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameActivity;->x0(I)V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method getEndGameConfig()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameListArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/rpc/impl/i;->x(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->o:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 11
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->isEndgame_creation_switch()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/activity/EndGameActivity;->u:I

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    .line 3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameActivity;->w0(I)V

    .line 4
    iget v0, p0, Lcom/join/mgps/activity/EndGameActivity;->v:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/EndGameActivity;->x0(I)V

    return-void
.end method

.method public s0(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 p1, 0x0

    .line 3
    :goto_1
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/EndGameNameListBean;

    if-ne v1, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_2

    :cond_0
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/EndGameNameListBean;->setSelected(Z)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->s:Lcom/join/mgps/activity/EndGameActivity$i;

    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    instance-of p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz p1, :cond_3

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v2

    if-lt v1, v2, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result p1

    if-le v1, p1, :cond_3

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->w:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/EndGameNameListBean;

    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity;->B:Lcom/join/mgps/dto/EndGameNameListBean;

    .line 12
    iget-boolean p1, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->y0()V

    :cond_4
    return-void

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->l:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->l:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method t0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->o:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->showGuideCreateEndGame()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->D:Lcom/join/mgps/dialog/e0;

    if-nez v0, :cond_1

    .line 6
    new-instance v0, Lcom/join/mgps/dialog/e0;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/e0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->D:Lcom/join/mgps/dialog/e0;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->D:Lcom/join/mgps/dialog/e0;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getCreate_endgame_hint()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/e0;->b(Ljava/util/ArrayList;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->D:Lcom/join/mgps/dialog/e0;

    new-instance v1, Lcom/join/mgps/activity/EndGameActivity$g;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/EndGameActivity$g;-><init>(Lcom/join/mgps/activity/EndGameActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/dialog/e0;->a(Lcom/papa91/arc/interfaces/DialogListenerWrap;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-static {p0}, Lcom/join/mgps/activity/CreateEndGameActivity_;->D0(Landroid/content/Context;)Lcom/join/mgps/activity/CreateEndGameActivity_$n;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity_$n;->a(Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;)Lcom/join/mgps/activity/CreateEndGameActivity_$n;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    :cond_3
    :goto_0
    return-void
.end method

.method u0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameAdArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameAdArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameAdArgs;->setUid(Ljava/lang/String;)V

    .line 4
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 5
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->t:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->j0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    iput-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->C:Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->C0()V

    :cond_0
    return-void
.end method

.method public v0()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->C:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method w0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameNameListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameNameListArgs;-><init>()V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->setWithEndGame(Z)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->setUid(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/RequestEndGameNameListArgs;->setPage(I)V

    .line 6
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->t:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->u0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameNameBean;->getGameList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameNameBean;->getGameList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameNameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameNameBean;->getGameList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/EndGameActivity;->G0(Ljava/util/List;I)V

    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->A0()V

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->showLodingFailed()V

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->showLodingFailed()V

    .line 16
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100299

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/EndGameActivity;->showTost(Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method x0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameTypeArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;->setUid(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;->setPage(I)V

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;->setModelType(I)V

    .line 6
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->r:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->t:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->I(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameListBean;->getGameList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameListBean;->getGameList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameListBean;

    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/activity/EndGameActivity;->F0(Lcom/join/mgps/dto/EndGameListBean;I)V

    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/EndGameActivity;->B0()V

    :cond_2
    :goto_1
    return-void
.end method

.method y0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->e:Landroid/view/View;

    iget-boolean v2, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    if-eqz v2, :cond_0

    const/16 v1, 0x8

    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->h:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    if-eqz v1, :cond_1

    const v1, 0x7f0806c8

    goto :goto_0

    :cond_1
    const v1, 0x7f0806c7

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f071513

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_1

    :cond_2
    const/4 v1, -0x2

    :goto_1
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-boolean v0, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/join/mgps/activity/EndGameActivity;->q:Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->z:Lcom/join/mgps/activity/EndGameActivity$k;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->j:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v2, :cond_3

    .line 9
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v2

    invoke-static {v0, v2}, Lcom/join/mgps/activity/EndGameActivity$k;->b(Lcom/join/mgps/activity/EndGameActivity$k;I)Lcom/join/mgps/fragment/EndGameSelectFragment_;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity;->B:Lcom/join/mgps/dto/EndGameNameListBean;

    if-eqz v2, :cond_3

    .line 11
    invoke-virtual {v2}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/fragment/EndGameSelectFragment;->d0(Ljava/lang/String;)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClickable(Z)V

    return-void
.end method
