.class public Lcom/join/mgps/adapter/ForumBaseAdapter$r1;
.super Ljava/lang/Object;
.source "ForumBaseAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumBaseAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "r1"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$u;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$r;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$t;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$s;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$e0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$i;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$h;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$a;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$e;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$g;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$f;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$j;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$l;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$k;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$m;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$v;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$q;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$c0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$n;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$y;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$o;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$z;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$p;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$b0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$c;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$g0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$d;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$f0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$w;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$a0;,
        Lcom/join/mgps/adapter/ForumBaseAdapter$r1$x;
    }
.end annotation


# instance fields
.field a:Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;

.field b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1;->a:Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1;->b:Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1;->a:Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;

    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1;->b:Ljava/lang/Object;

    return-void
.end method

.method public d(Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumBaseAdapter$r1;->a:Lcom/join/mgps/adapter/ForumBaseAdapter$ViewType;

    return-void
.end method
