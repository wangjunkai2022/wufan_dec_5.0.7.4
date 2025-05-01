.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;
.super Ljava/lang/Object;
.source "GamedetialModleFiveFragemnt.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->K0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

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
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->v2:Lcom/join/mgps/adapter/u0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/adapter/u0;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->v2:Lcom/join/mgps/adapter/u0;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/u0;->a(I)Lcom/join/mgps/dto/ImageInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ImageInfo;->isVideo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-static {v0}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->j0(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->pauseVideo()V

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->T:Lit/sephiroth/android/library/widget/HListView;

    invoke-virtual {v0, p1}, Lit/sephiroth/android/library/widget/HListView;->P0(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$i;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->v2:Lcom/join/mgps/adapter/u0;

    invoke-virtual {v0, p1}, Lcom/join/mgps/adapter/u0;->c(I)V

    return-void
.end method
