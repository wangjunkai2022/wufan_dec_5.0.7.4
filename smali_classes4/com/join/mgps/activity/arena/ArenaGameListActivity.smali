.class public Lcom/join/mgps/activity/arena/ArenaGameListActivity;
.super Lcom/BaseFragmentActivity;
.source "ArenaGameListActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/arena/ArenaGameListActivity$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0023
.end annotation


# static fields
.field private static final s:I = 0xa

.field public static final t:I = 0x1

.field public static final u:I = 0x2

.field public static final v:I = 0x3

.field public static final w:I = 0x4

.field private static final x:I = 0x23

.field private static final y:I = 0x1f


# instance fields
.field b:Lcom/join/mgps/rpc/l;

.field c:I
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f091489
    .end annotation
.end field

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/join/mgps/customview/XListView2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroidx/viewpager/widget/ViewPager;

.field h:Lcom/join/mgps/customview/TabPageIndicator;

.field i:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private k:Z

.field private l:I

.field m:Lcom/join/mgps/Util/b;
    .annotation build Lorg/androidannotations/annotations/Bean;
    .end annotation
.end field

.field private n:Lcom/join/mgps/adapter/h1;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/GameTypeBean;",
            ">;"
        }
    .end annotation
.end field

.field private q:[Lcom/join/mgps/fragment/ArenaGameListFragment_;

.field private r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseFragmentActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k:Z

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->r:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k:Z

    return p0
.end method

.method private getData()V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->showLoading()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->m0()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p0()V

    :goto_0
    return-void
.end method

.method static synthetic h0(Lcom/join/mgps/activity/arena/ArenaGameListActivity;I)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l0(I)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p:Ljava/util/ArrayList;

    return-object p0
.end method

.method private l0(I)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->q:[Lcom/join/mgps/fragment/ArenaGameListFragment_;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameTypeBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameTypeBean;->getId()I

    move-result v1

    const-string v2, "game_type"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 4
    iget v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->c:I

    const-string v2, "room_type"

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    const/16 v1, 0x23

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/4 v4, 0x3

    if-ne v1, v4, :cond_2

    const/16 v1, 0x1f

    .line 6
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    :goto_0
    const-string v1, "pn"

    if-nez p1, :cond_3

    .line 7
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->r:Ljava/util/ArrayList;

    const-string v2, "datas"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 10
    :goto_1
    new-instance v1, Lcom/join/mgps/fragment/ArenaGameListFragment_;

    invoke-direct {v1}, Lcom/join/mgps/fragment/ArenaGameListFragment_;-><init>()V

    .line 11
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->q:[Lcom/join/mgps/fragment/ArenaGameListFragment_;

    aput-object v1, v0, p1

    return-object v1
.end method


# virtual methods
.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->b:Lcom/join/mgps/rpc/l;

    const v0, 0x7f091483

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0600af

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    const v1, 0x7f090c6b

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f090146

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f080788

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->d:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f090d82

    .line 8
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f090d7f

    .line 9
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->i:Landroid/widget/LinearLayout;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->d:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 11
    new-instance v0, Lcom/join/mgps/adapter/h1;

    iget-object v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v3}, Lcom/join/mgps/adapter/h1;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->n:Lcom/join/mgps/adapter/h1;

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListView2;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 13
    iget v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->d:Landroid/widget/TextView;

    const-string v1, "\u6700\u8fd1"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setVisibility(I)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/arena/ArenaGameListActivity$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity$a;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity$b;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListActivity;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 19
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->getData()V

    goto :goto_1

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->d:Landroid/widget/TextView;

    const-string v1, "\u5176\u4ed6"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 21
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->d:Landroid/widget/TextView;

    const-string v1, "\u8857\u673a\u5bf9\u6218"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 22
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->d:Landroid/widget/TextView;

    const-string v1, "FC\u5bf9\u6218"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->j:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const v0, 0x7f0917b0

    .line 25
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->g:Landroidx/viewpager/widget/ViewPager;

    const v0, 0x7f090f92

    .line 26
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/TabPageIndicator;

    iput-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->h:Lcom/join/mgps/customview/TabPageIndicator;

    .line 27
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->getData()V

    :goto_1
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

.method j0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method k0(Lcom/join/mgps/dto/ResultResMainBean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResultResMainBean<",
            "Lcom/join/mgps/dto/NewArenaGameListBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/NewArenaGameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/NewArenaGameListBean;->getGame_type()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->r:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/NewArenaGameListBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/NewArenaGameListBean;->getGame_list()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lcom/join/mgps/fragment/ArenaGameListFragment_;

    iput-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->q:[Lcom/join/mgps/fragment/ArenaGameListFragment_;

    .line 4
    new-instance p1, Lcom/join/mgps/activity/arena/ArenaGameListActivity$c;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity$c;-><init>(Lcom/join/mgps/activity/arena/ArenaGameListActivity;Landroidx/fragment/app/FragmentManager;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->g:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->g:Landroidx/viewpager/widget/ViewPager;

    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->g:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->h:Lcom/join/mgps/customview/TabPageIndicator;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0600b0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/TabPageIndicator;->setNormalTextColor(I)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->h:Lcom/join/mgps/customview/TabPageIndicator;

    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060412

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/TabPageIndicator;->setSelectedTextColor(I)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->h:Lcom/join/mgps/customview/TabPageIndicator;

    const v0, 0x7f080935

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/TabPageIndicator;->setSelectedBottomDrawableBounds(I)V

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->h:Lcom/join/mgps/customview/TabPageIndicator;

    const v0, 0x7f080f04

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/TabPageIndicator;->setNormalBottomDrawableBound(I)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->h:Lcom/join/mgps/customview/TabPageIndicator;

    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->g:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/TabPageIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method m0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o0()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->n0()V

    :goto_0
    return-void
.end method

.method n0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iget v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->c:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->b:Lcom/join/mgps/rpc/l;

    const/16 v1, 0x23

    invoke-interface {v0, v1, v3, v3}, Lcom/join/mgps/rpc/l;->w(III)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->b:Lcom/join/mgps/rpc/l;

    const/16 v1, 0x1f

    invoke-interface {v0, v1, v3, v3}, Lcom/join/mgps/rpc/l;->w(III)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    .line 4
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_4

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/NewArenaGameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/NewArenaGameListBean;->getGame_type()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 6
    :cond_3
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k0(Lcom/join/mgps/dto/ResultResMainBean;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->j0()V

    goto :goto_3

    .line 8
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_5
    :goto_2
    return-void

    .line 9
    :catch_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p0()V

    :goto_3
    return-void
.end method

.method o0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->m:Lcom/join/mgps/Util/b;

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->m:Lcom/join/mgps/Util/b;

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    .line 3
    iget-object v3, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->b:Lcom/join/mgps/rpc/l;

    iget v4, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    invoke-interface {v3, v2, v1, v4}, Lcom/join/mgps/rpc/l;->m(ILjava/lang/String;I)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v1

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_6

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    if-eqz v1, :cond_5

    .line 5
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameListBean;->getGame_list()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0xa

    if-lt v3, v4, :cond_2

    const/4 v2, 0x1

    .line 9
    :cond_2
    iput-boolean v2, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k:Z

    goto :goto_0

    .line 10
    :cond_3
    iput-boolean v2, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k:Z

    .line 11
    :goto_0
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->q0(Ljava/util/List;)V

    .line 12
    iget v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    if-gt v1, v0, :cond_4

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->j0()V

    .line 14
    :cond_4
    iget-boolean v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k:Z

    if-eqz v1, :cond_7

    iget v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    goto :goto_3

    .line 15
    :cond_5
    :goto_1
    iget v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    if-gt v1, v0, :cond_7

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_6
    :goto_2
    return-void

    :catch_0
    move-exception v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestRecentGameList Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ArenaGameListActivity"

    invoke-static {v2, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget v1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->l:I

    if-gt v1, v0, :cond_7

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->p0()V

    :cond_7
    :goto_3
    return-void
.end method

.method p0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method q0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Landroid/widget/ListView;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setVisibility(I)V

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    :cond_1
    iget-boolean p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->k:Z

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->o:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_3

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1, v1}, Landroid/widget/ListView;->setVisibility(I)V

    return-void

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->n:Lcom/join/mgps/adapter/h1;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->getData()V

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

.method showLoading()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/arena/ArenaGameListActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
