.class Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;
.super Ljava/util/AbstractList;
.source "OneJpegPerIframe.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;->x()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Lcom/googlecode/mp4parser/authoring/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;


# direct methods
.method constructor <init>(Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;->b:Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;)Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;->b:Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;

    return-object p0
.end method


# virtual methods
.method public b(I)Lcom/googlecode/mp4parser/authoring/f;
    .locals 1

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a$a;

    invoke-direct {v0, p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a$a;-><init>(Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;I)V

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;->b(I)Lcom/googlecode/mp4parser/authoring/f;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a$a;->b:Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;

    iget-object v0, v0, Lcom/googlecode/mp4parser/authoring/tracks/mjpeg/a;->e:[Ljava/io/File;

    array-length v0, v0

    return v0
.end method
