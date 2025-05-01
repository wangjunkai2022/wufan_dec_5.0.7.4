.class public Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "FriendListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/FriendListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FriendHeaderViewHolder"
.end annotation


# instance fields
.field public a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/view/View;

.field final synthetic d:Lcom/join/mgps/adapter/FriendListAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/FriendListAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/FriendListAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;->d:Lcom/join/mgps/adapter/FriendListAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f09077a

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;->a:Landroid/widget/ImageView;

    const p1, 0x7f090f66

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;->b:Landroid/widget/TextView;

    const p1, 0x7f0900a5

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;->c:Landroid/view/View;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;->b:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/FriendListAdapter$FriendHeaderViewHolder;->c:Landroid/view/View;

    return-object p0
.end method
