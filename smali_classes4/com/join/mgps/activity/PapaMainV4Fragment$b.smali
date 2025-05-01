.class Lcom/join/mgps/activity/PapaMainV4Fragment$b;
.super Ljava/lang/Object;
.source "PapaMainV4Fragment.java"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;


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
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4Fragment;->g:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v1, v1, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v1, v1, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09135c

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v4

    if-eqz v4, :cond_0

    const v4, 0x7f071279

    goto :goto_1

    :cond_0
    const v4, 0x7f07124c

    :goto_1
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {v2, p1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v3, 0x0

    .line 7
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v1

    invoke-virtual {v2, v3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4Fragment;->g:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v1, v1, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    iget-object v1, v1, Lcom/join/mgps/activity/PapaMainV4Fragment;->f:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v2

    const v3, 0x7f09135c

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 6
    iget-object v3, p0, Lcom/join/mgps/activity/PapaMainV4Fragment$b;->a:Lcom/join/mgps/activity/PapaMainV4Fragment;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v4

    if-eqz v4, :cond_0

    const v4, 0x7f071279

    goto :goto_1

    :cond_0
    const v4, 0x7f07124c

    :goto_1
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {v2, p1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v3, 0x0

    .line 7
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->isSelected()Z

    move-result v1

    invoke-virtual {v2, v3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onTabUnselected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
