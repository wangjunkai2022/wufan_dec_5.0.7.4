.class Lcom/join/mgps/activity/GamedetialModleBtFragemnt$j;
.super Ljava/lang/Object;
.source "GamedetialModleBtFragemnt.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->C0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$j;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$j;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->A0()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$j;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object v0, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->v1:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autoPlayVideo(Lcom/join/android/app/component/video/StandardVideoView;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$j;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-virtual {p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->pauseVideo()V

    :goto_0
    return-void
.end method
