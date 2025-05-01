.class public Lcom/join/mgps/ad/adapter/b;
.super Ljava/lang/Object;
.source "GdtInit.java"


# static fields
.field public static a:Z


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

.method public static a(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V
    .locals 1

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/join/mgps/ad/adapter/b;->a:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0, p1}, Lcom/qq/e/comm/managers/GDTAdSdk;->initWithoutStart(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    new-instance p0, Lcom/join/mgps/ad/adapter/b$a;

    invoke-direct {p0}, Lcom/join/mgps/ad/adapter/b$a;-><init>()V

    invoke-static {p0}, Lcom/qq/e/comm/managers/GDTAdSdk;->start(Lcom/qq/e/comm/managers/GDTAdSdk$OnStartListener;)V

    const/4 p0, 0x1

    .line 4
    invoke-static {p0}, Lcom/qq/e/comm/managers/setting/GlobalSetting;->setChannel(I)V

    .line 5
    invoke-static {p0}, Lcom/qq/e/comm/managers/setting/GlobalSetting;->setEnableMediationTool(Z)V

    .line 6
    sput-boolean p0, Lcom/join/mgps/ad/adapter/b;->a:Z

    :cond_0
    if-eqz p2, :cond_1

    .line 7
    invoke-interface {p2}, Ls1/a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method
