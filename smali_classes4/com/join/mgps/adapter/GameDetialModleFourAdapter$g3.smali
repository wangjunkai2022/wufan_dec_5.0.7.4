.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;
.super Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;
.source "GameDetialModleFourAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g3"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;
    }
.end annotation


# instance fields
.field a:Landroidx/recyclerview/widget/RecyclerView;

.field b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Landroid/view/View;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    .line 2
    invoke-direct {p0, p2}, Lcom/join/mgps/viewholder/ViewHolderGameDetialMain;-><init>(Landroid/view/View;)V

    const v0, 0x7f0911d4

    .line 3
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance p2, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$a;

    invoke-static {p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p2, p0, v0, v1, p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$a;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;Landroid/content/Context;ILcom/join/mgps/adapter/GameDetialModleFourAdapter;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    iget-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->a:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$b;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 7
    new-instance p1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;

    invoke-direct {p1, p0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;-><init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;)V

    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;

    .line 8
    iget-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    return-void
.end method
