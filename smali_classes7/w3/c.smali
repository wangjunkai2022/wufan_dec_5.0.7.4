.class public Lw3/c;
.super Ljava/lang/Object;
.source "CentralDirectory.java"


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:Lw3/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw3/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/c;->b:Lw3/e;

    return-object v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/c;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c(Lw3/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/c;->b:Lw3/e;

    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw3/c;->a:Ljava/util/ArrayList;

    return-void
.end method
