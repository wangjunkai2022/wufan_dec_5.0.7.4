.class public Lcom/beizi/fusion/d/a/b$a;
.super Ljava/lang/Object;
.source "BidS2SRequestModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "bundle"
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "ver"
    .end annotation
.end field

.field private c:Lcom/beizi/fusion/d/a/b$b;
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
.method public a(Lcom/beizi/fusion/d/a/b$b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$a;->c:Lcom/beizi/fusion/d/a/b$b;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$a;->a:Ljava/lang/String;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$a;->b:Ljava/lang/String;

    return-void
.end method
