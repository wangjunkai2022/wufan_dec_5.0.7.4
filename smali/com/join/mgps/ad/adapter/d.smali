.class public Lcom/join/mgps/ad/adapter/d;
.super Ljava/lang/Object;
.source "REInit.java"


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
    .locals 0

    .line 1
    :try_start_0
    sget-boolean p1, Lcom/join/mgps/ad/adapter/d;->a:Z

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;

    invoke-direct {p1}, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->build()Lcom/aggmoread/sdk/client/AMAdConfig;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/aggmoread/sdk/client/AMSdk;->init(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdConfig;)V

    const/4 p0, 0x1

    .line 3
    sput-boolean p0, Lcom/join/mgps/ad/adapter/d;->a:Z

    :cond_0
    if-eqz p2, :cond_1

    .line 4
    invoke-interface {p2}, Ls1/a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method
