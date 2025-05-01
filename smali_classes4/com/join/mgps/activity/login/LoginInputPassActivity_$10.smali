.class Lcom/join/mgps/activity/login/LoginInputPassActivity_$10;
.super Ljava/lang/Object;
.source "LoginInputPassActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/login/LoginInputPassActivity_;->loginSuccess(Lcom/wufan/user/service/protobuf/n0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/login/LoginInputPassActivity_;

.field final synthetic val$accountBean:Lcom/wufan/user/service/protobuf/n0;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/login/LoginInputPassActivity_;Lcom/wufan/user/service/protobuf/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/login/LoginInputPassActivity_$10;->this$0:Lcom/join/mgps/activity/login/LoginInputPassActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/login/LoginInputPassActivity_$10;->val$accountBean:Lcom/wufan/user/service/protobuf/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginInputPassActivity_$10;->this$0:Lcom/join/mgps/activity/login/LoginInputPassActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginInputPassActivity_$10;->val$accountBean:Lcom/wufan/user/service/protobuf/n0;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/login/LoginInputPassActivity_;->access$201(Lcom/join/mgps/activity/login/LoginInputPassActivity_;Lcom/wufan/user/service/protobuf/n0;)V

    return-void
.end method
