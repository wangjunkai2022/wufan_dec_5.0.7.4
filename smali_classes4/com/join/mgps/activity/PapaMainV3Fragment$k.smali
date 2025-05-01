.class Lcom/join/mgps/activity/PapaMainV3Fragment$k;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "PapaMainV3Fragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV3Fragment;->a1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainV3Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v0, p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->B0(Lcom/join/mgps/activity/PapaMainV3Fragment;Landroidx/recyclerview/widget/RecyclerView;I)V

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
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object p2, p1, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getLastVisiblePosition()I

    move-result p2

    invoke-static {p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->d0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)I

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object p2, p1, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getFirstVisiblePosition()I

    move-result p2

    invoke-static {p1, p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->f0(Lcom/join/mgps/activity/PapaMainV3Fragment;I)I

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/MGMainActivity;

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->e0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result p2

    iget-object p3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->g0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result p3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lt p2, p3, :cond_1

    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->g0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->h0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z

    move-result p2

    if-ne p2, v1, :cond_0

    .line 7
    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MGMainActivity;->setHomeTabImage(Z)V

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p1, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z

    goto :goto_0

    .line 9
    :cond_1
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->c0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result p2

    add-int/2addr p2, v1

    iget-object p3, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p3}, Lcom/join/mgps/activity/PapaMainV3Fragment;->g0(Lcom/join/mgps/activity/PapaMainV3Fragment;)I

    move-result p3

    if-ge p2, p3, :cond_3

    .line 10
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p2}, Lcom/join/mgps/activity/PapaMainV3Fragment;->h0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 11
    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/MGMainActivity;->setHomeTabImage(Z)V

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p1, v1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->i0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z

    .line 13
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->q0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->j0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Lcom/join/mgps/adapter/PapaMainV2Adapter;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object p2, p2, Lcom/join/mgps/activity/PapaMainV3Fragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;

    invoke-virtual {p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView2;->getFirstCompletelyVisiblePosition()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/adapter/PapaMainV2Adapter;->v(I)Lcom/join/mgps/dto/MgpapaMainItemBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getPage()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_4

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-virtual {p1}, Lcom/join/mgps/activity/PapaMainV3Fragment;->T1()V

    .line 15
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string p2, "homeHasNewData"

    .line 16
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    iget-object p2, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    iget-object p2, p2, Lcom/join/mgps/activity/PapaMainV3Fragment;->I:Lcom/join/mgps/pref/f;

    invoke-interface {p2, p1}, Lcom/join/mgps/pref/f;->callHomePageNewData(Landroid/os/Bundle;)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$k;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {p1, v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->s0(Lcom/join/mgps/activity/PapaMainV3Fragment;Z)Z

    :cond_4
    return-void
.end method
