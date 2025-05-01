.class Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;
.super Ljava/lang/Object;
.source "BeiZiInterstitialActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->e:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    iput-object p2, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->e:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    const-class v1, Lcom/beizi/ad/internal/activity/DownloadAppInfoActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "title_content_key"

    .line 2
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "privacy_content_key"

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "permission_content_key"

    .line 4
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "intro_content_key"

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity$5;->e:Lcom/beizi/ad/internal/activity/BeiZiInterstitialActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
