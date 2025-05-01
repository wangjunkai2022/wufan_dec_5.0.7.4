.class Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$d;
.super Ljava/lang/Object;
.source "ViewPagerWithADs.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$d;->b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$d;->b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->b(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;I)I

    return-void
.end method
