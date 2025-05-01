.class public Lcom/googlecode/mp4parser/h264/model/c;
.super Ljava/lang/Object;
.source "ChromaFormat.java"


# static fields
.field public static d:Lcom/googlecode/mp4parser/h264/model/c;

.field public static e:Lcom/googlecode/mp4parser/h264/model/c;

.field public static f:Lcom/googlecode/mp4parser/h264/model/c;

.field public static g:Lcom/googlecode/mp4parser/h264/model/c;


# instance fields
.field private a:I

.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/googlecode/mp4parser/h264/model/c;-><init>(III)V

    sput-object v0, Lcom/googlecode/mp4parser/h264/model/c;->d:Lcom/googlecode/mp4parser/h264/model/c;

    .line 2
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/c;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/googlecode/mp4parser/h264/model/c;-><init>(III)V

    sput-object v0, Lcom/googlecode/mp4parser/h264/model/c;->e:Lcom/googlecode/mp4parser/h264/model/c;

    .line 3
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/c;

    invoke-direct {v0, v2, v2, v1}, Lcom/googlecode/mp4parser/h264/model/c;-><init>(III)V

    sput-object v0, Lcom/googlecode/mp4parser/h264/model/c;->f:Lcom/googlecode/mp4parser/h264/model/c;

    .line 4
    new-instance v0, Lcom/googlecode/mp4parser/h264/model/c;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1, v1}, Lcom/googlecode/mp4parser/h264/model/c;-><init>(III)V

    sput-object v0, Lcom/googlecode/mp4parser/h264/model/c;->g:Lcom/googlecode/mp4parser/h264/model/c;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    .line 3
    iput p2, p0, Lcom/googlecode/mp4parser/h264/model/c;->b:I

    .line 4
    iput p3, p0, Lcom/googlecode/mp4parser/h264/model/c;->c:I

    return-void
.end method

.method public static a(I)Lcom/googlecode/mp4parser/h264/model/c;
    .locals 2

    .line 1
    sget-object v0, Lcom/googlecode/mp4parser/h264/model/c;->d:Lcom/googlecode/mp4parser/h264/model/c;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    if-ne p0, v1, :cond_0

    return-object v0

    .line 2
    :cond_0
    sget-object v0, Lcom/googlecode/mp4parser/h264/model/c;->e:Lcom/googlecode/mp4parser/h264/model/c;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    if-ne p0, v1, :cond_1

    return-object v0

    .line 3
    :cond_1
    sget-object v0, Lcom/googlecode/mp4parser/h264/model/c;->f:Lcom/googlecode/mp4parser/h264/model/c;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    if-ne p0, v1, :cond_2

    return-object v0

    .line 4
    :cond_2
    sget-object v0, Lcom/googlecode/mp4parser/h264/model/c;->g:Lcom/googlecode/mp4parser/h264/model/c;

    iget v1, v0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    if-ne p0, v1, :cond_3

    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/c;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/googlecode/mp4parser/h264/model/c;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChromaFormat{\nid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " subWidth="

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/googlecode/mp4parser/h264/model/c;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " subHeight="

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/googlecode/mp4parser/h264/model/c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
