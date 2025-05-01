.class public Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter$r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "v"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;IIIZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->a:I

    .line 4
    iput p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->f:I

    .line 5
    iput-object p3, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->b:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->c:I

    .line 7
    iput p5, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->d:I

    .line 8
    iput p6, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->e:I

    .line 9
    iput-boolean p7, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->g:Z

    .line 10
    iput-boolean p8, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;->h:Z

    return-void
.end method
