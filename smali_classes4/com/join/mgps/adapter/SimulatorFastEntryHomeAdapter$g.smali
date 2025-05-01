.class Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorFastEntryHomeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private a:Landroidx/viewpager/widget/ViewPager;

.field private b:Lcom/join/mgps/customview/CirclePageIndicator;

.field final synthetic c:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;->c:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0917c8

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/viewpager/widget/ViewPager;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;->a:Landroidx/viewpager/widget/ViewPager;

    const p1, 0x7f090867

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/CirclePageIndicator;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;->b:Lcom/join/mgps/customview/CirclePageIndicator;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;->a:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;)Lcom/join/mgps/customview/CirclePageIndicator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;->b:Lcom/join/mgps/customview/CirclePageIndicator;

    return-object p0
.end method
