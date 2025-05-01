.class Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorFastEntryHomeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/LinearLayout;

.field final synthetic c:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;->c:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091461

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;->a:Landroid/widget/TextView;

    const p1, 0x7f090cb9

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;->b:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;->a:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$k;->b:Landroid/widget/LinearLayout;

    return-object p0
.end method
