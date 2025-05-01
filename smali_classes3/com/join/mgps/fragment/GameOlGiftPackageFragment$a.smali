.class Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;
.super Landroid/os/Handler;
.source "GameOlGiftPackageFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/GameOlGiftPackageFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;->a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;->a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->V(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goLoginNetGame(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/join/mgps/dto/GiftPackageDataInfoBean;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;->a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GiftPackageDataInfoBean;->getGift_package_type()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->W(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;->a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->X(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)Lcom/join/mgps/dialog/d1;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;->a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->X(Lcom/join/mgps/fragment/GameOlGiftPackageFragment;)Lcom/join/mgps/dialog/d1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dialog/d1;->b()V

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/fragment/GameOlGiftPackageFragment$a;->a:Lcom/join/mgps/fragment/GameOlGiftPackageFragment;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v0, p1}, Lcom/join/mgps/fragment/GameOlGiftPackageFragment;->i0(Lcom/join/mgps/dto/GiftPackageDataInfoBean;I)V

    :cond_1
    return-void
.end method
