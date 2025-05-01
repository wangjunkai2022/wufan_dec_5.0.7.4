.class public Lcom/bykv/vv/vv/vv/vv/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bykv/vv/vv/vv/vv/b$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/bykv/vv/vv/vv/vv/b;->a:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/bykv/vv/vv/vv/vv/b;->b:I

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/bykv/vv/vv/vv/vv/b;->c:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/bykv/vv/vv/vv/vv/b;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method

.method public static final b()Lcom/bykv/vv/vv/vv/vv/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/bykv/vv/vv/vv/vv/b;

    invoke-direct {v0}, Lcom/bykv/vv/vv/vv/vv/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/bykv/vk/openvk/api/proto/Result;
    .locals 7

    .line 1
    new-instance v6, Lcom/bykv/vv/vv/vv/vv/b$b;

    iget-boolean v1, p0, Lcom/bykv/vv/vv/vv/vv/b;->a:Z

    iget v2, p0, Lcom/bykv/vv/vv/vv/vv/b;->b:I

    iget-object v3, p0, Lcom/bykv/vv/vv/vv/vv/b;->c:Ljava/lang/String;

    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/b;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    :cond_0
    move-object v4, v0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/bykv/vv/vv/vv/vv/b$b;-><init>(ZILjava/lang/String;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vv/vv/vv/vv/b$a;)V

    return-object v6
.end method

.method public c(I)Lcom/bykv/vv/vv/vv/vv/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/bykv/vv/vv/vv/vv/b;->b:I

    return-object p0
.end method

.method public d(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bykv/vv/vv/vv/vv/b;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/bykv/vv/vv/vv/vv/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bykv/vv/vv/vv/vv/b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public f(Z)Lcom/bykv/vv/vv/vv/vv/b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bykv/vv/vv/vv/vv/b;->a:Z

    return-object p0
.end method
