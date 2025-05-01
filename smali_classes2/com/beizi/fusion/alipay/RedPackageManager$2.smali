.class Lcom/beizi/fusion/alipay/RedPackageManager$2;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/UserInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/alipay/RedPackageManager;->authInfo(Ljava/util/Map;Lcom/beizi/fusion/alipay/inter/UserInfoListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/fusion/alipay/RedPackageManager;

.field final synthetic val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/UserInfoListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/alipay/RedPackageManager$2;->this$0:Lcom/beizi/fusion/alipay/RedPackageManager;

    iput-object p2, p0, Lcom/beizi/fusion/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failCallback(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/beizi/fusion/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public successCallBack(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/beizi/fusion/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
