.class Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SimulatorExitPlayFriendAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Lcom/facebook/drawee/view/SimpleDraweeView;

.field final synthetic b:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$b;->b:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090810

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$b;->a:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-void
.end method
