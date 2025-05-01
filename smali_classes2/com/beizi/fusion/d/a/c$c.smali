.class public Lcom/beizi/fusion/d/a/c$c;
.super Ljava/lang/Object;
.source "BidS2SResponseModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "seat"
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bid"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/d/a/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/beizi/fusion/d/a/c$b;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "ext"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/a/c$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/d/a/c$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/a/c$c;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Lcom/beizi/fusion/d/a/c$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/a/c$c;->c:Lcom/beizi/fusion/d/a/c$b;

    return-object v0
.end method
