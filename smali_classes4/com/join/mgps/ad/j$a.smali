.class Lcom/join/mgps/ad/j$a;
.super Ljava/lang/Object;
.source "GroMFullSVideo.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTFullScreenVideoAd$FullScreenVideoAdInteractionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/ad/j;->u(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/ad/j;


# direct methods
.method constructor <init>(Lcom/join/mgps/ad/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClose()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onADClose()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/ad/d;->c(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    iget v2, v0, Lcom/join/mgps/ad/d;->g:I

    iget v3, v0, Lcom/join/mgps/ad/d;->h:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/join/mgps/ad/d;->a(Ljava/lang/String;II)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v1, v0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    iget v2, v0, Lcom/join/mgps/ad/d;->g:I

    iget v3, v0, Lcom/join/mgps/ad/d;->h:I

    iget-object v4, v0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/join/mgps/ad/d;->d(Ljava/lang/String;IILjava/util/Map;)V

    return-void
.end method

.method public onAdShow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/ad/j;->v(Lcom/join/mgps/ad/j;Z)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onADShow()V

    return-void
.end method

.method public onAdVideoBarClick()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "rewardVideoAd bar click"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/join/mgps/Util/w0;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onSkippedVideo()V
    .locals 0

    return-void
.end method

.method public onVideoComplete()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    iget-object v0, v0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/j$a;->a:Lcom/join/mgps/ad/j;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onVideoComplete()V

    return-void
.end method
