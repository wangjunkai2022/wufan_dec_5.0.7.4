.class Lcom/join/mgps/activity/GameDetialModleFourActivity$k;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "GameDetialModleFourActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameDetialModleFourActivity;->afterView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/recyclerview/widget/LinearLayoutManager;

.field final synthetic b:Lcom/join/mgps/activity/GameDetialModleFourActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameDetialModleFourActivity;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->a:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    invoke-virtual {v0, p1, p2}, Lcom/join/android/app/component/video/c;->m(Landroidx/recyclerview/widget/RecyclerView;I)V

    :cond_0
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->a:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p3

    invoke-static {p2, p3}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W(Lcom/join/mgps/activity/GameDetialModleFourActivity;I)I

    .line 3
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p3, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->a:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p3

    invoke-static {p2, p3}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->Z(Lcom/join/mgps/activity/GameDetialModleFourActivity;I)I

    .line 4
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p3, p2, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->isHidden()Z

    move-result p2

    if-nez p2, :cond_0

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    iget-object p3, p2, Lcom/join/mgps/activity/GameDetialModleFourActivity;->W:Lcom/join/android/app/component/video/c;

    invoke-static {p2}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V(Lcom/join/mgps/activity/GameDetialModleFourActivity;)I

    move-result p2

    iget-object v0, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->X(Lcom/join/mgps/activity/GameDetialModleFourActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->V(Lcom/join/mgps/activity/GameDetialModleFourActivity;)I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/join/mgps/activity/GameDetialModleFourActivity$k;->b:Lcom/join/mgps/activity/GameDetialModleFourActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/GameDetialModleFourActivity;->a0(Lcom/join/mgps/activity/GameDetialModleFourActivity;)Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->getItemCount()I

    move-result v1

    invoke-virtual {p3, p1, p2, v0, v1}, Lcom/join/android/app/component/video/c;->i(Landroidx/recyclerview/widget/RecyclerView;III)V

    :cond_0
    return-void
.end method
