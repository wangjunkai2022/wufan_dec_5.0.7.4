.class public Lcom/join/mgps/fragment/SimulatorIntroductionFragment;
.super Landroidx/fragment/app/Fragment;
.source "SimulatorIntroductionFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c029d
.end annotation


# instance fields
.field b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/viewpager/widget/ViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private j:I

.field k:Landroid/content/Context;

.field l:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Ljava/lang/String;

.field o:Ljava/lang/String;

.field p:I

.field q:Lcom/join/mgps/rpc/k;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsTagListBean;",
            ">;"
        }
    .end annotation
.end field

.field private s:Z

.field private t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->p:I

    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->lambda$aftervidew$0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method static synthetic W(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic X(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    return p0
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    return p1
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    return-object p0
.end method

.method private synthetic lambda$aftervidew$0(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 2
    iget p2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/BbsTagListBean;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/BbsTagListBean;->setSelected(Z)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    iget p2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 4
    iput p3, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/BbsTagListBean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/BbsTagListBean;->setSelected(Z)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    iget p2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    iget p2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->singleStartGamePageList:Lcom/papa/sim/statistic/Event;

    sget-object v2, Lcom/papa/sim/statistic/Event;->ClickContentTag:Lcom/papa/sim/statistic/Event;

    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p2, "1"

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    iget v3, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/BbsTagListBean;

    invoke-virtual {p3}, Lcom/join/mgps/dto/BbsTagListBean;->getId()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setFromTabId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v4

    new-instance p1, Lcom/papa/sim/statistic/Data;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Data;-><init>()V

    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    move-result-object v5

    const-string v3, ""

    invoke-virtual/range {v0 .. v5}, Lcom/papa/sim/statistic/p;->q1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    :cond_0
    return-void
.end method


# virtual methods
.method aftervidew()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->k:Landroid/content/Context;

    .line 2
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->q:Lcom/join/mgps/rpc/k;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "gameId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "draftUrl"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->o:Ljava/lang/String;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "isExpand"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->s:Z

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->e:Landroid/widget/TextView;

    iget-boolean v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->s:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-boolean v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->s:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    :goto_1
    iput v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->p:I

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 10
    iget-boolean v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->s:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f071236

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 11
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    if-nez v0, :cond_4

    .line 13
    new-instance v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    .line 14
    :cond_4
    new-instance v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    .line 15
    iput v2, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0711f4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 17
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$a;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$a;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    new-instance v1, Lcom/join/mgps/fragment/e1;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/e1;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;-><init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 21
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->loadData()V

    return-void
.end method

.method b0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0908e2
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/GameMainActivity4;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GameMainActivity4;->e2()V

    return-void
.end method

.method public c0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b0()V

    return-void
.end method

.method public getDraftUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "?"

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&gameId="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?gameId="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method hideLoading()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->m:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method loadData()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadingView()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestBbsTagListArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestBbsTagListArgs;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestBbsTagListArgs;->setGameId(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->k:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/RequestBbsTagListArgs;->setUid(I)V

    .line 7
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestBbsTagListArgs;->setUserToken(Ljava/lang/String;)V

    .line 8
    :cond_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->k:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/join/mgps/dto/RequestModel;-><init>(Landroid/content/Context;)V

    .line 9
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->q:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/join/mgps/rpc/k;->b(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    :try_start_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->hideLoading()V

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showMain(Ljava/util/List;)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadFailed()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadFailed()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadFailed()V

    goto :goto_0

    .line 19
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadFailed()V

    :goto_0
    return-void
.end method

.method onDraftClick()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Click;
        value = {
            0x7f0915cd
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->singleStartGamePageDetail:Lcom/papa/sim/statistic/Event;

    sget-object v3, Lcom/papa/sim/statistic/Event;->ClickcontributionButton:Lcom/papa/sim/statistic/Event;

    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v4, "1"

    invoke-virtual {v0, v4}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    new-instance v0, Lcom/papa/sim/statistic/Data;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Data;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    move-result-object v6

    const-string v4, ""

    invoke-virtual/range {v1 .. v6}, Lcom/papa/sim/statistic/p;->q1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->o:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->getDraftUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->loadData()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->k:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoadFailed()V
    .locals 1

    const-string v0, ""

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->showLoadFailed(Ljava/lang/String;)V

    return-void
.end method

.method showLoadFailed(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->m:Landroid/view/View;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLoadingView()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->l:Landroid/view/View;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->m:Landroid/view/View;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method showMain(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BbsTagListBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    if-eqz p1, :cond_4

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/BbsTagListBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/BbsTagListBean;->getId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_0

    .line 5
    iput v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 6
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    iget v2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/BbsTagListBean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/BbsTagListBean;->setSelected(Z)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->t:Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->r:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/BbsTagListBean;

    .line 10
    new-instance v3, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator_;

    invoke-direct {v3}, Lcom/join/kotlin/ui/introduction/ModIntroductionListFragmentForSimulator_;-><init>()V

    .line 11
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 12
    invoke-virtual {v2}, Lcom/join/mgps/dto/BbsTagListBean;->getId()Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_2

    const/4 v5, 0x0

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/BbsTagListBean;->getId()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_3
    const-string/jumbo v6, "tagId"

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 13
    iget-object v5, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->n:Ljava/lang/String;

    const-string v6, "gameId"

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget v5, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->p:I

    const-string v6, "column"

    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 15
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 16
    new-instance v4, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;

    invoke-virtual {v2}, Lcom/join/mgps/dto/BbsTagListBean;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v3}, Lcom/join/mgps/adapter/FragmentPagerAdapter$a;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 17
    :cond_3
    new-instance p1, Lcom/join/mgps/adapter/FragmentPagerAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-direct {p1, v0, v1}, Lcom/join/mgps/adapter/FragmentPagerAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->c:Landroidx/viewpager/widget/ViewPager;

    iget v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->j:I

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_4
    return-void
.end method
