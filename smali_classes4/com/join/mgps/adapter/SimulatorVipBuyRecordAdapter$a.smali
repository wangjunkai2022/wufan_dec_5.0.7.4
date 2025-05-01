.class Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorVipBuyRecordAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private c:Landroid/widget/TextView;

.field final synthetic d:Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->d:Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f09151b

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->a:Landroid/widget/TextView;

    const p1, 0x7f0908d5

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f09150d

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->c:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->a:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;)Lcom/facebook/drawee/view/SimpleDraweeView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-object p0
.end method

.method static synthetic c(Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SimulatorVipBuyRecordAdapter$a;->c:Landroid/widget/TextView;

    return-object p0
.end method
