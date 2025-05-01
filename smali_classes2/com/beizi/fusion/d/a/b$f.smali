.class public Lcom/beizi/fusion/d/a/b$f;
.super Ljava/lang/Object;
.source "BidS2SRequestModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field private a:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "id"
    .end annotation
.end field

.field private b:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "qty"
    .end annotation
.end field

.field private c:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "seq"
    .end annotation
.end field

.field private d:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "dlvy"
    .end annotation
.end field

.field private e:Lcom/beizi/fusion/d/a/b$g;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "spec"
    .end annotation
.end field

.field private f:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "priv"
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
.method public a(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/d/a/b$f;->b:I

    return-void
.end method

.method public a(Lcom/beizi/fusion/d/a/b$g;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$f;->e:Lcom/beizi/fusion/d/a/b$g;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$f;->a:Ljava/lang/String;

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/a/b$f;->c:I

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/a/b$f;->d:I

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/a/b$f;->f:I

    return-void
.end method
