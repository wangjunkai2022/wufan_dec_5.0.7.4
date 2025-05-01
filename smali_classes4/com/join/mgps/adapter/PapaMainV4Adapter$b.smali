.class Lcom/join/mgps/adapter/PapaMainV4Adapter$b;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "PapaMainV4Adapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/PapaMainV4Adapter;->C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/tabs/TabLayout;

.field final synthetic b:Lcom/join/mgps/dto/HomeRankingListBean;

.field final synthetic c:Lcom/join/mgps/adapter/PapaMainV4Adapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/google/android/material/tabs/TabLayout;Lcom/join/mgps/dto/HomeRankingListBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->a:Lcom/google/android/material/tabs/TabLayout;

    iput-object p3, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->b:Lcom/join/mgps/dto/HomeRankingListBean;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrolled(IFI)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->a:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setScrollPosition(IFZZ)V

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->a:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout$Tab;->select()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;->b:Lcom/join/mgps/dto/HomeRankingListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {v0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->y(Ljava/util/List;)V

    :cond_1
    return-void
.end method
