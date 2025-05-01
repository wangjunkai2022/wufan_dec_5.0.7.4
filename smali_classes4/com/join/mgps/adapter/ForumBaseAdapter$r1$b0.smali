.class public Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter$r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b0"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Z

.field public e:Z

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;"
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

.method public constructor <init>(ILjava/lang/String;ZZZLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ForumBean$ForumPostsBean$TagInfo;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->a:I

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->b:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->c:Z

    .line 6
    iput-boolean p4, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->d:Z

    .line 7
    iput-boolean p5, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->e:Z

    .line 8
    iput-object p6, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->f:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;->f:Ljava/util/List;

    return-object p0
.end method
