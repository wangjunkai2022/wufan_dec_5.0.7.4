.class public Lcom/beizi/fusion/d/a/b$c;
.super Ljava/lang/Object;
.source "BidS2SRequestModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Lcom/beizi/fusion/d/a/b$a;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "app"
    .end annotation
.end field

.field private b:Lcom/beizi/fusion/d/a/b$d;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "device"
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
.method public a(Lcom/beizi/fusion/d/a/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$c;->a:Lcom/beizi/fusion/d/a/b$a;

    return-void
.end method

.method public a(Lcom/beizi/fusion/d/a/b$d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/d/a/b$c;->b:Lcom/beizi/fusion/d/a/b$d;

    return-void
.end method
