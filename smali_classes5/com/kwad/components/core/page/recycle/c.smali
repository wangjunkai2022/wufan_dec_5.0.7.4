.class public final Lcom/kwad/components/core/page/recycle/c;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field public final OH:Lcom/kwad/components/core/page/recycle/e;

.field public final mPresenter:Lcom/kwad/sdk/mvp/Presenter;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/kwad/sdk/mvp/Presenter;Lcom/kwad/components/core/page/recycle/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 2
    iput-object p3, p0, Lcom/kwad/components/core/page/recycle/c;->OH:Lcom/kwad/components/core/page/recycle/e;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/page/recycle/c;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 4
    invoke-virtual {p2, p1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    return-void
.end method
