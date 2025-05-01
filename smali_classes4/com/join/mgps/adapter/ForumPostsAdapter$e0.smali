.class public Lcom/join/mgps/adapter/ForumPostsAdapter$e0;
.super Ljava/lang/Object;
.source "ForumPostsAdapter.java"

# interfaces
.implements Lu1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumPostsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e0"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$e;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$d;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$b;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$c;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$a;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$g;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$f;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$l;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$p;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$k;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$n;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$m;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$o;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$i;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$j;,
        Lcom/join/mgps/adapter/ForumPostsAdapter$e0$h;
    }
.end annotation


# instance fields
.field b:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

.field c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->c:Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->c:Ljava/lang/Object;

    return-void
.end method

.method public d(Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    return-void
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumPostsAdapter$e0;->b:Lcom/join/mgps/adapter/ForumPostsAdapter$ViewType;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method
