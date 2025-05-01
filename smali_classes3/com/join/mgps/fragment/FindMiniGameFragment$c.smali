.class Lcom/join/mgps/fragment/FindMiniGameFragment$c;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "FindMiniGameFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/FindMiniGameFragment;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/FindMiniGameFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/FindMiniGameFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$c;->a:Lcom/join/mgps/fragment/FindMiniGameFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$c;->a:Lcom/join/mgps/fragment/FindMiniGameFragment;

    iget-object p1, p1, Lcom/join/mgps/fragment/FindMiniGameFragment;->l:Lcom/join/android/app/component/video/g;

    if-eqz p1, :cond_0

    const/4 p2, 0x2

    .line 3
    invoke-virtual {p1, p2}, Lcom/join/android/app/component/video/g;->f(I)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/FindMiniGameFragment$c;->a:Lcom/join/mgps/fragment/FindMiniGameFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/FindMiniGameFragment;->Z(Lcom/join/mgps/fragment/FindMiniGameFragment;)V

    :cond_1
    return-void
.end method
