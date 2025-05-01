.class Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;
.super Landroidx/viewpager2/adapter/FragmentStateAdapter;
.source "DiscoveryPaiweiActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/DiscoveryPaiweiActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/DiscoveryPaiweiActivity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentActivity;",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    .line 2
    invoke-direct {p0, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->c(Ljava/util/List;)V

    return-void
.end method

.method private b(I)Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->getItemId(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    instance-of v0, p1, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->a:Ljava/util/List;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->c:Landroidx/viewpager2/widget/ViewPager2;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public containsItem(J)Z
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->getItemCount()I

    move-result v0

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public createFragment(I)Landroidx/fragment/app/Fragment;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_;->j0()Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->getGame_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;->b(Ljava/lang/String;)Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->getMax_battle_count()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;->c(I)Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment_$k;->a()Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;

    move-result-object p1

    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$g;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method
