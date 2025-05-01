.class Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "StandardEliteRoomFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;->a:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;->a:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;->c0(Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;->a:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/activity/arena/GameRoomListActivity;

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment$h;->a:Lcom/join/mgps/fragment/roomlist/StandardEliteRoomFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/arena/GameRoomListActivity;

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/arena/GameRoomListActivity;->H2(I)V

    :cond_1
    return-void
.end method
