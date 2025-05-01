.class Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
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
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->g0(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->W(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method
