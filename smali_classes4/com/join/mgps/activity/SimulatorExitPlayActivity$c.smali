.class Lcom/join/mgps/activity/SimulatorExitPlayActivity$c;
.super Ljava/lang/Object;
.source "SimulatorExitPlayActivity.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SimulatorExitPlayActivity;->i0(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

.field final synthetic b:Lcom/join/mgps/activity/SimulatorExitPlayActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SimulatorExitPlayActivity;Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity$c;->b:Lcom/join/mgps/activity/SimulatorExitPlayActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity$c;->a:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    return-void
.end method

.method public onSelected(ILjava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity$c;->b:Lcom/join/mgps/activity/SimulatorExitPlayActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/SimulatorExitPlayActivity;->o:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;

    if-eqz p1, :cond_0

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/SimulatorExitPlayActivity$c;->a:Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;

    invoke-virtual {p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->x(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V

    :cond_0
    return-void
.end method

.method public onShow()V
    .locals 0

    return-void
.end method
