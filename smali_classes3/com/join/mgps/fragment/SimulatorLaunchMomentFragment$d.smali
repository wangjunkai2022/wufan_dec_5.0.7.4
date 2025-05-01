.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SimulatorLaunchMomentFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->lambda$onBindViewHolder$0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->e(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;ILandroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->d(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;ILandroid/view/View;)V

    return-void
.end method

.method private synthetic d(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isExpand()Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    invoke-virtual {p1, p4}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->setExpand(Z)V

    .line 2
    invoke-virtual {p2, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->l(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;)V

    .line 3
    iget-object p4, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->a:Ljava/util/List;

    invoke-interface {p4, p3, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isExpand()Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_0
    return-void
.end method

.method private synthetic e(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isPraised()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p1, p2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->d0(I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p1, p2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->c0(I)V

    :goto_0
    return-void
.end method

.method private synthetic lambda$onBindViewHolder$0(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/activity/GameMainActivity4_;

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/GameMainActivity4_;

    invoke-virtual {p1}, Lcom/join/mgps/activity/GameMainActivity4;->d2()V

    :cond_0
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->X(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    invoke-virtual {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->getType()I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 10
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->getItemViewType(I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eq v0, v3, :cond_d

    const/4 v6, 0x3

    if-eq v0, v2, :cond_3

    if-eq v0, v6, :cond_0

    goto/16 :goto_d

    .line 3
    :cond_0
    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;

    .line 4
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f080dde

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 7
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->d(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->f()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_d

    .line 9
    :cond_3
    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->d()Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    move-result-object v0

    .line 11
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->j(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getAvatar()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 12
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getNickname()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getAchievements()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getAchievements()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_4

    goto/16 :goto_4

    .line 14
    :cond_4
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/constraintlayout/widget/Group;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 16
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->d(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDescribe()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 18
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 19
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    new-instance v7, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v8, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v7, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v7}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 20
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getAchievements()Ljava/util/List;

    move-result-object v2

    .line 21
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    if-le v7, v6, :cond_5

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isExpand()Z

    move-result v7

    if-nez v7, :cond_5

    .line 23
    invoke-interface {v2, v5, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v7

    goto :goto_2

    :cond_5
    move-object v7, v2

    .line 24
    :goto_2
    new-instance v8, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$c;

    iget-object v9, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {v8, v9, v7}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$c;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Ljava/util/List;)V

    .line 25
    invoke-virtual {v8, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 26
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v3, v7}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 27
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v6, :cond_7

    .line 28
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c040f

    invoke-virtual {v2, v3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09151a

    .line 29
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 30
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isExpand()Z

    move-result v6

    if-eqz v6, :cond_6

    const-string/jumbo v6, "\u6536\u8d77"

    goto :goto_3

    :cond_6
    const-string/jumbo v6, "\u67e5\u770b\u5168\u90e8"

    :goto_3
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    new-instance v6, Lcom/join/mgps/fragment/j1;

    invoke-direct {v6, p0, v0, v1, p2}, Lcom/join/mgps/fragment/j1;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;I)V

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    invoke-virtual {v8, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->addFooterView(Landroid/view/View;)I

    .line 33
    :cond_7
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto :goto_5

    .line 34
    :cond_8
    :goto_4
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 35
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/constraintlayout/widget/Group;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 36
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDescribe()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    :goto_5
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->f(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isSupportPraise()Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    goto :goto_6

    :cond_9
    const/16 v3, 0x8

    :goto_6
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 38
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->g(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isSupportPraise()Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, 0x0

    goto :goto_7

    :cond_a
    const/16 v3, 0x8

    :goto_7
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 39
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->f(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isPraised()Z

    move-result v3

    if-eqz v3, :cond_b

    const v3, 0x7f080929

    goto :goto_8

    :cond_b
    const v3, 0x7f08092c

    :goto_8
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->g(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getPraiseCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->h(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/LinearLayout;

    move-result-object v2

    new-instance v3, Lcom/join/mgps/fragment/i1;

    invoke-direct {v3, p0, v0, p2}, Lcom/join/mgps/fragment/i1;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;I)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->i(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->f()Z

    move-result p2

    if-eqz p2, :cond_c

    goto :goto_9

    :cond_c
    const/4 v4, 0x0

    :goto_9
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_d

    .line 43
    :cond_d
    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;

    .line 44
    invoke-virtual {v1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$e;->b()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_15

    .line 45
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_e

    goto/16 :goto_e

    .line 46
    :cond_e
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 47
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const-string/jumbo v1, "\u6682\u65e0\u7edf\u8ba1"

    if-lez v0, :cond_10

    .line 48
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getDesc()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_f

    move-object v4, v1

    goto :goto_a

    :cond_f
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getDesc()Ljava/lang/String;

    move-result-object v4

    :goto_a
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    :cond_10
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v3, :cond_12

    .line 51
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->d(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v4}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getDesc()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_11

    goto :goto_b

    :cond_11
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getDesc()Ljava/lang/String;

    move-result-object v1

    :goto_b
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    :cond_12
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_14

    .line 54
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->f(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object v0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getDesc()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_13

    const-string p2, "0\u4eba"

    goto :goto_c

    :cond_13
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$BasicInfo;->getDesc()Ljava/lang/String;

    move-result-object p2

    :goto_c
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :cond_14
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;->g(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;)Landroid/widget/TextView;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/fragment/h1;

    invoke-direct {p2, p0}, Lcom/join/mgps/fragment/h1;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_d
    return-void

    .line 57
    :cond_15
    :goto_e
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 1
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0530

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;

    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Landroid/view/View;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c052f

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance p2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;

    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Landroid/view/View;)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c052e

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;

    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$f;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Landroid/view/View;)V

    :goto_0
    move-object p1, p2

    :goto_1
    return-object p1
.end method
