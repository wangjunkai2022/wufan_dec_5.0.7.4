.class public Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SimulatorGoldFingerFunAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;I)V
    .locals 2
    .param p1    # Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;->a(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    invoke-static {p1}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;->b(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;)Lcom/facebook/drawee/view/SimpleDraweeView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    invoke-static {p1}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;->c(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    invoke-static {p1}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;->a(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    rem-int/2addr p2, v1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance p2, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;

    iget-object v0, p0, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c03ce

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;-><init>(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    const v0, 0x7fffffff

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;->a(Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter;->d(Landroid/view/ViewGroup;I)Lcom/join/mgps/adapter/SimulatorGoldFingerFunAdapter$a;

    move-result-object p1

    return-object p1
.end method
