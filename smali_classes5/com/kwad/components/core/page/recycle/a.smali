.class public abstract Lcom/kwad/components/core/page/recycle/a;
.super Lcom/kwad/components/core/proxy/e;
.source "SourceFile"


# instance fields
.field private PW:Landroidx/recyclerview/widget/RecyclerView;

.field private PX:Lcom/kwad/components/core/page/recycle/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/e;-><init>()V

    return-void
.end method

.method private qj()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/page/recycle/a;->qn()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/proxy/e;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PW:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PW:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/kwad/components/core/page/recycle/a;->qm()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PW:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0}, Lcom/kwad/components/core/page/recycle/a;->a(Landroidx/recyclerview/widget/RecyclerView;)Lcom/kwad/components/core/page/recycle/d;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PX:Lcom/kwad/components/core/page/recycle/d;

    return-void
.end method

.method private qk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PW:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/kwad/components/core/page/recycle/a;->PX:Lcom/kwad/components/core/page/recycle/d;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private qm()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;
    .locals 2

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/kwad/components/core/proxy/e;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private static qn()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$id;->ksad_recycler_view:I

    return v0
.end method


# virtual methods
.method protected abstract a(Landroidx/recyclerview/widget/RecyclerView;)Lcom/kwad/components/core/page/recycle/d;
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/proxy/e;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->onDestroyView()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PW:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->clearOnChildAttachStateChangeListeners()V

    return-void
.end method

.method public onPause()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->onResume()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/sdk/api/core/fragment/KsFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/page/recycle/a;->qj()V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/page/recycle/a;->qk()V

    return-void
.end method

.method public final ql()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/recycle/a;->PW:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method
