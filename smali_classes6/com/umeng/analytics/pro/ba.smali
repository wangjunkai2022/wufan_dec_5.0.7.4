.class public Lcom/umeng/analytics/pro/ba;
.super Ljava/lang/Object;
.source "DeviceIdSupplier.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/umeng/analytics/pro/ax;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SuspiciousIndentation"
        }
    .end annotation

    .line 1
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "Brand"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const-string v2, "Device"

    .line 2
    invoke-static {v2, v1}, Lcom/umeng/analytics/pro/bl;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 4
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/bk;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    new-instance v0, Lcom/umeng/analytics/pro/bb;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bb;-><init>()V

    return-object v0

    .line 6
    :cond_1
    invoke-static {}, Lcom/umeng/analytics/pro/bk;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    new-instance v0, Lcom/umeng/analytics/pro/bc;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bc;-><init>()V

    return-object v0

    :cond_2
    const-string v1, "xiaomi"

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "redmi"

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "meitu"

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "\u5c0f\u7c73"

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "blackshark"

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "vivo"

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 14
    new-instance v0, Lcom/umeng/analytics/pro/bi;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bi;-><init>()V

    return-object v0

    :cond_4
    const-string v1, "oppo"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "oneplus"

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "realme"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "lenovo"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "zuk"

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_1

    :cond_6
    const-string v1, "nubia"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 21
    new-instance v0, Lcom/umeng/analytics/pro/bf;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bf;-><init>()V

    return-object v0

    :cond_7
    const-string v1, "samsung"

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 23
    new-instance v0, Lcom/umeng/analytics/pro/bh;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bh;-><init>()V

    return-object v0

    :cond_8
    const-string v1, "meizu"

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "mblu"

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 26
    invoke-static {}, Lcom/umeng/analytics/pro/bk;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_0

    .line 27
    :cond_9
    invoke-static {}, Lcom/umeng/analytics/pro/bk;->e()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 28
    new-instance v0, Lcom/umeng/analytics/pro/az;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/az;-><init>()V

    return-object v0

    :cond_a
    return-object v2

    .line 29
    :cond_b
    :goto_0
    new-instance v0, Lcom/umeng/analytics/pro/be;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/be;-><init>()V

    return-object v0

    .line 30
    :cond_c
    :goto_1
    new-instance v0, Lcom/umeng/analytics/pro/bd;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bd;-><init>()V

    return-object v0

    .line 31
    :cond_d
    :goto_2
    new-instance v0, Lcom/umeng/analytics/pro/bg;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bg;-><init>()V

    return-object v0

    .line 32
    :cond_e
    :goto_3
    new-instance v0, Lcom/umeng/analytics/pro/bj;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bj;-><init>()V

    return-object v0
.end method

.method public static b()Lcom/umeng/analytics/pro/ax;
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/bb;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/bb;-><init>()V

    return-object v0
.end method
