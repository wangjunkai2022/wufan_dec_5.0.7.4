.class Lcom/join/mgps/adapter/PapaMainV2Adapter$l;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "l"
.end annotation


# instance fields
.field private a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private b:Lcom/join/mgps/customview/SlidingTabLayout6;

.field private c:Lcom/join/mgps/customview/RecyclerviewViewpager;

.field private d:Landroid/widget/LinearLayout;

.field final synthetic e:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/PapaMainV2Adapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->e:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0911a2

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    const p1, 0x7f091356

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/SlidingTabLayout6;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->b:Lcom/join/mgps/customview/SlidingTabLayout6;

    const p1, 0x7f0917b0

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/RecyclerviewViewpager;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->c:Lcom/join/mgps/customview/RecyclerviewViewpager;

    const p1, 0x7f090e60

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->d:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/RecyclerviewViewpager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->c:Lcom/join/mgps/customview/RecyclerviewViewpager;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Lcom/join/mgps/customview/SlidingTabLayout6;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->b:Lcom/join/mgps/customview/SlidingTabLayout6;

    return-object p0
.end method

.method static synthetic d(Lcom/join/mgps/adapter/PapaMainV2Adapter$l;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$l;->d:Landroid/widget/LinearLayout;

    return-object p0
.end method
