.class public Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter$r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "x"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:Z

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;JZIIZZZIILjava/lang/String;Ljava/lang/String;I)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    .line 3
    iput-boolean v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->a:Z

    move-object v1, p2

    .line 4
    iput-object v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->b:Ljava/lang/String;

    move-object v1, p3

    .line 5
    iput-object v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->c:Ljava/lang/String;

    move-wide v1, p4

    .line 6
    iput-wide v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->d:J

    move v1, p6

    .line 7
    iput-boolean v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->e:Z

    move v1, p7

    .line 8
    iput v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->f:I

    move v1, p8

    .line 9
    iput v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->g:I

    move/from16 v1, p16

    .line 10
    iput v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->m:I

    move v1, p9

    .line 11
    iput-boolean v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->h:Z

    move v1, p10

    .line 12
    iput-boolean v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->i:Z

    move v1, p11

    .line 13
    iput-boolean v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->j:Z

    move v1, p12

    .line 14
    iput v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->k:I

    move/from16 v1, p13

    .line 15
    iput v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->l:I

    move-object/from16 v1, p14

    .line 16
    iput-object v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->o:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 17
    iput-object v1, v0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;->n:Ljava/lang/String;

    return-void
.end method
