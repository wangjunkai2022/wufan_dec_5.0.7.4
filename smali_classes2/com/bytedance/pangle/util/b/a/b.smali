.class public final Lcom/bytedance/pangle/util/b/a/b;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/bytedance/pangle/util/b/b/d;Ljava/io/ByteArrayOutputStream;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto/16 :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    .line 5
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/pangle/util/b/b/c;

    .line 7
    iget-object v2, p0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    if-eqz v1, :cond_4

    const/4 v3, 0x2

    new-array v3, v3, [B

    .line 8
    fill-array-data v3, :array_0

    const v4, 0x2014b50

    .line 9
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    const/4 v4, 0x0

    .line 10
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 11
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 12
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 13
    iget v5, v1, Lcom/bytedance/pangle/util/b/b/c;->a:I

    .line 14
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    const/16 v5, 0x821

    .line 15
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    const/16 v5, 0x221

    .line 16
    invoke-virtual {v2, p1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 17
    iget-wide v5, v1, Lcom/bytedance/pangle/util/b/b/c;->b:J

    long-to-int v6, v5

    .line 18
    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 19
    iget-wide v5, v1, Lcom/bytedance/pangle/util/b/b/c;->c:J

    long-to-int v6, v5

    .line 20
    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 21
    iget-wide v5, v1, Lcom/bytedance/pangle/util/b/b/c;->d:J

    long-to-int v6, v5

    .line 22
    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    new-array v5, v4, [B

    .line 23
    iget-object v6, v1, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 24
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_2

    .line 25
    iget-object v5, v1, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    const-string v6, "UTF-8"

    .line 26
    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    .line 27
    :cond_2
    array-length v6, v5

    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 28
    iget v6, v1, Lcom/bytedance/pangle/util/b/b/c;->f:I

    .line 29
    invoke-virtual {v2, p1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 30
    invoke-virtual {v2, p1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 31
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 32
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 33
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 34
    invoke-virtual {p1, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 35
    iget-wide v3, v1, Lcom/bytedance/pangle/util/b/b/c;->i:J

    long-to-int v1, v3

    .line 36
    invoke-virtual {v2, p1, v1}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 37
    array-length v1, v5

    if-lez v1, :cond_3

    .line 38
    invoke-virtual {p1, v5}, Ljava/io/ByteArrayOutputStream;->write([B)V

    :cond_3
    if-lez v6, :cond_1

    .line 39
    new-array v1, v6, [B

    .line 40
    invoke-virtual {p1, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    goto/16 :goto_0

    .line 41
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "input parameters is null, cannot write local file header"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method
