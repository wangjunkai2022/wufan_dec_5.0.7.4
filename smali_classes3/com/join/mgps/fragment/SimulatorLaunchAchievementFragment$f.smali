.class Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorLaunchAchievementFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field private a:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ProgressBar;

.field private g:Landroidx/constraintlayout/widget/Group;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/view/View;

.field private k:Landroidx/constraintlayout/widget/ConstraintLayout;

.field final synthetic l:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->l:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0908d2

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f0914f0

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->b:Landroid/widget/TextView;

    const p1, 0x7f0914f2

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->c:Landroid/widget/TextView;

    const p1, 0x7f0914ef

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->d:Landroid/widget/TextView;

    const p1, 0x7f09154b

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->e:Landroid/widget/TextView;

    const p1, 0x7f09104a

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->f:Landroid/widget/ProgressBar;

    const p1, 0x7f091056

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/Group;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->g:Landroidx/constraintlayout/widget/Group;

    const p1, 0x7f0914ce

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->h:Landroid/view/View;

    const p1, 0x7f0914d0

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->i:Landroid/view/View;

    const p1, 0x7f0914d1

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->j:Landroid/view/View;

    const p1, 0x7f090300

    .line 13
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->b:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->d:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->c:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/Group;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->g:Landroidx/constraintlayout/widget/Group;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->e:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic g(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->f:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->j:Landroid/view/View;

    return-object p0
.end method

.method static synthetic i(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->i:Landroid/view/View;

    return-object p0
.end method

.method static synthetic j(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;)Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$f;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object p0
.end method
