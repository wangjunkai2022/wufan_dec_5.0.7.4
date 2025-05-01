.class Lcom/join/mgps/activity/DiscoveryPaiweiActivity$d;
.super Ljava/lang/Object;
.source "DiscoveryPaiweiActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


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
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$d;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$d;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->h0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;

    move-result-object p1

    invoke-static {p1, p3}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->a(Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$d;->a:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->c:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p2, 0x1

    invoke-virtual {p1, p3, p2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    return-void
.end method
