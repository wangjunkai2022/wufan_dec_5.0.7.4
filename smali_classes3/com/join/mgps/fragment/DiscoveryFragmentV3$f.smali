.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;
.super Ljava/lang/Object;
.source "DiscoveryFragmentV3.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3;->J0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v0}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 3
    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v3}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->h0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    rem-int v3, p1, v3

    if-ne v1, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->i0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Lcom/join/mgps/fragment/DiscoveryFragmentV3$l;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$f;->b:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-static {v2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3;->i0(Lcom/join/mgps/fragment/DiscoveryFragmentV3;)Lcom/join/mgps/fragment/DiscoveryFragmentV3$l;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
