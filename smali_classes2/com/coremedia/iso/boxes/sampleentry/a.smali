.class public abstract Lcom/coremedia/iso/boxes/sampleentry/a;
.super Lcom/googlecode/mp4parser/b;
.source "AbstractSampleEntry.java"

# interfaces
.implements Lcom/coremedia/iso/boxes/sampleentry/f;


# instance fields
.field protected o:I


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/b;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/a;->o:I

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/nio/channels/WritableByteChannel;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/coremedia/iso/boxes/sampleentry/a;->o:I

    return-void
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/coremedia/iso/boxes/sampleentry/a;->o:I

    return v0
.end method

.method public abstract k(Lcom/googlecode/mp4parser/e;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/c;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
