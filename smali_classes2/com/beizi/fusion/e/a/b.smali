.class public Lcom/beizi/fusion/e/a/b;
.super Ljava/lang/Object;
.source "DevicesIDsHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/e/a/b$a;
    }
.end annotation


# instance fields
.field private a:Lcom/beizi/fusion/e/a/b$a;


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/e/a/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/e/a/b;->a:Lcom/beizi/fusion/e/a/b$a;

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/e/a/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 45
    const-class v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    const-string v2, "android.os.SystemProperties"

    .line 46
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "get"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v7, 0x1

    aput-object v0, v5, v7

    .line 47
    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v4, [Ljava/lang/Object;

    aput-object p1, v3, v6

    const-string p1, "unknown"

    aput-object p1, v3, v7

    .line 48
    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    :catch_0
    return-object v1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 40
    const-class v0, Ljava/lang/String;

    :try_start_0
    const-string v1, "android.os.SystemProperties"

    .line 41
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "get"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v6, 0x1

    aput-object v0, v4, v6

    .line 42
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object p0, v2, v5

    aput-object p1, v2, v6

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 44
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "System property invoke error: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "BeiZis"

    invoke-static {p1, p0}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static a()Z
    .locals 2

    .line 36
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "OPPO"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "REALME"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ro.build.version.opporom"

    const-string v1, ""

    .line 39
    invoke-static {v0, v1}, Lcom/beizi/fusion/e/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static synthetic b(Lcom/beizi/fusion/e/a/b;)Lcom/beizi/fusion/e/a/b$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/e/a/b;->a:Lcom/beizi/fusion/e/a/b$a;

    return-object p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 2

    .line 5
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/beizi/fusion/e/a/b$1;

    invoke-direct {v1, p0, p1}, Lcom/beizi/fusion/e/a/b$1;-><init>(Lcom/beizi/fusion/e/a/b;Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 6
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static b()Z
    .locals 2

    .line 2
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "HUAWEI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "HONOR"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "BeiZis"

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "init oaid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/beizi/fusion/g/af;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "ASUS"

    .line 3
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 5
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/e/a/b;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto/16 :goto_1

    :cond_1
    const-string v1, "LENOVO"

    .line 7
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    new-instance v1, Lcom/beizi/fusion/e/a/d;

    invoke-direct {v1, p1}, Lcom/beizi/fusion/e/a/d;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/beizi/fusion/e/a/b;->a:Lcom/beizi/fusion/e/a/b$a;

    invoke-virtual {v1, p1}, Lcom/beizi/fusion/e/a/d;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto/16 :goto_1

    :cond_2
    const-string v1, "MOTOLORA"

    .line 9
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    new-instance v1, Lcom/beizi/fusion/e/a/d;

    invoke-direct {v1, p1}, Lcom/beizi/fusion/e/a/d;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/beizi/fusion/e/a/b;->a:Lcom/beizi/fusion/e/a/b$a;

    invoke-virtual {v1, p1}, Lcom/beizi/fusion/e/a/d;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto/16 :goto_1

    :cond_3
    const-string v1, "MEIZU"

    .line 11
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    new-instance v1, Lcom/beizi/fusion/e/a/e;

    invoke-direct {v1, p1}, Lcom/beizi/fusion/e/a/e;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/beizi/fusion/e/a/b;->a:Lcom/beizi/fusion/e/a/b$a;

    invoke-virtual {v1, p1}, Lcom/beizi/fusion/e/a/e;->a(Lcom/beizi/fusion/e/a/b$a;)V

    goto/16 :goto_1

    :cond_4
    const-string v1, "NUBIA"

    .line 13
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 14
    new-instance v0, Lcom/beizi/fusion/e/a/f;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/e/a/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beizi/fusion/e/a/f;->a()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 15
    :cond_5
    invoke-static {}, Lcom/beizi/fusion/e/a/b;->a()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 16
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto/16 :goto_1

    :cond_6
    const-string v1, "SAMSUNG"

    .line 17
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 18
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto/16 :goto_1

    :cond_7
    const-string v1, "VIVO"

    .line 19
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 20
    new-instance v0, Lcom/beizi/fusion/e/a/j;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/e/a/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beizi/fusion/e/a/j;->a()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_8
    const-string v1, "XIAOMI"

    .line 21
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 22
    new-instance v0, Lcom/beizi/fusion/e/a/k;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/e/a/k;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beizi/fusion/e/a/k;->a()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_9
    const-string v1, "BLACKSHARK"

    .line 23
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 24
    new-instance v0, Lcom/beizi/fusion/e/a/k;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/e/a/k;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/beizi/fusion/e/a/k;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_a
    const-string v1, "ONEPLUS"

    .line 25
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 26
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto :goto_1

    :cond_b
    const-string v1, "ZTE"

    .line 27
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 28
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto :goto_1

    :cond_c
    const-string v1, "FERRMEOS"

    .line 29
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {p0}, Lcom/beizi/fusion/e/a/b;->c()Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_0

    :cond_d
    const-string v1, "SSUI"

    .line 30
    invoke-direct {p0}, Lcom/beizi/fusion/e/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual {p0}, Lcom/beizi/fusion/e/a/b;->d()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 31
    :cond_e
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    goto :goto_1

    .line 32
    :cond_f
    :goto_0
    invoke-direct {p0, p1}, Lcom/beizi/fusion/e/a/b;->b(Landroid/content/Context;)V

    .line 33
    :cond_10
    :goto_1
    iget-object p1, p0, Lcom/beizi/fusion/e/a/b;->a:Lcom/beizi/fusion/e/a/b$a;

    if-eqz p1, :cond_11

    if-eqz v0, :cond_11

    .line 34
    invoke-interface {p1, v0}, Lcom/beizi/fusion/e/a/b$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_11
    :goto_2
    return-void
.end method

.method public c()Z
    .locals 2

    const-string v0, "ro.build.freeme.label"

    .line 1
    invoke-direct {p0, v0}, Lcom/beizi/fusion/e/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "FREEMEOS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 2

    const-string v0, "ro.ssui.product"

    .line 1
    invoke-direct {p0, v0}, Lcom/beizi/fusion/e/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "unknown"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
