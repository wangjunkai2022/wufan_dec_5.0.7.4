.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorLaunchMomentFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private a:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroidx/constraintlayout/widget/Group;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroidx/recyclerview/widget/RecyclerView;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/view/View;

.field final synthetic k:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->k:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0908d5

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f091537

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->b:Landroid/widget/TextView;

    const p1, 0x7f09150d

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->c:Landroid/widget/TextView;

    const p1, 0x7f090712

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/Group;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->d:Landroidx/constraintlayout/widget/Group;

    const p1, 0x7f0914f1

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e:Landroid/widget/TextView;

    const p1, 0x7f0908eb

    .line 8
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->f:Landroid/widget/ImageView;

    const p1, 0x7f091531

    .line 9
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->g:Landroid/widget/TextView;

    const p1, 0x7f0911b3

    .line 10
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->h:Landroidx/recyclerview/widget/RecyclerView;

    const p1, 0x7f090cb5

    .line 11
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->i:Landroid/widget/LinearLayout;

    const p1, 0x7f0914cf

    .line 12
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->j:Landroid/view/View;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->b:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->c:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/constraintlayout/widget/Group;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->d:Landroidx/constraintlayout/widget/Group;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->e:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->h:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic f(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->f:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic g(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->g:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->i:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic i(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->j:Landroid/view/View;

    return-object p0
.end method

.method static synthetic j(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;)Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$g;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object p0
.end method
