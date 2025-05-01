.class Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$a;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "SimulatorFastEntryHomeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$a;->a:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;

    invoke-direct {p0, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public canScrollVertically()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
