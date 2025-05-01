.class public Lcom/beizi/fusion/alipay/RedPackageManager;
.super Ljava/lang/Object;
.source "RedPackageManager.java"


# static fields
.field public static final APP_ORDER_ID_KEY:Ljava/lang/String; = "app_order_id_key"

.field public static final APP_USERID_KEY:Ljava/lang/String; = "app_user_id_key"

.field private static TAG:Ljava/lang/String; = "RedPackageManager"

.field public static final TRANS_AMOUNT_KEY:Ljava/lang/String; = "trans_amount_key"

.field private static instance:Lcom/beizi/fusion/alipay/RedPackageManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/beizi/fusion/alipay/RedPackageManager;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/fusion/alipay/RedPackageManager;->instance:Lcom/beizi/fusion/alipay/RedPackageManager;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/fusion/alipay/RedPackageManager;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/alipay/RedPackageManager;->instance:Lcom/beizi/fusion/alipay/RedPackageManager;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/fusion/alipay/RedPackageManager;

    invoke-direct {v1}, Lcom/beizi/fusion/alipay/RedPackageManager;-><init>()V

    sput-object v1, Lcom/beizi/fusion/alipay/RedPackageManager;->instance:Lcom/beizi/fusion/alipay/RedPackageManager;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/fusion/alipay/RedPackageManager;->instance:Lcom/beizi/fusion/alipay/RedPackageManager;

    return-object v0
.end method


# virtual methods
.method public authAliPayWithParams(Landroid/app/Activity;Ljava/util/Map;Lcom/beizi/fusion/alipay/inter/UserInfoListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/fusion/alipay/inter/UserInfoListener;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/beizi/fusion/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    const-string v1, "authAliPayWithParams execute"

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/alipay/RedPackageManager$3;

    invoke-direct {v1, p0, p3, p1}, Lcom/beizi/fusion/alipay/RedPackageManager$3;-><init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/UserInfoListener;Landroid/app/Activity;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/beizi/ad/alipay/RedPackageManager;->authAliPayWithParams(Landroid/app/Activity;Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V

    return-void
.end method

.method public authInfo(Ljava/util/Map;Lcom/beizi/fusion/alipay/inter/UserInfoListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/fusion/alipay/inter/UserInfoListener;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/beizi/fusion/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    const-string v1, "authInfo execute"

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/alipay/RedPackageManager$2;

    invoke-direct {v1, p0, p2}, Lcom/beizi/fusion/alipay/RedPackageManager$2;-><init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/UserInfoListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/beizi/ad/alipay/RedPackageManager;->authInfo(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V

    return-void
.end method

.method public rtaUser(Lcom/beizi/fusion/alipay/inter/ResultListener;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/fusion/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    const-string v1, "rtaUser execute"

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/alipay/RedPackageManager$1;

    invoke-direct {v1, p0, p1}, Lcom/beizi/fusion/alipay/RedPackageManager$1;-><init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/ResultListener;)V

    invoke-virtual {v0, v1}, Lcom/beizi/ad/alipay/RedPackageManager;->rtaUser(Lcom/beizi/ad/alipay/inter/ResultListener;)V

    return-void
.end method

.method public welfareAliPayWithParams(Ljava/util/Map;Lcom/beizi/fusion/alipay/inter/WelfareListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/fusion/alipay/inter/WelfareListener;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/beizi/fusion/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    const-string v1, "welfareAliPayWithParams execute"

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/alipay/RedPackageManager$4;

    invoke-direct {v1, p0, p2}, Lcom/beizi/fusion/alipay/RedPackageManager$4;-><init>(Lcom/beizi/fusion/alipay/RedPackageManager;Lcom/beizi/fusion/alipay/inter/WelfareListener;)V

    invoke-virtual {v0, p1, v1}, Lcom/beizi/ad/alipay/RedPackageManager;->welfareAliPayWithParams(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/WelfareListener;)V

    return-void
.end method
