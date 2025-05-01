.class Lcom/beizi/fusion/widget/dialog/dislike/a$b;
.super Ljava/lang/Object;
.source "DislikeDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/widget/dialog/dislike/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$d;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/beizi/fusion/widget/dialog/dislike/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/dialog/dislike/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->d:Lcom/beizi/fusion/widget/dialog/dislike/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->c:Ljava/util/List;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->a:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->b:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/beizi/fusion/widget/dialog/dislike/a$d;",
            ">;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->c:Ljava/util/List;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/dialog/dislike/a$b;->b:Ljava/lang/String;

    return-object v0
.end method
