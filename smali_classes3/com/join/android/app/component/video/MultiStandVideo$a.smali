.class Lcom/join/android/app/component/video/MultiStandVideo$a;
.super Ljava/lang/Object;
.source "MultiStandVideo.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/video/MultiStandVideo;->f(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/join/android/app/component/video/MultiStandVideo;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/video/MultiStandVideo;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->c:Lcom/join/android/app/component/video/MultiStandVideo;

    iput-object p2, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->c:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-static {p1}, Lcom/join/android/app/component/video/MultiStandVideo;->a(Lcom/join/android/app/component/video/MultiStandVideo;)I

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->c:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-static {p1}, Lcom/join/android/app/component/video/MultiStandVideo;->b(Lcom/join/android/app/component/video/MultiStandVideo;)I

    move-result p1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->c:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-static {p1}, Lcom/join/android/app/component/video/MultiStandVideo;->c(Lcom/join/android/app/component/video/MultiStandVideo;)I

    move-result p1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->c:Lcom/join/android/app/component/video/MultiStandVideo;

    .line 2
    invoke-static {p1}, Lcom/join/android/app/component/video/MultiStandVideo;->d(Lcom/join/android/app/component/video/MultiStandVideo;)I

    move-result p1

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->b:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->b:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/android/app/component/video/MultiStandVideo$a;->c:Lcom/join/android/app/component/video/MultiStandVideo;

    invoke-virtual {p1}, Lcom/join/android/app/component/video/MultiStandVideo;->i()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
