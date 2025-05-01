.class public Lcom/vincent/videocompressor/e;
.super Ljava/lang/Object;
.source "Sample.java"


# instance fields
.field private a:J

.field private b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/vincent/videocompressor/e;->a:J

    .line 3
    iput-wide v0, p0, Lcom/vincent/videocompressor/e;->b:J

    .line 4
    iput-wide p1, p0, Lcom/vincent/videocompressor/e;->a:J

    .line 5
    iput-wide p3, p0, Lcom/vincent/videocompressor/e;->b:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/e;->a:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/vincent/videocompressor/e;->b:J

    return-wide v0
.end method
