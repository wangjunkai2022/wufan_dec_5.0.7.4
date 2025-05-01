.class Lcom/join/mgps/activity/MyGamePapaFavVpFragment$a;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "MyGamePapaFavVpFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$a;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

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

    if-nez p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$a;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->V(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$a;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    iget p2, p1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->e:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->e:I

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->a0()V

    :cond_0
    return-void
.end method
