.class public Lcom/beizi/ad/b/a;
.super Ljava/lang/Object;
.source "MediationAdRequest.java"


# instance fields
.field private final a:Ljava/util/Date;

.field private final b:I

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/util/Date;ILjava/util/Set;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/b/a;->a:Ljava/util/Date;

    .line 3
    iput p2, p0, Lcom/beizi/ad/b/a;->b:I

    .line 4
    iput-object p3, p0, Lcom/beizi/ad/b/a;->c:Ljava/util/Set;

    .line 5
    iput-boolean p4, p0, Lcom/beizi/ad/b/a;->d:Z

    return-void
.end method
