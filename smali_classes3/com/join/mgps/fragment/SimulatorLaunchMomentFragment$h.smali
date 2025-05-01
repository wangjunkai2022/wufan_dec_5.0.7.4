.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorLaunchMomentFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;

.field final synthetic f:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->f:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091571

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->a:Landroid/widget/TextView;

    const p1, 0x7f0902f8

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->b:Landroid/widget/ImageView;

    const p1, 0x7f0914ce

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->c:Landroid/view/View;

    const p1, 0x7f0914d0

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->d:Landroid/view/View;

    const p1, 0x7f0914d1

    .line 7
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->e:Landroid/view/View;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->a:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->b:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->c:Landroid/view/View;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->e:Landroid/view/View;

    return-object p0
.end method

.method static synthetic e(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$h;->d:Landroid/view/View;

    return-object p0
.end method
