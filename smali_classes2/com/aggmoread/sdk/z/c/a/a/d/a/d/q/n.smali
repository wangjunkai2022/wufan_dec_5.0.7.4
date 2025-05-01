.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;->a:I

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;->a:I

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/n;->b:Ljava/util/Map;

    return-void
.end method
