.class Lcom/join/mgps/adapter/PapaMainV2Adapter$j;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "PapaMainV2Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/PapaMainV2Adapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation


# instance fields
.field private a:Landroid/widget/FrameLayout;

.field private b:Lcom/join/mgps/customview/HorizontalRecyclerView;

.field final synthetic c:Lcom/join/mgps/adapter/PapaMainV2Adapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/PapaMainV2Adapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/PapaMainV2Adapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->c:Lcom/join/mgps/adapter/PapaMainV2Adapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0910e9

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/HorizontalRecyclerView;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->b:Lcom/join/mgps/customview/HorizontalRecyclerView;

    const p1, 0x7f0905a7

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->a:Landroid/widget/FrameLayout;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/PapaMainV2Adapter$j;)Lcom/join/mgps/customview/HorizontalRecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV2Adapter$j;->b:Lcom/join/mgps/customview/HorizontalRecyclerView;

    return-object p0
.end method
