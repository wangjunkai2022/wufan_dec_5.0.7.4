.class Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorLaunchAchievementFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/ProgressBar;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroidx/recyclerview/widget/RecyclerView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroidx/recyclerview/widget/RecyclerView;

.field private j:Landroid/widget/TextView;

.field final synthetic k:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->k:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091572

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->a:Landroid/widget/TextView;

    const p1, 0x7f090cc4

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->b:Landroid/widget/LinearLayout;

    const p1, 0x7f09154b

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->c:Landroid/widget/TextView;

    const p1, 0x7f09104a

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->d:Landroid/widget/ProgressBar;

    const p1, 0x7f090cce

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->e:Landroid/widget/LinearLayout;

    const p1, 0x7f0911b5

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->f:Landroidx/recyclerview/widget/RecyclerView;

    const p1, 0x7f091584

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->g:Landroid/widget/TextView;

    const p1, 0x7f090cb7

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->h:Landroid/widget/LinearLayout;

    const p1, 0x7f0911b4

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->i:Landroidx/recyclerview/widget/RecyclerView;

    const p1, 0x7f091534

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->j:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->c:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->d:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->e:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->f:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->g:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->h:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->i:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$e;->j:Landroid/widget/TextView;

    return-object p0
.end method
