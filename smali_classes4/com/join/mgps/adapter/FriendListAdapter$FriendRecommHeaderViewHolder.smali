.class public Lcom/join/mgps/adapter/FriendListAdapter$FriendRecommHeaderViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "FriendListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/FriendListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FriendRecommHeaderViewHolder"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Landroid/view/View;

.field final synthetic c:Lcom/join/mgps/adapter/FriendListAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/FriendListAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/FriendListAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendRecommHeaderViewHolder;->c:Lcom/join/mgps/adapter/FriendListAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090bfb

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendRecommHeaderViewHolder;->b:Landroid/view/View;

    const p1, 0x7f091118

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendRecommHeaderViewHolder;->a:Landroid/view/View;

    return-void
.end method
