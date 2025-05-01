.class public Lcom/join/mgps/adapter/MyGameAdapterV1$g;
.super Ljava/lang/Object;
.source "MyGameAdapterV1.java"

# interfaces
.implements Lu1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/MyGameAdapterV1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field b:I

.field c:Ljava/lang/Object;

.field d:Z

.field e:I

.field f:Z


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->d:Z

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->e:I

    .line 4
    iput p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->b:I

    .line 5
    iput-object p2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;Z)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->d:Z

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->e:I

    .line 9
    iput p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->b:I

    .line 10
    iput-object p2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->c:Ljava/lang/Object;

    .line 11
    iput-boolean p3, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->f:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O:",
            "Ljava/lang/Object;",
            ">()TO;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->b:I

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->f:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->d:Z

    return v0
.end method

.method public f(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->f:Z

    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->d:Z

    return-void
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->b:I

    return v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->c:Ljava/lang/Object;

    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->e:I

    return-void
.end method

.method public j(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->b:I

    return-void
.end method
