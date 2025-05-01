.class Lcom/beizi/fusion/alipay/RedPackageManager$1;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/alipay/RedPackageManager;->rtaUser(Lcom/beizi/fusion/alipay/inter/ResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/fusion/alipay/RedPackageManager;

.field final synthetic val$listener:Lcom/beizi/fusion/alipay/inter/ResultListener;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/ResultListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/alipay/RedPackageManager$1;->this$0:Lcom/beizi/fusion/alipay/RedPackageManager;

    iput-object p2, p0, Lcom/beizi/fusion/alipay/RedPackageManager$1;->val$listener:Lcom/beizi/fusion/alipay/inter/ResultListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/alipay/RedPackageManager$1;->val$listener:Lcom/beizi/fusion/alipay/inter/ResultListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/beizi/fusion/alipay/inter/ResultListener;->onFail(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/alipay/RedPackageManager$1;->val$listener:Lcom/beizi/fusion/alipay/inter/ResultListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/beizi/fusion/alipay/inter/ResultListener;->onSuccess(Z)V

    :cond_0
    return-void
.end method
