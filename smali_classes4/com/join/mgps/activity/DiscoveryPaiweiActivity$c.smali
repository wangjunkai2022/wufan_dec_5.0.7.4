.class Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "DiscoveryPaiweiActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;->onPageSelected(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->h0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$c;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->h0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->a(Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;I)V

    :cond_1
    return-void
.end method
