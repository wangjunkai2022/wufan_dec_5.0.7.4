.class public Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$b;
.super Ljava/lang/Object;
.source "FlowLayoutManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field a:F

.field b:F

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$a;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager;


# direct methods
.method public constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$b;->d:Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$b;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$b;->a:F

    return-void
.end method

.method public a(Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$a;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/FlowLayoutManager$b;->b:F

    return-void
.end method
