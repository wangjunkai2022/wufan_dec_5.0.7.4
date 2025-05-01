.class public Lcom/xuanyu/stickyheader/h;
.super Ljava/lang/Object;
.source "StickyHeaderNode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/xuanyu/stickyheader/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuanyu/stickyheader/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field private b:Lcom/xuanyu/stickyheader/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuanyu/stickyheader/a<",
            "TT;>;"
        }
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
.method public a()Lcom/xuanyu/stickyheader/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/xuanyu/stickyheader/h<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/h;->a:Lcom/xuanyu/stickyheader/h;

    return-object v0
.end method

.method public b()Lcom/xuanyu/stickyheader/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/xuanyu/stickyheader/a<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuanyu/stickyheader/h;->b:Lcom/xuanyu/stickyheader/a;

    return-object v0
.end method

.method public c(Lcom/xuanyu/stickyheader/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuanyu/stickyheader/h<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/h;->a:Lcom/xuanyu/stickyheader/h;

    return-void
.end method

.method public d(Lcom/xuanyu/stickyheader/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuanyu/stickyheader/a<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuanyu/stickyheader/h;->b:Lcom/xuanyu/stickyheader/a;

    return-void
.end method
