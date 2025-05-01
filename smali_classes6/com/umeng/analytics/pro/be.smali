.class Lcom/umeng/analytics/pro/be;
.super Ljava/lang/Object;
.source "MeizuDeviceIdSupplier.java"

# interfaces
.implements Lcom/umeng/analytics/pro/ax;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-static {}, Lorg/repackage/com/meizu/flyme/openidsdk/b;->c()Z

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "isSupported"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "getOAID"

    invoke-static {v3, v2}, Lcom/umeng/analytics/pro/bl;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v1, :cond_1

    return-object v0

    .line 3
    :cond_1
    invoke-static {p1}, Lorg/repackage/com/meizu/flyme/openidsdk/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
