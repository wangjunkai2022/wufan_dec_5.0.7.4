.class Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$7;
.super Ljava/lang/Object;
.source "GamedetailVideoMainActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;->updateNewUi(Lcom/join/kotlin/discount/model/bean/GameDetailBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;

.field final synthetic val$newGameBean:Lcom/join/kotlin/discount/model/bean/GameDetailBean;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;Lcom/join/kotlin/discount/model/bean/GameDetailBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$7;->this$0:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$7;->val$newGameBean:Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$7;->this$0:Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_$7;->val$newGameBean:Lcom/join/kotlin/discount/model/bean/GameDetailBean;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;->access$201(Lcom/join/mgps/activity/gamedetail/GamedetailVideoMainActivity_;Lcom/join/kotlin/discount/model/bean/GameDetailBean;)V

    return-void
.end method
