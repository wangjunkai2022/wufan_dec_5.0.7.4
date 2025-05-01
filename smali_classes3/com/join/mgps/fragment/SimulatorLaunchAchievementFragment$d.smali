.class Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SimulatorLaunchAchievementFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
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
            "Lcom/join/mgps/dto/UnlockBean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/UnlockBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->lambda$onBindViewHolder$0(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->c(Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->V(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;I)V

    return-void
.end method

.method private synthetic lambda$onBindViewHolder$0(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/UnlockBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/UnlockBean;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-static {v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;->V(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;I)V

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/UnlockBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/UnlockBean;->getType()I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 8
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0, p2}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->getItemViewType(I)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/UnlockBean;

    const-string v1, "/"

    const/4 v2, 0x1

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eq v0, v2, :cond_7

    const/4 v5, 0x2

    if-eq v0, v5, :cond_5

    const/4 v5, 0x3

    if-eq v0, v5, :cond_0

    goto/16 :goto_b

    .line 3
    :cond_0
    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->getAchievementBean()Lcom/join/mgps/dto/SimulatorAchievementBean;

    move-result-object p2

    .line 5
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "\u60a8\u5df2\u5b8c\u6210"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getDone()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getTarget()I

    move-result v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getTarget()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 7
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getDone()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getUnlock_achievements()Ljava/util/List;

    move-result-object v0

    const-string v1, "+"

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getUnlock_achievements()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 9
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 10
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v6, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6, v4, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 11
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v5, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$b;

    iget-object v6, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getUnlock_achievements()Ljava/util/List;

    move-result-object v7

    invoke-direct {v5, v6, v7, v4}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$b;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Ljava/util/List;Z)V

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 12
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 13
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->e(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getUnlock_achievements_num()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->e(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getUnlock_achievements_num()I

    move-result v5

    if-gtz v5, :cond_1

    const/16 v5, 0x8

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 15
    :cond_2
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 16
    :goto_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getLock_achievements()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getLock_achievements()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 17
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->f(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 18
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v6, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6, v4, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 19
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v5, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$b;

    iget-object v6, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getLock_achievements()Ljava/util/List;

    move-result-object v7

    invoke-direct {v5, v6, v7, v2}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$b;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Ljava/util/List;Z)V

    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 20
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 21
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->h(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getLock_achievements_num()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->h(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean;->getLock_achievements_num()I

    move-result p2

    if-gtz p2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 23
    :cond_4
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->f(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/LinearLayout;

    move-result-object p2

    invoke-virtual {p2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    :goto_3
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->h(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object p2

    new-instance v0, Lcom/join/mgps/fragment/f1;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/f1;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->e(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/fragment/g1;

    invoke-direct {p2, p0}, Lcom/join/mgps/fragment/g1;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_b

    .line 26
    :cond_5
    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;

    .line 27
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->getTimeDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;)Landroidx/cardview/widget/CardView;

    move-result-object p1

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isLockTitle()Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "#4E5B65"

    goto :goto_4

    :cond_6
    const-string p2, "#2892EC"

    :goto_4
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    goto/16 :goto_b

    .line 30
    :cond_7
    check-cast p1, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;

    .line 31
    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->getInfo()Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;

    move-result-object v0

    .line 32
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v5

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getIcon()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 33
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getCondition()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isLock()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getUnlock_rate()I

    move-result v6

    if-lez v6, :cond_8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getUnlock_rate()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "%\u73a9\u5bb6\u5df2\u89e3\u9501"

    goto :goto_5

    :cond_8
    const-string/jumbo v6, "\u8fd8\u6ca1\u4eba\u89e3\u9501,\u5feb\u6765\u6311\u6218"

    goto :goto_6

    :cond_9
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getUnlock_date()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getUnlock_time()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v7, "\u5b8c\u6210"

    :goto_5
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_6
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isLock()Z

    move-result v6

    if-eqz v6, :cond_a

    const-string v6, "#A4C2E0"

    goto :goto_7

    :cond_a
    const-string v6, "#82888E"

    :goto_7
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->e(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/Group;

    move-result-object v5

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getTarget()I

    move-result v6

    if-le v6, v2, :cond_b

    const/4 v2, 0x0

    goto :goto_8

    :cond_b
    const/16 v2, 0x8

    :goto_8
    invoke-virtual {v5, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 38
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->f(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getDone()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getTarget()I

    move-result v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getTarget()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 40
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getDone()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 41
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->h(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isFirst()Z

    move-result v1

    if-eqz v1, :cond_c

    const/16 v1, 0x8

    goto :goto_9

    :cond_c
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->i(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isLast()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_a

    :cond_d
    const/4 v3, 0x0

    :goto_a
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 43
    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isFirst()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isLast()Z

    move-result v0

    if-nez v0, :cond_e

    .line 44
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->j(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "#212832"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    goto :goto_b

    .line 45
    :cond_e
    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isFirst()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isLast()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 46
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->j(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const p2, 0x7f080ce5

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_b

    .line 47
    :cond_f
    invoke-virtual {p2}, Lcom/join/mgps/dto/UnlockBean;->isFirst()Z

    move-result p2

    if-eqz p2, :cond_10

    .line 48
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->j(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const p2, 0x7f080ce7

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    goto :goto_b

    .line 49
    :cond_10
    invoke-static {p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->j(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const p2, 0x7f080ce6

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    :goto_b
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
    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0529

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;

    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/view/View;)V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c052c

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 4
    new-instance p2, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;

    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/view/View;)V

    goto :goto_0

    .line 5
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c052b

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;

    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$d;->b:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;-><init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/view/View;)V

    :goto_0
    move-object p1, p2

    :goto_1
    return-object p1
.end method
