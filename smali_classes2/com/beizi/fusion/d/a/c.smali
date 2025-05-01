.class public Lcom/beizi/fusion/d/a/c;
.super Ljava/lang/Object;
.source "BidS2SResponseModel.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/d/a/c$b;,
        Lcom/beizi/fusion/d/a/c$d;,
        Lcom/beizi/fusion/d/a/c$a;,
        Lcom/beizi/fusion/d/a/c$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "seatbid"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/d/a/c$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/beizi/fusion/d/a/c;
    .locals 1

    .line 1
    :try_start_0
    const-class v0, Lcom/beizi/fusion/d/a/c;

    invoke-static {p0, v0}, Lcom/beizi/fusion/model/JsonResolver;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/fusion/d/a/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/d/a/c$c;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/a/c;->a:Ljava/util/List;

    return-object v0
.end method
