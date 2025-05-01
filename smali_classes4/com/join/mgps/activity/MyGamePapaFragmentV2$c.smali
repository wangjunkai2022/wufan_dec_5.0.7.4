.class Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "MyGamePapaFragmentV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFragmentV2;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragmentV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;->a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;->a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-static {v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->l0(Lcom/join/mgps/activity/MyGamePapaFragmentV2;)Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;->a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-static {v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->l0(Lcom/join/mgps/activity/MyGamePapaFragmentV2;)Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a(Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;I)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;->a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-static {v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->l0(Lcom/join/mgps/activity/MyGamePapaFragmentV2;)Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a(Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;I)Landroidx/fragment/app/Fragment;

    move-result-object v1

    instance-of v1, v1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment_;

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;->a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-static {v1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->l0(Lcom/join/mgps/activity/MyGamePapaFragmentV2;)Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;->a(Lcom/join/mgps/activity/MyGamePapaFragmentV2$j;I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment_;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f0(Z)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragmentV2$c;->a:Lcom/join/mgps/activity/MyGamePapaFragmentV2;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragmentV2;->k0(Lcom/join/mgps/activity/MyGamePapaFragmentV2;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->clickFavoritesBtn:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    return-void
.end method
