.class public Lcom/beizi/fusion/BeiZis;
.super Ljava/lang/Object;
.source "BeiZis.java"


# static fields
.field private static a:Lcom/beizi/fusion/BeiZiCustomController; = null

.field private static b:Z = false

.field private static c:Ljava/lang/String; = "1.0.25"

.field private static d:Z = true

.field private static e:Z

.field private static f:Z


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

.method public static asyncInit(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    const/4 v0, 0x0

    .line 1
    sput-boolean v0, Lcom/beizi/fusion/BeiZis;->d:Z

    .line 2
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1, v1}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static asyncInit(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BeiZiCustomController;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 3
    sput-object p2, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    const/4 p2, 0x0

    .line 4
    sput-boolean p2, Lcom/beizi/fusion/BeiZis;->d:Z

    .line 5
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p0, p1, v0, v0}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static asyncInit(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BeiZiCustomController;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 6
    sput-object p2, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    const/4 p2, 0x0

    .line 7
    sput-boolean p2, Lcom/beizi/fusion/BeiZis;->d:Z

    .line 8
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p0, p1, p3, v0}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static asyncInit(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BeiZiCustomController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 9
    sput-object p2, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    const/4 p2, 0x0

    .line 10
    sput-boolean p2, Lcom/beizi/fusion/BeiZis;->d:Z

    .line 11
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    invoke-virtual {p2, p0, p1, p3, p4}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static asyncInitWithDomain(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    const/4 v0, 0x0

    .line 1
    sput-boolean v0, Lcom/beizi/fusion/BeiZis;->d:Z

    .line 2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/beizi/fusion/d/b;->a(Ljava/lang/String;)Lcom/beizi/fusion/d/b;

    move-result-object p2

    invoke-virtual {p2, p0, p1, v1, v1}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    invoke-virtual {p2, p0, p1, v1, v1}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static closeShakeAd()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    sput-boolean v0, Lcom/beizi/fusion/BeiZis;->f:Z

    return-void
.end method

.method public static getCustomController()Lcom/beizi/fusion/BeiZiCustomController;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    return-object v0
.end method

.method public static getOaidVersion()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/BeiZis;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static getSdkVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "4.90.4.4"

    return-object v0
.end method

.method public static getTransferProtocol()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/beizi/fusion/BeiZis;->e:Z

    return v0
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1, v1}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BeiZiCustomController;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 2
    sput-object p2, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    .line 3
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p0, p1, v0, v0}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BeiZiCustomController;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 4
    sput-object p2, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    .line 5
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p0, p1, p3, v0}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BeiZiCustomController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 6
    sput-object p2, Lcom/beizi/fusion/BeiZis;->a:Lcom/beizi/fusion/BeiZiCustomController;

    .line 7
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    invoke-virtual {p2, p0, p1, p3, p4}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static initWithDomain(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/beizi/fusion/d/b;->a(Ljava/lang/String;)Lcom/beizi/fusion/d/b;

    move-result-object p2

    invoke-virtual {p2, p0, p1, v1, v1}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object p2

    invoke-virtual {p2, p0, p1, v1, v1}, Lcom/beizi/fusion/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static isCloseShakeAd()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/beizi/fusion/BeiZis;->f:Z

    return v0
.end method

.method public static isIsSyncInit()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/beizi/fusion/BeiZis;->d:Z

    return v0
.end method

.method public static isLimitPersonalAds()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/beizi/fusion/BeiZis;->b:Z

    return v0
.end method

.method public static setLimitPersonalAds(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/beizi/fusion/BeiZis;->b:Z

    return-void
.end method

.method public static setOaidVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/beizi/fusion/BeiZis;->c:Ljava/lang/String;

    return-void
.end method

.method public static setSupportPersonalized(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/beizi/fusion/g/aj;->a(Z)V

    return-void
.end method

.method public static setTransferProtocol(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/beizi/fusion/BeiZis;->e:Z

    return-void
.end method
