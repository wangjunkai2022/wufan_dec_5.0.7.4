.class Lcom/beizi/fusion/alipay/RedPackageManager$3;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/UserInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/alipay/RedPackageManager;->authAliPayWithParams(Landroid/app/Activity;Ljava/util/Map;Lcom/beizi/fusion/alipay/inter/UserInfoListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/fusion/alipay/RedPackageManager;

.field final synthetic val$context:Landroid/app/Activity;

.field final synthetic val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/UserInfoListener;Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->this$0:Lcom/beizi/fusion/alipay/RedPackageManager;

    iput-object p2, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;

    iput-object p3, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->val$context:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failCallback(ILjava/lang/String;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/beizi/fusion/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->val$context:Landroid/app/Activity;

    invoke-static {p1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object p1

    new-instance p2, Lcom/beizi/fusion/b/b;

    sget-object v1, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const-string v2, ""

    const-string v3, "600.500"

    const-string v4, ""

    const-string v6, ""

    const-string v7, ""

    const-string v9, ""

    move-object v0, p2

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_0
    return-void
.end method

.method public successCallBack(Ljava/util/Map;)V
    .locals 11
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
    iget-object v0, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/fusion/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lcom/beizi/fusion/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/alipay/RedPackageManager$3;->val$context:Landroid/app/Activity;

    invoke-static {p1}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object p1

    new-instance v10, Lcom/beizi/fusion/b/b;

    sget-object v1, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    const-string v2, ""

    const-string v3, "600.200"

    const-string v4, ""

    const-string v6, ""

    const-string v7, ""

    const-string v9, ""

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Lcom/beizi/fusion/b/c;->a(Lcom/beizi/fusion/b/b;)V

    :cond_0
    return-void
.end method
