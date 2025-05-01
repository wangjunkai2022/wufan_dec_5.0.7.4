.class public Lcom/googlecode/mp4parser/contentprotection/a;
.super Lcom/googlecode/mp4parser/boxes/piff/c;
.source "GenericHeader.java"


# static fields
.field public static c:Ljava/util/UUID;


# instance fields
.field b:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "00000000-0000-0000-0000-000000000000"

    .line 1
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/contentprotection/a;->c:Ljava/util/UUID;

    .line 2
    sget-object v1, Lcom/googlecode/mp4parser/boxes/piff/c;->a:Ljava/util/Map;

    const-class v2, Lcom/googlecode/mp4parser/contentprotection/a;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/googlecode/mp4parser/boxes/piff/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/contentprotection/a;->b:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public c()Ljava/util/UUID;
    .locals 1

    .line 1
    sget-object v0, Lcom/googlecode/mp4parser/contentprotection/a;->c:Ljava/util/UUID;

    return-object v0
.end method

.method public d(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/contentprotection/a;->b:Ljava/nio/ByteBuffer;

    return-void
.end method
