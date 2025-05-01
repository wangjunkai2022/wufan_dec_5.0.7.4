.class Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;
.super Ljava/lang/Object;
.source "UnzipFailedDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->showDomainUI(Lcom/join/mgps/dto/DomainInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

.field final synthetic val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    iput-object p2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->pdSetupUnzipFailClick:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    iget-object v2, v2, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->gameId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    iget v2, v2, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->from:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const-string v2, "unzip_fail"

    goto :goto_0

    :cond_0
    const-string v2, "setup_fail"

    :goto_0
    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setActType(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;

    iget v1, v1, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog;->from:I

    if-ne v1, v3, :cond_1

    const-string v1, "game_unzip_fail"

    goto :goto_1

    :cond_1
    const-string v1, "game_setup_fail"

    :goto_1
    invoke-static {p1, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
