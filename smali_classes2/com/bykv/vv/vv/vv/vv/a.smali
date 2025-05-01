.class public Lcom/bykv/vv/vv/vv/vv/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bykv/vv/vv/vv/vv/a$c;,
        Lcom/bykv/vv/vv/vv/vv/a$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

.field public static final d:Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {v0}, Lcom/bykv/vv/vv/vv/vv/a;->c(I)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    sput-object v0, Lcom/bykv/vv/vv/vv/vv/a;->c:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    .line 2
    new-instance v0, Lcom/bykv/vv/vv/vv/vv/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bykv/vv/vv/vv/vv/a$c;-><init>(Lcom/bykv/vv/vv/vv/vv/a$a;)V

    sput-object v0, Lcom/bykv/vv/vv/vv/vv/a;->d:Lcom/bykv/vk/openvk/api/proto/Bridge;

    return-void
.end method

.method private constructor <init>(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    return-void
.end method

.method private constructor <init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    .line 3
    iput-object p2, p0, Lcom/bykv/vv/vv/vv/vv/a;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method

.method public static final b()Lcom/bykv/vv/vv/vv/vv/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/bykv/vv/vv/vv/vv/a;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    invoke-direct {v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;-><init>(Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static final c(I)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/bykv/vv/vv/vv/vv/a;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1, p0}, Landroid/util/SparseArray;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/bykv/vv/vv/vv/vv/a;-><init>(Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public static final k(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/bykv/vv/vv/vv/vv/a;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    invoke-direct {v0, v1, p0}, Lcom/bykv/vv/vv/vv/vv/a;-><init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    new-instance v0, Lcom/bykv/vv/vv/vv/vv/a$b;

    iget-object v1, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    iget-object v2, p0, Lcom/bykv/vv/vv/vv/vv/a;->b:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a$b;-><init>(Landroid/util/SparseArray;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vv/vv/vv/vv/a$a;)V

    return-object v0
.end method

.method public d(ID)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public e(IF)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public f(II)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public g(IJ)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method

.method public j(IZ)Lcom/bykv/vv/vv/vv/vv/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/a;->a:Landroid/util/SparseArray;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object p0
.end method
