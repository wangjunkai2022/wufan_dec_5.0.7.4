.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;
.super Ljava/lang/Object;
.source "BeiZiInterstitialActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->o(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->o(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->p(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/VideoView;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->q(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/media/MediaPlayer;

    move-result-object p1

    const-wide/16 v0, 0x0

    const/4 v2, 0x3

    invoke-virtual {p1, v0, v1, v2}, Landroid/media/MediaPlayer;->seekTo(JI)V

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->p(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/VideoView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/VideoView;->start()V

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {p1}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->q(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/media/MediaPlayer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$16;->a:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-static {v0}, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->a(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
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
