.class Lcom/join/mgps/fragment/FriendFragment$a;
.super Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;
.source "FriendFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/FriendFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/FriendFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FriendFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FriendFragment$a;->a:Lcom/join/mgps/fragment/FriendFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;->onChanged()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendFragment$a;->a:Lcom/join/mgps/fragment/FriendFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/FriendFragment;->g0(Lcom/join/mgps/fragment/FriendFragment;)Lcom/join/mgps/adapter/FriendListAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/fragment/FriendFragment$a;->a:Lcom/join/mgps/fragment/FriendFragment;

    iget-object v1, v0, Lcom/join/mgps/fragment/FriendFragment;->i:Landroid/view/View;

    if-eqz v1, :cond_1

    .line 3
    invoke-static {v0}, Lcom/join/mgps/fragment/FriendFragment;->g0(Lcom/join/mgps/fragment/FriendFragment;)Lcom/join/mgps/adapter/FriendListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/adapter/FriendListAdapter;->getItemCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendFragment$a;->a:Lcom/join/mgps/fragment/FriendFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/FriendFragment;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendFragment$a;->a:Lcom/join/mgps/fragment/FriendFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/FriendFragment;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method
