.class Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;
.super Ljava/lang/Object;
.source "MyGamePapaFavVpFragment.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


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
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    iget-object p1, p1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    if-eq p1, p3, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    iget-object p1, p1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1, p3}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-virtual {p1, p3}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->g0(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;->a:Lcom/join/mgps/activity/MyGamePapaFavVpFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->W(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method
