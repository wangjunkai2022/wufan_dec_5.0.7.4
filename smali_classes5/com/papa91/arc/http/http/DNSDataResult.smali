.class public Lcom/papa91/arc/http/http/DNSDataResult;
.super Ljava/lang/Object;
.source "DNSDataResult.java"


# static fields
.field public static gameUrl:Ljava/lang/String; = "http://anctapi.wufan88.com"


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


# virtual methods
.method public getGameUrl()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/papa91/arc/http/http/DNSDataResult;->gameUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setGameUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    sput-object p1, Lcom/papa91/arc/http/http/DNSDataResult;->gameUrl:Ljava/lang/String;

    return-void
.end method

.method public updateRpcConstant()V
    .locals 1

    .line 1
    sget-object v0, Lcom/papa91/arc/http/http/DNSDataResult;->gameUrl:Ljava/lang/String;

    invoke-static {v0}, Lcom/papa91/arc/util/StringUtils;->isNotEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/papa91/arc/http/http/DNSDataResult;->gameUrl:Ljava/lang/String;

    sput-object v0, Lcom/papa91/arc/http/rpc/RpcConstant;->gameUrl:Ljava/lang/String;

    :cond_0
    return-void
.end method
