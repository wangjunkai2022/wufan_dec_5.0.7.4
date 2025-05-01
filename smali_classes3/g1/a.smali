.class public Lg1/a;
.super Ljava/lang/Object;
.source "BTree.java"


# instance fields
.field private a:Lg1/a;

.field private b:Lg1/a;

.field private c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput-object p2, p0, Lg1/a;->c:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_2

    .line 4
    iget-object v0, p0, Lg1/a;->a:Lg1/a;

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Lg1/a;

    invoke-direct {v0}, Lg1/a;-><init>()V

    iput-object v0, p0, Lg1/a;->a:Lg1/a;

    .line 6
    :cond_1
    iget-object v0, p0, Lg1/a;->a:Lg1/a;

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lg1/a;->b:Lg1/a;

    if-nez v0, :cond_3

    .line 8
    new-instance v0, Lg1/a;

    invoke-direct {v0}, Lg1/a;-><init>()V

    iput-object v0, p0, Lg1/a;->b:Lg1/a;

    .line 9
    :cond_3
    iget-object v0, p0, Lg1/a;->b:Lg1/a;

    :goto_0
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lg1/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(I)Lg1/a;
    .locals 0

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lg1/a;->a:Lg1/a;

    return-object p1

    .line 2
    :cond_0
    iget-object p1, p0, Lg1/a;->b:Lg1/a;

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lg1/a;->c:Ljava/lang/Object;

    return-object v0
.end method
