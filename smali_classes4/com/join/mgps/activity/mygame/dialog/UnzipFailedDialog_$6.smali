.class Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;
.super Ljava/lang/Object;
.source "UnzipFailedDialog_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->showDomainUI(Lcom/join/mgps/dto/DomainInfoBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;

.field final synthetic val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;

    iput-object p2, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;->val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;->this$0:Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;

    iget-object v1, p0, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_$6;->val$domainInfoBean:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;->access$001(Lcom/join/mgps/activity/mygame/dialog/UnzipFailedDialog_;Lcom/join/mgps/dto/DomainInfoBean;)V

    return-void
.end method
