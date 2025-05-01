.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;
.super Ljava/lang/Object;
.source "BeiZiInterstitialActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;

    iget-object v0, v0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;

    iget-object v0, v0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->p(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/VideoView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/VideoView;->getDuration()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;

    iget-object v1, v1, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->p(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/VideoView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v1

    sub-int/2addr v0, v1

    .line 4
    div-int/lit16 v0, v0, 0x3e8

    if-lez v0, :cond_0

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11$1;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;

    iget-object v1, v1, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$11;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
