.class Lcom/join/mgps/adapter/FriendAddAdapter$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "FriendAddAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/FriendAddAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/widget/TextView;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/TextView;

.field public d:Lcom/facebook/drawee/view/SimpleDraweeView;

.field final synthetic e:Lcom/join/mgps/adapter/FriendAddAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/FriendAddAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/FriendAddAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/FriendAddAdapter$b;->e:Lcom/join/mgps/adapter/FriendAddAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090ea1

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendAddAdapter$b;->a:Landroid/widget/TextView;

    const p1, 0x7f0903f9

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendAddAdapter$b;->b:Landroid/widget/TextView;

    const p1, 0x7f09027f

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendAddAdapter$b;->c:Landroid/widget/TextView;

    const p1, 0x7f09012d

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/FriendAddAdapter$b;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    return-void
.end method
