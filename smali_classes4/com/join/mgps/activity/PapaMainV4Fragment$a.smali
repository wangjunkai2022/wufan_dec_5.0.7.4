.class Lcom/join/mgps/activity/PapaMainV4Fragment$a;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "PapaMainV4Fragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4Fragment;->V()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainV4Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$a;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrolled(IFI)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$a;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object p3, p3, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, Lcom/google/android/material/tabs/TabLayout;->setScrollPosition(IFZZ)V

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$a;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$a;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->select()V

    :cond_0
    return-void
.end method
