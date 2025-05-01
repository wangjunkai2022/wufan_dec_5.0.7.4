.class public Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter$z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field a:I

.field b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;->a:I

    .line 3
    iput p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;->b:I

    return-void
.end method
