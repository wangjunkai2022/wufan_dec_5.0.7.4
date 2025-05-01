.class public Lcom/join/mgps/adapter/ForumCommentAdapter$z;
.super Ljava/lang/Object;
.source "ForumCommentAdapter.java"

# interfaces
.implements Lu1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "z"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$f;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$e;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$d;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$b;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$c;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$a;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$h;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$g;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$m;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$r;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$l;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$p;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$n;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$o;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$q;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$j;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$k;,
        Lcom/join/mgps/adapter/ForumCommentAdapter$z$i;
    }
.end annotation


# instance fields
.field b:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

.field c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->c:Ljava/lang/Object;

    return-void
.end method

.method public d(Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    return-void
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$z;->b:Lcom/join/mgps/adapter/ForumCommentAdapter$ViewType;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method
