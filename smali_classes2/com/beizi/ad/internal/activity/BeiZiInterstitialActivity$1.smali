.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;
.super Landroid/os/CountDownTimer;
.source "BeiZiInterstitialActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    :try_start_0
    const-string v0, "BeiZisAd"

    const-string v1, "onFinish"

    .line 1
    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->b(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->c(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)I

    move-result v0

    if-lez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->d(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public onTick(J)V
    .locals 2

    const-wide/16 v0, 0x3e8

    .line 1
    :try_start_0
    div-long/2addr p1, v0

    const-wide/16 v0, 0x1

    add-long/2addr p1, v0

    long-to-int p2, p1

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
