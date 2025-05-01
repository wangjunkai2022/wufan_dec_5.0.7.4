.class public Lcom/huaksj/vasdolly/common/apk/b;
.super Ljava/lang/Object;
.source "SignatureInfo.java"


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Ljava/nio/ByteBuffer;


# direct methods
.method constructor <init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/huaksj/vasdolly/common/apk/b;->a:Ljava/nio/ByteBuffer;

    .line 3
    iput-wide p2, p0, Lcom/huaksj/vasdolly/common/apk/b;->b:J

    .line 4
    iput-wide p4, p0, Lcom/huaksj/vasdolly/common/apk/b;->c:J

    .line 5
    iput-wide p6, p0, Lcom/huaksj/vasdolly/common/apk/b;->d:J

    .line 6
    iput-object p8, p0, Lcom/huaksj/vasdolly/common/apk/b;->e:Ljava/nio/ByteBuffer;

    return-void
.end method
