.class public Lcom/join/mgps/fragment/EndGameDetailRankingFragment;
.super Landroidx/fragment/app/Fragment;
.source "EndGameDetailRankingFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0261
.end annotation


# instance fields
.field b:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Lcom/join/mgps/dto/EndGameDetailBean;
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private l:Landroid/content/Context;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

.field private o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->o:I

    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->f0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V

    return-void
.end method

.method static synthetic W(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->o:I

    return p0
.end method

.method static synthetic X(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->o:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->o:I

    return v0
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->c0(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->l:Landroid/content/Context;

    return-object p0
.end method

.method private c0(I)Ljava/lang/String;
    .locals 5

    int-to-float p1, p1

    const/high16 v0, 0x447a0000    # 1000.0f

    div-float/2addr p1, v0

    const-string/jumbo v0, "\u79d2"

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

    const-string/jumbo v1, "\u5206"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic f0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

    return-void
.end method


# virtual methods
.method b0()V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->l:Landroid/content/Context;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getRankingList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->m:Ljava/util/List;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->l:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    new-instance v0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->m:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0221

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setEmptyView(Landroid/view/View;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    new-instance v1, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$a;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)V

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnLoadMoreListener(Lcom/join/mgps/base/BaseQuickAdapter$l;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean;->getMyRankings()Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;

    move-result-object v0

    const/4 v1, 0x4

    if-eqz v0, :cond_1

    .line 10
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i:Landroid/widget/RelativeLayout;

    const-string v3, "#FAFAFA"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "\u7b2c"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getRanking()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v5, "\u540d"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getAvatar()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 14
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getElapsedTime()I

    move-result v3

    invoke-direct {p0, v3}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->c0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getChange()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->isPlayback()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x4

    :goto_0
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->j:Landroid/widget/ImageView;

    new-instance v2, Lcom/join/mgps/fragment/o;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/fragment/o;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b:Landroid/widget/TextView;

    const-string v2, "--"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->c:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e:Landroid/widget/TextView;

    const-string/jumbo v3, "\u6682\u65e0\u8bb0\u5f55"

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 25
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method d0(I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameDetailArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setGameId(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setEndgameId(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setUid(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/RequestEndGameDetailArgs;->setPage(I)V

    .line 7
    new-instance p1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/rpc/impl/i;->g(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->updateUi(Ljava/util/List;)V

    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100299

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->showTost(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method e0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Lcom/join/mgps/dto/EndGameRecordArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/EndGameRecordArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameRecordArgs;->setEndgameId(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameRecordArgs;->setUid(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getChallengeId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameRecordArgs;->setChallengeId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/EndGameRecordArgs;->setOwnerUid(Ljava/lang/String;)V

    .line 7
    new-instance p1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {p1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/rpc/impl/i;->n0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 13
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->g0(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string/jumbo p1, "\u83b7\u53d6\u56de\u653e\u5730\u5740\u5931\u8d25"

    .line 14
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->showTost(Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f100299

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->showTost(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/join/mgps/Util/v;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/record/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->l:Landroid/content/Context;

    const/4 v0, 0x0

    const-string/jumbo v1, "\u56de\u653e\u5931\u8d25\uff01"

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_1
    const-string v1, "/"

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->i0(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {}, Lcom/join/android/app/common/http/d;->B()Lcom/join/android/app/common/http/d$j;

    move-result-object v1

    new-instance v2, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;

    invoke-direct {v2, p0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$b;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;)V

    invoke-virtual {v1, p1, v0, v2}, Lcom/join/android/app/common/http/d$j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/join/android/app/common/http/d$p;)V

    :goto_0
    return-void

    .line 11
    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity_;->G0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->a(Lcom/join/mgps/dto/EndGameBean;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->d(I)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->c(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method public h0(Lcom/join/mgps/dto/EndGameDetailBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->h:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->o:I

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->b0()V

    return-void
.end method

.method i0(Ljava/lang/String;)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->l:Landroid/content/Context;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->k:Lcom/join/mgps/dto/EndGameDetailBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/EndGameDetailBean;->getEndgameInfo()Lcom/join/mgps/dto/EndGameBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    const/16 v3, 0xf

    const/4 v5, 0x1

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lcom/join/mgps/Util/UtilsMy;->j4(Landroid/content/Context;Ljava/lang/String;Lcom/github/snowdream/android/app/downloader/DownloadTask;ILjava/lang/String;Z)Z

    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method updateUi(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->addData(Ljava/util/Collection;)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->n:Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreEnd(Z)V

    :goto_1
    return-void
.end method
