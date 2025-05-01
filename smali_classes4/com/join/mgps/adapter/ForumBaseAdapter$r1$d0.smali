.class public Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter$r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d0"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Z

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->c:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->d:Z

    .line 6
    iput p5, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->e:I

    .line 7
    iput p6, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->f:I

    .line 8
    iput-boolean p7, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;->g:Z

    return-void
.end method
