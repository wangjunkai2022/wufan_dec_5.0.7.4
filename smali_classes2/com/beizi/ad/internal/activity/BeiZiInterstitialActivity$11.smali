.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;
.super Ljava/util/TimerTask;
.source "BeiZiInterstitialActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->p(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/VideoView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->p(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/VideoView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    new-instance v1, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;

    invoke-direct {v1, p0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;-><init>(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
