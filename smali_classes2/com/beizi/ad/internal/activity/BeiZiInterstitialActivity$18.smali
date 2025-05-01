.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;
.super Ljava/lang/Object;
.source "BeiZiInterstitialActivity.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->m()V
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
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    const-string p1, "BeiZisAd"

    const-string v0, "onCompletion: \u64ad\u653e\u5b8c\u6210"

    .line 1
    invoke-static {p1, v0}, Lcom/beizi/ad/lance/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;I)I

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->o(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->o(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->b(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->c(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->b(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->d(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$18;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "0"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method
