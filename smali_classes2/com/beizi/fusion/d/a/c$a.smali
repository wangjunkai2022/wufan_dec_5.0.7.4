.class public Lcom/beizi/fusion/d/a/c$a;
.super Ljava/lang/Object;
.source "BidS2SResponseModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "price"
    .end annotation
.end field

.field private b:Lcom/beizi/fusion/d/a/c$d;
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
    iget-object v0, p0, Lcom/beizi/fusion/d/a/c$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/beizi/fusion/d/a/c$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/d/a/c$a;->b:Lcom/beizi/fusion/d/a/c$d;

    return-object v0
.end method
