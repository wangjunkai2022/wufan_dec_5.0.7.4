.class Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;
.super Ljava/lang/Object;
.source "ViewPagerWithADs.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;->b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;->b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-virtual {p1}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j()V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;->b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-virtual {p1}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->j()V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager$f;->b:Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;

    invoke-static {p1}, Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;->d(Lcom/join/mgps/customview/ViewPagerWithADs$MyViewPager;)Landroid/os/Handler;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method
