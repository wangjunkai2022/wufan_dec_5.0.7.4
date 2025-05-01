.class Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;
.super Landroid/os/Handler;
.source "ViewPagerWithADs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;->a:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;->a:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-static {p1}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->a(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$a;->a:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-virtual {p1}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j()V

    return-void
.end method
