.class Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorFastEntryHomeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic c:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;->c:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090cb9

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;->a:Landroid/widget/LinearLayout;

    const p1, 0x7f0911b7

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;->b:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;->b:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$f;->a:Landroid/widget/LinearLayout;

    return-object p0
.end method
