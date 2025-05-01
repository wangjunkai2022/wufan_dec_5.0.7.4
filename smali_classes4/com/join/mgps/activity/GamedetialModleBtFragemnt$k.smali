.class Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;
.super Ljava/lang/Object;
.source "GamedetialModleBtFragemnt.java"

# interfaces
.implements Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->afterView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iput-object p2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->a:Landroid/view/View;

    iput p3, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onOffsetChanged(Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p1

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget v0, p2, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->G1:I

    iget v1, p2, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->H1:I

    sub-int/2addr v0, v1

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge p1, v0, :cond_3

    iget-object p1, p2, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    iget p2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->b:I

    invoke-virtual {p1, p2}, Lcom/join/kotlin/domain/widget/CornersLinearLayout;->setConner_top_right(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    iget p2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->b:I

    invoke-virtual {p1, p2}, Lcom/join/kotlin/domain/widget/CornersLinearLayout;->setConner_top_left(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->W:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 10
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-static {p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)Lcom/join/android/app/common/manager/b;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-static {p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)Lcom/join/android/app/common/manager/b;

    move-result-object p1

    const p2, 0x7f06006c

    invoke-virtual {p1, p2}, Lcom/join/android/app/common/manager/b;->n(I)V

    .line 12
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p2, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz p2, :cond_2

    iget-boolean p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->D2:Z

    if-nez p1, :cond_2

    .line 13
    invoke-virtual {p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result p1

    const/4 p2, 0x5

    if-ne p1, p2, :cond_2

    .line 14
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1, v2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->a:Landroid/view/View;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    .line 17
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    invoke-virtual {p1, v2}, Lcom/join/kotlin/domain/widget/CornersLinearLayout;->setConner_top_right(I)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    invoke-virtual {p1, v2}, Lcom/join/kotlin/domain/widget/CornersLinearLayout;->setConner_top_left(I)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->T:Lcom/join/kotlin/domain/widget/CornersLinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->invalidate()V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 21
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->W:Landroid/widget/RelativeLayout;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->d()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 25
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getCurrentState()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_4

    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "currentState="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " -->performClick"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object p1, p1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->h:Lcom/join/android/app/component/video/StandardVideoView;

    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    .line 28
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-static {p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)Lcom/join/android/app/common/manager/b;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 29
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->c:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-static {p1}, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->g0(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)Lcom/join/android/app/common/manager/b;

    move-result-object p1

    const p2, 0x7f060067

    invoke-virtual {p1, p2}, Lcom/join/android/app/common/manager/b;->n(I)V

    .line 30
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$k;->a:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method
