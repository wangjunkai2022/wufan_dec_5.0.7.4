.class public Lcom/beizi/fusion/d/a/b$i;
.super Ljava/lang/Object;
.source "BidS2SRequestModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field private a:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "id"
    .end annotation
.end field

.field private b:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "test"
    .end annotation
.end field

.field private c:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "tmax"
    .end annotation
.end field

.field private d:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "at"
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "cur"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "seat"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:I
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "wseat"
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "item"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/d/a/b$f;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/beizi/fusion/d/a/b$c;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "context"
    .end annotation
.end field

.field private j:Lcom/beizi/fusion/d/a/b$j;
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
.method public a(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/fusion/d/a/b$i;->b:I

    return-void
.end method

.method public a(Lcom/beizi/fusion/d/a/b$c;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$i;->i:Lcom/beizi/fusion/d/a/b$c;

    return-void
.end method

.method public a(Lcom/beizi/fusion/d/a/b$j;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$i;->j:Lcom/beizi/fusion/d/a/b$j;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$i;->a:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$i;->e:Ljava/util/List;

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/a/b$i;->c:I

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$i;->f:Ljava/util/List;

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/a/b$i;->d:I

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/d/a/b$f;",
            ">;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$i;->h:Ljava/util/List;

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/d/a/b$i;->g:I

    return-void
.end method
