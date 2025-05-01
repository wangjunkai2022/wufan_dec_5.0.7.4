.class public Lcom/kunminx/architecture/domain/message/MutableResult$a;
.super Ljava/lang/Object;
.source "MutableResult.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kunminx/architecture/domain/message/MutableResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/kunminx/architecture/domain/message/MutableResult;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kunminx/architecture/domain/message/MutableResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kunminx/architecture/domain/message/MutableResult;

    invoke-direct {v0}, Lcom/kunminx/architecture/domain/message/MutableResult;-><init>()V

    .line 2
    iget-boolean v1, p0, Lcom/kunminx/architecture/domain/message/MutableResult$a;->a:Z

    invoke-static {v0, v1}, Lcom/kunminx/architecture/domain/message/MutableResult;->f(Lcom/kunminx/architecture/domain/message/MutableResult;Z)Z

    return-object v0
.end method

.method public b(Z)Lcom/kunminx/architecture/domain/message/MutableResult$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/kunminx/architecture/domain/message/MutableResult$a<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/kunminx/architecture/domain/message/MutableResult$a;->a:Z

    return-object p0
.end method
