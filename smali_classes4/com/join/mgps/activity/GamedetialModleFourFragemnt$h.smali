.class Lcom/join/mgps/activity/GamedetialModleFourFragemnt$h;
.super Ljava/lang/Object;
.source "GamedetialModleFourFragemnt.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->u0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFourFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$h;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$h;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->s0()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFourFragemnt$h;->b:Lcom/join/mgps/activity/GamedetialModleFourFragemnt;

    iget-object v0, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->S:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleFourFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity;->autoPlayVideo(Lcom/join/android/app/component/video/StandardVideoView;)V

    :cond_0
    return-void
.end method
