.class final Lcom/bykv/vv/vv/vv/vv/b$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bykv/vv/vv/vv/vv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Lcom/bykv/vk/openvk/api/proto/ValueSet;


# direct methods
.method private constructor <init>(ZILjava/lang/String;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->a:Z

    .line 4
    iput p2, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->b:I

    .line 5
    iput-object p3, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-void
.end method

.method synthetic constructor <init>(ZILjava/lang/String;Lcom/bykv/vk/openvk/api/proto/ValueSet;Lcom/bykv/vv/vv/vv/vv/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bykv/vv/vv/vv/vv/b$b;-><init>(ZILjava/lang/String;Lcom/bykv/vk/openvk/api/proto/ValueSet;)V

    return-void
.end method


# virtual methods
.method public code()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->b:I

    return v0
.end method

.method public isSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->a:Z

    return v0
.end method

.method public message()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bykv/vv/vv/vv/vv/b$b;->d:Lcom/bykv/vk/openvk/api/proto/ValueSet;

    return-object v0
.end method
