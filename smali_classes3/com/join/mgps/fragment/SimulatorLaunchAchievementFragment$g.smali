.class Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorLaunchAchievementFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroidx/cardview/widget/CardView;

.field final synthetic d:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->d:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091571

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->a:Landroid/widget/TextView;

    const p1, 0x7f0902f8

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->b:Landroid/widget/ImageView;

    const p1, 0x7f091372

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/cardview/widget/CardView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->c:Landroidx/cardview/widget/CardView;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->a:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->b:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;)Landroidx/cardview/widget/CardView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$g;->c:Landroidx/cardview/widget/CardView;

    return-object p0
.end method
